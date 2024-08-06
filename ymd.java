import java.util.Scanner;
public class ymd{
public static void main(String[]args){
Scanner reader=new Scanner(System.in);
System.out.println("enter no of days:");
int a=reader.nextInt();
int y=a/365;
int m=(a%365)/30;
int d=(a%365)%30;
System.out.println(+y+" year " +m+" months "+d+" days");
}}
