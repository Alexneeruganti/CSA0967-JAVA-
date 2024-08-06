import java.util.Scanner;
public class leapyears{
public static void main(String[]args){
Scanner reader=new Scanner(System.in);
int count=1;
System.out.println("enter no of leap years:");
int n=reader.nextInt();
System.out.println("enter starting year:");
int a=reader.nextInt();
while(count<=n){
if(a%4==0){
 if(a%100!=0 ||a%400==0){
  System.out.print(a+",");
count++;
}
}

a++;
}}}
