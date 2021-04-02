package ar.com.daptech.kontos.wsaa;

// El Departamento de Seguridad Informatica de la AFIP (DeSeIn/AFIP), pone a disposicion
// el siguiente codigo para su utilizacion con el WebService de Autenticacion y Autorizacion
// de la AFIP.
//
// El mismo no puede ser re-distribuido, publicado o descargado en forma total o parcial, ya sea
// en forma electronica, mecanica u optica, sin la autorizacion de DeSeIn/AFIP. El uso no
// autorizado del mismo esta prohibido.
//
// DeSeIn/AFIP no asume ninguna responsabilidad de los errores que pueda contener el codigo ni la
// obligacion de subsanar dichos errores o informar de la existencia de los mismos.
//
// DeSeIn/AFIP no asume ninguna responsabilidad que surja de la utilizacion del codigo, ya sea por
// utilizacion ilegal de patentes, perdida de beneficios, perdida de informacion o cualquier otro
// inconveniente.
//
// Bajo ninguna circunstancia DeSeIn/AFIP podra ser indicada como responsable por consecuencias y/o
// incidentes ya sean directos o indirectos que puedan surgir de la utilizacion del codigo.
//
// DeSeIn/AFIP no da ninguna garantia, expresa o implicita, de la utilidad del codigo, si el mismo es
// correcto, o si cumple con los requerimientos de algun proposito en particular.
//
// DeSeIn/AFIP puede realizar cambios en cualquier momento en el codigo sin previo aviso.
//
// El codigo debera ser evaluado, verificado, corregido y/o adaptado por personal tecnico calificado
// de las entidades que lo utilicen.
//
// EL SIGUIENTE CODIGO ES DISTRIBUIDO PARA EVALUACION, CON TODOS SUS ERRORES Y OMISIONES. LA
// RESPONSABILIDAD DEL CORRECTO FUNCIONAMIENTO DEL MISMO YA SEA POR SI SOLO O COMO PARTE DE
// OTRA APLICACION, QUEDA A CARGO DE LAS ENTIDADES QUE LO UTILICEN. LA UTILIZACION DEL CODIGO
// SIGNIFICA LA ACEPTACION DE TODOS LOS TERMINOS Y CONDICIONES MENCIONADAS ANTERIORMENTE.
//
// Version 1.0
// gp/rg/OF.G. DeSeIn-AFIP
//

import FEV1.dif.afip.gov.ar.FEAuthRequest;
import ar.com.daptech.kontos.util.WebServiceAfipHelper;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;

import java.io.Reader;
import java.io.StringReader;
import java.util.Properties;

public class Wsaa {

	public static void main(String[] args) {

		Wsaa a = new Wsaa();
		try {
			String r[] = a.getTicket("wsfe");
			System.out.println("TOKEN1: " + r[0]);
			System.out.println("SIGN1: " + r[1]);

		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public String[] getTicket() throws DocumentException {
		return getTicket(null);
	}
	public String[] getTicket(String service) throws DocumentException {

		String retorno[] = new String[2];
		String LoginTicketResponse = null;

		System.setProperty("http.proxyHost", "");
		System.setProperty("http.proxyPort", "80");

		// Read config from phile
		Properties config = new Properties();

		try {
			config.load(getClass().getResourceAsStream("/wsaa_client.properties"));
		} catch (Exception e) {
			e.printStackTrace();
		}

		String endpoint = config.getProperty("endpoint","http://wsaahomo.afip.gov.ar/ws/services/LoginCms");
//		String service = config.getProperty("service", "test");
		if (service == null || service.isEmpty()) {
			service = config.getProperty("service", "test");
		}
		String dstDN = config.getProperty("dstdn","cn=wsaahomo,o=afip,c=ar,serialNumber=CUIT 33693450239");
//		String p12file = config.getProperty("keystore", "test-keystore.p12");
		String p12file = config.getProperty("keystore", "comercio_test.p12");
//		String signer = config.getProperty("keystore-signer", "coqui");
		String signer = config.getProperty("keystore-signer", "comercio_test");
//		String p12pass = config.getProperty("keystore-password","miclaveprivada");
		String p12pass = config.getProperty("keystore-password","m0n1t0rcomercio");

		// Set proxy system vars
		System.setProperty("http.proxyHost", config.getProperty("http_proxy",""));
		System.setProperty("http.proxyPort", config.getProperty("http_proxy_port", ""));
		System.setProperty("http.proxyUser", config.getProperty("http_proxy_user", ""));
		System.setProperty("http.proxyPassword", config.getProperty("http_proxy_password", ""));

		// Set the keystore used by SSL
		System.setProperty("javax.net.ssl.trustStore", config.getProperty("trustStore",""));
		System.setProperty("javax.net.ssl.trustStorePassword", config.getProperty("trustStore_password", ""));

		Long TicketTime = new Long(config.getProperty("TicketTime", "36000"));

		// Create LoginTicketRequest_xml_cms

		Long cuit=30707974466l;
		WebServiceAfipHelper o = new WebServiceAfipHelper();
		FEAuthRequest ticket = new FEAuthRequest();
		ticket.setCuit(cuit);
		String signx="KKMZTdhyAIwbNxV60ouygjUwtejSc+xei407e9QIp4OwfLz21HVBivQySL7LpqPh8Do3UO04e2UBaO3gbBIFxSbowRUTUaQi8fAS53QP+Pm7+3aEj+F1B4/VlmlAjMSjbwicOKR/1WQLDlSMv+iG8xHglZ739qdOMs+bFd2/pCk=";

		String tokenx ="PD94bWwgdmVyc2lvbj0iMS4wIiBlbmNvZGluZz0iVVRGLTgiIHN0YW5kYWxvbmU9InllcyI/Pgo8c3NvIHZlcnNpb249IjIuMCI+CiAgICA8aWQgc3JjPSJDTj13c2FhaG9tbywgTz1BRklQLCBDPUFSLCBTRVJJQUxOVU1CRVI9Q1VJVCAzMzY5MzQ1MDIzOSIgZHN0PSJDTj13c2ZlLCBPPUFGSVAsIEM9QVIiIHVuaXF1ZV9pZD0iMTM3MjI0NDI4OSIgZ2VuX3RpbWU9IjE2MTczOTc3OTAiIGV4cF90aW1lPSIxNjE3NDQxMDUwIi8+CiAgICA8b3BlcmF0aW9uIHR5cGU9ImxvZ2luIiB2YWx1ZT0iZ3JhbnRlZCI+CiAgICAgICAgPGxvZ2luIGVudGl0eT0iMzM2OTM0NTAyMzkiIHNlcnZpY2U9IndzZmUiIHVpZD0iU0VSSUFMTlVNQkVSPUNVSVQgMjMyNzA1ODQxNDQsIENOPWN5amRlc2EiIGF1dGhtZXRob2Q9ImNtcyIgcmVnbWV0aG9kPSIyMiI+CiAgICAgICAgICAgIDxyZWxhdGlvbnM+CiAgICAgICAgICAgICAgICA8cmVsYXRpb24ga2V5PSIzMDcwNzk3NDQ2NiIgcmVsdHlwZT0iNCIvPgogICAgICAgICAgICA8L3JlbGF0aW9ucz4KICAgICAgICA8L2xvZ2luPgogICAgPC9vcGVyYXRpb24+Cjwvc3NvPgo=";
		ticket.setSign(signx);
		ticket.setToken(tokenx);
		System.out.println(o.getUltimoComprobanteEmitido(ticket,101,1));


		if (true)return null;
		AfipWsaaClient afipWsaaClient=new AfipWsaaClient();
		byte[] LoginTicketRequest_xml_cms = afipWsaaClient.create_cms(
				p12file, p12pass, signer, dstDN, service, TicketTime);

		// Invoke AFIP wsaa and get LoginTicketResponse
		try {
			LoginTicketResponse = afipWsaaClient.invoke_wsaa(
					LoginTicketRequest_xml_cms, endpoint);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// Get token & sign from LoginTicketResponse
		try {
			Reader tokenReader = new StringReader(LoginTicketResponse);
			Document tokenDoc;

			tokenDoc = new SAXReader(false).read(tokenReader);

			String token = tokenDoc
					.valueOf("/loginTicketResponse/credentials/token");
			String sign = tokenDoc
					.valueOf("/loginTicketResponse/credentials/sign");

			retorno[0] = token;
			retorno[1] = sign;
			System.out.println("TOKEN1 en el jar: " + retorno[0]);
			System.out.println("SIGN1 en el jar: " + retorno[1]);
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}

		return retorno;

	}
}
