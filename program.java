import mypack.calc;
import java.util.Scanner;
public class program{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter a:");
            int a=sc.nextInt();
            System.out.println("enter b:");
            int b=sc.nextInt();
            calc c=new calc();
            c.add(a, b);
            c.sub(a, b);
            c.mult(a, b);
            
        }


        
    }
}