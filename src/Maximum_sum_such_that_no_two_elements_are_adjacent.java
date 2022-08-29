import java.lang.reflect.Array;

class Maximum_sum_such_that_no_two_elements_are_adjacent {

    public static void main(String[] args) {
        int[] input = new int[]{5, 5, 10, 100, 10, 5};

//        int[] input = new int[]{5,5,10,40,50,35};

        /*
        5, 5, 10, 100, 10, 5

        select 100
        select 5,5 which are not adjacent
        sum  = 100+5+5 = 110
         */

//        output -> 110

        Maximum_sum_such_that_no_two_elements_are_adjacent maxFinder = new Maximum_sum_such_that_no_two_elements_are_adjacent();

        int max = maxFinder.Maximum_sum_such_that_no_two_elements_are_adjacent(input);

        System.out.println("Max is " + max);


    }

    int Maximum_sum_such_that_no_two_elements_are_adjacent(int[] input) {
        if (input.length < 1)
            return -1;

        int max_sum = 0;

        // sum including current element
        int include = input[0];
        // sum excluding current element
        int exclude = 0;
        int exclude_new = 0;

        for (int i = 1; i < input.length; i++) {
            exclude_new = Math.max(include, exclude);
            include = exclude + input[i];
            exclude = exclude_new;

        }

        max_sum = Math.max(include, exclude);

        return max_sum;
    }

}