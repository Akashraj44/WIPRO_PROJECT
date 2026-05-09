package assignment_4;
interface Movable {
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
}

// MovablePoint class
class MovablePoint implements Movable {
    int x, y;
    int xSpeed, ySpeed;

    // Constructor
    MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public void moveUp() {
        y += ySpeed;
    }

    public void moveDown() {
        y -= ySpeed;
    }

    public void moveLeft() {
        x -= xSpeed;
    }

    public void moveRight() {
        x += xSpeed;
    }

    public String toString() {
        return "Point(" + x + ", " + y + ")";
    }
}

// MovableCircle class
class MovableCircle implements Movable {
    int radius;
    MovablePoint center;

    // Constructor
    MovableCircle(int radius, MovablePoint center) {
        this.radius = radius;
        this.center = center;
    }

    public void moveUp() {
        center.moveUp();
    }

    public void moveDown() {
        center.moveDown();
    }

    public void moveLeft() {
        center.moveLeft();
    }

    public void moveRight() {
        center.moveRight();
    }

    public String toString() {
        return "Circle Center: " + center + ", Radius: " + radius;
    }
}

// MovableRectangle class
class MovableRectangle implements Movable {
    MovablePoint topLeft;
    MovablePoint bottomRight;
    MovableRectangle(MovablePoint topLeft, MovablePoint bottomRight) {
        // Ensure same speed
        if (topLeft.xSpeed == bottomRight.xSpeed && topLeft.ySpeed == bottomRight.ySpeed) {
            this.topLeft = topLeft;
            this.bottomRight = bottomRight;
        } else {
            System.out.println("Error: Points must have same speed!");
        }
    }

    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    public void moveDown() {
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();
    }

    public String toString() {
        return "Rectangle TopLeft: " + topLeft + ", BottomRight: " + bottomRight;
    }
}

public class Qn1_movableshape {

	public static void main(String[] args) {
		
		 // MovablePoint
        MovablePoint p = new MovablePoint(0, 0, 2, 3);
        System.out.println("Initial Point: " + p);
        p.moveUp();
        p.moveRight();
        System.out.println("After Move: " + p);

        // MovableCircle
        MovableCircle c = new MovableCircle(5, new MovablePoint(1, 1, 1, 1));
        System.out.println("\nInitial Circle: " + c);
        c.moveDown();
        c.moveLeft();
        System.out.println("After Move: " + c);

        // MovableRectangle
        MovableRectangle r = new MovableRectangle(
                new MovablePoint(0, 5, 1, 1),
                new MovablePoint(5, 0, 1, 1)
        );

        System.out.println("\nInitial Rectangle: " + r);
        r.moveUp();
        r.moveRight();
        System.out.println("After Move: " + r);
	}

}
