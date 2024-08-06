import java.util.Scanner;
public class matrixmul{
public static void main(String[]args){
Scanner reader=new Scanner(System.in);
int i,j,k;
System.out.println("enter no of rows of  matrix:");
int m=reader.nextInt();
System.out.println("enter no of columns of  matrix:");
int n=reader.nextInt();
int a[][]=new int[m][n];
int b[][]=new int[m][n];
int c[][]=new int[m][n];
System.out.println("enter elements in 1st matrix:");
for(i=0;i<m;i++){
for(j=0;j<n;j++){
a[i][j]=reader.nextInt();}}
System.out.println("enter elements in 2nd matrix:");
for(i=0;i<m;i++){
for(j=0;j<n;j++){
b[i][j]=reader.nextInt();}}

for(i=0;i<m;i++){
for(j=0;j<n;j++){
for(k=0;k<n;k++){
c[i][j]+=a[i][k]*b[k][j];}}}
System.out.println("result:");
for(i=0;i<m;i++){
System.out.println("");
for(j=0;j<n;j++){
System.out.print(c[i][j]+" ");}}
}
}

