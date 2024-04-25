//java String program to remove leading zeros
public class TechAlpha3
{
    public static void main(String[] args) {
        String first="000123";
        String second=" ";
        System.out.println("MAIN STRING" +"\n"+first);
        for (int i=0;i<first.length();i++)
        {
            if (first.charAt(i)=='0')
            {
                continue;
            }else {
                second=first.substring(i);
                break;
            }
        }
        System.out.println("AFTER REMOVING ZEROS"+"\n"+second);
    }
}
