import java.util.Scanner;
public class palindrome{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("enter the number");
int num = sc.nextInt();
int original = num;
int reverse = 0;
while(num > 0){
int digit = num % 10;
reverse = reverse * 10 + digit;
num = num / 10;
}
if(original == reverse){
System.out.println("the number is palindrome");
}
else{
System.out.println("the number is not palindrome");
}
sc.close();
}
} 
