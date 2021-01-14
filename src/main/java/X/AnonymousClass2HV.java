package X;

import android.os.Handler;
import android.view.ViewTreeObserver;

/* renamed from: X.2HV  reason: invalid class name */
public class AnonymousClass2HV implements ViewTreeObserver.OnGlobalLayoutListener {
    public int A00;
    public final Runnable A01 = new RunnableEBaseShape8S0100000_I1_3(this, 48);
    public final /* synthetic */ AnonymousClass2ZC A02;

    public AnonymousClass2HV(AnonymousClass2ZC r3) {
        this.A02 = r3;
    }

    public void onGlobalLayout() {
        AnonymousClass2ZC r2 = this.A02;
        int width = r2.A01.getWidth();
        if (width != 0 && width != this.A00) {
            this.A00 = width;
            AnonymousClass02M r0 = r2.A0I;
            Runnable runnable = this.A01;
            Handler handler = r0.A02;
            handler.removeCallbacks(runnable);
            handler.post(runnable);
        }
    }
}
