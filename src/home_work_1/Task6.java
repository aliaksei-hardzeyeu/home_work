package home_work_1;

public class Task6 {
    public static void main(String[] args) {
    int[] numbers = {2,3,4,5,6,7,8,1,2,4};
        System.out.println(createPhoneNumber(numbers));
    }

    public static String createPhoneNumber (int[] numbers) {
        String phone = ("(" + numbers[0] + "" + numbers[1] + "" + numbers[2] + ") " + numbers[3] + "" + numbers[4]
        + "" + numbers[5] + "-" + numbers[6] + "" + numbers[7] + numbers[8] + numbers[9]);

        return phone;
    }
}
