package Pages;

import org.openqa.selenium.By;

public class SwagLabs {

    public static By userName = By.xpath("//android.widget.EditText[@content-desc=\"test-Username\"]");

    public static By passWord = By.xpath("//android.widget.EditText[@content-desc=\"test-Password\"]");

    public static By loginButton = By.xpath("//android.view.ViewGroup[@content-desc=\"test-LOGIN\"]");
    public static By homeScreen = By.xpath("//android.view.ViewGroup[@content-desc=\"test-Menu\"]/android.view.ViewGroup/android.widget.ImageView");

    public static By menuButton = By.xpath("//android.view.ViewGroup[@content-desc=\"test-Menu\"]/android.view.ViewGroup/android.widget.ImageView");
    public static By logOutButton = By.xpath("//android.view.ViewGroup[@content-desc=\"test-LOGOUT\"]");


    public static By loginErrorMessage = By.xpath("//android.widget.TextView[@text=\"Username and password do not match any user in this service.\"]");

    public static By cartIcon =
            By.xpath("//android.view.ViewGroup[@content-desc='test-Cart']");

    public static By cartBadge =
            By.xpath("//android.view.ViewGroup[@content-desc='test-Cart']//android.widget.TextView");



}