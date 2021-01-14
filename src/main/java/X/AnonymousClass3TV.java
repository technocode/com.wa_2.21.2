package X;

import android.graphics.Bitmap;
import com.google.android.search.verification.client.R;
import com.whatsapp.voipcalling.CallLogActivity;

/* renamed from: X.3TV  reason: invalid class name */
public class AnonymousClass3TV extends AnonymousClass0JW {
    public final /* synthetic */ CallLogActivity A00;

    public AnonymousClass3TV(CallLogActivity callLogActivity) {
        this.A00 = callLogActivity;
    }

    @Override // X.AnonymousClass0JW
    public Object A02(Object[] objArr) {
        CallLogActivity callLogActivity = this.A00;
        Bitmap A02 = callLogActivity.A0G.A02(callLogActivity.A05, callLogActivity.getResources().getDimensionPixelSize(R.dimen.mid_avatar_size), callLogActivity.getResources().getDimension(R.dimen.mid_avatar_radius), false);
        if (super.A00.isCancelled()) {
            return null;
        }
        AnonymousClass02M r2 = ((ActivityC004702f) callLogActivity).A0F;
        r2.A02.post(new RunnableEBaseShape9S0200000_I1_4(this, A02, 29));
        return null;
    }
}
