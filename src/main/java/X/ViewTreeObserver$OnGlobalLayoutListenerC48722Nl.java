package X;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;
import com.google.android.search.verification.client.R;
import com.whatsapp.ephemeral.EphemeralNUXDialog;

/* renamed from: X.2Nl  reason: invalid class name and case insensitive filesystem */
public class ViewTreeObserver$OnGlobalLayoutListenerC48722Nl implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ EphemeralNUXDialog A00;

    public ViewTreeObserver$OnGlobalLayoutListenerC48722Nl(EphemeralNUXDialog ephemeralNUXDialog) {
        this.A00 = ephemeralNUXDialog;
    }

    public void onGlobalLayout() {
        EphemeralNUXDialog ephemeralNUXDialog = this.A00;
        ScrollView scrollView = ephemeralNUXDialog.A01;
        View childAt = scrollView.getChildAt(0);
        if (childAt != null) {
            int height = childAt.getHeight();
            if (scrollView.getHeight() < scrollView.getPaddingBottom() + scrollView.getPaddingTop() + height) {
                ephemeralNUXDialog.A00.setElevation(ephemeralNUXDialog.A02().getDimension(R.dimen.ephemeral_nux_buttons_elevation));
                ephemeralNUXDialog.A01.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            }
        }
        ephemeralNUXDialog.A00.setElevation(0.0f);
        ephemeralNUXDialog.A01.getViewTreeObserver().removeGlobalOnLayoutListener(this);
    }
}
