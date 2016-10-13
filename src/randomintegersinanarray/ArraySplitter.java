package randomintegersinanarray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by bathoryalex on 16/10/13.
 */
public class ArraySplitter
{
    public static int[] generateNumbers(int n)
    {
        int[] generatedNumbers = new int[n];
        for (int i = 0; i < generatedNumbers.length; i++)
        {
            generatedNumbers[i] = (int) (Math.random() * 20);
        }
        return generatedNumbers;
    }

    public static Integer[][] arraySplitter(int[] array)
    {
        List<Integer[]> resultList = new ArrayList<>();
        List<Integer> subList = new ArrayList<>();
        for (int i : array)
        {
            if(!subList.contains(i))
            {
                subList.add(i);
            }
            else
            {
                Integer[] subArray = subList.toArray(new Integer[1]);
                resultList.add(subArray);
                subList.clear();
                subList.add(i);
            }
        }
        Integer[] subArray = subList.toArray(new Integer[1]);
        resultList.add(subArray);
        return resultList.toArray(new Integer[1][]);
    }

    public static void main(String[] args)
    {
        int[] randoms = generateNumbers(30);
        System.out.println(Arrays.toString(randoms));
        System.out.println("----------");
        Integer[][] splitted = arraySplitter(randoms);
        for (Integer[]i : splitted)
        {
            System.out.println(Arrays.toString(i));
        }
    }
}