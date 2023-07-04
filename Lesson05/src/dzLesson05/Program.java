package dzLesson05;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class Program {
    public static void main(String[] args) {


        CopyFile a = new CopyFile();
        a.copyFile(new File("."), "", true);

        byte[] bytes = {0, 1, 2, 3, 0, 1, 2, 3, 0};
        List<StringBuilder> strBild = new ArrayList();
        strBild.add(new StringBuilder());
        int count = 0;
        int[] num = new int[3];
        for (int i = 0; i < bytes.length; i+=3) {
            strBild.add(new StringBuilder());
            strBild.get(count).append(Integer.toString(bytes[i], 2));
            strBild.get(count).append(Integer.toString(bytes[i+1], 2));
            strBild.get(count).append(Integer.toString(bytes[i+2], 2));
            num[count] = Integer.parseInt(strBild.get(count).toString(), 2);
            System.out.println(strBild.get(count).toString() + "  " + num[count]);
            count++;
        }


        File file = new File("src/dzLesson05/saveFile/file.txt");
        try (FileOutputStream file1 = new FileOutputStream("src/dzLesson05/saveFile/file.txt", false)) {
            for(int i = 0; i < num.length; i++){
                file1.write((Integer.toString(num[i])).getBytes());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try (BufferedReader file2 = new BufferedReader(new FileReader("src/dzLesson05/saveFile/file.txt"))) {
            String line = file2.readLine();

            while (line != null) {
                char[] chArray = line.toCharArray();
                for (int i = 0; i < chArray.length; i++) {
                    System.out.println(Integer.valueOf(chArray[i]) + "  " + chArray[i]);
                }

                line = file2.readLine();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

