package student;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.listener.JobExecutionListenerSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

@Component
public class JobCompletionNotificationListener extends JobExecutionListenerSupport {

    private static final Logger log = LoggerFactory.getLogger(JobCompletionNotificationListener.class);

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public JobCompletionNotificationListener(JdbcTemplate jdbcTemplate) {
	this.jdbcTemplate = jdbcTemplate;
    }

    @Override
	public void afterJob(JobExecution jobExecution) {
		if(jobExecution.getStatus() == BatchStatus.COMPLETED) {
			log.info("!!! JOB FINISHED! Time to verify the results");
		   String sqlQuery = "select * from " + Application.TABLE_NAME;
			  SqlRowSet srs = jdbcTemplate.queryForRowSet(sqlQuery);
			  
			  int count = 0;
			  
			  while(srs.next()) {
			      count++;
			  }
			  log.info("Number of inserted rows: " + count);			  
				
			  // TO MANY FIELDS TO DO IT THAT WAY.. 
			  /*jdbcTemplate.query("SELECT first_name, last_name FROM people",
				(rs, row) -> new Person(first_name, last_name)
				rs.getString(1),
				rs.getString(2)				
			).forEach(person -> log.info("Found <" + person + "> in the database."));*/
		}
	}
}
