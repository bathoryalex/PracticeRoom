package evenrowandcolumnmultip;

import java.util.Arrays;

/**
 * Created by bathoryalex on 16/10/17.
 */
public class ElementMultiplication
{
    static int [][] field = new int[][]{
            { 2,  4,  8,  3},
            {-5,  6,  7,  9,  1,  -8},
            {10},
            {11,  2,  7},
            {12, 20, -1},
            { 1,  2,  4}
    };

    public static void multiplyByMinusOne()
    {
        for (int i = 0; i < field.length ; i++)
        {
            if ((i % 2) == 1)
            {
                for (int j = 0; j < field[i].length ; j++)
                {
                    {
                        field[i][j] *= -1;
                    }
                }
            }
        }

        for (int i = 0; i < field.length ; i++)
        {
            for (int j = 0; j < field[i].length; j++)
            {
                if((j % 2) == 1)
                {
                    field[i][j] *= -1;
                }
            }
        }
    }

    public static void main(String[] args)
    {
        multiplyByMinusOne();

        for (int[]i : field)
        {
            System.out.println(Arrays.toString(i));
        }
    }
}
