import java.io.*;
import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter students data:");
        String fio = in.nextLine();
        try
        {
            addToFile(fio, "StudentsList.txt");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    static void addToFile(String data, String nameOfFile) throws Exception
    {
        File file = new File(nameOfFile);
        if(!file.exists())
        {
            file.createNewFile();
        }

        if(isInFile(data, file))
        {
            System.out.println("This student is already in file");
            return;
        }

        PrintWriter pw = new PrintWriter(new FileWriter(file, true));
        pw.println(data);
        pw.close();

    }

    static boolean isInFile(String data, File file) throws Exception
    {
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        while ((line = br.readLine()) != null)
        {
            if(line.equals(data))
            {
                return true;
            }
        }
        return false;
    }

}
