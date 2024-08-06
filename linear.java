import java.util.Scanner;
public class linear{
public static void main(String[] args) {
Scanner reader = new Scanner(System.in);
System.out.println("Enter the size of the array:");
int n = reader.nextInt();
int i=0;
boolean k = false;
int[] a = new int[n]; 
System.out.println("Enter the elements of the array:");
for (i = 0;i < n; i++) {
a[i] = reader.nextInt();} 
System.out.println("Enter the number to search:");
int b = reader.nextInt();
for ( i = 0; i < a.length; i++) {
if (a[i] == b) {
System.out.println("Element found at " + i);
k = true;
break;}}
if(!k){
System.out.println("Element not found");
}}
}
