package X;

import com.whatsapp.mediaview.PhotoView;

/* renamed from: X.2Ub  reason: invalid class name and case insensitive filesystem */
public class RunnableC50272Ub extends RunnableEmptyBase implements Runnable {
    public float A00;
    public long A01;
    public boolean A02;
    public final PhotoView A03;

    public RunnableC50272Ub(PhotoView photoView) {
        this.A03 = photoView;
    }

    public void run() {
        long j;
        if (!this.A02) {
            float f = this.A00;
            if (f != 0.0f) {
                long currentTimeMillis = System.currentTimeMillis();
                long j2 = this.A01;
                if (j2 != -1) {
                    j = currentTimeMillis - j2;
                } else {
                    j = 0;
                }
                float f2 = 0.0f * ((float) j);
                if ((f < 0.0f && f + f2 > 0.0f) || (f > 0.0f && f + f2 < 0.0f)) {
                    f2 = 0.0f - f;
                }
                PhotoView photoView = this.A03;
                photoView.A07 += f2;
                photoView.A0B.postRotate(f2, (float) (photoView.getWidth() >> 1), (float) (photoView.getHeight() >> 1));
                photoView.setImageMatrix(photoView.A0B);
                float f3 = this.A00 + f2;
                this.A00 = f3;
                if (f3 == 0.0f) {
                    this.A02 = true;
                    photoView.A07 = (float) Math.round(photoView.A07);
                    photoView.A08(true);
                    photoView.requestLayout();
                    photoView.invalidate();
                }
                this.A01 = currentTimeMillis;
            }
            if (!this.A02) {
                this.A03.post(this);
            }
        }
    }
}
