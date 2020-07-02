public class Main {
    public static void main(String[] args) {
        int balanceClient = 100;
        int bonus;
        int balanceReplenishment = 1850;
        if (balanceReplenishment >= 1000){
            bonus = balanceReplenishment / 100;
        } else {
            bonus = 0;
        }
        int balancePure = balanceClient + balanceReplenishment;
        int balanceWithBonus = balancePure + bonus;

        if (bonus > 0){
            System.out.println("Ваш баланс: " + balanceWithBonus + " рублей. " + "Ваш бонус составляет: " + bonus + " бонусов.");
        } else {
            System.out.println("Ваш баланс: " + balancePure + " рублей. " + "Ваш бонус составляет: " + bonus + " бонусов.");
        }


    }
}
