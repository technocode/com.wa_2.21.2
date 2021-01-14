package X;

/* renamed from: X.3Ea  reason: invalid class name and case insensitive filesystem */
public class C68653Ea implements AbstractC61742tf {
    public final AbstractC61742tf A00;
    public final Long A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final byte[] A06;

    public C68653Ea(String str, String str2, String str3, String str4, byte[] bArr, Long l) {
        this.A05 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A04 = str4;
        this.A06 = bArr;
        this.A01 = l;
        switch (str3.hashCode()) {
            case 100229:
                if (str3.equals("ecc")) {
                    this.A00 = new AnonymousClass3EY(bArr);
                    return;
                }
                break;
            case 113216:
                if (str3.equals("rsa")) {
                    this.A00 = new C68663Eb(bArr);
                    return;
                }
                break;
            case 3387192:
                if (str3.equals("none")) {
                    this.A00 = new AnonymousClass3EZ();
                    return;
                }
                break;
            case 110541305:
                if (str3.equals("token")) {
                    this.A00 = new C68673Ec();
                    return;
                }
                break;
        }
        StringBuilder sb = new StringBuilder("PaymentProviderKey invalid key type: ");
        sb.append(str3);
        throw new AssertionError(C018809u.A01("PaymentProviderKey", sb.toString()));
    }

    @Override // X.AbstractC61742tf
    public byte[] A44(byte[] bArr, byte[] bArr2) {
        return this.A00.A44(bArr, bArr2);
    }
}
