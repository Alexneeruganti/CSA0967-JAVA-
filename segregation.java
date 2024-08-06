import java.util.Scanner;
public class segregate {
public static void main(String[] args) {
Scanner reader=new Scanner(System.in);
System.out.println("enter size of array:");
int n=reader.nextInt();
int []a=new int[n];
System.out.println("eneter elements:");
for(i=0;i<a.length();i++){
a[i]=reader.nextInt();
int count = 0;
for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                count++;
            }
        }
for (int i = 0; i < count; i++) {
            a[i] = 0;
        }
        
        for (int i = count; i < a.length; i++) {
            a[i] = 1;
        }

        System.out.println("Array after segregation:");
        for (int i :a) {
            System.out.print(i + " ");
        }
    }
}
                
        
        for (int i = 0; i < count; i++) {
            a[i] = 0;
        }
        
        for (int i = count; i < a.length; i++) {
            a[i] = 1;
        }

        System.out.println("Array after segregation:");
        for (int i :a) {
            System.out.print(i + " ");
        }
    }
}
