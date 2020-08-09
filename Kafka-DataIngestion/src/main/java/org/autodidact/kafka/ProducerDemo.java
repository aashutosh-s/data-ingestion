package org.autodidact.kafka;

import java.util.List;
import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.autodidact.domain.DomainEntity;
import org.autodidact.domain.WrapperEntity;
import org.json.simple.parser.ParseException;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ProducerDemo {

	public static void main(String[] args) throws ParseException, Exception {
				
		final String topicName = "gov-commodities-topic";
		int index = 0;
		
		Properties props = new Properties();
		
		props.put("bootstrap.servers", "0.0.0.0:6667");
		props.put("acks","all");
		props.put("retries", 0);
		props.put("batch.size", 16384);
		props.put("linger.ms", 1);
		props.put("buffer.memory", 33554432);
		props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
		props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
		
		Producer<String, String> producer = new KafkaProducer<String, String>(props);
		
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
		
		WrapperEntity wrapperEntity = objectMapper.readValue(new RestCallIndGov().callRestService(), WrapperEntity.class);
		
		List<DomainEntity>  listDomainEntity = wrapperEntity.getListDomainEnity();

		for(DomainEntity entity: listDomainEntity) {
			producer.send(new ProducerRecord<String, String>(topicName,Integer.toString(index++),entity.toString()));
		}
		
		producer.close();
	
	}

}
