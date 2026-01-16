import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main2 {
    public static void main(String[] args) {
        String fileName = "fish2.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            Pattern pattern_cod = Pattern.compile("cod", Pattern.CASE_INSENSITIVE);
            Pattern pattern_3d_column = Pattern.compile("^\\s*\\w+\\s+\\w+\\s+(\\w+)\\s*.*$", Pattern.CASE_INSENSITIVE);
            String line;
            int lineNumber = 1;
            while ((line = br.readLine()) != null) {
                Matcher matcher = pattern_3d_column.matcher(line);
                if (matcher.matches()) {
                    String thirdColumn = matcher.group(1); // Get the captured group
                    System.out.println("thirdColumn="+thirdColumn);
                    Matcher codMatcher = pattern_cod.matcher(thirdColumn); // Check for "cod"
                    if (codMatcher.find()) {
                        System.out.println("Match found at line " + lineNumber + ": " + thirdColumn);
                    }
                } else {
                    System.out.println("Line " + lineNumber + " does not match the expected format.");
                }
                lineNumber++;
            }
        } catch (IOException e) {
            System.err.format("IOException occurred while reading '%s'.", fileName);
            System.err.println(e.getMessage());
        }
    }
}
