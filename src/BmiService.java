public class BmiService {

    public int calculate(int mass, double height) {

        double index = mass / (height * height);

        return (int) index;

    }
}