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
    WebElement UgovorniElementiSpiskaPutnika;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[1]/fieldset/div/div[1]/div[1]/div/label")
    WebElement ListDateLabel;
    @FindBy(id= "Kol3")
    WebElement ListDate;

    WebElement Agency;
    @FindBy(id= "Kol1")
    WebElement AgencyList;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[1]/fieldset/div/div[2]/div[1]/div/label")
    WebElement IssuingTypeLabel;
    @FindBy(id= "Kol11")
    WebElement IssuingType;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[1]/fieldset/div/div[2]/div[2]/div/label")
    WebElement VariantLabel;
    @FindBy(id= "Kol2")
    WebElement Variant;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[1]/fieldset/div/div[2]/div[3]/div/label")
    WebElement DestinationLabel;
    @FindBy(id= "Kol4")
    WebElement Destination;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[1]/fieldset/div/div[1]/div[1]/div/label")
    WebElement DateOfContractingLabel;
    @FindBy(id= "Kol12")
    WebElement DateOfContracting;
    @FindBy(css= ".ui-state-active")
    WebElement DateOfContractingList;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[1]/fieldset/div/div[3]/div[2]/div/label")
    WebElement StartDateLabel;
    @FindBy(id= "Kol5")
    WebElement StartDate;
    @FindBy(css= ".ui-state-active")
    WebElement StartDateList;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[1]/fieldset/div/div[3]/div[3]/div/label")
    WebElement EndDateLabel;
    @FindBy(id= "Kol6")
    WebElement EndDate;
    @FindBy(css= ".ui-state-active")
    WebElement EndDateList;

    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[2]/fieldset/div[1]/div[1]/div/label")
    WebElement PackagesLabel;
    @FindBy(id= "Kol13")
    WebElement Packages;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[2]/fieldset/div[1]/div[2]/div/label")
    WebElement InsuranceSumLabel;
    @FindBy(id= "Kol14")
    WebElement InsuranceSum;
    @FindBy(xpath= "//*[@id='ContentPlaceHolder1_Kol8_uc_display_multi_row']/label")
    WebElement FileUploadLabel;
    @FindBy(xpath= "//*[@id='ContentPlaceHolder1_Kol8_uc_display_multi_row']/div/div[1]/div/div/input")
    WebElement FileUpload;
    @FindBy(xpath= "//*[@id='ContentPlaceHolder1_Kol8_uc_div2']/div/a")
    WebElement Find;
    @FindBy(xpath= "//*[@id='ContentPlaceHolder1_Kol8_uc_divButton2']/div/a")
    WebElement Send;
    @FindBy(id= "//*[@id='form1']/div[4]/div[2]/div/div/div[2]/fieldset/div[2]/div[2]/div/a")
    WebElement AddInsuree;

    
}
