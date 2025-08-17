import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExemploSelenium {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
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
        driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("89326365");
        //Selecionar sexo
        driver.findElement(By.xpath("//input[@value='FeMale']")).click();
        //Selecionar hobby
        driver.findElement(By.xpath("//input[@id='checkbox3']")).click();
        //Expandir lista
        driver.findElement(By.xpath("//div[@id='msdd']")).click();
        //Clicar no idioma
        driver.findElement(By.xpath("//a[normalize-space()='Arabic']")).click();
        Thread.sleep(1000); //Tempo para garantir que a lista foi carregada
        //Clicar fora da tela
        driver.findElement(By.xpath("//div[@class='container center']")).click();
    }
}
