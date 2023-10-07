import java.time.LocalTime;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        LocalTime ltime = LocalTime.now();
        String ltime2;
        ltime2 = ltime.toString();

        String currentTime = "";
        for (int i = 0; i < 5; i++) {
            currentTime += ltime2.charAt(i);
        }
        System.out.println("Local time value : " + currentTime);

        Scanner input=new Scanner(System.in);
        System.out.println("How many minutes do you want to work for? ");
        int timeWillWork=input.nextInt();

        int numberHours = 0;
        int numberMin = 0;
        numberHours = (timeWillWork / 60);
        numberMin = (timeWillWork - (numberHours * 60));

        LocalTime updatedTime = ltime.plusHours(numberHours).plusMinutes(numberMin);
        String updatedTime2;
        updatedTime2 = updatedTime.toString();

        String updatedTimeString = "";
        for (int i = 0; i < 5; i++) {
            updatedTimeString += updatedTime2.charAt(i);
        }
        System.out.println("Time when done: " + updatedTimeString);
    
}
}
