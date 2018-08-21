import java.util.Scanner;
class Palindrome
{
public static void main(String args[])
{
int n,temp,rem,r=0;
Scanner sc=new Scanner(System.in);
n= sc.nextInt();
temp=n;
while(n>0)
{
rem=n%10;
r=r*10+rem;
n=n/10;
}
if(temp==r)
{
System.out.println("no is palindrome");
}
else
{
System.out.println("no is not palindrome");
}
}
}