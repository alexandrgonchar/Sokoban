package model;

/**
 * Created by Александр on 10.09.2017.
 */
public abstract class CollisionObject extends GameObject {

    public CollisionObject(int x, int y) {
            super(x, y);
        }

    public boolean isCollision(GameObject gameObject, Direction direction) {
        int dx = 0, dy = 0;
        switch (direction) {
            case UP:
                dy -= Model.FIELD_SELL_SIZE;
                break;
            case DOWN:
                dy += Model.FIELD_SELL_SIZE;
                break;
            case LEFT:
                dx -= Model.FIELD_SELL_SIZE;
                break;
            case RIGHT:
                dx += Model.FIELD_SELL_SIZE;
                break;
        }
        return (getX() + dx == gameObject.getX()) && (getY() + dy == gameObject.getY());
    }
}
