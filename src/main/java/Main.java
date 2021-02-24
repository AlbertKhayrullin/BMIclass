public class Main {
    public static void main(String[] args) {
        BMIService service = new BMIService();
        double index = service.calculate(169, 90);
        System.out.println(index);
    }
}
