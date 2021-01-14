package X;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: X.3XS  reason: invalid class name */
public class AnonymousClass3XS extends AbstractC68463Dh {
    public final /* synthetic */ AnonymousClass0GT A00;
    public final /* synthetic */ C03340Fu A01;
    public final /* synthetic */ String A02 = "tos_no_wallet";
    public final /* synthetic */ String A03 = "tos_merchant";
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3XS(C03340Fu r3, Context context, AnonymousClass02M r5, AnonymousClass04j r6, AnonymousClass0GP r7, AnonymousClass0GT r8, boolean z, boolean z2) {
        super(context, r5, r6, r7);
        this.A01 = r3;
        this.A00 = r8;
        this.A04 = z;
        this.A05 = z2;
    }

    @Override // X.AbstractC68463Dh
    public void A01(C61072sS r4) {
        C018809u r2 = this.A01.A0G;
        StringBuilder sb = new StringBuilder("TosV2 onRequestError: ");
        sb.append(r4);
        r2.A04(sb.toString());
        this.A00.AJP(r4);
    }

    @Override // X.AbstractC68463Dh
    public void A02(C61072sS r4) {
        C018809u r2 = this.A01.A0G;
        StringBuilder sb = new StringBuilder("TosV2 onResponseError: ");
        sb.append(r4);
        r2.A04(sb.toString());
        this.A00.AJU(r4);
    }

    @Override // X.AbstractC68463Dh
    public void A03(AnonymousClass0M5 r9) {
        AnonymousClass0M5 A0D = r9.A0D("accept_pay");
        C68443Df r3 = new C68443Df();
        boolean z = false;
        if (A0D != null) {
            String A0G = A0D.A0G("consumer", null);
            String A0G2 = A0D.A0G("merchant", null);
            if ((!this.A04 || "1".equals(A0G)) && (!this.A05 || "1".equals(A0G2))) {
                z = true;
            }
            r3.A02 = z;
            r3.A00 = "1".equals(A0D.A0G("outage", null));
            r3.A01 = "1".equals(A0D.A0G("sandbox", null));
            if (!TextUtils.isEmpty(A0G)) {
                String str = this.A02;
                if (!TextUtils.isEmpty(str)) {
                    C01980Ae r2 = this.A01.A08;
                    C02000Ag A012 = r2.A01(str);
                    if ("1".equals(A0G)) {
                        r2.A05(A012);
                    } else {
                        r2.A04(A012);
                    }
                }
            }
            if (!TextUtils.isEmpty(A0G2)) {
                String str2 = this.A03;
                if (!TextUtils.isEmpty(str2)) {
                    C02060Am r22 = this.A01.A0B;
                    C02000Ag A013 = r22.A01(str2);
                    if ("1".equals(A0G2)) {
                        r22.A05(A013);
                    } else {
                        r22.A04(A013);
                    }
                }
            }
            this.A01.A0C.A06(r3.A01);
        } else {
            r3.A02 = false;
        }
        this.A00.AJV(r3);
    }
}
