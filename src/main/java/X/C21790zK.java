package X;

import android.media.Image;
import android.media.ImageReader;

/* renamed from: X.0zK  reason: invalid class name and case insensitive filesystem */
public class C21790zK implements ImageReader.OnImageAvailableListener {
    public final /* synthetic */ C21810zM A00;

    public C21790zK(C21810zM r1) {
        this.A00 = r1;
    }

    public void onImageAvailable(ImageReader imageReader) {
        C21810zM r1 = this.A00;
        Image image = r1.A00;
        if (image != null) {
            image.close();
        }
        r1.A00 = imageReader.acquireNextImage();
        C21810zM.A00(r1);
    }
}
