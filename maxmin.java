import java.util.Scanner;
public class maxmin{
public static void main(String[]args){
Scanner reader=new Scanner(System.in);
System.out.println("enter size of array:");
int a=reader.nextInt();
int []b=new int[a];
System.out.println("enter elements in a array:");
for(int i=0;i<a;i++){
b[i]=reader.nextInt();
}
for(int i=0;i<(a-1);i++){
for(int j=0;j<(a-i-1);j++){
if(b[j]>b[j+1]){
int temp=b[j];
b[j]=b[j+1];
b[j+1]=temp;}}}
System.out.println("enter mth maximum:");
int c=reader.nextInt();
System.out.println("enter nth minimum:");
int d=reader.nextInt();
System.out.println("mth maximum is "+b[a-c]);
System.out.println("nth minimum is "+b[d-1]);
}
}

