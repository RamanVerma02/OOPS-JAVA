public class DiscountCalculator {
    static double discount(double[] p) {
        double sum = 0;
        double discount = 0;

        for (int i = 0; i < p.length; i++) {
            sum += p[i];
        }
        System.out.println("Total price: " + sum);

        if (sum < 500) {
            discount = sum * 5 / 100;
            System.out.println("Discount: " + discount);

        } else if (sum > 500 && sum < 1000) {
            discount = sum * 10 / 100;
            System.out.println("Discount: " + discount);

        } else if (sum > 1000) {
            discount = sum * 0.20;
            System.out.println("Discount: " + discount);

        }
        System.out.print("After Discount: ");

        return sum - discount;
    }

    public static void main(String[] args) {

        double[] p = { 100, 110, 90, 70, 50 };
        double[] q = { 100, 110, 200, 190, 155 };
        double[] r = { 100, 200, 300, 400, 500 };

        System.out.println(discount(p));

    }
}
