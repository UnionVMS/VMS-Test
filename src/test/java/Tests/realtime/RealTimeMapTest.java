package Tests.realtime;

import static org.junit.Assert.assertThat;
import java.io.IOException;
import java.util.Date;
import org.hamcrest.CoreMatchers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import Tests.TestBase;
import eu.europa.ec.fisheries.uvms.asset.client.model.AssetDTO;
import eu.europa.ec.fisheries.uvms.docker.validation.asset.AssetTestHelper;
import eu.europa.ec.fisheries.uvms.docker.validation.movement.LatLong;
import eu.europa.ec.fisheries.uvms.docker.validation.movement.MovementHelper;
import eu.europa.ec.fisheries.uvms.docker.validation.system.helper.NAFHelper;

public class RealTimeMapTest extends TestBase {

    @org.junit.jupiter.api.Test
    public void test() throws IOException, InterruptedException {
        AssetDTO asset = AssetTestHelper.createBasicAsset();
        
        NAFHelper.sendPositionToNAFPlugin(new LatLong(57d, 11d, new Date()), asset);
        MovementHelper.pollMovementCreated();

        WebElement searchBox = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.id("mat-input-3")));
        searchBox.sendKeys(asset.getName() + "\n");
        
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector(".mat-option-text"))).click();;

        WebElement menu = driver.findElement(By.id("realtime-right-column-menu"));
        menu.findElements(By.tagName("li")).get(1).click();
        
        WebElement assetInformation = driver.findElement(By.className("asset-information"));
        String ircs = assetInformation.findElements(By.tagName("div")).get(0).getText();
        
        assertThat(ircs, CoreMatchers.is(asset.getIrcs()));
//        WebElement canvas = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#realtime-map canvas")));
//        new Actions(driver).moveToElement(canvas).click().build().perform();
//      
//        TimeUnit.SECONDS.sleep(10);
    }
}
