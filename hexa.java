import java.util.Scanner;
public class hexa{
public static void main(String[]args){
Scanner reader=new Scanner(System.in);
System.out.println("enter decimal number:");
int a=reader.nextInt();
int d=0;
String k="";
char n[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
while(a!=0){
d=a%16;
k=n[d]+k;
a=a/16;}
System.out.println("hexadecimal is:"+k);
}
}             