/**
 * A class to manipulate characters of a string
 */
public class AlphaAndOmega
{

    private String words;
    /**
     * constructs an object with the given string of words
     * @param words the string of characters for this object
     */
    public AlphaAndOmega(String words)
    {
        this.words = words;
    }

    /**
     * gets the first letter of every word in the string
     * @return the first letter of the word
     */
    public String firstLetters()
    {
        String a;
        if(words.equals(""))
        {
            a = "null";
        }
        else
        {
            a = words.substring(0,1);
            for(int i = 0;i < words.length()-1;i++)
            {
                if(words.substring(i,i+1).equals(" "))
                {
                    a = a + words.substring(i+1,i+2);
                }
            }
        }

        return a;
    }

    /**
     * gets the last letter of every word in the string
     * @return null
     */
    public String lastLetters()
    {
        String a = "";

        if(words.equals(""))
        { 
            a = "null";
        }
        else
        {
            for(int i=0;i<words.length();i++)
            {
                if(words.substring(i,i+1).equals(" "))
                {
                    if(isLetter(words.substring(i-1,i)))
                    {
                        a = a + words.substring(i-1,i);
                    }
                    else
                    {
                        a = a + words.substring(i-2,i-1);
                    }
                }
            }
            if(isLetter(words.substring(words.length()-1)))
            {
                a = a + words.substring(words.length()-1);
            }
            else
            {
                a = a + words.substring(words.length()-2,words.length()-1);
            }
        }
        return a;
    }

    /**
     * Determines if the string consists of a single letter
     * @param in the string to check. 
     * @return false if the string is not a single character 
     * of if that character is not a letter otherwise returns 
     * true
     */
    public static boolean isLetter(String in)
    {
        if (in.length() > 1)
        {
            return false;
        }

        return Character.isLetter(in.charAt(0));
    }

    /**
     * Sets a new sentence in this object
     * @param theWords the new sentence to set
     */
    public void setText(String theWords)
    {
        words = theWords;
    }

    /**
     * gets the word in the string
     * @return the word in the string
     */
    public String getText()
    {
        return words;
    }
}
