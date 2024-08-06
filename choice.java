import java.util.Scanner;
public class choice{
public static void main(String[] args){
Scanner reader=new Scanner(System.in);
System.out.println("size of array:");
int n=reader.nextInt();
int i,j;
int a[]=new int[n];
System.out.println("enter the elements:");
for(i=0;i<n;i++){
a[i]=reader.nextInt();
}
System.out.println("choice 1,2,3,4:");
int c=reader.nextInt();
if(c==1){
for(i=0;i<n-1;i++){
for(j=0;j<n-1-i;j++){
if(a[j]>a[j+1]){
int temp=a[j];
a[j]=a[j+1];
a[j+1]=temp;
}
}
}
for(i=0;i<n;i++){
System.out.print(","+a[i]);
}
}else if(c==2){
for(i=0;i<n-1;i++){
for(j=0;j<n-1-i;j++){
if(a[j]<a[j+1]){
int temp=a[j];
a[j]=a[j+1];
a[j+1]=temp;
}
}
}
for(i=0;i<n;i++){
System.out.print(","+a[i]);
}
}else if(c==3){
System.out.println("enter the search number");
int s=reader.nextInt();
for(i=0;i<n;i++){
if(a[i]==s){
System.out.println("number found");
}else{
System.out.println("number not found");
}
}
}else{
System.out.println("enter the search number");
int k=reader.nextInt();
int count=0;
int low=0,high=n-1;
int mid=(low+high)/2;
for(i=0;i<n-1;i++){
    for(j=0;j<n-1-i;j++){
        if(a[j]>a[j+1]){
            int temp=a[j];
            a[j]=a[j+1];
            a[j+1]=temp;
        }
    }
}
while(low<=high){
if(k==a[mid]){
count++;
break;
}else if(k<a[mid]){
high=mid-1;
}else{
low=mid+1;
}
mid=(low+high)/2;
}
if(count==0){
System.out.println("the element not found: ");
}else{
System.out.println("the element found: ");
}
}
}
}