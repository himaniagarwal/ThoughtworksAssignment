import java.io.*;
public class RightTriangle
{
public static void main(String args[]) throws IOException
    {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int inputNumber=Integer.parseInt(br.readLine());
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
}