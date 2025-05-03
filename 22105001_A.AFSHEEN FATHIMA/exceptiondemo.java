import java.io.*;
import java.util.*;
class exceptiondemo
{
public static void main(String aa[])
{
int a,b;
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
int c;
int d[]={1,2,3,4,5};
try
{
c=a/b;
System.out.println(c);
System.out.println(d[6]);
}
catch( Arithmetic exception e)
{
System.out.println("e");
System.out.println("give a non zero number friend!!!");
}
/*catch(ArrayIndexOutOfBoundsException ee)
{
System.out.println("dear friend dont go out of bound!!!");
System.out.println(ee);
}*/
finally
{
System.out.println("Exceptions handled successfully);
}
catch(ArithmeticExceptionArrayIndexOutOfBounds e)
{
System.out.println(e);
}