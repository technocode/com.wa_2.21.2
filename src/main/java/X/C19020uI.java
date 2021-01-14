package X;

import org.xml.sax.Attributes;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: X.0uI  reason: invalid class name and case insensitive filesystem */
public class C19020uI implements Attributes {
    public XmlPullParser A00;

    public int getIndex(String str) {
        return -1;
    }

    public int getIndex(String str, String str2) {
        return -1;
    }

    @Override // org.xml.sax.Attributes
    public String getType(int i) {
        return null;
    }

    @Override // org.xml.sax.Attributes
    public String getType(String str) {
        return null;
    }

    public String getType(String str, String str2) {
        return null;
    }

    @Override // org.xml.sax.Attributes
    public String getValue(String str) {
        return null;
    }

    public String getValue(String str, String str2) {
        return null;
    }

    public C19020uI(XmlPullParser xmlPullParser) {
        this.A00 = xmlPullParser;
    }

    public int getLength() {
        return this.A00.getAttributeCount();
    }

    public String getLocalName(int i) {
        return this.A00.getAttributeName(i);
    }

    public String getQName(int i) {
        String attributeName = this.A00.getAttributeName(i);
        if (this.A00.getAttributePrefix(i) == null) {
            return attributeName;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.A00.getAttributePrefix(i));
        sb.append(':');
        sb.append(attributeName);
        return sb.toString();
    }

    public String getURI(int i) {
        return this.A00.getAttributeNamespace(i);
    }

    @Override // org.xml.sax.Attributes
    public String getValue(int i) {
        return this.A00.getAttributeValue(i);
    }
}
