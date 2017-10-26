/**
 * A class that changes words
 */
public class Word
{
    String word;

    /**
     * constructor to initialize for the instance variables
     * @param word the word
     */
    public Word(String word)
    {
        this.word = word;
    }

     /**
     * reverses all the letters except the first letter
     * @return reverseAllButFirst
     */
    public String reverseAllButFirst()
    {
        if(word.length()>0)
        {
            String b = "";
            String c = word.substring(0,1);
            int d = word.length();
            for(int i = d-1; i > 0; i--)
            {
                b = b + word.substring(i,i+1);
            }
            return c + b;
        }
        else
        {
            return word;
        }
    }

    

    /**
     * middle letters
     * @return getMiddles
     */
    public String getMiddles()
    {
        int a = word.length();
        if(a<4)
            return " ";
        else
        {
            if(a%2==0)
            {
                return (word.substring((a/2)-1,(a/2)+1));
            }
            else 
            {
                return (word.substring((a/2)-1,(a/2)+2));
            }}
    }
    
    /**
     * remove duplicates letters
     * @return removeDuplicates
     */
    public String removeDuplicates()
    {
        String a = "";
        for (int i = 0; i < word.length(); i++)
        {
            boolean found = false;
            for (int j = 0; j < a.length(); j++) 
            {
                if(word.substring(i,i+1).equals(word.substring(j,j+1)))
                {
                    found = true;
                }
            }
            if (found == false) 
            {
                a = a + word.substring(i,i+1);
            }
        }
        return a;
    }

    /**
     * method to get the word
     * @return word the word
     */
    public String getWord()
    {
        return word;
    }

    /**
     * method to set the new word
     * @param newWord which sets the new word
     */
    public void setWord(String newWord)
    {
        word = newWord;
    }
}