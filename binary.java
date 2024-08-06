import java.util.Scanner;
public class binary{
public static void main(String[]args){
Scanner reader=new Scanner(System.in);
System.out.println("enter decimal number:");
int k=reader.nextInt();
int a=k;
int rem=0;
String sum="";
while(a!=0){
rem=a%2;
sum=rem+sum;
a=a/2;}
System.out.println("binary number of "+k+"\n"+sum);}
}
