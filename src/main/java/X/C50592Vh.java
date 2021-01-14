package X;

/* renamed from: X.2Vh  reason: invalid class name and case insensitive filesystem */
public class C50592Vh {
    public C50642Vm A00;
    public byte[] A01;

    public C50592Vh(byte[] bArr, C50642Vm r2) {
        this.A01 = bArr;
        this.A00 = r2;
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("WtCertificateEntry{certData=");
        A0S.append(C28051Sr.A1A(this.A01));
        A0S.append(", wtExtensions=");
        A0S.append(this.A00);
        A0S.append('}');
        return A0S.toString();
    }
}
