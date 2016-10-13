package whicharein;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by bathoryalex on 16/10/13.
 */
public class WhichAreIn
{
    public static String[] inArray(String[] array1, String[] array2)
    {
        List<String> stringList = new ArrayList<>();
        for (String string1 : array1)
        {
            for (String string2 : array2)
            {
                if(string2.contains(string1) && !stringList.contains(string1))
                {
                    stringList.add(string1);
                    System.out.println(string1);
                }
            }
        }
        java.util.Collections.sort(stringList);
        String[] r = new String[stringList.size()];
        stringList.toArray(r);
        return r;
    }

    public static void main(String[] args)
    {
        String[] a = new String[]{"arp", "live", "strong"};
        String[] b = new String[]{"lively", "alive", "harp", "sharp", "armstrong"};
        inArray(a, b);
    }
}

