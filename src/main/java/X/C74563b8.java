package X;

import android.content.Context;

/* renamed from: X.3b8  reason: invalid class name and case insensitive filesystem */
public class C74563b8 extends C73483Xm {
    public final /* synthetic */ AbstractC61382t5 A00;
    public final /* synthetic */ AnonymousClass3EB A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74563b8(AnonymousClass3EB r8, Context context, AnonymousClass02M r10, AnonymousClass04j r11, AnonymousClass0GP r12, C61082sT r13, AbstractC61382t5 r14) {
        super(context, r10, r11, r12, r13, "upi-get-vpa");
        this.A01 = r8;
        this.A00 = r14;
    }

    @Override // X.AbstractC68463Dh, X.C73483Xm
    public void A01(C61072sS r3) {
        super.A01(r3);
        this.A01.A07.ABo(8, r3);
        AbstractC61382t5 r0 = this.A00;
        if (r0 != null) {
            r0.AFb(r3);
        }
    }

    @Override // X.AbstractC68463Dh, X.C73483Xm
    public void A02(C61072sS r3) {
        super.A02(r3);
        this.A01.A07.ABo(8, r3);
        AbstractC61382t5 r1 = this.A00;
        if (r1 != null) {
            r1.AFb(new C61072sS());
        }
    }

    @Override // X.AbstractC68463Dh, X.C73483Xm
    public void A03(AnonymousClass0M5 r7) {
        super.A03(r7);
        AnonymousClass3EB r3 = this.A01;
        r3.A07.ABo(8, null);
        AnonymousClass0M5 A0D = r7.A0D("account");
        if (A0D == null) {
            AbstractC61382t5 r1 = this.A00;
            if (r1 != null) {
                r1.AFb(new C61072sS());
                return;
            }
            return;
        }
        AnonymousClass0RM r4 = new AnonymousClass0RM();
        r4.A01(0, A0D);
        if (((AnonymousClass0RK) r4).A02 == null) {
            AbstractC61382t5 r12 = this.A00;
            if (r12 != null) {
                r12.AFb(new C61072sS());
                return;
            }
            return;
        }
        if (!r4.A03) {
            AnonymousClass1V4 A012 = r3.A06.A01();
            A012.A03.ANC(new C10630ew(A012, r4), new Void[0]);
        } else {
            AnonymousClass1V4 A013 = r3.A06.A01();
            A013.A03.ANC(new C10620ev(A013, ((AnonymousClass0RK) r4).A02), new Void[0]);
        }
        AbstractC61382t5 r0 = this.A00;
        if (r0 != null) {
            r0.AEc(r4);
        }
    }
}
