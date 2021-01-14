package X;

/* renamed from: X.355  reason: invalid class name */
public class AnonymousClass355 {
    public final AnonymousClass353 A00;
    public final AnonymousClass354 A01;
    public final AnonymousClass354 A02;

    public AnonymousClass355(AnonymousClass354 r1, AnonymousClass353 r2, AnonymousClass354 r3) {
        this.A02 = r1;
        this.A00 = r2;
        this.A01 = r3;
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("UserNoticeContentTiming{start=");
        A0S.append(this.A02);
        A0S.append(", duration=");
        A0S.append(this.A00);
        A0S.append(", end=");
        A0S.append(this.A01);
        A0S.append('}');
        return A0S.toString();
    }
}
