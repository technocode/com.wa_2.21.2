package X;

/* renamed from: X.2Ti  reason: invalid class name and case insensitive filesystem */
public class C50082Ti {
    public AnonymousClass2U3 A00;
    public final int A01;
    public final AnonymousClass009 A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public C50082Ti(AnonymousClass009 r1, String str, String str2, String str3, String str4, int i) {
        this.A02 = r1;
        this.A05 = str;
        this.A04 = str2;
        this.A06 = str3;
        this.A03 = str4;
        this.A01 = i;
    }

    public synchronized void A00(int i, int i2) {
        AnonymousClass2U3 r1 = new AnonymousClass2U3();
        r1.A03 = AnonymousClass1WF.FAILURE;
        r1.A05 = "iq error";
        this.A00 = r1;
        r1.A01 = i;
        r1.A00 = i2;
    }
}
