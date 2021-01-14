package X;

import com.google.android.search.verification.client.R;
import com.whatsapp.payments.ui.IndiaUpiVpaContactInfoActivity;

/* renamed from: X.3G8  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3G8 implements AbstractC60992sK {
    public final /* synthetic */ IndiaUpiVpaContactInfoActivity A00;
    public final /* synthetic */ boolean A01;

    public /* synthetic */ AnonymousClass3G8(IndiaUpiVpaContactInfoActivity indiaUpiVpaContactInfoActivity, boolean z) {
        this.A00 = indiaUpiVpaContactInfoActivity;
        this.A01 = z;
    }

    @Override // X.AbstractC60992sK
    public final void AJZ(C61072sS r6) {
        IndiaUpiVpaContactInfoActivity indiaUpiVpaContactInfoActivity = this.A00;
        boolean z = this.A01;
        if (r6 == null) {
            indiaUpiVpaContactInfoActivity.A0R(z);
        } else if (z) {
            indiaUpiVpaContactInfoActivity.APo(R.string.block_upi_id_error);
        } else {
            indiaUpiVpaContactInfoActivity.APq(0, R.string.unblock_payment_id_error_default, ((AnonymousClass2C0) indiaUpiVpaContactInfoActivity).A01.A06(R.string.india_upi_payment_id_name));
        }
    }
}
