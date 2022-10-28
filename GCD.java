package Methods;
import java.util.*;

public class GCD
{
    public static int gcdOfTwoNumbers(int first,int second){
        while(first!=second){
            if(first>second)
                first=first-second;
            else
                second=second-first;
        }
        return first;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int firstNumber=sc.nextInt();
        int secondNumber= sc.nextInt();
        System.out.println(gcdOfTwoNumbers(firstNumber,secondNumber));

    }
}
