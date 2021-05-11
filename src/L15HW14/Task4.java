package L15HW14;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;

import static HW6.Task5.removeCharAt;

public class Task4 {
    //Create program which shuffle 10 files in folder (files receive new order in folder).
    // After every run of program files are shuffled in new order.
    // Length of file names is constant

    public static void main(String[] args) {

        File dir = new File("c:/myFolder");
        File[] listFiles = dir.listFiles();
        int filesCount = listFiles.length;
        //Collections.shuffle(Arrays.asList(listFiles));

        for (int i = 0; i < filesCount; i++)
        {
            File file = listFiles[i];
            String newFileName = i + file.getName().substring(1);
            file.renameTo(new File(file.getParent() + "/" + newFileName));
        }
    }

}

