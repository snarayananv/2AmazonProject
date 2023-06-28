Feature: Automate the Amazon Application

  Scenario: Verfying the Amazon Application
    Given User on the Amazon page
    When User should enter the product with EnterKey
    And User select a product and Add that to cart
    Then User should verify Add to cart success message
    And User should place the order &login with valid phonenumber and password
    And User should click the user address
    And User should click the amazon.in button and again click Return to cart
    And User should click the delete button
    Then User should verify the success message when the product removed from cart
