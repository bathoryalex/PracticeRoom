package mixcharactersinsideword;

import java.util.Random;

/**
 * Created by bathoryalex on 16/10/18.
 */
public class WordCharMixer
{
    public static String mixWordCharacters(String yourSentence)
    {
        String[] words = yourSentence.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words)
        {
            if(word.length() > 3)
            {
                char firstChar = word.charAt(0);
                char lastChar = word.charAt(word.length() - 1);
                word = shuffleWord(word.substring(1, word.length() - 1));
                word = firstChar + word + lastChar;
            }
            result.append(word);
            result.append(" ");
        }
        return result.toString();
    }

    public static String shuffleWord(String word)
    {
        Random rand = new Random();
        String result = word;
        for (int i = 0; i < result.length() ; i++)
        {
            result = swapCharacters(result, i, rand.nextInt(result.length()));
        }
        return result;
    }

    public static String swapCharacters(String word, int i, int j)
    {
        if (i == j)
        {
            return word;
        }
        char[] chars = word.toCharArray();
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;

        String result = new String(chars);

        return result;
    }

    public static void main(String[] args)
    {
        String text="A fentiekből világosan látszik hogy itt nem tiszta minden hiszen hogyan is " +
                    "lenne képes ugyanaz a GPU ugyanarra ötven százalékkal kisebb fogyasztással";
        System.out.println(mixWordCharacters(text));
    }
}