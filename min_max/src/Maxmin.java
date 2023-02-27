public class Maxmin extends Main{
    public static String maxMin(String input) {

        String[] strs = input.split(",");
        int nums[] = new int[strs.length];

        for (int i = 0; i < strs.length; i++){
            nums[i] = Integer.parseInt((strs[i]));
        }

        int max = nums[0];
        for (int i = 1; i < nums.length; i++){
            if (nums[i] > max){
                max = nums[i];
            }
        }
        System.out.println("max = " +max);

        int min = nums[0];
        for (int i = 1; i < nums.length; i++){
            if (nums[i] < min){
                min = nums[i];
            }
        }
        System.out.println("min = " +min);

        return input;
    }
}
