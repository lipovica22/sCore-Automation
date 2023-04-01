package cSore_Mapping.Life.View.HealthCondition;

import cSore_Mapping.Common.Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Questionnaire extends BasePage {
    public Questionnaire(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div/div[3]/fieldset/legend")   WebElement Upitnik;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div/div[3]/fieldset/div[1]/div/div/label")   WebElement QuestionnaireTypeLabel;
    @FindBy(id= "Kol10")   WebElement QuestionnaireType;

    @FindBy(xpath= "//*[@id='Kol6']/fieldset/legend")   WebElement questionnaireLabel;
    @FindBy(css= "label[for='qnn_6_0_']")   WebElement QNN_6_0;
    @FindBy(id= "qnn_6_0_0")   WebElement BTN_6_0_0;
    @FindBy(css= "label[for='qnn_6_0_0']")   WebElement LBL_6_0_0;

    @FindBy(id= "qnn_6_0_1")   WebElement BTN_6_0_1;
    @FindBy(css= "label[for='qnn_6_0_1']")   WebElement LBL_6_0_1;

    @FindBy(css= "label[for='qnn_6_1_']")   WebElement QNN_6_1;
    @FindBy(id= "qnn_6_1_0")   WebElement BTN_6_1_0;
    @FindBy(css= "label[for='qnn_6_1_0']")   WebElement LBL_6_1_0;

    @FindBy(id= "qnn_6_1_1")   WebElement BTN_6_1_1;
    @FindBy(css= "label[for='qnn_6_1_1']")   WebElement LBL_6_1_1;

    @FindBy(css= "label[for='qnn_6_2_']")   WebElement QNN_6_2;
    @FindBy(id= "qnn_6_2_0")   WebElement BTN_6_2_0;
    @FindBy(css= "label[for='qnn_6_2_0']")   WebElement LBL_6_2_0;
    @FindBy(id= "qnn_6_2_1")   WebElement BTN_6_2_1;
    @FindBy(css= "label[for='qnn_6_2_1']")   WebElement LBL_6_2_1;

    @FindBy(css= "label[for='qnn_6_3_']")   WebElement QNN_6_3;
    @FindBy(id= "qnn_6_3_0")   WebElement BTN_6_3_0;
    @FindBy(css= "label[for='qnn_6_3_0']")   WebElement LBL_6_3_0;

    @FindBy(id= "qnn_6_3_1")   WebElement BTN_6_3_1;
    @FindBy(css= "label[for='qnn_6_3_1']")   WebElement LBL_6_3_1;

    @FindBy(css= "label[for='qnn_6_4_']")   WebElement QNN_6_4;
    @FindBy(id= "qnn_6_4_0")   WebElement BTN_6_4_0;
    @FindBy(css= "label[for='qnn_6_4_0']")   WebElement LBL_6_4_0;

    @FindBy(id= "qnn_6_4_1")   WebElement BTN_6_4_1;
    @FindBy(css= "label[for='qnn_6_4_1']")   WebElement LBL_6_4_1;

    @FindBy(css= "label[for='qnn_6_5_']")   WebElement QNN_6_5;
    @FindBy(id= "qnn_6_5_0")   WebElement BTN_6_5_0;
    @FindBy(css= "label[for='qnn_6_5_0']")   WebElement LBL_6_5_0;

    @FindBy(id= "qnn_6_5_1")   WebElement BTN_6_5_1;
    @FindBy(css= "label[for='qnn_6_5_1']")   WebElement LBL_6_5_1;

    @FindBy(css= "label[for='qnn_6_6_']")   WebElement QNN_6_6;
    @FindBy(id= "qnn_6_6_0")   WebElement BTN_6_6_0;
    @FindBy(css= "label[for='qnn_6_6_0']")   WebElement LBL_6_6_0;

    @FindBy(id= "qnn_6_6_1")   WebElement BTN_6_6_1;
    @FindBy(css= "label[for='qnn_6_6_1']")   WebElement LBL_6_6_1;

    @FindBy(css= "label[for='qnn_6_7_']")   WebElement QNN_6_7;
    @FindBy(id= "qnn_6_7_0")   WebElement BTN_6_7_0;
    @FindBy(css= "label[for='qnn_6_7_0']")   WebElement LBL_6_7_0;

    @FindBy(id= "qnn_6_7_1")   WebElement BTN_6_7_1;
    @FindBy(css= "label[for='qnn_6_7_1']")   WebElement LBL_6_7_1;

    @FindBy(css= "label[for='qnn_6_8_']")   WebElement QNN_6_8;
    @FindBy(id= "qnn_6_8_0")   WebElement BTN_6_8_0;
    @FindBy(css= "label[for='qnn_6_8_0']")   WebElement LBL_6_8_0;

    @FindBy(id= "qnn_6_8_1")   WebElement BTN_6_8_1;
    @FindBy(css= "label[for='qnn_6_8_1']")   WebElement LBL_6_8_1;

    @FindBy(css= "label[for='qnn_6_9_']")   WebElement QNN_6_9;
    @FindBy(id= "qnn_6_9_0")   WebElement BTN_6_9_0;
    @FindBy(css= "label[for='qnn_6_9_0']")   WebElement LBL_6_9_0;

    @FindBy(id= "qnn_6_9_1")   WebElement BTN_6_9_1;
    @FindBy(css= "label[for='qnn_6_9_1']")   WebElement LBL_6_9_1;

    @FindBy(css= "label[for='qnn_6_10_']")   WebElement QNN_6_10;
    @FindBy(id= "qnn_6_10_0")   WebElement BTN_6_10_0;
    @FindBy(css= "label[for='qnn_6_10_0']")   WebElement LBL_6_10_0;

    @FindBy(id= "qnn_6_10_1")   WebElement BTN_6_10_1;
    @FindBy(css= "label[for='qnn_6_10_1']")   WebElement LBL_6_10_1;

    @FindBy(css= "label[for='qnn_6_11_']")   WebElement QNN_6_11;
    @FindBy(id= "qnn_6_11_0")   WebElement BTN_6_11_0;
    @FindBy(css= "label[for='qnn_6_11_0']")   WebElement LBL_6_11_0;

    @FindBy(id= "qnn_6_11_1")   WebElement BTN_6_11_1;
    @FindBy(css= "label[for='qnn_6_11_1']")   WebElement LBL_6_11_1;

    @FindBy(css= "label[for='qnn_6_12_']")   WebElement QNN_6_12;
    @FindBy(id= "qnn_6_12_0")   WebElement BTN_6_12_0;
    @FindBy(css= "label[for='qnn_6_12_0']")   WebElement LBL_6_12_0;

    @FindBy(id= "qnn_6_12_1")   WebElement BTN_6_12_1;
    @FindBy(css= "label[for='qnn_6_12_1']")   WebElement LBL_6_12_1;

    @FindBy(css= "label[for='qnn_6_13_']")   WebElement QNN_6_13;
    @FindBy(id= "qnn_6_13_0")   WebElement BTN_6_13_0;
    @FindBy(css= "label[for='qnn_6_13_0']")   WebElement LBL_6_13_0;

    @FindBy(id= "qnn_6_13_1")   WebElement BTN_6_13_1;
    @FindBy(css= "label[for='qnn_6_13_1']")   WebElement LBL_6_13_1;

    @FindBy(css= "label[for='qnn_6_14_']")   WebElement QNN_6_14;
    @FindBy(id= "qnn_6_14_0")   WebElement BTN_6_14_0;
    @FindBy(css= "label[for='qnn_6_14_0']")   WebElement LBL_6_14_0;

    @FindBy(id= "qnn_6_14_1")   WebElement BTN_6_14_1;
    @FindBy(css= "label[for='qnn_6_14_1']")   WebElement LBL_6_14_1;

    @FindBy(css= "label[for='qnn_6_15_']")   WebElement QNN_6_15;
    @FindBy(id= "qnn_6_15_0")   WebElement BTN_6_15_0;
    @FindBy(css= "label[for='qnn_6_15_0']")   WebElement LBL_6_15_0;

    @FindBy(id= "qnn_6_15_1")   WebElement BTN_6_15_1;
    @FindBy(css= "label[for='qnn_6_15_1']")   WebElement LBL_6_15_1;

    @FindBy(css= "label[for='qnn_6_16_']")   WebElement QNN_6_16;
    @FindBy(id= "qnn_6_16_0")   WebElement BTN_6_16_0;
    @FindBy(css= "label[for='qnn_6_16_0']")   WebElement LBL_6_16_0;

    @FindBy(id= "qnn_6_16_1")   WebElement BTN_6_16_1;
    @FindBy(css= "label[for='qnn_6_16_1']")   WebElement LBL_6_16_1;

    @FindBy(css= "label[for='qnn_6_17_']")   WebElement QNN_6_17;
    @FindBy(id= "qnn_6_17_0")   WebElement BTN_6_17_0;
    @FindBy(css= "label[for='qnn_6_17_0']")   WebElement LBL_6_17_0;

    @FindBy(id= "qnn_6_17_1")   WebElement BTN_6_17_1;
    @FindBy(css= "label[for='qnn_6_17_1']")   WebElement LBL_6_17_1;

    @FindBy(css= "label[for='qnn_6_18_']")   WebElement QNN_6_18;
    @FindBy(id= "qnn_6_18_0")   WebElement BTN_6_18_0;
    @FindBy(css= "label[for='qnn_6_18_0']")   WebElement LBL_6_18_0;

    @FindBy(id= "qnn_6_18_1")   WebElement BTN_6_18_1;
    @FindBy(css= "label[for='qnn_6_18_1']")   WebElement LBL_6_18_1;

    @FindBy(css= "label[for='qnn_6_19_']")   WebElement QNN_6_19;

    @FindBy(id= "qnn_6_19_0")   WebElement BTN_6_19_0;
    @FindBy(css= "label[for='qnn_6_19_0']")   WebElement LBL_6_19_0;
    @FindBy(id= "qnn_6_19_1")   WebElement BTN_6_19_1;
    @FindBy(css= "label[for='qnn_6_19_1']")   WebElement LBL_6_19_1;

    @FindBy(css= "label[for='qnn_6_20_']")   WebElement QNN_6_20;
    @FindBy(id= "qnn_6_20_0")   WebElement BTN_6_20_0;
    @FindBy(css= "label[for='qnn_6_20_0']")   WebElement LBL_6_20_0;

    @FindBy(id= "qnn_6_20_1")   WebElement BTN_6_20_1;
    @FindBy(css= "label[for='qnn_6_20_1']")   WebElement LBL_6_20_1;

    @FindBy(css= "label[for='qnn_6_21_']")   WebElement QNN_6_21;
    @FindBy(id= "qnn_6_21_0")   WebElement BTN_6_21_0;
    @FindBy(css= "label[for='qnn_6_21_0']")   WebElement LBL_6_21_0;

    @FindBy(id= "qnn_6_21_1")   WebElement BTN_6_21_1;
    @FindBy(css= "label[for='qnn_6_21_1']")   WebElement LBL_6_21_1;

    @FindBy(css= "label[for='qnn_6_22_']")   WebElement QNN_6_22;

    @FindBy(id= "qnn_6_22_1']")   WebElement BTN_6_22_0;
    @FindBy(css= "label[for='qnn_6_22_1']")   WebElement LBL_6_22_0;
    @FindBy(id= "qnn_6_22_0']")   WebElement BTN_6_22_1;
    @FindBy(css= "label[for='qnn_6_22_0']")   WebElement LBL_6_22_1;

    @FindBy(css= "label[for='qnn_6_23_']")   WebElement QNN_6_23;
    @FindBy(id= "qnn_6_23_0")   WebElement BTN_6_23_0;
    @FindBy(css= "label[for='qnn_6_23_0']")   WebElement LBL_6_23_0;

    @FindBy(id= "qnn_6_23_1")   WebElement BTN_6_23_1;
    @FindBy(css= "label[for='qnn_6_23_1']")   WebElement LBL_6_23_1;

    @FindBy(css= "label[for='qnn_6_24_']")   WebElement QNN_6_24;
    @FindBy(id= "qnn_6_24_0")   WebElement BTN_6_24_0;
    @FindBy(css= "label[for='qnn_6_24_0']")   WebElement LBL_6_24_0;

    @FindBy(id= "qnn_6_24_1")   WebElement BTN_6_24_1;
    @FindBy(css= "label[for='qnn_6_24_1']")   WebElement LBL_6_24_1;

    @FindBy(css= "label[for='qnn_6_25_']")   WebElement QNN_6_25;

    @FindBy(id= "qnn_6_25_0")   WebElement BTN_6_25_0;
    @FindBy(id= "qnn_6_25_1")   WebElement BTN_6_25_1;
    @FindBy(css= "label[for='qnn_6_25_0']")   WebElement LBL_6_25_0;
    @FindBy(css= "label[for='qnn_6_25_1']")   WebElement LBL_6_25_1;

    @FindBy(css= "label[for='qnn_6_26_']")   WebElement QNN_6_26;
    @FindBy(id= "qnn_6_26_0")   WebElement BTN_6_26_0;
    @FindBy(css= "label[for='qnn_6_26_0']")   WebElement LBL_6_26_0;

    @FindBy(id= "qnn_6_26_1")   WebElement BTN_6_26_1;
    @FindBy(css= "label[for='qnn_6_26_1']")   WebElement LBL_6_26_1;

    @FindBy(css= "label[for='qnn_6_27_']")   WebElement QNN_6_27;
    @FindBy(id= "qnn_6_27_0")   WebElement BTN_6_27_0;
    @FindBy(css= "label[for='qnn_6_27_0']")   WebElement LBL_6_27_0;

    @FindBy(id= "qnn_6_27_1")   WebElement BTN_6_27_1;
    @FindBy(css= "label[for='qnn_6_27_1']")   WebElement LBL_6_27_1;



    //-------------------- Methods --------------------
    public void Upitnik() throws Exception {}
    public void QuestionnaireTypeLabel() throws Exception {}
    public void QuestionnaireType() throws Exception {}
 
    public void questionnaireLabel() throws Exception {}
    public void QNN_6_0() throws Exception {}
    public void BTN_6_0_0() throws Exception {}
    public void LBL_6_0_0() throws Exception {}
    public void LBL_6_0_1_0() throws Exception {}
    public void TXT_6_0_1_0() throws Exception {}
    public void BTN_6_0_1() throws Exception {}
    public void LBL_6_0_1() throws Exception {}
 
    public void QNN_6_1() throws Exception {}
    public void BTN_6_1_0() throws Exception {}
    public void LBL_6_1_0() throws Exception {}
    public void LBL_6_1_1_0() throws Exception {}
    public void TXT_6_1_1_0() throws Exception {}
    public void BTN_6_1_1() throws Exception {}
    public void LBL_6_1_1() throws Exception {}
 
    public void QNN_6_2() throws Exception {}
    public void BTN_6_2_0() throws Exception {}
    public void LBL_6_2_0() throws Exception {}
    public void BTN_6_2_1() throws Exception {}
    public void LBL_6_2_1() throws Exception {}
    public void LBL_6_2_1_0() throws Exception {}
    public void TXT_6_2_1_0() throws Exception {}
 
    public void QNN_6_3() throws Exception {}
    public void BTN_6_3_0() throws Exception {}
    public void LBL_6_3_0() throws Exception {}
    public void LBL_6_3_1_0() throws Exception {}
    public void TXT_6_3_1_0() throws Exception {}
    public void BTN_6_3_1() throws Exception {}
    public void LBL_6_3_1() throws Exception {}
 
    public void QNN_6_4() throws Exception {}
    public void BTN_6_4_0() throws Exception {}
    public void LBL_6_4_0() throws Exception {}
    public void LBL_6_4_1_0() throws Exception {}
    public void TXT_6_4_1_0() throws Exception {}
    public void BTN_6_4_1() throws Exception {}
    public void LBL_6_4_1() throws Exception {}
 
    public void QNN_6_5() throws Exception {}
    public void BTN_6_5_0() throws Exception {}
    public void LBL_6_5_0() throws Exception {}
    public void LBL_6_5_1_0() throws Exception {}
    public void TXT_6_5_1_0() throws Exception {}
    public void BTN_6_5_1() throws Exception {}
    public void LBL_6_5_1() throws Exception {}
 
    public void QNN_6_6() throws Exception {}
    public void BTN_6_6_0() throws Exception {}
    public void LBL_6_6_0() throws Exception {}
    public void LBL_6_6_1_0() throws Exception {}
    public void TXT_6_6_1_0() throws Exception {}
    public void BTN_6_6_1() throws Exception {}
    public void LBL_6_6_1() throws Exception {}
 
    public void QNN_6_7() throws Exception {}
    public void BTN_6_7_0() throws Exception {}
    public void LBL_6_7_0() throws Exception {}
    public void LBL_6_7_1_0() throws Exception {}
    public void TXT_6_7_1_0() throws Exception {}
    public void BTN_6_7_1() throws Exception {}
    public void LBL_6_7_1() throws Exception {}
 
    public void QNN_6_8() throws Exception {}
    public void BTN_6_8_0() throws Exception {}
    public void LBL_6_8_0() throws Exception {}
    public void LBL_6_8_1_0() throws Exception {}
    public void TXT_6_8_1_0() throws Exception {}
    public void BTN_6_8_1() throws Exception {}
    public void LBL_6_8_1() throws Exception {}
 
    public void QNN_6_9() throws Exception {}
    public void BTN_6_9_0() throws Exception {}
    public void LBL_6_9_0() throws Exception {}
    public void LBL_6_9_1_0() throws Exception {}
    public void TXT_6_9_1_0() throws Exception {}
    public void BTN_6_9_1() throws Exception {}
    public void LBL_6_9_1() throws Exception {}
 
    public void QNN_6_10() throws Exception {}
    public void BTN_6_10_0() throws Exception {}
    public void LBL_6_10_0() throws Exception {}
    public void LBL_6_10_1_0() throws Exception {}
    public void TXT_6_10_1_0() throws Exception {}
    public void BTN_6_10_1() throws Exception {}
    public void LBL_6_10_1() throws Exception {}
 
    public void QNN_6_11() throws Exception {}
    public void BTN_6_11_0() throws Exception {}
    public void LBL_6_11_0() throws Exception {}
    public void LBL_6_11_1_0() throws Exception {}
    public void TXT_6_11_1_0() throws Exception {}
    public void BTN_6_11_1() throws Exception {}
    public void LBL_6_11_1() throws Exception {}
 
    public void QNN_6_12() throws Exception {}
    public void BTN_6_12_0() throws Exception {}
    public void LBL_6_12_0() throws Exception {}
    public void LBL_6_12_1_0() throws Exception {}
    public void TXT_6_12_1_0() throws Exception {}
    public void BTN_6_12_1() throws Exception {}
    public void LBL_6_12_1() throws Exception {}

    public void QNN_6_13() throws Exception {}
    public void BTN_6_13_0() throws Exception {}
    public void LBL_6_13_0() throws Exception {}
    public void LBL_6_13_1_0() throws Exception {}
    public void TXT_6_13_1_0() throws Exception {}
    public void BTN_6_13_1() throws Exception {}
    public void LBL_6_13_1() throws Exception {}

    public void QNN_6_14() throws Exception {}
    public void BTN_6_14_0() throws Exception {}
    public void LBL_6_14_0() throws Exception {}
    public void LBL_6_14_1_0() throws Exception {}
    public void TXT_6_14_1_0() throws Exception {}
    public void BTN_6_14_1() throws Exception {}
    public void LBL_6_14_1() throws Exception {}

    public void QNN_6_15() throws Exception {}
    public void BTN_6_15_0() throws Exception {}
    public void LBL_6_15_0() throws Exception {}
    public void LBL_6_15_1_0() throws Exception {}
    public void TXT_6_15_1_0() throws Exception {}
    public void BTN_6_15_1() throws Exception {}
    public void LBL_6_15_1() throws Exception {}

    public void QNN_6_16() throws Exception {}
    public void BTN_6_16_0() throws Exception {}
    public void LBL_6_16_0() throws Exception {}
    public void LBL_6_16_1_0() throws Exception {}
    public void TXT_6_16_1_0() throws Exception {}
    public void BTN_6_16_1() throws Exception {}
    public void LBL_6_16_1() throws Exception {}

    public void QNN_6_17() throws Exception {}
    public void BTN_6_17_0() throws Exception {}
    public void LBL_6_17_0() throws Exception {}
    public void LBL_6_17_1_0() throws Exception {}
    public void TXT_6_17_1_0() throws Exception {}
    public void BTN_6_17_1() throws Exception {}
    public void LBL_6_17_1() throws Exception {}

    public void QNN_6_18() throws Exception {}
    public void BTN_6_18_0() throws Exception {}
    public void LBL_6_18_0() throws Exception {}
    public void LBL_6_18_1_0() throws Exception {}
    public void TXT_6_18_1_0() throws Exception {}
    public void BTN_6_18_1() throws Exception {}
    public void LBL_6_18_1() throws Exception {}

    public void QNN_6_19() throws Exception {}
    public void LBL_6_19_1_0() throws Exception {}
    public void TXT_6_19_1_0() throws Exception {}
    public void BTN_6_19_0() throws Exception {}
    public void LBL_6_19_0() throws Exception {}
    public void BTN_6_19_1() throws Exception {}
    public void LBL_6_19_1() throws Exception {}

    public void QNN_6_20() throws Exception {}
    public void BTN_6_20_0() throws Exception {}
    public void LBL_6_20_0() throws Exception {}
    public void LBL_6_20_1_0() throws Exception {}
    public void TXT_6_20_1_0() throws Exception {}
    public void BTN_6_20_1() throws Exception {}
    public void LBL_6_20_1() throws Exception {}

    public void QNN_6_21() throws Exception {}
    public void BTN_6_21_0() throws Exception {}
    public void LBL_6_21_0() throws Exception {}
    public void LBL_6_21_1_0() throws Exception {}
    public void TXT_6_21_1_0() throws Exception {}
    public void BTN_6_21_1() throws Exception {}
    public void LBL_6_21_1() throws Exception {}

    public void QNN_6_22() throws Exception {}
    public void LBL_6_22_1_0() throws Exception {}
    public void TXT_6_22_1_0() throws Exception {}
    public void BTN_6_22_0() throws Exception {}
    public void LBL_6_22_0() throws Exception {}
    public void BTN_6_22_1() throws Exception {}
    public void LBL_6_22_1() throws Exception {}

    public void QNN_6_23() throws Exception {}
    public void BTN_6_23_0() throws Exception {}
    public void LBL_6_23_0() throws Exception {}
    public void LBL_6_23_1_0() throws Exception {}
    public void TXT_6_23_1_0() throws Exception {}
    public void BTN_6_23_1() throws Exception {}
    public void LBL_6_23_1() throws Exception {}

    public void QNN_6_24() throws Exception {}
    public void BTN_6_24_0() throws Exception {}
    public void LBL_6_24_0() throws Exception {}
    public void LBL_6_24_1_0() throws Exception {}
    public void TXT_6_24_1_0() throws Exception {}
    public void BTN_6_24_1() throws Exception {}
    public void LBL_6_24_1() throws Exception {}

    public void QNN_6_25() throws Exception {}
    public void LBL_6_25_1_0() throws Exception {}
    public void TXT_6_25_1_0() throws Exception {}
    public void BTN_6_25_0() throws Exception {}
    public void BTN_6_25_1() throws Exception {}
    public void LBL_6_25_0() throws Exception {}
    public void LBL_6_25_1() throws Exception {}

    public void QNN_6_26() throws Exception {}
    public void BTN_6_26_0() throws Exception {}
    public void LBL_6_26_0() throws Exception {}
    public void LBL_6_26_1_0() throws Exception {}
    public void TXT_6_26_1_0() throws Exception {}
    public void BTN_6_26_1() throws Exception {}
    public void LBL_6_26_1() throws Exception {}

    public void QNN_6_27() throws Exception {}
    public void BTN_6_27_0() throws Exception {}
    public void LBL_6_27_0() throws Exception {}
    public void LBL_6_27_1_0() throws Exception {}
    public void TXT_6_27_1_0() throws Exception {}
    public void BTN_6_27_1() throws Exception {}
    public void LBL_6_27_1() throws Exception {}



    //-------------------- End Methods --------------------

}
