import java.util.Scanner;
public class countline{
public static void main(String[]args){
Scanner reader=new Scanner(System.in);
int i,count=0;
System.out.println("enter string:");
String n=reader.nextLine();
int b=n.length();
for(i=0;i<b;i++){
if(n.charAt(i)=='?'){
count++;}}
System.out.println(count);}}

