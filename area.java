
import java.util.Scanner;
public class area{
int l;
int b;
public area(int l,int b){
this.l=l;
this.b=b;}
public int rectangle(){
int sum=l*b;
return sum;}
public static void main(String[]args){
Scanner reader=new Scanner(System.in);
System.out.println("enter length");
int l=reader.nextInt();
System.out.println("enter breadth:");
int b=reader.nextInt();
area a1=new area(l,b);
int area=a1.rectangle();
System.out.println("AREA = "+area);}
}

