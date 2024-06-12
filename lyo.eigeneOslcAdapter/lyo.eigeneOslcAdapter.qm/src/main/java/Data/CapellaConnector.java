/**
 * 
 */
package Data;

import java.io.File;
import java.util.ArrayList;

import javax.annotation.Resource;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.lyo.oslc4j.core.OSLC4JUtils;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import lyo.eigeneOslcAdapter.ResourcesFactory;

/**
 * 
 */
public class CapellaConnector {
	private static final String FILENAME = "C:/Users/raffa/Downloads/capella-6.1.0.202303291413-win32-win32-x86_64/capella/workspace/In-Flight Entertainment System/In-Flight Entertainment System.capella";
	
	public File capellaFile = new File(FILENAME);
	public Document doc;
	public CapellaConnector () {
		super();
	}
	
	public ArrayList<Resource> parseSysElements() {
		ArrayList<Resource> resources;
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		resources = new ArrayList<Resource>();
		ResourcesFactory resourcesFactory = new ResourcesFactory(OSLC4JUtils.getServletURI());
		
		try {
			// process XML securely, avoid attacks like XML External Entities (XXE)
			dbf.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);
			
			// parse XML-file
			DocumentBuilder db = dbf.newDocumentBuilder();
			
			doc = db.parse(capellaFile);
			
			// optional, but recommended
			// https://stackoverflow.com/questions/13786607/normalization-in-dom-parsing-with-java-how-does-it-work
			doc.getDocumentElement().normalize();
			NodeList list = doc.getElementsByTagName("ownedLogicalComponents");
			
			System.out.println(list.getLength());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return new ArrayList<>();
		
	}

}
