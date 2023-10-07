

import java.util.Scanner;
import java.time.LocalTime;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("How many people are studying today? ");
        int numberpeople=input.nextInt();
        System.out.println("How many minutes do you want to work for? ");
        int type=input.nextInt();
        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime); 
        ArrayList<String>names=new ArrayList<String>();
        ArrayList<Person> PersonList = new ArrayList<Person>();
        for(int i=0;i<numberpeople;++i){
            System.out.println("What is the name of the "+(i+1)+" person?");
            String person=input.next();
            names.add(person);
            String yesname=names.get(i);
            PersonList.add(new Person(yesname));
        }



       
       
        

;
        
        

        

        
        
        
        
    }
    }

 