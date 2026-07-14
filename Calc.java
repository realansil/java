import java.util.Scanner;

class Calculator{

int add(int a, int b)
{return a+b;}
int sub(int a, int b)
{return a-b;}
int multiply(int a, int b)
{return a*b;}
double divide(double a, double b)
{
if ( b==0){
System.out.println("Division by zero is not allowed");
return 0;
}
else{
return 
(double)a/b;}
}
}
class Calc{
public static void main(String args[]) {

Scanner s = new Scanner(System.in);

System.out.println("Enter first number");
int n1 = s.nextInt();
System.out.println("Enter second number");
int n2 = s.nextInt();

Calculator c = new Calculator();

System.out.println("addition " + c.add(n1, n2));
System.out.println("Subtraction "+ c.sub(n1, n2));
System.out.println("multiplication " +  c.multiply(n1, n2));
System.out.println("division " + c.divide(n1, n2));
s.close();

}
}

