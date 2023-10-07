import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("How many minutes do you want to work for? ");
        int type=input.nextInt();
         Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        System.out.println( sdf.format(cal.getTime()) );
        
        
       // Game game=new Game();
    }
}
