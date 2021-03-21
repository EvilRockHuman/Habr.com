package CreateClassAndVector;

public class Task2_0 {
    /**
     * Создайте класс, который описывает вектор (в трёхмерном пространстве).
     */
    private double x = 2;
    private double y = 3;
    private double z = 4;

    //Task2_0(double x, double y, double z){
//    this.x = x;
//    this.y = y;
//    this.z = z;
//}
  static double lengthVector() {
      Task2_0 t2 = new Task2_0();
        double length = Math.sqrt(t2.x * t2.x + t2.y * t2.y + t2.z * t2.z);
        return length;
    }

    public static void main(String[] args) {

        System.out.println(lengthVector());
    }
}
