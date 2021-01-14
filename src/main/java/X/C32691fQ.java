package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

/* renamed from: X.1fQ  reason: invalid class name and case insensitive filesystem */
public class C32691fQ {
    public Bitmap A00;
    public final Rect A01 = new Rect();
    public final Rect A02 = new Rect();
    public final Rect A03;
    public final AbstractC20320wW A04;
    public final C20340wY A05;
    public final C20400we A06;
    public final boolean A07;
    public final int[] A08;
    public final C20310wV[] A09;

    public C32691fQ(C20400we r8, C20340wY r9, Rect rect, boolean z) {
        int length;
        this.A06 = r8;
        this.A05 = r9;
        AbstractC20320wW r0 = r9.A00;
        this.A04 = r0;
        int[] frameDurations = r0.getFrameDurations();
        this.A08 = frameDurations;
        C20400we r5 = this.A06;
        if (r5 != null) {
            int i = 0;
            while (true) {
                length = frameDurations.length;
                if (i >= length) {
                    break;
                }
                if (frameDurations[i] < 11) {
                    frameDurations[i] = 100;
                }
                i++;
            }
            if (r5 != null) {
                for (int i2 = 0; i2 < length; i2++) {
                }
                for (int i3 = 0; i3 < length; i3++) {
                }
                this.A03 = A00(this.A04, rect);
                this.A07 = z;
                this.A09 = new C20310wV[this.A04.getFrameCount()];
                for (int i4 = 0; i4 < this.A04.getFrameCount(); i4++) {
                    this.A09[i4] = this.A04.getFrameInfo(i4);
                }
                return;
            }
            throw null;
        }
        throw null;
    }

    public static Rect A00(AbstractC20320wW r4, Rect rect) {
        if (rect == null) {
            return new Rect(0, 0, r4.getWidth(), r4.getHeight());
        }
        return new Rect(0, 0, Math.min(rect.width(), r4.getWidth()), Math.min(rect.height(), r4.getHeight()));
    }

    public final synchronized void A01(int i, int i2) {
        Bitmap bitmap = this.A00;
        if (bitmap != null && (bitmap.getWidth() < i || this.A00.getHeight() < i2)) {
            Bitmap bitmap2 = this.A00;
            if (bitmap2 != null) {
                bitmap2.recycle();
                this.A00 = null;
            }
        }
        Bitmap bitmap3 = this.A00;
        if (bitmap3 == null) {
            bitmap3 = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            this.A00 = bitmap3;
        }
        bitmap3.eraseColor(0);
    }

    public void A02(int i, Canvas canvas) {
        int width;
        int height;
        int xOffset;
        int yOffset;
        AbstractC20320wW r6 = this.A04;
        AbstractC20330wX frame = r6.getFrame(i);
        try {
            if (r6.doesRenderSupportScaling()) {
                Rect rect = this.A03;
                double width2 = ((double) rect.width()) / ((double) r6.getWidth());
                double height2 = ((double) rect.height()) / ((double) r6.getHeight());
                int round = (int) Math.round(((double) frame.getWidth()) * width2);
                int round2 = (int) Math.round(((double) frame.getHeight()) * height2);
                int xOffset2 = (int) (((double) frame.getXOffset()) * width2);
                int yOffset2 = (int) (((double) frame.getYOffset()) * height2);
                synchronized (this) {
                    int width3 = rect.width();
                    int height3 = rect.height();
                    A01(width3, height3);
                    frame.renderFrame(round, round2, this.A00);
                    Rect rect2 = this.A02;
                    rect2.set(0, 0, width3, height3);
                    Rect rect3 = this.A01;
                    rect3.set(xOffset2, yOffset2, width3 + xOffset2, height3 + yOffset2);
                    canvas.drawBitmap(this.A00, rect2, rect3, (Paint) null);
                }
            } else {
                if (this.A07) {
                    float max = Math.max(((float) frame.getWidth()) / ((float) Math.min(frame.getWidth(), canvas.getWidth())), ((float) frame.getHeight()) / ((float) Math.min(frame.getHeight(), canvas.getHeight())));
                    width = (int) (((float) frame.getWidth()) / max);
                    height = (int) (((float) frame.getHeight()) / max);
                    xOffset = (int) (((float) frame.getXOffset()) / max);
                    yOffset = (int) (((float) frame.getYOffset()) / max);
                } else {
                    width = frame.getWidth();
                    height = frame.getHeight();
                    xOffset = frame.getXOffset();
                    yOffset = frame.getYOffset();
                }
                synchronized (this) {
                    A01(width, height);
                    frame.renderFrame(width, height, this.A00);
                    canvas.save();
                    canvas.translate((float) xOffset, (float) yOffset);
                    canvas.drawBitmap(this.A00, 0.0f, 0.0f, (Paint) null);
                    canvas.restore();
                }
            }
        } finally {
            frame.dispose();
        }
    }
}
