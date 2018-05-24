# GTest

*Precondition:* **JDK, GDK, Chrome/Chromium**

*Groovy baced testing for:*
1. **e2e testing** - [spock](http://spockframework.org/) + [geb](http://www.gebish.org/)

  ``
	gradle -Dtest.single=E2eTest -Dgeb.env=chrome -Dwebdriver.chrome.driver=chromedriver clean test
  ``
	
2. **api testing** - [spock](http://spockframework.org/) + [http-builder](https://github.com/jgritman/httpbuilder)

  ``
		gradle -Dtest.single=ApiTest clean test
    ``
		
3. **unit testing** - [spock](http://spockframework.org/)

    ``
		gradle -Dtest.single=CalculatorTest clean test
    ``
		
4. **deploy** - [spock](http://spockframework.org/) + [geb](http://www.gebish.org/) + [testcontainers](https://www.testcontainers.org/)
  
  ``
	gradle -Dtest.single=DeployTest clean test
  ``
  
  
	Deploying our app to the docker container, starting it, runing our tests and shutdown the container.
	
	Video of test execution into container will be saved into build folder.


