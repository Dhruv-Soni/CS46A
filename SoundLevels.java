import java.lang.Math;
import java.util.Scanner;
public class SoundLevels
{
    public static final double REF_SD_PE = 20E-6;
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter type of sound unit: Pa or dB: ");
        String a1 = scan.nextLine();

        if (a1.equals("Pa") || a1.equals("dB"))
        {
            System.out.print("Enter the sound value: ");
            double a2 = scan.nextDouble();
            String a4 = "";
            String a5 = "";
            if (a1.equals("Pa"))
            {
                double a3 = 20*Math.log10(a2/REF_SD_PE);           

                if (a3 == 0)
                {
                    a4 = "threshold of normal hearing";
                }
                else if(a3 == 60)
                {
                    a4 = "no damage";
                }
                else if(a3 == 85)
                {
                    a4 = "damage after 8 hours";
                }
                else if(a3 == 100)
                {
                    a4 = "damage after 15 minutes a day";
                }
                else if(a3>=140 && a3<=190)
                {
                    a4 = "immediate damage"; 
                }
                else if(a3 >= 190)
                {
                    a4 = "don't even think about it";
                }
                else
                {
                    a4 = "I do not have that value";

                }
                System.out.println(a4);
            }
            else
            {
                if (a2 == 0)
                {
                    a5 = "threshold of normal hearing";
                }
                else if(a2 == 60)
                {
                    a5 = "no damage";
                }
                else if(a2 == 85)
                {
                    a5 = "damage after 8 hours";
                }
                else if(a2 == 100)
                {
                    a5 = "damage after 15 minutes a day";
                }
                else if(a2>=140 && a2<=190)
                {
                    a5 = "immediate damage"; 
                }
                else if(a2 >= 190)
                {
                    a5 = "don't even think about it";
                }
                else
                {
                    a5 = "I do not have that value";

                }
                System.out.println(a5);
            }
        }
        else
        {
            System.out.println("Enter correct correct units");
        } 
    }
}

