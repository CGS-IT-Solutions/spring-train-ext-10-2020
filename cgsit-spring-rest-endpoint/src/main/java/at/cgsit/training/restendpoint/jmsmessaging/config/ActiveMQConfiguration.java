package at.cgsit.training.restendpoint.jmsmessaging.config;

import org.apache.activemq.ActiveMQSslConnectionFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// @ Configuration
public class ActiveMQConfiguration {

  // @Bean
  public ActiveMQSslConnectionFactory activeMQSslConnectionFactory(
      @Value("${activemq.broker-url}") String brokerUrl
      //@Value("${spring.activemq.ssl.trustStorePath}") String trustStorePath,
      //@Value("${spring.activemq.ssl.trustStorePass}") String trustStorePass,
      //@Value("${spring.activemq.ssl.keyStorePath}") String keyStorePath,
      //@Value("${spring.activemq.ssl.keyStorePass}") String keyStorePass
      ) throws Exception {

    ActiveMQSslConnectionFactory factory = new ActiveMQSslConnectionFactory(brokerUrl);

    // factory.setUserName("cgsDemoBrokerUser");
    // factory.setPassword("cgsDemoBroker1224");

    //factory.setTrustStore(trustStorePath);
    //factory.setTrustStorePassword(trustStorePass);
    //factory.setKeyStore(keyStorePath);
    //factory.setKeyStorePassword(keyStorePass);

    return factory;
  }
}

