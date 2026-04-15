import java.util.Scanner;
class calculator
{
public static void main(String[]args)
String yn;
do
{
Scanner sc=new Scanner(System.in);
System.out.println("first no is");
int num1=sc.nextInt();
System.out.println("second no is");
int num2=sc.nextInt();
System.out.println("symbol is( +-*/)");
String ch=sc.next();
int r;
switch(ch)
{
case "+":r=num1+num2;
System.out.println("sum is"+r);
break;
case "-":r=num1-num2;
System.out.println("sub is"+r);
break;
case "*":r=num1*num2;
System.out.println("mul is"+r);
break;
case "/":r=num1/num2;
System.out.println("divsion is"+r);
break;
default:System.out.println("no sum");
break;
}
System.out.println("if u are continue the loop pressy and n for no");
String yn=sc.next();
}

while(yn.equals("Y")||yn.equals("y"));
}
}
