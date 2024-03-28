public class array {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        float[] b = {1.5f, 2.66f, 3.4f, 8.79f};
        char[] c = {'a', 'b', 'c'};
        String[] d = {"aaa", "bbb", "ccc", "ddd"};
        System.out.println(a[1]);
        System.out.println(b.length);
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]);
        }
        System.out.println(c[0]);
        System.out.println(d[3]);
    }
}
