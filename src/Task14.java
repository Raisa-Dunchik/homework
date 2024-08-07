public class Task14 {
    public static void main(String[] args) {
        int len = 5;
        int initialValue = 10;
        int[] resultArray = Main.createArray (len, initialValue);
        System.out.println("Результирующий массив:");
        for (int num : resultArray) {
            System.out.println(num + " ");
        }
    }
}
