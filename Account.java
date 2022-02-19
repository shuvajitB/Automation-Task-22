package automation.practice.website;


import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.grid.graphql.Session;
//import org.openqa.selenium.interactions.Actions;


public class Account {
    private String email, pass, firstName, lastName, Addr, postalCode, state, phone_num, city;
    public EdgeDriver driver;

    public String getEmail() {
        return email;
    }

    public String getPass() {
        return pass;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddr() {
        return Addr;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getState() {
        return state;
    }

    public String getPhone_num() {
        return phone_num;
    }

    public String getCity() {
        return city;
    }

    public Account(String email, String pass, String firstName, String lastName, String Addr, String postalCode, String state, String phone_num, String city, EdgeDriver driver){
        this.driver = driver;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.Addr = Addr;
        this.postalCode = postalCode;
        this.pass = pass;
        this.city = city;
        this.state = state;
        this.phone_num = phone_num;
    }


    public void createAccount(){
        driver.findElement(By.id("email_create")).sendKeys(getEmail());
        driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"search_query_top\"]")).sendKeys("Hello World");
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("customer_firstname")));

        driver.findElement(By.id("customer_firstname")).sendKeys(getFirstName());

        driver.findElement(By.id("customer_lastname")).sendKeys(getLastName());
        driver.findElement(By.id("passwd")).sendKeys(getPass());
        driver.findElement(By.id("firstname")).sendKeys(getFirstName());
        driver.findElement(By.id("lastname")).sendKeys(getLastName());
        driver.findElement(By.id("address1")).sendKeys(getAddr());
        driver.findElement(By.id("city")).sendKeys(getCity());
        Select dropdown = new Select(driver.findElement(By.id("id_state")));
        dropdown.selectByVisibleText(getState());
        driver.findElement(By.id("postcode")).sendKeys(getPostalCode());
        driver.findElement(By.id("phone_mobile")).sendKeys(getPhone_num());
        driver.findElement(By.id("newsletter-input")).sendKeys(getEmail());

        driver.findElement(By.xpath(" //*[@id=\"submitAccount\"]")).click();
    }



    public void runCycle(){
        driver.findElement(By.id("email")).sendKeys(getEmail());
        driver.findElement(By.id("passwd")).sendKeys(getPass());
        driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"subcategories\"]/ul/li[1]/h5/a")).click();
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[1]")).click();

        driver.navigate().refresh();
        driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"layered_id_attribute_group_14\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[1]")).click();
        driver.navigate().refresh();
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a")).click();
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button")).click();
        driver.findElement(By.xpath("//*[@id=\"cgv\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"form\"]/p/button")).click();
        driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[2]/div/p/a")).click();
        driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button")).click();
        // SignOut
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a")).click();
    }


}