public class traffic {

    public static String light(String a) {
        if (a == "red") {
            return "stop";
        } else if (a == "yellow") {
            return "run";
        } else {
            return "walk";
        }

    }

    public static void main(String[] args) {

        System.out.println(light("red"));
    }
}
