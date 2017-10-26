/**
 * Print a word with various changes
 */
public class WordChange
{
    public static void main(String[] args)
    {
        String word = "pet"; 
        //do not change the line above here
        String word_1 = word;

        System.out.println(word.toUpperCase());

        word_1 = word_1.replace('e','a');

        System.out.println(word_1);

        word_1 = word_1.replace('p','c');

        System.out.println(word_1);

        word_1 = word_1.replace("t","ge");

        System.out.println(word_1);

        System.out.println(word_1.length());//add your code below here

        System.out.println(word); // do not change this line
    }

}