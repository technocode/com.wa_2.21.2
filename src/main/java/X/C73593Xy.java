package X;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: X.3Xy  reason: invalid class name and case insensitive filesystem */
public class C73593Xy extends AbstractC68463Dh {
    public final /* synthetic */ AnonymousClass0GT A00;
    public final /* synthetic */ C61592tQ A01;
    public final /* synthetic */ C007303n A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73593Xy(C61592tQ r1, Context context, AnonymousClass02M r3, AnonymousClass04j r4, AnonymousClass0GP r5, AnonymousClass0GT r6, C007303n r7) {
        super(context, r3, r4, r5);
        this.A01 = r1;
        this.A00 = r6;
        this.A02 = r7;
    }

    @Override // X.AbstractC68463Dh
    public void A01(C61072sS r2) {
        AnonymousClass0GT r0 = this.A00;
        if (r0 != null) {
            r0.AJP(r2);
        }
    }

    @Override // X.AbstractC68463Dh
    public void A02(C61072sS r2) {
        AnonymousClass0GT r0 = this.A00;
        if (r0 != null) {
            r0.AJU(r2);
        }
    }

    @Override // X.AbstractC68463Dh
    public void A03(AnonymousClass0M5 r16) {
        C05900Qy r8;
        AnonymousClass0MH r0;
        try {
            AnonymousClass0M5 A0E = r16.A0E("account").A0E("pay");
            String A0F = A0E.A0F("currency");
            String A0F2 = A0E.A0F("amount");
            AbstractC05890Qx A012 = AnonymousClass1VK.A01(A0F);
            if (!TextUtils.isEmpty(A0F2)) {
                r8 = C05900Qy.A00(A0F2, A012.A5z());
            } else {
                r8 = null;
            }
            AnonymousClass01K r1 = this.A01.A03;
            AbstractC007503q A05 = r1.A0J.A05(this.A02);
            if (A05 == null || (r0 = A05.A0F) == null) {
                C61072sS r12 = new C61072sS();
                AnonymousClass0GT r02 = this.A00;
                if (r02 != null) {
                    r02.AJU(r12);
                    return;
                }
                return;
            }
            AnonymousClass0MH A022 = AnonymousClass0MH.A02(3, 0, r0.A0A, r0.A09, A0F, r8, r0.A04, null, r0.A0C, r0.A03, r0.A00);
            A022.A0D(A05.A0F.A0G);
            r1.A0I(A05.A0n, A022);
            AnonymousClass0GT r13 = this.A00;
            if (r13 != null) {
                r13.AJV(new C60982sJ());
            }
        } catch (AnonymousClass1XC unused) {
            C61072sS r14 = new C61072sS();
            AnonymousClass0GT r03 = this.A00;
            if (r03 != null) {
                r03.AJU(r14);
            }
        }
    }
}
