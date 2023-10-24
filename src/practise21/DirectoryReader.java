package practise21;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class DirectoryReader {
    public static List<String> readDirectory(String path) {
        List<String> fileList = new ArrayList<>();
        File directory = new File(path);

        if (directory.isDirectory()) {
            File[] files = directory.listFiles();
            if (files != null) {
                for (int i = 0; i < Math.min(5, files.length); i++) {
                    fileList.add(files[i].getName());
                }
            }
        }
        return fileList;
    }

    public static void main(String[] args) {
        String directoryPath = "src/practise9";
        List<String> filesInDirectory = readDirectory(directoryPath);

        if (!filesInDirectory.isEmpty()) {
            for (String fileName : filesInDirectory) {
                System.out.println(fileName);
            }
        } else {
            System.out.println("Каталог пуст!");
        }
    }
}
