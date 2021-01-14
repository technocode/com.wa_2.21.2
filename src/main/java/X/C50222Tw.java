package X;

/* renamed from: X.2Tw  reason: invalid class name and case insensitive filesystem */
public class C50222Tw {
    public final String A00;
    public final boolean A01;

    public C50222Tw(String str, boolean z) {
        this.A00 = str;
        this.A01 = z;
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("[hash=");
        A0S.append(this.A00);
        A0S.append(", optimistic=");
        A0S.append(this.A01);
        A0S.append("]");
        return A0S.toString();
    }
}
