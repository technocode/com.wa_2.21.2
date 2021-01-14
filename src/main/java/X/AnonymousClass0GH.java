package X;

import android.app.Activity;
import com.google.android.search.verification.client.R;

/* renamed from: X.0GH  reason: invalid class name */
public class AnonymousClass0GH {
    public static volatile AnonymousClass0GH A02;
    public final AnonymousClass02M A00;
    public final AnonymousClass04j A01;

    public AnonymousClass0GH(AnonymousClass02M r1, AnonymousClass04j r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public static AnonymousClass0GH A00() {
        if (A02 == null) {
            synchronized (AnonymousClass0GH.class) {
                if (A02 == null) {
                    A02 = new AnonymousClass0GH(AnonymousClass02M.A00(), AnonymousClass04j.A00());
                }
            }
        }
        return A02;
    }

    public void A01(Activity activity, boolean z, AnonymousClass1KX r6) {
        int i;
        if (!this.A01.A05()) {
            if (AnonymousClass04j.A02(activity)) {
                i = R.string.no_network_cannot_unblock_airplane;
                if (z) {
                    i = R.string.no_network_cannot_block_airplane;
                }
            } else {
                i = R.string.no_network_cannot_unblock;
                if (z) {
                    i = R.string.no_network_cannot_block;
                }
            }
            this.A00.A06(i, 0);
            return;
        }
        this.A00.A0A((AbstractC004502c) activity);
        r6.A2J();
    }
}
