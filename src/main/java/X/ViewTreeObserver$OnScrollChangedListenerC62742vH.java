package X;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.search.verification.client.R;
import com.whatsapp.payments.ui.IndiaUpiSecureQrCodeDisplayActivity;

/* renamed from: X.2vH  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class ViewTreeObserver$OnScrollChangedListenerC62742vH implements ViewTreeObserver.OnScrollChangedListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ AnonymousClass0S2 A01;
    public final /* synthetic */ IndiaUpiSecureQrCodeDisplayActivity A02;

    public /* synthetic */ ViewTreeObserver$OnScrollChangedListenerC62742vH(IndiaUpiSecureQrCodeDisplayActivity indiaUpiSecureQrCodeDisplayActivity, View view, AnonymousClass0S2 r3) {
        this.A02 = indiaUpiSecureQrCodeDisplayActivity;
        this.A00 = view;
        this.A01 = r3;
    }

    public final void onScrollChanged() {
        IndiaUpiSecureQrCodeDisplayActivity indiaUpiSecureQrCodeDisplayActivity = this.A02;
        View view = this.A00;
        AnonymousClass0S2 r2 = this.A01;
        if (view.canScrollVertically(-1)) {
            r2.A02(indiaUpiSecureQrCodeDisplayActivity.getResources().getDimension(R.dimen.actionbar_elevation));
        } else {
            r2.A02(0.0f);
        }
    }
}
