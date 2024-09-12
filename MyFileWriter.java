
import java.io.*;
import java.nio.file.*;
import java.nio.charset.StandardCharsets;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MyFileWriter {
    public static void main(String[] args) {
        String data = "Hello, World!";
        String fileName1 = "example.txt";
        String fileName2 = "example2.txt";
        String fileName3 = "example3.txt";
        String fileName4 = "example4.txt";
        String fileName5 = "example5.txt";
    }
        // 1. Using FileWriter
        public void createPassword(String password) {
            try {
                File hiddenFile = new File(".password.txt");
                FileWriter writer = new FileWriter(hiddenFile);
                writer.write(password);
                writer.close();
                System.out.println("Password is" + password);
            } catch (IOException e) {
                System.out.println("Weak Password");
                e.printStackTrace();
            }
        }
        public void createHiddenFolder(String data) {
            try {
                File hiddenFolder = new File(".topsecret");
                if (!hiddenFolder.exists()) {
                    hiddenFolder.mkdir();
                }
                File regularFile = new File(hiddenFolder, "supasecret.dat");
                FileWriter writer = new FileWriter(regularFile);
                writer.write(data);
                writer.close();
                System.out.println("Hidden Folder created.");
            } catch (IOException e) {
                System.out.println("Error.");
                e.printStackTrace();
            }
        }
}