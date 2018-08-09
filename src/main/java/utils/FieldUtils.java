package utils;

import java.lang.reflect.Field;
import java.util.Arrays;

import org.apache.commons.lang3.StringUtils;

public class FieldUtils {

    /**
     * 
     * @return list class attributes
     */
    public static String[] getFieldsFromClass(Class<?> claz) {
	return Arrays.stream(claz.getFields()).map(f -> f.getName()).toArray(String[]::new);
    }

    /**
     * 
     * @param fields
     * @return sql request for each field: Example, table people, fields first_name, last_name ->   "INSERT INTO people (first_name, last_name) VALUES (:firstName, :lastName)"
     */
    public static String generateSqlRequestFromFields(String table, String[] fields) {
	String ret = "INSERT INTO " + table + " (";
	ret += StringUtils.join(fields, ","); // first_name, last_name
	ret += ") VALUES (";	
	ret += StringUtils.join(Arrays.stream(fields).map(f -> ":"+f).toArray(), ","); // prefix each field with ':'  -> :firstName, :lastName	
	ret += ")";	
	return ret;
    }

    /**
     * 
     * @return display all attribute and values from object
     */
    public static void displayObject(Object obj) {
	StringBuilder result = new StringBuilder();
	String newLine = System.getProperty("line.separator");

	result.append(obj.getClass().getName());
	result.append(" Object {");
	result.append(newLine);

	// determine fields declared in this class only (no fields of superclass)
	Field[] fields = obj.getClass().getDeclaredFields();

	// print field names paired with their values
	for (Field field : fields) {
	    result.append("  ");
	    try {
		result.append(field.getName());
		result.append(": ");
		// requires access to private field:
		result.append(field.get(obj));
	    } catch (IllegalAccessException ex) {
		System.out.println(ex);
	    }
	    result.append(newLine);
	}
	result.append("}");
	System.out.println(result);
    }
}
