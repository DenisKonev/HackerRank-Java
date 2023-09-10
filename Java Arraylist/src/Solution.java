import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<List<Integer>> inputList = new ArrayList<>();
        int inputListLength = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < inputListLength; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < arrRowTempItems.length; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            inputList.add(arrRowItems);
        }

        List<List<Integer>> queriesList = new ArrayList<>();
        int queriesListLength = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < queriesListLength; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < 2; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            queriesList.add(arrRowItems);
        }

        for (int i = 0; i < queriesListLength; i++)
        {
            try {
                int queryXIndex = queriesList.get(i).get(0) - 1;
                int queryYIndex = queriesList.get(i).get(1);
                System.out.println(inputList.get(queryXIndex).get(queryYIndex));
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }
        bufferedReader.close();
    }
}