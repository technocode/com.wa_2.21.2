package X;

import android.os.HandlerThread;
import android.os.Message;

/* renamed from: X.3SO  reason: invalid class name */
public final class AnonymousClass3SO {
    public int A00 = 1;
    public HandlerThread A01;
    public AnonymousClass36U A02;
    public AnonymousClass3SP A03;
    public final AnonymousClass3SN A04 = new AnonymousClass3SN(this);

    public final void A00(int i) {
        synchronized (this) {
            this.A00 = i;
        }
    }

    public synchronized void A01(long j, AnonymousClass3SP r9) {
        AnonymousClass36U r2;
        HandlerThread handlerThread;
        if (this.A01 == null || (r2 = this.A02) == null) {
            AnonymousClass36U r1 = this.A02;
            if (!(r1 == null || r1 == null)) {
                r1.removeMessages(1);
                r1.removeMessages(3);
                r1.removeMessages(2);
                r1 = null;
                this.A02 = null;
            }
            if (!(r1 == null || (handlerThread = this.A01) == null)) {
                handlerThread.quit();
                this.A01 = null;
            }
            HandlerThread handlerThread2 = new HandlerThread("HandlerBasedTimerThread");
            this.A01 = handlerThread2;
            handlerThread2.start();
            r2 = new AnonymousClass36U(this.A01.getLooper(), this.A04);
            this.A02 = r2;
        }
        AnonymousClass00E.A04(r9, "timerCallback cannot be null, or we are using the resources without any actual use");
        AnonymousClass00E.A04(this.A01, "Thread to start the timer cannot be null");
        if (r2 != null) {
            boolean z = false;
            if (this.A00 == 1) {
                z = true;
            }
            AnonymousClass00E.A0A(z, "Timer is in running state, please call cancel or wait for timer to complete before starting the timer again");
            this.A03 = r9;
            A00(2);
            AnonymousClass36U r5 = this.A02;
            Long valueOf = Long.valueOf(j);
            Message obtain = Message.obtain();
            obtain.what = 1;
            if (valueOf != null) {
                obtain.getData().putLong("TimerDuration", valueOf.longValue());
            }
            r5.sendMessage(obtain);
        } else {
            throw new NullPointerException("Handler for timer cannot be null");
        }
    }
}
