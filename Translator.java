/**
 * Translates a word from spanish to english
 */
public class Translator
{
    private String spanishWord;
    /**
     * Constructs a spanish word from the defined object
     * @param obj object of the SpanishWord class
     */
    public Translator(SpanishWord obj)
    {
        spanishWord=obj.getWord();
    }

    /**
     * grts the spanish word
     * @return the spanish word from object
     */
    public String getSpanish()
    {
        return spanishWord;
    }

    /**
     * Sets a new Spanish word to a word
     * @param spanishWord1 the new Spanish word
     */
    public void setSpanish(String spanishWord1)
    {
        SpanishWord spanish1 = new SpanishWord(spanishWord1);

        spanishWord = spanish1.getWord();
    }

    /**
     * English translation of spanish word
     * @return getEnglish()
     */
    public String getEnglish()
    {
        String a1;

        a1 = spanishWord.substring(0,3);

        if(a1.equals("el ") || a1.equals("la "))
        {
            spanishWord = spanishWord.substring(3);
        }

        if(spanishWord.equals("estudiante"))
        {
            spanishWord="student";
        }
        else if(spanishWord.equals("aprender"))
        {
            spanishWord="to learn";
        }
        else if(spanishWord.equals("azul"))
        {
            spanishWord="blue";
        }
        else if(spanishWord.equals("muy"))
        {
            spanishWord="very";
        }
        else
        {
            spanishWord="I don't know that word";
        }
        return spanishWord;
    }
}
