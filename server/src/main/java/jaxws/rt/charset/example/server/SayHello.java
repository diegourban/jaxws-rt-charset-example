package jaxws.rt.charset.example.server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "sayHello", namespace = "http://server.example.charset.rt.jaxws/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sayHello", namespace = "http://server.example.charset.rt.jaxws/")
public class SayHello {

    @XmlElement(name = "name", namespace = "")
    private String name;

    /**
     * 
     * @return
     *         returns String
     */
    public String getName() {
        return this.name;
    }

    /**
     * 
     * @param name
     *            the value for the name property
     */
    public void setName(String name) {
        this.name = name;
    }

}
