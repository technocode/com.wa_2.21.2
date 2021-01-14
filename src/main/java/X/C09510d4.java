package X;

import android.view.View;
import java.util.ArrayList;

/* renamed from: X.0d4  reason: invalid class name and case insensitive filesystem */
public class C09510d4 {
    public C39071qu A00;
    public final C04380Kd A01;
    public final AnonymousClass3PH A02;
    public final C09520d5 A03;
    public final AnonymousClass0K9 A04;

    public C09510d4(AnonymousClass0K9 r4, C04380Kd r5, boolean z) {
        this.A04 = r4;
        this.A01 = r5;
        boolean z2 = true;
        boolean z3 = !new ArrayList(r4.A03.values()).isEmpty();
        this.A03 = new C09520d5(z3, (z || !z3) ? false : z2);
        this.A02 = new AnonymousClass3PH(this);
    }

    public final void A00() {
        C39071qu r0 = this.A00;
        if (r0 != null) {
            C09520d5 r4 = this.A03;
            C40781tp r3 = r0.A00;
            View view = r3.A01;
            if (view != null) {
                boolean z = r4.A00;
                int visibility = view.getVisibility();
                boolean z2 = false;
                if (visibility == 0) {
                    z2 = true;
                }
                if (z != z2) {
                    r3.A00(z, r4.A01);
                }
            }
        }
    }

    public void A01(int i) {
        int i2;
        if (i == 1) {
            i2 = 4;
        } else if (i == 2) {
            i2 = 3;
        } else {
            throw new UnsupportedOperationException(AnonymousClass008.A0F("No Constant for Navigation Action: ", i));
        }
        AnonymousClass1Ny r0 = this.A01.A00;
        if (r0 != null) {
            r0.A00 = i2;
        }
    }
}
