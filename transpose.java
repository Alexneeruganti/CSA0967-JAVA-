import java.util.Scanner;
public class transpose{
public static void main(String[]args){
Scanner reader=new Scanner(System.in);
int i,j;
System.out.println("enter no of rows:");
int m=reader.nextInt();
System.out.println("enter no of columns:");
int n=reader.nextInt();
int a[][]=new int[m][n];
int b[][]=new int[m][n];
System.out.println("enter elements in matrix:");
for(i=0;i<m;i++){
for(j=0;j<n;j++){
a[i][j]=reader.nextInt();
}}
for(i=0;i<m;i++){
for(j=0;j<n;j++){
b[i][j]=a[j][i];
}}
for(i=0;i<m;i++){
System.out.println();
for(j=0;j<n;j++){
System.out.print(b[i][j] );}}
}}






