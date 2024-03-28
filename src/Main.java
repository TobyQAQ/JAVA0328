public class Main {

    //無參數無回傳值
    public static void printme1() {
        System.out.println("我好棒棒");
    }

    //有參數無回傳值
    public static void printme2(String a) {
        System.out.println("你超棒" + a);
    }

    //無參數有回傳值
    public static String printme3() {

        return "救命";
    }

    //有參數有回傳值
    public static int printme4(int d, int e) {

        return d * e;
    }

    public static double print5(double g, double h, double i) {
        return ((g + h) * i)/ 2;
    }

    public static void main(String[] args) {

        printme1();

        printme2("kevin");

        //如果有回傳值必須要有變數來接回傳的值
        String a = printme3();
        System.out.println(a);

        int f = printme4(4, 6);
        System.out.println(f);

        double j = print5(1, 2, 3);
        System.out.println(j);
    }
}