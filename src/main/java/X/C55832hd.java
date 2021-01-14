package X;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.whatsapp.location.LocationPicker2;

/* renamed from: X.2hd  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C55832hd implements AnonymousClass1B0 {
    public final /* synthetic */ LocationPicker2 A00;

    public /* synthetic */ C55832hd(LocationPicker2 locationPicker2) {
        this.A00 = locationPicker2;
    }

    @Override // X.AnonymousClass1B0
    public final void ADk() {
        LatLng latLng;
        LocationPicker2 locationPicker2 = this.A00;
        if (locationPicker2.A08.A0C.getVisibility() == 0) {
            locationPicker2.A08.A0C.setVisibility(8);
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, (float) (-locationPicker2.A08.A0C.getHeight()), 0.0f);
            translateAnimation.setInterpolator(new DecelerateInterpolator());
            translateAnimation.setDuration(120);
            locationPicker2.A08.A0D.startAnimation(translateAnimation);
        }
        AnonymousClass1B5 r0 = locationPicker2.A01;
        if (r0 != null) {
            CameraPosition A02 = r0.A02();
            if (A02 != null && (latLng = A02.A03) != null) {
                locationPicker2.A08.A0E(latLng.A00, latLng.A01);
                return;
            }
            return;
        }
        throw null;
    }
}
