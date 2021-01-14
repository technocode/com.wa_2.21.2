package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.whatsapp.StopLiveLocationDialogFragment;

/* renamed from: X.2Zt  reason: invalid class name and case insensitive filesystem */
public class C51702Zt extends AbstractView$OnClickListenerC08330av {
    public final /* synthetic */ C59142n9 A00;
    public final /* synthetic */ C02850Ds A01;

    public C51702Zt(C59142n9 r1, C02850Ds r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    @Override // X.AbstractView$OnClickListenerC08330av
    public void A00(View view) {
        C007303n r1 = this.A01.A0n;
        AnonymousClass02N r6 = r1.A00;
        if (r6 == null) {
            throw null;
        } else if (r1.A02) {
            String str = r1.A01;
            StopLiveLocationDialogFragment stopLiveLocationDialogFragment = new StopLiveLocationDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putString("jid", r6.getRawString());
            bundle.putString("id", str);
            stopLiveLocationDialogFragment.A0N(bundle);
            ((ActivityC004702f) this.A00.getContext()).APm(stopLiveLocationDialogFragment);
        } else {
            C59142n9 r0 = this.A00;
            C02770Dj r2 = ((AnonymousClass2I2) r0).A0W;
            if (r2 != null) {
                Context context = r0.getContext();
                if (r6 != null) {
                    r2.A08(context, r6, null);
                    return;
                }
                throw null;
            }
            throw null;
        }
    }
}
