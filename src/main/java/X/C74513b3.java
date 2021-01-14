package X;

import android.content.Context;

/* renamed from: X.3b3  reason: invalid class name and case insensitive filesystem */
public class C74513b3 extends C73483Xm {
    public final /* synthetic */ AnonymousClass3DX A00;
    public final /* synthetic */ AnonymousClass3E8 A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74513b3(AnonymousClass3E8 r9, Context context, AnonymousClass02M r11, AnonymousClass04j r12, AnonymousClass0GP r13, C61082sT r14, String str, AnonymousClass3DX r16, boolean z, String str2) {
        super(context, r11, r12, r13, r14, str);
        this.A01 = r9;
        this.A00 = r16;
        this.A03 = z;
        this.A02 = str2;
    }

    @Override // X.AbstractC68463Dh, X.C73483Xm
    public void A01(C61072sS r3) {
        super.A01(r3);
        AnonymousClass3DX r1 = this.A00;
        if (r1 != null) {
            r1.A00(this.A03, r3);
        }
    }

    @Override // X.AbstractC68463Dh, X.C73483Xm
    public void A02(C61072sS r3) {
        super.A02(r3);
        AnonymousClass3DX r1 = this.A00;
        if (r1 != null) {
            r1.A00(this.A03, r3);
        }
    }

    @Override // X.AbstractC68463Dh, X.C73483Xm
    public void A03(AnonymousClass0M5 r5) {
        super.A03(r5);
        C449222e r2 = this.A01.A03;
        String str = this.A02;
        boolean z = this.A03;
        r2.A02(str, z);
        AnonymousClass3DX r3 = this.A00;
        if (r3 != null) {
            AnonymousClass008.A1H("PAY: IndiaUpiBlockListManager/on-success blocked: ", z);
            r3.A01.A02.A08((AbstractC004502c) r3.A00);
            AbstractC60992sK r0 = r3.A02;
            if (r0 != null) {
                r0.AJZ(null);
            }
        }
    }
}
