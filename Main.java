
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("How many minutes do you want to work for? ");
        int type=input.nextInt();
        System.out.println("What is the current time");
        String time=input.next();

        String[] arroftime=time.split(":");
        int[]arroftimeint=new int[2];
        for (int i=0;i<=1;++i){
            arroftimeint[i]=Integer.parseInt(arroftime[i]);
        }
        int approxtimefinish=arroftimeint[1]+type;
        
        
        
    }
    }

 