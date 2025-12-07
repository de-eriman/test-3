public class app {
    public static void main(String[] args) {
        int price = 200;
        int nalog = 19;

        double totalPrice1 = price + price * nalog * 0.01;
        int totalPrice = (int) totalPrice1;
        System.out.println(totalPrice+" / "+totalPrice1);

    }
}
