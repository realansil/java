import java.util.Scanner;

public class prim{


public static void main(String args[])
{

Scanner sc = new Scanner(System.in);

System.out.println("Enter an integer");
int num = sc.nextInt();

System.out.println("Enter an double value");
double db = sc.nextDouble();

System.out.println("Enter an char value");
char ch = sc.next().charAt(0);



double num2 = num;

int db2 = (int)db;

System.out.println("\n Primitive datatypes");
System.out.println("integer value = " + num );
System.out.println("Double value = " + db);
System.out.println("char value = " + ch);
System.out.println("\nTypeCasted values");
System.out.println("widened value = " + num2);
System.out.println("narrowed value = " + db2);
}
}
