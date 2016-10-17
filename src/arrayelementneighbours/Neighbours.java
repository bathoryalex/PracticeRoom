package arrayelementneighbours;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bathoryalex on 16/10/17.
 */
public class Neighbours
{
    static final int[][] D = new int[][]{
            {-1,-1}, {-1, 0}, {-1,1}, {0,-1},
            { 0, 1}, { 1,-1}, { 1,0}, {1, 1}
    };

    static int [][] field = new int[][]{
            { 2,  4,  8,  3},
            {-5,  6,  7,  9,  1,  -8},
            {10},
            {11,  2,  7},
            {12, 20, -1},
            { 1,  2,  4}
    };

    public static Integer[] getNeighbours(int i, int j)
    {
        List<Integer> result = new ArrayList<>();
        for (int[] dir : D)
        {
            int di = i + dir[0];
            int dj = j + dir[1];

            if (di >= 0 && di < field.length)
            {
                if (dj >= 0 && dj < field[di].length)
                {
                    result.add(field[di][dj]);
                }
            }
        }
        return result.toArray(new Integer[result.size()]);
    }

    public static void main(String[] args)
    {
        getNeighbours(2,3);
    }

}