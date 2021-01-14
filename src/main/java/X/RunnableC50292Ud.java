package X;

import com.whatsapp.mediaview.PhotoView;

/* renamed from: X.2Ud  reason: invalid class name and case insensitive filesystem */
public class RunnableC50292Ud extends RunnableEmptyBase implements Runnable {
    public long A00;
    public boolean A01;
    public final PhotoView A02;

    public RunnableC50292Ud(PhotoView photoView) {
        this.A02 = photoView;
    }

    public void run() {
        if (!this.A01) {
            long j = this.A00;
            if (j == 0) {
                j = System.currentTimeMillis();
                this.A00 = j;
            }
            if (((float) (System.currentTimeMillis() - j)) / ((float) 0) >= 1.0f) {
                this.A01 = true;
                PhotoView photoView = this.A02;
                photoView.invalidate();
                if (!this.A01) {
                    photoView.post(this);
                    return;
                }
                return;
            }
            throw null;
        }
    }
}
