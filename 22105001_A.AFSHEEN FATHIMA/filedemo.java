import java.io.File;
import java.io.*;
class filedemo
{
public static void main(String[]args)
{
try{
File f=new File("cseaids.txt");
System.out.println(f.createNewFile());
System.out.println(f.getName());
}
catch(IOException aa)
}
}


