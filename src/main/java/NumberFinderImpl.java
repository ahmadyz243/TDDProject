import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberFinderImpl implements NumberFinder {

    @Override
    public List<String> findNumber(String input) {
        List<String> numbers = new ArrayList<>();
        String num = "";
        input = input.replaceAll("[^\\d]", " ");
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != ' ') {
                num = num.concat(String.valueOf(input.charAt(i)));
            }else{num = "";}
            if (num.length() == 3) {
                numbers.add(num);
                num = "";
            }
        }
        return numbers;
    }
}
