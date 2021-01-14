package X;

import android.view.ViewTreeObserver;
import androidx.appcompat.widget.AppCompatSpinner;

/* renamed from: X.0jo  reason: invalid class name and case insensitive filesystem */
public class ViewTreeObserver$OnGlobalLayoutListenerC13200jo implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ AppCompatSpinner A00;

    public ViewTreeObserver$OnGlobalLayoutListenerC13200jo(AppCompatSpinner appCompatSpinner) {
        this.A00 = appCompatSpinner;
    }

    public void onGlobalLayout() {
        AppCompatSpinner appCompatSpinner = this.A00;
        if (!appCompatSpinner.A02.ABa()) {
            appCompatSpinner.A01();
        }
        ViewTreeObserver viewTreeObserver = appCompatSpinner.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        }
    }
}
