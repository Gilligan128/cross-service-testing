package crossservicetesting.fulfillmentservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FulfillmentServiceApplication

fun main(args: Array<String>) {
	runApplication<FulfillmentServiceApplication>(*args)
}
