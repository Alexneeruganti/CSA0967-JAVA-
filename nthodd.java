import java.util.Scanner;
public class nthodd{
public static void main(String[]args){
Scanner reader=new Scanner(System.in);
int i;
int n=reader.nextInt();
int a[]=new int[100];
int j=1;
for(i=1;i<100;i++){
if(i%2!=0){
a[j]=i;
j++;
}}
System.out.println(a[n*2]);}}