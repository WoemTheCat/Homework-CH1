import static java.lang.Math.PI;

public class Sample14 {
    public static void main(String[] args) {
        int d = 2;

        System.out.println("直徑是" + d + "公分的圓");
        System.out.println("其圓周為" + (d * PI) + "公分");

        int num1 = 5;
        int num2 = 4;

        double div1 = num1 / num2;
        double div2 = (double) num1 / (double) num2;

        System.out.println("5/4等於" + div1);
        System.out.println("5/4等於" + div2);
    }
}
