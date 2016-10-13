package cards;

/**
 * Created by bathoryalex on 16/10/13.
 */
public enum Rank
{
    ACE("A"), TWO("2"), THREE("3"), FOUR("4"), FIVE("5"), SIX("6"), SEVEN("7"), EIGHT("8"), NINE("9"), TEN("10"), JACK("J"), QUEEN("Q"), KING("K");
    private String value;

    private Rank(String value)
    {
        this.value = value;
    }

    @Override
    public String toString()
    {
        return String.valueOf(value);
    }
}
