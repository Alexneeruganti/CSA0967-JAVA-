import java.util.Scanner;
public class simpleinterest{
public static void main(String[]args){
Scanner reader=new Scanner(System.in);
int si=0;
System.out.println("enter age:");
int a=reader.nextInt();
System.out.println("enter amount:");
int b=reader.nextInt();

if(a>60){
si=(b*1*20/100)/100;
}
else{
si=(b*1*10/100)/100;}
System.out.println(si);}}