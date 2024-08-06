import java.util.Scanner;
public class areas{
int length,breadth,radius,side;
public areas(int length,int breadth,int side,int radius){
this.length=length;
this.breadth=breadth;
this.side=side;
this.radius=radius;}
public void rectangle(){
int sum=length*breadth;
System.out.println("area of rectangle= "+sum);
}
public void square(){
int sum=side*side;
System.out.println("area of square= "+sum);
}
public void circle(){
double tot=3.14*radius*radius;
System.out.println("area of circle= "+tot);
}
public static void main(String[]args){
Scanner reader=new Scanner(System.in);
System.out.println("enter length");
int length=reader.nextInt();
System.out.println("enter breadth");
int breadth=reader.nextInt();
System.out.println("enter side");
int side=reader.nextInt();
System.out.println("enter radius");
int radius=reader.nextInt();
areas a1=new areas(length,breadth,side,radius);
areas a2=new areas(length,breadth,side,radius);
a1.rectangle();
a2.square();
a1.circle();
}}





