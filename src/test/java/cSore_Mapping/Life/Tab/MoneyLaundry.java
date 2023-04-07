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


    public void questionnaire() throws Exception {}
 
             
    public void QNN_1_0Label(String q1) throws Exception {
        switch (q1){
            case "Socijalna sigurnost":{
                QNN_1_0_0();
            }break;
            case "Štednja":{
                QNN_1_0_1();
            }break;
            case "Sigurnost porodice":{
                QNN_1_0_2();
            }break;
            case "Ostalo:":{
                QNN_1_0_3();
                QNN_1_0_3_0Text("Test");
            }break;
            default:{}break;
        }
    }
    public void QNN_1_0_0Label() throws Exception {}
    public void QNN_1_0_0() throws Exception {
        Click(QNN_1_0_0Label,"Checkbox clicked");
    }
    public void QNN_1_0_1Label() throws Exception {}
    public void QNN_1_0_1() throws Exception {
        Click(QNN_1_0_1Label,"Checkbox clicked");
    }
    public void QNN_1_0_2Label() throws Exception {}
    public void QNN_1_0_2() throws Exception {
        Click(QNN_1_0_2Label,"Checkbox clicked");
    }
    public void QNN_1_0_3_0Label() throws Exception {}
    public void QNN_1_0_3_0Text(String ostalo) throws Exception {
        SetValue(QNN_1_0_3_0Text,"Input ...",ostalo);
    }
    public void QNN_1_0_3Label() throws Exception {}
    public void QNN_1_0_3() throws Exception {
        Click(QNN_1_0_3Label,"Checkbox clicked");
    }
 
    public void QNN_1_1Label(String q2) throws Exception {
        switch (q2) {
            case "Student": {
                QNN_1_1_0();
            }
            break;
            case "Zaposlen": {
                QNN_1_1_1();
            }
            break;
            case "Nezaposlen": {
                QNN_1_1_2();
            }
            break;
            case "Penzioner": {
                QNN_1_1_3();
            }
            break;
            case "Ostalo:": {
                QNN_1_1_4();
                QNN_1_1_4_0Text("Test");
            }
            break;
            default: {
            }
            break;
        }
    }
    public void QNN_1_1_1Label() throws Exception {}
    public void QNN_1_1_1() throws Exception {
        Click(QNN_1_1_1Label,"Checkbox clicked");
    }
    public void QNN_1_1_0Label() throws Exception {}
    public void QNN_1_1_0() throws Exception {
        Click(QNN_1_1_0Label,"Checkbox clicked");
    }
    public void QNN_1_1_2Label() throws Exception {}
    public void QNN_1_1_2() throws Exception {
        Click(QNN_1_1_2Label,"Checkbox clicked");
    }
    public void QNN_1_1_3Label() throws Exception {}
    public void QNN_1_1_3() throws Exception {
        Click(QNN_1_1_3Label,"Checkbox clicked");
    }
    public void QNN_1_1_4Label() throws Exception {}
    public void QNN_1_1_4() throws Exception {
        Click(QNN_1_1_4Label,"Checkbox clicked");
    }
    public void QNN_1_1_4_0Label() throws Exception {}
    public void QNN_1_1_4_0Text(String ostalo1) throws Exception {
        SetValue(QNN_1_1_4_0Text,"Input ...",ostalo1);
    }
 
    public void QNN_1_2Label(String q3) throws Exception {
        switch (q3){
            case "Stalni izvori (plata, porodična primanja, penzija ili nešto treće)": {
                QNN_1_2_0();
            }
            break;
            case "Drugi prihodi": {
                QNN_1_2_1();
            }
            break;
            default: {
            }
            break;
        }

    }
    public void QNN_1_2_1Label() throws Exception {}
    public void QNN_1_2_1() throws Exception {
        Click(QNN_1_2_1Label,"Checkbox clicked");
    }
    public void QNN_1_2_0Label() throws Exception {}
    public void QNN_1_2_0() throws Exception {
        Click(QNN_1_2_0Label,"Checkbox clicked");
    }
    public void QNN_1_2_1_0Label() throws Exception {}
    public void QNN_1_2_1_0Text(String ostalo2) throws Exception {
        SetValue(QNN_1_1_4_0Text,"Input ...",ostalo2);
    }
 
    public void QNN_1_3Label() throws Exception {}
    public void QNN_1_3_0Label() throws Exception {}
    public void QNN_1_3_0() throws Exception {}
    public void QNN_1_3_1Label() throws Exception {}
    public void QNN_1_3_1() throws Exception {}
    public void QNN_1_3_1_0() throws Exception {}
 
    public void QNN_1_4Label() throws Exception {}
    public void QNN_1_4_1Label() throws Exception {}
    public void QNN_1_4_1() throws Exception {}
    public void QNN_1_4_0Label() throws Exception {}
    public void QNN_1_4_0() throws Exception {}
    public void QNN_1_4_1_0() throws Exception {}
 
    public void QNN_1_5Label() throws Exception {}
    public void QNN_1_5_1Label() throws Exception {}
    public void QNN_1_5_1() throws Exception {}
    public void QNN_1_5_0Label() throws Exception {}
    public void QNN_1_5_0() throws Exception {}
    public void QNN_1_5_1_0() throws Exception {}
 
    public void QNN_1_6Label() throws Exception {}
    public void QNN_1_6_1Label() throws Exception {}
    public void QNN_1_6_1() throws Exception {}
    public void QNN_1_6_0Label() throws Exception {}
    public void QNN_1_6_0() throws Exception {}
 
    public void QNN_1_7Label() throws Exception {}
    public void QNN_1_7_1Label() throws Exception {}
    public void QNN_1_7_1() throws Exception {}
    public void QNN_1_7_0Label() throws Exception {}
    public void QNN_1_7_0() throws Exception {}
    public void QNN_1_7_0_0() throws Exception {}
    public void QNN_1_7_0_0_0Label() throws Exception {}
    public void QNN_1_7_0_0_0() throws Exception {}
    public void QNN_1_7_0_0_1Label() throws Exception {}
    public void QNN_1_7_0_0_1() throws Exception {}
 
             
    public void QNN_1_7_0_0_1_0Label() throws Exception {}
    public void QNN_1_7_0_0_1_0() throws Exception {}
    public void QNN_1_7_0_0_1_1Label() throws Exception {}
    public void QNN_1_7_0_0_1_1() throws Exception {}
    public void QNN_1_7_0_0_1_2Label() throws Exception {}
    public void QNN_1_7_0_0_1_2() throws Exception {}
    public void QNN_1_7_0_0_1_3Label() throws Exception {}
    public void QNN_1_7_0_0_1_3() throws Exception {}
    public void QNN_1_7_0_0_1_4Label() throws Exception {}
    public void QNN_1_7_0_0_1_4() throws Exception {}
    public void QNN_1_7_0_0_1_5Label() throws Exception {}
    public void QNN_1_7_0_0_1_5() throws Exception {}
    public void QNN_1_7_0_0_1_6Label() throws Exception {}
    public void QNN_1_7_0_0_1_6() throws Exception {}
    public void QNN_1_7_0_0_1_7Label() throws Exception {}
    public void QNN_1_7_0_0_1_7() throws Exception {}
    public void QNN_1_7_0_0_1_8Label() throws Exception {}
    public void QNN_1_7_0_0_1_8() throws Exception {}
    public void QNN_1_7_0_0_1_9Label() throws Exception {}
    public void QNN_1_7_0_0_1_9() throws Exception {}
    public void QNN_1_7_0_0_1_10Label() throws Exception {}
    public void QNN_1_7_0_0_1_10() throws Exception {}
    public void QNN_1_7_0_0_1_11Label() throws Exception {}
    public void QNN_1_7_0_0_1_11_0Label() throws Exception {}
    public void QNN_1_7_0_0_1_11_0() throws Exception {}
    public void QNN_1_7_0_0_1_11_1Label() throws Exception {}
    public void QNN_1_7_0_0_1_11_1() throws Exception {}
    public void QNN_1_7_0_0_1_11_1_0Label() throws Exception {}
    public void QNN_1_7_0_0_1_11_1_0() throws Exception {}
    public void QNN_1_7_0_0_1_12Label() throws Exception {}
    public void QNN_1_7_0_0_1_12_0Label() throws Exception {}
    public void QNN_1_7_0_0_1_12_0() throws Exception {}
    public void QNN_1_7_0_0_1_12_1Label() throws Exception {}
    public void QNN_1_7_0_0_1_12_1() throws Exception {}
    public void QNN_1_7_0_0_1_12_1_0Label() throws Exception {}
    public void QNN_1_7_0_0_1_12_1_0() throws Exception {}
    public void QNN_1_7_0_0_1_13Label() throws Exception {}
    public void QNN_1_7_0_0_1_13_0Label() throws Exception {}
    public void QNN_1_7_0_0_1_13_0() throws Exception {}
    public void QNN_1_7_0_0_1_13_1Label() throws Exception {}
    public void QNN_1_7_0_0_1_13_1() throws Exception {}
    public void QNN_1_7_0_0_1_14Label() throws Exception {}
    public void QNN_1_7_0_0_1_14_0Label() throws Exception {}
    public void QNN_1_7_0_0_1_14_0() throws Exception {}
    public void QNN_1_7_0_0_1_14_1Label() throws Exception {}
    public void QNN_1_7_0_0_1_14_1() throws Exception {}
    public void QNN_1_7_0_0_1_14_1_0Label() throws Exception {}
    public void QNN_1_7_0_0_1_14_1_0() throws Exception {}
 
             
             
    public void QNN_1_7_0_0_0_1Label() throws Exception {}
    public void QNN_1_7_0_0_0_1() throws Exception {}
    public void QNN_1_7_0_0_0_0Label() throws Exception {}
    public void QNN_1_7_0_0_0_0() throws Exception {}
 
             
             
    public void QNN_1_8Label(String q9) throws Exception {
        switch (q9){
            case "NE":{
                QNN_1_8_0();
            }break;
            case "DA":{
                QNN_1_8_1();
            }break;
            default: {
        }
        break;
        }
    }
    public void QNN_1_8_1Label() throws Exception {}
    public void QNN_1_8_1() throws Exception {
        Click(QNN_1_8_1Label,"Checkbox clicked");
    }
    public void QNN_1_8_0Label() throws Exception {}
    public void QNN_1_8_0() throws Exception {
        Click(QNN_1_8_0Label,"Checkbox clicked");
    }
 
    public void QNN_1_9Label() throws Exception {}
    public void QNN_1_9_1Label() throws Exception {}
    public void QNN_1_9_1() throws Exception {}
    public void QNN_1_9_0Label() throws Exception {}
    public void QNN_1_9_0() throws Exception {}
    public void QNN_1_9_1_0() throws Exception {}
    public void QNN_1_9_1_0_0Label() throws Exception {}
    public void QNN_1_9_1_0_0() throws Exception {}
    public void QNN_1_9_1_0_1Label() throws Exception {}
    public void QNN_1_9_1_0_1() throws Exception {}
 
             
             
    public void QNN_1_9_1_0_1_1Label() throws Exception {}
    public void QNN_1_9_1_0_1_1() throws Exception {}
    public void QNN_1_9_1_0_1_0Label() throws Exception {}
    public void QNN_1_9_1_0_1_0() throws Exception {}
    public void QNN_1_9_1_0_1_2Label() throws Exception {}
    public void QNN_1_9_1_0_1_2() throws Exception {}
    public void QNN_1_9_1_0_1_3Label() throws Exception {}
    public void QNN_1_9_1_0_1_3() throws Exception {}
    public void QNN_1_9_1_0_1_5Label() throws Exception {}
    public void QNN_1_9_1_0_1_5() throws Exception {}
    public void QNN_1_9_1_0_1_4Label() throws Exception {}
    public void QNN_1_9_1_0_1_4() throws Exception {}
    public void QNN_1_9_1_0_1_6Label() throws Exception {}
    public void QNN_1_9_1_0_1_6() throws Exception {}
    public void QNN_1_9_1_0_1_8Label() throws Exception {}
    public void QNN_1_9_1_0_1_8() throws Exception {}
    public void QNN_1_9_1_0_1_7Label() throws Exception {}
    public void QNN_1_9_1_0_1_7() throws Exception {}
 
             
    public void QNN_1_9_1_0_1_9Label() throws Exception {}
    public void QNN_1_9_1_0_1_9() throws Exception {}
 
             
    public void QNN_1_9_1_0_1_10Label() throws Exception {}
    public void QNN_1_9_1_0_1_10_1Label() throws Exception {}
    public void QNN_1_9_1_0_1_10_1() throws Exception {}
    public void QNN_1_9_1_0_1_10_0Label() throws Exception {}
    public void QNN_1_9_1_0_1_10_0() throws Exception {}
    public void QNN_1_9_1_0_1_10_1_0Label() throws Exception {}
    public void QNN_1_9_1_0_1_10_1_0() throws Exception {}
 
    public void QNN_1_9_1_0_1_11Label() throws Exception {}
    public void QNN_1_9_1_0_1_11_0Label() throws Exception {}
    public void QNN_1_9_1_0_1_11_0() throws Exception {}
    public void QNN_1_9_1_0_1_11_1Label() throws Exception {}
    public void QNN_1_9_1_0_1_11_1() throws Exception {}
    public void QNN_1_9_1_0_1_11_0_0Label() throws Exception {}
    public void QNN_1_9_1_0_1_11_0_0() throws Exception {}
 
    public void QNN_1_9_1_0_1_12Label() throws Exception {}
    public void QNN_1_9_1_0_1_12_1Label() throws Exception {}
    public void QNN_1_9_1_0_1_12_1() throws Exception {}
    public void QNN_1_9_1_0_1_12_0Label() throws Exception {}
    public void QNN_1_9_1_0_1_12_0() throws Exception {}

    public void QNN_1_9_1_0_1_13Label() throws Exception {}
    public void QNN_1_9_1_0_1_13_0Label() throws Exception {}
    public void QNN_1_9_1_0_1_13_0() throws Exception {}
    public void QNN_1_9_1_0_1_13_1Label() throws Exception {}
    public void QNN_1_9_1_0_1_13_1() throws Exception {}
    public void QNN_1_9_1_0_1_13_1_0Label() throws Exception {}
    public void QNN_1_9_1_0_1_13_1_0() throws Exception {}

    public void QNN_1_9_1_0_0_1Label() throws Exception {}
    public void QNN_1_9_1_0_0_1() throws Exception {}
    public void QNN_1_9_1_0_0_0Label() throws Exception {}
    public void QNN_1_9_1_0_0_0() throws Exception {}
    public void QNN_1_9_1_0_0_2Label() throws Exception {}
    //public void QNN_1_9_1_0_0_1() throws Exception {}

    public void MoneyLaundryLevelLegend() throws Exception {}
    public void MoneyLaundryLevelLabel() throws Exception {}
    public void MoneyLaundryLevel() throws Exception {}


}

