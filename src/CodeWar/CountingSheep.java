package CodeWar;

public class CountingSheep {
    /**
     * Consider an array/list of sheep where some sheep may be missing from their place.
     * We need a function that counts the number of sheep present in the array (true means present).
     */
    public static void main(String[] args) {
        Boolean[] array1 = {null, true, true, false,
                true, true, true, true,
                true, false, true, false,
                true, false, false, true,
                true, true, true, true,
                false, false, true, true};
        System.out.println(countSheeps(array1));
        System.out.println(countSheeps2(array1));
    }

    public static int countSheeps(Boolean[] arrayOfSheeps) {
        int counter = 0;
        for (int i = 0; i < arrayOfSheeps.length; i++) {
            try {
                arrayOfSheeps[i].equals(true);
            } catch (Exception e) {
                arrayOfSheeps[i] = false;
            }
            if (arrayOfSheeps[i].equals(true)) {
                counter++;
            }
        }
        return counter;
    }

    public static int countSheeps2(Boolean[] arrayOfSheeps) {
        String[] strings = new String[arrayOfSheeps.length];
        for (int a = 0; a < arrayOfSheeps.length; a++) {
            try {
                strings[a] = arrayOfSheeps[a].toString();
            } catch (NullPointerException e) {
                strings[a] = "false";
            }
        }
        int counter = 0;
        for (int i = 0; i < arrayOfSheeps.length; i++) {
            if (strings[i].equals("true")) {
                counter++;
            }
        }
        return counter;
    }
}
