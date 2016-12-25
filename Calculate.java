public class Calculate {
	public static void main(String[] args) {
        System.out.println("Calculate...");
        int a = Integer.valueOf(args[0]);
        int b = Integer.valueOf(args[1]);
        int oper = Integer.valueOf(args[2]);
        switch (oper) {
            case 1:
                System.out.println("Summa = " + (a + b));
                break;
            case 2:
                System.out.println("Raznost = " + (a - b));
                break;
            case 3:
                System.out.println("Proizvedenie = " + (a * b));
                break;
            case 4:
                System.out.println("Chastnoe = " + (a / b));
                break;
            case 5:
                System.out.println("Vozvedenie A v stepen B = " + Math.pow(a, b));
                break;
        }
    }
}
