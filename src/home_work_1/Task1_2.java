package home_work_1;
//. Побитовые операции:
//	1.1. http://developer.alexanderklimov.ru/android/java/bitwise.php
//	1.2 Использовать ВСЕ возможные побитовые операции с числами 42 и 15.

public class Task1_2 {
    public static void main(String[] args) {
        int x = 42;
        int y = 15;

        //1. ~	Побитовый унарный оператор NOT
        //x= 101010, y= 1111
        //~x= 11111111111111111111111111010101, ~y= 11111111111111111111111111110000
        //~x= -43, ~y= -16
        System.out.println(x + " " + y);
          System.out.println("1. ~\tПобитовый унарный оператор NOT: ~x = " + (~x) + ", ~y = " + (~y) + ", x bin = " + Integer.toBinaryString((~x)) + ", y bin = " + Integer.toBinaryString((~y)));

        //2. &	Побитовый AND
        //x= 101010, y= 1111
        //x & y = 1010 (10)
          System.out.println("2. &\tПобитовый AND: x & y =" + (x & y) + ", bin = " + Integer.toBinaryString((x & y)));

        //3. &=	Побитовый AND с присваиванием
        //x= 101010, y= 1111
        //x = 1010 (10)
          System.out.println("3. &=\tПобитовый AND с присваиванием: x &= y ->" + (x &= y) + " , x = " + x + ", bin = " + Integer.toBinaryString((x)));

        x = 42;
        //4. | Побитовый OR
        //x= 101010, y= 1111
        //x | y = 101111 (
          System.out.println("4. | Побитовый OR: x | y = " + (x | y) + ", bin = " + Integer.toBinaryString((x | y)));

        //5.|=	Побитовый OR с присваиванием
        //x= 101010, y= 1111
        //x |= y -> 101111 (47)
          System.out.println("5.|=\tПобитовый OR с присваиванием: x |= y ->" + (x |= y) + " bin = " + Integer.toBinaryString((x)));

        x = 42;
        //6. ^	Побитовый исключающее OR
        //x= 101010, y= 1111
        //x ^ y = 100101  (37)
          System.out.println("6. ^\tПобитовый исключающее OR: x ^ y = " + (x ^ y) + " bin = " + Integer.toBinaryString((x ^ y)));

        //7. ^= Побитовый исключающее OR с присваиванием
        //x= 101010, y= 1111
        //x ^= y -> 100101 (37)
        //y ^= x -> 100101 (37)
          System.out.println("7. ^= Побитовый исключающее OR с присваиванием: x ^= y ->" + (x ^= y) + " bin = " + Integer.toBinaryString((x)));

        x = 42;
        //8. >>	Сдвиг вправо
        //x= 101010, y= 1111
        //x >> y -> 0 (0)
          System.out.println("8. >>\tСдвиг вправо: x >> y ->" + (x >> y) + " bin = " + Integer.toBinaryString((x >> y)));

        //9.>>=	Сдвиг вправо с присваиванием
        //x= 101010, y= 1111
        //x >>= y -> 0 (0)
          System.out.println("9.>>=\tСдвиг вправо с присваиванием: x >>= y ->" + (x >>= y) + " bin = " + Integer.toBinaryString((x)));

         x = 42;
        //10. >>>	Сдвиг вправо с заполнением нулями
        //x= 101010, y= 1111
        //Чтобы не получать значение 0 из-за выхода за границы, примем z = 3
        //x >>> y -> 101 (5)

        int z = 3;
        System.out.println("10. >>>\tСдвиг вправо с заполнением нулями: x >>> y ->" + (x >>> z) + " bin = " + Integer.toBinaryString((x >>> z)));

        //11. <<	Сдвиг влево
        //x= 101010, y= 1111
        //x << y -> 101010000000000000000 (1376256)

        System.out.println("11. <<\tСдвиг влево: x << y ->" + (x << y) + " bin = " + Integer.toBinaryString((x << y)));

        //12.  <<=	Сдвиг влево с присваиванием
        //x= 101010, y= 1111
        //x <<= y -> 101010000000000000000 (1376256)
        //во второй части выражения x =10000000000000000000000000000000 (-2147483648)

        System.out.println("12.  <<=\tСдвиг влево с присваиванием: x <<= y ->" + (x <<= y) + " bin = " + Integer.toBinaryString((x <<= y)) + ", x = " + x);

        x = 42;
        //13. >>>=	Сдвиг вправо с заполнением нулями с присваиванием
        //x= 101010, y= 1111
        //x >>> y -> 101 (5)
        //во второй части выражения x =0 (0)

        System.out.println("13. >>>=\tСдвиг вправо с заполнением нулями с присваиванием: x >>>= y ->" + (x >>>= z) + " bin = " + Integer.toBinaryString((x >>>= z)) + ", x = " + x);



    }
}
