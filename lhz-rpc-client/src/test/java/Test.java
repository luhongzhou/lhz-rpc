import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<String>();
        list.add("11");
        list.add("12");
        list.add("13");
        list.add("14");


        String[] arr = new String[7];
        String[] array = list.toArray(arr);
        System.out.println(Arrays.toString(array));
    }

}
