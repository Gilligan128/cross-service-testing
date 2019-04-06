package crossservicetesting.orderservice

import org.springframework.cloud.stream.messaging.Source
import org.springframework.integration.support.MessageBuilder
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class OrderEndpoint(val source: Source) {

    @PostMapping("/order")
    @ResponseBody
    fun postOrder(): String {
        source.output().send(MessageBuilder.withPayload("order 1").build())
        return "order 1"
    }
}