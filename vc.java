import java.util.Scanner;
public class vc{
public static void main(String[]args){
Scanner reader=new Scanner(System.in);
int count=0,i;
System.out.println("enter the character:");
char a=reader.next().charAt(0);
String b="AEIOUaeiou";
for(i=0;i<b.length();i++){
if(b.charAt(i)==a){
count=1;}
}
if(count==1){
System.out.println("vowel");
}
else{
System.out.println("consonants");}
}}