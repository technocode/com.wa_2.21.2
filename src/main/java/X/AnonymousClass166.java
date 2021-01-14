package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;

/* renamed from: X.166  reason: invalid class name */
public final class AnonymousClass166 implements Handler.Callback, Choreographer.FrameCallback {
    public static final AnonymousClass166 A05 = new AnonymousClass166();
    public int A00;
    public Choreographer A01;
    public final Handler A02;
    public final HandlerThread A03;
    public volatile long A04 = -9223372036854775807L;

    public AnonymousClass166() {
        HandlerThread handlerThread = new HandlerThread("ChoreographerOwner:Handler");
        this.A03 = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(this.A03.getLooper(), this);
        this.A02 = handler;
        handler.sendEmptyMessage(0);
    }

    public void doFrame(long j) {
        this.A04 = j;
        this.A01.postFrameCallbackDelayed(this, 500);
    }

    public boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            this.A01 = Choreographer.getInstance();
            return true;
        } else if (i == 1) {
            int i2 = this.A00 + 1;
            this.A00 = i2;
            if (i2 == 1) {
                this.A01.postFrameCallback(this);
            }
            return true;
        } else if (i != 2) {
            return false;
        } else {
            int i3 = this.A00 - 1;
            this.A00 = i3;
            if (i3 == 0) {
                this.A01.removeFrameCallback(this);
                this.A04 = -9223372036854775807L;
            }
            return true;
        }
    }
}
