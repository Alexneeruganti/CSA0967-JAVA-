import java.util.Scanner;
public class armstrong{
public static void main(String[]args){
Scanner reader=new Scanner(System.in);
System.out.println("enter any number:");
int n=reader.nextInt();
int n1=n,n2=n,d;
double k=0;
int count=0,i,rem=0;
while(n!=0){
rem=n%10;
count+=1;
n=n/10;
}
while(n1!=0){
d=n1%10;
 k=k + Math.pow(d,count);
n1=n1/10;
}
if(n2==k){
System.out.println("Armstrong");}
else{
System.out.println("not Armstrong");
}
}
}



