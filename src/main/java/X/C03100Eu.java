package X;

/* renamed from: X.0Eu  reason: invalid class name and case insensitive filesystem */
public class C03100Eu {
    public static volatile C03100Eu A01;
    public final AnonymousClass01I A00;

    public C03100Eu(AnonymousClass01I r1) {
        this.A00 = r1;
    }

    public static C03100Eu A00() {
        if (A01 == null) {
            synchronized (C03100Eu.class) {
                if (A01 == null) {
                    A01 = new C03100Eu(AnonymousClass01I.A00());
                }
            }
        }
        return A01;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01b6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C77493gF A01(X.AbstractC007503q r9) {
        /*
        // Method dump skipped, instructions count: 646
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03100Eu.A01(X.03q):X.3gF");
    }

    public AnonymousClass0M5 A02(AbstractC007503q r11) {
        AnonymousClass0N0 r2 = (AnonymousClass0N0) AnonymousClass0Ms.A0T.AQb();
        AnonymousClass0NK r3 = (AnonymousClass0NK) AnonymousClass0N3.A05.AQb();
        C007303n r1 = r11.A0n;
        r3.A06(AnonymousClass1VY.A0D(r1.A00));
        r3.A07(r1.A02);
        r3.A04(r1.A01);
        r2.A02();
        AnonymousClass0Ms.A08((AnonymousClass0Ms) r2.A00, (AnonymousClass0N3) r3.A01());
        C04970Mo A08 = C02840Dr.A08();
        AnonymousClass0ZG.A0F(r11, new C64552yN(this.A00, A08, true, false, null, null));
        C02840Dr r0 = (C02840Dr) A08.A01();
        r2.A02();
        AnonymousClass0Ms r12 = (AnonymousClass0Ms) r2.A00;
        if (r0 != null) {
            r12.A0D = r0;
            r12.A01 |= 2;
            A03(r2, r11);
            return new AnonymousClass0M5("message", (AnonymousClass0OS[]) null, r2.A01().A09());
        }
        throw null;
    }

    public void A03(AnonymousClass0N0 r4, AbstractC007503q r5) {
        AnonymousClass0MH r0;
        AnonymousClass0MH r02 = r5.A0F;
        if (!(r02 == null || r02.A06 == null)) {
            C77493gF A012 = A01(r5);
            r4.A02();
            AnonymousClass0Ms r2 = (AnonymousClass0Ms) r4.A00;
            if (A012 != null) {
                r2.A0F = A012;
                r2.A01 |= 65536;
            } else {
                throw null;
            }
        }
        AbstractC007503q A09 = r5.A09();
        if (A09 != null && (r0 = A09.A0F) != null && r0.A06 != null) {
            C77493gF A013 = A01(A09);
            r4.A02();
            AnonymousClass0Ms r22 = (AnonymousClass0Ms) r4.A00;
            if (A013 != null) {
                r22.A0G = A013;
                r22.A01 |= 262144;
                return;
            }
            throw null;
        }
    }
}
