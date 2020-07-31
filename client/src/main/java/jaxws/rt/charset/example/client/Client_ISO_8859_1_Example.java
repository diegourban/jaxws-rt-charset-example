package jaxws.rt.charset.example.client;

import java.nio.charset.StandardCharsets;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import com.sun.xml.ws.developer.SerializationFeature;

import jaxws.rt.charset.example.client.generated.HelloWs;
import jaxws.rt.charset.example.client.generated.HelloWsService;

public class Client_ISO_8859_1_Example {

    public static void main(String[] args) {
        System.setProperty("com.sun.xml.ws.transport.http.client.HttpTransportPipe.dump", "true");

        final Logger rootLogger = LogManager.getLogManager().getLogger("");
        rootLogger.setLevel(Level.INFO);
        for (Handler h : rootLogger.getHandlers()) {
            h.setLevel(Level.INFO);
        }

        HelloWsService service = new HelloWsService();
        HelloWs helloWs = service.getPort(HelloWs.class, new SerializationFeature(StandardCharsets.ISO_8859_1.name()));

        String rest = helloWs.sayHello("Hello from " + Client_ISO_8859_1_Example.class.getName());
        System.out.println(rest);
    }

}
