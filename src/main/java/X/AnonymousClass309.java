package X;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.search.verification.client.R;
import com.whatsapp.registration.EULA;

/* renamed from: X.309  reason: invalid class name */
public class AnonymousClass309 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ EULA A00;

    public AnonymousClass309(EULA eula) {
        this.A00 = eula;
    }

    public void onGlobalLayout() {
        EULA eula = this.A00;
        View view = eula.A01;
        if (view != null) {
            view.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            if (eula.A01.getHeight() < eula.getResources().getDimensionPixelSize(R.dimen.registration_eula_logo_min_height)) {
                eula.A01.setVisibility(8);
            }
        }
    }
}
