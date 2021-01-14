package X;

/* renamed from: X.2Vl  reason: invalid class name and case insensitive filesystem */
public class C50632Vl {
    public short A00;
    public byte[] A01;

    public C50632Vl(short s, byte[] bArr) {
        this.A00 = s;
        this.A01 = bArr;
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("WtExtension{extensionType=");
        A0S.append((int) this.A00);
        A0S.append(", extensionData=");
        A0S.append(C28051Sr.A1A(this.A01));
        A0S.append('}');
        return A0S.toString();
    }
}
