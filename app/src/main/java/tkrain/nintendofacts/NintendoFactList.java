package tkrain.nintendofacts;

import java.util.Random;

/**
 * Created by TkRain on 7/30/15.
 */
public class NintendoFactList
{

// Member variable (properties about the object)

    public String[] mFacts =
            /*
            Creates an array that stores all of the mFacts
            (more efficient than the if else statements below)
            */
        {
                "The first d-pad was created for a Nintendo Game",
                "Nintendo was founded as a card company in 1889",
                "Kirby's original name was Tinkle Pop",
                "Nintendo made their first video game in 1978",
                "Mario has a 27' vertical jump",
                "NES games were meant to be difficult to last longer",
                "Nintendo translates to \"Leave Luck to Heaven\"",
                "The classic N64 controller was designed especially for Super Mario",
                "The legend of Zelda was originally \"The Hyrule Fantasy\"",
                "Miyamoto wanted Kirby to be yellow instead of pink",
                "Hitmonlee and Hitmonchan were named after Jackie Chan and Bruce Lee",
                "Luigi is green in Mario Bros because it matches the turtles",
                "Only 400 games were produced for the Nintendo 64",
                "Chain Chomp was based on Miyamoto's nieghbor's dog which terrified him as a child"
        };
// Method (abilities: things the object can do)
    public String getFact()
    {

        // Update the label with our dynamic fact

                /*
                The if-else thing I made before remembering arrays exist ._.

                if (randomNumber == 0)
                {
                    fact = "The first d-pad was created for a Nintendo Game";
                }
                else if (randomNumber == 1)
                {
                    fact = "Nintendo was founded as a card company in 1889";
                }
                else if (randomNumber == 2)
                {
                    fact = "Kirby's original name was Tinkle Pop";
                }
                else if (randomNumber == 3)
                {
                    fact = "Nintendo made their first video game in 1978";
                }
                else if (randomNumber == 4)
                {
                    fact = "Mario has a 27' vertical jump";
                }
                else if (randomNumber == 5)
                {
                    fact = "NES games were meant to be hard to last longer";
                }
                else if (randomNumber == 6)
                {
                    fact = "Nintendo translates to \"Leave Luck to Heaven\"";
                }
                else if (randomNumber == 7)
                {
                    fact = "The classic N64 controller was designed especially for Super Mario";
                }
                else if (randomNumber == 8)
                {
                    fact = "The Legend of Zelda was originally \"The Hyrule Fantasy\"";
                }
                else if (randomNumber == 9)
                {
                    fact = "Miyamoto wanted Kirby to be yellow instead of pink";
                }
                else if (randomNumber == 10)
                {
                    fact = "Hitmonlee and Hitmonchan were named after Jackie Chan and Bruce Lee";
                }
                else if (randomNumber == 11)
                {
                    fact = "Luigi is green in Mario Bros because it matches the turtles";
                }
                else if (randomNumber == 12)
                {
                    fact = "Only 400 games were produced for the Nintendo 64";
                }
                else if (randomNumber == 13)
                {
                    fact = "Yoshi's real name is T. Yoshisaur Munchakoopas";
                }
                else if (randomNumber == 14)
                {
                    fact = "Chain Chomp was based on Miyamoto's neighbor's dog which terrified him as a child";
                }
                else
                {
                    fact = "Sorry, but there was an error!";
                }
                */

        String fact = ""; //blank string initialized

        // Randomly Select a fact
        Random randomGenerator = new Random(); // Constructs a new random number generator
        int randomNumber = randomGenerator.nextInt(mFacts.length);

        fact = mFacts[randomNumber];

        return fact;
    }

}

