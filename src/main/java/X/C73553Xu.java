package X;

import android.content.Context;

/* renamed from: X.3Xu  reason: invalid class name and case insensitive filesystem */
public class C73553Xu extends AbstractC68463Dh {
    public final /* synthetic */ AbstractC61522tJ A00;
    public final /* synthetic */ C61532tK A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73553Xu(C61532tK r1, Context context, AnonymousClass02M r3, AnonymousClass04j r4, AnonymousClass0GP r5, String str, AbstractC61522tJ r7, String str2) {
        super(context, r3, r4, r5);
        this.A01 = r1;
        this.A02 = str;
        this.A00 = r7;
        this.A03 = str2;
    }

    @Override // X.AbstractC68463Dh
    public void A01(C61072sS r4) {
        C018809u r2 = this.A01.A06;
        StringBuilder A0S = AnonymousClass008.A0S("PaymentKycAction ");
        A0S.append(this.A02);
        A0S.append(": onRequestError: ");
        A0S.append(r4);
        r2.A04(A0S.toString());
        AbstractC61522tJ r0 = this.A00;
        if (r0 != null) {
            r0.AGx(r4);
        }
    }

    @Override // X.AbstractC68463Dh
    public void A02(C61072sS r4) {
        C018809u r2 = this.A01.A06;
        StringBuilder A0S = AnonymousClass008.A0S("PaymentKycAction ");
        A0S.append(this.A02);
        A0S.append(": onResponseError: ");
        A0S.append(r4);
        r2.A04(A0S.toString());
        AbstractC61522tJ r0 = this.A00;
        if (r0 != null) {
            r0.AGx(r4);
        }
    }

    @Override // X.AbstractC68463Dh
    public void A03(AnonymousClass0M5 r6) {
        AnonymousClass0M5 A0D = r6.A0D("account");
        if (A0D == null) {
            C018809u r2 = this.A01.A06;
            StringBuilder A0S = AnonymousClass008.A0S("PaymentKycAction ");
            A0S.append(this.A02);
            A0S.append(": onResponseSuccess: missing account node");
            r2.A04(A0S.toString());
            AbstractC61522tJ r1 = this.A00;
            if (r1 != null) {
                r1.AGx(new C61072sS());
                return;
            }
            return;
        }
        C61072sS A002 = C61072sS.A00(A0D);
        if (A002 != null) {
            C61532tK r3 = this.A01;
            C018809u r22 = r3.A06;
            StringBuilder A0S2 = AnonymousClass008.A0S("PaymentKycAction ");
            A0S2.append(this.A02);
            A0S2.append(": onResponseSuccess: account-node error: ");
            A0S2.append(A002);
            r22.A04(A0S2.toString());
            if (A002.code == 1448) {
                r3.A05.A04(this.A03, "KYC", A002);
            }
            AbstractC61522tJ r0 = this.A00;
            if (r0 != null) {
                r0.AGx(A002);
                return;
            }
            return;
        }
        AnonymousClass1VL A003 = AnonymousClass1VL.A00(A0D);
        if (A003 != null) {
            AbstractC61522tJ r02 = this.A00;
            if (r02 != null) {
                r02.AGy(A003);
                return;
            }
            return;
        }
        this.A01.A06.A04("PaymentKycAction/createCallback PaymentKycInfo is null");
        AbstractC61522tJ r12 = this.A00;
        if (r12 != null) {
            r12.AGx(new C61072sS());
        }
    }
}
