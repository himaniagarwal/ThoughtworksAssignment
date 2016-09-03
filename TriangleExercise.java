import java.io.*;
public class TriangleExercise{
public static void main(String[] args) throws IOException
{
	System.out.println("Choose 1.PrintHorizontalLine 2.VerticalLine 3.RightTriangle");
	BufferedReader is=new BufferedReader(new InputStreamReader(System.in));
	int inputChoice=Integer.parseInt(is.readLine());

	if(inputChoice==1)
	{
        System.out.println("Input a number");
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int inputNumber=Integer.parseInt(br.readLine());
	horizontalLine(inputNumber);
	}
	else if(inputChoice==2)
	{
        System.out.println("Input a number");
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int inputNumber=Integer.parseInt(br.readLine());
	verticalLine(inputNumber);
	}
	else if(inputChoice==3)
	{
        System.out.println("Input a number");
	BufferedReader br=new BufferedReader(new 	InputStreamReader(System.in));
	int inputNumber=Integer.parseInt(br.readLine());
	rightTriangle(inputNumber);
	}
	else
	{
	System.out.println("*");
	}
}	
public static void horizontalLine(int inputNumber)
{
       while(inputNumber!=0)
        {
	System.out.print("*");
	inputNumber--;
        }
}
public static void verticalLine(int inputNumber)
{
        while(inputNumber!=0)
        {
	System.out.println("*");
	inputNumber--;
        }
}
public static void rightTriangle(int inputNumber)
{
        for(int i=1;i<=inputNumber;i++)
        {
            int j=i;
            while(j!=0)
            {
		System.out.print("*");
		j--;
            }
            System.out.println("");
        }
}
}			//end of class
