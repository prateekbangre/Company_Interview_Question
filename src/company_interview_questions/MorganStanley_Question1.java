package company_interview_questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author prateek.bangre on 23/10/21.
 * @Project Company_Interview_Question
 */
/*
https://www.chegg.com/homework-help/questions-and-answers/5-slot-machine-20-slot-machine-multiple-wheels-spun-n-times-spin-wheel-may-multiple-stops--q60086250
A slot machine has multiple wheels that are spun n times. In each spin, each wheel may have multiple
stops from 1 to 9 and shows one random number on the machine's dashboard.
Given the number of spins n, determine the minimum number of stops on each wheel to produce the
numbers displayed on the dashboard for each spin. Then, calculate the total stops.

Example:    n=4
            spins[] = ['712' , '246', '365, '312']
the spins on a slot machine with 3 wheels are recorded as an array, history.
7 1 2
2 4 6
3 6 5
3 1 2
One wheel needs to have at least 7 stops to produce the numbers displayed on the dashboard for 1st spin.
Since 7 is the highest value in any row,
remove the highest value from each of the rows:
1 2
2 4
3 5
1 2
Now the highest value is 5, so another wheel must have 5 stops to produce the numbers displayed
on the dashboard for 3rd spin.
Using the same logic, the final wheel needs 3 stops.

Total stops are 7+5+3 = 15.
*/
public class MorganStanley_Question1 {

    public static void main(String[] args) {

        ArrayList<String> history = new ArrayList<>(Arrays.asList(new String[]{"137","364","115","724"}));
        ArrayList<String> sortHistory = new ArrayList<>();
        for (String str: history){
            sortHistory.add(sortString(str));
        }

//        sortHistory.forEach(System.out::println);
        int sum = 0;
        for (int i=0; i<history.get(0).length(); ++i){

            int finalI = i;
            sum += sortHistory.stream().map(ch -> ch.charAt(finalI)).max(Comparator.comparingInt(o -> o)).get() - '0';
        }

        System.out.println(sum);

    }

    public static String sortString(String str){
//        char[] ch = str.toCharArray();
//        Arrays.sort(ch, Comparator.comparingInt(o -> ));
//        return String.valueOf(ch);
        return Stream.of(str.split(""))
                .sorted(Collections.reverseOrder())
                .collect(Collectors.joining());
    }
}
