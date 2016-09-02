import java.io.*;
public class DiamondWithName
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
}
