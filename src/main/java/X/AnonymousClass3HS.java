package X;

import android.text.TextUtils;

/* renamed from: X.3HS  reason: invalid class name */
public class AnonymousClass3HS implements AnonymousClass0GT, AbstractC63152vw {
    public AbstractC29091Wz A00;
    public C01970Ad A01;
    public C10010dt A02;
    public final ActivityC004602e A03;
    public final AnonymousClass0BA A04;
    public final C01980Ae A05;
    public final C02060Am A06;
    public final C04560Kv A07;
    public final C02010Ah A08;
    public final AnonymousClass0AD A09;
    public final C03340Fu A0A;
    public final C61592tQ A0B;
    public final C018809u A0C = C018809u.A00("PaymentDataPresenter", "payment", "COMMON");
    public final AnonymousClass00T A0D;
    public final boolean A0E;
    public final boolean A0F;

    public AnonymousClass3HS(ActivityC004602e r4, AnonymousClass00T r5, C01970Ad r6, C02010Ah r7, C01980Ae r8, C03340Fu r9, C61592tQ r10, C02060Am r11, AnonymousClass0AD r12, AnonymousClass0BA r13, C04560Kv r14, boolean z) {
        this.A03 = r4;
        this.A0D = r5;
        this.A01 = r6;
        this.A08 = r7;
        this.A05 = r8;
        this.A0A = r9;
        this.A0B = r10;
        this.A06 = r11;
        this.A09 = r12;
        this.A04 = r13;
        this.A07 = r14;
        this.A0E = true;
        this.A0F = z;
    }

    public synchronized void A00(boolean z) {
        C10010dt r0 = this.A02;
        if (r0 != null) {
            ((AnonymousClass0JW) r0).A00.cancel(true);
        }
        ActivityC004602e r2 = this.A03;
        AnonymousClass00T r3 = this.A0D;
        C10010dt r1 = new C10010dt(r2, r3, this.A01, this.A04, this.A07, this.A0E, this.A0F, z);
        this.A02 = r1;
        r3.ANC(r1, new Void[0]);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0041, code lost:
        if ((r1.A01.A05() - r1.A01().getLong("payments_methods_last_sync_time", 0)) > java.util.concurrent.TimeUnit.HOURS.toMillis(1)) goto L_0x0043;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(boolean r8, boolean r9) {
        /*
            r7 = this;
            boolean r3 = r7.A0F
            if (r3 == 0) goto L_0x0010
            X.3HR r1 = new X.3HR
            r1.<init>(r7)
            r7.A00 = r1
            X.0AD r0 = r7.A09
            r0.A01(r1)
        L_0x0010:
            X.0Ae r0 = r7.A05
            boolean r0 = r0.A09()
            if (r0 != 0) goto L_0x0020
            X.0Am r0 = r7.A06
            boolean r0 = r0.A09()
            if (r0 == 0) goto L_0x0053
        L_0x0020:
            if (r9 != 0) goto L_0x0043
            X.0Ah r1 = r7.A08
            X.00S r0 = r1.A01
            long r5 = r0.A05()
            android.content.SharedPreferences r4 = r1.A01()
            r1 = 0
            java.lang.String r0 = "payments_methods_last_sync_time"
            long r0 = r4.getLong(r0, r1)
            long r5 = r5 - r0
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.HOURS
            r0 = 1
            long r1 = r2.toMillis(r0)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0049
        L_0x0043:
            X.0Fu r1 = r7.A0A
            r0 = 2
            r1.A01(r0, r7)
        L_0x0049:
            if (r3 == 0) goto L_0x0053
            if (r8 == 0) goto L_0x0053
            X.2tQ r1 = r7.A0B
            r0 = 0
            r1.A01(r0, r7)
        L_0x0053:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3HS.A01(boolean, boolean):void");
    }

    @Override // X.AbstractC63152vw
    public void ACc(boolean z) {
        ActivityC004602e r1 = this.A03;
        if (r1 instanceof AbstractC63152vw) {
            ((AbstractC63152vw) r1).ACc(z);
        }
    }

    @Override // X.AbstractC63152vw
    public void AIN(AnonymousClass1VM r3) {
        ActivityC004602e r1 = this.A03;
        if (r1 instanceof AbstractC63152vw) {
            ((AbstractC63152vw) r1).AIN(r3);
        }
    }

    @Override // X.AnonymousClass0GT
    public void AJP(C61072sS r4) {
        C018809u r2 = this.A0C;
        StringBuilder sb = new StringBuilder("getPaymentMethods/getPaymentTransactions/onRequestError. paymentNetworkError: ");
        sb.append(r4);
        r2.A04(sb.toString());
    }

    @Override // X.AnonymousClass0GT
    public void AJU(C61072sS r4) {
        C018809u r2 = this.A0C;
        StringBuilder sb = new StringBuilder("getPaymentMethods/getPaymentTransactions/onResponseError. paymentNetworkError: ");
        sb.append(r4);
        r2.A04(sb.toString());
    }

    @Override // X.AnonymousClass0GT
    public void AJV(C60982sJ r5) {
        if (r5 instanceof C68473Di) {
            this.A0C.A03("init/getMethods/onResponseSuccess");
            A00(false);
        } else if (r5 instanceof C68503Dl) {
            C018809u r2 = this.A0C;
            r2.A03("init/getTransactions/onResponseSuccess");
            C68503Dl r52 = (C68503Dl) r5;
            AnonymousClass2LZ r1 = r52.A00;
            if (r1 == null) {
                r2.A03("unexpected payment transaction result type.");
            } else if (!r1.A01 && !TextUtils.isEmpty(r1.A00)) {
                this.A0B.A01(r52.A00.A00, this);
            }
            A00(false);
        }
    }
}
