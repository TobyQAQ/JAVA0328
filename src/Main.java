public class Main {

    //無參數無回傳值
    public static void printme1() {
        System.out.println("我好棒棒");
    }

    //有參數無回傳值
    public static void printme2(String a) {
        System.out.println("你超棒"+ a);
    }

    public static void main(String[] args) {

        printme1();

        printme2("kevin");
    }
}