package X;

import com.whatsapp.util.Log;

/* renamed from: X.3Ik  reason: invalid class name */
public class AnonymousClass3Ik implements AnonymousClass0XW {
    public final /* synthetic */ AnonymousClass01X A00;
    public final /* synthetic */ AbstractC63952xH A01;

    @Override // X.AnonymousClass0XW
    public void AIF(int i) {
    }

    @Override // X.AnonymousClass0XW
    public void AIG(int i, float f, int i2) {
    }

    public AnonymousClass3Ik(AbstractC63952xH r1, AnonymousClass01X r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    @Override // X.AnonymousClass0XW
    public void AIH(int i) {
        C74213aM r1;
        C74203aL r12;
        AbstractC63952xH r2 = this.A01;
        r2.A00 = i;
        if (!this.A00.A0M()) {
            i = (r2.A03.A01.length - i) - 1;
        }
        if (r2 instanceof AnonymousClass3R6) {
            AnonymousClass3R6 r4 = (AnonymousClass3R6) r2;
            AnonymousClass3RI r7 = r4.A0G[i];
            r7.A04(true);
            AnonymousClass3RI r0 = r4.A0C;
            if (!(r0 == null || r0 == r7)) {
                r0.A04(false);
            }
            r4.A0C = r7;
            if (r7 instanceof C74223aN) {
                AnonymousClass33N r6 = ((C74223aN) r7).A04;
                r6.A07 = false;
                C03570Gt r5 = r4.A0T;
                if (r5 != null) {
                    Log.d("StickerRepository/markStickerPackAsSeenAsync/begin");
                    r5.A0R.ANF(new RunnableEBaseShape9S0200000_I1_4(r5, r6, 14));
                } else {
                    throw null;
                }
            }
            if (!(r7.getId().equals("recents") || (r12 = r4.A0A) == null || ((AnonymousClass3RI) r12).A04 == null)) {
                r12.A01();
            }
            if (!(r7.getId().equals("starred") || (r1 = r4.A0B) == null || ((AnonymousClass3RI) r1).A04 == null)) {
                r1.A01();
            }
        }
        AbstractC63962xI r02 = r2.A04;
        if (r02 != null) {
            r02.AIH(i);
        }
    }
}
