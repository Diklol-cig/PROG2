import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.management.ValueExp;

public class FileUtils
{
    // input: a megnyitandó file neve
    // output: egy List<String> objektum, ami az egyes sorokat tartalmazza
    public static List<String> readLines(String fileName)
    {
        List<String> lines = new ArrayList<String>();

        try
        {
            String line;
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            while ((line = br.readLine()) != null)
            {
                lines.add(line);
            }
            br.close();
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
            System.exit(1);
        }
        catch (IOException e)
        {
            e.printStackTrace();
            System.exit(2);
        }

        return lines;
    }

    public static String readFirstLine(String fname){
        return readLines(fname).get(0);
    }

    public static List<Integer> readFirstLineAsListOfDigits(String fname){
        String first = readFirstLine(fname);
        List<Integer> result = new ArrayList<Integer>();

        for (char c : first.toCharArray()){
            result.add(Character.getNumericValue(c));
        }
        return result;
    }
}