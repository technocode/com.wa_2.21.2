package X;

/* renamed from: X.23s  reason: invalid class name and case insensitive filesystem */
public class C452423s extends C02270Bi {
    public C15610oN A00;
    public String A01;

    public C452423s(C15610oN r1, String str) {
        this.A01 = str;
        this.A00 = r1;
    }

    public C452423s(C15610oN r1, String str, Object obj) {
        super(obj);
        this.A01 = str;
        this.A00 = r1;
    }

    @Override // X.AbstractC02280Bj
    public void A07(Object obj) {
        C15610oN r0 = this.A00;
        if (r0 != null) {
            r0.A02.put(this.A01, obj);
        }
        super.A07(obj);
    }
}
