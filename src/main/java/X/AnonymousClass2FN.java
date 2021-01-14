package X;

import android.view.View;
import android.view.ViewTreeObserver;
import com.whatsapp.companiondevice.optin.OptInActivity;

/* renamed from: X.2FN  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2FN implements ViewTreeObserver.OnScrollChangedListener {
    public final /* synthetic */ OptInActivity A00;

    public /* synthetic */ AnonymousClass2FN(OptInActivity optInActivity) {
        this.A00 = optInActivity;
    }

    public final void onScrollChanged() {
        OptInActivity optInActivity = this.A00;
        boolean z = !(!optInActivity.A03.canScrollVertically(1));
        View view = optInActivity.A02;
        int i = 4;
        if (z) {
            i = 0;
        }
        view.setVisibility(i);
    }
}
