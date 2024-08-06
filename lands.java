import java.util.Scanner;
public class lands{
public static void main(String[]args){
Scanner reader=new Scanner(System.in);
int i,j,temp=0,c;
System.out.println("size of array:");
int a=reader.nextInt();
int b []=new int[a];
System.out.println("enter aray elements:");
for(i=0;i<b.length;i++){
b[i]=reader.nextInt();}
for(i=0;i<b.length-1;i++){
for(j=0;j<b.length-1-i;j++){
if(b[j]>b[j+1]){
temp=b[j];
b[j]=b[j+1];
b[j+1]=temp;}}}

System.out.println("2nd highest position is:"+b[a-2]);}}