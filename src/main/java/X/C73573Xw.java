package X;

import android.content.Context;

/* renamed from: X.3Xw  reason: invalid class name and case insensitive filesystem */
public class C73573Xw extends AbstractC68463Dh {
    public final /* synthetic */ AbstractC61562tN A00;
    public final /* synthetic */ C61572tO A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73573Xw(C61572tO r1, Context context, AnonymousClass02M r3, AnonymousClass04j r4, AnonymousClass0GP r5, AbstractC61562tN r6) {
        super(context, r3, r4, r5);
        this.A01 = r1;
        this.A00 = r6;
    }

    @Override // X.AbstractC68463Dh
    public void A01(C61072sS r4) {
        C018809u r2 = this.A01.A06;
        StringBuilder A0S = AnonymousClass008.A0S("providerKey: onRequestError ");
        A0S.append(r4.code);
        r2.A04(A0S.toString());
        this.A00.AFb(r4);
    }

    @Override // X.AbstractC68463Dh
    public void A02(C61072sS r4) {
        C018809u r2 = this.A01.A06;
        StringBuilder A0S = AnonymousClass008.A0S("providerKey: onResponseError ");
        A0S.append(r4.code);
        r2.A04(A0S.toString());
        this.A00.AFb(r4);
    }

    @Override // X.AbstractC68463Dh
    public void A03(AnonymousClass0M5 r6) {
        try {
            AnonymousClass0M5 A0E = r6.A0E("account").A0E("key");
            C61572tO r0 = this.A01;
            C61762th r4 = r0.A05;
            C68653Ea A012 = r4.A01(A0E);
            C018809u r2 = r0.A06;
            StringBuilder sb = new StringBuilder();
            sb.append("providerKey/onSuccess: isValidSignature=");
            boolean z = false;
            if (A012 != null) {
                z = true;
            }
            sb.append(z);
            r2.A05(sb.toString());
            if (A012 != null) {
                r4.A03(A012);
                this.A00.AJa(A012);
                return;
            }
            r2.A04("providerKey/onSuccess signature is not valid");
            this.A00.AFb(new C61072sS(8));
        } catch (AnonymousClass1XC e) {
            this.A01.A06.A08("providerKey/parseResponse failed: ", e);
            this.A00.AFb(new C61072sS(9));
        }
    }
}
