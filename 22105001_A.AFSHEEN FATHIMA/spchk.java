import java.io.*;
class A{
A()
{
System.out.println("inside A");
}
}
class B extends A
{
B()
{
System.out.println("inside B");
}
}
class supchk
{
public static void main(String a[])
{
B b=new B();
}
}
