
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int guest = People.peopleCount();

        String food;
        String allFood = "";
        double money;
        double allMoney = 0.00;

        while (true) {

            System.out.println("Введите блюдо или Завершить для подсчета итога");
            food = scanner.next();
            if(food.equalsIgnoreCase("ЗАВЕРШИТЬ")){
                break;
            }
            allFood = allFood + "\n " + food;
            System.out.println("Введите стоимость блюда");
            money = scanner.nextDouble();
            if (money > 0) {
                allMoney = allMoney + money;
            }
            else {
            System.out.println("Отрицательной цены за блюдо быть не может");
            }
        }

        System.out.println("Добавленные товары:" + allFood);



        String result = Calculator.cutResult(allMoney, guest);

        String rub = Calculator.rubles(allMoney, guest);



        System.out.println("Каждый гость должен заплатить " + result + " " + rub);
        }



    }


