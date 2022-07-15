
class Move {
    public static void moveRobot(Robot robot, int toX, int toY) {
        turnAroundAndGo(robot.getDirection(), robot.getX(), toX, robot, true);
        turnAroundAndGo(robot.getDirection(), robot.getY(), toY, robot, false);
    }

    private static void turnAroundAndGo(Direction currentDirection, int currentP, int toP, Robot robot, boolean isX) {
        if (currentP > toP) {
            if (isX) {
                changeDirectionToNeeded(currentDirection, Direction.LEFT, robot);
            } else {
                changeDirectionToNeeded(currentDirection, Direction.DOWN, robot);
            }
        } else if (currentP < toP) {
            if (isX) {
                changeDirectionToNeeded(currentDirection, Direction.RIGHT, robot);
            } else {
                changeDirectionToNeeded(currentDirection, Direction.UP, robot);
            }
        }

        changePosition(currentP, toP, robot, isX);
    }

    private static void changeDirectionToNeeded(Direction currentDirection, Direction neededDirection, Robot robot) {
        while (currentDirection != neededDirection) {
            robot.turnRight();
            currentDirection = robot.getDirection();
        }
    }

    private static void changePosition(int currentP, int toP, Robot robot, boolean isX) {
        while (currentP != toP) {
            robot.stepForward();
            if (isX) {
                currentP = robot.getX();
            } else {
                currentP = robot.getY();
            }
        }
    }
}

//Don't change code below

enum Direction {
    UP(0, 1),
    DOWN(0, -1),
    LEFT(-1, 0),
    RIGHT(1, 0);

    private final int dx;
    private final int dy;

    Direction(int dx, int dy) {
        this.dx = dx;
        this.dy = dy;
    }

    public Direction turnLeft() {
        switch (this) {
            case UP:
                return LEFT;
            case DOWN:
                return RIGHT;
            case LEFT:
                return DOWN;
            case RIGHT:
                return UP;
            default:
                throw new IllegalStateException();
        }
    }

    public Direction turnRight() {
        switch (this) {
            case UP:
                return RIGHT;
            case DOWN:
                return LEFT;
            case LEFT:
                return UP;
            case RIGHT:
                return DOWN;
            default:
                throw new IllegalStateException();
        }
    }

    public int dx() {
        return dx;
    }

    public int dy() {
        return dy;
    }
}

class Robot {
    private int x;
    private int y;
    private Direction direction;

    public Robot(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void turnLeft() {
        direction = direction.turnLeft();
    }

    public void turnRight() {
        direction = direction.turnRight();
    }

    public void stepForward() {
        x += direction.dx();
        y += direction.dy();
    }

    public Direction getDirection() {
        return direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}