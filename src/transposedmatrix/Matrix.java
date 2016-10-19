package transposedmatrix;

/**
 * Created by bathoryalex on 16/10/19.
 */
public class Matrix
{
    public static int[][] transpose(int[][] matrix)
    {
        if (matrix == null)
        {
            return null;
        }
        if (matrix.length == 0)
        {
            return null;
        }
        if (matrix[0] == null)
        {
            return null;
        }
        int firstRowLength = matrix[0].length;

        for (int i = 1; i < matrix.length ; i++)
        {
            if (matrix[i] == null || firstRowLength != matrix[i].length)
            {
                return null;
            }
        }

        int[][] result = new int[firstRowLength][matrix.length];

        for (int i = 0; i < matrix.length ; i++)
        {
            for (int j = 0; j < matrix[i].length ; j++)
            {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }

    public static void main(String[] args)
    {
        int[][] inpMatrix = new int[][]{{1,2,3},{4,5,6}};

        int[][] resultMatrix = transpose(inpMatrix);

        for (int[] row : resultMatrix)
        {
            System.out.println();
            for (int i : row)
            {
                System.out.print(i + " ");
            }
        }
    }
}