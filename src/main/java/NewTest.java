import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class NewTest {

    public static void main(String args[]) throws InterruptedException {


//        method1();
      //  method2();
        method3();


    }

    @Test
    public static void method1(){

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();

        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'COMPOSE')]")));



        driver.findElement(By.xpath("//button[@data-cookiebanner='accept_button']")).click();



        String email = "//input[@name='email']";

        String pass = "//input[@name='pass']";
        String login = "//button[@name='login']";




        driver.findElement(By.xpath(email)).sendKeys("sonia_chowdhary@hotmail.com");



        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.xpath(pass)).sendKeys("Anaya2017.");
        driver.findElement(By.xpath(login)).click();







    }

    @Test
    public static void method2() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();

        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//div[text()='Accept all']")).click();


        Thread.sleep(20000);


        driver.findElement(By.name("q")).sendKeys("London");

        Thread.sleep(3000);
    }
    @Test
    public static void method3() throws InterruptedException {

            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();

            options.addArguments("--remote-allow-origins=*");
            WebDriver driver = new ChromeDriver(options);
            driver.get("https://www.google.com/");
            driver.manage().window().maximize();

            driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

           driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);

            driver.manage().timeouts().implicitlyWait(5, TimeUnit.HOURS);

            driver.findElement(By.xpath("//div[text()='Accept all']")).click();


            driver.findElement(By.name("q")).sendKeys("Edureka");


            Thread.sleep(20000);




    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Called : beforeMethod");
        Reporter.log("Called : beforeMethodx");

    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("Called : afterMethod");
        Reporter.log("Called : afterMethod");

    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("Called : beforeClass");
        Reporter.log("Called : beforeClass");

    }

    @AfterClass
    public void afterClass(){
        System.out.println("Called : afterClass");
        Reporter.log("Called : afterClass");

    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("Called : beforeTest");
        Reporter.log("Called : beforeTest");

    }
    @AfterTest
    public void afterTest(){
        System.out.println("Called : afterTest");
        Reporter.log("Called : afterTest");

    }
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Called : beforeSuite");
        Reporter.log("Called : beforeSuite");

    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("Called : afterSuite");

        Reporter.log("Called : afterSuite");

    }

}