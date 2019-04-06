package integrationtests

import crossservicetesting.fulfillmentservice.FulfillmentServiceApplication
import crossservicetesting.orderservice.OrderServiceApplication
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
class AcrossServicesTests {

	@Test
	fun contextLoads() {
		//Disable JMX or provide unique spring.application.name
		val disableJMX = "spring.jmx.enabled:false"
		val orderAppContext = SpringApplicationBuilder(OrderServiceApplication::class.java)
				.properties("server.port=8090", disableJMX).run()
		val fulfillmentAppContext = SpringApplicationBuilder(FulfillmentServiceApplication::class.java)
				.properties("server.port=8091", disableJMX).run()

	}

}
