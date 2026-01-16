import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main3 {
    public static void main(String[] args) {
        String fileName = "numbers.txt";
        int[] arr = new int[0];
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            Pattern pattern_num = Pattern.compile("^.*\\b(\\d+)\\b.*$");
            String line;
            int lineNumber = 1;
            while ((line = br.readLine()) != null) {
                Matcher matcher = pattern_num.matcher(line);
                if (matcher.matches()) {
                    String num = matcher.group(1); // Get the captured group
                    System.out.println("num = " + num);
                    int value = Integer.parseInt(num);
                    arr = addInt(arr, value);
                }
            }
        } catch (IOException e) {
            System.err.format("IOException occurred while reading '%s'.", fileName);
            System.err.println(e.getMessage());
        }
        Arrays.sort(arr);
        System.out.println(arr[arr.length-1]);
    }

    public static int[] addInt(int [] series, int newInt){
        //create a new array with extra index
        int[] newSeries = new int[series.length + 1];

        //copy the integers from series to newSeries
        for (int i = 0; i < series.length; i++){
            newSeries[i] = series[i];
        }
//add the new integer to the last index
        newSeries[newSeries.length - 1] = newInt;
        return newSeries;

    }
}

