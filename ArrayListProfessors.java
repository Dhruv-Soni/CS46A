import java.util.ArrayList;
/**
 * Application to use array lists
 */
public class ArrayListProfessors
{
    public static void main(String[] args)
    {
        ArrayList<String> professors = new ArrayList<>();
        professors.add("Taylor");
        professors.add("Stamp");
        professors.add("Horstmann");
        professors.add(0,"O'Brien");
        professors.add(2,"Wesley");
        professors.set(1,"Pearce");
        professors.set(professors.size()-2,"Potika");
        System.out.println(professors);
        for(String professor: professors)
        {
            System.out.println(professor);
        }
       
    }
}