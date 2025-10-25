import java.io.*;

public class FileCoping1 {
    public static void main(String[] args) {
        FileReader fr = null;
        FileWriter fw = null;

        try {
            fr = new FileReader("text.txt");
            fw = new FileWriter("textcopy.txt");

            int c;
            while ((c = fr.read()) != -1) {
                fw.write(c);
            }

            System.out.println("Файл успешно скопирован.");

        } catch (FileNotFoundException e) {
            System.out.println("Ошибка при открытии файла: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Ошибка при работе с файлом: " + e.getMessage());
        } finally {
            try {
                if (fr != null) fr.close();
                if (fw != null) fw.close();
            } catch (IOException e) {
                System.out.println("Ошибка при закрытии файла.");
            }
        }
    }
}

