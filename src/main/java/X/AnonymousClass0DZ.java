package X;

import java.util.Collections;

/* renamed from: X.0DZ  reason: invalid class name */
public abstract class AnonymousClass0DZ {
    public final AnonymousClass0DU A00;

    public AnonymousClass0DZ(AnonymousClass0DU r1) {
        this.A00 = r1;
    }

    public void A00(AbstractC48162Ld r5) {
        if (this instanceof C02700Dc) {
            C02700Dc r2 = (C02700Dc) this;
            C52792bl r52 = (C52792bl) r5;
            AnonymousClass01K r0 = r2.A01;
            AbstractC007503q A05 = r0.A0J.A05(r52.A01);
            if (A05 != null) {
                r2.A06(r52, A05);
                r2.A01(r52);
            }
        } else if (!(this instanceof C02740Dg) && !(this instanceof C02720De)) {
            if (this instanceof C02680Da) {
                C02680Da r22 = (C02680Da) this;
                C52752bh r53 = (C52752bh) r5;
                AnonymousClass02N r1 = r53.A00;
                if (r22.A03.A0C(r1)) {
                    r22.A07(r53, r1);
                    r22.A01(r53);
                }
            } else if (this instanceof AnonymousClass0DY) {
                AnonymousClass0DY r23 = (AnonymousClass0DY) this;
                C52742bg r54 = (C52742bg) r5;
                if (r23.A01.A0C(r54.A01)) {
                    r23.A06(r54);
                    r23.A01(r54);
                }
            } else if (this instanceof C51222Xv) {
                ((C51222Xv) this).A06((C52732bf) r5);
            } else if (this instanceof C51212Xu) {
                AnonymousClass00E.A08(false, "Primary shouldn't process LocaleSettingMutation");
                A01(r5);
            } else if (this instanceof C02730Df) {
                C02730Df r3 = (C02730Df) this;
                C52712bd r55 = (C52712bd) r5;
                AnonymousClass01K r24 = r3.A01;
                AbstractC007503q A052 = r24.A0J.A05(r55.A02);
                if (A052 != null) {
                    r24.A0W(Collections.singleton(A052), (r55.A03 ? 1 : 0) | 2);
                    r3.A01(r55);
                }
            } else if (this instanceof C51202Xt) {
                C51202Xt r02 = (C51202Xt) this;
                C52702bc r56 = (C52702bc) r5;
                r02.A06(r56);
                r02.A04(r56);
            } else if (this instanceof C02710Dd) {
            } else {
                if (!(this instanceof C51192Xs)) {
                    ((C02690Db) this).A07((AnonymousClass2bZ) r5, Collections.EMPTY_LIST);
                    return;
                }
                C51192Xs r03 = (C51192Xs) this;
                C52682ba r57 = (C52682ba) r5;
                r03.A06(r57);
                r03.A04(r57);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0063, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0067, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006e, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.AbstractC48162Ld r9) {
        /*
        // Method dump skipped, instructions count: 114
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0DZ.A01(X.2Ld):void");
    }

    public final void A02(AbstractC48162Ld r3) {
        this.A00.A0G(Collections.singleton(r3.A07));
    }

    public final void A03(AbstractC48162Ld r3) {
        synchronized (r3) {
            r3.A01 = false;
        }
        this.A00.A0F(Collections.singleton(r3));
    }

    public final void A04(AbstractC48162Ld r3) {
        synchronized (r3) {
            r3.A01 = true;
        }
        this.A00.A0F(Collections.singleton(r3));
    }

    public final void A05(AbstractC48162Ld r3, AbstractC48162Ld r4) {
        if (r4 != null) {
            this.A00.A0E(r4);
        }
        this.A00.A0F(Collections.singleton(r3));
    }
}
