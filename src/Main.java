public class Main {
    public static void main(String[] args) {
    BmiService service = new BmiService();
    int mass = 64;
    double height = 1.76;
    int index = service.calculate(mass,height);
    System.out.println(index);

    }
}