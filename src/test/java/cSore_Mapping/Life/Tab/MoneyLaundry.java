package cSore_Mapping.Life.Tab;

import cSore_Mapping.Common.Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MoneyLaundry extends BasePage {


    public MoneyLaundry(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath= "//*[@id='Kol1']/fieldset/legend")   WebElement questionnaire;

    @FindBy(css = "label[for='qnn_1_0']")   WebElement QNN_1_0Label;
    @FindBy(css = "label[for='qnn_1_0_0']")   WebElement QNN_1_0_0Label;
    @FindBy(id= "qnn_1_0_0")   WebElement QNN_1_0_0;
    @FindBy(css = "label[for='qnn_1_0_1']")   WebElement QNN_1_0_1Label;
    @FindBy(id= "qnn_1_0_1")   WebElement QNN_1_0_1;
    @FindBy(css = "label[for='qnn_1_0_2']")   WebElement QNN_1_0_2Label;
    @FindBy(id= "qnn_1_0_2")   WebElement QNN_1_0_2;
    @FindBy(css = "label[for='qnn_1_0_3_0']")   WebElement QNN_1_0_3_0Label;
    @FindBy(id= "qnn_1_0_3_0")   WebElement QNN_1_0_3_0Text;
    @FindBy(css = "label[for='qnn_1_0_3']")   WebElement QNN_1_0_3Label;
    @FindBy(id= "qnn_1_0_3")   WebElement QNN_1_0_3;

    @FindBy(css = "label[for='qnn_1_1']")   WebElement QNN_1_1Label;
    @FindBy(css = "label[for='qnn_1_1_1']")   WebElement QNN_1_1_1Label;
    @FindBy(id= "qnn_1_1_1")   WebElement QNN_1_1_1;
    @FindBy(css = "label[for='qnn_1_1_0']")   WebElement QNN_1_1_0Label;
    @FindBy(id= "qnn_1_1_0")   WebElement QNN_1_1_0;
    @FindBy(css = "label[for='qnn_1_1_2']")   WebElement QNN_1_1_2Label;
    @FindBy(id= "qnn_1_1_2")   WebElement QNN_1_1_2;
    @FindBy(css = "label[for='qnn_1_1_3']")   WebElement QNN_1_1_3Label;
    @FindBy(id= "qnn_1_1_3")   WebElement QNN_1_1_3;
    @FindBy(css = "label[for='qnn_1_1_4']")   WebElement QNN_1_1_4Label;
    @FindBy(id= "qnn_1_1_4")   WebElement QNN_1_1_4;
    @FindBy(css = "label[for='qnn_1_1_4_0']")   WebElement QNN_1_1_4_0Label;
    @FindBy(id= "qnn_1_1_4_0")   WebElement QNN_1_1_4_0Text;

    @FindBy(css = "label[for='qnn_1_2']")   WebElement QNN_1_2Label;
    @FindBy(css = "label[for='qnn_1_2_1']")   WebElement QNN_1_2_1Label;
    @FindBy(id= "qnn_1_2_1")   WebElement QNN_1_2_1;
    @FindBy(css = "label[for='qnn_1_2_0']")   WebElement QNN_1_2_0Label;
    @FindBy(id= "qnn_1_2_0")   WebElement QNN_1_2_0;
    @FindBy(css = "label[for='qnn_1_1_4_0']")   WebElement QNN_1_2_1_0Label;
    @FindBy(id= "qnn_1_2_1_0")   WebElement QNN_1_2_1_0Text;

    @FindBy(css = "label[for='qnn_1_3']")   WebElement QNN_1_3Label;
    @FindBy(css = "label[for='qnn_1_3_0']")   WebElement QNN_1_3_0Label;
    @FindBy(id= "qnn_1_3_0")   WebElement QNN_1_3_0;
    @FindBy(css = "label[for='qnn_1_3_1']")   WebElement QNN_1_3_1Label;
    @FindBy(id= "qnn_1_3_1")   WebElement QNN_1_3_1;
    @FindBy(id= "label[for='qnn_1_3_1_0']")   WebElement QNN_1_3_1_0;

    @FindBy(css = "label[for='qnn_1_4']")   WebElement QNN_1_4Label;
    @FindBy(css = "label[for='qnn_1_4_1']")   WebElement QNN_1_4_1Label;
    @FindBy(id= "qnn_1_4_1")   WebElement QNN_1_4_1;
    @FindBy(css = "label[for='qnn_1_4_0']")   WebElement QNN_1_4_0Label;
    @FindBy(id= "qnn_1_4_0")   WebElement QNN_1_4_0;
    @FindBy(id= "label[for='qnn_1_4_1_0']")   WebElement QNN_1_4_1_0;

    @FindBy(css = "label[for='qnn_1_5']")   WebElement QNN_1_5Label;
    @FindBy(css = "label[for='qnn_1_5_1']")   WebElement QNN_1_5_1Label;
    @FindBy(id= "qnn_1_5_1")   WebElement QNN_1_5_1;
    @FindBy(css = "label[for='qnn_1_5_0']")   WebElement QNN_1_5_0Label;
    @FindBy(id= "qnn_1_5_0")   WebElement QNN_1_5_0;
    @FindBy(id= "label[for='qnn_1_5_1_0']")   WebElement QNN_1_5_1_0;

    @FindBy(css = "label[for='qnn_1_6']")   WebElement QNN_1_6Label;
    @FindBy(css = "label[for='qnn_1_6_1']")   WebElement QNN_1_6_1Label;
    @FindBy(id= "qnn_1_6_1")   WebElement QNN_1_6_1;
    @FindBy(css = "label[for='qnn_1_6_0']")   WebElement QNN_1_6_0Label;
    @FindBy(id= "qnn_1_6_0")   WebElement QNN_1_6_0;

    @FindBy(css = "label[for='qnn_1_7']")   WebElement QNN_1_7Label;
    @FindBy(css = "label[for='qnn_1_7_1']")   WebElement QNN_1_7_1Label;
    @FindBy(id= "qnn_1_7_1")   WebElement QNN_1_7_1;
    @FindBy(css = "label[for='qnn_1_7_0']")   WebElement QNN_1_7_0Label;
    @FindBy(id= "qnn_1_7_0")   WebElement QNN_1_7_0;
    @FindBy(css = "label[for='qnn_1_7_0_0']")   WebElement QNN_1_7_0_0;
    @FindBy(css = "label[for='qnn_1_7_0_0_0']")   WebElement QNN_1_7_0_0_0Label;
    @FindBy(id= "qnn_1_7_0_0_0")   WebElement QNN_1_7_0_0_0;
    @FindBy(css = "label[for='qnn_1_7_0_0_1']")   WebElement QNN_1_7_0_0_1Label;
    @FindBy(id= "qnn_1_7_0_0_1")   WebElement QNN_1_7_0_0_1;

    @FindBy(css = "label[for='qnn_1_7_0_0_1_0']")   WebElement QNN_1_7_0_0_1_0Label;
    @FindBy(id= "qnn_1_7_0_0_1_0")   WebElement QNN_1_7_0_0_1_0;
    @FindBy(css = "label[for='qnn_1_7_0_0_1_1']")   WebElement QNN_1_7_0_0_1_1Label;
    @FindBy(id= "qnn_1_7_0_0_1_1")   WebElement QNN_1_7_0_0_1_1;
    @FindBy(css = "label[for='qnn_1_7_0_0_1_2']")   WebElement QNN_1_7_0_0_1_2Label;
    @FindBy(id= "qnn_1_7_0_0_1_2")   WebElement QNN_1_7_0_0_1_2;
    @FindBy(css = "label[for='qnn_1_7_0_0_1_3']")   WebElement QNN_1_7_0_0_1_3Label;
    @FindBy(id= "qnn_1_7_0_0_1_3")   WebElement QNN_1_7_0_0_1_3;
    @FindBy(css = "label[for='qnn_1_7_0_0_1_4']")   WebElement QNN_1_7_0_0_1_4Label;
    @FindBy(id= "qnn_1_7_0_0_1_4")   WebElement QNN_1_7_0_0_1_4;
    @FindBy(css = "label[for='qnn_1_7_0_0_1_5']")   WebElement QNN_1_7_0_0_1_5Label;
    @FindBy(id= "qnn_1_7_0_0_1_5")   WebElement QNN_1_7_0_0_1_5;
    @FindBy(css = "label[for='qnn_1_7_0_0_1_6']")   WebElement QNN_1_7_0_0_1_6Label;
    @FindBy(id= "qnn_1_7_0_0_1_6")   WebElement QNN_1_7_0_0_1_6;
    @FindBy(css = "label[for='qnn_1_7_0_0_1_7']")   WebElement QNN_1_7_0_0_1_7Label;
    @FindBy(id= "qnn_1_7_0_0_1_7")   WebElement QNN_1_7_0_0_1_7;
    @FindBy(css = "label[for='qnn_1_7_0_0_1_8']")   WebElement QNN_1_7_0_0_1_8Label;
    @FindBy(id= "qnn_1_7_0_0_1_8")   WebElement QNN_1_7_0_0_1_8;
    @FindBy(css = "label[for='qnn_1_7_0_0_1_9']")   WebElement QNN_1_7_0_0_1_9Label;
    @FindBy(id= "qnn_1_7_0_0_1_9")   WebElement QNN_1_7_0_0_1_9;
    @FindBy(css = "label[for='qnn_1_7_0_0_1_10']")   WebElement QNN_1_7_0_0_1_10Label;
    @FindBy(id= "qnn_1_7_0_0_1_10")   WebElement QNN_1_7_0_0_1_10;
    @FindBy(css = "label[for='qnn_1_7_0_0_1_11']")   WebElement QNN_1_7_0_0_1_11Label;
    @FindBy(css = "label[for='qnn_1_7_0_0_1_11_0']")   WebElement QNN_1_7_0_0_1_11_0Label;
    @FindBy(id= "qnn_1_7_0_0_1_11_0")   WebElement QNN_1_7_0_0_1_11_0;
    @FindBy(css = "label[for='qnn_1_7_0_0_1_11_1']")   WebElement QNN_1_7_0_0_1_11_1Label;
    @FindBy(id= "qnn_1_7_0_0_1_11_1")   WebElement QNN_1_7_0_0_1_11_1;
    @FindBy(css = "label[for='qnn_1_7_0_0_1_11_1_0']")   WebElement QNN_1_7_0_0_1_11_1_0Label;
    @FindBy(id= "qnn_1_7_0_0_1_11_1_0")   WebElement QNN_1_7_0_0_1_11_1_0;
    @FindBy(css = "label[for='qnn_1_7_0_0_1_12']")   WebElement QNN_1_7_0_0_1_12Label;
    @FindBy(css = "label[for='qnn_1_7_0_0_1_12_0']")   WebElement QNN_1_7_0_0_1_12_0Label;
    @FindBy(id= "qnn_1_7_0_0_1_12_0")   WebElement QNN_1_7_0_0_1_12_0;
    @FindBy(css = "label[for='qnn_1_7_0_0_1_12_1']")   WebElement QNN_1_7_0_0_1_12_1Label;
    @FindBy(id= "qnn_1_7_0_0_1_12_1")   WebElement QNN_1_7_0_0_1_12_1;
    @FindBy(css = "label[for='qnn_1_7_0_0_1_12_1_0']")   WebElement QNN_1_7_0_0_1_12_1_0Label;
    @FindBy(id= "qnn_1_7_0_0_1_12_1_0")   WebElement QNN_1_7_0_0_1_12_1_0;
    @FindBy(css = "label[for='qnn_1_7_0_0_1_13']")   WebElement QNN_1_7_0_0_1_13Label;
    @FindBy(css = "label[for='qnn_1_7_0_0_1_13_0']")   WebElement QNN_1_7_0_0_1_13_0Label;
    @FindBy(id= "qnn_1_7_0_0_1_13_0")   WebElement QNN_1_7_0_0_1_13_0;
    @FindBy(css = "label[for='qnn_1_7_0_0_1_13_1']")   WebElement QNN_1_7_0_0_1_13_1Label;
    @FindBy(id= "qnn_1_7_0_0_1_13_1")   WebElement QNN_1_7_0_0_1_13_1;
    @FindBy(css = "label[for='qnn_1_7_0_0_1_14']")   WebElement QNN_1_7_0_0_1_14Label;
    @FindBy(css = "label[for='qnn_1_7_0_0_1_14_0']")   WebElement QNN_1_7_0_0_1_14_0Label;
    @FindBy(id= "qnn_1_7_0_0_1_14_0")   WebElement QNN_1_7_0_0_1_14_0;
    @FindBy(css = "label[for='qnn_1_7_0_0_1_14_1']")   WebElement QNN_1_7_0_0_1_14_1Label;
    @FindBy(id= "qnn_1_7_0_0_1_14_1")   WebElement QNN_1_7_0_0_1_14_1;
    @FindBy(css = "label[for='qnn_1_7_0_0_1_14_1_0']")   WebElement QNN_1_7_0_0_1_14_1_0Label;
    @FindBy(id= "qnn_1_7_0_0_1_14_1_0")   WebElement QNN_1_7_0_0_1_14_1_0;

    @FindBy(css = "label[for='qnn_1_7_0_0_0_1']")   WebElement QNN_1_7_0_0_0_1Label;
    @FindBy(id= "qnn_1_7_0_0_0_1")   WebElement QNN_1_7_0_0_0_1;
    @FindBy(css = "label[for='qnn_1_7_0_0_0_0']")   WebElement QNN_1_7_0_0_0_0Label;
    @FindBy(id= "qnn_1_7_0_0_0_0")   WebElement QNN_1_7_0_0_0_0;

    @FindBy(css = "label[for='qnn_1_8']")   WebElement QNN_1_8Label;
    @FindBy(css = "label[for='qnn_1_8_1']")   WebElement QNN_1_8_1Label;
    @FindBy(id= "qnn_1_8_1")   WebElement QNN_1_8_1;
    @FindBy(css = "label[for='qnn_1_8_0']")   WebElement QNN_1_8_0Label;
    @FindBy(id= "qnn_1_8_0")   WebElement QNN_1_8_0;

    @FindBy(css = "label[for='qnn_1_9']")   WebElement QNN_1_9Label;
    @FindBy(css = "label[for='qnn_1_9_1']")   WebElement QNN_1_9_1Label;
    @FindBy(id= "qnn_1_9_1")   WebElement QNN_1_9_1;
    @FindBy(css = "label[for='qnn_1_9_0']")   WebElement QNN_1_9_0Label;
    @FindBy(id= "qnn_1_9_0")   WebElement QNN_1_9_0;
    @FindBy(css = "label[for='qnn_1_9_1_0']")   WebElement QNN_1_9_1_0;
    @FindBy(css = "label[for='qnn_1_9_1_0_0']")   WebElement QNN_1_9_1_0_0Label;
    @FindBy(id= "qnn_1_9_1_0_0")   WebElement QNN_1_9_1_0_0;
    @FindBy(css = "label[for='qnn_1_9_1_0_1']")   WebElement QNN_1_9_1_0_1Label;
    @FindBy(id= "qnn_1_9_1_0_1")   WebElement QNN_1_9_1_0_1;

    @FindBy(css = "label[for='qnn_1_9_1_0_1_1']")   WebElement QNN_1_9_1_0_1_1Label;
    @FindBy(id= "qnn_1_9_1_0_1_1")   WebElement QNN_1_9_1_0_1_1;
    @FindBy(css = "label[for='qnn_1_9_1_0_1_0']")   WebElement QNN_1_9_1_0_1_0Label;
    @FindBy(id= "qnn_1_9_1_0_1_0")   WebElement QNN_1_9_1_0_1_0;
    @FindBy(css = "label[for='qnn_1_9_1_0_1_2']")   WebElement QNN_1_9_1_0_1_2Label;
    @FindBy(id= "qnn_1_9_1_0_1_2")   WebElement QNN_1_9_1_0_1_2;
    @FindBy(css = "label[for='qnn_1_9_1_0_1_3']")   WebElement QNN_1_9_1_0_1_3Label;
    @FindBy(id= "qnn_1_9_1_0_1_3")   WebElement QNN_1_9_1_0_1_3;
    @FindBy(css = "label[for='qnn_1_9_1_0_1_5']")   WebElement QNN_1_9_1_0_1_5Label;
    @FindBy(id= "qnn_1_9_1_0_1_5")   WebElement QNN_1_9_1_0_1_5;
    @FindBy(css = "label[for='qnn_1_9_1_0_1_4']")   WebElement QNN_1_9_1_0_1_4Label;
    @FindBy(id= "qnn_1_9_1_0_1_4")   WebElement QNN_1_9_1_0_1_4;
    @FindBy(css = "label[for='qnn_1_9_1_0_1_6']")   WebElement QNN_1_9_1_0_1_6Label;
    @FindBy(id= "qnn_1_9_1_0_1_6")   WebElement QNN_1_9_1_0_1_6;
    @FindBy(css = "label[for='qnn_1_9_1_0_1_8']")   WebElement QNN_1_9_1_0_1_8Label;
    @FindBy(id= "qnn_1_9_1_0_1_8")   WebElement QNN_1_9_1_0_1_8;
    @FindBy(css = "label[for='qnn_1_9_1_0_1_7']")   WebElement QNN_1_9_1_0_1_7Label;
    @FindBy(id= "qnn_1_9_1_0_1_7")   WebElement QNN_1_9_1_0_1_7;

    @FindBy(css = "label[for='qnn_1_9_1_0_1_9']")   WebElement QNN_1_9_1_0_1_9Label;
    @FindBy(id= "qnn_1_9_1_0_1_9")   WebElement QNN_1_9_1_0_1_9;

    @FindBy(css = "label[for='qnn_1_9_1_0_1_10']")   WebElement QNN_1_9_1_0_1_10Label;
    @FindBy(css = "label[for='qnn_1_9_1_0_1_10_1']")   WebElement QNN_1_9_1_0_1_10_1Label;
    @FindBy(id= "qnn_1_9_1_0_1_10_1")   WebElement QNN_1_9_1_0_1_10_1;
    @FindBy(css = "label[for='qnn_1_9_1_0_1_10_0']")   WebElement QNN_1_9_1_0_1_10_0Label;
    @FindBy(id= "qnn_1_9_1_0_1_10_0")   WebElement QNN_1_9_1_0_1_10_0;
    @FindBy(css = "label[for='qnn_1_9_1_0_1_10_1_0']")   WebElement QNN_1_9_1_0_1_10_1_0Label;
    @FindBy(id= "qnn_1_9_1_0_1_10_1_0")   WebElement QNN_1_9_1_0_1_10_1_0;

    @FindBy(css = "label[for='qnn_1_9_1_0_1_11']")   WebElement QNN_1_9_1_0_1_11Label;
    @FindBy(css = "label[for='qnn_1_9_1_0_1_11_0']")   WebElement QNN_1_9_1_0_1_11_0Label;
    @FindBy(id= "qnn_1_9_1_0_1_11_0")   WebElement QNN_1_9_1_0_1_11_0;
    @FindBy(css = "label[for='qnn_1_9_1_0_1_11_1']")   WebElement QNN_1_9_1_0_1_11_1Label;
    @FindBy(id= "qnn_1_9_1_0_1_11_1")   WebElement QNN_1_9_1_0_1_11_1;
    @FindBy(css ="label[for='qnn_1_9_1_0_1_11_0_0']")   WebElement QNN_1_9_1_0_1_11_0_0Label;
    @FindBy(id= "qnn_1_9_1_0_1_11_0_0")   WebElement QNN_1_9_1_0_1_11_0_0;

    @FindBy(css = "label[for='qnn_1_9_1_0_1_12']")   WebElement QNN_1_9_1_0_1_12Label;
    @FindBy(css = "label[for='qnn_1_9_1_0_1_12_1']")   WebElement QNN_1_9_1_0_1_12_1Label;
    @FindBy(id= "qnn_1_9_1_0_1_12_1")   WebElement QNN_1_9_1_0_1_12_1;
    @FindBy(css = "label[for='qnn_1_9_1_0_1_12_0']")   WebElement QNN_1_9_1_0_1_12_0Label;
    @FindBy(id= "qnn_1_9_1_0_1_12_0")   WebElement QNN_1_9_1_0_1_12_0;

    @FindBy(css = "label[for='qnn_1_9_1_0_1_13']")   WebElement QNN_1_9_1_0_1_13Label;
    @FindBy(css = "label[for='qnn_1_9_1_0_1_13_0']")   WebElement QNN_1_9_1_0_1_13_0Label;
    @FindBy(id= "qnn_1_9_1_0_1_13_0")   WebElement QNN_1_9_1_0_1_13_0;
    @FindBy(css = "label[for='qnn_1_9_1_0_1_13_1']")   WebElement QNN_1_9_1_0_1_13_1Label;
    @FindBy(id= "qnn_1_9_1_0_1_13_1")   WebElement QNN_1_9_1_0_1_13_1;
    @FindBy(css = "label[for='qnn_1_9_1_0_1_13_1_0']")   WebElement QNN_1_9_1_0_1_13_1_0Label;
    @FindBy(id= "qnn_1_9_1_0_1_13_1_0")   WebElement QNN_1_9_1_0_1_13_1_0;

    @FindBy(css = "label[for='qnn_1_9_1_0_0_1']")   WebElement QNN_1_9_1_0_0_1Label;
    @FindBy(id= "qnn_1_9_1_0_0_1")   WebElement QNN_1_9_1_0_0_1;
    @FindBy(css = "label[for='qnn_1_9_1_0_0_0']")   WebElement QNN_1_9_1_0_0_0Label;
    @FindBy(id= "qnn_1_9_1_0_0_0")
            WebElement QNN_1_9_1_0_0_0;
    @FindBy(css = "label[for='qnn_1_9_1_0_0_2']")   WebElement QNN_1_9_1_0_0_2Label;
    //@FindBy(id= "qnn_1_9_1_0_0_1")   WebElement QNN_1_9_1_0_0_1;

    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[2]/div/fieldset/legend")   WebElement MoneyLaundryLevelLegend;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[2]/div/fieldset/div[1]/div/label")   WebElement MoneyLaundryLevelLabel;
    @FindBy(id= "Kol3")   WebElement MoneyLaundryLevel;




}

