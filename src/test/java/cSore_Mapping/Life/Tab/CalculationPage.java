package cSore_Mapping.Life.Tab;

import cSore_Mapping.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalculationPage extends BasePage {
    public CalculationPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id= "basic-grid_1")
    WebElement calculationGrid;
    @FindBy(id= "basic-grid_2")
    WebElement ransomGrid;
    @FindBy(id= "basic-grid_5")
    WebElement paidGrid;
    @FindBy(xpath= "//*[@id='form1']/div[4]/div[2]/div/div/div[2]/div/div[1]/fieldset/legend")
    WebElement approvalListLabel;
    @FindBy(xpath= "//*[contains(., 'Suma pod rizikom:')]")
    WebElement approvalSum;
    @FindBy(xpath= "//*[contains(., 'Suma pod rizikom na dan aktivacije:')]")
    WebElement ugp;
    @FindBy(xpath= "//*[contains(., 'Ukupna godišnja premija ugovarača:')]")
    WebElement sprda;
    @FindBy(xpath= "//*[contains(., 'Ugovarač strani funkcioner')]")
    WebElement ugovaracStraniFunkcioner;
    @FindBy(xpath= "//*[contains(., 'zakonski zastupnik funkcioner')]")
    WebElement zakonskiZastupnikFunkcioner;
    @FindBy(xpath= "//*[contains(., 'zakonski zastupnik politicki izlozena osoba')]")
    WebElement zakonskiZastupnikPoliticar;
    @FindBy(xpath= "//*[contains(., 'platilac funkcioner')]")
    WebElement platilacFunkcioner;
    @FindBy(xpath= "//*[contains(., 'platilac politicki izlozena osoba')]")
    WebElement platilacPoliticar;
    @FindBy(xpath= "//*[@id='Kol6']/div/div[1]/h4 ")
    WebElement documentsByInsureeLabel;
    @FindBy(id= "basic-grid_6")
    WebElement documentsByInsuree;
    @FindBy(xpath= "//*[@id='Kol7']/div/div[1]/h4 ")
    WebElement documentsByPolicyHolderLabel;
    @FindBy(id= "basic-grid_7")
    WebElement documentsByPolicyHolder;

    //-------------------- Methods --------------------
    public void CalculationGrid() throws Exception {}
    public void RansomGrid() throws Exception {}
    public void PaidGrid() throws Exception {}
    public void ApprovalListLabel() throws Exception {}
    public void ApprovalSum() throws Exception {}
    public void UGP() throws Exception {}
    public void SPRDA() throws Exception {}
    public void UgovaracStraniFunkcioner() throws Exception {}
    public void ZakonskiZastupnikFunkcioner() throws Exception {}
    public void ZakonskiZastupnikPoliticar() throws Exception {}
    public void PlatilacFunkcioner() throws Exception {}
    public void PlatilacPoliticar() throws Exception {}
    public void DocumentsByInsureeLabel() throws Exception {}
    public void DocumentsByInsuree() throws Exception {}
    public void DocumentsByPolicyHolderLabel() throws Exception {}
    public void DocumentsByPolicyHolder() throws Exception {}
    //-------------------- End Methods --------------------


}

