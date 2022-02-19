package automation.practice.website;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;



public class AutomatedMain{

    public static void main(String[] args)  {
        System.setProperty("webdriver.edge.driver","C:\\Users\\shuva\\OneDrive\\Documents\\Browser driver\\msedgedriver.exe" );
        EdgeDriver driver = new EdgeDriver();

        driver.get("http://automationpractice.com/index.php");
        // Clicked on the sign in
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();


        // Create account
        Account acc1 = new Account("daviddba@gmail.com",
                "12347",
                "David",
                "DD",
                "Ebolali, Gulshan",
                "34533",
                "Alabama",
                "012819212",
                "Dhaka", driver);

        System.out.println("Object created   " +acc1.getFirstName());

        acc1.createAccount();


        //Sign Out here
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a")).click();


        // Clicked on the sign in
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();


        // Create account
        Account acc2 = new Account("rohanbaa@gmail.com",
                "12346",
                "Rohan",
                "RR",
                "Rbolali, Gulshan",
                "34533",
                "Alabama",
                "012819212",
                "Dhaka", driver);
        acc2.createAccount();

        //Sign Out here
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a")).click();


        // Clicked on the sign in
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();

        acc1.runCycle();

        acc2.runCycle();
    }


}
