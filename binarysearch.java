import java.util.Scanner;
public class binarysearch{
public static void main(String[]args){
Scanner reader=new Scanner(System.in);
int i,l;
System.out.println("enter size of array:");
int n=reader.nextInt();
int []a=new int[n];
System.out.println("enter elements in ascending order of array:");
for(i=0;i<n;i++){
a[i]=reader.nextInt();}
System.out.println("enter element to search:");
int k=reader.nextInt();
int x=0,y=n-1;
boolean found=false;
while(x<=y){
 l=(x+y)/2;
if(a[l]==k){
System.out.println("element found at index "+(l-1));
found=true;
break;}
else if(k>a[l]){
x=l+1;
}
else{
y=l-1;}}
if(!found){
System.out.println("element not exist");
} reader.close();
}}


