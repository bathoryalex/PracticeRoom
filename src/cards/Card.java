package cards;

import java.util.Comparator;

/**
 * Created by bathoryalex on 16/10/13.
 */
public class Card implements Comparable<Card>
{
    private Suit suit;
    private Rank rank;

    public Card(Suit suit, Rank rank)
    {
        this.suit = suit;
        this.rank = rank;
    }

    public Suit getSuit()
    {
        return suit;
    }

    public Rank getRank()
    {
        return rank;
    }

    @Override
    public String toString()
    {
        return rank.toString() + suit.toString();
    }

    @Override
    public int compareTo(Card card)
    {
        Rank otherCardRank = card.getRank();
        Rank[] ranks = Rank.values();
        int actualRankIndex = -1;
        int otherRankIndex = -1;
        for (int i = 0; i < ranks.length; i++)
        {
            if (ranks[i] == otherCardRank)
            {
                otherRankIndex = i;
            }
            if (ranks[i] == rank)
            {
                actualRankIndex = i;
            }
        }
        return actualRankIndex - otherRankIndex;
    }
}