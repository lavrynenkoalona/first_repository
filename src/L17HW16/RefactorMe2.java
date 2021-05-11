package L17HW16;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RefactorMe2{

    public static void main(String[] args) {
        //Read data from file
        File fileName = new File("example.txt");
        List<Integer> list = extractListFromFile(fileName);
        System.out.println(list);

        //Add random numbers in list
        list.addAll(generateRandomList(10));
        list.forEach(i -> System.out.print(i + "_"));
        System.out.println();

        //Print sorted list
        list.stream().sorted().forEach(i -> System.out.print(i + " "));
    }

    private static List<Integer> generateRandomList(int size) {
        Random r = new Random();
        return IntStream.generate(() -> r.nextInt(100))
                .limit(size)
                .boxed()
                .collect(Collectors.toList());
    }

    private static List<Integer> extractListFromFile(File file) {
        List<Integer> result = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(file))){
            String strLine = br.readLine();
            while (strLine != null) {
                result.add(Integer.valueOf(strLine));
                strLine = br.readLine();
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (Exception e) {
            System.err.println("Exception: " + e.getMessage());
        }
        return result;
    }
}