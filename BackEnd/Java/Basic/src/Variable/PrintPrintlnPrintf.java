public class PrintPrintlnPrintf {
    public static void main(String[] args) {
        System.out.print("h");
        System.out.print("a");
        System.out.println();
        System.out.println("h");
        System.out.println("a");
        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.printf("%d * %d = %2d %n", i, j, i * j);
            }
            System.out.println();
        }
        System.out.printf("%c is %s \n",'A', "Ace");

        System.out.printf("%4.2f ", 1234.56f);
        System.out.printf("%4.2g ", 1234.56f);
        System.out.printf("%4.2e ", 1234.56f);
    }
}
