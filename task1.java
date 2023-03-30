
// Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)
// Ввод:5
// Треугольное число 1 + 2 + 3 + 4 + 5 = 15
// n! 1 * 2 * 3 * 4 * 5 = 120



import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Введите число : ");
        int a = Scanner.nextInt();
        Scanner.close();
        System.out.println("Треугольное число = " + Triangle(a) + "\n");
    }

    public static int Triangle(int num) {
        if (num == 1) {
            return 1;
        }
        return Triangle(num - 1) + num;
    }
}




// Нахождение факториала числа
// Не получилось связать  часть задачи с треугольными числами и факториалом,части работают отдельно
// import java.util.Scanner;

// public class task1 {

//     public static void main(String args[]) {
//         for (int counter = 0; counter <= 10; counter++) {
//               System.out.printf("%d! = %d\n", counter, factorial(counter));
//            }
//         }
//     public static long factorial(long number) {
//         if (number <= 1) return 1;
//            else return number * factorial(number - 1);
//         }
//     }       

