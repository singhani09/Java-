// student details using scanner class which has the fields like roll,name,sec,College name,phn no.,fee
import java.util.Scanner;
public class Student{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the roll no. of the student :  ");
    int roll_no = sc.nextInt();
    System.out.println("enter the section :  ");
    char sec = sc.next().charAt(0);
    System.out.println("enter the college name : ");
    String College = sc.next();
    System.out.println("enter the phone no.  :");
    long phNO = sc.nextLong();
    System.out.println( "enter the fees :");
    double fee = sc.nextDouble();



}
}