package X;

import android.content.Context;
import android.text.TextUtils;
import com.whatsapp.util.Log;

/* renamed from: X.3bG  reason: invalid class name and case insensitive filesystem */
public class C74643bG extends C73483Xm {
    public final /* synthetic */ AnonymousClass3EL A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74643bG(AnonymousClass3EL r8, Context context, AnonymousClass02M r10, AnonymousClass04j r11, AnonymousClass0GP r12, C61082sT r13) {
        super(context, r10, r11, r12, r13, "upi-list-keys");
        this.A00 = r8;
    }

    @Override // X.AbstractC68463Dh, X.C73483Xm
    public void A01(C61072sS r3) {
        super.A01(r3);
        AbstractC61462tD r1 = this.A00.A00;
        if (r1 != null) {
            r1.AH0(null, r3);
        }
    }

    @Override // X.AbstractC68463Dh, X.C73483Xm
    public void A02(C61072sS r3) {
        super.A02(r3);
        AbstractC61462tD r1 = this.A00.A00;
        if (r1 != null) {
            r1.AH0(null, r3);
        }
    }

    @Override // X.AbstractC68463Dh, X.C73483Xm
    public void A03(AnonymousClass0M5 r5) {
        String str;
        super.A03(r5);
        AnonymousClass0M5 A0D = r5.A0D("account");
        if (A0D == null) {
            Log.w("PAY: IndiaUpiPinActions sendGetListKeys: empty account node");
            AbstractC61462tD r1 = this.A00.A00;
            if (r1 != null) {
                r1.AH0(null, new C61072sS());
                return;
            }
            return;
        }
        AnonymousClass0OS A0A = A0D.A0A("keys");
        if (A0A != null) {
            str = A0A.A03;
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            Log.w("PAY: IndiaUpiPinActions sendGetListKeys: missing keys");
            AbstractC61462tD r12 = this.A00.A00;
            if (r12 != null) {
                r12.AH0(null, new C61072sS());
                return;
            }
            return;
        }
        AnonymousClass3EL r13 = this.A00;
        r13.A05.A0D(str);
        AbstractC61462tD r0 = r13.A00;
        if (r0 != null) {
            r0.AH0(str, null);
        }
    }
}
