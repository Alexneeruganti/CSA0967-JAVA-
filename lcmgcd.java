import java.util.Scanner;
public class lcmgcd{
public static void main(String[]args){
Scanner reader=new Scanner(System.in);
System.out.println("enter 1st num:");
int a=reader.nextInt();
System.out.println("enter 2nd num:");
int b=reader.nextInt();
int g=gcd(a,b);
int l=lcm(a,b,g);
 System.out.println("GCD: " + g);
        System.out.println("LCM: " + l);}

public static int gcd(int a,int b){
if(b==0){
return a;}
else{
return gcd(b,a%b);
}
}
public static int lcm(int a,int b,int gcd){
 return (a*b)/gcd;
}

}