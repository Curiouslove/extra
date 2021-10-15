package practicewithchief.turtleexercise.entities;

import practicewithchief.execptions.TurtleException;
import practicewithchief.turtleexercise.enums.CardinalPoint;
import practicewithchief.turtleexercise.enums.PenPosition;

public class Turtle {

    private String name;
    private Pen pen;
    private int xCoordinate;
    private int yCoordinate;
    private CardinalPoint direction;

    public Turtle() {
        pen = new Pen();
        pen.setPosition(PenPosition.UP);
        direction = CardinalPoint.EAST;
    }

    public Turtle(String name) {
        this.name = name;
    }

    public Turtle(String name, int xCoordinate, int yCoordinate) {
        this.name = name;
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pen getPen() {
        return pen;
    }

    public void setPen(Pen pen) {
        this.pen = pen;
    }

    public int getXCoordinate() {
        return xCoordinate;
    }

    public void setXCoordinate(int xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public int getYCoordinate() {
        return yCoordinate;
    }

    public void setYCoordinate(int yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    public CardinalPoint getDirection() {
        return direction;
    }

    public void setDirection(CardinalPoint direction) {
        this.direction = direction;
    }

    public void changePenPosition(PenPosition position) {
        this.getPen().setPosition(position);
    }

    public void turnRight() {
        switch (direction) {
            case EAST -> setDirection(CardinalPoint.SOUTH);
            case SOUTH -> setDirection(CardinalPoint.WEST);
            case WEST -> setDirection(CardinalPoint.NORTH);
            case NORTH -> setDirection(CardinalPoint.EAST);
        }
    }

    public void turnleft() {
        switch (direction) {
            case EAST -> setDirection(CardinalPoint.NORTH);
            case SOUTH -> setDirection(CardinalPoint.EAST);
            case WEST -> setDirection(CardinalPoint.SOUTH);
            case NORTH -> setDirection(CardinalPoint.WEST);
        }
    }

    public void moveForward(int numberOfSteps) {
        if (direction.equals(CardinalPoint.EAST)) {
            xCoordinate += numberOfSteps - 1;
        } else if (direction.equals(CardinalPoint.SOUTH)) {
            yCoordinate += numberOfSteps - 1;
        } else if (direction.equals(CardinalPoint.WEST)) {
            xCoordinate -= numberOfSteps - 1;
        } else if (direction.equals(CardinalPoint.NORTH)) {
            yCoordinate -= numberOfSteps - 1;
        }

    }

    public void moveForward(int numberOfSteps, SketchPad pad) throws TurtleException {
        if (numberOfSteps > pad.getFloor().length - 1) {
            throw new TurtleException("NUmber of steps to high");
        }
        int destination = -1;
        if (direction.equals(CardinalPoint.SOUTH)) {
            yCoordinate += numberOfSteps - 1;
        }
    }
}