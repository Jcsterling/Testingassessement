import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import sun.awt.windows.WEmbeddedFrame;

public class OrangeEmployeesPage {

    @FindBy(xpath = "//*[@id=\"firstName\"]")
    private WebElement firstNames;

    @FindBy(xpath = "//*[@id=\"middleName\"]")
    private WebElement middleName;

    @FindBy(xpath = "//*[@id=\"lastName\"]")
    private WebElement lastName;

    @FindBy(xpath = "//*[@id=\"employeeId\"]")
    private WebElement employeeID;

    @FindBy(xpath = "//*[@id=\"location_inputfileddiv\"]/div/input")
    private WebElement location;

    @FindBy(xpath = "//*[@id=\"pimAddEmployeeForm\"]/div[1]/div/materializecss-decorator[3]/div/sf-decorator/div/label")
    private WebElement createLoginDetailsButton;

    @FindBy(xpath = "//*[@id=\"username\"]")
    private WebElement newUserName;

    @FindBy(xpath = "//*[@id=\"password\"]")
    private WebElement newPassword;

    @FindBy(xpath = "//*[@id=\"confirmPassword\"]")
    private WebElement confirmNewPassword;

    @FindBy(xpath = "//*[@id=\"adminRoleId_inputfileddiv\"]/div/input")
    private WebElement adminRole;

    @FindBy(xpath = "//*[@id=\"systemUserSaveBtn\"]")
    private WebElement saveButton;

    @FindBy(xpath = "//*[@id=\"employee_name_quick_filter_employee_list_value\"]")
    private WebElement search;

    @FindBy(xpath = "//*[@id=\"right-side\"]/header/div/nav/div/div/ul[2]/li[2]/a")
    private WebElement searchButton;

    @FindBy(xpath = "//*[@id=\"employee_name_quick_filter_employee_list_dropdown\"]/div[3]")
    private WebElement Employee;


    public void fillOutEmployeeDetails(){

        firstNames.sendKeys("B");
        middleName.sendKeys("L");
        lastName.sendKeys("Swagger");
        employeeID.sendKeys("0161Malone");
        location.sendKeys(Keys.ARROW_DOWN);
        location.sendKeys(Keys.ARROW_DOWN);
        location.sendKeys(Keys.ARROW_DOWN);
        location.sendKeys(Keys.ARROW_DOWN);
        location.sendKeys(Keys.ARROW_DOWN);
        location.sendKeys(Keys.ARROW_DOWN);
        location.sendKeys(Keys.ARROW_DOWN);
        location.sendKeys(Keys.ARROW_DOWN);
        location.sendKeys(Keys.ARROW_DOWN);
        location.sendKeys(Keys.ARROW_DOWN);
        location.sendKeys(Keys.ARROW_DOWN);
        location.sendKeys(Keys.ARROW_DOWN);
        location.sendKeys(Keys.ENTER);




    }

    public void chooseLoginDetails(){
        createLoginDetailsButton.click();

    }
   // public void waitforelement(){
       // WebDriver driver = new ChromeDriver();
       // driver.get("http://exampleURL");
       // WebElement myDynamicElement = (new WebDriverWait(driver, 10)) .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"firstName\"]")));
   // }

    public void createLoginDetails(){

        newUserName.sendKeys("BRUCE");
        newPassword.sendKeys("Pancakes47");
        confirmNewPassword.sendKeys("Pancakes47");
        adminRole.sendKeys(Keys.ARROW_DOWN);
        adminRole.sendKeys(Keys.ENTER); saveButton.click();
    }

    public void saveLoginDetails(){




    }

    public void searchEmployees(){

        search.sendKeys("B");
        // search.sendKeys(Keys.ARROW_DOWN);
        search.sendKeys(Keys.ENTER);
        Employee.click();


    }









}
