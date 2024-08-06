import java.util.Scanner;
public class vowelcount{
public static void main(String[] args){
Scanner reader=new Scanner(System.in);
String ch=reader.nextLine();
int n=ch.length();
String vo="AEIOUaeiou";
int m=vo.length();
int vow=0,con=0;
for(int i=0;i<n;i++){
int count=0;
for(int j=0;j<m;j++){
if(ch.charAt(i)==vo.charAt(j)){
vow++;
count++;
break;
}
}
if(count==0){
con++;
}
}
System.out.println("no of vowels: "+vow);
System.out.println("no of consonents: "+con);
}
}