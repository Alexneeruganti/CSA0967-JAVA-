import java.util.Scanner;
class student{
int id;
String name;

student(int id,String name){
this.id=id;
this.name=name;}
public static void main(String[]args){

Scanner read=new Scanner(System.in);
System.out.println("enter student id:");
int id=read.nextInt();
read.nextLine();
System.out.println("enter name:");
String name=read.nextLine();

student s1=new student(id,name);

System.out.println("STUDENT ID:"+s1.id);
System.out.println("STUDENT NAME:"+s1.name);}}
