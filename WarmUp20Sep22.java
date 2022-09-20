import java.io.FileWriter;
        import java.util.Scanner;
        import java.io.File;
        import java.io.IOException;
public class WarmUp20Sep22 {
    public static void main(String[] args) {
        // References:
        // https://www.w3schools.com/java/java_files_create.asp
        // Instructions:
        // 1) Discuss this code with your lab partner
        //     a) what does it do?
        //     b) where does it do it?
        //     c) how are file and path names used?
        //     d) what is try and catch?
        // 2) Code up this warmup and examine your new files
        // 3) Advanced: Create a loop to write 100 lines of text to your new file
        // 4) Advanced: Open a text file and read the contents into a linear array.
        // Create a file.
        try {
            File file = new File("C:/javaStuff/myNewTextFile.txt");
            if (file.createNewFile()) {
                System.out.println("File created is: " + file.getName());
            }
            else {
                System.out.println("File already exists! ");
            }
        } catch (IOException e) {
            System.out.println("Exception caught! ");
            e.printStackTrace();
        }
        // Write to the new file
        try {
            FileWriter writer = new FileWriter("C:/javaStuff/myFileWrite.txt");
            writer.write("This is line one written to myFileWrite.txt!\n");
            writer.close();
            System.out.println("File write complete.");
        } catch (IOException e ){
            System.out.println("File IO exception caught!");
            e.printStackTrace();
        }
    }
}