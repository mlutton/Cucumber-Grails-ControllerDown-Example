package com.example



import grails.test.mixin.*
import org.junit.*

@TestFor(HelloWorldController)
class HelloWorldControllerTests {

    @Test void indexActionMethodShouldReturnHelloWorld()
    {
        def controller = new HelloWorldController()

        controller.index()

        assert "Hello World" == response.text
    }
}
