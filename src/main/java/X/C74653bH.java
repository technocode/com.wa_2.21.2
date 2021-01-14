package X;

import android.content.Context;
import java.util.AbstractCollection;
import java.util.List;

/* renamed from: X.3bH  reason: invalid class name and case insensitive filesystem */
public class C74653bH extends C73483Xm {
    public final /* synthetic */ AnonymousClass3EL A00;
    public final /* synthetic */ AbstractC62022u7 A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74653bH(AnonymousClass3EL r8, Context context, AnonymousClass02M r10, AnonymousClass04j r11, AnonymousClass0GP r12, C61082sT r13, AbstractC62022u7 r14) {
        super(context, r10, r11, r12, r13, "upi-set-mpin");
        this.A00 = r8;
        this.A01 = r14;
    }

    @Override // X.AbstractC68463Dh, X.C73483Xm
    public void A01(C61072sS r2) {
        super.A01(r2);
        AbstractC61462tD r0 = this.A00.A00;
        if (r0 != null) {
            r0.AK1(r2);
        }
    }

    @Override // X.AbstractC68463Dh, X.C73483Xm
    public void A02(C61072sS r2) {
        super.A02(r2);
        AbstractC61462tD r0 = this.A00.A00;
        if (r0 != null) {
            r0.AK1(r2);
        }
    }

    @Override // X.AbstractC68463Dh, X.C73483Xm
    public void A03(AnonymousClass0M5 r6) {
        super.A03(r6);
        AnonymousClass3EL r4 = this.A00;
        C01980Ae r3 = r4.A06;
        List A02 = r3.A02();
        C02000Ag A012 = r3.A01("2fa");
        if (!((AbstractCollection) A02).contains(A012)) {
            r3.A05(A012);
        }
        this.A01.AC1();
        AbstractC61462tD r1 = r4.A00;
        if (r1 != null) {
            r1.AK1(null);
        }
    }
}
