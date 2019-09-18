package SubjectHeadings.Arrays.CommonArray;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ExceptionFuture {
    public static void main(String[] args) {

            String str = "Bunu dosyaya yazdir";
            File file = new File("dosya.txt");
            FileWriter fileWriter = null;

            try {
                fileWriter = new FileWriter(file, false);
                fileWriter.write(str);
            }
            catch (IOException dosyaHatasi) {
                dosyaHatasi.printStackTrace();
            }
            finally {
                try {
                    if (fileWriter != null)
                        fileWriter.close();
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }



