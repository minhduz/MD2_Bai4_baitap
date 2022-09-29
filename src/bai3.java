import Thuchanh.Fan;

public class bai3 {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();

        System.out.println("Fan 1 trước khi thay đổi: ");
        System.out.println(fan1.toString());
        fan1.setSpeed(fan1.getFAST());
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);
        System.out.println("Fan 1 sau khi thay đổi: ");
        System.out.println(fan1.toString());
        fan2.setSpeed(fan1.getMEDIUM());
        fan2.setRadius(5);
        fan2.setColor("blue");
        System.out.println("Fan 2 sau khi thay đổi: ");
        System.out.println(fan2.toString());

    }
}
