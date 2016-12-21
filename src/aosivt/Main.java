package aosivt;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;

public class Main {

    public static void main(String[] args) throws Exception {

        SoapObject req = new SoapObject("http://spring.io/guides/gs-producing-web-service", "getListBankRequest");
//


        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        envelope.dotNet = false;
//        envelope.dotNet = true;
        envelope.setOutputSoapObject(req);

//        HttpTransportSE trans = new HttpTransportSE("http://localhost:8080/ws", 60000);
//         transport = new HttpTransport("http://localhost:8080/getlist?wsdl");
        String URL = "http://localhost:8080/ws/BankGetList.wsdl";
        HttpTransportSE trans = new HttpTransportSE(URL, 60000);
        try {
            trans.call("http://localhost:8080/getListBankRequest", envelope);
            SoapObject response = (SoapObject) envelope.getResponse();
        }catch (Exception e)
        {
            e.getLocalizedMessage();
        }

    }
}
