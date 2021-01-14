package X;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/* renamed from: X.3BD  reason: invalid class name */
public class AnonymousClass3BD extends DefaultHandler {
    public static String A00;
    public static AnonymousClass3BC A01;
    public static final List A02 = new ArrayList();

    @Override // java.lang.Object
    public void finalize() {
    }

    public AnonymousClass3BD(String str) {
        try {
            SAXParserFactory.newInstance().newSAXParser().parse(new InputSource(new StringReader(str)), this);
        } catch (IOException | ParserConfigurationException | SAXException unused) {
            throw new AnonymousClass3BF(AnonymousClass3BG.PARSER_MISCONFIG);
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void characters(char[] cArr, int i, int i2) {
        A00 = String.copyValueOf(cArr, i, i2).trim();
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void endElement(String str, String str2, String str3) {
        int hashCode = str3.hashCode();
        if (hashCode != 106079) {
            if (hashCode == 492250706 && str3.equals("keyValue")) {
                A01.A02 = A00;
            }
        } else if (str3.equals("key")) {
            A02.add(A01);
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void startElement(String str, String str2, String str3, Attributes attributes) {
        if (str3.hashCode() == 106079 && str3.equals("key")) {
            AnonymousClass3BC r1 = new AnonymousClass3BC();
            A01 = r1;
            r1.A01 = attributes.getValue("ki");
            A01.A00 = attributes.getValue("owner");
        }
    }
}
