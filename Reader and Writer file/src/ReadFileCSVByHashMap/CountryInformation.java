package ReadFileCSVByHashMap;


import org.junit.jupiter.params.shadow.com.univocity.parsers.csv.CsvParser;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountryInformation {

    public static Map<String,List<Country>> showData(String fileName){
        final String path = "D:\\Coders Programming\\Java\\Private Project\\File processing and IO test files\\Files\\"+fileName;
        Map<String,List<Country>> mapCountry = new HashMap<>();
        String line;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            while ((line = reader.readLine())!=null) {
                String[] token = line.split(",");
                List<Country> list = new ArrayList<>();
                if (token.length>0){
                    Country country = new Country();
                    list.add(country);
                    mapCountry.put(line,list);
                }
            }
            System.out.println(mapCountry.get(fileName));
        } catch (FileNotFoundException e) {
            System.out.println("Error in file!!!");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (String x: mapCountry.keySet()) {
            System.out.println(x);
        }
        return mapCountry;
    }

    public static void display(){
      Map<String,List<Country>>  list = showData("idCountry.csv");
        System.out.println(list);

    }
}
