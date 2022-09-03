public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double myBmi = service.calculate(60.6, 1.62);
        double weight = 60.6;
        double height = 1.62;
        System.out.printf("индекс массы тела равен " + "%.1f", myBmi);
    }
}
