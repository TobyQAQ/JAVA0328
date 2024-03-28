public class Even {

    public static boolean even1(int a) {
        if (a % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        if (even1(100)) {
            System.out.println("他是偶數");
        } else {
            System.out.println("他是基數");
        }

    }
}
