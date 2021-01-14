package X;

import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.0bl  reason: invalid class name and case insensitive filesystem */
public final class ViewTreeObserver$OnPreDrawListenerC08810bl implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ Runnable A02;

    public ViewTreeObserver$OnPreDrawListenerC08810bl(Handler handler, Runnable runnable, View view) {
        this.A00 = handler;
        this.A02 = runnable;
        this.A01 = view;
    }

    public boolean onPreDraw() {
        Handler handler = this.A00;
        Message obtain = Message.obtain(handler, this.A02);
        obtain.setAsynchronous(true);
        handler.sendMessageAtFrontOfQueue(obtain);
        this.A01.getViewTreeObserver().removeOnPreDrawListener(this);
        return true;
    }
}
