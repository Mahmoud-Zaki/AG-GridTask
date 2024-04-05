package Pages;

import Base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

public class HomePage extends BaseClass {
    final private By gameNameSearchInputField = By.xpath("//input[@aria-label='Game Name Filter Input']");
    final private By resultRows = By.cssSelector(".ag-row");
    final private String mayBreakDownValueJSLocator = "return document.querySelector('.ag-cell[col-id=\"may\"]').innerText";

    public void enterGameNameToSearch(String gameName){
        sendKeys(gameNameSearchInputField,gameName);
    }

    public int getResultsCount(){
        List<WebElement> results = getWebElements(resultRows);
        return results.size();
    }

    public String getMayBreakDown(){
        zoom(50);
        String value =  getTextUsingJSExecutor(mayBreakDownValueJSLocator);
        zoom(100);
        return value;
    }
}