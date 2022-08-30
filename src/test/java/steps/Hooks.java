package steps;


import io.cucumber.java.*;

public class Hooks
{
    @BeforeAll
    public static void beforeAll() {
        System.out.println("@BeforeAll - Create DB connect");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("@AfterAll - Close DB connect");
    }
    @Before(order = 0) // Defining execution order
    public void setUp() {
        System.out.println("@BeforeHook - Launching browser");
    }

    @Before(order = 1) // Defining execution order
    public void setUpSecond() {
        System.out.println("@BeforeHook - Launching browser 2");
    }

    @After(order = 0) // Defining execution order
    public void tearDown() {
        System.out.println("@AfterHook - Quit browser");
    }

    @After(order = 1) // Defining execution order
    public void tearDownSecond() {
        System.out.println("@AfterHook - Quit browser 2");
    }

    @BeforeStep
    public void beforeStep() {
        System.out.println("@BeforeStep - Add a log");
    }

    @AfterStep
    public void AfterStep() {
        System.out.println("@AfterStep - Remove a log");
    }

    @Before("@staging") // Defining execution tag hooks
    public void setUpByTag() {
        System.out.println("@BeforeHookTag - Launching browser");
    }

    @After("@staging") // Defining execution tag hooks
    public void tearDownByTag() {
        System.out.println("@AftereHookTag - Closing browser");
    }
}
