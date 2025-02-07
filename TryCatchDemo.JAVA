class TryCatchDemo
{
public static void main(String args[])
{
int a = 30, b = 3, c = 3, result1, result2;

try {
result1 = a / (b - c);
}
catch(ArithmeticException ae)
{
System.out.println("Divided by zero: "+ae);
}
result2 = a / (b + c);
System.out.println("Result2 = "+result2); }
}