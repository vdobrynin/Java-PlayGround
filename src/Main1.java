import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main1 {
    public static void main(String[] args) {
        String fileName = "fish.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            Pattern pattern = Pattern.compile("\\bcod\\b", Pattern.CASE_INSENSITIVE);
            String line;
            int lineNumber = 1;
            while ((line = br.readLine()) != null) {
                Matcher matcher = pattern.matcher(line);
                if (matcher.find()) {
                    System.out.println("Match found at line " + lineNumber + ": " + line);
                }
                lineNumber++;
            }
        } catch (IOException e) {
            System.err.format("IOException occurred while reading '%s'.", fileName);
            System.err.println(e.getMessage());
        }
    }
}





