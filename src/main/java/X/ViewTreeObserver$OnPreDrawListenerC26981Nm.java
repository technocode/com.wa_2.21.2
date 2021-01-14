package X;

import android.view.ViewTreeObserver;
import com.whatsapp.StatusPrivacyActivity;

/* renamed from: X.1Nm  reason: invalid class name and case insensitive filesystem */
public class ViewTreeObserver$OnPreDrawListenerC26981Nm implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ StatusPrivacyActivity A00;

    public ViewTreeObserver$OnPreDrawListenerC26981Nm(StatusPrivacyActivity statusPrivacyActivity) {
        this.A00 = statusPrivacyActivity;
    }

    public boolean onPreDraw() {
        StatusPrivacyActivity statusPrivacyActivity = this.A00;
        statusPrivacyActivity.A05.getViewTreeObserver().removeOnPreDrawListener(this);
        if (statusPrivacyActivity.A05.canScrollVertically(1)) {
            statusPrivacyActivity.A01.setElevation((float) statusPrivacyActivity.A00);
            return false;
        }
        statusPrivacyActivity.A01.setElevation(0.0f);
        return false;
    }
}
