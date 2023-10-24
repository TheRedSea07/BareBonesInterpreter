import java.io.File;
import java.io.FileReader;

public class BareBonesInterpreter {

    public static void readFromFile() {

        //TODO:
        //Read file char by char (incl. EOF char)
        try {
            File fileName = new File("./src/test.txt");
            FileReader fileReader = new FileReader(fileName);
            System.out.println("Hello, World!");
            fileReader.close();
        }
        catch (Exception e) {
            System.out.println("File is not found");
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
        readFromFile();
    }
}
