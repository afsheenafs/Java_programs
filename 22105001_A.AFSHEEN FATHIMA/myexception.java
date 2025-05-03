import java.io.*;
import java.util.*;
class cseaids extends Exception
{
String msg;
cseaids(String mgs)
{
super(msg);
}
}
class myexception
{
public static  void main(String args[])
{
Scanner ss=new Scanner(System.in);
int cgpa=ss.nextInt();
if(cgpa>=75)
System.out.println("admitted for 2nd yr");
else{
//throw new cseaids("complete your first year");
cseaids cs=new cseaids("complete your first year");
throw cs;
}
}
}
catch(cseaids exception)
{
System.out.println(exception);
System.out.println(exception.getMessage());
}
}
}