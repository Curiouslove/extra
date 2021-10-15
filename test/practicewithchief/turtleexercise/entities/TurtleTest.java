package practicewithchief.turtleexercise.entities;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practicewithchief.turtleexercise.enums.CardinalPoint;
import practicewithchief.turtleexercise.enums.PenPosition;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class TurtleTest {

    private Turtle ijapa;
    private SketchPad drawingBoard;

    @BeforeEach
    void setUp() {
        ijapa = new Turtle();
        drawingBoard = new SketchPad();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
   void changePenPositionFromUpToDown(){
        assertEquals(PenPosition.UP, ijapa.getPen().getPosition());
        ijapa.changePenPosition(PenPosition.DOWN);
        assertEquals(PenPosition.DOWN, ijapa.getPen().getPosition());
   }

    @Test
    void changePenPositionFromDownToUp(){
        assertEquals(PenPosition.UP, ijapa.getPen().getPosition());
        ijapa.changePenPosition(PenPosition.DOWN);
        assertEquals(PenPosition.DOWN, ijapa.getPen().getPosition());
        ijapa.changePenPosition(PenPosition.UP);
        assertEquals(PenPosition.UP, ijapa.getPen().getPosition());
    }

    @Test
    void turnRightFromEast(){
        ijapa.setDirection(CardinalPoint.EAST);
        ijapa.turnRight();
        assertEquals(CardinalPoint.SOUTH, ijapa.getDirection());
    }

    @Test
    void turnRightFromSouth(){
        ijapa.setDirection(CardinalPoint.SOUTH);
        ijapa.turnRight();
        assertEquals(CardinalPoint.WEST, ijapa.getDirection());
    }

    @Test
    void turnRightFromWest(){
        ijapa.setDirection(CardinalPoint.WEST);
        ijapa.turnRight();
        assertEquals(CardinalPoint.NORTH, ijapa.getDirection());
    }

    @Test
    void turnRightFromNorth(){
        ijapa.setDirection(CardinalPoint.NORTH);
        ijapa.turnRight();
        assertEquals(CardinalPoint.EAST, ijapa.getDirection());
    }

    @Test
    void turnLeftFromEast(){
        ijapa.setDirection(CardinalPoint.EAST);
        ijapa.turnleft();
        assertEquals(CardinalPoint.NORTH, ijapa.getDirection());
    }

    @Test
    void turnLeftFromNorth(){
        ijapa.setDirection(CardinalPoint.NORTH);
        ijapa.turnleft();
        assertEquals(CardinalPoint.WEST, ijapa.getDirection());
    }

    @Test
    void turnLeftFromWest(){
        ijapa.setDirection(CardinalPoint.WEST);
        ijapa.turnleft();
        assertEquals(CardinalPoint.SOUTH, ijapa.getDirection());
    }

    @Test
    void turnLeftFromSouth(){
        ijapa.setDirection(CardinalPoint.SOUTH);
        ijapa.turnleft();
        assertEquals(CardinalPoint.EAST, ijapa.getDirection());
    }


    @Test
    void moveForwardFromEast(){
        assertEquals(CardinalPoint.EAST, ijapa.getDirection());
        assertEquals(0, ijapa.getXCoordinate());
        assertEquals(0, ijapa.getYCoordinate());
        ijapa.moveForward(12);
        assertEquals(11, ijapa.getXCoordinate());
        assertEquals(0, ijapa.getYCoordinate());
    }

    @Test
    void moveForwardFromSouth(){
        ijapa.setDirection(CardinalPoint.SOUTH);
        assertEquals(0, ijapa.getXCoordinate());
        assertEquals(0, ijapa.getYCoordinate());
        ijapa.moveForward(12);
        assertEquals(0, ijapa.getXCoordinate());
        assertEquals(11, ijapa.getYCoordinate());
    }

    @Test
    void moveForwardFromWest(){
        ijapa.setDirection(CardinalPoint.WEST);
        ijapa.setXCoordinate(11);
        assertEquals(11, ijapa.getXCoordinate());
        assertEquals(0, ijapa.getYCoordinate());
        ijapa.moveForward(12);
        assertEquals(0, ijapa.getXCoordinate());
        assertEquals(0, ijapa.getYCoordinate());
    }

    @Test
    void moveForwardFromNorth(){
        ijapa.setDirection(CardinalPoint.NORTH);
        ijapa.setYCoordinate(11);
        assertEquals(0, ijapa.getXCoordinate());
        assertEquals(11, ijapa.getYCoordinate());
        ijapa.moveForward(12);
        assertEquals(0, ijapa.getXCoordinate());
        assertEquals(0, ijapa.getYCoordinate());
    }

    @Test
    void moveForwardFromEastWithExcessSteps(){
        assertEquals(CardinalPoint.EAST, ijapa.getDirection());
        ijapa.setXCoordinate(10);
        assertEquals(10, ijapa.getXCoordinate());
        assertEquals(0, ijapa.getYCoordinate());
        ijapa.moveForward(12);
//      assertThrows
        assertEquals(10, ijapa.getXCoordinate());
        assertEquals(0, ijapa.getYCoordinate());
    }


}