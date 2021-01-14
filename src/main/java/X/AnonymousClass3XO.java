package X;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: X.3XO  reason: invalid class name */
public class AnonymousClass3XO extends AbstractC68463Dh {
    public final /* synthetic */ AnonymousClass0GT A00;
    public final /* synthetic */ C03340Fu A01;
    public final /* synthetic */ C62082uD A02;
    public final /* synthetic */ String A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3XO(C03340Fu r1, Context context, AnonymousClass02M r3, AnonymousClass04j r4, AnonymousClass0GP r5, AnonymousClass0GT r6, String str, C62082uD r8) {
        super(context, r3, r4, r5);
        this.A01 = r1;
        this.A00 = r6;
        this.A03 = str;
        this.A02 = r8;
    }

    @Override // X.AbstractC68463Dh
    public void A01(C61072sS r5) {
        C03340Fu r3 = this.A01;
        C018809u r2 = r3.A0G;
        StringBuilder sb = new StringBuilder("get-methods: on-request-error=");
        sb.append(r5);
        r2.A04(sb.toString());
        AbstractC61782tj A6O = r3.A0F.A03().A6O();
        if (A6O != null) {
            A6O.AGT(r5);
        }
        AnonymousClass0GT r0 = this.A00;
        if (r0 != null) {
            r0.AJP(r5);
        }
    }

    @Override // X.AbstractC68463Dh
    public void A02(C61072sS r5) {
        C03340Fu r3 = this.A01;
        C018809u r2 = r3.A0G;
        StringBuilder sb = new StringBuilder("get-methods: on-response-error=");
        sb.append(r5);
        r2.A04(sb.toString());
        AbstractC61782tj A6O = r3.A0F.A03().A6O();
        if (A6O != null) {
            A6O.AGT(r5);
        }
        AnonymousClass0GT r0 = this.A00;
        if (r0 != null) {
            r0.AJU(r5);
        }
    }

    @Override // X.AbstractC68463Dh
    public void A03(AnonymousClass0M5 r7) {
        String str;
        C03340Fu r1 = this.A01;
        r1.A0G.A05("get-methods: on-response-success");
        C01970Ad r4 = r1.A0F;
        AbstractC61782tj A6O = r4.A03().A6O();
        AnonymousClass3DJ r2 = null;
        String str2 = null;
        if (A6O != null) {
            A6O.AGT(null);
        }
        AnonymousClass0M5 A0D = r7.A0D("account");
        AnonymousClass0OS A0A = A0D.A0A("instance-id");
        if (A0A != null) {
            str = A0A.A03;
            if (str != null && str.equals(this.A03)) {
                AnonymousClass0OS A0A2 = A0D.A0A("wa-support-phone-number");
                if (A0A2 != null) {
                    str2 = A0A2.A03;
                }
                if (!TextUtils.isEmpty(str2)) {
                    AnonymousClass008.A0q(r1.A0C, "payments_support_phone_number", str2);
                }
                AnonymousClass0GT r22 = this.A00;
                if (r22 != null) {
                    C68473Di r12 = new C68473Di();
                    r4.A04();
                    r12.A00 = r4.A06.A09();
                    r22.AJV(r12);
                    return;
                }
                return;
            }
        } else {
            str = null;
        }
        C018709t.A04(r1.A0J.A05(A0D));
        r1.A0E.A01();
        AnonymousClass0GT r0 = this.A00;
        if (r0 != null) {
            r2 = new AnonymousClass3DJ(r0);
        }
        r1.A02(r2, r7, false);
        C62062uB r13 = r1.A0H;
        C62082uD r02 = this.A02;
        if (str == null) {
            str = "";
        }
        r13.A00(r02, str);
    }
}
