import java.io.*;
public class Explicitexception
{
void checkAge(int age)
{
if(age<18)
{
throw new ArithmeticException("Access denied-You must be atleast 18 years old.");
}
else
{
System.out.println("Access granted-You are old enough!");
}}
public static void main(String[]args)
{
int checkAge(15);
}
}