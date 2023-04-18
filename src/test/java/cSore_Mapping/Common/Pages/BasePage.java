package cSore_Mapping.Common.Pages;

import core_class.GridContols.GridDataCollection;
import core_class.WaitTime;
import io.qameta.allure.Allure;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import io.qameta.allure.model.Status;
import org.testng.asserts.SoftAssert;
import tests.BaseTest;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class BasePage {

    public BasePage(WebElement webElement) {
        this.webElement = webElement ;
    }

    public WebElement getWebElement() {
        return webElement;
    }

    public void setWebElement(WebElement webElement) {
        this.webElement = webElement;
    }
    public WebDriver driver;
    public WebDriverWait webDriverWait;
    int waitTime = 30;
    int maxRetries = 3;
    public List<GridDataCollection> listGridDataCollection = new ArrayList<>();
    public static WebElement webElement;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    //------------------------- Methods -------------------------
    public void Click(WebElement element, String log) throws Exception {
        webDriverWait = new WebDriverWait(driver, waitTime);
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();

        int retryCount = 0;

        while (retryCount < maxRetries){
            try {
                webDriverWait.until(ExpectedConditions.visibilityOf(element));
                webDriverWait.until(ExpectedConditions.elementToBeClickable(element));
                actions.moveToElement(element).build().perform(); //hover
                element.click();
                System.out.println("Clicked: " + log);
                break;
            } catch (Exception e) {
                retryCount++;
                System.out.println(retryCount + ". attempt >>>>> Click failed: " + log);
                if (retryCount == maxRetries) {
                    failOnControl(e);
                    throw new Exception("Failed to Click on element: " + log);
                }
            }
        }
    }

    public void ClickL(WebElement element, String log) throws Exception {
        webDriverWait = new WebDriverWait(driver, waitTime);
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();

        int retryCount = 0;

        while (retryCount < maxRetries){
            try {
                webDriverWait.until(ExpectedConditions.visibilityOf(element));
                webDriverWait.until(ExpectedConditions.elementToBeClickable(element));
                actions.moveToElement(element).build().perform(); //hover
                element.click();
                System.out.println("Clicked: " + log);
                break;
            } catch (Exception e) {
                retryCount++;
                System.out.println(retryCount + ". attempt >>>>> ClickL failed: " + log);
                if (retryCount == maxRetries) {
                    failOnControl(e);
                    throw new Exception("Failed to ClickL on element: " + log);
                }
            }
        }
    }

    public void ClickUploadDocuments(WebElement element, String log) throws Exception {
        webDriverWait = new WebDriverWait(driver, waitTime);
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();

        int retryCount = 0;

        while (retryCount < maxRetries){
            try {
                webDriverWait.until(ExpectedConditions.visibilityOf(element));
                webDriverWait.until(ExpectedConditions.elementToBeClickable(element));
                actions.moveToElement(element).build().perform(); //hover
                element.click();
                core_class.WaitTime.WaitForElementNotToBeVisible(driver, "id", "UploadedDocumentsListView_tbl1");
                //TODO: dodati WaitTime.PageWaitTime();
                System.out.println("Clicked: " + log);
                break;
            } catch (Exception e) {
                retryCount++;
                System.out.println(retryCount + ". attempt >>>>> ClickUploadDocuments failed: " + log);
                if (retryCount == maxRetries) {
                    failOnControl(e);
                    throw new Exception("Failed to ClickUploadDocuments on element: " + log);
                }
            }
        }
    }

    public void ClickWithScroll(WebElement element, String log) throws Exception {
        webDriverWait = new WebDriverWait(driver, waitTime);
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();

        int retryCount = 0;

        while (retryCount < maxRetries){
            try {
                webDriverWait.until(ExpectedConditions.visibilityOf(element));
                webDriverWait.until(ExpectedConditions.elementToBeClickable(element));
                actions.moveToElement(element).build().perform(); //hover
                ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, -document.body.scrollHeight)");
                Click(element);
                System.out.println("Clicked: " + log);
                break;
            } catch (Exception e) {
                retryCount++;
                System.out.println(retryCount + ". attempt >>>>> ClickWithScroll failed: " + log);
                if (retryCount == maxRetries) {
                    failOnControl(e);
                    throw new Exception("Failed to ClickWithScroll on element: " + log);
                }
            }
        }
    }

    public void ClickMenu(WebElement element, String log, String elementName) throws Exception {
        webDriverWait = new WebDriverWait(driver, waitTime);
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();

        int retryCount = 0;

        while (retryCount < maxRetries){
            try {
                webDriverWait.until(ExpectedConditions.visibilityOf(element));
                webDriverWait.until(ExpectedConditions.elementToBeClickable(element));
                actions.moveToElement(element).build().perform(); //hover
                List<WebElement> menuList = driver.findElements(By.tagName("a"));

                for ( WebElement elem : menuList) {
                    if (elem.getText().equals(elementName)) {
                        elem.click();
                        System.out.println("Clicked on left menu: " + log);
                        break;
                    }
                }
                System.out.println("Clicked: " + log);
                break;
            } catch (NotFoundException ex) {
                failOnControl(ex);
                throw new NotFoundException("Menu Control Click Issue.", ex);}
            catch (Exception e) {
                retryCount++;
                System.out.println(retryCount + ". attempt >>>>> ClickWithScroll failed: " + log);
                if (retryCount == maxRetries) {
                    failOnControl(e);
                    throw new Exception("Failed to ClickWithScroll on element: " + log);
                }
            }
        }
    }

    public void ClickCheckbox(WebElement checkbox, String log) throws Exception {
        int retryCount = 0;

        while (retryCount < maxRetries){
            try {
                if (!checkbox.isSelected()) {
                    JavascriptExecutor executor = (JavascriptExecutor) driver;
                    executor.executeScript("arguments[0].click();", checkbox);
                    System.out.println("Checked checkbox: " + log);
                    break;
                }
            } catch (Exception e) {
                retryCount++;
                System.out.println(retryCount + ". attempt >>>>> ClickCheckbox failed: " + log);
                if (retryCount == maxRetries) {
                    failOnControl(e);
                    throw new Exception("Failed to ClickCheckbox on element: " + log);
                }
            }
        }
    }
    public void UNClickCheckbox(WebElement checkbox, String log) throws Exception {
        int retryCount = 0;

        while (retryCount < maxRetries){
            try {
                if (checkbox.isSelected()) {
                    //JavascriptExecutor executor = (JavascriptExecutor) driver;
                    checkbox.click();
                    //executor.executeScript("arguments[0].click();", checkbox);
                    System.out.println("Unchecked checkbox: " + log);
                    break;
                }
            } catch (Exception e) {
                retryCount++;
                System.out.println(retryCount + ". attempt >>>>> ClickCheckbox failed: " + log);
                if (retryCount == maxRetries) {
                    failOnControl(e);
                    throw new Exception("Failed to ClickCheckbox on element: " + log);
                }
            }
        }
    }

    public String GetSelectedItem(WebElement element, String log) throws Exception {
        webDriverWait = new WebDriverWait(driver, waitTime);
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();

        try {
            Select select = new Select(element);
            WebElement option = select.getFirstSelectedOption();
            return option.getText();

        }catch(Exception e){
            System.out.println("GetProperty failed: " + log);

            failOnControl(e);
            throw new Exception("Failed to SetValueCalendar on element: " + log);
        }
    }

    public String GetProperty(WebElement element, String log, String value) throws Exception {
        webDriverWait = new WebDriverWait(driver, waitTime);
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();

        try {
            return element.getAttribute(value); //TODO: Ne postoji GetProperty metoda u Javi, proveriti za getAttribute

        }catch(Exception e){
            System.out.println("GetProperty failed: " + log);

            failOnControl(e);
            throw new Exception("Failed to GetProperty on element: " + log);
        }
    }

    public String GetText(WebElement element, String log) throws Exception {
        webDriverWait = new WebDriverWait(driver, waitTime);
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();

        try {
            return element.getText();

        }catch(Exception e){

            System.out.println("GetText failed: " + log);

            failOnControl(e);
            throw new Exception("Failed to GetText on element: " + log);
        }
    }

    public List<String> GetAllOptionValue(WebElement element, String log) throws Exception {
        try{
            Select select = new Select(element);
            List<WebElement> elements = select.getOptions();
            List<String> stringList = new ArrayList<String>();

            for(WebElement elem: elements){
                stringList.add(elem.getText());
            }

            return stringList;

        }catch(Exception e){
            System.out.println("GetAllOptionValue failed: " + log);

            failOnControl(e);
            throw new Exception("Failed to GetAllOptionValue on element: " + log);
        }
    }

    public List<String> GetAllLiTagValueClauses(WebElement element, String log) throws Exception {
        try{
            List<String> stringList = new ArrayList<String>();
            List<WebElement> optionsToSelect = element.findElements(By.tagName("li"));
            List<WebElement> helperList = new ArrayList<WebElement>();
            helperList.addAll(optionsToSelect);
            WebElement webElement = null;

            List<WebElement> counterElement = element.findElements(By.id("chk_box_list_4"));

            if (counterElement.size() != 0){
                webElement = element.findElement(By.id("chk_box_list_4"));

                helperList.add(webElement);

                for (WebElement option: helperList) {
                    stringList.add(option.getText());
                }
            }

            return stringList;

        }catch(Exception e){
            System.out.println("GetAllLiTagValueClauses failed: " + log);

            failOnControl(e);
            throw new Exception("Failed to GetAllLiTagValueClauses on element: " + log);
        }
    }

    public String GetCurentTimeDate() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);
    }

    public boolean IsEnabled(WebElement element, String log) throws Exception {
        try {
            return element.isEnabled();
        } catch (Exception e) {
            System.out.println("IsEnabled failed: " + log);

            failOnControl(e);
            throw new Exception("Failed to IsEnabled on element: " + log);
        }
    }

    public boolean IsChecked(WebElement element, String log) throws Exception {
        try {
            return element.isSelected();
        } catch (Exception e) {
            System.out.println("IsChecked failed: " + log);

            failOnControl(e);
            throw new Exception("Failed to IsChecked on element: " + log);
        }
    }

    public boolean IsVisiable(WebElement element, String log) throws Exception {
        try {
            return element.isDisplayed();
        } catch (Exception e) {
            System.out.println("IsVisiable failed: " + log);

            failOnControl(e);
            throw new Exception("Failed to IsVisiable on element: " + log);
        }
    }

    public void ScrollDown() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    public void ScrollUp() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, -document.body.scrollHeight)");
    }

    public void SetValuePackage(WebElement element, String log, String value) throws Exception {
        webDriverWait = new WebDriverWait(driver, waitTime);
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();

        int retryCount = 0;

        while (retryCount < maxRetries){
            try{
                element.sendKeys(value);

                System.out.println("SetValuePackage: " + log);

                break;
            }catch(Exception e){
                retryCount++;

                System.out.println(retryCount + ".attempt >>>>> SetValuePackage failed: " + log);

                if (retryCount == maxRetries) {
                    failOnControl(e);
                    throw new Exception("Failed to SetValuePackage on element: " + log);
                }
            }
        }
    }

    public void SetValue(WebElement element, String log, String value) throws Exception {
        webDriverWait = new WebDriverWait(driver, waitTime);
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();

        int retryCount = 0;

        while (retryCount < maxRetries){
            try{
                Click(element);
                element.clear();
                element.sendKeys(value);

                System.out.println("SetValue: " + log);

                break;
            }catch(Exception e){
                retryCount++;

                System.out.println(retryCount + ".attempt >>>>> SetValue failed: " + log);

                if (retryCount == maxRetries) {
                    failOnControl(e);
                    throw new Exception("Failed to SetValue on element: " + log);
                }
            }
        }
    }

    public void SetValueDate(WebElement element, String log, String value) throws Exception {
        webDriverWait = new WebDriverWait(driver, waitTime);
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();

        int retryCount = 0;

        while (retryCount < maxRetries){
            try {
                Click(element);
                element.sendKeys(value);
                element.sendKeys(Keys.ENTER);
                //TODO: dodati WaitTime.NextElementWaitTime();

                System.out.println("SetValueDate: " + log);
                break;
            }catch(Exception e){
                retryCount++;

                System.out.println(retryCount + ".attempt >>>>> SetValueDate failed: " + log);

                if (retryCount == maxRetries) {
                    failOnControl(e);
                    throw new Exception("Failed to SetValueDate on element: " + log);
                }
            }
        }
    }

    public void SetValueStrNumGenerator(WebElement element, String log, String firstElements, int number) throws Exception {
        webDriverWait = new WebDriverWait(driver, waitTime);
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();

        int retryCount = 0;

        while (retryCount < maxRetries){
            String randomString = core_class.UtilityProcAndFunc.GetRandomNumber(number);

            try {
                String chassisNumber = firstElements + randomString;
                Click(element);
                element.sendKeys(chassisNumber);

                System.out.println("SetValueStrNumGenerator: " + log);
                break;
            }catch(Exception e){
                retryCount++;

                System.out.println(retryCount + ".attempt >>>>> SetValueStrNumGenerator failed: " + log);

                if (retryCount == maxRetries) {
                    failOnControl(e);
                    throw new Exception("Failed to SetValueStrNumGenerator on element: " + log);
                }
            }
        }
    }

    public void SetValueWithEnter(WebElement element, String log, String value) throws Exception {
        webDriverWait = new WebDriverWait(driver, waitTime);
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();

        int retryCount = 0;

        while (retryCount < maxRetries){
            try {
                Click(element);
                element.clear();
                element.sendKeys(value);
                element.sendKeys(Keys.ENTER);

                System.out.println("SetValueWithEnter: " + log);
                break;
            }catch(Exception e){
                retryCount++;

                System.out.println(retryCount + ".attempt >>>>> SetValueWithEnter failed: " + log);

                if (retryCount == maxRetries) {
                    failOnControl(e);
                    throw new Exception("Failed to SetValueWithEnter on element: " + log);
                }
            }
        }
    }

    public void SetValueWithEnterAndWait(WebElement element, String log, String value) throws Exception {
        webDriverWait = new WebDriverWait(driver, waitTime);
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();

        int retryCount = 0;

        while (retryCount < maxRetries){
            try {
                Click(element);
                element.clear();
                element.sendKeys(value);
                element.sendKeys(Keys.ENTER);
                //TODO: dodati WaitTime.NextElementWaitTime();

                System.out.println("SetValueWithEnterAndWait: " + log);
                break;
            }catch(Exception e){
                retryCount++;

                System.out.println(retryCount + ".attempt >>>>> SetValueWithEnterAndWait failed: " + log);

                if (retryCount == maxRetries) {
                    failOnControl(e);
                    throw new Exception("Failed to SetValueWithEnterAndWait on element: " + log);
                }
            }
        }
    }

    public void SetValueWithTab(WebElement element, String log, String value) throws Exception {
        webDriverWait = new WebDriverWait(driver, waitTime);
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();

        int retryCount = 0;

        while (retryCount < maxRetries){
            try {
                SetValue(element, log, value);
                element.sendKeys(Keys.TAB);

                System.out.println("SetValueWithTab: " + log);
                break;
            }catch(Exception e){
                retryCount++;

                System.out.println(retryCount + ".attempt >>>>> SetValueWithTab failed: " + log);

                if (retryCount == maxRetries) {
                    failOnControl(e);
                    throw new Exception("Failed to SetValueWithTab on element: " + log);
                }
            }
        }
    }

    public void SetValueWithCtrlA(WebElement element, String log, String value) throws Exception {
        webDriverWait = new WebDriverWait(driver, waitTime);
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();

        int retryCount = 0;

        while (retryCount < maxRetries){
            try {
                Click(element);
                element.sendKeys(Keys.CONTROL + "a");
                element.sendKeys(value);
                //TODO: dodati WaitTime.NextElementWaitTime();

                System.out.println("SetValueWithCtrlA: " + log);
                break;
            }catch(Exception e){
                retryCount++;

                System.out.println(retryCount + ".attempt >>>>> SetValueWithCtrlA failed: " + log);

                if (retryCount == maxRetries) {
                    new BaseTest().reporterScreenshot("Failed_SetValueWithCtrlA", "Failed SetValueWithCtrlA - " + log, driver);
                    failOnControl(e);
                }
            }
        }
    }

    public void SelectValueAC(WebElement element, WebElement elementList, String log, String value, String sel_value) throws Exception {
        webDriverWait = new WebDriverWait(driver, waitTime);
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();

        int retryCount = 0;

        while (retryCount < maxRetries){
            try {
                SetValue(element, log, value);
                boolean isClicked = false;

                List<WebElement> optionsToSelect = elementList.findElements(By.tagName("li"));

                for (WebElement option : optionsToSelect) {
                    if (option.getText().equals(sel_value)){
                        Click(option);
                        isClicked = true;
                        retryCount = 3;
                        System.out.println("SelectValueAC: " + log);
                        break;
                    }
                }

                if (!isClicked){
                    retryCount++;

                    System.out.println(retryCount + ".attempt >>>>> SelectValueAC failed: " + log);

                    if (retryCount == maxRetries){
                        new BaseTest().reporterScreenshot("Failed_SelectValueAC", "Failed SelectValueAC - " + log, driver);
                        throw new Exception("No such element to select");
                    }
                }

            }catch (Exception e){
                retryCount++;

                System.out.println(retryCount + ".attempt >>>>> SelectValueAC failed: " + log);

                if (retryCount == maxRetries) {
                    failOnControl(e);
                    throw new Exception("Failed to SelectValueAC on element: " + log);
                }
            }
        }
    }

    public void SelectValueACWithWait(WebElement element, String log, String value, String sel_value) throws Exception {
        webDriverWait = new WebDriverWait(driver, waitTime);
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();

        int retryCount = 0;

        while (retryCount < maxRetries){
            try {
                boolean isClicked = false;
                SetValue(element, log, value);

                try {
                    webDriverWait.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(By.className("ui-menu-item"))));
                }catch (Exception ignored){
                }

                List<WebElement> optionsToSelect = driver.findElements(By.className("ui-menu-item"));

                for (WebElement option : optionsToSelect) {
                    if (option.getText().equals(sel_value)){
                        //TODO: dodati WaitTime.NextElementWaitTime();
                        option.click();
                        //TODO: dodati WaitTime.NextElementWaitTime();
                        isClicked = true;
                        retryCount = 3;
                        System.out.println("SelectValueACWithWait: " + log);
                        break;
                    }
                }

                if (!isClicked){
                    retryCount++;

                    if (retryCount == maxRetries){
                        failOnControl(new Exception("No such element to select"));
                        throw new Exception("No such element to select");
                    }
                }

            }catch (Exception e){
                retryCount++;

                System.out.println(retryCount + ".attempt >>>>> SelectValueACWithWait failed: " + log);

                if (retryCount == maxRetries) {
                    failOnControl(e);
                    throw new Exception("Failed to SelectValueACWithWait on element: " + log);
                }
            }
        }
    }

    public void SelectValueAC_ItemName(WebElement element, String log, String sel_value) throws Exception {
        webDriverWait = new WebDriverWait(driver, waitTime);
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();

        int retryCount = 0;

        while (retryCount < maxRetries){
            try {
                boolean isClicked = false;

                try {
                    webDriverWait.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(By.className("myClassItemName"))));
                }catch (Exception ignored){
                }

                List<WebElement> optionsToSelect = driver.findElements(By.className("myClassItemName"));

                for (WebElement option : optionsToSelect) {
                    if (option.getText().equals(sel_value)){
                        Click(option);
                        isClicked = true;
                        retryCount = 3;
                        System.out.println("SelectValueAC_ItemName: " + log);
                        break;
                    }
                }

                if (!isClicked){
                    retryCount++;

                    if (retryCount == maxRetries){
                        failOnControl(new Exception("No such element to select"));
                        throw new Exception("No such element to select");
                    }
                }

            }catch (Exception e){
                retryCount++;

                System.out.println(retryCount + ".attempt >>>>> SelectValueAC_ItemName failed: " + log);

                if (retryCount == maxRetries) {
                    failOnControl(e);
                    throw new Exception("Failed to SelectValueAC_ItemName on element: " + log);
                }
            }
        }
    }

    public void SelectOption(WebElement element, String log, String sel_option) throws Exception {
        webDriverWait = new WebDriverWait(driver, waitTime);
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();

        int retryCount = 0;

        while (retryCount < maxRetries){
            try {
                Click(element);
                boolean isClicked = false;

                List<WebElement> optionsToSelect = element.findElements(By.cssSelector("option"));

                for (WebElement option : optionsToSelect) {
                    if (option.getText().equals(sel_option)){
                        option.click();
                        isClicked = true;
                        retryCount = 3;
                        System.out.println("SelectOption: " + log);
                        break;
                    }
                }

                if (!isClicked){
                    retryCount++;

                    if (retryCount == maxRetries){
                        failOnControl(new Exception("No such element to select"));
                        throw new Exception("No such element to select");
                    }
                }

            }catch (Exception e){
                retryCount++;

                System.out.println(retryCount + ".attempt >>>>> SelectOption failed: " + log);

                if (retryCount == maxRetries) {
                    failOnControl(e);
                    throw new Exception("Failed to SelectOption on element: " + log);
                }
            }
        }
    }

    public void SelectOptionWithWait(WebElement element, String log, String sel_option) throws Exception {
        webDriverWait = new WebDriverWait(driver, waitTime);
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();

        int retryCount = 0;

        while (retryCount < maxRetries){
            try {
                boolean isClicked = false;
                Click(element);

                try {
                    webDriverWait.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(By.cssSelector("option"))));
                }catch (Exception ignored){
                }

                List<WebElement> optionsToSelect = driver.findElements(By.cssSelector("option"));

                for (WebElement option : optionsToSelect) {
                    if (option.getText().equals(sel_option)){
                        //TODO: dodati WaitTime.NextElementWaitTime();
                        Click(option);
                        //TODO: dodati WaitTime.NextElementWaitTime();
                        isClicked = true;
                        retryCount = 3;
                        System.out.println("SelectOptionWithWait: " + log);
                        break;
                    }
                }

                if (!isClicked){
                    retryCount++;

                    if (retryCount == maxRetries){
                        failOnControl(new Exception("No such element to select"));
                        throw new Exception("No such element to select");
                    }
                }

            }catch (Exception e){
                retryCount++;

                System.out.println(retryCount + ".attempt >>>>> SelectOptionWithWait failed: " + log);

                if (retryCount == maxRetries) {
                    failOnControl(e);
                    throw new Exception("Failed to SelectOptionWithWait on element: " + log);
                }
            }
        }
    }


    public void SelectOptionLi(WebElement element, String log, String sel_option) throws Exception {
        webDriverWait = new WebDriverWait(driver, waitTime);
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();

        int retryCount = 0;

        while (retryCount < maxRetries){
            try {
                boolean isClicked = false;
                Click(element);

                try {
                    webDriverWait.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(By.cssSelector("li"))));
                }catch (Exception ignored){
                }

                List<WebElement> optionsToSelect = driver.findElements(By.cssSelector("li"));

                for (WebElement option : optionsToSelect) {
                    if (option.getText().equals(sel_option)){
                        Click(option);
                        isClicked = true;
                        retryCount = 3;
                        System.out.println("SelectOptionLi: " + log);
                        break;
                    }
                }

                if (!isClicked){
                    retryCount++;

                    if (retryCount == maxRetries){
                        failOnControl(new Exception("No such element to select"));
                        throw new Exception("No such element to select");
                    }
                }

            }catch (Exception e){
                retryCount++;

                System.out.println(retryCount + ".attempt >>>>> SelectOptionLi failed: " + log);

                if (retryCount == maxRetries) {
                    failOnControl(e);
                    throw new Exception("Failed to SelectOptionLi on element: " + log);
                }
            }
        }
    }

    public void AreEqual(WebElement element, String log, String expected, SoftAssert softAssert) throws IOException {
        try {
            String actualResult = GetText(element, log);
            softAssert.assertEquals(actualResult, expected);
            System.out.println("AreEqual: " + log);
            Assert.assertEquals(actualResult, expected);
        }catch (AssertionError ex){
            failAssert(ex);
        }catch (Exception e){
            failOnControl(e);
        }
    }

    public void AreEqualMessage(WebElement element, String log, String expected, SoftAssert softAssert) throws IOException {
        try {
            String actualResult = "";
            String[] partsExpected = expected.split("\n");
            int counter = 0;

            List<String> stringList = GetAllLiTagValue(element, log);

            if (stringList.size() != 0){
                for (String searchElement: stringList){
                    actualResult = searchElement;
                    softAssert.assertEquals(actualResult, partsExpected[counter]);

                    if (!actualResult.equals(partsExpected[counter])){
                        try {
                            Assert.assertEquals(actualResult, partsExpected[counter]);
                        }catch (AssertionError ex){
                            failAssert(ex);
                        }
                    }

                    counter++;
                }
            }

            System.out.println("AreEqualMessage: " + log);
        }catch (Exception ex){
            new BaseTest().reporterScreenshot("NotEqualMessage", "Not equal message assert - " + log, driver);
        }
    }
    public void AreEqualURL(String log, String expectedUrl, SoftAssert softAssert) throws IOException {
        String actualUrl = driver.getCurrentUrl();

        try {
            softAssert.assertEquals(actualUrl, expectedUrl);
            System.out.println("AreEqual: " + log);
            Assert.assertEquals(actualUrl, expectedUrl);
        }catch (AssertionError ex){
            failAssert(ex);
        }catch (Exception ex){
            new BaseTest().reporterScreenshot("NotEqualMessage", "Not equal url assert - " + log, driver);
        }
    }

    public void AreEqualCheckBox(String log, String actualValue, String expectedValue, SoftAssert softAssert) throws IOException {
        try {
            softAssert.assertEquals(actualValue, expectedValue);
            System.out.println("AreEqual: " + log);
            Assert.assertEquals(actualValue, expectedValue);
        }catch (AssertionError ex){
            failAssert(ex);
        }catch (Exception ex){
            new BaseTest().reporterScreenshot("NotEqualMessage", "Not equal checkbox assert - " + log, driver);
        }
    }

    public List<String> GetAllLiTagValue(WebElement element, String log) throws IOException {
        String additionalId = "error_message_1";

        try {
            List<String> stringList = new ArrayList<>();
            List<WebElement> optionsToSelect = element.findElements(By.tagName("li"));

            List<WebElement> helperList = new ArrayList<>();
            helperList.addAll(optionsToSelect);
            WebElement webElement = null;

            try {
                if (optionsToSelect == null){
                    webElement = driver.findElement(By.id(additionalId));
                }
            } catch (NoSuchElementException ignored) {
            }

            if (webElement != null) {
                helperList.add(webElement);
            }

            for (WebElement option : helperList) {
                stringList.add(option.getText());
            }

            return stringList;
        } catch (NotFoundException ex) {
            throw new NotFoundException("List Control Get All Value Issue.", ex);
        }
    }



    public void gridPrinting(WebElement gridElement, String log, String expectedPrintValues) throws Exception {
        try {
            List<WebElement> rows = gridElement.findElements(By.tagName("tr"));

            String[] partsPrint = expectedPrintValues.split("\n");
            int counter = 0;

            for (WebElement row : rows) {
                List<WebElement> columns = row.findElements(By.tagName("td"));

                String data = "";

                for (WebElement column : columns) {
                    data += column.getText() + "\t";
                }

                if (data.contains(partsPrint[counter])) {

                    WebElement openPrintButton = row.findElement(By.tagName("a"));
                    openPrintButton.click();

                    WebElement printButton = row.findElement(By.xpath(".//a[contains(text(), 'Štampaj')]"));
                    Click(printButton, log + partsPrint[counter]);

                    WaitTime.WaitForElementNotToBeVisible(driver, "id", "modal_mask");
                    counter++;
                }
            }

        } catch (Exception e){
            failOnControl(e);
            throw new Exception("Failed to gridPrinting on element: " + log);
        }
    }

    //------------------------- End Methods -----------------------------------

    //------------------------- Start Private Methods -------------------------



    private void Click(WebElement element) throws Exception {
        webDriverWait = new WebDriverWait(driver, waitTime);
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();

        int retryCount = 0;

        while (retryCount < maxRetries){
            try {
                webDriverWait.until(ExpectedConditions.visibilityOf(element));
                //webDriverWait.until(ExpectedConditions.elementToBeClickable(element));
                actions.moveToElement(element).build().perform(); //hover

                element.click();

                break;
            } catch (Exception e) {
                retryCount++;

                System.out.println(retryCount + ".attempt >>>>> Click failed: " + e.getMessage());

                if (retryCount == maxRetries) {
                    new BaseTest().reporterScreenshot("Failed_Click", "Failed Click " + e.getMessage(), driver);
                    throw new Exception("Failed to Click on element: " + e.getMessage());
                }
            }
        }
    }

    private void failAssert(AssertionError ex){
        String currentUrl = driver.getCurrentUrl();
        Allure.step("Failed Assert", Status.FAILED);

        byte[] screenshotBytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        InputStream screenshotStream = new ByteArrayInputStream(screenshotBytes);

        Allure.addAttachment("Assertion Error Message", ex.getMessage());
        Allure.addAttachment("Screenshot", "image/png", screenshotStream, ".png");
        Allure.addAttachment("URL", currentUrl);
    }
    private void failOnControl(Exception ex){
        String currentUrl = driver.getCurrentUrl();
        Allure.step("Failed Assert", Status.FAILED);

        byte[] screenshotBytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        InputStream screenshotStream = new ByteArrayInputStream(screenshotBytes);

        Allure.addAttachment("Assertion Error Message", ex.getMessage());
        Allure.addAttachment("Screenshot", "image/png", screenshotStream, ".png");
        Allure.addAttachment("URL", currentUrl);
    }


    //------------------------- End Private Methods -------------------------
    @FindBy(id = "error_text")
    WebElement Error;
    @FindBy(id = "waring_text")
    WebElement Waring;
    @FindBy(id = "info_text")
    WebElement Info;

    public void WaringMessage(String valueMessageExpected, SoftAssert softAssert) throws IOException {
        AreEqualMessage(Waring, "Assert waring message", valueMessageExpected, softAssert);
    }

    public void ErrorMessage(String valueMessageExpected, SoftAssert softAssert) throws IOException {
        AreEqualMessage(Error, "Assert error message", valueMessageExpected, softAssert);
    }
    public void InfoMessage(String valueMessageExpected, SoftAssert softAssert) throws IOException {
        AreEqualMessage(Info, "Assert info message", valueMessageExpected, softAssert);
    }
}
