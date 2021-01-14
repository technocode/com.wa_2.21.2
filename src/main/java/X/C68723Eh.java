package X;

import android.content.Context;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.payments.ui.PaymentBottomSheet;
import com.whatsapp.payments.ui.widget.MandatePaymentBottomSheetFragment;

/* renamed from: X.3Eh  reason: invalid class name and case insensitive filesystem */
public class C68723Eh implements AbstractC61102sV {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass0MH A01;
    public final /* synthetic */ AbstractC61092sU A02;
    public final /* synthetic */ C68733Ei A03;
    public final /* synthetic */ boolean A04;

    public C68723Eh(C68733Ei r1, boolean z, Context context, AbstractC61092sU r4, AnonymousClass0MH r5) {
        this.A03 = r1;
        this.A04 = z;
        this.A00 = context;
        this.A02 = r4;
        this.A01 = r5;
    }

    @Override // X.AbstractC61102sV
    public void AFq() {
        this.A03.A06.A01(this.A00, this.A01);
    }

    @Override // X.AbstractC61102sV
    public void AKf() {
        if (this.A04) {
            C68733Ei r4 = this.A03;
            Context context = this.A00;
            AbstractC61092sU r3 = this.A02;
            AnonymousClass0MH r2 = this.A01;
            AnonymousClass02M r7 = r4.A00;
            r7.A05(0, R.string.register_wait_message);
            new AnonymousClass3EC(context, r7, new C61082sT(), r4.A0B, r4.A02, r4.A08, r4.A05).A01(r2, null, new C68713Eg(r4, r2, r3));
            return;
        }
        Context A0O = C002001d.A0O(this.A00);
        if (A0O instanceof ActivityC004702f) {
            PaymentBottomSheet paymentBottomSheet = new PaymentBottomSheet();
            AnonymousClass0MH r32 = this.A01;
            MandatePaymentBottomSheetFragment mandatePaymentBottomSheetFragment = new MandatePaymentBottomSheetFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("transaction", r32);
            mandatePaymentBottomSheetFragment.A0N(bundle);
            paymentBottomSheet.A01 = mandatePaymentBottomSheetFragment;
            ((ActivityC004702f) A0O).APl(paymentBottomSheet, "MandatePaymentBottomSheetFragment");
        }
    }
}
