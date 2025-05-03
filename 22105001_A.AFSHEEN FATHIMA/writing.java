import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class writing{
public static void main(String[]args)
{
try{
FileWriter Writer=new FileWriter("myfile.txt");
Writer.write("Files in java are seriously good!!");
Writer.close();
System.out.println("Successfully written.");
}
catch(IOException e){
System.out.println("An error has occured.");
}}}