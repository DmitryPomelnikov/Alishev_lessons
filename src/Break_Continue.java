public class Break_Continue {
    public static void main(String[] args) {
        System.out.println("Пример break");
        int i = 0;
        while (true) {
            if (i == 15) {
                break;
            }
            System.out.println(i);
            i++;
        }
        System.out.println("Мы вышли из цикла");
        System.out.println("Пример continue");
        for (int a = 0; a <= 15; a++) {
            if (a % 2 == 0) {
                continue;
            }
            System.out.println("Нечётные числа " + a);
        }
    }


}
