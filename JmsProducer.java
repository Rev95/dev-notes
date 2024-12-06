import jakarta.jms.*;
import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

public class JmsProducer {
    private static String url = ActiveMQConnection.DEFAULT_BROKER_URL;
//    private static String url = "tcp://localhost:61616";

    private static String queueName = "MESSAGE_QUEUE";

    public static void main(String[] args) throws JMSException {
        System.out.println(url);

        ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(url);
        Connection connection = connectionFactory.createConnection();
        connection.start();

        Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
        Destination destination = session.createQueue(queueName);

        MessageProducer messageProducer = session.createProducer(destination);
        TextMessage textMessage = session.createTextMessage("Hello, Message from Producer!");
        messageProducer.send(textMessage);

        System.out.println("Message '" + textMessage.getText() + ", Sent Successfully to the Queue");
        connection.close();
    }
}
