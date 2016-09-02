import java.io.*;
public class VerticalLine
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int inputNumber=Integer.parseInt(br.readLine());
        while(inputNumber!=0)
        {
            System.out.println("*");
            inputNumber--;
        }

    }
}
