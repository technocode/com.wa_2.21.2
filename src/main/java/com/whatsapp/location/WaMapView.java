package com.whatsapp.location;

import X.AbstractC02860Dt;
import X.AnonymousClass01X;
import X.AnonymousClass06F;
import X.AnonymousClass1B6;
import X.C02770Dj;
import X.C02850Ds;
import X.C02900Dx;
import X.C19570vF;
import X.C32061eH;
import X.C36001lQ;
import X.C55902hk;
import X.C55912hl;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.search.verification.client.R;

public class WaMapView extends FrameLayout {
    public static C19570vF A03;
    public static AnonymousClass06F A04;
    public C32061eH A00;
    public AnonymousClass1B6 A01;
    public final AnonymousClass01X A02 = AnonymousClass01X.A00();

    public WaMapView(Context context) {
        super(context);
    }

    public WaMapView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void A00(LatLng latLng) {
        String A06 = this.A02.A06(R.string.location_marker_content_description);
        AnonymousClass1B6 r1 = this.A01;
        if (r1 != null) {
            r1.A05(new C55912hl(latLng, A06));
            return;
        }
        C32061eH r12 = this.A00;
        if (r12 != null) {
            r12.A0H(new C55902hk(latLng, A06));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r14.A00 != 0.0d) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.C02770Dj r13, com.google.android.gms.maps.model.LatLng r14, X.C36001lQ r15) {
        /*
        // Method dump skipped, instructions count: 235
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.location.WaMapView.A01(X.0Dj, com.google.android.gms.maps.model.LatLng, X.1lQ):void");
    }

    public void A02(C02770Dj r6, C02850Ds r7, boolean z) {
        LatLng latLng;
        C36001lQ r0;
        C02900Dx r02;
        if (z || (r02 = r7.A02) == null) {
            latLng = new LatLng(((AbstractC02860Dt) r7).A00, ((AbstractC02860Dt) r7).A01);
            if (z) {
                r0 = null;
                A01(r6, latLng, r0);
            }
        } else {
            latLng = new LatLng(r02.A00, r02.A01);
        }
        r0 = C36001lQ.A00(getContext(), R.raw.expired_map_style_json);
        A01(r6, latLng, r0);
    }
}
