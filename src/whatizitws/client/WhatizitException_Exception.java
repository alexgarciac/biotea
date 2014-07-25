
package whatizitws.client;

import javax.xml.ws.WebFault;


/**
 * This class was jaxb.generated by the JAXWS SI.
 * JAX-WS RI 2.0_01-b59-fcs
 * Generated source version: 2.0
 * 
 */
@WebFault(name = "WhatizitException", targetNamespace = "http://www.ebi.ac.uk/webservices/whatizit/ws")
public class WhatizitException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private WhatizitException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public WhatizitException_Exception(String message, WhatizitException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param message
     * @param cause
     */
    public WhatizitException_Exception(String message, WhatizitException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: whatizitws.client.WhatizitException
     */
    public WhatizitException getFaultInfo() {
        return faultInfo;
    }

}