Feature: Test scenario for Git

Scenario: Add item into cart

Given User is on "ProductPage"

When User add product to cart

Then User close slidesheet

And Cart info is equal "1"