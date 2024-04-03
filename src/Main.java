public class Main {
    public static void printTaskNumber(int num) {
        System.out.println("Task " + num);
    }

    public static void checkYear(int yearExam) {
        if (yearExam > 1584)
            if (yearExam % 4 == 0 && (yearExam % 100 != 0 || yearExam % 400 == 0))
                System.out.println("Год является високосным");
            else System.out.println("Год не является високосным");
        else System.out.println("Год введён не корректно");
    }

    public static void changeVersion(int os, int clientDeviceYear) {
        switch (os) {
            case 0:
                if (clientDeviceYear < 2015)
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                else
                    System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                if (clientDeviceYear < 2015)
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                else
                    System.out.println("Установите версию приложения для Android по ссылке");
                break;
        }
    }

    public static void defineDistance(int deliveryDistance) {
        if (deliveryDistance < 20) System.out.println("Потребуется 1 день");
        else if (deliveryDistance < 60) System.out.println("Потребуется 2 дня");
        else if (deliveryDistance < 100) System.out.println("Потребуется 3 дня");
        else System.out.println("Доставка не может быть осуществлена");
        System.out.print("Желаете скорректировать расстояние? ");
        Scanner consoleContinuation = new Scanner(System.in);
        String continuation = consoleContinuation.next();
        if (Objects.equals(continuation, "да")) {
            Scanner consDeliveryDist = new Scanner(System.in);
            System.out.print("Distance ");
            int deliveryDist = consDeliveryDist.nextInt();
            if (deliveryDist < 20) System.out.println("Потребуется 1 день");
            else if (deliveryDist < 60) System.out.println("Потребуется 2 дня");
            else if (deliveryDist < 100) System.out.println("Потребуется 3 дня");
            else System.out.println("Доставка не может быть осуществлена");
        }

    }

    public static void main(String[] args) {
        // Task 1
        int taskNum = 1;
        printTaskNumber(taskNum);
        Scanner consoleYear = new Scanner(System.in);
        System.out.print("Год: ");
        int year = consoleYear.nextInt();
        checkYear(year);
        // Task 2
        taskNum = 2;
        printTaskNumber(taskNum);
        int currentYear = (int) (2000 + Math.random() * 24);
        int clientOs = (int) (Math.random() * 2);
        changeVersion(clientOs, currentYear);
        // Task 3
        taskNum = 3;
        printTaskNumber(taskNum);
        int inDeliveryDistance = 95;
        defineDistance(inDeliveryDistance);
    }
}