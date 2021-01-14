package X;

import android.content.Context;
import android.os.Build;

/* renamed from: X.0Rf  reason: invalid class name and case insensitive filesystem */
public class C05970Rf extends AbstractC05930Rb {
    public boolean A00 = true;
    public final AbstractC05990Rh A01;
    public final long[] A02;
    public final long[] A03;

    public C05970Rf(Context context) {
        AbstractC05990Rh r1;
        if (Build.VERSION.SDK_INT >= 28) {
            r1 = new C32341en(context);
        } else {
            r1 = new C05980Rg();
            if (!r1.A01(new long[8])) {
                r1 = new C06000Ri(context);
            }
        }
        this.A01 = r1;
        this.A02 = new long[8];
        this.A03 = new long[8];
    }

    public static void A00(C05960Re r4, long[] jArr, int i) {
        r4.mobileBytesTx += jArr[i | 3];
        r4.mobileBytesRx += jArr[i | 2];
        r4.wifiBytesTx += jArr[i | 1];
        r4.wifiBytesRx += jArr[i | 0];
    }
}
