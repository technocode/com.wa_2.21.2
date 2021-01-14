package X;

/* renamed from: X.0Ku  reason: invalid class name and case insensitive filesystem */
public class C04550Ku {
    public static volatile C04550Ku A0A;
    public final AnonymousClass02M A00;
    public final AnonymousClass09G A01;
    public final C018609s A02;
    public final AnonymousClass0BA A03;
    public final C04570Kw A04;
    public final C04580Kx A05;
    public final C04560Kv A06;
    public final AnonymousClass0AD A07;
    public final C01970Ad A08;
    public final C018809u A09 = C018809u.A00("PaymentsMessageHandler", "infra", "COMMON");

    public C04550Ku(AnonymousClass02M r4, AnonymousClass09G r5, C01970Ad r6, C018609s r7, AnonymousClass0AD r8, AnonymousClass0BA r9, C04560Kv r10, C04570Kw r11, C04580Kx r12) {
        this.A00 = r4;
        this.A01 = r5;
        this.A08 = r6;
        this.A02 = r7;
        this.A07 = r8;
        this.A03 = r9;
        this.A06 = r10;
        this.A04 = r11;
        this.A05 = r12;
    }

    public static C04550Ku A00() {
        if (A0A == null) {
            synchronized (C04550Ku.class) {
                if (A0A == null) {
                    A0A = new C04550Ku(AnonymousClass02M.A00(), AnonymousClass09G.A00(), C01970Ad.A00(), C018609s.A04(), AnonymousClass0AD.A00, AnonymousClass0BA.A00(), C04560Kv.A00(), C04570Kw.A00(), C04580Kx.A00);
                }
            }
        }
        return A0A;
    }

    public void A01(AnonymousClass0MH r6) {
        C018609s r2 = this.A02;
        if (r2.A0e(r6.A0H, r6, r2.A0M(r6.A0H, r6.A0G))) {
            AnonymousClass0MH A0M = r2.A0M(r6.A0H, r6.A0G);
            if (A0M != null) {
                C018809u r22 = this.A09;
                StringBuilder A0S = AnonymousClass008.A0S("updatePaymentInfoWithoutMessage updated transaction with trans id: ");
                A0S.append(A0M.A0G);
                r22.A07(null, A0S.toString(), null);
                AnonymousClass0BA r3 = this.A03;
                r3.A0A.ANF(new RunnableEBaseShape3S0200000_I0_2(r3, A0M, 27));
                AnonymousClass02M r23 = this.A00;
                r23.A02.post(new RunnableEBaseShape3S0200000_I0_2(this, A0M, 30));
                return;
            }
            return;
        }
        C018809u r24 = this.A09;
        StringBuilder A0S2 = AnonymousClass008.A0S("updatePaymentInfoWithoutMessage transaction was not updated: ");
        A0S2.append(r6.A0G);
        r24.A03(A0S2.toString());
    }
}
