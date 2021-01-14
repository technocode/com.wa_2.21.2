package X;

/* renamed from: X.1XM  reason: invalid class name */
public class AnonymousClass1XM {
    public boolean A00;
    public final String A01;
    public final String A02;

    public AnonymousClass1XM(String str, String str2, boolean z) {
        this.A02 = str;
        this.A01 = str2;
        this.A00 = z;
    }

    public Object clone() {
        return new AnonymousClass1XM(this.A02, this.A01, this.A00);
    }
}
