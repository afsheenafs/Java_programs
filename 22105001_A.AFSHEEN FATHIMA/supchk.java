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
class C extends B
{
C()
{
System.out.println("inside C");
}
}
class supchk
{
public static void main(String a[])
{
C c=new C();
}
}
