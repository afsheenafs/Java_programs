import java.io.*;
class simpleCustomException extends Expection 
{
String mgs;
SimpleCustomException(String msg)
{
super(msg);
}
}
public class Main{
public static void main(String args[])
{
try{
throw new SimpleCustomException("user-defined exception demonstration")
}
catch(SimpleCustomException ex)
{
System.out.println(ex);
System.out.println(ex.getMessage());
}
}
}