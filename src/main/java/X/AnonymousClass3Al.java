package X;

import java.util.Arrays;

/* renamed from: X.3Al  reason: invalid class name */
public class AnonymousClass3Al {
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final byte[] A07;
    public final byte[] A08;
    public final byte[] A09;

    public AnonymousClass3Al(int i, int i2, String str, String str2, String str3, byte[] bArr, byte[] bArr2, byte[] bArr3, String str4, String str5) {
        this.A01 = i;
        this.A00 = i2;
        this.A06 = str;
        this.A05 = str2;
        this.A03 = str3;
        this.A08 = bArr;
        this.A07 = bArr2;
        this.A09 = bArr3;
        this.A02 = str4;
        this.A04 = str5;
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("WamsysMMSDownloadRequest{mediaType=");
        A0S.append(this.A01);
        A0S.append(", downloadType=");
        A0S.append(this.A00);
        A0S.append(", transferOption=");
        A0S.append(0);
        A0S.append(", temporaryFilePath='");
        AnonymousClass008.A1W(A0S, this.A06, '\'', ", outputFilePath='");
        AnonymousClass008.A1W(A0S, this.A05, '\'', ", directPath='");
        AnonymousClass008.A1W(A0S, this.A03, '\'', ", hashIdentifier=");
        A0S.append(Arrays.toString(this.A07));
        A0S.append(", plaintextHashIdentifier=");
        A0S.append(Arrays.toString(this.A09));
        A0S.append(", connBlockJSONStr='");
        AnonymousClass008.A1W(A0S, this.A02, '\'', ", loggingIdentifier='");
        A0S.append(this.A04);
        A0S.append('\'');
        A0S.append('}');
        return A0S.toString();
    }
}
