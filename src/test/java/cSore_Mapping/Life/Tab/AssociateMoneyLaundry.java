package cSore_Mapping.Life.Tab;

import cSore_Mapping.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class AssociateMoneyLaundry extends BasePage {


    public AssociateMoneyLaundry(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id='Kol1']/fieldset/legend")
    WebElement questionnaire;

    @FindBy(css = "label[for='qnn_1_0_0']")
    WebElement QNN_1_0_0Label;
    @FindBy(css = "qnn_1_0")
    WebElement QNN_1_0Label;
    @FindBy(id = "qnn_1_0_0")
    WebElement QNN_1_0_0;
    @FindBy(css = "label[for='qnn_1_0_1']")
    WebElement QNN_1_0_1Label;
    @FindBy(id = "qnn_1_0_1")
    WebElement QNN_1_0_1;
    @FindBy(id = "qnn_1_0_2")
    WebElement QNN_1_0_2;
    @FindBy(css = "label[for='qnn_1_0_2']")
    WebElement QNN_1_0_2Label;
    @FindBy(css = "label[for='qnn_1_0_3']")
    WebElement QNN_1_0_3Label;
    @FindBy(id = "qnn_1_0_3")
    WebElement QNN_1_0_3;
    @FindBy(css = "label[for='qnn_1_0_4']")
    WebElement QNN_1_0_4Label;
    @FindBy(id = "qnn_1_0_4")
    WebElement QNN_1_0_4;
    @FindBy(id = "qnn_1_0_5")
    WebElement QNN_1_0_5;
    @FindBy(css = "label[for='qnn_1_0_5']")
    WebElement QNN_1_0_5Label;
    @FindBy(css = "label[for='qnn_1_0_5_0'")
    WebElement QNN_1_0_5_0Label;
    @FindBy(id = "qnn_1_0_5_0")
    WebElement QNN_1_0_5_0Text;

    @FindBy(css = "label[for='qnn_1_1']")
    WebElement QNN_1_1Label;
    @FindBy(id = "qnn_1_1_0")
    WebElement QNN_1_1_0;
    @FindBy(css = "label[for='qnn_1_1_0']")
    WebElement QNN_1_1_0Label;
    @FindBy(css = "label[for='qnn_1_1_1']")
    WebElement QNN_1_1_1Label;
    @FindBy(id = "qnn_1_1_1")
    WebElement QNN_1_1_1;

    @FindBy(css = "label[for='qnn_1_2']")
    WebElement QNN_1_2Label;
    @FindBy(css = "label[for='qnn_1_2_0']")
    WebElement QNN_1_2_0Label;
    @FindBy(id = "qnn_1_2_0")
    WebElement QNN_1_2_0;
    @FindBy(css = "label[for='qnn_1_2_1']")
    WebElement QNN_1_2_1Label;
    @FindBy(id = "qnn_1_2_1")
    WebElement QNN_1_2_1;

    @FindBy(css = "label[for='qnn_1_3']")
    WebElement QNN_1_3Label;
    @FindBy(css = "label[for='qnn_1_3_0']")
    WebElement QNN_1_3_0Label;
    @FindBy(id = "qnn_1_3_0")
    WebElement QNN_1_3_0;
    @FindBy(id = "qnn_1_3_1")
    WebElement QNN_1_3_1;
    @FindBy(css = "label[for='qnn_1_3_1']")
    WebElement QNN_1_3_1Label;

    @FindBy(css = "label[for='qnn_1_4']")
    WebElement QNN_1_4Label;
    @FindBy(css = "label[for='qnn_1_4_0']")
    WebElement QNN_1_4_0Label;
    @FindBy(id = "qnn_1_4_0")
    WebElement QNN_1_4_0;
    @FindBy(id = "qnn_1_4_1")
    WebElement QNN_1_4_1;
    @FindBy(css = "label[for='qnn_1_4_1']")
    WebElement QNN_1_4_1Label;

    @FindBy(css = "label[for='qnn_1_5']")
    WebElement QNN_1_5Label;
    @FindBy(css = "label[for='qnn_1_5_0']")
    WebElement QNN_1_5_0Label;
    @FindBy(id = "qnn_1_5_0")
    WebElement QNN_1_5_0;
    @FindBy(css = "label[for='qnn_1_5_1']")
    WebElement QNN_1_5_1Label;
    @FindBy(id = "qnn_1_5_1")
    WebElement QNN_1_5_1;

    @FindBy(css = "label[for='qnn_1_6']")
    WebElement QNN_1_6Label;
    @FindBy(id = "qnn_1_6_0")
    WebElement QNN_1_6_0;
    @FindBy(css = "label[for='qnn_1_6_0']")
    WebElement QNN_1_6_0Label;
    @FindBy(css = "label[for='qnn_1_6_1']")
    WebElement QNN_1_6_1Label;
    @FindBy(id = "qnn_1_6_1")
    WebElement QNN_1_6_1;

    @FindBy(css = "label[for='qnn_1_7']")
    WebElement QNN_1_7Label;
    @FindBy(css = "label[for='qnn_1_7_0']")
    WebElement QNN_1_7_0Label;
    @FindBy(id = "qnn_1_7_0")
    WebElement QNN_1_7_0;
    @FindBy(id = "qnn_1_7_1")
    WebElement QNN_1_7_1;
    @FindBy(css = "label[for='qnn_1_7_1']")
    WebElement QNN_1_7_1Label;
    @FindBy(css = "label[for='qnn_1_7_2']")
    WebElement QNN_1_7_2Label;
    @FindBy(id = "qnn_1_7_2")
    WebElement QNN_1_7_2;

    @FindBy(css = "label[for='qnn_1_8']")
    WebElement QNN_1_8Label;
    @FindBy(id = "qnn_1_8_0")
    WebElement QNN_1_8_0;
    @FindBy(css = "label[for='qnn_1_8_0']")
    WebElement QNN_1_8_0Label;
    @FindBy(css = "label[for='qnn_1_8_1']")
    WebElement QNN_1_8_1Label;
    @FindBy(id = "qnn_1_8_1")
    WebElement QNN_1_8_1;

    @FindBy(css = "label[for='qnn_1_9']")
    WebElement QNN_1_9Label;
    @FindBy(css = "label[for='qnn_1_9_0']")
    WebElement QNN_1_9_0Label;
    @FindBy(id = "qnn_1_9_0")
    WebElement QNN_1_9_0;
    @FindBy(id = "qnn_1_9_1")
    WebElement QNN_1_9_1;
    @FindBy(css = "label[for='qnn_1_9_1']")
    WebElement QNN_1_9_1Label;
    @FindBy(css = "label[for='qnn_1_9_2']")
    WebElement QNN_1_9_2Label;
    @FindBy(id = "qnn_1_9_2")
    WebElement QNN_1_9_2;

    @FindBy(css = "label[for='qnn_1_10']")
    WebElement QNN_1_10Label;
    @FindBy(css = "label[for='qnn_1_10_0']")
    WebElement QNN_1_10_0Label;
    @FindBy(id = "qnn_1_10_0")
    WebElement QNN_1_10_0;
    @FindBy(id = "qnn_1_10_1")
    WebElement QNN_1_10_1;
    @FindBy(css = "label[for='qnn_1_10_1']")
    WebElement QNN_1_10_1Label;
    @FindBy(css = "label[for='qnn_1_10_2']")
    WebElement QNN_1_10_2Label;
    @FindBy(id = "qnn_1_10_2")
    WebElement QNN_1_10_2;

    @FindBy(xpath = "//*[@id='form1']/div[4]/div[2]/div/div/div[2]/div/fieldset/legend")
    WebElement MoneyLaundryLevelLegend;
    @FindBy(xpath = "//*[@id='form1']/div[4]/div[2]/div/div/div[2]/div/fieldset/div[1]/div/label")
    WebElement MoneyLaundryLevelLabel;
    @FindBy(id = "Kol3")
    WebElement MoneyLaundryLevel;

    public void questionnaire() throws Exception {
    }

    public void QNN_1_0_0Label() throws Exception {
    }

    public void QNN_1_0Label(String q1) throws Exception {
        switch (q1) {
            case "Redovna zarada": {
                QNN_1_0_0();
            }
            break;
            case "Porodična primanja": {
                QNN_1_0_1();
            }
            break;
            case "Isplata osigurane sume sa druge polise": {
                QNN_1_0_2();
            }
            break;
            case "Testament": {
                QNN_1_0_3();
            }
            break;
            case "Dugogodišnja ušteđevina": {
                QNN_1_0_4();
            }
            break;
            case "Ostalo:": {
                QNN_1_0_5();
                QNN_1_0_5_0Text("Test");
            }
            break;
        }
    }

    public void QNN_1_0_0() throws Exception {
        Click(QNN_1_0_0Label, "Checkbox clicked");
    }

    public void QNN_1_0_1Label() throws Exception {
    }

    public void QNN_1_0_1() throws Exception {
        Click(QNN_1_0_1Label, "Checkbox clicked");
    }

    public void QNN_1_0_2() throws Exception {
        Click(QNN_1_0_2Label, "Checkbox clicked");
    }

    public void QNN_1_0_2Label() throws Exception {
    }

    public void QNN_1_0_3Label() throws Exception {
    }

    public void QNN_1_0_3() throws Exception {
        Click(QNN_1_0_3Label, "Checkbox clicked");
    }

    public void QNN_1_0_4Label() throws Exception {
    }

    public void QNN_1_0_4() throws Exception {
        Click(QNN_1_0_4Label, "Checkbox clicked");
    }

    public void QNN_1_0_5() throws Exception {
        Click(QNN_1_0_5Label, "Checkbox clicked");
    }

    public void QNN_1_0_5Label() throws Exception {
    }

    public void QNN_1_0_5_0Label() throws Exception {
    }

    public void QNN_1_0_5_0Text(String ostalo) throws Exception {
        SetValue(QNN_1_0_5_0Text, "Checkbox clicked", ostalo);
    }

    public void QNN_1_1Label(String q2) throws Exception {
        switch (q2){
            case "NE":{
                QNN_1_1_0();
            }break;
            case "DA":{
                QNN_1_1_1();
            }break;
            default: {
            }
            break;
        }
    }

    public void QNN_1_1_0() throws Exception {
        Click(QNN_1_1_0Label, "Checkbox clicked");
    }

    public void QNN_1_1_0Label() throws Exception {
    }

    public void QNN_1_1_1Label() throws Exception {
    }

    public void QNN_1_1_1() throws Exception {
        Click(QNN_1_1_1Label, "Checkbox clicked");
    }

    public void QNN_1_2Label(String q3) throws Exception {
        switch (q3){
            case "NE":{
                QNN_1_2_0();
            }break;
            case "DA":{
                QNN_1_2_1();
            }break;
            default: {
            }
            break;
        }
    }

    public void QNN_1_2_0Label() throws Exception {
    }

    public void QNN_1_2_0() throws Exception {
        Click(QNN_1_2_0Label, "Checkbox clicked");
    }

    public void QNN_1_2_1Label() throws Exception {
    }

    public void QNN_1_2_1() throws Exception {
        Click(QNN_1_2_1, "Checkbox clicked");
    }

    public void QNN_1_3Label(String q4) throws Exception {
        switch (q4){
            case "NE":{
                QNN_1_3_0();
            }break;
            case "DA":{
                QNN_1_3_1();
            }break;
            default: {
            }
            break;
        }
    }

    public void QNN_1_3_0Label() throws Exception {
    }

    public void QNN_1_3_0() throws Exception {
        Click(QNN_1_3_0Label, "Checkbox clicked");
    }

    public void QNN_1_3_1() throws Exception {
        Click(QNN_1_3_1Label, "Checkbox clicked");
    }

    public void QNN_1_3_1Label() throws Exception {
    }

    public void QNN_1_4Label(String q5) throws Exception {
        switch (q5){
            case "NE":{
                QNN_1_4_0();
            }break;
            case "DA":{
                QNN_1_4_1();
            }break;
            default: {
            }
            break;
        }
    }

    public void QNN_1_4_0Label() throws Exception {
    }

    public void QNN_1_4_0() throws Exception {
        Click(QNN_1_4_0Label, "Checkbox clicked");
    }

    public void QNN_1_4_1() throws Exception {
        Click(QNN_1_4_1Label, "Checkbox clicked");
    }

    public void QNN_1_4_1Label() throws Exception {
    }

    public void QNN_1_5Label(String q6) throws Exception {
        switch (q6){
            case "NE":{
                QNN_1_5_0();
            }break;
            case "DA":{
                QNN_1_5_1();
            }break;
            default: {
            }
            break;
        }
    }

    public void QNN_1_5_0Label() throws Exception {
    }

    public void QNN_1_5_0() throws Exception {
        Click(QNN_1_5_0Label, "Checkbox clicked");
    }

    public void QNN_1_5_1Label() throws Exception {
    }

    public void QNN_1_5_1() throws Exception {
        Click(QNN_1_5_1Label, "Checkbox clicked");
    }

    public void QNN_1_6Label() throws Exception {
    }

    public void QNN_1_6_0() throws Exception {
    }

    public void QNN_1_6_0Label() throws Exception {
    }

    public void QNN_1_6_1Label() throws Exception {
    }

    public void QNN_1_6_1() throws Exception {
    }

    public void QNN_1_7Label() throws Exception {
    }

    public void QNN_1_7_0Label() throws Exception {
    }

    public void QNN_1_7_0() throws Exception {
    }

    public void QNN_1_7_1() throws Exception {
    }

    public void QNN_1_7_1Label() throws Exception {
    }

    public void QNN_1_7_2Label() throws Exception {
    }

    public void QNN_1_7_2() throws Exception {
    }

    public void QNN_1_8Label() throws Exception {
    }

    public void QNN_1_8_0() throws Exception {
        Click(QNN_1_8_0Label, "Checkbox clicked");
    }

    public void QNN_1_8_0Label() throws Exception {
    }

    public void QNN_1_8_1Label() throws Exception {
    }

    public void QNN_1_8_1() throws Exception {
        Click(QNN_1_8_1Label, "Checkbox clicked");
    }

    public void QNN_1_9Label() throws Exception {
    }

    public void QNN_1_9_0Label() throws Exception {
    }

    public void QNN_1_9_0() throws Exception {
    }

    public void QNN_1_9_1() throws Exception {
    }

    public void QNN_1_9_1Label() throws Exception {
    }

    public void QNN_1_9_2Label() throws Exception {
    }

    public void QNN_1_9_2() throws Exception {
    }

    public void QNN_1_10Label() throws Exception {
    }

    public void QNN_1_10_0Label() throws Exception {
    }

    public void QNN_1_10_0() throws Exception {
    }

    public void QNN_1_10_1() throws Exception {
    }

    public void QNN_1_10_1Label() throws Exception {
    }

    public void QNN_1_10_2Label() throws Exception {
    }

    public void QNN_1_10_2() throws Exception {
    }

    public void MoneyLaundryLevelLegend() throws Exception {
    }

    public void MoneyLaundryLevelLabel() throws Exception {
    }

    public void MoneyLaundryLevel() throws Exception {
    }
}






