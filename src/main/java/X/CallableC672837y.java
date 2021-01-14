package X;

import android.view.Surface;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.GlVideoRenderer;
import java.util.concurrent.Callable;

/* renamed from: X.37y  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class CallableC672837y implements Callable {
    public final /* synthetic */ Surface A00;
    public final /* synthetic */ C72723Tz A01;

    public /* synthetic */ CallableC672837y(C72723Tz r1, Surface surface) {
        this.A01 = r1;
        this.A00 = surface;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        AnonymousClass3C1 r0;
        C72723Tz r5 = this.A01;
        Surface surface = this.A00;
        int i = 0;
        if (r5.A03 == null) {
            try {
                int[] iArr = AnonymousClass3C1.A00;
                if (AnonymousClass3X6.A00()) {
                    r0 = new AnonymousClass3X6(null, iArr);
                } else {
                    r0 = new AnonymousClass3X4(iArr);
                }
                r5.A03 = r0;
                r0.A07(surface);
                r5.A03.A04();
                GlVideoRenderer glVideoRenderer = r5.A07;
                if (!glVideoRenderer.init(29, 0)) {
                    r5.A05();
                    i = -2;
                } else {
                    glVideoRenderer.setWindow(0, 0, r5.A03.A02(), r5.A03.A01());
                }
            } catch (Exception e) {
                Log.e(e);
                r5.A05();
                i = -5;
            }
        }
        return Integer.valueOf(i);
    }
}
