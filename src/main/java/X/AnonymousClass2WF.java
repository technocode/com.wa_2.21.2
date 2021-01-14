package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Handler;
import android.os.Looper;

/* renamed from: X.2WF  reason: invalid class name */
public class AnonymousClass2WF extends AnimatorListenerAdapter {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C58742mR A01;

    public AnonymousClass2WF(C58742mR r1, long j) {
        this.A01 = r1;
        this.A00 = j;
    }

    public void onAnimationEnd(Animator animator) {
        this.A01.A02.A0A.remove(Long.valueOf(this.A00));
    }

    public void onAnimationStart(Animator animator) {
        C58742mR r2 = this.A01;
        Handler handler = r2.A00;
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper());
            r2.A00 = handler;
        }
        handler.post(r2.A01);
    }
}
