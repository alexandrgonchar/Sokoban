package controller;

import model.Direction;

/**
 * Created by Александр on 10.09.2017.
 */
public interface EventListener {
    void move(Direction direction);

    void restart();

    void startNextLevel();

    void levelCompleted(int level);

}
