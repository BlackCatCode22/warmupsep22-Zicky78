import java.util.Scanner;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;

    public class WUSep20 {
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

            String filePath = "C:/Users/zacha/Cit-63/WU9-20/myFileWrite.txt"; //File path hardcoded for use elsewhere
            String[] textArr = new String[100]; //Array for holding the info
            File file = null; //Initialize the file obj so it can be used in the other scopes

            try {
                file = new File(filePath); //create file object
                if (file.createNewFile()) { //Check if file was successfully created
                    System.out.println("File created is: " + file.getName());
                }
                else {
                    System.out.println("File already exists! ");
                }
            } catch (IOException e) { //catch any errors
                System.out.println("Exception caught! ");
                e.printStackTrace();
            }
            // Write to the new file
            try {
                FileWriter writer = new FileWriter(filePath); //open the file for writing

                // #3: Write 100 lines to file
                for(int i = 0; i < 100; i++){
                    writer.write(i + "\n");
                }
                writer.close();

                // #4:

                Scanner myReader = new Scanner(file); //create scanner obj to read file

                for(int i = 0; i < 100; i++){ //read 100 lines
                    textArr[i] = myReader.nextLine(); //store each line in array
                }
                myReader.close();


                System.out.println("File write complete.");
            } catch (IOException e ){
                System.out.println("File IO exception caught!");
                e.printStackTrace();
            }

            for(int i = 0; i < 100; i++) { //print contents of array to make sure file read/write was successful
                System.out.println("Line " + i + ": " + textArr[i]);
            }
        }
    }
