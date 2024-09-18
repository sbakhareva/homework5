public class Main {
    public static void main(String[] args) {

        // Task #1
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }

        // Task #2
        /*
        String version;
        int clientDeviceYear = 2009;
        if (clientOS == 0) {
            version = (clientDeviceYear >= 2015)
                    ? "Установите версию приложения для iOS по ссылке."
                    : "Установите облегченную версию приложения для iOS по ссылке.";
            System.out.println(version);
        } else if (clientOS == 1) {
            version = (clientDeviceYear >= 2015)
                    ? "Установите версию приложения для Android по ссылке."
                    : "Установите облегченную версию приложения для Android по ссылке.";
            System.out.println(version);
        }
        */

        int clientDeviceYear = 2009;
        if (clientDeviceYear >= 2015) {
            switch (clientOS) {
                case 0:
                    System.out.println("Установите версию приложения для iOS по ссылке.");
                    break;
                case 1:
                    System.out.println("Установите версию приложения для Android по ссылке.");
                    break;
            }
        } else {
            switch (clientOS) {
                case 0:
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
                    break;
                case 1:
                    System.out.println("Установите облегченную версию приложения для Android по ссылке.");
                    break;
            }
        }


        // Task #3
        // високосным является каждый четвертый И каждый четырехсотый год, каждый сотый — не високосный
        int year = 2020;
        if (year < 1584) {
            System.out.println("Год не может быть меньше 1584.");
        } else if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високоснымю");
        } else {
                System.out.println(year + " год не является високосным.");
            }


            // Task #4
            int deliveryDistance = 53;
            int deliveryDays = 1;
            if (deliveryDistance <= 20) {
                System.out.println("Потребуется дней: " + (deliveryDays));
            } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
                System.out.println("Потребуется дней: " + (deliveryDays + 1));
            } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
                System.out.println("Потребуется дней: " + (deliveryDays + 2));
            } else {
                System.out.println("В этом радиусе доставки нет.");
            }

            // Task #5
            int monthNumber = 7;
            switch (monthNumber) {
                case 12, 1, 2:
                    System.out.println("Время года - зима.");
                    break;
                case 3, 4, 5:
                    System.out.println("Время года - весна.");
                    break;
                case 6, 7, 8:
                    System.out.println("Время года - лето.");
                    break;
                case 9, 10, 11:
                    System.out.println("Время года - осень.");
                    break;
                default:
                    System.out.println("Такого месяца не существует.");
            }
        }
    }