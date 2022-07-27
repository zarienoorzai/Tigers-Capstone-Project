@retailtest
Feature: Retail Page Feature

  Background: 
    Given user is on Retail home Page
    When user click on MyAccount
    And user click on Login option
    And user enter userName "zarienoorrrrrr@gmail.com"  and password "12345678"
    And user click on login button
    Then user should be logged into myAccount Page

  Scenario: Register as an Affiliate user with Cheque Payment Method
    When User click on Register for an Affiliate Account link
    And User fill affiliate form with below information
      | company  | website      | taxID   | paymentMethod | payeeName |
      | USA tek | zarie.com | 1234231 | Cheque        | USA tek  |
    And User check on About us check box
    And User click on Continue button
    Then User should see a success message
@edittest
  Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer
    When User click on Edit your affiliate informationlink
    And user click on Bank Transfer radio button
    And User fill Bank information with below information
      | bankName | abaNumber | swiftCode | accountName | accountNumber |
      | testT     |   12342134 |  42746132 | saving      |    223112452 |
    And User click on Continue button
    Then User should see a success message
@editaccount
  Scenario: Edit your account Information
    When User click on Edit your account information link
    And User modify below information
      | firstname | lastName | email                   | telephone  |
      | zarie     | noorzai      | zarienoorzai56332@gmail.com | 312412421 |
    And User click on Continue button
    Then User should see a message 'Success: Your account has been successfully updated.'
