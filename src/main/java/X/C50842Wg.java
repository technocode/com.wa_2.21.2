package X;

import android.media.Image;
import android.media.ImageReader;
import com.whatsapp.VideoFrameConverter;
import com.whatsapp.util.Log;
import java.nio.ByteBuffer;

/* renamed from: X.2Wg  reason: invalid class name and case insensitive filesystem */
public class C50842Wg implements AbstractC46582Ea, ImageReader.OnImageAvailableListener {
    public ByteBuffer A00;
    public final AnonymousClass2EZ A01 = new AnonymousClass2EZ();
    public final /* synthetic */ AnonymousClass2Wh A02;

    public C50842Wg(AnonymousClass2Wh r2) {
        this.A02 = r2;
    }

    @Override // X.AbstractC46582Ea
    public AnonymousClass2EZ A4b() {
        AnonymousClass2EQ r2 = this.A02.A0d;
        synchronized (r2) {
            while (r2.A04 == null) {
                try {
                    r2.wait();
                } catch (InterruptedException unused) {
                    r2.A01();
                    return null;
                }
            }
            if (r2.A04.A01.getAndIncrement() <= 0 || r2.A04.A02 == null) {
                r2.A04.A00();
            } else {
                AnonymousClass2EP r3 = r2.A04;
                if (r3 != null) {
                    try {
                        Image image = r3.A02;
                        if (image != null) {
                            int width = image.getWidth();
                            int height = image.getHeight();
                            int[] iArr = AnonymousClass2Wh.A0o;
                            int length = iArr.length;
                            int i = 0;
                            int i2 = 640;
                            int i3 = 480;
                            while (true) {
                                if (i >= length) {
                                    break;
                                }
                                int i4 = iArr[i];
                                i2 = (i4 * width) >> 3;
                                i3 = (i4 * height) >> 3;
                                if (i2 >= 640 && i3 >= 480) {
                                    break;
                                }
                                i++;
                            }
                            int i5 = i2 * i3;
                            ByteBuffer byteBuffer = this.A00;
                            if (byteBuffer == null || byteBuffer.capacity() != i5) {
                                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i5);
                                this.A00 = allocateDirect;
                                AnonymousClass2EZ r1 = this.A01;
                                r1.A02 = allocateDirect.array();
                                r1.A01 = i2;
                                r1.A00 = i3;
                            }
                            Image.Plane plane = image.getPlanes()[0];
                            VideoFrameConverter.scalePlane(plane.getBuffer(), plane.getRowStride(), width, height, this.A00, i2, i2, i3);
                            synchronized (r2) {
                                r3.A00();
                            }
                            r2.A01();
                            return this.A01;
                        }
                        throw null;
                    } catch (IllegalStateException e) {
                        Log.e("cameraview2/qr/get", e);
                        synchronized (r2) {
                            r3.A00();
                            r2.A01();
                            return null;
                        }
                    } catch (Throwable th) {
                        synchronized (r2) {
                            r3.A00();
                            r2.A01();
                            throw th;
                        }
                    }
                }
            }
        }
        return null;
    }

    public void onImageAvailable(ImageReader imageReader) {
        AnonymousClass2EP r1;
        AnonymousClass2Wh r5 = this.A02;
        synchronized (r5) {
            Image acquireLatestImage = imageReader.acquireLatestImage();
            if (acquireLatestImage != null) {
                int i = r5.A0T.get();
                boolean z = true;
                if (AnonymousClass2Wh.A0H(r5, i, true)) {
                    AnonymousClass2Wh.A0E(r5, acquireLatestImage);
                } else if (i == 1) {
                    AnonymousClass2EQ r6 = r5.A0d;
                    long timestamp = acquireLatestImage.getTimestamp();
                    if (r5.A0V) {
                        z = false;
                    }
                    synchronized (r6) {
                        if (r6.A00) {
                            if (r6.A01) {
                                r1 = r6.A00(timestamp);
                            } else {
                                r1 = new AnonymousClass2EP(false);
                            }
                            r1.A02 = acquireLatestImage;
                            if (z) {
                                if (r6.A04 == null) {
                                    r6.A04 = r1;
                                    r6.A04.A01.getAndIncrement();
                                    r6.notify();
                                } else if (!r6.A01) {
                                }
                            }
                            r6.A02();
                        }
                        acquireLatestImage.close();
                    }
                } else {
                    acquireLatestImage.close();
                }
            }
        }
    }
}
