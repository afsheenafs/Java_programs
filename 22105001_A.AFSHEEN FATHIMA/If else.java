import java.io.*;
class If else
{
public static void main(String args[])
{
int marks;
Scanner marks=new Scanner(System.in);
if(marks>=80)
{
System.out.println("Grade A");
}
else if((marks>=70)&&(marks<=79))
{
System.out.println("Grade B");
}
else if((marks>=60)&&(marks<=69))
{
System.out.println("Grade C");
}
else if((marks>=50)&&(marks<=59))
{
System.out.println("Grade D");
}
else
{
System.out.println("Fail");
}
}
}