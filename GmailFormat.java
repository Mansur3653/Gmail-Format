import java.util.*;
class Gmail
{
    static Scanner sc = new Scanner(System.in);
    static String mail;
    static String firstpart()
    {
	System.out.println("Enter your mail id:");
        mail = sc.next();
        String submail = "";
        int a=0,b=0;
        for(int i=0;i<mail.length()-10;i++)
        {
            if((mail.charAt(i)>='a' && mail.charAt(i)<='z') || (mail.charAt(i)>='0' && mail.charAt(i)<='9'))
            {
                a++;
                submail = submail+mail.charAt(i);
            }
        }
        if(a==(mail.length()-10))
        {
            submail = submail+"@gmail.com";
        }
        else
        {
            return null;
        }
        return submail;
    }
    public static void main(String[] args)
    {
        boolean b = true;
        while(b)
        {
            String generatedmail = firstpart();
            if(generatedmail!=null)
            {
                if(mail.equals(generatedmail))
                {
                    System.out.println("Entered mail format is correct.");
                    b = false;
                }
            }
            else
            {
                System.out.println("Entered mail format is Incorrect.");
                System.out.println("Use only small letters and numbers and '@gmail.com' at very last.....");
                System.out.println("Try again...");
                b = true;
            }
        }
    }
}
