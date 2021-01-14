package X;

import android.app.Activity;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;

/* renamed from: X.3DX  reason: invalid class name */
public class AnonymousClass3DX {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C449222e A01;
    public final /* synthetic */ AbstractC60992sK A02;

    public AnonymousClass3DX(C449222e r1, Activity activity, AbstractC60992sK r3) {
        this.A01 = r1;
        this.A00 = activity;
        this.A02 = r3;
    }

    public void A00(boolean z, C61072sS r8) {
        String A0D;
        StringBuilder sb = new StringBuilder("PAY: IndiaUpiBlockListManager/on-error blocked: ");
        sb.append(z);
        sb.append(" error: ");
        sb.append(r8);
        Log.e(sb.toString());
        C449222e r2 = this.A01;
        AnonymousClass02M r5 = r2.A02;
        Activity activity = this.A00;
        r5.A08((AbstractC004502c) activity);
        if (!activity.isFinishing()) {
            if (z) {
                A0D = r2.A06.A06(R.string.block_upi_id_error);
            } else {
                AnonymousClass01X r3 = r2.A06;
                A0D = r3.A0D(R.string.unblock_payment_id_error_default, r3.A06(R.string.india_upi_payment_id_name));
            }
            r5.A0G(A0D, 0);
        }
        AbstractC60992sK r0 = this.A02;
        if (r0 != null) {
            r0.AJZ(r8);
        }
    }
}
