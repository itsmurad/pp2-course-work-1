public class Calc {
    public static void main(String[] args) {

        if (args.length < 2) {
            System.out.println("Please, provide two numbers!");
            System.exit(1);
        }

        var n1 = Integer.parseInt(args[0]);
        var n2 = Integer.valueOf(args[1]);

        System.out.println(n1 + n2);

    }
}
