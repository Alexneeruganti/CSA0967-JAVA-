import java.util.Scanner;
public class insert{
public static void main(String[]args){
Scanner read=new Scanner(System.in);
int i;
System.out.println("enter array size:");
int n=read.nextInt();
int []a=new int[n];
System.out.println("enter position:");
int m=read.nextInt();
System.out.println("enter value:");
int k=read.nextInt();
System.out.println("");


if(m>a.length){
System.out.println("error");}
else{
a[m-1]=k;}
for(i=0;i<a.length;i++){
System.out.println(a[i]);}}}

