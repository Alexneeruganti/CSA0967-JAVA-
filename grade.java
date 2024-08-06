import java.util.Scanner;
public class grade{
public static void main(String[]args){
Scanner reader=new Scanner(System.in);
System.out.println("enter the marks in python:");
int a=reader.nextInt();
System.out.println("enter the marks in c programming:");
int b=reader.nextInt();
System.out.println("enter the marks in mathematics:");
int c=reader.nextInt();
System.out.println("enter the marks in physics:");
int d=reader.nextInt();
int total=0;
float aggregate=0;
total=a+b+c+d;
System.out.println("total:"+total);
aggregate=(total/4f);
System.out.println("aggregate:"+aggregate+"%");
if(aggregate>=75){
System.out.println("DISTINCTION");}
else if(aggregate >=60 && aggregate<75){
System.out.println("FIRST DIVISON");}
else if(aggregate >=50 && aggregate<60){
System.out.println("SECOUND DIVISON");}
else if(aggregate >=40 && aggregate<50){
System.out.println("THIRD DIVISON");}
else{
System.out.println("FAIL");}
}
}

