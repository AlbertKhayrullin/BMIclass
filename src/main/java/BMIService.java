public class BMIService {
    double calculate(double height, double weight) {
        double index = weight / (height * height / 10000);
        double scale = Math.pow(10, 2);
        double result = Math.ceil(index * scale) / scale;
        return result;
    }
}
