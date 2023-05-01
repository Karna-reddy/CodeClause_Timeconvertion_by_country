package mallikarjun;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

class TimeConversion
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("        *****CODECLAUSE TIMEZONE CONVERSION PROJECT***** ");
        System.out.println();
        int n=1;
        while (n!=0)
        {
            System.out.println("ENTER 1 TO KNOW ABOUT THE LOCAL DATE,TIME AND TIMEZONE");
            System.out.println("ENTER 2 TO KNOW ABOUT ALL THE TIMEZONES");
            System.out.println("ENTER 3 TO CONVERT THE LOCAL TIME ZONE TO ANY OTHER COUNTRY TIME ZONE");
            int num= s.nextInt();

        switch(num){

            case 1:
                 
                String date1 = new SimpleDateFormat("dd-MM-yy hh:mm:ss").format(Calendar.getInstance().getTime());
                String date2 = Calendar.getInstance().getTimeZone().getID();
                System.out.println("LOCAL DATE AND TIME:" + date1);
                System.out.println("LOCAL TIMEZONE :" + date2);
                System.out.println();
                break;
            case 2:
                 
                String[] id = TimeZone.getAvailableIDs();
                System.out.println("The available Timezones  are as follows:");
                for (int i = 0; i < id.length; i++)
                {
                    System.out.println(id[i]);
                }
                System.out.println();
                break;
            case 3:
                 
                Scanner mz = new Scanner(System.in);
                String tz;
                System.out.println("Enter your Timezone id");
                tz = mz.nextLine();
                TimeZone.setDefault(TimeZone.getTimeZone(tz));
                SimpleDateFormat date_format=new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
                Date date=new Date();
                String current_date_time=date_format.format(date);

                System.out.println("NOW THE TIMEZONE HAS BEEN CHANGED");
                System.out.println("CURRENT TIME AND DATE :" + current_date_time);
                System.out.println("CURRENT TIMEZONE :" + tz );
                System.out.println();
                break;
            default:
                System.out.println(" Enter 1 OR 2 OR 3 only");
                System.out.println();
                
        }
           
            System.out.println("DO YOU WANT TO CONTINUE?");
            System.out.println(("IF YES TYPE 1 OR TYPE 0"));
            n= s.nextInt();
            System.out.println();

           
    }System.out.println("*****THANK YOU*****");
    s.close();
    }
}