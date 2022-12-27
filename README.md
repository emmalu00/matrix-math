# Object Oriented Matrix Program
This program is an object-oriented program used to read an input file containing two matrices and then repeatedly asks the user if they want to print, add, subtract, multiply, transpose, or quit. The name of an input file is given as a command-line argument. The program must run through the command line with the format: 
> `java Project7 fileName.txt`

Several input files were used to thoroughly test the program. The text files read into this program follow the following format:

> `rows1 cols1`

> `first line of matrix1, with elements separated by spaces`

> `second line of matrix1, with elements separated by spaces`

> `...`

> `last line of matrix1, with elements separated by spaces`

> `                                                       `


> `rows2 cols2`

> `first line of matrix2, with elements separated by spaces`

> `second line of matrix2, with elements separated by spaces`

> `...`

> `last line of matrix2, with elements separated by spaces`

This program has two classes: **Matrix** and **Project7**

***

## Project7 Class

The Project7 class is the application class and contains only a main method. Additionally, this class handles all user input and output. Once this program has gotten the name of the input file through a command line argument, this class creates a one-dimensional array of two Matrix objects, and uses the information from the text files to set their elements. A message indicating whether or not the two matrices are equal is displayed. The user is then giving the following options regarding the matrices, with the following menu: 

> `Enter (p)rint, (a)dd, (s)ubtract, (m)ultiply, (t)ranspose, or (q)uit:`

The user is prompted to enter a selection, and the results of the selection are displayed. If the user enters an invalid selection, and error message is shown and the user is prompted to enter a different selection. Additionally, an error message will be shown if two particular matrices cannot be added, subtracted, or multiplied. The program will repeatedly ask the user to enter a selection until the user chooses to quit. The program allows the user to enter an uppercase or lowercase menu choice. 

***

# Matrix Class

The _Matrix class_ is a general class that represents a matrix. It contains private fields for the number of rows, number of columns, and a two-dimensional array of the matrix values. It also contains a constructor that takes the number of rows and columns as parameters, initializes the fields, and allocates space for the two-dimensional array. The methods of the matrix class are discussed below. 

### `public void setElem (int row, int col, int value)`
The **_setElem_** method updates the two-dimensional array to put the passed value at the specified row/column.

### `public Matrix plus (Matrix m)`
The **_plus_** method returns a new Matrix object that is `this.matrix` plus `m.matrix`. The method will return null if the matrices cannot be added. Matrices can only be added if they have the same number of rows and columns. 

### `public Matrix minus (Matrix m)`
The **_minus_** method returns a new Matrix object that is `this.matrix` minus `m.matrix`. The method will return null if the matrices cannot be subtracted. Matrices can only be subtracted if they have the same number of rows and columns. 

### `public Matrix times (Matrix m)`
The **_times_** method returns a new Matrix object that is `this.matrix` times `m.matrix`. The method will return null if the matrices cannot be multiplied. Matrices can only be multiplied if the number of columns of the first matrix is equal to the number of rows of the second matrix.

### `public Matrix tranpose ()`
The **_transpose_** method returns a new Matrix object that is the transposition of `this.matrix` times `m.matrix`. To transpose a matrix, the rows become the columns and the columns become the rows. The original matrix is not affected.

### `public String toString ()`
The **_toString_** method returns a string representation of the matrix so that it will print in the proper format.

### `public boolean equals (Matrix m)`
The **_equals_** method returns a boolean indicating whether two matrices are equal. Two matrices are equal if they have the same dimensions and equal values at equivalent positions. 
