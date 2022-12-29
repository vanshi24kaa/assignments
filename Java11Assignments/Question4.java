package Java11Assignments;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Question4 {
    public static void main(String[] args)
    {
        var path="C:\\Users\\ritbiswa\\rittima\\StudentList.txt";

        try
        {
            String data = Files.readString(Path.of(path));
            System.out.println(data);
            long numberoflines=data.lines().count();
            System.out.println(numberoflines) ;

        }catch(IOException e)
        {
            e.printStackTrace();
        }
    }

}
