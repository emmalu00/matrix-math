/**
* Project7.java
* Emma Lucas
* This class reads in two matrices from a text file. The program then tells the user if 
* the two matrices are equal, and gives them the option to add, subtract, multiply, or
* transpose both matrices. The program continues to loop until the user wishes to quit.
* */

import java.util.*;
import java.io.*;

public class Project7 {
    public static void main (String[] args) throws IOException
    {
        String fileName = "";
        if (args.length == 1)
        {
            fileName = args[0];
        }
        else
        {
            System.out.println("Proper command line arguements not supplied.");
            System.out.println("Please provide arguments in the format: java Project7 filename.txt");
            System.exit(0);
        }
        Scanner s = new Scanner(System.in);
        Scanner f = new Scanner(new File(fileName));

        Matrix[] matrices = new Matrix[2];
        int rows = 0;
        int columns = 0;
        for (int i = 0; i < 2; ++i)
        {
            rows = f.nextInt();
            columns = f.nextInt();
            matrices[i] = new Matrix(rows, columns);
            int value;
            for (int r = 0; r < rows; ++r)
            {
                for (int c = 0; c < columns; ++c)
                {
                    value = f.nextInt();
                    matrices[i].setElem(r, c, value);
                }
            }
        }
        System.out.println();
        char choice = ' ';
        if (matrices[0].equals(matrices[1]))
        {
            System.out.println("The matrices are EQUAL.");
        }
        else 
        {
            System.out.println("The matrices are NOT equal.");
        }
        System.out.println();
        while (choice != 'q')
        {
            System.out.print("Enter (p)rint, (a)dd, (s)ubtract, (m)ultiply, (t)ranspose, or (q)uit: ");
            choice = s.nextLine().toLowerCase().charAt(0);
            System.out.println();
            if (choice == 'p')
            {
                System.out.println("First Matrix: \n" + matrices[0].toString());
                System.out.println("Second Matrix: \n" + matrices[1].toString());
            }
            else if (choice == 'a')
            {
                Matrix result = matrices[0].plus(matrices[1]);
                if (result == null)
                {
                    System.out.println("These matricies cannot be added.\n");
                }
                else
                {
                    System.out.println("Resulting matrix: \n" + result.toString());
                }
            }
            else if (choice == 's')
            {
                Matrix result = matrices[0].minus(matrices[1]);
                if (result == null)
                {
                    System.out.println("These matricies cannot be subtracted.\n");
                }
                else
                {
                    System.out.println("Resulting matrix: \n" + result.toString());
                }
            }
            else if (choice == 'm')
            {
                Matrix result = matrices[0].times(matrices[1]);
                if (result == null)
                {
                    System.out.println("These matricies cannot be multiplied.\n");
                }
                else
                {
                    System.out.println("Resulting matrix: \n" + result.toString());
                }
            }
            else if (choice == 't')
            {
                Matrix transpose1 = matrices[0].transpose();
                Matrix transpose2 = matrices[1].transpose();
                System.out.println("First Matrix: \n" + transpose1.toString());
                System.out.println("Second Matrix: \n" + transpose2.toString());
            }
            else if (choice == 'q')
            {
                System.out.println("\nExiting program...");
            }
            else
            {
                System.out.println(choice + " is not a valid option.\n");
            }
        }
    }
}