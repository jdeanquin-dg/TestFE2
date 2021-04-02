package ar.com.daptech.kontos.util;

import FEV1.dif.afip.gov.ar.FEAuthRequest;
import FEV1.dif.afip.gov.ar.FERecuperaLastCbteResponse;
import FEV1.dif.afip.gov.ar.ServiceLocator;
import FEV1.dif.afip.gov.ar.ServiceSoap;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;

public class WebServiceAfipHelper
{
    public static void main(String []args){
       Long cuit=30707974466l;
        WebServiceAfipHelper o = new WebServiceAfipHelper();
        FEAuthRequest ticket = new FEAuthRequest();
        ticket.setCuit(cuit);
        String sign="CQ2w8q5w81PrRcrLgvvJmqqyR8DVOXoiWrx6ORoQnlkZ8JtKknwPg9dQXiZOPMDe9+alT7lB1B9rgIg8J0F1PsnhXZl/NKO+gV4dl6lRRzBZA4VM08Uo5uSTJSyTPi+GmWWBctunvR4viB5Cq1voqJr+BM4/oxKTDN/CKEj4Q1c=";

        String token ="PD94bWwgdmVyc2lvbj0iMS4wIiBlbmNvZGluZz0iVVRGLTgiIHN0YW5kYWxvbmU9InllcyI/Pgo8c3NvIHZlcnNpb249IjIuMCI+CiAgICA8aWQgc3JjPSJDTj13c2FhaG9tbywgTz1BRklQLCBDPUFSLCBTRVJJQUxOVU1CRVI9Q1VJVCAzMzY5MzQ1MDIzOSIgZHN0PSJDTj13c2ZlLCBPPUFGSVAsIEM9QVIiIHVuaXF1ZV9pZD0iMTc3MTY4NDE2IiBnZW5fdGltZT0iMTYxNzM3OTMyMiIgZXhwX3RpbWU9IjE2MTc0MjI1ODIiLz4KICAgIDxvcGVyYXRpb24gdHlwZT0ibG9naW4iIHZhbHVlPSJncmFudGVkIj4KICAgICAgICA8bG9naW4gZW50aXR5PSIzMzY5MzQ1MDIzOSIgc2VydmljZT0id3NmZSIgdWlkPSJTRVJJQUxOVU1CRVI9Q1VJVCAyMzI3MDU4NDE0NCwgQ049Y3lqZGVzYSIgYXV0aG1ldGhvZD0iY21zIiByZWdtZXRob2Q9IjIyIj4KICAgICAgICAgICAgPHJlbGF0aW9ucz4KICAgICAgICAgICAgICAgIDxyZWxhdGlvbiBrZXk9IjMwNzA3OTc0NDY2IiByZWx0eXBlPSI0Ii8+CiAgICAgICAgICAgIDwvcmVsYXRpb25zPgogICAgICAgIDwvbG9naW4+CiAgICA8L29wZXJhdGlvbj4KPC9zc28+Cg==";
        ticket.setSign(sign);
        ticket.setToken(token);
        System.out.println(o.getUltimoComprobanteEmitido(ticket,1,1));
    }
    public int getUltimoComprobanteEmitido(FEAuthRequest ticket,
                                           int puntoVenta, int tipoComprobante) {

        try {
            // once at he beginning of your program (before any use of default SSLContext)
// or instead can be done on the command line with -Dprop=value
            /*String trueStore="C:/Users/jdeanquin/IdeaProjects/TestFE/src/main/resources/certs/afip/homo/wsaahomo2021.jks";
            String trueStorePassword="soloio";
            String keyStore="/certs/private/certificado_cyjdesa.p12";
            keyStore="C:/Users/jdeanquin/IdeaProjects/TestFE/src/main/resources/certs/private/certificado_cyjdesa.p12";
            String keyStorePassword="m0n1t0rcomercio";

            System.setProperty ("javax.net.ssl.keyStore", keyStore);
            System.setProperty ("javax.net.ssl.keyStorePassword", keyStorePassword);
           System.setProperty ("javax.net.ssl.keyStoreType", "PKCS12");// or "JKS"); //-- if not default
                System.setProperty ("javax.net.ssl.trustStore", trueStore);
                System.setProperty ("javax.net.ssl.trustStorePassword", trueStorePassword);
               System.setProperty ("javax.net.ssl.trustStoreType", "PKCS12");// or "JKS");*/

            FERecuperaLastCbteResponse s=getPort().FECompUltimoAutorizado(ticket, puntoVenta, tipoComprobante);
            if(s.getErrors()!=null && s.getErrors().length==0){
                for(int i=0;i<s.getErrors().length;i++){
                    System.out.println("Error :"+
                            s.getErrors()[i].getMsg());
                }
                return -1;

            }else{
                return s.getCbteNro();

            }

        } catch (RemoteException e) {

            e.printStackTrace();
            return -1;
        } catch (ServiceException e) {
            // TODO Auto-generated catch block //ver las exceptiones
            e.printStackTrace();
            return -1;
        }
    }
    private ServiceSoap getPort() throws ServiceException {
        ServiceLocator service = new ServiceLocator();
        ServiceSoap port = service.getServiceSoap();
        return port;
    }
}
