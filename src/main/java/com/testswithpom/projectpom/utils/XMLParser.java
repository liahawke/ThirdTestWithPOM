package com.testswithpom.projectpom.utils;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class XMLParser {

    /**
     * Parse XML configuration file
     *
     * @return Data that represents content from xml file
     * @throws JAXBException
     */
    public static XMLFile getXmlData() throws JAXBException {

        JAXBContext jaxbContext = JAXBContext.newInstance(XMLFile.class);

        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

        return (XMLFile) unmarshaller.unmarshal(new File("src/main/resources/configuration.xml"));
    }
}
