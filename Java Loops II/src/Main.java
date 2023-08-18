import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int queriesNumber = Integer.parseInt(bufferedReader.readLine().trim());
        List<StringBuilder> result = new ArrayList<>();

        for (int tItr = 0; tItr < queriesNumber; tItr++) {
            try {
                List<Integer> intList = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList());

                result.add(Main.calculateSeries(intList));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }

        try {
            bufferedReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        for(StringBuilder output : result)
            System.out.println(output);

    }

    static StringBuilder calculateSeries(List<Integer> intList) {
        int a = intList.get(0);
        int b = intList.get(1);
        int n = intList.get(2);
        int result = a + b;
        StringBuilder stringResult = new StringBuilder(String.valueOf(result));

        for(int i = 1; i < n; i++) {
            int powerOfTwo = Main.powerOfTwo(i);
            result += powerOfTwo * b;
            stringResult.append(" ").append(result);
        }

        return stringResult;
    }

    private static int powerOfTwo(int i) {
        return (int)Math.pow(2.0D, (double)i);
    }
}