import java.io.*;
class Employee
{
int id;
String name;
String dept;
double salary;
long contact;
double per_day_salary;
int working_days;


public void add_info(int i,String nam,String dpt,long phone,double day_salary,int total_days)
{
id=i;
name=nam;
dept=dpt;
contact=phone;
per_day_salary=day_salary;
working_days=total_days;
salary=per_day_salary*working_days;


}

public void display()
{
System.out.println(id);
System.out.println(name);
System.out.println(dept);
System.out.println(contact);
System.out.println(per_day_salary);
System.out.println(working_days);
System.out.println(salary);
}
}

public class eg
{
public static void main(String[]args)
{
Employee e1=new Employee();
e1.add_info(101,"afsheen","acc",987654321,200,30);
e1.display();
Employee e2=new Employee();
e2.add_info(102,"nishalini","accdfw",988654321,250,25);
e2.display();
}
}

