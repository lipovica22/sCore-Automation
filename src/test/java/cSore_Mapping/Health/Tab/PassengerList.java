package cSore_Mapping.Health.Tab;

import cSore_Mapping.Common.Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PassengerList extends BasePage {
    public PassengerList(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[1]/fieldset/legend")
    WebElement ugovorniElementiSpiskaPutnika;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[1]/fieldset/div/div[1]/div[1]/div/label")
    WebElement listDateLabel;
    @FindBy(id= "Kol3")
    WebElement listDate;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[1]/fieldset/div/div[1]/div[2]/div/label")
    WebElement agency;
    @FindBy(id= "Kol1")
    WebElement agencyList;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[1]/fieldset/div/div[2]/div[1]/div/label")
    WebElement issuingTypeLabel;
    @FindBy(id= "Kol11")
    WebElement issuingType;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[1]/fieldset/div/div[2]/div[2]/div/label")
    WebElement variantLabel;
    @FindBy(id= "Kol2")
    WebElement variant;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[1]/fieldset/div/div[2]/div[3]/div/label")
    WebElement destinationLabel;
    @FindBy(id= "Kol4")
    WebElement destination;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[1]/fieldset/div/div[1]/div[1]/div/label")
    WebElement dateOfContractingLabel;
    @FindBy(id= "Kol12")
    WebElement dateOfContracting;
    @FindBy(css= ".ui-state-active")
    WebElement dateOfContractingList;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[1]/fieldset/div/div[3]/div[2]/div/label")
    WebElement startDateLabel;
    @FindBy(id= "Kol5")
    WebElement startDate;
    @FindBy(css= ".ui-state-active")
    WebElement startDateList;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[1]/fieldset/div/div[3]/div[3]/div/label")
    WebElement endDateLabel;
    @FindBy(id= "Kol6")
    WebElement endDate;
    @FindBy(css= ".ui-state-active")
    WebElement endDateList;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[2]/fieldset/div[1]/div[1]/div/label")
    WebElement packagesLabel;
    @FindBy(id= "Kol13")
    WebElement packages;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[2]/fieldset/div[1]/div[2]/div/label")
    WebElement insuranceSumLabel;
    @FindBy(id= "Kol14")
    WebElement insuranceSum;
    @FindBy(xpath= "//*[@id='ContentPlaceHolder1_Kol8_uc_display_multi_row']/label")
    WebElement fileUploadLabel;
    @FindBy(xpath= "//*[@id='ContentPlaceHolder1_Kol8_uc_display_multi_row']/div/div[1]/div/div/input")
    WebElement fileUpload;
    @FindBy(xpath= "//*[@id='ContentPlaceHolder1_Kol8_uc_div2']/div/a")
    WebElement find;
    @FindBy(xpath= "//*[@id='ContentPlaceHolder1_Kol8_uc_divButton2']/div/a")
    WebElement send;
    @FindBy(id= "//*[@id='form1']/div[4]/div[2]/div/div/div[2]/fieldset/div[2]/div[2]/div/a")
    WebElement addInsuree;
}
