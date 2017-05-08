
package com.hleast.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.hleast.webservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SayHello_QNAME = new QName("http://webservice.hleast.com/", "sayHello");
    private final static QName _SayHelloResponse_QNAME = new QName("http://webservice.hleast.com/", "sayHelloResponse");
    private final static QName _GetStaffs_QNAME = new QName("http://webservice.hleast.com/", "getStaffs");
    private final static QName _GetStaffsResponse_QNAME = new QName("http://webservice.hleast.com/", "getStaffsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.hleast.webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SayHelloResponse }
     * 
     */
    public SayHelloResponse createSayHelloResponse() {
        return new SayHelloResponse();
    }

    /**
     * Create an instance of {@link SayHello }
     * 
     */
    public SayHello createSayHello() {
        return new SayHello();
    }

    /**
     * Create an instance of {@link GetStaffsResponse }
     * 
     */
    public GetStaffsResponse createGetStaffsResponse() {
        return new GetStaffsResponse();
    }

    /**
     * Create an instance of {@link GetStaffs }
     * 
     */
    public GetStaffs createGetStaffs() {
        return new GetStaffs();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.hleast.com/", name = "sayHello")
    public JAXBElement<SayHello> createSayHello(SayHello value) {
        return new JAXBElement<SayHello>(_SayHello_QNAME, SayHello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.hleast.com/", name = "sayHelloResponse")
    public JAXBElement<SayHelloResponse> createSayHelloResponse(SayHelloResponse value) {
        return new JAXBElement<SayHelloResponse>(_SayHelloResponse_QNAME, SayHelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStaffs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.hleast.com/", name = "getStaffs")
    public JAXBElement<GetStaffs> createGetStaffs(GetStaffs value) {
        return new JAXBElement<GetStaffs>(_GetStaffs_QNAME, GetStaffs.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStaffsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.hleast.com/", name = "getStaffsResponse")
    public JAXBElement<GetStaffsResponse> createGetStaffsResponse(GetStaffsResponse value) {
        return new JAXBElement<GetStaffsResponse>(_GetStaffsResponse_QNAME, GetStaffsResponse.class, null, value);
    }

}
