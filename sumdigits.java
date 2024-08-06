import java.util.Scanner;
public class sumdigits{
public static void main(String[]args){
Scanner reader=new Scanner(System.in);
int rem=0,sum=0;
System.out.println("enter number:");

int a=reader.nextInt();
while(a!=0){
rem=a%10;
sum=sum+rem;
a=a/10;}
System.out.println("sum:"+sum);}}