package at.htl.robot.model;

public class Robot {

    private Direction direction = Direction.SOUTH;
    private int x;
    private int y;

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void stepForward() {

        switch (direction) {

            case NORTH:
                setY(getY() - 1);
                break;

            case EAST:
                setX(getX() + 1);
                break;

            case SOUTH:
                setY(getY() + 1);
                break;

            case WEST:
                setX(getX() - 1);
                break;

        }

    }

    public void rotateLeft() {

        switch (direction) {

            case NORTH:
                setDirection(Direction.WEST);
                break;

            case EAST:
                setDirection(Direction.NORTH);
                break;

            case SOUTH:
                setDirection(Direction.EAST);
                break;

            case WEST:
                setDirection(Direction.SOUTH);
                break;

        }

    }

}
