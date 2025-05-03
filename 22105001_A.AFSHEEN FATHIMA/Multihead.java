import java.io.*;
class MultithreadingDemo extends Thread
{
public void run()
{
try{
System.out.println("Thread"+Thread.currentThread().getId()+"isrunning");
}
catch(Exception e)
{
System.out.printn("EXpection is caught");
}
}
}
public class Multihead{
public static void main(String args[])
{
int n=8;
for(int i=0;i<n;i++)
MultithreadingDemo object=new MultithreadingDemo();
object.start();
}
}
}