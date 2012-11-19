package Steps

import com.example.HelloWorldController

this.metaClass.mixin (cucumber.runtime.groovy.EN)

def result

When(~'^I access the HelloWorld controller$') { ->
    def helloWorldController = new HelloWorldController()

    helloWorldController.index()

    response = helloWorldController.response.text
}

Then(~'^its response should contain "([^"]*)"$') { String arg1 ->
    assert arg1 == response
}