import java.util.List;
import java.util.stream.IntStream;
import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public String[] solution(String my_string) {
        List<String> list = new ArrayList<>();
        IntStream.range(0, my_string.length()).forEach(value -> {
            list.add(my_string.substring(value,my_string.length()));
        });
        String[] arr = list.stream().toArray(String[]::new);
        Arrays.sort(arr);
        return arr;

    }
}