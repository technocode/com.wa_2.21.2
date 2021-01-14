package X;

import android.content.res.Configuration;

/* renamed from: X.0SC  reason: invalid class name */
public class AnonymousClass0SC extends AnonymousClass0SD {
    public int A00;
    public final C02270Bi A01 = new C02270Bi();

    public final void A02(Configuration configuration, int i) {
        int i2 = AbstractC003201p.A00;
        if (i2 == 3 || i2 == -1) {
            int i3 = configuration.uiMode & 48;
            if (this.A00 == i3) {
                this.A01.A07(0);
            } else if (i3 == 16 || i3 == 32) {
                this.A01.A07(Integer.valueOf(i));
            }
        } else {
            this.A01.A07(0);
        }
    }
}
