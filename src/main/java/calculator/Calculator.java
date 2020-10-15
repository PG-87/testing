package calculator;

public class Calculator {

    public int SumNumbers(String s) {
        int sum = 0;

        if (s.isEmpty()) {
            return 0;
        } else if (s.contains(",")){
            String[] numbers = s.split(",");
            for (var number: numbers) {
                int num = Integer.parseInt(number);
                sum += num;
            }
            return sum;
        } else
            return Integer.parseInt(s);
    }
}

