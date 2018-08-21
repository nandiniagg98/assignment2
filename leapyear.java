import java.util.Scanner;
class LeapYear
{
public static void main(String args[])
{
int year;
System.out.println("enter any year");
Scanner sc= new Scanner(System.in);
year= sc.nextInt();
if(year%4==0&&year%100==||year%400==0)
{
System.out.println("this is a leap year");
}
else
{
System.out.println("is not a leap year");
}
}
}



