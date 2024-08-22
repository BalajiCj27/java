import java.util.Scanner;
public class Scaner {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter Your name age ");
        System.out.println(input.nextLine()+"! You are "+input.nextFloat()+" years old");
     }   
}
