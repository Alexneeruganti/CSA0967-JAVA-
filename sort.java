import java.util.Scanner;
public class sort{
public static void main(String[]args){
Scanner reader=new Scanner(System.in);
System.out.println("enter size of array:");
int n=reader.nextInt();
int[]a=new int[n];
int i,j,temp=0;
System.out.println("enter array elements:");
for(i=0;i<a.length;i++){
a[i]=reader.nextInt();
}
for(i=0;i<n-1;i++){
for(j=0;j<n-1-i;j++){
if(a[j]>a[j+1]){
temp=a[j];
a[j]=a[j+1];
a[j+1]=temp;}}}
System.out.println("sorted array is:");
for(i=0;i<n;i++){
System.out.println(a[i]+" ");
}}}