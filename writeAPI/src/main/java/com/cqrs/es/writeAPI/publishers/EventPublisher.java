package com.cqrs.es.writeAPI.publishers;

/**
 * <p>Interface for Kafka to publish events.
 * Probably via {@link org.apache.kafka.clients.producer.KafkaProducer}</p>
 */
public interface EventPublisher {
    void publish();
}
