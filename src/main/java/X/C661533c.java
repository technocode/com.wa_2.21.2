package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import com.facebook.animated.webp.WebPFrame;
import com.facebook.animated.webp.WebPImage;
import com.whatsapp.util.Log;

/* renamed from: X.33c  reason: invalid class name and case insensitive filesystem */
public class C661533c {
    public int A00 = 0;
    public Bitmap A01;
    public Bitmap A02;
    public Bitmap A03;
    public Canvas A04;
    public C20310wV A05;
    public boolean A06 = false;
    public final float A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final Bitmap A0B;
    public final Paint A0C;
    public final WebPImage A0D;
    public final String A0E;

    public C661533c(String str, Bitmap bitmap, WebPImage webPImage, int i, int i2) {
        this.A0E = str;
        this.A0D = webPImage;
        this.A0B = bitmap;
        Paint paint = new Paint();
        this.A0C = paint;
        paint.setColor(0);
        this.A0C.setStyle(Paint.Style.FILL);
        this.A0C.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        this.A0A = webPImage.getFrameCount();
        this.A09 = i;
        this.A08 = i2;
        this.A07 = ((float) i) / ((float) webPImage.getWidth());
    }

    public synchronized Bitmap A00(AnonymousClass0D2 r22, Bitmap bitmap) {
        EnumC20290wT r19;
        Bitmap bitmap2;
        EnumC20300wU r13 = EnumC20300wU.DISPOSE_TO_BACKGROUND;
        EnumC20300wU r12 = EnumC20300wU.DISPOSE_DO_NOT;
        EnumC20290wT r10 = EnumC20290wT.NO_BLEND;
        EnumC20300wU r4 = EnumC20300wU.DISPOSE_TO_PREVIOUS;
        synchronized (this) {
            A01();
            if (this.A01 == null) {
                throw null;
            } else if (this.A04 != null) {
                int i = this.A00;
                this.A00 = (i + 1) % this.A0A;
                C20310wV r3 = this.A05;
                if (r3 == null) {
                    r3 = this.A0D.getFrameInfo(i);
                }
                WebPFrame frame = this.A0D.m1getFrame(this.A00);
                int xOffset = frame.getXOffset();
                int yOffset = frame.getYOffset();
                int width = frame.getWidth();
                int height = frame.getHeight();
                if (frame.isBlendWithPreviousFrame()) {
                    r19 = EnumC20290wT.BLEND_WITH_PREVIOUS;
                } else {
                    r19 = r10;
                }
                EnumC20300wU r20 = r12;
                if (frame.shouldDisposeToBackgroundColor()) {
                    r20 = r13;
                }
                this.A05 = new C20310wV(xOffset, yOffset, width, height, r19, r20);
                int i2 = this.A00;
                if (i2 == 0) {
                    bitmap2 = this.A0B;
                } else {
                    String str = this.A0E;
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append("_frame_");
                    sb.append(i2);
                    String obj = sb.toString();
                    AnonymousClass0DD A042 = r22.A00.A04();
                    bitmap2 = (Bitmap) A042.A02(obj);
                    if (bitmap2 != null && bitmap2.isRecycled()) {
                        StringBuilder sb2 = new StringBuilder("AnimatedSticker/AnimatedStickerFrameCache/getFrame/bitmap is recycled, cacheKey: ");
                        sb2.append(obj);
                        Log.d(sb2.toString());
                        A042.A04(obj);
                        bitmap2 = null;
                    }
                }
                if (bitmap2 != null) {
                    this.A06 = true;
                    if (this.A05.A05 == r4) {
                        this.A03 = this.A02;
                    }
                    this.A02 = bitmap2;
                    frame.dispose();
                    return this.A02;
                }
                bitmap.eraseColor(0);
                float f = this.A07;
                frame.renderFrame((int) Math.ceil((double) (((float) frame.getWidth()) * f)), (int) Math.ceil((double) (((float) frame.getHeight()) * f)), bitmap);
                EnumC20300wU r1 = r3.A05;
                if (r1 == r4 && this.A03 != null) {
                    this.A01.eraseColor(0);
                    this.A04.drawBitmap(this.A03, 0.0f, 0.0f, (Paint) null);
                } else if (r1 == r13) {
                    A02(this.A04, r3);
                } else if (this.A06 && this.A02 != null && r1 == r12) {
                    this.A01.eraseColor(0);
                    this.A04.drawBitmap(this.A02, 0.0f, 0.0f, (Paint) null);
                }
                C20310wV r14 = this.A05;
                if (r14.A05 == r4) {
                    this.A03 = this.A02;
                } else {
                    this.A03 = null;
                }
                if (r14.A04 == r10) {
                    A02(this.A04, r14);
                }
                int xOffset2 = frame.getXOffset();
                int yOffset2 = frame.getYOffset();
                frame.dispose();
                this.A04.drawBitmap(bitmap, ((float) xOffset2) * f, ((float) yOffset2) * f, (Paint) null);
                try {
                    Bitmap bitmap3 = this.A01;
                    Bitmap copy = bitmap3.copy(bitmap3.getConfig(), false);
                    this.A02 = copy;
                    r22.A00(this.A0E, this.A00, copy);
                } catch (OutOfMemoryError e) {
                    this.A02 = this.A01;
                    Log.e("AnimatedWebpRenderer/renderNextFrame/OutofMemoryError: ", e);
                }
                this.A06 = false;
                return this.A02;
            } else {
                throw null;
            }
        }
    }

    public final synchronized void A01() {
        if (this.A01 == null) {
            Bitmap createBitmap = Bitmap.createBitmap(this.A09, this.A08, Bitmap.Config.ARGB_8888);
            this.A01 = createBitmap;
            Canvas canvas = new Canvas(createBitmap);
            this.A04 = canvas;
            Bitmap bitmap = this.A0B;
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            this.A03 = bitmap;
        }
    }

    public final void A02(Canvas canvas, C20310wV r11) {
        int i = r11.A02;
        float f = this.A07;
        int i2 = r11.A03;
        canvas.drawRect(((float) i) * f, ((float) i2) * f, ((float) (i + r11.A01)) * f, ((float) (i2 + r11.A00)) * f, this.A0C);
    }

    public synchronized void finalize() {
        this.A0D.dispose();
        Bitmap bitmap = this.A01;
        if (bitmap != null) {
            bitmap.recycle();
            this.A01 = null;
        }
        Bitmap bitmap2 = this.A02;
        if (bitmap2 != null) {
            bitmap2.recycle();
            this.A02 = null;
        }
        super.finalize();
    }
}
