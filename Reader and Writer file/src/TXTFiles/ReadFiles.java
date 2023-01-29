package TXTFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFiles {


    public static void readTxtfile(String fileName){
        try {
            Scanner input = new Scanner(new File("D:\\Coders Programming\\Java\\Private Project\\File processing and IO test files\\Files"+fileName));
            String line ="";
           while (true){
               line = input.nextLine();
               System.out.println(line);
           }
        }catch (Exception e){
            e.getMessage();
        }
    }

    public static void readData(){
        readTxtfile("cubes.txt");

    }

}
