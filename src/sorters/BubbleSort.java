package sorters;

import java.util.Arrays;

/**
 * Created by bathoryalex on 16/10/19.
 */
public class BubbleSort
{
    int[] list;

    public BubbleSort(int[] list)
    {
        this.list = list;
    }
   /*Miközben végigmegyünk a tömbön, összehasonlítjuk az aktuális elemet
    a következővel és kicseréljük őket
    ha rossz sorrendben vannak.
   */

    public int[] sort()
    {
        boolean wasSwap = true;
        while(wasSwap)
        {
            wasSwap = false;
            for (int i = 0; i < list.length - 1; i++)
            {
                if (list[i] > list[i + 1])
                {
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                    wasSwap = true;
                }
            }
        }
        return list;
    }

    public static void main(String[] args)
    {
        int[] numbers = {1, 5, 6, 8, 2, 0, -12};
//        int a = 2;
//        int b = 3;
//        a += b; //a = 5, b = 3
//        b = a - b; // a = 5, b = 2
//        a -= b; //a = 3, b = 2

//        With bitwise operation:
//        a = a ^ b; 10 ^ 11 = 01
//        b = b ^ a; 11 ^ 01 = 10
//        a = a ^ b; 01 ^ 10 = 11

        BubbleSort bs = new BubbleSort(numbers);

        int[] sorted = bs.sort();
        System.out.println(Arrays.toString(sorted));
    }
}