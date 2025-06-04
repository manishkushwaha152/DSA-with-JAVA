import java.util.Scanner;
class Factorial{

    public static  int fact(int n){
        if(n==1)
         return 1;

        else 
          return n*fact(n-1);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Number:");
        int x=sc.nextInt();
        long y=fact(x);
        
        System.out.println("Factorial of Number is:"+y);
    }
}