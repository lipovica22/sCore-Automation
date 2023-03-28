package cSore_Mapping.Common.Tab;

import cSore_Mapping.Common.Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Calculation extends BasePage {


    public Calculation(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }




}

