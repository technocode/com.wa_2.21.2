package X;

/* renamed from: X.352  reason: invalid class name */
public class AnonymousClass352 {
    public final int A00;
    public final AnonymousClass3S1 A01;
    public final AnonymousClass3S4 A02;
    public final AnonymousClass3S4 A03;

    public AnonymousClass352(int i, AnonymousClass3S1 r2, AnonymousClass3S4 r3, AnonymousClass3S4 r4) {
        this.A00 = i;
        this.A01 = r2;
        this.A03 = r3;
        this.A02 = r4;
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("UserNoticeContent{policyVersion=");
        A0S.append(this.A00);
        A0S.append(", banner=");
        A0S.append(this.A01);
        A0S.append(", modal=");
        A0S.append(this.A03);
        A0S.append(", blockingModal=");
        A0S.append(this.A02);
        A0S.append('}');
        return A0S.toString();
    }
}
