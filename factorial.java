import java.util.Scanner;
public class factorial{
public static void main(String[]args){
Scanner reader=new Scanner(System.in);
System.out.println("enter positive integer");
int n=reader.nextInt();
int i=1,sum=1;
while(i<=n){
sum=sum*i;
i++;}
System.out.println("factorial of "+n+" is "+sum);
}}
