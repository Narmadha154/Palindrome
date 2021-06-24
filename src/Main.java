import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
	int a,sum=0,temp;
	int n;
        System.out.println("enter the number:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        temp=n;
        while(n>0){
          a=n%10;
          n=n/10;
          sum=(sum*10)+a;
        }
        if(temp==sum){
            System.out.println("given number is palindrome");
        }
        else{
            System.out.println("given number is not palindrome");
        }
    }
}
