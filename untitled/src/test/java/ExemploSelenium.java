import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class ExemploSelenium {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito"); // abre em modo anônimo
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://demo.automationtesting.in/Register.html");
        driver.manage().window().maximize();

        //Selecionar o primeiro nome
        driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Ingrid");
        //Selecionar Segund nome
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Lorrane");
        //Preencher endereço
        driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/textarea[1]")).sendKeys("Rua pardal");
        //Preencher email
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("ingrid@gmail.com.com");
        //Preencher telefone
        driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("1234567890");
        //Selecionar sexo
        driver.findElement(By.xpath("//input[@value='FeMale']")).click();
        //Selecionar hobby
        driver.findElement(By.xpath("//input[@id='checkbox3']")).click();
        //Expandir lista
        driver.findElement(By.xpath("//div[@id='msdd']")).click();
        //Clicar no idioma
        Thread.sleep(1000); //Tempo para garantir que a lista foi carregada
        driver.findElement(By.xpath("//a[normalize-space()='Arabic']")).click();
        //Clicar fora da tela
        driver.findElement(By.xpath("//div[@class='container center']")).click();
        //Clicar em skills
        driver.findElement(By.xpath("//select[@id='Skills']")).click();
        //Selecionar skills
        Select select = new Select(driver.findElement(By.xpath("//select[@id='Skills']")));
        select.selectByVisibleText("Java");
        //Clicar fora da tela
        driver.findElement(By.xpath("//div[@class='container center']")).click();
        //Selecionar country
        driver.findElement(By.xpath("//span[@role='combobox']")).click();
        driver.findElement(By.xpath("//li[contains(text(),'Bangladesh')]")).click();
        //Selecionar data de aniversário
        driver.findElement(By.xpath("//select[@id='yearbox']")).click();
        Select select2 = new Select(driver.findElement(By.xpath("//select[@id='yearbox']")));
        select2.selectByVisibleText("1993");
        driver.findElement(By.xpath("//div[@class='container center']")).click();
        //Selecionar mes
        driver.findElement(By.xpath("//select[@placeholder='Month']")).click();
        Select select3 = new Select(driver.findElement(By.xpath("//select[@placeholder='Month']")));
        select3.selectByVisibleText("January");
        driver.findElement(By.xpath("//div[@class='container center']")).click();
        //Selecionar dia
        driver.findElement(By.xpath("//select[@placeholder='Day']")).click();
        Select select4 = new Select(driver.findElement(By.xpath("//select[@placeholder='Day']")));
        select4.selectByVisibleText("1");
        driver.findElement(By.xpath("//div[@class='container center']")).click();
        //Adicionar senha
        driver.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys("123");
        driver.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys("123");
        //Clicar em salvar
        driver.findElement(By.xpath("//button[@id='submitbtn']")).click();
            }
}
