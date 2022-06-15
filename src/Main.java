public class Main {
    public static void main(String[] args) {
        int yourWeight = 50;  // вес в килограммах
        float yourHeight = 1.8F; // рост в метрах
        BmiService service = new BmiService();
        float index = service.calculate(yourWeight, yourHeight);
        System.out.println("Ваш индекс массы тела " + index);
    }
}
