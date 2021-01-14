package X;

/* renamed from: X.0JF  reason: invalid class name */
public class AnonymousClass0JF {
    public final int A00;
    public final long A01;
    public final boolean A02;
    public final boolean A03;

    public AnonymousClass0JF(boolean z, boolean z2, int i, long j) {
        this.A02 = z;
        this.A03 = z2;
        this.A00 = i;
        this.A01 = j;
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("Connectivity{connected=");
        A0S.append(this.A02);
        A0S.append(", roaming=");
        A0S.append(this.A03);
        A0S.append(", type=");
        A0S.append(this.A00);
        A0S.append(", ntpEventTimeMillis=");
        A0S.append(this.A01);
        A0S.append('}');
        return A0S.toString();
    }
}
