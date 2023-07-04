package dzLesson05;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CopyFile {

    public void copyFile(File file, String indent, boolean isLast) {
        System.out.print(indent);
        if (isLast) {
            System.out.print("╘");
        } else {
            System.out.print("╠");
            indent += "║  ";
        }
        System.out.println(file.getName());

        File[] files = file.listFiles();
        if (file == null) {
            return;
        }

        int subDirTotal = 0;
        for (int i = 0; i < files.length; i++) {
            if (files[i].isDirectory()) {
                if (files[i].getName().equals("saveFile") && !files[i].getParent().equals(".\\out\\production\\Lesson05\\dzLesson05")) {
                    try {
                        Files.walk(Paths.get(files[i].getAbsolutePath()))
                                .filter(Files::isRegularFile)
                                .forEach(System.out::println);
                        File[] files2 = files[i].listFiles();
                        for (int j = 0; j < files2.length; j++) {
                            File dest = new File(".\\src\\dzLesson05\\backup\\" + files2[j].getName());
                            copyFileUsingStream(files2[j], dest);
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                subDirTotal++;
            }
        }

        int subDirCounter = 0;
        for (int i = 0; i < files.length; i++) {
            if (files[i].isDirectory()) {
                copyFile(files[i], indent, subDirCounter == subDirTotal - 1);
                subDirCounter++;
            }
        }
    }

    private void copyFileUsingStream(File source, File dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } finally {
            is.close();
            os.close();
        }
    }

}
