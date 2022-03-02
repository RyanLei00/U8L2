import java.util.Arrays;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[][] arr = {{3, 2, 1}, {6, 5, 8}, {7, 6, 9}};
        System.out.println(duplicates(arr));
    }


    public static boolean duplicates(int[][] array)
    {
        for(int c = 0; c < array[0].length; c++) {
            ArrayList<Integer> compare = new ArrayList<Integer>();
            for(int r = 0; r < array.length; r++){
                compare.add(array[r][c]);
            }
            System.out.println(compare);
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
