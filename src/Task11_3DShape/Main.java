package Task11_3DShape;

public class Main {

    public static void main(String[] args) {
        Ball ball = new Ball(4.5);
        Box box = new Box(1000);

        System.out.println(box.add(ball));

    }
}
