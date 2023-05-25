package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

    public class Saucedemopage {
        public Saucedemopage() {PageFactory.initElements(Driver.getDriver(),this);}

        @FindBy(id ="password")
        public WebElement sifre;

        @FindBy(id="login-button")
        public WebElement loginbutton;

        @FindBy(className = "product_sort_container")
        public WebElement dropdown;


    }