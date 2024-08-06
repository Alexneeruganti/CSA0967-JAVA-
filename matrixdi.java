import java.util.Scanner;
public class matrixdi{
public static void main(String[]args){
Scanner reader=new Scanner(System.in);
int i,j,sum=0;
System.out.println("enter no of rows of  matrix:");
int m=reader.nextInt();
System.out.println("enter no of columns of  matrix:");
int n=reader.nextInt();
System.out.println("enter elements:");
int a[][]=new int[m][n];
for(i=0;i<m;i++){
for(j=0;j<n;j++){
a[i][j]=reader.nextInt();}}
for(i=0;i<m;i++){
for(j=0;j<n;j++){
if(i==j){
sum+=a[i][j];}}}
System.out.println(sum);
}}