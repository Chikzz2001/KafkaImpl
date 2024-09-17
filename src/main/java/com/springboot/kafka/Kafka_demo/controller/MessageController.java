package com.springboot.kafka.Kafka_demo.controller;

// import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
// import org.springframework.web.bind.annotation.RestController;
import com.springboot.kafka.Kafka_demo.kafka.KafkaProducer;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MessageController {

    private KafkaProducer kafkaProducer;

    public MessageController(KafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    @RequestMapping(value = "/getData", method = RequestMethod.GET)
    public String home() {
        return "getdata";
    }

    // @GetMapping("/publish")
    // public ResponseEntity<String> publish(@RequestParam("message") String
    // message) {
    // kafkaProducer.sendMessage(message);
    // return ResponseEntity.ok("Message sent to the topic..");
    // }

    @RequestMapping(value = "/sendData", method = RequestMethod.POST)
    public String sendMessageToKafka(@RequestParam("message") String message) {
        kafkaProducer.sendMessage(message);
        return "success";
    }

}
