package X;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import org.xmlpull.v1.XmlSerializer;

/* renamed from: X.0Tu  reason: invalid class name and case insensitive filesystem */
public class C06550Tu implements XmlSerializer {
    public static final String[] A0B = {"&#0;", "&#1;", "&#2;", "&#3;", "&#4;", "&#5;", "&#6;", "&#7;", "&#8;", "&#9;", "&#10;", "&#11;", "&#12;", "&#13;", "&#14;", "&#15;", "&#16;", "&#17;", "&#18;", "&#19;", "&#20;", "&#21;", "&#22;", "&#23;", "&#24;", "&#25;", "&#26;", "&#27;", "&#28;", "&#29;", "&#30;", "&#31;", null, null, "&quot;", null, null, null, "&amp;", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "&lt;", null, "&gt;", null};
    public int A00 = 0;
    public int A01;
    public OutputStream A02;
    public Writer A03;
    public ByteBuffer A04;
    public CharsetEncoder A05;
    public boolean A06;
    public boolean A07 = false;
    public boolean A08 = true;
    public final int A09;
    public final char[] A0A;

    public C06550Tu(int i) {
        i = i <= 0 ? 32768 : i;
        this.A09 = i;
        this.A0A = new char[i];
        this.A04 = ByteBuffer.allocate(i);
    }

    public final void A00() {
        int position = this.A04.position();
        if (position > 0) {
            this.A04.flip();
            this.A02.write(this.A04.array(), 0, position);
            this.A04.clear();
        }
    }

    public final void A01(char c) {
        int i = this.A01;
        if (i >= this.A09 - 1) {
            flush();
            i = this.A01;
        }
        this.A0A[i] = c;
        this.A01 = i + 1;
    }

    public final void A02(String str) {
        A04(str, 0, str.length());
    }

    public final void A03(String str) {
        String str2;
        int length = str.length();
        String[] strArr = A0B;
        char length2 = (char) strArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt < length2 && (str2 = strArr[charAt]) != null) {
                if (i2 < i) {
                    A04(str, i2, i - i2);
                }
                i2 = i + 1;
                A02(str2);
            }
            i++;
        }
        if (i2 < i) {
            A04(str, i2, i - i2);
        }
    }

    public final void A04(String str, int i, int i2) {
        int i3 = this.A09;
        if (i2 > i3) {
            int i4 = i2 + i;
            while (i < i4) {
                int i5 = i3;
                int i6 = i + i3;
                if (i6 >= i4) {
                    i5 = i4 - i;
                }
                A04(str, i, i5);
                i = i6;
            }
            return;
        }
        int i7 = this.A01;
        if (i7 + i2 > i3) {
            flush();
            i7 = this.A01;
        }
        str.getChars(i, i + i2, this.A0A, i7);
        this.A01 = i7 + i2;
    }

    public final void A05(char[] cArr, int i, int i2) {
        int i3 = this.A09;
        if (i2 > i3) {
            int i4 = i2 + i;
            while (i < i4) {
                int i5 = i3;
                int i6 = i + i3;
                if (i6 >= i4) {
                    i5 = i4 - i;
                }
                A05(cArr, i, i5);
                i = i6;
            }
            return;
        }
        int i7 = this.A01;
        if (i7 + i2 > i3) {
            flush();
            i7 = this.A01;
        }
        System.arraycopy(cArr, i, this.A0A, i7, i2);
        this.A01 = i7 + i2;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public XmlSerializer attribute(String str, String str2, String str3) {
        A01(' ');
        if (str != null) {
            A02(str);
            A01(':');
        }
        A02(str2);
        A02("=\"");
        A03(str3);
        A01('\"');
        this.A08 = false;
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void cdsect(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void comment(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void docdecl(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void endDocument() {
        flush();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public XmlSerializer endTag(String str, String str2) {
        int i = this.A00 - 1;
        this.A00 = i;
        if (this.A06) {
            A02(" />\n");
        } else {
            if (this.A07 && this.A08) {
                int i2 = i << 2;
                if (i2 > 62) {
                    i2 = 62;
                }
                A04("                                                              ", 0, i2);
            }
            A02("</");
            if (str != null) {
                A02(str);
                A01(':');
            }
            A02(str2);
            A02(">\n");
        }
        this.A08 = true;
        this.A06 = false;
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void entityRef(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void flush() {
        int i = this.A01;
        if (i > 0) {
            if (this.A02 != null) {
                CharBuffer wrap = CharBuffer.wrap(this.A0A, 0, i);
                CoderResult encode = this.A05.encode(wrap, this.A04, true);
                while (!encode.isError()) {
                    if (encode.isOverflow()) {
                        A00();
                        encode = this.A05.encode(wrap, this.A04, true);
                    } else {
                        A00();
                        this.A02.flush();
                    }
                }
                throw new IOException(encode.toString());
            }
            this.A03.write(this.A0A, 0, i);
            this.A03.flush();
            this.A01 = 0;
        }
    }

    public int getDepth() {
        throw new UnsupportedOperationException();
    }

    public boolean getFeature(String str) {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        throw new UnsupportedOperationException();
    }

    public String getNamespace() {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public String getPrefix(String str, boolean z) {
        throw new UnsupportedOperationException();
    }

    public Object getProperty(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void ignorableWhitespace(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void processingInstruction(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void setFeature(String str, boolean z) {
        if (str.equals("http://xmlpull.org/v1/doc/features.html#indent-output")) {
            this.A07 = true;
            return;
        }
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void setOutput(OutputStream outputStream, String str) {
        if (outputStream != null) {
            try {
                CharsetEncoder newEncoder = Charset.forName(str).newEncoder();
                CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
                this.A05 = newEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
                this.A02 = outputStream;
            } catch (IllegalCharsetNameException e) {
                throw new UnsupportedEncodingException(str).initCause(e);
            } catch (UnsupportedCharsetException e2) {
                throw new UnsupportedEncodingException(str).initCause(e2);
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void setOutput(Writer writer) {
        this.A03 = writer;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void setPrefix(String str, String str2) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void setProperty(String str, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public void startDocument(String str, Boolean bool) {
        String str2;
        StringBuilder A0S = AnonymousClass008.A0S("<?xml version='1.0' encoding='utf-8' standalone='");
        if (bool.booleanValue()) {
            str2 = "yes";
        } else {
            str2 = "no";
        }
        A0S.append(str2);
        A0S.append("' ?>\n");
        A02(A0S.toString());
        this.A08 = true;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public XmlSerializer startTag(String str, String str2) {
        if (this.A06) {
            A02(">\n");
        }
        if (this.A07) {
            int i = this.A00 << 2;
            if (i > 62) {
                i = 62;
            }
            A04("                                                              ", 0, i);
        }
        this.A00++;
        A01('<');
        if (str != null) {
            A02(str);
            A01(':');
        }
        A02(str2);
        this.A06 = true;
        this.A08 = false;
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public XmlSerializer text(String str) {
        boolean z = false;
        if (this.A06) {
            A02(">");
            this.A06 = false;
        }
        A03(str);
        if (this.A07) {
            int length = str.length();
            if (length > 0 && str.charAt(length - 1) == '\n') {
                z = true;
            }
            this.A08 = z;
        }
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public XmlSerializer text(char[] cArr, int i, int i2) {
        String str;
        boolean z = false;
        if (this.A06) {
            A02(">");
            this.A06 = false;
        }
        String[] strArr = A0B;
        char length = (char) strArr.length;
        int i3 = i2 + i;
        int i4 = i;
        while (i < i3) {
            char c = cArr[i];
            if (c < length && (str = strArr[c]) != null) {
                if (i4 < i) {
                    A05(cArr, i4, i - i4);
                }
                i4 = i + 1;
                A02(str);
            }
            i++;
        }
        if (i4 < i) {
            A05(cArr, i4, i - i4);
        }
        if (this.A07) {
            if (cArr[i3 - 1] == '\n') {
                z = true;
            }
            this.A08 = z;
        }
        return this;
    }
}
