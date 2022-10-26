package teste.senai;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteCursoSenai {
	private WebDriver driver;
	
	@Before
	public void ConfigurarTeste() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.quit();
	}
	
	@Test
	public void TesteNavegabilidade() {
		
		try {
			driver.get("https://informatica.sp.senai.br/");
			driver.findElement(By.id("Busca1_txtFiltro")).sendKeys("excel");
			driver.findElement(By.id("Busca1_btnBusca")).sendKeys(Keys.ENTER);
			Thread.sleep(3000);
		} catch (InterruptedException e){
			e.printStackTrace();
		}
	}
	
	@After
	public void FinalizarTeste() {
		driver.quit();
	}
}
