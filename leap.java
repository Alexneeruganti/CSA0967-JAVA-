import java.util.Scanner;
public class leap{
    public static void main(String[] args) {
     Scanner reader=new Scanner(System.in);   
        System.out.println("enter year");
        int n=reader.nextInt();
        if(n%4==0){
            if(n%100==0){
            System.out.println("leap year");
                
            }
        }
        else if(n%400==0){
            System.out.println("leap year");
        }
        else{
        System.out.println("not leap year");}
    }
}