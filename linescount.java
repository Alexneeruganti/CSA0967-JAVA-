import java.util.Scanner;
public class linescount{
public static void main(String[] args){
Scanner reader=new Scanner(System.in);
int count=0,k=0;
System.out.println("enter 0 to exit");
while(k==0){
String n=reader.nextLine();
int m=n.length();
count++;
if(n.equals('0')){
k++;
break;
}
}
System.out.println("noof lines:"+(count-1));
}}