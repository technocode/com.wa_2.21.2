package X;

import android.view.ViewTreeObserver;
import com.whatsapp.TosUpdateActivity;

/* renamed from: X.1Ik  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class ViewTreeObserver$OnScrollChangedListenerC25811Ik implements ViewTreeObserver.OnScrollChangedListener {
    public final /* synthetic */ TosUpdateActivity A00;

    public /* synthetic */ ViewTreeObserver$OnScrollChangedListenerC25811Ik(TosUpdateActivity tosUpdateActivity) {
        this.A00 = tosUpdateActivity;
    }

    public final void onScrollChanged() {
        TosUpdateActivity tosUpdateActivity = this.A00;
        if (tosUpdateActivity.A02.getVisibility() != 8) {
            tosUpdateActivity.A02.startAnimation(AnonymousClass008.A02(1.0f, 0.0f, 200));
            tosUpdateActivity.A02.setVisibility(8);
        }
    }
}
