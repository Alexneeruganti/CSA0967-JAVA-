import java.util.Scanner;
public class palindrome st{
public static void main(String[]args){
Scanner reader=new Scanner(System.in);
System.out.println("enter string:);
String x=reader.nextLine();
string a=x;
String b=" ";
int k=a.length();
while(i!=k){
char r=a%10;
b=b+r;
a=a/10;}
if(r==a){
System.out.println("palindrome");
}
else{
System.out.println("not palindrome");}}