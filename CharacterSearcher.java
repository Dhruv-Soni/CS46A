/**
 * A searcher for charactrs in a sting
 */
public class CharacterSearcher
{
    private String text;

    /**
     * constructor to initialize
     * @param text to get the value
     */
    public CharacterSearcher(String text)
    {
        this.text=text;
    }

    /** Gets the text for this CharacterSearcher
     * @return the text for this CharacterSearcher
     */
    public String getText()
    {
        return text;
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
     * the count of how many letters appear more than once
     * @return duplicate the duplicate letters
     */
    public int countDuplicates()
    {
        text = text.toLowerCase();

        int duplicate = 0;

        int i = 0;

        boolean flag = false;

        while(i<text.length())
        {
            flag = false;

            String a = text.substring(i,i+1);

            for(int j=i+1;j<text.length();j++)
            {
                String a1 = text.substring(j,j+1);

                if(a.equals(a1) && flag == false)
                {
                    duplicate++;

                    flag = true;
                }
            }
            i++;
        }

        return duplicate;
    }

    /**
     * will return the number of p's and q's in the string
     * @return pqs the number of p's and q's
     */
    public int countPAndQs()
    {
        text = text.toLowerCase();

        String pQChecker = "pq"; 

        int pqs = 0; 

        int i = 0; 

        while(i<text.length()) 
        { 
            if(pQChecker.contains(text.substring(i,i+1)))
            {
                pqs++; 
            }
            i++; 
        } 

        return pqs;
    }

    /**
     * count how many of the characters in the string are not letters
     * @return non the number of non-letters
     */
    public int countNonLetters()
    {
        int i = 0; 

        int non = 0;

        while(i<text.length()) 
        {
            if(isLetter(text.substring(i,i+1)) == false)
            {
                non++;
            }
            i++;
        }

        return non;
    }

}