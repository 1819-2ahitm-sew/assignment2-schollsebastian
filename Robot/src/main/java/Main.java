import at.htl.robot.model.Robot;

public class Main {

    public static void main(String[] args) {

        Robot robot = new Robot();

        System.out.println(robot.getX());
        System.out.println(robot.getY());
        System.out.println(robot.getDirection());

        robot.stepForward();
        robot.stepForward();
        robot.rotateLeft();
        robot.stepForward();

        System.out.println(robot.getX());
        System.out.println(robot.getY());
        System.out.println(robot.getDirection());

    }

}
