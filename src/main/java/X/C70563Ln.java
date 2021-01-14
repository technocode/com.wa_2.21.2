package X;

/* renamed from: X.3Ln  reason: invalid class name and case insensitive filesystem */
public class C70563Ln extends C64392y7 {
    public final int A00;
    public final int A01;
    public final long A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public C70563Ln(int i, String str, byte[] bArr, String str2, String str3, String str4, String str5, int i2, int i3, long j) {
        super(false);
        super.A04 = 5;
        super.A00 = i;
        this.A07 = str;
        this.A0R = bArr;
        this.A05 = str2;
        this.A03 = str3;
        this.A04 = str4;
        this.A06 = str5;
        this.A01 = i2;
        this.A00 = i3;
        this.A02 = j;
    }

    public static C70563Ln A04(int i) {
        return new C70563Ln(i, null, null, null, null, null, null, 0, 0, 0);
    }

    @Override // X.C64392y7
    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("NonMessageMediaUploadResponse{directpath='");
        AnonymousClass008.A1W(A0S, this.A03, '\'', ", encFilehash='");
        AnonymousClass008.A1W(A0S, this.A04, '\'', ", mimeType='");
        AnonymousClass008.A1W(A0S, this.A06, '\'', ", mediaId='");
        AnonymousClass008.A1W(A0S, this.A05, '\'', ", width=");
        A0S.append(this.A01);
        A0S.append(", height=");
        A0S.append(this.A00);
        A0S.append(", size=");
        A0S.append(this.A02);
        A0S.append(", code=");
        A0S.append(super.A00);
        A0S.append('}');
        return A0S.toString();
    }
}
