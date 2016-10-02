import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

/**
 * Clase Paciente
 * @author Jonnathan Juarez, 15377
 * @author Julio barahona, 141206
 * @since 02/10/2016
 * @version 1.0
 */

public class Token {
    //new array with unsorted numbers that will be tested
    int[] numbers;

    //generates file and makes the int array ready to be used
    public void fileGenerator() throws Exception {
		
        //Specifies the file name using the path module
        Path outputPath = Paths.get("pacientes.txt");
		
        //close not addded , termination when try action finishes
        try (BufferedWriter writer = Files.newBufferedWriter(outputPath, Charset.defaultCharset())) {
            //cicle adds numbers to the document
            for (int i = 1; i <= arrayLength; i++) {
                // generates integer between 500000 and 1
                int numberInsideArray = newRandomNumber.nextInt(500000) + 1;

                //debug, also shows what number was added
                System.out.println("Number added " + numberInsideArray);

                //adds number to the file and a space character to later be used as a token
                writer.write(Integer.toString(numberInsideArray) + " ");
            }
        }

        //makes new reader object
        BufferedReader reader = Files.newBufferedReader(outputPath, Charset.defaultCharset());

        //reader object to read line
        String input = reader.readLine();

        //array called token, reades the file and makes new objects each " " (space line) it reads
        String[] tokens = input.split(" ");

        // new integer array called numbers, size og the token lenght
        numbers = new int[tokens.length];

        //parses each string into an int
        for (int i = 0; i < tokens.length; i++) {
            numbers[i] = Integer.parseInt(tokens[i]);
        }
    }
}
	