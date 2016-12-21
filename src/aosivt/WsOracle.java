package aosivt;

import aosivt.Banks;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * Created by oshchepkovayu on 20.12.16.
 */

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface WsOracle {
    @WebMethod
    Banks[] getList();
}
