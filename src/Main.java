import javax.swing.plaf.ActionMapUIResource;
import java.util.Arrays;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[][] arr1 = {{3, 2, 1}, {6, 7, 6}, {8, 6, 1}};
        testing(arr1, 1, true);

        int[][] arr2 = {{8, 9, 7}, {6, 5, 8}, {7, 6, 9}};
        testing(arr2, 2, false);

        int[][] arr3 = {{9, 3, 4}, {4, 9, 3}};
        testing(arr3, 3, false);

        int[][] arr4 = {{2, 2, 9}, {8, 2, 8}};
        testing(arr4, 4, true);
    }


    public static void testing(int[][] testNums, int num, boolean expected)
    {
        boolean actualBool = duplicates(testNums);
        System.out.println("Test " + num);
        System.out.println("Input:" );
        for (int r = 0; r < testNums.length; r++) {
            System.out.print("{ ");
            for (int c = 0; c < testNums[0].length; c++) {
                System.out.print(testNums[r][c] + " ");
            }
            System.out.println("}");
        }
        System.out.println("Expected: " + expected);
        System.out.println("Actual: " + actualBool);
        System.out.println("-----------------------------");
    }

    public static boolean duplicates(int[][] array)
    {
        for(int c = 0; c < array[0].length; c++) {
            ArrayList<Integer> compare = new ArrayList<Integer>();
            for(int r = 0; r < array.length; r++){
                compare.add(array[r][c]);
            }
            Integer[] arr = compare.toArray(new Integer[compare.size()]);
            if(dup(arr) == true) return true;
        }
        return false;
    }

    public static boolean dup(Integer[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = i + 1; j < arr.length; j++)
            {
                if(arr[i] == arr[j]) return true;
            }
        }
        return false;
    }
}
