package CodeWar;

public class FakeBinary {
    /**
     * Given a string of digits, you should replace any digit below 5 with '0' and any digit 5 and above with '1'. Return the resulting string.
     * Note: input will never be an empty string
     */
    public static void main(String[] args) {
        System.out.println(FakeBinaries.fakeBin("45385593107843568"));
        System.out.println(FakeBinaries.fakeBin("509321967506747"));
        System.out.println(FakeBinaries.fakeBin("366058562030849490134388085"));

    }
}

class FakeBinaries {
    public static String fakeBin(String numberString) {
        String finalResult = "";
        String[] stringName = numberString.split("");
        int[] intName = new int[numberString.length()];
        for (int i = 0; i < numberString.length(); i++) {
            intName[i] = Integer.parseInt(stringName[i]);
            finalResult += intName[i] < 5 ? "0" : "1";
        }
        return finalResult;
    }

    //не мое решение
    public static String fakeBin2(String numberString) {
        return numberString.replaceAll("[0-4]", "0").replaceAll("[5-9]", "1");
    }
}