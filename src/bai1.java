import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter c: ");
        double c = scanner.nextDouble();
        PhuongTrinhBacHai phuongTrinhBacHai = new PhuongTrinhBacHai(a,b,c);
        double delta = phuongTrinhBacHai.getDiscriminant();
        double root = phuongTrinhBacHai.getRoot(),
                root1 = phuongTrinhBacHai.getRoot1(),
                root2 = phuongTrinhBacHai.getRoot2();

        System.out.println("Delta = " + delta);

        if(delta < 0){
            System.out.println("Phương trình vô nghiệm");
        } else if (delta == 0) {
            System.out.printf("Phương trình có nghiệm kép là %f",root);
        } else {
            System.out.println("Phương trình có 2 nghiệm:");
            System.out.println("Nghiệm 1: "+root1);
            System.out.println("Nghiệm 2: "+root2);
        }
    }
}