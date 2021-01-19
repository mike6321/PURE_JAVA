package me.choi.inheritance.visitorpattern;

import org.w3c.dom.Document;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;

/**
 * Project : IntoJAVA
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 6:56 오후
 */
public class SaxParser {
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser saxParser = factory.newSAXParser();
        saxParser.parse("src/main/resources/members.xml", new MemberHandler());

    }

    static class MemberHandler extends DefaultHandler {

        private String text;

        @Override
        public void startDocument() throws SAXException {
            System.out.println("start parsing xml");
        }

        @Override
        public void endDocument() throws SAXException {
            System.out.println("end parsing xml");
        }

        @Override
        public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
            System.out.println("element : " + qName);
            if (qName.equals("member")) {
                System.out.println(attributes.getValue("id"));
            }
        }

        @Override
        public void characters(char[] ch, int start, int length) throws SAXException {
            this.text = new String(ch, start, length);
        }
    }
}
