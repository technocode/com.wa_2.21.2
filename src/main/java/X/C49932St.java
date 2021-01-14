package X;

import android.util.Base64;

/* renamed from: X.2St  reason: invalid class name and case insensitive filesystem */
public class C49932St {
    public byte[] A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;

    public C49932St(String str, String str2, byte[] bArr, String str3, String str4, String str5, String str6, int i, int i2, int i3) {
        this.A07 = str;
        this.A06 = str2;
        this.A00 = bArr;
        this.A08 = str3;
        this.A09 = str4;
        this.A04 = str5;
        this.A05 = str6;
        this.A01 = i;
        this.A03 = i2;
        this.A02 = i3;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("WebUploadMediaData{");
        stringBuffer.append("mediaId='");
        AnonymousClass008.A1J(stringBuffer, this.A07, ", fileHash='");
        AnonymousClass008.A1J(stringBuffer, this.A06, ", mimeType='");
        AnonymousClass008.A1J(stringBuffer, this.A08, ", url='");
        AnonymousClass008.A1J(stringBuffer, this.A09, ", directPath='");
        AnonymousClass008.A1J(stringBuffer, this.A04, ", encFileHash='");
        AnonymousClass008.A1J(stringBuffer, this.A05, ", fileSize=");
        stringBuffer.append(this.A01);
        stringBuffer.append(", width=");
        stringBuffer.append(this.A03);
        stringBuffer.append(", height=");
        stringBuffer.append(this.A02);
        stringBuffer.append(", mediaKey=");
        stringBuffer.append(Base64.encodeToString(this.A00, 0));
        stringBuffer.append('}');
        return stringBuffer.toString();
    }
}
