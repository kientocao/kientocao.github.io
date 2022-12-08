public class arayPratice5 {
    public static void main(String[] args) {
        System.out.println(repearString(new int[]{1, 2, 3}, 2));
    }
    public static Boolean repearString(int[] array, int a) {
        boolean result = false;
        for (int j : array) {
         result = (j == a);
         break;
        }
    return result;
    }
}
