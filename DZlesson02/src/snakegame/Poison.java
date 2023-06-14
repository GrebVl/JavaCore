package snakegame;

import java.util.Random;

public class Poison extends Cell{
    private Random randomP;
    private Snake snake;

    public Poison(Snake snake) {
        super(1, 1, GameSnake.CELL_SIZE, GameSnake.POISON_COLOR);
        randomP = new Random();
        this.snake = snake;
    }

    public void appearPoison(){
        int x, y;
        do{
            x = randomP.nextInt(GameSnake.CANVAS_WIDTH);
            y = randomP.nextInt(GameSnake.CANVAS_HEIGHT);
        } while(snake.isInSnake(x, y));
        set(x, y);
    }

    public boolean isEatenPoison(){
        return getX() == 1;
    }

    public void eatPoison() {
        set(1, 1);
    }

    public boolean isPoison(int x, int y) {
        return (getX() == x && getY() == y);
    }
}
