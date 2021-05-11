package L17HW16;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

    public class RefactorMe{

       static List<Integer> list = new ArrayList<>();

        public static void main(String[] args) {

            Integer[] a = list.toArray(new Integer[list.size() + 10]);
            readFile();
            ArrayOfRandomNumbers(a);
            System.out.println();
            ArraySortAscending(a);

        }


        public static void readFile() {
            try {
                BufferedReader br = new BufferedReader(new FileReader("C:\\myFolder\\0_text3.txt"));
                String strLine = br.readLine();
                while (strLine != null) {
                    strLine = br.readLine();
                    if (strLine == null)
                        break;
                    list.add(Integer.valueOf(strLine));
                }
                System.out.println(Arrays.toString(list.toArray()));
                System.out.println();

            } catch (Exception e) {
                System.err.println("Unable to read the file.");

            }

        }

        public static void ArrayOfRandomNumbers (Integer[] a) {

            for (int myIndex = list.size(); myIndex < list.size() + 10; myIndex++) {
                a[myIndex] = (int) (Math.random() * 100);
            }
            for (int number=0; number<a.length-1; number++){
                System.out.print(a[number] + "_");
            }
        }


        public static void ArraySortAscending(Integer[] a){
            Arrays.stream(a).sorted().forEach(System.out::println);
        }


    }

