import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        // Задание 2
        System.out.println("Задание 2");
        int clientOS1 = 1;
        int clientDeviceYear = 2015;
        if (clientOS1 == 0)
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        if (clientOS1 == 1)
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        {
            // Задание 3
            System.out.println("Задание 3");
            // я бы сделала следующим образом, если каждый четвертый год високосный, то число, которое цело делится на 4, за исключением 100-ого. Если наш год делится цело на 4 без остатка, но при этом может быть равен 400, 800, 1200 и т.д., то он високосный
            // Но таких переменных я не знаю.
        }

        //Задание 4
        System.out.println("Задание 4");
        int deliveryDistance = 95;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется 1 день");
        }        if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется 2 дня");
        }        if (deliveryDistance >= 60 && deliveryDistance < 100){
            System.out.println("Потребуется 3 дня");

        }
    }
}

