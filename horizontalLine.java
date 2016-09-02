import java.io.*;
public class HorizontalLine{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int inputNumber=Integer.parseInt(br.readLine());
        inputNumber=5;
        while(inputNumber!=0)
        {
            System.out.print("*");
            inputNumber--;
        }

    }
}