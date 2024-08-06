import java.util.Scanner;
public class sortname{
public static void main(String[]args){
Scanner reader=new Scanner(System.in);
int i,j;
System.out.println("enter size of array:");
int n=reader.nextInt();
String[]a=new String[n];
reader.nextLine();
System.out.println("enter names:");
for(i=0;i<n;i++){
a[i]=reader.nextLine();}
for(i=0;i<n-1;i++){
for(j=0;j<n-i-1;j++){
if(a[j].compareTo(a[j+1])>0){
String temp=a[j];
a[j]=a[j+1];
a[j+1]=temp;}}}
for(i=0;i<n;i++){
System.out.print(a[i]+",");}}}

