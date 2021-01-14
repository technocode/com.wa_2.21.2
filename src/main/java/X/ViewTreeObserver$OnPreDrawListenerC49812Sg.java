package X;

import android.view.ViewTreeObserver;
import com.whatsapp.location.WaMapView;

/* renamed from: X.2Sg  reason: invalid class name and case insensitive filesystem */
public class ViewTreeObserver$OnPreDrawListenerC49812Sg implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ C02770Dj A00;
    public final /* synthetic */ WaMapView A01;

    public ViewTreeObserver$OnPreDrawListenerC49812Sg(WaMapView waMapView, C02770Dj r2) {
        this.A01 = waMapView;
        this.A00 = r2;
    }

    public boolean onPreDraw() {
        WaMapView waMapView = this.A01;
        AnonymousClass1B6 r0 = waMapView.A01;
        if (r0 != null) {
            r0.getViewTreeObserver().removeOnPreDrawListener(this);
            waMapView.A01.post(new RunnableEBaseShape10S0100000_I1_5(this, 43));
            return true;
        }
        throw null;
    }
}
