# Description
- Read csv file with large number of columns
- Insert into a table 
- Read the table

The goal is to have the fields declared only once, in the pojo (Student.java). No sql file (the table should be create by the application if not exists)

# Version
V1: generic write with introspection, sql file, no read, no jpa
V2(TODO): remove introspection, use jpa (or something else) to create data in the table

# Launching
Run Application

# Legacy: How the pojo was created the first time
- get column name from csv & replace 'tab' with '\n'
- create column name in notepadd++, then apply regex
search: (é)|(\/)|(è)|(ô)|(à)|(d')|(\))|(^\w)|[^\w\n]+(\w)
replaceby: (?1e)(?2)(?3e)(?4o)(?5a)(?6)(?6)(?8\L$8)(?9\U$9)
- some manual cleanup


