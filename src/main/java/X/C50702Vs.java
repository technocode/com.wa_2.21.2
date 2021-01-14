package X;

/* renamed from: X.2Vs  reason: invalid class name and case insensitive filesystem */
public class C50702Vs {
    public static final AnonymousClass2VZ A00;
    public static final AnonymousClass2VZ A01;
    public static final AnonymousClass2VZ A02;
    public static final AnonymousClass2VZ A03;
    public static final AnonymousClass2VZ A04;
    public static final AnonymousClass2VZ A05;
    public static final AnonymousClass2VZ A06;
    public static final AnonymousClass2VZ A07;
    public static final AnonymousClass2VZ A08;
    public static final AnonymousClass2VZ A09;
    public static final AnonymousClass2VZ A0A;
    public static final AnonymousClass2VZ A0B;
    public static final AnonymousClass2VZ[] A0C;

    static {
        EnumC50552Vd r2 = EnumC50552Vd.ACTIVE;
        EnumC50552Vd r1 = EnumC50552Vd.START;
        C58352lm r3 = C50582Vg.A0I;
        AnonymousClass2VZ r13 = new AnonymousClass2VZ("START", r1, null, r3);
        A02 = r13;
        AnonymousClass2VZ r11 = new AnonymousClass2VZ("WAIT_SH_HRR", r2, null, r3);
        A0B = r11;
        AnonymousClass2VZ r12 = new AnonymousClass2VZ("WAIT_SEND_EARLY_DATA", r2, C50582Vg.A05, null);
        A09 = r12;
        AnonymousClass2VZ r10 = new AnonymousClass2VZ("WAIT_SH", r2, null, r3);
        A0A = r10;
        AnonymousClass2VZ r9 = new AnonymousClass2VZ("WAIT_EE", r2, C50582Vg.A06, r3);
        A06 = r9;
        AnonymousClass2VZ r8 = new AnonymousClass2VZ("WAIT_CERT_CR", r2, null, r3);
        A04 = r8;
        AnonymousClass2VZ r7 = new AnonymousClass2VZ("WAIT_CERT", r2, null, r3);
        A03 = r7;
        AnonymousClass2VZ r6 = new AnonymousClass2VZ("WAIT_CV", r2, null, r3);
        A05 = r6;
        AnonymousClass2VZ r5 = new AnonymousClass2VZ("WAIT_FINISHED", r2, null, r3);
        A07 = r5;
        AnonymousClass2VZ r4 = new AnonymousClass2VZ("WAIT_SEND_CERTS_FIN", r2, C50582Vg.A04, r3);
        A08 = r4;
        AnonymousClass2VZ r32 = new AnonymousClass2VZ("CONNECTED", r2, C50582Vg.A07, null);
        A00 = r32;
        AnonymousClass2VZ r22 = new AnonymousClass2VZ("END", EnumC50552Vd.END, null, null);
        A01 = r22;
        A0C = new AnonymousClass2VZ[]{r13, r12, r11, r10, r9, r8, r7, r6, r5, r4, r32, r22};
    }
}
