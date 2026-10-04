Feature: Login

  #1
  @SwagLabs
  Scenario Outline: 90101_v1.0 - SwagLabs- Verify Login

   When Launch the SwagLabs "<DeviceDetails>"
    Given Enter Your "<UserName>" UserName
    And Enter Your "<Password>" PassWord
    Then Click On Login Button
    And Verify Home Page is displayed

    Examples:
      | DeviceDetails    ||UserName||Password|
      | Punkt MC03_15 ||standard_user||secret_sauce|

      #2
  @SwagLabs
  Scenario Outline: 90102_v1.0 - SwagLabs- Verify LogOut

    When Launch the SwagLabs "<DeviceDetails>"
    Given Enter Your "<UserName>" UserName
    And Enter Your "<Password>" PassWord
    Then Click On Login Button
    And Verify Home Page is displayed
    Then Click On Menu
    And Click on Logout
    Then Verify the Logout

    Examples:
      | DeviceDetails    ||UserName||Password|
      | Punkt MC03_15 ||standard_user||secret_sauce|

  #3
  @SwagLabs
  Scenario Outline: 90103_v1.0 - SwagLabs- Verify UnSuccessful Login

    When Launch the SwagLabs "<DeviceDetails>"
    Given Enter Your "<InvalidUserName>" UserName
    And Enter Your "<InvalidPassword>" PassWord
    Then Click On Login Button
    Then Verify Unsuccessful Login

    Examples:
      | DeviceDetails    ||InvalidUserName||InvalidPassword|
      | Punkt MC03_15 ||standard_use||secret_sauc|


  #4
  @SwagLabs
  Scenario Outline: 90104_v1.0 - SwagLabs- Verify Menu

    When Launch the SwagLabs "<DeviceDetails>"
    Given Enter Your "<UserName>" UserName
    And Enter Your "<Password>" PassWord
    Then Click On Login Button
    And Verify Home Page is displayed
    When Click On Menu
    Then Verify Menu

    Examples:
      | DeviceDetails    ||UserName||Password|
      | Punkt MC03_15 ||standard_user||secret_sauce|

  #5
  @SwagLabs
  Scenario Outline: 90105_v1.0 - SwagLabs- Verify Add to Cart Functionality and Cart Count Validation

    When Launch the SwagLabs "<DeviceDetails>"
    Given Enter Your "<UserName>" UserName
    And Enter Your "<Password>" PassWord
    Then Click On Login Button
    And Verify Home Page is displayed
    When Add "Sauce Labs Backpack" to cart
    Then Verify cart count is "1"
    When Add "Sauce Labs Bike Light" to cart
    Then Verify cart count is "2"

    Examples:
      | DeviceDetails    ||UserName||Password|
      | Punkt MC03_15 ||standard_user||secret_sauce|

#6
  @SwagLabs
  Scenario Outline: 90106_v1.0 - SwagLabs- Verify Login Failure

    When Launch the SwagLabs "<DeviceDetails>"
    Given Enter Your "<UserName>" UserName
    And Enter Your "<Password>" PassWord
    Then Click On Login Button
    And Verify Home Page is displayed

    Examples:
      | DeviceDetails    ||UserName||Password|
      | Punkt MC03_15 ||standard_user||secret_sauc|