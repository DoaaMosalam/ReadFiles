package Collage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class StudentInformation {
    public static List<Student> printArray(List<Student> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + " :" + list.get(i));
        }
        return list;
    }

    public static List<Student> readData(String fileName) {
        List<Student> list = new ArrayList<>();
        final String path = "D:\\Coders Programming\\Java\\Private Project\\File processing and IO test files\\Files\\" + fileName;
        String line = "";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            while ((line = reader.readLine()) != null) {
                String[] spiece = line.split(",");
                if (spiece.length > 0) {
                    Student student = CreatStudent(spiece);
                    list.add(student);
                }
            }
        } catch (Exception e) {
            System.out.println("Error in csv file!!!");
            e.printStackTrace();
        }
        return printArray(list);
    }

    private static Student CreatStudent(String[] spiece) {
        String theName = spiece[0];
        String theDepartment = spiece[1];
        double theSecience = Double.parseDouble(spiece[2]);
        double theInfo = Double.parseDouble(spiece[3]);
        double theAnalasizy = Double.parseDouble(spiece[4]);
        return new Student(theName, theDepartment, theSecience, theInfo, theAnalasizy);
    }

    public static Student largestdegree(List<Student> list) {
        double max =0.0;
        int index =-1;
        int largest =0;
        for (Student s:list) {
            index++;
            if (s.getComputerScience() > max){
                max = s.getComputerScience();
                largest = index;
            }
        }
        System.out.println("Largest great is: " + max + " Found in index: " + index);
        return list.get(largest);
    }

    public static List<Student> addStudent(List<Student>list){
        ListIterator<Student> listIterator = list.listIterator();
        while (listIterator.hasNext()){
            Student student = listIterator.next();
            if (!student.getName().equalsIgnoreCase("Doaa")){
                list.add(new Student("Doaa Mosalam","C3",90.9,80.6,79.3));
                list.add(new Student("Youssef Abdallab","D3",45.6,24.8,97.1));
                break;
            }
        }
        for (Student s:list) {
            System.out.println(s);
        }
        return list;
    }

    public static void showInfo(){
        List<Student> readinfo = readData("cubes.csv");
        System.out.println("==========================================");
        System.out.println(largestdegree(readinfo));
        System.out.println("==========================================");
        System.out.println(addStudent(readinfo));
    }
}
