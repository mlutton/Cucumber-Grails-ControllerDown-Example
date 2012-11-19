Feature: Render Hello World Using Only Controller
    As a programmer
    I want to be able to verify hard-coded contents rendered from a controller
    So that I can demonstrate how to test this functionality in Grails

Scenario: Verify rendered output is available
    When I access the HelloWorld controller
    Then its response should contain "Hello World"