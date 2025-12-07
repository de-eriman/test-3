//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        int a = 19;
        int b = 4;


        int res1 = a / b;      // целочисленное деление
        int ostatok = a % b;  // остаток от деления

        System.out.println(res1 + " билетов вы можете купить");
        System.out.println(ostatok + " у.е денег у вас останется");

    }
}