package X;

import android.media.Image;
import android.media.ImageReader;

/* renamed from: X.2EN  reason: invalid class name */
public class AnonymousClass2EN implements ImageReader.OnImageAvailableListener {
    public final /* synthetic */ AnonymousClass2Wh A00;

    public AnonymousClass2EN(AnonymousClass2Wh r1) {
        this.A00 = r1;
    }

    public void onImageAvailable(ImageReader imageReader) {
        AnonymousClass2Wh r3 = this.A00;
        synchronized (r3) {
            Image acquireLatestImage = imageReader.acquireLatestImage();
            if (acquireLatestImage != null) {
                if (AnonymousClass2Wh.A0H(r3, r3.A0T.get(), false)) {
                    AnonymousClass2Wh.A0E(r3, acquireLatestImage);
                } else {
                    acquireLatestImage.close();
                }
            }
        }
    }
}
