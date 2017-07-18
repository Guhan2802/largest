import java.util.*;
{
class largest
{
public static void main(String args[])
{
Scanner s=Scanner(System in);
int a=s.nextInt();
int b=s.nextInt();
int c=s.nextInt();
if(a>b>c)
System.out.print(a);
else if(b>a>c)
System.out.print(b);
else
System.out.print(c);
}
}
