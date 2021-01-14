package X;

/* renamed from: X.3Am  reason: invalid class name */
public class AnonymousClass3Am {
    public final int A00;
    public final int A01;
    public final int A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public AnonymousClass3Am(int i, String str, int i2, int i3, String str2, String str3) {
        this.A00 = i;
        this.A04 = str;
        this.A02 = i2;
        this.A01 = i3;
        this.A05 = str2;
        this.A03 = str3;
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("WamsysMMSUploadRequest{mediaType=");
        A0S.append(this.A00);
        A0S.append(", filePath='");
        AnonymousClass008.A1W(A0S, this.A04, '\'', ", uploadType=");
        A0S.append(this.A02);
        A0S.append(", uploadOptions=");
        A0S.append(this.A01);
        A0S.append(", transferOptions=");
        A0S.append(0);
        A0S.append(", loggingId='");
        AnonymousClass008.A1W(A0S, this.A05, '\'', ", connBlockJSONStr='");
        A0S.append(this.A03);
        A0S.append('\'');
        A0S.append('}');
        return A0S.toString();
    }
}
