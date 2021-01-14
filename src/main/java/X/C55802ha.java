package X;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import com.google.android.search.verification.client.R;
import com.whatsapp.PlaceInfo;
import com.whatsapp.location.LocationPicker2;

/* renamed from: X.2ha  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C55802ha implements AnonymousClass1B1 {
    public final /* synthetic */ LocationPicker2 A00;

    public /* synthetic */ C55802ha(LocationPicker2 locationPicker2) {
        this.A00 = locationPicker2;
    }

    @Override // X.AnonymousClass1B1
    public final void ADo(int i) {
        LocationPicker2 locationPicker2 = this.A00;
        if (i == 1) {
            AbstractC49792Sd r1 = locationPicker2.A08;
            if (r1.A0t) {
                r1.A0S.setImageResource(R.drawable.btn_myl);
                locationPicker2.A08.A0s = false;
            } else {
                PlaceInfo placeInfo = r1.A0Z;
                if (placeInfo != null) {
                    Object obj = placeInfo.A01;
                    if (obj != null) {
                        AnonymousClass1BR r12 = (AnonymousClass1BR) obj;
                        r12.A05(locationPicker2.A03);
                        r12.A02();
                    }
                    AbstractC49792Sd r13 = locationPicker2.A08;
                    r13.A0Z = null;
                    r13.A0D();
                }
                AbstractC49792Sd r14 = locationPicker2.A08;
                if (r14.A0o) {
                    r14.A0C.setVisibility(0);
                    TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, (float) locationPicker2.A08.A0C.getHeight(), 0.0f);
                    translateAnimation.setInterpolator(new DecelerateInterpolator());
                    translateAnimation.setDuration(120);
                    locationPicker2.A08.A0D.startAnimation(translateAnimation);
                    locationPicker2.A08.A0E.setVisibility(0);
                    locationPicker2.A08.A0B.setVisibility(8);
                }
            }
        }
        AbstractC49792Sd r15 = locationPicker2.A08;
        if (r15.A0s) {
            r15.A0B.setVisibility(8);
        }
        View findViewById = locationPicker2.findViewById(R.id.map_center_address);
        View findViewById2 = locationPicker2.findViewById(R.id.location_description);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
        if (findViewById2 != null && locationPicker2.A08.A0o) {
            findViewById2.setVisibility(8);
        }
    }
}
