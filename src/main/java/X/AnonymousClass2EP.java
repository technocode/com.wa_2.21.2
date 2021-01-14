package X;

import android.hardware.camera2.TotalCaptureResult;
import android.media.Image;
import com.whatsapp.util.Log;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.2EP  reason: invalid class name */
public class AnonymousClass2EP {
    public TotalCaptureResult A00;
    public final AtomicInteger A01;
    public volatile Image A02;

    public AnonymousClass2EP(boolean z) {
        AtomicInteger atomicInteger = new AtomicInteger();
        this.A01 = atomicInteger;
        if (z) {
            atomicInteger.getAndIncrement();
        }
    }

    public void A00() {
        if (this.A01.getAndDecrement() == 1 && this.A02 != null) {
            try {
                this.A02.close();
            } catch (IllegalStateException e) {
                Log.e("cameraview2/qr/decrement", e);
            }
            this.A02 = null;
        }
    }
}
