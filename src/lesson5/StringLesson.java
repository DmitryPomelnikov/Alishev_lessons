package lesson5;

public class StringLesson {
    public static void main(String[] args) {
        String x = "Hello";
        x = x.toUpperCase();
        System.out.println(x);

        String x2 = "Hello";
        String x3 = " my";
        String x4 = " friend";
        String stringAll = x2 + x3 + x4;
        System.out.println(stringAll);

        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb.toString());
        sb.append(" my");
        sb.append(" friend");
        System.out.println(sb.toString());
        sb.append(" in").append(" our lesson");
        System.out.println(sb);
    }
}
