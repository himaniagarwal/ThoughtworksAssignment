import java.io.*;
public class primeFactor
{
    public static boolean is_prime(int x)
    {
	int count=0;
	for(int i=1;i<x;i++)
	{
		if(x%i==0)
		count++;
	}
	if(count==1)
	{
		return true;
	}
	else
	{
		return false;
	}
    }
    public static void generate(int number)
    {
        for(int i=2;i<number;i++)
	{
		if(is_prime(i)==true && number%i==0)
		{
			System.out.println(i);
		}
	}
    }
    

    public static void main(String args[]) throws IOException
    {
        int number;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	number=Integer.parseInt(br.readLine());
        generate(number);
	
    }
}
