Feature: Verify Summer Collections

  Scenario: Verify Summer Collection feature is available as expected
    Given I am on the Summer Collection page "https://demo.themefreesia.com/shoppingcart-plus/product/summer-collection/"
    Then I should see the title "Summer Collection - Shopping Cart Plus"

  Scenario: Verify all the products are available as expected
    Given I am on the Summer Collection page "https://demo.themefreesia.com/shoppingcart-plus/product/summer-collection/"
    And verify all the below products are available as expected
      | Products Title        |
      | Latex Rubber Lingerie |
      | Golden party Purse    |
      | Stone Bracelet        |
      | High Rise Shorts      |
