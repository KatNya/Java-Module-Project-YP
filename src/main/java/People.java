import java.util.Scanner;

public class People {
    public static int peopleCount(){
        Scanner scannerPeople = new Scanner(System.in);
        System.out.println("Сколько человек участвовало в банкете? Введите количество гостей.");

        int guestPeople = 0;
        while (guestPeople <= 1) { // Цикл выполняется, пока guest меньше или равно 1

            guestPeople = scannerPeople.nextInt(); // Считываем из консоли число и присваиваем переменной guest
            if (guestPeople <= 1) {
                System.out.println("Некорректное количество гостей: " + guestPeople);
                System.out.println("Введите количество гостей более одного");

                
            }
        }
        return guestPeople;
    }


}
