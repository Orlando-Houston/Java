package SubjectHeadings.TryCatch;
import java.util.Scanner;
import java.io.*;

public class Duplicate {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter file name: ");
        String fileName = keyboard.nextLine();
        if (fileName.equals("")) {
            System.out.println("Error: User did not specify a file name.");
        } else {
            Scanner inputStream = null;

            try {
                inputStream = new Scanner(new File(fileName));
            } catch (FileNotFoundException e) {
                System.out.println("Error: " + fileName + " does not exist.");
                System.exit(0);
            }

            String[] address = new String[100];

            int i = 0;
            while (inputStream.hasNextLine()) {
                String email = inputStream.nextLine();
                // System.out.println(email);

            }}}}
