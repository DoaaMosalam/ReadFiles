package LessonFadK;
import java.io.*;

public class RadFileBynewFile {
    //This method read all folder found in path c.
    public static void fileOne() {
        final String path = "C:\\Windows\\System32";
        File dir = new File(path);
        if (dir.isDirectory()) {
            String[] file = dir.list();
            for (String s : file) {
                System.out.println(s);
            }
        }
    }

    //This method read file exe.
    public static void fileEXE() {
        File dir = new File("C:\\Windows\\System32");
        if (dir.isDirectory()) {
            String[] file = dir.list();
            for (int i = 0; i < file.length; i++) {
                if (file[i].endsWith("exe")) {
                    System.out.println(file[i]);
                }
            }
        }
    }

    // هذا اللميثود هيطبع اسماء الملفات وليس الامتداد الخاص بها
    public static void test() {
        File dir = new File("C:\\Windows\\System32");
        if (dir.isDirectory()) {
            String[] file = dir.list();
            String[] ss;
            for (int i = 0; i < file.length; i++) {
                ss = file[i].split(" \\.");
                if (ss.length > 1 && ss[0].length() < 4) {
                    System.out.println(file[i]);
                }
            }
        }
    }

    public static void listFile() {
        File dir = new File("C:\\Windows\\System32");
        File[] file = dir.listFiles();
        for (int i = 0; i < file.length; i++) {
            //    System.out.println(file[i]);
            System.out.println(file[i] + "-" + file[i].length());
        }
    }

    public static void exists() {
        File dir = new File("C:\\Windows\\System32");
        if (dir.exists()) {
            String[] file = dir.list();
            for (int i = 0; i < file.length; i++) {
                System.out.println(file[i]);
            }
            System.out.println("File name: " + dir.getName());
            System.out.println("Absolute path: " + dir.getAbsolutePath());
            System.out.println("Writeable: " + dir.canWrite());
            System.out.println("Readable " + dir.canRead());
            System.out.println("File size in bytes " + dir.length());
        } else {
            System.out.println("The file does not exist.");
        }
    }

    public static void inputStream(String fileName) {
        final String path = "D:\\Coders Programming\\Java\\Private Project\\File processing and IO test files\\Files\\"+fileName;
        File file = new File(path);
        try {
        //    FileOutputStream fileOutputStream = new FileOutputStream(path);
           BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(path));
       //     BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            int i ;
            String text = "Address,Elsalam 1";
//            byte[] b = text.getBytes();
            while ((i=bufferedInputStream.read())!=-1){
                System.out.print((char) i);
             //   bufferedOutputStream.write(b);
         //       System.out.println("Success");
            }

            bufferedInputStream.close();
        //    fileOutputStream.close();
        //    bufferedOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void outputStream(String fileName){
        final String path ="D:\\Coders Programming\\Java\\Private Project\\File processing and IO test files\\Files\\"+ fileName;
        File file = new File(path);
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
            String text = "Hello World...";
            byte[] b = text.getBytes();
            int i;
           while ((i = bufferedInputStream.read())!=-1) {
               System.out.print((char) i);
           }

            bufferedOutputStream.write(b);
           bufferedInputStream.close();
           bufferedOutputStream.close();
    } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

        public static void readFiles(){
     //   fileOne();
   //     fileEXE();
   //     test();
     //   listFile();
    //    exists();
    //    inputStream("info.csv");
            outputStream("textOutput.txt");
    }
}
