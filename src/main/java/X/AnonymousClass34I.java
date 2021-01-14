package X;

/* renamed from: X.34I  reason: invalid class name */
public class AnonymousClass34I {
    public static volatile AnonymousClass34I A06;
    public final AnonymousClass088 A00;
    public final AnonymousClass00S A01;
    public final AnonymousClass2L6 A02;
    public final AnonymousClass348 A03;
    public final AnonymousClass34C A04;
    public final AnonymousClass00T A05;

    public AnonymousClass34I(AnonymousClass00S r7, AnonymousClass00T r8, AnonymousClass088 r9, C73193Vv r10, AnonymousClass01K r11, AnonymousClass0BV r12, C02580Cq r13, C014508d r14, AnonymousClass2L6 r15) {
        this.A01 = r7;
        this.A05 = r8;
        this.A00 = r9;
        this.A02 = r15;
        AnonymousClass348 r5 = new AnonymousClass348(r7, r10);
        this.A03 = r5;
        this.A04 = new AnonymousClass34C(r11, r12, r13, r14, r5);
    }

    public final boolean A00(Long l) {
        return l == null || this.A01.A05() - l.longValue() > 1296000000;
    }
}
