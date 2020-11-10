package testing;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    private Circle circle;
    @BeforeAll
    static void startingCircleTestMessage(){
        System.out.println("Start CircleTest");
    }


    @BeforeEach
    void setCircle() {
        circle = new Circle(15);
        System.out.println("Starting single test - set Circle with radius :" + circle.getRadius());
    }


    @AfterEach
    void messageAfterSingleTest() {
        System.out.println("After single test case");
    }

    @AfterAll
    static void messageAllTests() {
        System.out.println("Finishing CircleTest");
    }


    @Test
    void IllegalArgumentExceptionWhenCreateCircleWithNegativeRadius() {
        //Given
        double radius = -2;

        //When
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                new Circle(radius));

        String expectedMessage = "Invalid radius : " + radius;
        String actualMessage = exception.getMessage();

        //Then
        assertTrue(actualMessage.contains(expectedMessage));

    }


    @Test
    void calculateArea() {
        assertEquals(circle.calculateArea(), Math.PI * Math.sqrt(circle.getRadius()));

    }

    @Test
    void calculateCircumference() {
        assertEquals(circle.calculateCircumference(), 2 * Math.PI * circle.getRadius());
    }

    @Test
    void getRadius() {
        assertEquals(circle.getRadius(), 15);
    }

    @Test
    void updateRadiusWithPositiveValue() {
        circle.updateRadius(2);
        assertEquals(circle.getRadius(), 2);
    }

    @Test
    void updateRadiusWithNegativeValue() {
        circle.updateRadius(-2);
        assertEquals(circle.getRadius(), 15);
    }
}