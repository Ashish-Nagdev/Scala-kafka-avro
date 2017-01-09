package com.sherpa.kafkaApp

import com.sherpa.producer.KafkaProducer
import com.sherpa.domain.User

/**
  * Created by Ashish Nagdev
  */
object ProducerApp extends App {

  private val topic = "demo-topic"

  val producer = new KafkaProducer()

  val user1 = User(1, "Ashish Nagdev", None)
  val user2 = User(2, "Ashish Nagdev", Some("ashish@sherpa.com"))

  producer.send(topic, List(user1, user2))

}