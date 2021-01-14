package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Handler;
import android.os.Looper;

/* renamed from: X.2WE  reason: invalid class name */
public class AnonymousClass2WE extends AnimatorListenerAdapter {
    public final /* synthetic */ C58742mR A00;
    public final /* synthetic */ AnonymousClass2WG A01;

    public AnonymousClass2WE(AnonymousClass2WG r1, C58742mR r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public void onAnimationEnd(Animator animator) {
        AnonymousClass2WG r1 = this.A01;
        if (!r1.A03.isRunning() && r1.A05) {
            r1.A03.start();
        }
    }

    public void onAnimationStart(Animator animator) {
        C58742mR r2 = this.A00;
        Handler handler = r2.A00;
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper());
            r2.A00 = handler;
        }
        handler.post(r2.A01);
    }
}
