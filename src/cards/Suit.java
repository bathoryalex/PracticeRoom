package cards;

/**
 * Created by bathoryalex on 16/10/13.
 */
public enum Suit
{
    HEART('♥'), DIAMOND('♦'), SPADE('♠'), CLUB('♣');
    private char value;

    private Suit(char value)
    {
        this.value = value;
    }

    @Override
    public String toString()
    {
        return String.valueOf(value);
    }
}