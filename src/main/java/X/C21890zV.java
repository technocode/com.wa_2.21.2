package X;

import android.media.Image;
import android.media.ImageReader;
import java.nio.ByteBuffer;

/* renamed from: X.0zV  reason: invalid class name and case insensitive filesystem */
public class C21890zV implements ImageReader.OnImageAvailableListener {
    public final /* synthetic */ C33311gX A00;

    public C21890zV(C33311gX r1) {
        this.A00 = r1;
    }

    public void onImageAvailable(ImageReader imageReader) {
        Image acquireNextImage = imageReader.acquireNextImage();
        if (acquireNextImage == null) {
            C33311gX r2 = this.A00;
            r2.A04 = Boolean.FALSE;
            r2.A03 = new C21620z2("Could not retrieve captured image from reader.");
            return;
        }
        ByteBuffer buffer = acquireNextImage.getPlanes()[0].getBuffer();
        buffer.rewind();
        byte[] bArr = new byte[buffer.remaining()];
        buffer.get(bArr);
        acquireNextImage.close();
        C33311gX r1 = this.A00;
        r1.A04 = Boolean.TRUE;
        r1.A05 = bArr;
        r1.A02.A01();
    }
}
