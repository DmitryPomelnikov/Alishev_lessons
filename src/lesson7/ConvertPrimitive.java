package lesson7;

public class ConvertPrimitive {
    public static void main(String[] args) {
        float f = 124544542.24f; //также конвертация, по дефолту плавающая переменная - double, таким образом добавляя в конце f мы конвертируем
        long l = 12146L;// такая же ситуация, если цифра выйдет за рамки инта значит будет ошибка, поэтому присваиваем L
        int i = 555;

        long longConvert = i;// неявное приведение
        int value = (int) l;//явное, т.е. с указанием в какой тип переменной переводим
        System.out.println(value);
        System.out.println(longConvert);

        byte x = (byte) 129;
        System.out.println(x);
    }

}
