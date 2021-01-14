package X;

import android.view.View;

/* renamed from: X.2PW  reason: invalid class name */
public class AnonymousClass2PW extends RunnableEmptyBase implements Runnable {
    public long A00;
    public boolean A01;
    public final View A02;
    public final AnonymousClass2PX A03;

    public AnonymousClass2PW(View view, AnonymousClass2PX r2) {
        this.A02 = view;
        this.A03 = r2;
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
            }
            View view = this.A02;
            view.invalidate();
            if (!this.A01) {
                view.post(this);
            }
        }
    }
}
