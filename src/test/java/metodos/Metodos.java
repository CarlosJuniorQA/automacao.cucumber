package metodos;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import driver.Navegador;

public class Metodos extends Navegador {
	
    public void inserirDados(By elemento, String texto) {
    	driver.findElement(elemento).sendKeys(texto);
    }
    
    public void clicar(By elemento) {
    	driver.findElement(elemento).click();
    }
    
    public void validarTexto(By elemento, String txtEsperado) {
    	assertEquals(driver.findElement(elemento).getText(),txtEsperado);
    }
    
}
