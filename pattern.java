import java.util.Scanner;
public class pattern{
public static void main(String[]args){
Scanner reader=new Scanner(System.in);
int i,j,k;
System.out.println("enter number of lines:");
int n=reader.nextInt();
for(i=1;i<=n;i++){
System.out.println("");
for(k=1;k<=n-i;k++){
System.out.print(" ");}
for(j=1;j<=i;j++){
System.out.print(" *");
}}}}


