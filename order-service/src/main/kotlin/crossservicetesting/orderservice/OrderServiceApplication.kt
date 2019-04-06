package crossservicetesting.orderservice

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.stream.annotation.StreamListener
import org.springframework.cloud.stream.messaging.Processor
import org.springframework.cloud.stream.messaging.Source
import org.springframework.context.MessageSource
import org.springframework.context.annotation.Bean
import org.springframework.integration.support.MessageBuilder
import org.springframework.messaging.handler.annotation.SendTo
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.ResponseBody

@SpringBootApplication
class OrderServiceApplication {

	@Autowired
	val source: Source? = null

	@PostMapping("/order")
	@SendTo(Source.OUTPUT)
	@ResponseBody
	fun postOrder(): String {
		return "order 1"
		//source.output().send(MessageBuilder.withPayload("order 1").build())
	}
}


fun main(args: Array<String>) {
	runApplication<OrderServiceApplication>(*args)
}
