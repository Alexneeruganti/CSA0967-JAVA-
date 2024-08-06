import java.util.Scanner;
public class prime{
public static void main(String[]args){
Scanner reader=new Scanner(System.in);
System.out.println("enter no of terms:");
int n=reader.nextInt();
printNPrimes(n);}
public static void printNPrimes(int n){
int count=0;
int num=2;
while(count<=n){
if(isPrime(num)){
System.out.print(+num+" ");
count++;}
num++;
}
}
public static boolean isPrime(int num){
if(num<=1){
return false;}
for (int i=2;i<num;i++){
if(num%i==0){
return false;}
}
return true;}
}