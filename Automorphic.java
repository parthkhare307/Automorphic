import java.util.*;
class Automorphic 
{
public static void main(String args[])
{
int n,sqr,d,d1,k=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Number");
n=sc.nextInt();
sqr=n*n;
for(int i=n;i>0;i=i/10)
{
d=i%10;
d1=sqr%10;
if(d!=d1)
{
k=1;
break;
}
sqr=sqr/10;
}
if (k==0)
{
System.out.println("Automorphic Number");
}
else{
System.out.println("Not a Automorphic Number");
}
}
}