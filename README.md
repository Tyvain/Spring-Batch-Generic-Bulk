# Description
Take a csv file (with many columns), create a table if needed, import all line in the table. Evey field should only be declared in the pojo.

# Creating du pojo (first time):
### get column name from csv & replace 'tab' with '\n'
### create column name in notepadd++, then apply regex
search: (é)|(\/)|(è)|(ô)|(à)|(d')|(\))|(^\w)|[^\w\n]+(\w)
replaceby: (?1e)(?2)(?3e)(?4o)(?5a)(?6)(?6)(?8\L$8)(?9\U$9)
### some manual cleanup


# Launching
Run Application