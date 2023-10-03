public class Calculator {

    public static String cutResult(double allMoneyCalculator, int guestCalculator) {

        double guestMoney = allMoneyCalculator / guestCalculator;

        String resultCalculator = String.format("%.2f", guestMoney);

        return resultCalculator;
    }


    public static String rubles(double allMoneyCalculator, int guestCalculator) {
        double guestPrice = allMoneyCalculator / guestCalculator;
        double result2 = Math.floor(guestPrice);
        double result3 = result2 % 10;
        double result4 = result2 % 100;
        String rubCalculator;

        if (result2 >= 10 && result2 <= 20) {
            rubCalculator = "рублей.";
        } else if (result4 >= 10 && result4 <= 20) {
            rubCalculator = "рублей.";
        } else if (result3 >= 2 && result3 <= 4) {
            rubCalculator = "рубля.";
        } else if (result3 >= 5 && result3 <= 9) {
            rubCalculator = "рублей.";
        } else if (result3 == 1) {
            rubCalculator = "рубль.";
        }
         else {
            rubCalculator = "рублей.";
        }
        return rubCalculator;
    }
}
