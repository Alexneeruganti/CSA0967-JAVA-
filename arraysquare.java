import java.util.Scanner;
public class arraysquare{
public static void main(String[]args){
Scanner reader=new Scanner(System.in);
System.out.println("enter size of array:");
int i;
int n=reader.nextInt();
int []a=new int[n];
System.out.println("enter starting element in an array:");
int b=reader.nextInt();
a[0]=b;
for(i=1;i<a.length;i++){
a[i]=a[i-1]*a[i-1];
}
for(i=0;i<a.length;i++){
System.out.print(a[i]+",");}
}}

