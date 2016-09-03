import java.io.*;
public class DiamondExercise{
public static void main(String[] args) throws IOException
{
	System.out.println("Choose 1.Isosceles Triangle 2.Diamond 3.DiamondWithName");
	BufferedReader is=new BufferedReader(new InputStreamReader(System.in));
	int inputChoice=Integer.parseInt(is.readLine());

	if(inputChoice==1)
	{
        System.out.println("Input a number");
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int inputNumber=Integer.parseInt(br.readLine());
	IsoscelesTriangle(inputNumber);
	}
	else if(inputChoice==2)
	{
        System.out.println("Input a number");
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int inputNumber=Integer.parseInt(br.readLine());
	Diamond(inputNumber);
	}
	else if(inputChoice==3)
	{
        System.out.println("Input a number");
	BufferedReader br=new BufferedReader(new 	InputStreamReader(System.in));
	int inputNumber=Integer.parseInt(br.readLine());
	DiamondWithName(inputNumber);
	}
	else
	{
	System.out.println("Sorry Try Again");
	}
}	//end of psvm
public static void IsoscelesTriangle(int inputNumber)
{
for(int i=1;i<=inputNumber;i++)
       {
	int j=inputNumber-i;
	print_spaces(j);
	print_asterisk(2*i-1);
	System.out.println("");
        }
}
public static void Diamond(int inputNumber)
{
        for(int i=1;i<=inputNumber;i++)
        {
	int j=inputNumber-i;
	print_spaces(j);
	print_asterisk(2*i-1);
	System.out.println("");
}
for(int i=inputNumber-1;i>0;i--)
{
	int j=2*i-1;//asterisk
	int k=inputNumber-i;//spaces
	print_spaces(k);
	print_asterisk(j);
	System.out.println("");
}

}
public static void DiamondWithName(int inputNumber) throws IOException
{
        System.out.println("Input a name");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String name=br.readLine();
        for(int i=1;i<=inputNumber-1;i++)
        {
	int j=inputNumber-i;
	print_spaces(j);
	print_asterisk(2*i-1);
	System.out.println("");
        }
        System.out.println(name);
        for(int i=inputNumber-1;i>0;i--)
        {
	int j=2*i-1;//asterisk
	int k=inputNumber-i;//spaces
	print_spaces(k);
	print_asterisk(j);
	System.out.println("");
        }
}
    public static void print_asterisk(int n)
    {
	while(n!=0)
	{
		System.out.print("*");
		n--;
	}
    }
    public static void print_spaces(int n)
    {  
	while(n!=0)
	{
		System.out.print(" ");
		n--;
	}
    }
}			//end of class