# ceaser_cypher
Java implementation of Ceaser Cypher

The code works as a regular ceaser cypher. First the user will run the program as 'java Password <string_name> <cypher_number>'. Then the program converts each letter string_name[i] to a number corresponding to its position on the alphabet, i.e, 1<=number<=26. Then, for each number it is calculated the modular sum (number+<cypher_number>)mod26. After that, it is printed in the terminal the final string. 

Obs: all letters in <string_name> should be lowercase
