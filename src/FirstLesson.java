public class FirstLesson {
    public static void main(String[] args) {
        System.out.println("Information from console");
        int count;
        count = 156_777_9;

        int length =111, width = 234;

        System.out.println(count);
//       byte data = 327;  превышен допустимый диапозон
        long veryBig = 67_000_000_000L;
//        integer number to large. Нужна в конце  L
//        System.out.println(count/0);
//        деление целых чисел на ноль приводит к ошибке

        double price =56.7;

        float temp = -78.9F;

        System.out.println(price/0); //infinity
        System.out.println(temp/0); // - infinity
//        деление целых чисел с плавающей точкой на ноль приводит к бесконечности infinity

    count = 8700; // int
    price =56.7; //double
    //  приведение типов данных
    price = count;// double    8700.00
    System.out.println(price);

//  ниже явное приведение типов. Без (byte) count не влезет в byte;будет потеря данных
        byte small = (byte) count;

        System.out.println(small);



        // операторы
        int a = 9, b =4;
        double c = a / b; // 2.0
        double d = (double)a / b; // 2.25

        System.out.println(c);
        System.out.println(d);

        byte x = 7, y = 4;
        byte z = (byte)(x+y); // 11  при сложении двух byte получится int
        System.out.println(c);

        // %  остаток от деления
        length = 9;
        width = 2;
        System.out.println( length % width); // 1
        System.out.println( 3 % 789); // 3
        System.out.println( 4 % 789); // 4
        System.out.println( 5 % 789); // 5


        // Операторы присваивания

        int num = 10;
        num = num + 10;
        num += 10;


        num = num - 10; // num -= 10;

        num = num * 10; // num *= 10;

        num = num / 10; // num /= 10;

        num = num % 10; // num %= 10;

        num = num + 10; // num += 10;

        // операторы сравнения

        System.out.println( a > b);
        System.out.println( length == width);
        System.out.println(40 <= 40); // true
        System.out.println(400 != 40); // true


        // тернарный оператор
        int start = 3, end = 5000;
        int result = start < end ? end - start : 0;
        System.out.println(result);
    }

}
