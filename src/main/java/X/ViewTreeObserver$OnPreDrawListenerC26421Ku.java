package X;

import android.view.ViewTreeObserver;
import com.whatsapp.SelectionCheckView;

/* renamed from: X.1Ku  reason: invalid class name and case insensitive filesystem */
public class ViewTreeObserver$OnPreDrawListenerC26421Ku implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ C26431Kv A00;
    public final /* synthetic */ C26451Kx A01;
    public final /* synthetic */ boolean A02;

    public ViewTreeObserver$OnPreDrawListenerC26421Ku(C26431Kv r1, C26451Kx r2, boolean z) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = z;
    }

    public boolean onPreDraw() {
        C26451Kx r3 = this.A01;
        r3.A01.getViewTreeObserver().removeOnPreDrawListener(this);
        SelectionCheckView selectionCheckView = r3.A01;
        boolean z = this.A02;
        selectionCheckView.A03(z, true);
        this.A00.A00(r3.A01, z);
        return false;
    }
}
