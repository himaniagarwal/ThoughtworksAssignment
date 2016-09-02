import java.io.*;
public class FizzBuzz
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int inputNumber=Integer.parseInt(br.readLine());
        for(int i=1;i<=inputNumber;i++)
        {
            if(i%3==0 && i%5==0)
            {
		System.out.println("FizzBuzz");
            }
            else if(i%3==0)
            {
		System.out.println("Fizz");
            }
            else if(i%5==0)
            {
		System.out.println("Buzz");
            }
            else
            {
		System.out.println(i);
            }
        }
    }
}
