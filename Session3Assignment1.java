
import java.util.Scanner;

 class CalculateSqrt
{
	public double CalcSqrt(double i)
	{
		return Math.sqrt(i);
	}
}

class CalculateCube
{
	public double CalcCube(double i)
	{
		return Math.cbrt(i);
	}
}

public class Session3Assignment1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		double  iNumber=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter an Integer Number");
		iNumber=sc.nextDouble();
		sc.close();
		CalculateSqrt cs= new CalculateSqrt();
		System.out.println("Square root of "+ iNumber +" is :->"+cs.CalcSqrt(iNumber));
		CalculateCube cc=new CalculateCube();
		System.out.println("Cube root of "+ iNumber +" is :->"+cc.CalcCube(iNumber));
	}

}

