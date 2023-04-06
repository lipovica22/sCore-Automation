package cSore_Mapping.Life.Tab;

import cSore_Mapping.Common.Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class Concerns extends BasePage {


    public Concerns(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath= "//*[@id= 'form1']/div[4]/div[2]/div/div/div/div[2]/div/fieldset/legend")
    WebElement RiziciLabel;

    @FindBy(xpath= "//*[@id= 'form1']/div[4]/div[2]/div/div/div/div[1]/fieldset/legend")
    WebElement CalculationDirectionHeaderLabel;
    @FindBy(xpath= "//*[@id= 'form1']/div[4]/div[2]/div/div/div/div[1]/fieldset/div[1]/div[1]/div/label")
    WebElement CalculationDirectionLabel;
    @FindBy(id= "Kol1")
    WebElement CalculationDirection;
    @FindBy(xpath= "//*[@id= 'form1']/div[4]/div[2]/div/div/div/div[1]/fieldset/div[1]/div[2]/div/label")
    WebElement InsuredSumOrPremiumLabel;
    @FindBy(id= "Kol2")
    WebElement InsuredSumOrPremium;

    @FindBy(id= "ContentPlaceHolder1_Kol5_uc_wucBusinessEntityBaseSearch_selectFP")
    WebElement BaseSearchFP;
    @FindBy(id= "ContentPlaceHolder1_Kol5_uc_wucBusinessEntityBaseSearch_tbExternalReferenceId")
    WebElement BaseSearchReferenceId;
    @FindBy(id= "ContentPlaceHolder1_Kol5_uc_wucBusinessEntityBaseSearch_tbName")
    WebElement BaseSearchName;

    @FindBy(xpath= "//*[@id= 'form1']/div[4]/div[2]/div/div/div/div[1]/fieldset/div[3]/div[1]/div/label")
    WebElement DateOfBirthLabel;
    @FindBy(id= "Kol7")
    WebElement DateOfBirth;
    @FindBy(xpath= "//*[@id= 'form1']/div[4]/div[2]/div/div/div/div[1]/fieldset/div[3]/div[2]/div/label")
    WebElement EntryAgeLabel;
    @FindBy(id= "Kol12")
    WebElement EntryAge;
    @FindBy(xpath= "//*[@id= 'form1']/div[4]/div[2]/div/div/div/div[1]/fieldset/div[3]/div[3]/div/label")
    WebElement GenderLabel;
    @FindBy(id= "Kol8")
    WebElement Gender;
    @FindBy(xpath= "//*[@id= 'form1']/div[4]/div[2]/div/div/div/div[1]/fieldset/div[3]/div[4]/div/label")
    WebElement HeightLabel;
    @FindBy(id= "Kol3")
    WebElement Height;
    @FindBy(xpath= "//*[@id= 'form1']/div[4]/div[2]/div/div/div/div[1]/fieldset/div[3]/div[5]/div/label")
    WebElement WeightLabel;
    @FindBy(id= "Kol4")
    WebElement Weight;
    @FindBy(xpath= "//*[@id= 'form1']/div[4]/div[2]/div/div/div/div[1]/fieldset/div[3]/div[6]/div/label")
    WebElement BMILabel;
    @FindBy(id= "Kol16")
    WebElement BMI;
    @FindBy(xpath= "//*[@id= 'form1']/div[4]/div[2]/div/div/div/div[1]/fieldset/div[3]/div[7]/div/label")
    WebElement InterestLabel;
    @FindBy(id= "Kol13")
    WebElement Interest;

    @FindBy(id= "basic-grid_3")
    WebElement ConcernListGrid;

    @FindBy(id= "chk_7309")   WebElement DoživljenjeISmrt;
    @FindBy( linkText= "label[for=chk_7309]")   WebElement DoživljenjeISmrtLabel;
    @FindBy(id= "chk_7310")   WebElement Dozivljenje;
    @FindBy( css= "label[for=chk_7310]")   WebElement DoživljenjeLabel;
    @FindBy(id= "inp_7310_1")   WebElement DoživljenjeValue;
    @FindBy(id= "chk_7311")   WebElement Smrt;
    @FindBy( linkText= "Smrt")   WebElement SmrtLabel;
    @FindBy(id= "chk_7320")   WebElement TezeBolesti;
    @FindBy( css= "label.checkbox.rizici_osiguranja.checked:contains('Teže bolesti')")   WebElement TezeBolestiLabel;
    @FindBy(id= "inp_7320_1")   WebElement TezeBolestiValue;
    @FindBy(id= "chk_7312")   WebElement SmrtUsledNezgode;
    @FindBy( linkText= "Smrt usled nezgode ")   WebElement SmrtUsledNezgodeLabel;
    @FindBy(id= "inp_7312_1")   WebElement SmrtUsledNezgodeValue;
    @FindBy(id= "chk_7313")   WebElement TrajniInvaliditet;
    @FindBy( linkText= "Trajni invaliditet kao posledica nezgode")   WebElement TrajniInvaliditetLabel;
    @FindBy(id= "inp_7313_1")   WebElement TrajniInvaliditetValue;
    @FindBy(id= "chk_7314")   WebElement LomKostiju;
    @FindBy( linkText= "Lom kostiju kao posledica nezgode")   WebElement LomKostijuLabel;
    @FindBy(id= "sel_7314_1")   WebElement LomKostijuValue;
    @FindBy(id= "chk_7315")   WebElement DnevnaNaknadaNezgoda;
    @FindBy( linkText= "Dnevna naknada za bolnički dan kao posledica nezgode")   WebElement DnevnaNaknadaNezgodaLabel;
    @FindBy(id= "sel_7315_1")   WebElement DnevnaNaknadaNezgodaValue;
    @FindBy(id= "chk_7316")   WebElement DnevnaNaknadaBolesti;
    @FindBy( linkText= "Dnevna naknada za bolnički dan kao posledica bolesti i porođaja")   WebElement DnevnaNaknadaBolestiLabel;
    @FindBy(id= "sel_7316_1")   WebElement DnevnaNaknadaBolestiValue;
    @FindBy(id= "chk_7317")   WebElement HirurskeIntervencijeNezgode;
    @FindBy( linkText= "Hirurške intervencije kao posledica nezgode")   WebElement HirurskeIntervencijeNezgodeLabel;
    @FindBy(id= "sel_7317_1")   WebElement HirurskeIntervencijeNezgodeValue;
    @FindBy(id= "chk_7318")   WebElement HirurskeIntervencijeBolesti;
    @FindBy( linkText= "Hirurške intervencije kao posledica bolesti")   WebElement HirurskeIntervencijeBolestiLabel;
    @FindBy(id= "sel_7318_1")   WebElement HirurskeIntervencijeBolestiValue;
    @FindBy(id= "chk_7319")   WebElement Bolovanje42;
    @FindBy( linkText= "Bolovanje duže od 42 dana ")   WebElement Bolovanje42Label;
    @FindBy(id= "sel_7319_1")   WebElement Bolovanje42Value;



    @FindBy(id= "chk_7309")   WebElement SpektarDoživljenjeISmrt;
    @FindBy( css= "label[for=chk_7309]")   WebElement SpektarDoživljenjeISmrtLabel;
    @FindBy(id= "chk_7310")   WebElement SpektarDozivljenje;
    @FindBy( css= "label[for=chk_7310]")   WebElement SpektarDoživljenjeLabel;
    @FindBy(id= "inp_7310_1")   WebElement SpektarDoživljenjeValue;
    @FindBy(id= "chk_7311")   WebElement SpektarSmrt;
    @FindBy( css= "label[for=chk_7311]")   WebElement SpektarSmrtLabel;
    @FindBy(id= "chk_7320")   WebElement SpektarTezeBolesti;
    @FindBy( css= "label[for=chk_7320]")   WebElement SpektarTezeBolestiLabel;
    @FindBy(id= "inp_7320_1")   WebElement SpektarTezeBolestiValue;
    @FindBy(id= "chk_7312")   WebElement SpektarSmrtUsledNezgode;
    @FindBy( css= "label[for=chk_7312]")   WebElement SpektarSmrtUsledNezgodeLabel;
    @FindBy(id= "inp_7312_1")   WebElement SpektarSmrtUsledNezgodeValue;
    @FindBy(id= "chk_7313")   WebElement SpektarTrajniInvaliditet;
    @FindBy( css= "label[for=chk_7313]")   WebElement SpektarTrajniInvaliditetLabel;
    @FindBy(id= "inp_7313_1")   WebElement SpektarTrajniInvaliditetValue;
    @FindBy(id= "chk_7314")   WebElement SpektarLomKostiju;
    @FindBy( css= "label[for=chk_7314]")   WebElement SpektarLomKostijuLabel;
    @FindBy(id= "sel_7314_1")   WebElement SpektarLomKostijuValue;
    @FindBy(id= "chk_7315")   WebElement SpektarDnevnaNaknadaNezgoda;
    @FindBy( css= "label[for=chk_7315]")   WebElement SpektarDnevnaNaknadaNezgodaLabel;
    @FindBy(id= "sel_7315_1")   WebElement SpektarDnevnaNaknadaNezgodaValue;
    @FindBy(id= "chk_7316")   WebElement SpektarDnevnaNaknadaBolesti;
    @FindBy( css= "label[for=chk_7316]")   WebElement SpektarDnevnaNaknadaBolestiLabel;
    @FindBy(id= "sel_7316_1")   WebElement SpektarDnevnaNaknadaBolestiValue;
    @FindBy(id= "chk_7317")   WebElement SpektarHirurskeIntervencijeNezgode;
    @FindBy( css= "label[for=chk_7317]")   WebElement SpektarHirurskeIntervencijeNezgodeLabel;
    @FindBy(id= "sel_7317_1")   WebElement SpektarHirurskeIntervencijeNezgodeValue;
    @FindBy(id= "chk_7318")   WebElement SpektarHirurskeIntervencijeBolesti;
    @FindBy( css= "label[for=chk_7318]")   WebElement SpektarHirurskeIntervencijeBolestiLabel;
    @FindBy(id= "sel_7318_1")   WebElement SpektarHirurskeIntervencijeBolestiValue;
    @FindBy(id= "chk_7319")   WebElement SpektarBolovanje42;
    @FindBy( css= "label[for=chk_7319]")   WebElement SpektarBolovanje42Label;
    @FindBy(id= "sel_7319_1")   WebElement SpektarBolovanje42Value;


    @FindBy( css= "label[for=chk_41]")   WebElement RizikoSmrtLabel;
    @FindBy(id= "chk_41")   WebElement RizikoSmrt;
    @FindBy(id= "chk_3261")   WebElement RizikoTezeBolesti;
    @FindBy( css= "label[for=chk_3261]")   WebElement RizikoTezeBolestiLabel;
    @FindBy(id= "inp_3261_1")   WebElement RizikoTezeBolestiValue;
    @FindBy(id= "chk_42")   WebElement RizikoSmrtUsledNezgode;
    @FindBy( css= "label[for=chk_42]")   WebElement RizikoSmrtUsledNezgodeLabel;
    @FindBy(id= "inp_42_1")   WebElement RizikoSmrtUsledNezgodeValue;
    @FindBy(id= "chk_43")   WebElement RizikoTrajniInvaliditet;
    @FindBy( css= "label[for=chk_43]")   WebElement RizikoTrajniInvaliditetLabel;
    @FindBy(id= "inp_43_1")   WebElement RizikoTrajniInvaliditetValue;
    @FindBy(id= "chk_45")   WebElement RizikoLomKostiju;
    @FindBy( css= "label[for=chk_45]")   WebElement RizikoLomKostijuLabel;
    @FindBy(id= "sel_45_1")   WebElement RizikoLomKostijuValue;
    @FindBy(id= "chk_3258")   WebElement RizikoDnevnaNaknadaNezgoda;
    @FindBy( css= "label[for=chk_3258]")   WebElement RizikoDnevnaNaknadaNezgodaLabel;
    @FindBy(id= "sel_3258_1")   WebElement RizikoDnevnaNaknadaNezgodaValue;
    @FindBy(id= "chk_3259")   WebElement RizikoDnevnaNaknadaBolesti;
    @FindBy( css= "label[for=chk_3259]")   WebElement RizikoDnevnaNaknadaBolestiLabel;
    @FindBy(id= "sel_3259_1")   WebElement RizikoDnevnaNaknadaBolestiValue;
    @FindBy(id= "chk_3256")   WebElement RizikoHirurskeIntervencijeNezgode;
    @FindBy( css= "label[for=chk_3256]")   WebElement RizikoHirurskeIntervencijeNezgodeLabel;
    @FindBy(id= "sel_3256_1")   WebElement RizikoHirurskeIntervencijeNezgodeValue;
    @FindBy(id= "chk_3257")   WebElement RizikoHirurskeIntervencijeBolesti;
    @FindBy( css= "label[for=chk_3257]")   WebElement RizikoHirurskeIntervencijeBolestiLabel;
    @FindBy(id= "sel_3257_1")   WebElement RizikoHirurskeIntervencijeBolestiValue;
    @FindBy(id= "chk_3260")   WebElement RizikoBolovanje42;
    @FindBy( css= "label[for=chk_3260]")   WebElement RizikoBolovanje42Label;
    @FindBy(id= "sel_3260_1")   WebElement RizikoBolovanje42Value;

    @FindBy( css= "label[for=chk_3270]")   WebElement RMSmrtiTežeBolestiLabel;
    @FindBy(id= "chk_3270")   WebElement RMSmrtiTežeBolesti;
    @FindBy( css= "label[for=chk_3415]")   WebElement RMSmrtLabel;
    @FindBy(id= "chk_3415")   WebElement RMSmrt;
    @FindBy(id= "chk_3416")   WebElement RMTezeBolesti;
    @FindBy(css= "label[for=chk_3416]")   WebElement RMTezeBolestiLabel;
    @FindBy(id= "chk_3272")   WebElement RMSmrtUsledNezgode;
    @FindBy(css= "label[for=chk_3272]")   WebElement RMSmrtUsledNezgodeLabel;
    @FindBy(id= "inp_3272_1")   WebElement RMSmrtUsledNezgodeValue;
    @FindBy(id= "chk_3274")   WebElement RMTrajniInvaliditet;
    @FindBy( css= "label[for=chk_3274]")   WebElement RMTrajniInvaliditetLabel;
    @FindBy(id= "inp_3274_1")   WebElement RMTrajniInvaliditetValue;
    @FindBy(id= "chk_3276")   WebElement RMLomKostiju;
    @FindBy( css= "label[for=chk_3276]")   WebElement RMLomKostijuLabel;
    @FindBy(id= "sel_3276_1")   WebElement RMLomKostijuValue;
    @FindBy(id= "chk_3279")   WebElement RMDnevnaNaknadaNezgoda;
    @FindBy( css= "label[for=chk_3279]")   WebElement RMDnevnaNaknadaNezgodaLabel;
    @FindBy(id= "sel_3279_1")   WebElement RMDnevnaNaknadaNezgodaValue;
    @FindBy(id= "chk_3280")   WebElement RMDnevnaNaknadaBolesti;
    @FindBy( css= "label[for=chk_3280]")   WebElement RMDnevnaNaknadaBolestiLabel;
    @FindBy(id= "sel_3280_1")   WebElement RMDnevnaNaknadaBolestiValue;
    @FindBy(id= "chk_3281")   WebElement RMHirurskeIntervencijeNezgode;
    @FindBy( css= "label[for=chk_3281]")   WebElement RMHirurskeIntervencijeNezgodeLabel;
    @FindBy(id= "sel_3281_1")   WebElement RMHirurskeIntervencijeNezgodeValue;
    @FindBy(id= "chk_3282")   WebElement RMHirurskeIntervencijeBolesti;
    @FindBy( css= "label[for=chk_3282]")   WebElement RMHirurskeIntervencijeBolestiLabel;
    @FindBy(id= "sel_3282_1")   WebElement RMHirurskeIntervencijeBolestiValue;
    @FindBy(id= "chk_3288")   WebElement RMBolovanje42;
    @FindBy( css= "label[for=chk_3288]")   WebElement RMBolovanje42Label;
    @FindBy(id= "sel_3288_1")   WebElement RMBolovanje42Value;


    @FindBy(id= "chk_7333")   WebElement FavoritIndexDoživljenjeI;
    @FindBy( css= "label[for=chk_7333]")   WebElement FavoritIndexDoživljenjeLabelI;
    @FindBy(id= "chk_7334")   WebElement FavoritIndexTrajniInvaliditetI;
    @FindBy( css= "label[for=chk_7334]")   WebElement FavoritIndexTrajniInvaliditetLabelI;
    @FindBy(id= "inp_7334_1")   WebElement FavoritIndexTrajniInvaliditetValueI;
    @FindBy(id= "chk_7336")   WebElement FavoritIndexLomKostijuI;
    @FindBy( css= "label[for=chk_7336]")   WebElement FavoritIndexLomKostijuLabelI;
    @FindBy(id= "sel_7336_1")   WebElement FavoritIndexLomKostijuValueI;
    @FindBy(id= "chk_7335")   WebElement FavoritIndexDnevnaNaknadaNezgodaI;
    @FindBy( css= "label[for=chk_7335]")   WebElement FavoritIndexDnevnaNaknadaNezgodaLabelI;
    @FindBy(id= "sel_7335_1")   WebElement FavoritIndexDnevnaNaknadaNezgodaValueI;
    @FindBy(id= "chk_7337")   WebElement FavoritIndexHirurskeIntervencijeNezgodeI;
    @FindBy( css= "label[for=chk_7337]")   WebElement FavoritIndexHirurskeIntervencijeNezgodeLabelI;
    @FindBy(id= "sel_7337_1")   WebElement FavoritIndexHirurskeIntervencijeNezgodeValueI;

    @FindBy(id= "chk_7334")   WebElement FavoritBezIndexTrajniInvaliditet;
    @FindBy( css= "label[for=chk_7334]")   WebElement FavoritBezIndexTrajniInvaliditetLabel;
    @FindBy(id= "inp_7334_1")   WebElement FavoritBezIndexTrajniInvaliditetValue;
    @FindBy(id= "chk_7336")   WebElement FavoritBezIndexLomKostiju;
    @FindBy( css= "label[for=chk_7336]")   WebElement FavoritBezIndexLomKostijuLabel;
    @FindBy(id= "sel_7336_1")   WebElement FavoritBezIndexLomKostijuValue;
    @FindBy(id= "chk_7335")   WebElement FavoritBezIndexDnevnaNaknadaNezgoda;
    @FindBy( css= "label[for=chk_7335]")   WebElement FavoritBezIndexDnevnaNaknadaNezgodaLabel;
    @FindBy(id= "sel_7335_1")   WebElement FavoritBezIndexDnevnaNaknadaNezgodaValue;
    @FindBy(id= "chk_7337")   WebElement FavoritBezIndexHirurskeIntervencijeNezgode;
    @FindBy( css= "label[for=chk_7337]")   WebElement FavoritBezIndexHirurskeIntervencijeNezgodeLabel;
    @FindBy(id= "sel_7337_1")   WebElement FavoritBezIndexHirurskeIntervencijeNezgodeValue;

    @FindBy(id= "chk_7322")   WebElement JokerBezIndexDozivljenje;
    @FindBy( css= "label[for=chk_7322]")   WebElement JokerBezIndexDozivljenjeLabel;
    @FindBy(id= "chk_7331")   WebElement JokerBezIndexTezeBolesti;
    @FindBy( css= "label[for=chk_7331]")   WebElement JokerBezIndexTezeBolestiLabel;
    @FindBy(id= "inp_7331_1")   WebElement JokerBezIndexTezeBolestiValue;
    @FindBy(id= "chk_7323")   WebElement JokerBezIndexSmrtUsledNezgode;
    @FindBy( css= "label[for=chk_7323]")   WebElement JokerBezIndexSmrtUsledNezgodeLabel;
    @FindBy(id= "inp_7323_1")   WebElement JokerBezIndexSmrtUsledNezgodeValue;
    @FindBy(id= "chk_7324")   WebElement JokerBezIndexTrajniInvaliditet;
    @FindBy( css= "label[for=chk_7324]")   WebElement JokerBezIndexTrajniInvaliditetLabel;
    @FindBy(id= "inp_7324_1")   WebElement JokerBezIndexTrajniInvaliditetValue;
    @FindBy(id= "chk_7325")   WebElement JokerBezIndexLomKostiju;
    @FindBy( css= "label[for=chk_7325]")   WebElement JokerBezIndexLomKostijuLabel;
    @FindBy(id= "sel_7325_1")   WebElement JokerBezIndexLomKostijuValue;
    @FindBy(id= "chk_7326")   WebElement JokerBezIndexDnevnaNaknadaNezgoda;
    @FindBy( css= "label[for=chk_7326]")   WebElement JokerBezIndexDnevnaNaknadaNezgodaLabel;
    @FindBy(id= "sel_7326_1")   WebElement JokerBezIndexDnevnaNaknadaNezgodaValue;
    @FindBy(id= "chk_7327")   WebElement JokerBezIndexDnevnaNaknadaBolesti;
    @FindBy( css= "label[for=chk_7327]")   WebElement JokerBezIndexDnevnaNaknadaBolestiLabel;
    @FindBy(id= "sel_7327_1")   WebElement JokerBezIndexDnevnaNaknadaBolestiValue;
    @FindBy(id= "chk_7328")   WebElement JokerBezIndexHirurskeIntervencijeNezgode;
    @FindBy( css= "label[for=chk_7328]")   WebElement JokerBezIndexHirurskeIntervencijeNezgodeLabel;
    @FindBy(id= "sel_7328_1")   WebElement JokerBezIndexHirurskeIntervencijeNezgodeValue;
    @FindBy(id= "chk_7329")   WebElement JokerBezIndexHirurskeIntervencijeBolesti;
    @FindBy( css= "label[for=chk_7329]")   WebElement JokerBezIndexHirurskeIntervencijeBolestiLabel;
    @FindBy(id= "sel_7329_1")   WebElement JokerBezIndexHirurskeIntervencijeBolestiValue;
    @FindBy(id= "chk_7330")   WebElement JokerBezIndexBolovanje42;
    @FindBy( css= "label[for=chk_7330]")   WebElement JokerBezIndexBolovanje42Label;
    @FindBy(id= "sel_7330_1")   WebElement JokerBezIndexBolovanje42Value;

    @FindBy(id= "chk_7322")   WebElement JokerIndexDoživljenjeI;
    @FindBy( css= "label[for=chk_7322]")   WebElement JokerIndexDoživljenjeLabelI;
    @FindBy(id= "chk_7331")   WebElement JokerIndexTezeBolestiI;
    @FindBy( css= "label[for=chk_7331]")   WebElement JokerIndexTezeBolestiLabelI;
    @FindBy(id= "inp_7331_1")   WebElement JokerIndexTezeBolestiValueI;
    @FindBy(id= "chk_7323")   WebElement JokerIndexSmrtUsledNezgodeI;
    @FindBy( css= "label[for=chk_7323]")   WebElement JokerIndexSmrtUsledNezgodeLabelI;
    @FindBy(id= "inp_7323_1")   WebElement JokerIndexSmrtUsledNezgodeValueI;
    @FindBy(id= "chk_7324")   WebElement JokerIndexTrajniInvaliditetI;
    @FindBy( css= "label[for=chk_7324]")   WebElement JokerIndexTrajniInvaliditetLabelI;
    @FindBy(id= "inp_7324_1")   WebElement JokerIndexTrajniInvaliditetValueI;
    @FindBy(id= "chk_7325")   WebElement JokerIndexLomKostijuI;
    @FindBy( linkText= "label[for=chk_7325]")   WebElement JokerIndexLomKostijuLabelI;
    @FindBy(id= "sel_7325_1")   WebElement JokerIndexLomKostijuValueI;
    @FindBy(id= "chk_7326")   WebElement JokerIndexDnevnaNaknadaNezgodaI;
    @FindBy( css= "label[for=chk_7326]")   WebElement JokerIndexDnevnaNaknadaNezgodaLabelI;
    @FindBy(id= "sel_7326_1")   WebElement JokerIndexDnevnaNaknadaNezgodaValueI;
    @FindBy(id= "chk_7327")   WebElement JokerIndexDnevnaNaknadaBolestiI;
    @FindBy( css= "label[for=chk_7327]")   WebElement JokerIndexDnevnaNaknadaBolestiLabelI;
    @FindBy(id= "sel_7327_1")   WebElement JokerIndexDnevnaNaknadaBolestiValueI;
    @FindBy(id= "chk_7328")   WebElement JokerIndexHirurskeIntervencijeNezgodeI;
    @FindBy( css= "label[for=chk_7328]")   WebElement JokerIndexHirurskeIntervencijeNezgodeLabelI;
    @FindBy(id= "sel_7328_1")   WebElement JokerIndexHirurskeIntervencijeNezgodeValueI;
    @FindBy(id= "chk_7329")   WebElement JokerIndexHirurskeIntervencijeBolestiI;
    @FindBy( css= "label[for=chk_7329]")   WebElement JokerIndexHirurskeIntervencijeBolestiLabelI;
    @FindBy(id= "sel_7329_1")   WebElement JokerIndexHirurskeIntervencijeBolestiValueI;
    @FindBy(id= "chk_7330")   WebElement JokerIndexBolovanje42I;
    @FindBy( css= "label[for=chk_7330]")   WebElement JokerIndexBolovanje42LabelI;
    @FindBy(id= "sel_7330_1")   WebElement JokerIndexBolovanje42ValueI;


    public void RiziciLabel() throws Exception {}

    public void CalculationDirectionHeaderLabel() throws Exception {}
    public void CalculationDirectionLabel() throws Exception {}
    public void selectCalculationDirection(String calculationDirection) throws Exception {
        SelectOption(CalculationDirection, "Select Calculation direction", calculationDirection);
    }
    public void InsuredSumOrPremiumLabel() throws Exception {}
    public void inputInsuredSumOrPremium(String sumOrPremium) throws Exception {
        SetValue(InsuredSumOrPremium, "Input insured sum or premium", sumOrPremium);
    }

    public void BaseSearchFP() throws Exception {}
    public void BaseSearchReferenceId() throws Exception {}
    public void BaseSearchName() throws Exception {}

    public void DateOfBirthLabel() throws Exception {}
    public void DateOfBirth() throws Exception {}
    public void EntryAgeLabel() throws Exception {}
    public void EntryAge() throws Exception {}
    public void GenderLabel() throws Exception {}
    public void Gender() throws Exception {}
    public void HeightLabel() throws Exception {}
    public void inputHeight(String height) throws Exception {
        SetValue(Height, "Input height", height);
    }
    public void WeightLabel() throws Exception {}
    public void inputWeight(String weight) throws Exception {
        SetValue(Weight, "Input weight", weight);
    }
    public void BMILabel() throws Exception {}
    public void BMI() throws Exception {

    }
    public void InterestLabel() throws Exception {}
    public void inputInterest(String interest) throws Exception {
        SetValue(Interest, "Input height",interest );
    }

    public void ConcernListGrid() throws Exception {}



    public void DoživljenjeISmrt() throws Exception {}
    public void DoživljenjeISmrtLabel() throws Exception {}
    public void clickDozivljenje() throws Exception {
        Click(SpektarDozivljenje, "Dozivljenje clicked");
    }
    public void DoživljenjeLabel() throws Exception {}
    public void DoživljenjeValue(String doz) throws Exception {}
    public void Smrt(String smrt) throws Exception {}
    public void SmrtLabel() throws Exception {}

    /*public void clickTezeBolesti(String proizvod) throws Exception {
        switch (proizvod) {
            case "Doživotni riziko": {
            }
            break;
            case "Joker": {
                Click(JokerIndexTezeBolestiLabelI, "TezeBolesti clicked");
                Click(JokerBezIndexTezeBolestiLabel, "TezeBolesti clicked");
            }
            break;
            case "Spektar": {
                Click(SpektarTezeBolestiLabel, "TezeBolesti clicked");
            }
            break;
            case "Riziko Mix": {
                Click(RMTezeBolestiLabel, "TezeBolesti clicked");
            }
            break;
            case "Riziko": {
                Click(RizikoTezeBolestiLabel, "TezeBolesti clicked");
            }
            break;
            default:
                break;
        }
    }
    public void TezeBolestiLabel() throws Exception {}
    public void inputTezeBolestiValue(String tb) throws Exception {
        SetValue(RizikoTezeBolestiValue,"Set value fot ",tb);
    }

    public void clickSmrtUsledNezgode(String proizvod) throws Exception {
        switch (proizvod) {
            case "Doživotni riziko": {

            }
            break;
            case "Joker": {
                Click(JokerIndexSmrtUsledNezgodeLabelI, "TezeBolesti clicked");
                Click(JokerBezIndexSmrtUsledNezgodeLabel, "TezeBolesti clicked");
            }
            break;
            case "Spektar": {
                Click(SpektarSmrtUsledNezgodeLabel, "TezeBolesti clicked");
            }
            break;
            case "Riziko Mix": {
                Click(RMSmrtUsledNezgodeLabel, "TezeBolesti clicked");
            }

            break;
            case "Riziko": {
                Click(RizikoSmrtUsledNezgodeLabel, "TezeBolesti clicked");
            }
            break;
            default:
                break;
        }
    }
    public void SmrtUsledNezgodeLabel() throws Exception {}
    public void inputSmrtUsledNezgodeValue(String smrtN) throws Exception {
        SetValue(RizikoSmrtUsledNezgodeValue,"Set value fot ",smrtN);
    }

    public void clickTrajniInvaliditet(String proizvod) throws Exception {
        switch (proizvod) {
            case "Doživotni riziko": {
            }
            break;
            case "Favorit": {
                Click(FavoritBezIndexTrajniInvaliditetLabel, "TrajniInvaliditet clicked");
                Click(FavoritIndexTrajniInvaliditetLabelI, "TrajniInvaliditet clicked");
            }
            break;
            case "Joker": {
                Click(JokerIndexTrajniInvaliditetLabelI, "TrajniInvaliditet clicked");
                Click(JokerBezIndexTrajniInvaliditetLabel, "TrajniInvaliditet clicked");
            }
            break;
            case "Spektar": {
                Click(SpektarTrajniInvaliditetLabel, "TrajniInvaliditet clicked");
            }
            break;
            case "Riziko Mix": {
                Click(RMTrajniInvaliditetLabel, "TrajniInvaliditet clicked");
            }
            break;
            case "Riziko": {
                Click(RizikoTrajniInvaliditetLabel, "TrajniInvaliditet clicked");
            }
            break;
            default:
                break;
        }
    }
    public void TrajniInvaliditetLabel() throws Exception {}
    public void inputTrajniInvaliditetValue(String tin) throws Exception {
        SetValue(RizikoTrajniInvaliditetValue,"Set value fot ",tin);
    }

    public void clickLomKostiju(String proizvod) throws Exception {
        switch (proizvod) {
            case "Doživotni riziko": {
            }
            break;
            case "Favorit": {
                Click(FavoritIndexLomKostijuLabelI, "LomKostiju clicked");
                Click(FavoritBezIndexLomKostijuLabel, "LomKostiju clicked");
            }
            break;
            case "Joker": {
                Click(JokerIndexLomKostijuLabelI, "LomKostiju clicked");
                Click(JokerBezIndexLomKostijuLabel, "LomKostiju clicked");

            }
            break;
            case "Spektar": {
                Click(SpektarLomKostijuLabel, "LomKostiju clicked");
            }
            break;
            case "Riziko Mix": {
                Click(RMLomKostijuLabel, "LomKostiju clicked");
            }

            break;
            case "Riziko": {
                Click(RizikoLomKostijuLabel, "LomKostiju clicked");
            }
            break;
            default:
                break;
        }
    }
    public void LomKostijuLabel() throws Exception {}
    public void inputLomKostijuValue(String lk) throws Exception {
        SelectOption(RizikoLomKostijuValue,"Set value fot ",lk);
    }

    public void clickDnevnaNaknadaNezgoda(String proizvod) throws Exception {
        switch (proizvod) {
            case "Doživotni riziko": {
            }
            break;
            case "Favorit": {
                Click(FavoritIndexDnevnaNaknadaNezgodaLabelI, "LomKostiju clicked");
                Click(FavoritBezIndexDnevnaNaknadaNezgodaLabel, "LomKostiju clicked");
            }
            break;
            case "Joker": {
                Click(JokerIndexDnevnaNaknadaNezgodaLabelI, "LomKostiju clicked");
                Click(JokerBezIndexDnevnaNaknadaNezgodaLabel, "LomKostiju clicked");
            }
            break;
            case "Spektar": {
                Click(SpektarDnevnaNaknadaNezgodaLabel, "TezeBolesti clicked");
            }
            break;
            case "Riziko Mix": {
                Click(RMDnevnaNaknadaNezgodaLabel, "TezeBolesti clicked");
            }

            break;
            case "Riziko": {
                Click(RizikoDnevnaNaknadaNezgodaLabel, "TezeBolesti clicked");
            }
            break;
            default:
                break;
        }
    }
    public void DnevnaNaknadaNezgodaLabel() throws Exception {}
    public void inputDnevnaNaknadaNezgodaValue(String dnn) throws Exception {
        SelectOption(RizikoDnevnaNaknadaNezgodaValue,"Set value fot ",dnn);
    }

    public void clickDnevnaNaknadaBolesti(String proizvod) throws Exception {
        switch (proizvod) {
            case "Doživotni riziko": {
            }
            break;
            case "Joker": {
                Click(JokerIndexDnevnaNaknadaBolestiLabelI, "TezeBolesti clicked");
                Click(JokerBezIndexDnevnaNaknadaBolestiLabel, "TezeBolesti clicked");
            }
            break;
            case "Spektar": {
                Click(SpektarDnevnaNaknadaBolestiLabel, "TezeBolesti clicked");
            }
            break;
            case "Riziko Mix": {
                Click(RMDnevnaNaknadaBolestiLabel, "TezeBolesti clicked");
            }
            break;
            case "Riziko": {
                Click(RizikoDnevnaNaknadaBolestiLabel, "TezeBolesti clicked");
            }
            break;
            default:
                break;
        }
    }
    public void DnevnaNaknadaBolestiLabel() throws Exception {}
    public void inputDnevnaNaknadaBolestiValue(String dnb) throws Exception {
        SelectOption(RizikoDnevnaNaknadaBolestiValue,"Set value fot ",dnb);
    }

    public void clickHirurskeIntervencijeNezgode(String proizvod) throws Exception {
        switch (proizvod) {
            case "Doživotni riziko": {
            }
            break;
            case "Favorit": {
                Click(FavoritIndexHirurskeIntervencijeNezgodeLabelI, "TezeBolesti clicked");
                Click(FavoritBezIndexHirurskeIntervencijeNezgodeLabel, "TezeBolesti clicked");
            }
            break;
            case "Joker": {
                Click(JokerIndexHirurskeIntervencijeNezgodeLabelI, "TezeBolesti clicked");
                Click(JokerBezIndexHirurskeIntervencijeNezgodeLabel, "TezeBolesti clicked");
            }
            break;
            case "Spektar": {
                Click(SpektarHirurskeIntervencijeNezgodeLabel, "TezeBolesti clicked");
            }
            break;
            case "Riziko Mix": {
                Click(RMHirurskeIntervencijeNezgodeLabel, "TezeBolesti clicked");
            }

            break;
            case "Riziko": {
                Click(RizikoHirurskeIntervencijeNezgodeLabel, "TezeBolesti clicked");
            }
            break;
            default:
                break;
        }
    }
    public void HirurskeIntervencijeNezgodeLabel() throws Exception {}
    public void inputHirurskeIntervencijeNezgodeValue(String hin) throws Exception {
        SelectOption(RizikoHirurskeIntervencijeNezgodeValue,"Set value fot ",hin);
    }

    public void clickHirurskeIntervencijeBolesti(String proizvod) throws Exception {
        switch (proizvod) {
            case "Doživotni riziko": {
            }
            break;
            case "Joker": {
                Click(JokerIndexHirurskeIntervencijeBolestiLabelI, "TezeBolesti clicked");
                Click(JokerBezIndexHirurskeIntervencijeBolestiLabel, "TezeBolesti clicked");
            }
            break;
            case "Spektar": {
                Click(SpektarHirurskeIntervencijeBolestiLabel, "TezeBolesti clicked");
            }
            break;
            case "Riziko Mix": {
                Click(RMHirurskeIntervencijeBolestiLabel, "TezeBolesti clicked");
            }
            break;
            case "Riziko": {
                Click(RizikoHirurskeIntervencijeBolestiLabel, "TezeBolesti clicked");
            }
            break;
            default:
                break;
        }
    }
    public void HirurskeIntervencijeBolestiLabel() throws Exception {}
    public void inputHirurskeIntervencijeBolestiValue(String hib) throws Exception {
        SelectOption(RizikoHirurskeIntervencijeBolestiValue,"Set value fot ",hib);
    }

    public void clickBolovanje42(String proizvod) throws Exception {
        switch (proizvod) {
            case "Doživotni riziko": {
            }
            break;

            case "Joker": {
                Click(JokerIndexBolovanje42LabelI, "Bolovanje42dana clicked");
                Click(JokerBezIndexBolovanje42Label, "Bolovanje42dana clicked");
            }
            break;
            case "Spektar": {
                Click(SpektarBolovanje42Label, "Bolovanje42dana clicked");
            }
            break;
            case "Riziko Mix": {
                Click(RMBolovanje42Label, "TezeBolesti clicked");
            }
            break;
            case "Riziko": {
                Click(RizikoBolovanje42Label, "Bolovanje42dana clicked");
            }
            break;
            default:
                break;
        }
    }
    public void Bolovanje42Label() throws Exception {}
    public void inputBolovanje42Value(String bol) throws Exception {
        SelectOption(RizikoBolovanje42Value,"Set value fot ",bol);
    }
*/

    public void clickTezeBolesti() throws Exception {
        TezeBolestiLabel.click();
    }
    public void TezeBolestiValue() throws Exception {}

    public void clickSmrtUsledNezgode() throws Exception {
        Click(SmrtUsledNezgodeLabel,"");
    }

    public void SmrtUsledNezgodeValue() throws Exception {}

    public void clickTrajniInvaliditet() throws Exception {
        Click(TrajniInvaliditetLabel,"");
    }

    public void TrajniInvaliditetValue() throws Exception {}

    public void clickLomKostiju() throws Exception {
        Click(LomKostijuLabel,"");
    }
    public void LomKostijuValue() throws Exception {}

    public void clickDnevnaNaknadaNezgoda() throws Exception {
        Click(DnevnaNaknadaNezgodaLabel,"");
    }
    public void DnevnaNaknadaNezgodaValue() throws Exception {}

    public void clickDnevnaNaknadaBolesti() throws Exception {
        Click(DnevnaNaknadaBolestiLabel,"");
    }

    public void DnevnaNaknadaBolestiValue() throws Exception {}
    public void clickHirurskeIntervencijeNezgode() throws Exception {
        Click(HirurskeIntervencijeNezgodeLabel,"");
    }

    public void HirurskeIntervencijeNezgodeValue() throws Exception {}

    public void clickHirurskeIntervencijeBolesti() throws Exception {
        Click(HirurskeIntervencijeBolestiLabel,"");
    }
    public void HirurskeIntervencijeBolestiValue() throws Exception {}

    public void clickBolovanje42() throws Exception {
        Click(Bolovanje42Label,"");
    }
    public void Bolovanje42Value() throws Exception {}

}

