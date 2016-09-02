import java.io.*;

public class IsoscelesTriangle 
{
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
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int inputNumber=Integer.parseInt(br.readLine());
        for(int i=1;i<=inputNumber;i++)
        {
            int j=inputNumber-i;
            print_spaces(j);
            print_asterisk(2*i-1);
            System.out.println("");
        }
            
    }

    
}
