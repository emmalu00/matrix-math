## About
This program reads an input file containing two matrices and then repeatedly asks the user if they want to print, add, subtract, multiply, transpose, or quit. 

### Running the Program
The name of an input file is given as a command-line argument. The program must run through the command line with the format:

> `javac ApplicationIO.java`

followed by:

> `java ApplicationIO <filename.txt>`


## Format of Input Text Files
Input files must be formatted the following way: 

> **_rows1 cols1_**

> **_first line of matrix1, with elements separated by spaces_**

> **_second line of matrix1, with elements separated by spaces_**

> **_..._**

> **_last line of matrix1, with elements separated by spaces_**

> `                                                             `

> **_rows2 cols2_**

> **_first line of matrix2, with elements separated by spaces_**

> **_second line of matrix2, with elements separated by spaces_**

> **_..._**

> **_last line of matrix2, with elements separated by spaces_**

### Example of Input Text File
![image](https://github.com/emmalu00/matrix-math/assets/106994328/81bd05ae-e395-427b-924c-b8497474c3ee)

Files _matrix1.txt_, _matrix2.txt_, _matrix3.txt_, and _matrix4.txt_ can be used to test the program.

## Coding Specifications & Software Architecture
### The ApplicationIO Class
`ApplictionIO` handles all user input and output. Once the program has been run through the command line, `ApplicationIO` reads in the matrices from the text file, and gives the user the following prompt: 

> `Enter (p)rint, (a)dd, (s)ubtract, (m)ultiply, (t)ranspose, or (q)uit:`

If the user enters an invalid option, an error message is displayed and the user is given the same prompt again. Additionally, and error message will be displayed if two matrices cannot be added, subtracted, or multiplied. The program will repeatedly deliver the same prompt until the user wishes to quit.

### The Matrix Class
This is a simple object that represents a single matrix. The `Matrix` class includes all the logic for matrix operations (add, subtract, multiply, transpose, etc.) as well. 
