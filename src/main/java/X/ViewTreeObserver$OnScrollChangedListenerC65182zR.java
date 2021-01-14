package X;

import android.view.ViewTreeObserver;
import com.whatsapp.registration.RegistrationScrollView;

/* renamed from: X.2zR  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class ViewTreeObserver$OnScrollChangedListenerC65182zR implements ViewTreeObserver.OnScrollChangedListener {
    public final /* synthetic */ RegistrationScrollView A00;

    public /* synthetic */ ViewTreeObserver$OnScrollChangedListenerC65182zR(RegistrationScrollView registrationScrollView) {
        this.A00 = registrationScrollView;
    }

    public final void onScrollChanged() {
        RegistrationScrollView registrationScrollView = this.A00;
        boolean canScrollVertically = registrationScrollView.canScrollVertically(1);
        if (registrationScrollView.canScrollVertically(-1) || canScrollVertically) {
            int bottom = registrationScrollView.getChildAt(registrationScrollView.getChildCount() - 1).getBottom();
            int height = registrationScrollView.getHeight();
            int scrollY = registrationScrollView.getScrollY();
            float height2 = (float) (registrationScrollView.getChildAt(0).getHeight() - height);
            registrationScrollView.A00(((float) scrollY) / height2, false, registrationScrollView.A03, registrationScrollView.A04, registrationScrollView.A01, registrationScrollView.A00);
            registrationScrollView.A00(((float) (bottom - (height + scrollY))) / height2, true, registrationScrollView.A03, registrationScrollView.A04, registrationScrollView.A01, registrationScrollView.A00);
        }
    }
}
