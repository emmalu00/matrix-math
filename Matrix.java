/**
* Matrix.java
* Emma Lucas
* This class is a matrix object.
* */
public class Matrix
{
    private int rows;
    private int columns;
    private int[][] matrix;


    /**
    * Constructor that initializes the row and column fields 
    * of the array and allocates space for the 2D array.
    * @param r - number of rows
    * @param c - number of columns
    */    
    public Matrix(int r, int c)
    {
        rows = r;
        columns = c;
        matrix = new int[rows][columns];
    }

    /**
    * Sets the matrix position to the passed in value
    * @param row - row index
    * @param column - column index
    * @param value - value to be set to specified position
    */    
    public void setElem(int row, int column, int value)
    {
        matrix[row][column] = value;
    }

    /**
    * Adds two matrices.
    * @param m - Matrix object be added
    * @returns result of both matrices added
    */    
    public Matrix plus(Matrix m)
    {
        Matrix result = new Matrix(rows, columns);
        if (this.rows == m.rows && this.columns == m.columns)
        {
            for (int i = 0; i < m.rows; ++i)
            {
                for (int j = 0; j < m.columns; ++j)
                {
                    result.matrix[i][j] = this.matrix[i][j] + m.matrix[i][j];
                }
            }
            return result;
        }
        return null;
    }

    /**
    * Subtracts two matrices
    * @param m - Matrix object be subtracted
    * @returns result of both matrices subtracted
    */    
    public Matrix minus(Matrix m)
    {
        Matrix result = new Matrix(rows, columns);
        if (this.rows == m.rows && this.columns == m.columns)
        {
            for (int i = 0; i < m.rows; ++i)
            {
                for (int j = 0; j < m.columns; ++j)
                {
                    result.matrix[i][j] = this.matrix[i][j] - m.matrix[i][j];
                }
            }
            return result;
        }
        return null;
    }

    /**
    * Multiplies two matrices
    * @param m - Matrix object be multiplied
    * @returns result of both matrices multiplied
    */    
    public Matrix times(Matrix m)
    {
        Matrix result = new Matrix(this.rows, m.columns);
        if (this.columns == m.rows)
        {
            for (int i = 0; i < this.rows; ++i)
            {
                for (int j = 0; j < m.columns; ++j)
                {
                    for (int k = 0; k < m.columns; ++k)
                    result.matrix[i][j] += this.matrix[i][k] * m.matrix[k][j];
                }
            }
            return result;
        }
        return null;
    }

    /**
    * Transposes a matrix
    * @returns result of transposed matrix
    */   
    public Matrix transpose()
    {
        Matrix result = new Matrix(columns, rows);
        for (int i = 0; i < rows; ++i)
        {
            for (int j = 0; j < columns; ++j)
            {
                result.matrix[j][i] = this.matrix[i][j];
            }
        }
        return result;
    }

    /**
    * Outputs the matrix
    * @returns a string of the matrix
    */ 
    public String toString()
    {
        String matrixStr = "";
        for (int i = 0; i < rows; ++i)
        {
            for (int j = 0; j < columns; ++j)
            {
                matrixStr += matrix[i][j] + "\t";
            }
            matrixStr += "\n";
        }
        return matrixStr;
    }

    /**
    * Discovers if two matrices are equal
    * @param m - matrix being compared
    * @returns boolean indicating whether both matrices are equal
    */ 
    public boolean equals(Matrix m)
    {
        for (int i = 0; i < rows; ++i)
        {
            for (int j = 0; j < columns; ++j)
            {
                if (this.matrix[i][j] != m.matrix[i][j])
                {
                    return false;
                }
            }
        }
        return true;
    }
}