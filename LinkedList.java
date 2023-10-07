import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.Serializable;
import java.util.Scanner;


public class LinkedList {
    private Node head;
    public Integer numberPeople;
    public Integer grandMin;
    public Integer inprogressMin;

    public void run() {
        Node cur = head;
        System.out.println("Jgdewgjh");

        Scanner input=new Scanner(System.in);
        System.out.println("How many people are studying today? ");
        int numberPeople=input.nextInt();
        System.out.println("How many minutes do you want to work for? ");
        int grandMin=input.nextInt();

        int count = 0;

        while (count < numberPeople) {
            System.out.println("Person " + (count + 1) + " enter your name");
            String username=input.next();
            //System.out.println(username + " enter how many minutes you have studied");
            //int inprogressMin=input.nextInt();

            Person p = new Person();
            p.setName(username);
            //p.setTimeWorked(inprogressMin);
            Node newNode = new Node();
            newNode.setPerson(p);
            newNode.setNext(head);
            //cur = newNode;
            //cur = cur.getNext();
            cur = head;

            count++;
        }
        cur = cur.getNext();
        boolean flag = false;
        System.out.println("Go! Go! Go!");
        System.out.println("Check-In!");
        cur = head;

        while(flag == false) {
            int count2 = 0;

                if (cur.getPerson().getTimeWorked() == grandMin) {
                    System.out.println(cur.getPerson().getName() + "wins");
                    flag = true;
                }
                else {
                    System.out.println(cur.getPerson().getName() + " enter how many minutes you have studied");
                    int inprogressMin=input.nextInt();

                    cur.getPerson().setTimeWorked(inprogressMin);

                    cur = cur.getNext();


                
                

        }


        }




        
    }

}





