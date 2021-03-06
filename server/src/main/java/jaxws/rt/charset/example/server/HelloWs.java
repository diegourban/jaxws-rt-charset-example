package jaxws.rt.charset.example.server;

import javax.jws.HandlerChain;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.DOCUMENT)
public class HelloWs {

    public String sayHello(@WebParam(name = "name") String name) {
        if (name == null) {
            return "Hello";
        }

        return "Hello, " + name + "!";
    }
}
