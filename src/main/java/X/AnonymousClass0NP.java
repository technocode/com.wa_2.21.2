package X;

import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.search.verification.client.SearchActionVerificationClientService;

/* renamed from: X.0NP  reason: invalid class name */
public class AnonymousClass0NP {
    public int A00 = 0;
    public Handler.Callback A01 = new C14790mt(this);
    public Handler A02;
    public HandlerThread A03;
    public final int A04 = SearchActionVerificationClientService.NOTIFICATION_ID;
    public final int A05 = 10;
    public final Object A06 = new Object();
    public final String A07 = "fonts";

    public final void A00(Runnable runnable) {
        synchronized (this.A06) {
            if (this.A03 == null) {
                HandlerThread handlerThread = new HandlerThread("fonts", 10);
                this.A03 = handlerThread;
                handlerThread.start();
                this.A02 = new Handler(this.A03.getLooper(), this.A01);
                this.A00++;
            }
            this.A02.removeMessages(0);
            Handler handler = this.A02;
            handler.sendMessage(handler.obtainMessage(1, runnable));
        }
    }
}
