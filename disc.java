import java.util.Scanner;
public class disc{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter qty");
            int n=sc.nextInt();
            int percost=100;
            double dis=0.1;
            double cost=percost*n;
            double amt=dis * cost;
            
            if(n>1000){
                cost-=amt;
                System.out.println("got a disc" +cost);
            }
            else{
                System.out.println("no disc"+cost);
            }
        }
        
    }
}