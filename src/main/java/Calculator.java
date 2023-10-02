public class Calculator {

    public static String cutResult(double allMoneyCalculator, int guestCalculator) {

        double guestMoney = allMoneyCalculator / guestCalculator;

        String resultCalculator = String.format("%.2f", guestMoney);

        return resultCalculator;
    }


    public static String rubles(double allMoneyCalculator, int guestCalculator) {
        double guestPrice = allMoneyCalculator / guestCalculator;
        double result2 = Math.floor(guestPrice);
        String rubCalculator;
        if (result2 == 1) {
            rubCalculator = "рубль.";
        } else if (result2 == 2) {
            rubCalculator = "рубля.";
        } else if (result2 == 3) {
            rubCalculator = "рубля.";
        } else if (result2 == 4) {
            rubCalculator = "рубля.";
        } else {
            rubCalculator = "рублей.";
        }
        return rubCalculator;
    }
}
