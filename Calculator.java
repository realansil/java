import java.util.Scanner;

class Calculator{
static int add(int a,int b)
{
return a+b;
}
static int sub(int a,int b)
{return a-b;}
static int multiply(int a, int b)
{return a*b;}
static float divide(float a, float b)
{return (float)a/b;}

public static void main(String args[]){

Scanner s = new Scanner(System.in);

System.out.println("enter first number");
int n1 = s.nextInt();
System.out.println("enter second number");
int n2 = s.nextInt();

System.out.println("Addition " + add(n1,n2));
System.out.println("Substraction " + sub(n1,n2));
System.out.println("Multiplication " + multiply(n1,n2));
System.out.println("Division " + divide(n1,n2));


s.close();
}

}
