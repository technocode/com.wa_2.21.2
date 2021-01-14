package X;

import android.graphics.Bitmap;
import com.facebook.animated.webp.WebPImage;

/* renamed from: X.33h  reason: invalid class name and case insensitive filesystem */
public class C662033h {
    public int A00;
    public long A01;
    public final Bitmap A02;
    public final Bitmap A03;
    public final C661533c A04;
    public final AnonymousClass0D5 A05;
    public final C662133i A06;

    public C662033h(String str, Bitmap bitmap, WebPImage webPImage, AnonymousClass0D5 r11, int i, int i2) {
        this.A05 = r11;
        this.A02 = bitmap;
        this.A06 = new C662133i(webPImage.getFrameCount(), webPImage.getFrameDurations());
        this.A04 = new C661533c(str, bitmap, webPImage, i, i2);
        this.A03 = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
    }
}
