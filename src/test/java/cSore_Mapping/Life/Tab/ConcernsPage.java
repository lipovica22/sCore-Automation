package cSore_Mapping.Life.Tab;

import cSore_Mapping.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class ConcernsPage extends BasePage {
    public ConcernsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath= "//*[@id= 'form1']/div[4]/div[2]/div/div/div/div[2]/div/fieldset/legend")
    WebElement riziciLabel;
    @FindBy(xpath= "//*[@id= 'form1']/div[4]/div[2]/div/div/div/div[1]/fieldset/legend")
    WebElement calculationDirectionHeaderLabel;
    @FindBy(xpath= "//*[@id= 'form1']/div[4]/div[2]/div/div/div/div[1]/fieldset/div[1]/div[1]/div/label")
    WebElement calculationDirectionLabel;
    @FindBy(id= "Kol1")
    WebElement calculationDirection;
    @FindBy(xpath= "//*[@id= 'form1']/div[4]/div[2]/div/div/div/div[1]/fieldset/div[1]/div[2]/div/label")
    WebElement insuredSumOrPremiumLabel;
    @FindBy(id= "Kol2")
    WebElement insuredSumOrPremium;
    @FindBy(id= "ContentPlaceHolder1_Kol5_uc_wucBusinessEntityBaseSearch_selectFP")
    WebElement baseSearchFP;
    @FindBy(id= "ContentPlaceHolder1_Kol5_uc_wucBusinessEntityBaseSearch_tbExternalReferenceId")
    WebElement baseSearchReferenceId;
    @FindBy(id= "ContentPlaceHolder1_Kol5_uc_wucBusinessEntityBaseSearch_tbName")
    WebElement baseSearchName;
    @FindBy(xpath= "//*[@id= 'form1']/div[4]/div[2]/div/div/div/div[1]/fieldset/div[3]/div[1]/div/label")
    WebElement dateOfBirthLabel;
    @FindBy(id= "Kol7")
    WebElement dateOfBirth;
    @FindBy(xpath= "//*[@id= 'form1']/div[4]/div[2]/div/div/div/div[1]/fieldset/div[3]/div[2]/div/label")
    WebElement entryAgeLabel;
    @FindBy(id= "Kol12")
    WebElement entryAge;
    @FindBy(xpath= "//*[@id= 'form1']/div[4]/div[2]/div/div/div/div[1]/fieldset/div[3]/div[3]/div/label")
    WebElement genderLabel;
    @FindBy(id= "Kol8")
    WebElement gender;
    @FindBy(xpath= "//*[@id= 'form1']/div[4]/div[2]/div/div/div/div[1]/fieldset/div[3]/div[4]/div/label")
    WebElement heightLabel;
    @FindBy(id= "Kol3")
    WebElement height;
    @FindBy(xpath= "//*[@id= 'form1']/div[4]/div[2]/div/div/div/div[1]/fieldset/div[3]/div[5]/div/label")
    WebElement weightLabel;
    @FindBy(id= "Kol4")
    WebElement weight;
    @FindBy(xpath= "//*[@id= 'form1']/div[4]/div[2]/div/div/div/div[1]/fieldset/div[3]/div[6]/div/label")
    WebElement bmiLabel;
    @FindBy(id= "Kol16")
    WebElement bmi;
    @FindBy(xpath= "//*[@id= 'form1']/div[4]/div[2]/div/div/div/div[1]/fieldset/div[3]/div[7]/div/label")
    WebElement interestLabel;
    @FindBy(id= "Kol13")
    WebElement interest;
    @FindBy(id= "basic-grid_3")
    WebElement concernListGrid;

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

    @FindBy(id= "chk_7372")   WebElement DozivotniRizikoSrmt;
    @FindBy( css= "label[for=chk_7372]")   WebElement DozivotniRizikoSrmtLabel;

    @FindBy( css= "label[for=chk_7373]")   WebElement DozivotniRizikoSmrtUsledNezgode;
    @FindBy( css= "label[for=chk_7373]")   WebElement DozivotniRizikoSmrtUsledNezgodeLabel;
    @FindBy(id= "inp_7373_1")   WebElement DozivotniRizikoSmrtUsledNezgodeValue;

    @FindBy( id= "chk_7374")   WebElement DozivotniRizikoTrajniInvaliditet;
    @FindBy( css= "label[for=chk_7374]")   WebElement DozivotniRizikoTrajniInvaliditetLabel;
    @FindBy(id= "inp_7374_1")   WebElement DozivotniRizikoTrajniInvaliditetValue;

    @FindBy(id= "chk_7375")   WebElement DozivotniRizikoLomKostiju;
    @FindBy( css= "label[for=chk_7375]")   WebElement DozivotniRizikoLomKostijuLabel;
    @FindBy(id= "sel_7375_1")   WebElement DozivotniRizikoLomKostijuValue;

    @FindBy(id= "chk_7376")   WebElement DozivotniRizikoDnevnaNaknadaNezgoda;
    @FindBy( css= "label[for=chk_7376]")   WebElement DozivotniRizikoDnevnaNaknadaNezgodaLabel;
    @FindBy(id= "sel_7376_1")   WebElement DozivotniRizikoDnevnaNaknadaNezgodaValue;

    @FindBy(id= "chk_7378")   WebElement DozivotniRizikoHirurskeIntervencijeNezgode;
    @FindBy( css= "label[for=chk_7378]")   WebElement DozivotniRizikoHirurskeIntervencijeNezgodeLabel;
    @FindBy(id= "sel_7378_1")   WebElement DozivotniRizikoHirurskeIntervencijeNezgodeValue;
    //-------------------- Methods --------------------
    public void RiziciLabel() throws Exception {}
    public void CalculationDirectionHeaderLabel() throws Exception {}
    public void CalculationDirectionLabel() throws Exception {}
    public void selectCalculationDirection(String valueCalculationDirection) throws Exception {
        SelectOption(calculationDirection, "Select Calculation direction", valueCalculationDirection);
    }
    public void InsuredSumOrPremiumLabel() throws Exception {}
    public void setInsuredSumOrPremium(String sumOrPremium) throws Exception {
        SetValue(insuredSumOrPremium, "Input insured sum or premium", sumOrPremium);
    }

    public void BaseSearchFP() throws Exception {}
    public void BaseSearchReferenceId() throws Exception {}
    public void BaseSearchName() throws Exception {}

    public void DateOfBirthLabel() throws Exception {}
    public void inputDateOfBirth(String birthdate) throws Exception {
        SetValue(dateOfBirth, "Input date of birth", birthdate);
    }
    public void EntryAgeLabel() throws Exception {}
    public void EntryAge() throws Exception {}
    public void GenderLabel() throws Exception {}
    public void selectGender(String gende) throws Exception {
        SelectOption(gender, "Select gender", gende);
    }
    public void HeightLabel() throws Exception {}
    public void setHeight(String valueHeight) throws Exception {
        SetValue(height, "Input height", valueHeight);
    }
    public void WeightLabel() throws Exception {}

    public void setWeight(String valueWeight) throws Exception {
        SetValue(weight, "Input weight", valueWeight);
    }
    public void BMILabel() throws Exception {}
    public void BMI() throws Exception {}
    public void InterestLabel() throws Exception {}

    public void setInterest(String valueInterest) throws Exception {
        SetValue(interest, "Input interest", valueInterest );
    }
    public void ConcernListGrid() throws Exception {}
    public void DoživljenjeISmrt() throws Exception {}
    public void DoživljenjeISmrtLabel() throws Exception {}
    public void clickDozivljenje() throws Exception {
       // Click(SpektarDozivljenje, "Dozivljenje clicked");
    }
    public void DoživljenjeLabel() throws Exception {}
    public void DoživljenjeValue(String doz) throws Exception {}
    public void Smrt(String smrt) throws Exception {}
    public void SmrtLabel() throws Exception {}
    public void clickTezeBolesti(String proizvod, String indeksacija) throws Exception {
        switch (proizvod) {
            case "Doživotni riziko": {
            }
            break;
            case "Joker": {
                if(indeksacija.equals("true")){
                Click(JokerIndexTezeBolestiLabelI, "TezeBolesti clicked");
                }
                if(!indeksacija.equals("true")){
                Click(JokerBezIndexTezeBolestiLabel, "TezeBolesti clicked");
            }}
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
        }
    }
    public void TezeBolestiLabel() throws Exception {}
    public void inputTezeBolestiValue(String proizvod, String indeksacija, String tb) throws Exception {
        switch (proizvod) {
            case "Doživotni riziko": {
            }
            break;
            case "Joker": {
                if(indeksacija.equals("true")){
                    SetValue(JokerIndexTezeBolestiValueI, "TezeBolesti clicked",tb);
                }
                if(!indeksacija.equals("true")){
                SetValue(JokerBezIndexTezeBolestiValue, "TezeBolesti clicked",tb);
            }}
            break;
            case "Spektar": {
                SetValue(SpektarTezeBolestiValue, "TezeBolesti clicked",tb);
            }
            break;
            case "Riziko Mix": {
               // SetValue(, "TezeBolesti clicked",tb);
            }
            break;
            case "Riziko": {
                SetValue(RizikoTezeBolestiValue, "TezeBolesti clicked",tb);
            }
            break;
        }
    }

    public void clickSmrtUsledNezgode(String proizvod, String indeksacija) throws Exception {
        switch (proizvod) {
            case "Doživotni riziko": {
                Click(DozivotniRizikoSmrtUsledNezgodeLabel, "SmrtUsledNezgode clicked");
            }
            break;
            case "Joker": {
                if(indeksacija.equals("true")){
                Click(JokerIndexSmrtUsledNezgodeLabelI, "TezeBolesti clicked");
                }
                if(!indeksacija.equals("true")){
                Click(JokerBezIndexSmrtUsledNezgodeLabel, "TezeBolesti clicked");
            }}
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
    public void inputSmrtUsledNezgodeValue(String proizvod, String indeksacija, String sn) throws Exception {
        switch (proizvod) {
            case "Doživotni riziko": {
                SetValue(DozivotniRizikoSmrtUsledNezgodeValue, "SmrtUsledNezgode clicked",sn);
            }
            break;
            case "Joker": {
                if(indeksacija.equals("true")){
                    SetValue(JokerIndexSmrtUsledNezgodeValueI, "TezeBolesti clicked",sn);
                }
                if(!indeksacija.equals("true")){
                SetValue(JokerBezIndexSmrtUsledNezgodeValue, "TezeBolesti clicked",sn);
            }}
            break;
            case "Spektar": {
                SetValue(SpektarSmrtUsledNezgodeValue, "TezeBolesti clicked",sn);
            }
            break;
            case "Riziko Mix": {
                SetValue(RMSmrtUsledNezgodeValue, "TezeBolesti clicked",sn);
            }

            break;
            case "Riziko": {
                SetValue(RizikoSmrtUsledNezgodeValue, "TezeBolesti clicked",sn);
            }
            break;
        }
    }

    public void clickTrajniInvaliditet(String proizvod, String indeksacija) throws Exception {
        switch (proizvod) {
            case "Doživotni riziko": {
                Click(DozivotniRizikoTrajniInvaliditetLabel, "TrajniInvaliditet clicked");
            }
            break;
            case "Favorit": {
                if(indeksacija.equals("true")){
                    Click(FavoritIndexTrajniInvaliditetLabelI, "TrajniInvaliditet clicked");
                }
                Click(FavoritBezIndexTrajniInvaliditetLabel, "TrajniInvaliditet clicked");
            }
            break;
            case "Joker": {
                if(indeksacija.equals("true")) {
                    Click(JokerIndexTrajniInvaliditetLabelI, "TrajniInvaliditet clicked");
                }
                if(!indeksacija.equals("true")){
                Click(JokerBezIndexTrajniInvaliditetLabel, "TrajniInvaliditet clicked");
            }}
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
    public void inputTrajniInvaliditetValue(String proizvod, String indeksacija, String tin) throws Exception {
        switch (proizvod) {
            case "Doživotni riziko": {
                SetValue(DozivotniRizikoTrajniInvaliditetValue, "TrajniInvaliditet clicked",tin);
            }
            break;
            case "Favorit": {
                if(indeksacija.equals("true")){
                    SetValue(FavoritIndexTrajniInvaliditetValueI, "TrajniInvaliditet clicked",tin);
                }
                if(!indeksacija.equals("true")){
                SetValue(FavoritBezIndexTrajniInvaliditetValue, "TrajniInvaliditet clicked",tin);
            }}
            break;
            case "Joker": {
                if(indeksacija.equals("true")) {
                    SetValue(JokerIndexTrajniInvaliditetValueI, "TrajniInvaliditet clicked",tin);
                }
                if(!indeksacija.equals("true")){
                SetValue(JokerBezIndexTrajniInvaliditetValue, "TrajniInvaliditet clicked",tin);
            }}
            break;
            case "Spektar": {
                SetValue(SpektarTrajniInvaliditetValue, "TrajniInvaliditet clicked",tin);
            }
            break;
            case "Riziko Mix": {
                SetValue(RMTrajniInvaliditetValue, "TrajniInvaliditet clicked",tin);
            }
            break;
            case "Riziko": {
                SetValue(RizikoTrajniInvaliditetValue, "TrajniInvaliditet clicked",tin);
            }
            break;
        }
    }

    public void clickLomKostiju(String proizvod, String indeksacija) throws Exception {
        switch (proizvod) {
            case "Doživotni riziko": {
                Click(DozivotniRizikoLomKostijuLabel,"LomKostiju clicked");
            }
            break;
            case "Favorit": {
                if(indeksacija.equals("true")) {
                    Click(FavoritIndexLomKostijuLabelI, "LomKostiju clicked");
                }
                if(!indeksacija.equals("true")){
                Click(FavoritBezIndexLomKostijuLabel, "LomKostiju clicked");
            }}
            break;
            case "Joker": {
                if(indeksacija.equals("true")) {
                    Click(JokerIndexLomKostijuLabelI, "LomKostiju clicked");
                }
                if(!indeksacija.equals("true")){
                Click(JokerBezIndexLomKostijuLabel, "LomKostiju clicked");

            }}
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
    public void inputLomKostijuValue(String proizvod, String indeksacija, String lk) throws Exception {
        switch (proizvod) {
            case "Doživotni riziko": {
                SetValue(DozivotniRizikoLomKostijuValue,"LomKostiju clicked",lk);
            }
            break;
            case "Favorit": {
                if(indeksacija.equals("true")) {
                    SetValue(FavoritIndexLomKostijuValueI, "LomKostiju clicked",lk);
                }
                if(!indeksacija.equals("true")){
                SetValue(FavoritBezIndexLomKostijuValue, "LomKostiju clicked",lk);
            }}
            break;
            case "Joker": {
                if(indeksacija.equals("true")) {
                    SetValue(JokerIndexLomKostijuValueI, "LomKostiju clicked",lk);
                }
                if(!indeksacija.equals("true")){
                SetValue(JokerBezIndexLomKostijuValue, "LomKostiju clicked",lk);

            }}
            break;
            case "Spektar": {
                SetValue(SpektarLomKostijuValue, "LomKostiju clicked",lk);
            }
            break;
            case "Riziko Mix": {
                SetValue(RMLomKostijuValue, "LomKostiju clicked",lk);
            }

            break;
            case "Riziko": {
                SetValue(RizikoLomKostijuValue, "LomKostiju clicked",lk);
            }
            break;
        }
    }

    public void clickDnevnaNaknadaNezgoda(String proizvod, String indeksacija) throws Exception {
        switch (proizvod) {
            case "Doživotni riziko": {
                Click(DozivotniRizikoDnevnaNaknadaNezgodaLabel, "DnevnaNaknadaNezgoda clicked");
            }
            break;
            case "Favorit": {
                if(indeksacija.equals("true")) {
                    Click(FavoritIndexDnevnaNaknadaNezgodaLabelI, "DnevnaNaknadaNezgoda clicked");
                }
                if(!indeksacija.equals("true")){
                Click(FavoritBezIndexDnevnaNaknadaNezgodaLabel, "DnevnaNaknadaNezgoda clicked");
            }}
            break;
            case "Joker": {
                if(indeksacija.equals("true")) {
                    Click(JokerIndexDnevnaNaknadaNezgodaLabelI, "DnevnaNaknadaNezgoda clicked");
                }
                if(!indeksacija.equals("true")){
                Click(JokerBezIndexDnevnaNaknadaNezgodaLabel, "DnevnaNaknadaNezgoda clicked");
            }}
            break;
            case "Spektar": {
                Click(SpektarDnevnaNaknadaNezgodaLabel, "DnevnaNaknadaNezgoda clicked");
            }
            break;
            case "Riziko Mix": {
                Click(RMDnevnaNaknadaNezgodaLabel, "DnevnaNaknadaNezgoda clicked");
            }

            break;
            case "Riziko": {
                Click(RizikoDnevnaNaknadaNezgodaLabel, "DnevnaNaknadaNezgoda clicked");
            }
            break;
            default:
                break;
        }
    }
    public void DnevnaNaknadaNezgodaLabel() throws Exception {}
    public void inputDnevnaNaknadaNezgodaValue(String proizvod, String indeksacija, String dnn) throws Exception {
        switch (proizvod) {
            case "Doživotni riziko": {
                SetValue(DozivotniRizikoDnevnaNaknadaNezgodaValue, "DnevnaNaknadaNezgoda clicked",dnn);
            }
            break;
            case "Favorit": {
                if(indeksacija.equals("true")) {
                    SetValue(FavoritIndexDnevnaNaknadaNezgodaValueI, "DnevnaNaknadaNezgoda clicked",dnn);
                }
                if(!indeksacija.equals("true")){
                SetValue(FavoritBezIndexDnevnaNaknadaNezgodaValue, "DnevnaNaknadaNezgoda clicked",dnn);
            }}
            break;
            case "Joker": {
                if(indeksacija.equals("true")) {
                    SetValue(JokerIndexDnevnaNaknadaNezgodaValueI, "DnevnaNaknadaNezgoda clicked",dnn);
                }
                if(!indeksacija.equals("true")){
                SetValue(JokerBezIndexDnevnaNaknadaNezgodaValue, "DnevnaNaknadaNezgoda clicked",dnn);
            }}
            break;
            case "Spektar": {
                SetValue(SpektarDnevnaNaknadaNezgodaValue, "DnevnaNaknadaNezgoda clicked",dnn);
            }
            break;
            case "Riziko Mix": {
                SetValue(RMDnevnaNaknadaNezgodaValue, "DnevnaNaknadaNezgoda clicked",dnn);
            }

            break;
            case "Riziko": {
                SetValue(RizikoDnevnaNaknadaNezgodaValue, "DnevnaNaknadaNezgoda clicked",dnn);
            }
            break;
        }
    }

    public void clickDnevnaNaknadaBolesti(String proizvod, String indeksacija) throws Exception {
        switch (proizvod) {
            case "Doživotni riziko": {
            }
            break;
            case "Joker": {
                if(indeksacija.equals("true")) {
                    Click(JokerIndexDnevnaNaknadaBolestiLabelI, "DnevnaNaknadaBolesti clicked");
                }
                if(!indeksacija.equals("true")){
                Click(JokerBezIndexDnevnaNaknadaBolestiLabel, "DnevnaNaknadaBolesti clicked");
            }}
            break;
            case "Spektar": {
                Click(SpektarDnevnaNaknadaBolestiLabel, "DnevnaNaknadaBolesti clicked");
            }
            break;
            case "Riziko Mix": {
                Click(RMDnevnaNaknadaBolestiLabel, "DnevnaNaknadaBolesti clicked");
            }
            break;
            case "Riziko": {
                Click(RizikoDnevnaNaknadaBolestiLabel, "DnevnaNaknadaBolesti clicked");
            }
            break;
            default:
                break;
        }
    }
    public void DnevnaNaknadaBolestiLabel() throws Exception {}
    public void inputDnevnaNaknadaBolestiValue(String proizvod, String indeksacija ,String dnb) throws Exception {
        switch (proizvod) {
            case "Doživotni riziko": {
            }
            break;
            case "Joker": {
                if(indeksacija.equals("true")) {
                    SetValue(JokerIndexDnevnaNaknadaBolestiValueI, "DnevnaNaknadaBolesti clicked", dnb);
                }
                if(!indeksacija.equals("true")){
                SetValue(JokerBezIndexDnevnaNaknadaBolestiValue, "DnevnaNaknadaBolesti clicked", dnb);
            }}
            break;
            case "Spektar": {
                SetValue(SpektarDnevnaNaknadaBolestiValue, "DnevnaNaknadaBolesti clicked", dnb);
            }
            break;
            case "Riziko Mix": {
                SetValue(RMDnevnaNaknadaBolestiValue, "DnevnaNaknadaBolesti clicked", dnb);
            }
            break;
            case "Riziko": {
                SetValue(RizikoDnevnaNaknadaBolestiValue, "DnevnaNaknadaBolesti clicked", dnb);
            }
            break;
        }
    }

    public void clickHirurskeIntervencijeNezgode(String proizvod, String indeksacija) throws Exception {
        switch (proizvod) {
            case "Doživotni riziko": {
                Click(DozivotniRizikoHirurskeIntervencijeNezgodeLabel, "HirurskeIntervencijeNezgode clicked");
            }
            break;
            case "Favorit": {
                if(indeksacija.equals("true")) {
                    Click(FavoritIndexHirurskeIntervencijeNezgodeLabelI, "HirurskeIntervencijeNezgode clicked");
                }
                if(!indeksacija.equals("true")){
                Click(FavoritBezIndexHirurskeIntervencijeNezgodeLabel, "HirurskeIntervencijeNezgode clicked");
            }}
            break;
            case "Joker": {
                if(indeksacija.equals("true")) {
                    Click(JokerIndexHirurskeIntervencijeNezgodeLabelI, "HirurskeIntervencijeNezgode clicked");
                }
                if(!indeksacija.equals("true")){
                Click(JokerBezIndexHirurskeIntervencijeNezgodeLabel, "HirurskeIntervencijeNezgode clicked");
            }}
            break;
            case "Spektar": {
                Click(SpektarHirurskeIntervencijeNezgodeLabel, "HirurskeIntervencijeNezgode clicked");
            }
            break;
            case "Riziko Mix": {
                Click(RMHirurskeIntervencijeNezgodeLabel, "HirurskeIntervencijeNezgode clicked");
            }

            break;
            case "Riziko": {
                Click(RizikoHirurskeIntervencijeNezgodeLabel, "HirurskeIntervencijeNezgode clicked");
            }
            break;
            default:
                break;
        }
    }
    public void HirurskeIntervencijeNezgodeLabel() throws Exception {}
    public void inputHirurskeIntervencijeNezgodeValue(String proizvod, String indeksacija, String hin) throws Exception {
        switch (proizvod) {
            case "Doživotni riziko": {
                SetValue(DozivotniRizikoHirurskeIntervencijeNezgodeValue, "HirurskeIntervencijeNezgode clicked",hin);
            }
            break;
            case "Favorit": {
                if(indeksacija.equals("true")) {
                    SetValue(FavoritIndexHirurskeIntervencijeNezgodeValueI, "HirurskeIntervencijeNezgode clicked",hin);
                }
                if(!indeksacija.equals("true")){
                SetValue(FavoritBezIndexHirurskeIntervencijeNezgodeValue, "HirurskeIntervencijeNezgode clicked",hin);
            }}
            break;
            case "Joker": {
                if(indeksacija.equals("true")) {
                    SetValue(JokerIndexHirurskeIntervencijeNezgodeValueI, "HirurskeIntervencijeNezgode clicked",hin);
                }
                if(!indeksacija.equals("true")){
                SetValue(JokerBezIndexHirurskeIntervencijeNezgodeValue, "HirurskeIntervencijeNezgode clicked",hin);
            }}
            break;
            case "Spektar": {
                SetValue(SpektarHirurskeIntervencijeNezgodeValue, "HirurskeIntervencijeNezgode clicked",hin);
            }
            break;
            case "Riziko Mix": {
                SetValue(RMHirurskeIntervencijeNezgodeValue, "HirurskeIntervencijeNezgode clicked",hin);
            }

            break;
            case "Riziko": {
                SetValue(RizikoHirurskeIntervencijeNezgodeValue, "HirurskeIntervencijeNezgode clicked",hin);
            }
            break;
        }
    }

    public void clickHirurskeIntervencijeBolesti(String proizvod, String indeksacija) throws Exception {
        switch (proizvod) {
            case "Doživotni riziko": {
            }
            break;
            case "Joker": {
                if(indeksacija.equals("true")) {
                    Click(JokerIndexHirurskeIntervencijeBolestiLabelI, "HirurskeIntervencijeBolesti clicked");
                }
                if(!indeksacija.equals("true")){
                Click(JokerBezIndexHirurskeIntervencijeBolestiLabel, "HirurskeIntervencijeBolesti clicked");
            }}
            break;
            case "Spektar": {
                Click(SpektarHirurskeIntervencijeBolestiLabel, "HirurskeIntervencijeBolesti clicked");
            }
            break;
            case "Riziko Mix": {
                Click(RMHirurskeIntervencijeBolestiLabel, "HirurskeIntervencijeBolesti clicked");
            }
            break;
            case "Riziko": {
                Click(RizikoHirurskeIntervencijeBolestiLabel, "HirurskeIntervencijeBolesti clicked");
            }
            break;
            default:
                break;
        }
    }
    public void HirurskeIntervencijeBolestiLabel() throws Exception {}
    public void inputHirurskeIntervencijeBolestiValue(String proizvod, String indeksacija, String hib) throws Exception {
        switch (proizvod) {
            case "Doživotni riziko": {
            }
            break;
            case "Joker": {
                if(indeksacija.equals("true")) {
                    SetValue(JokerIndexHirurskeIntervencijeBolestiValueI, "HirurskeIntervencijeBolesti clicked",hib);
                }
                if(!indeksacija.equals("true")){
                SetValue(JokerBezIndexHirurskeIntervencijeBolestiValue, "HirurskeIntervencijeBolesti clicked",hib);
            }}
            break;
            case "Spektar": {
                SetValue(SpektarHirurskeIntervencijeBolestiValue, "HirurskeIntervencijeBolesti clicked",hib);
            }
            break;
            case "Riziko Mix": {
                SetValue(RMHirurskeIntervencijeBolestiValue, "HirurskeIntervencijeBolesti clicked",hib);
            }
            break;
            case "Riziko": {
                SetValue(RizikoHirurskeIntervencijeBolestiValue, "HirurskeIntervencijeBolesti clicked",hib);
            }
            break;

        }
    }

    public void clickBolovanje42(String proizvod, String indeksacija) throws Exception {
        switch (proizvod) {
            case "Doživotni riziko": {
            }
            break;

            case "Joker": {
                if(indeksacija.equals("true")) {
                    Click(JokerIndexBolovanje42LabelI, "Bolovanje42dana clicked");
                }
                if(!indeksacija.equals("true")){
                Click(JokerBezIndexBolovanje42Label, "Bolovanje42dana clicked");
            }}
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
    public void inputBolovanje42Value(String proizvod, String indeksacija, String bol) throws Exception {
        switch (proizvod) {
            case "Doživotni riziko": {
            }
            break;

            case "Joker": {
                if(indeksacija.equals("true")) {
                    SetValue(JokerIndexBolovanje42ValueI, "Bolovanje42dana clicked", bol);
                }
                if(!indeksacija.equals("true")){
                SetValue(JokerBezIndexBolovanje42Value, "Bolovanje42dana clicked", bol);
            }}
            break;
            case "Spektar": {
                SetValue(SpektarBolovanje42Value, "Bolovanje42dana clicked", bol);
            }
            break;
            case "Riziko Mix": {
                SetValue(RMBolovanje42Value, "TezeBolesti clicked", bol);
            }
            break;
            case "Riziko": {
                SetValue(RizikoBolovanje42Value, "Bolovanje42dana clicked", bol);
            }
            break;
        }
    }
    //-------------------- End Methods --------------------
}

