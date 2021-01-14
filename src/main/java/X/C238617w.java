package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.17w  reason: invalid class name and case insensitive filesystem */
public final class C238617w implements Handler.Callback {
    public boolean A00 = false;
    public final Handler A01;
    public final AbstractC238517v A02;
    public final Object A03 = new Object();
    public final ArrayList A04 = new ArrayList();
    public final ArrayList A05 = new ArrayList();
    public final ArrayList A06 = new ArrayList();
    public final AtomicInteger A07 = new AtomicInteger(0);
    public volatile boolean A08 = false;

    public C238617w(Looper looper, AbstractC238517v r4) {
        this.A02 = r4;
        this.A01 = new HandlerC04640Ld(looper, this);
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            AnonymousClass176 r3 = (AnonymousClass176) message.obj;
            synchronized (this.A03) {
                if (this.A08) {
                    AbstractC238517v r1 = this.A02;
                    if (r1.isConnected() && this.A04.contains(r3)) {
                        r3.AEX(r1.A5M());
                    }
                }
            }
            return true;
        }
        Log.wtf("GmsClientEvents", AnonymousClass008.A08(45, "Don't know how to handle message: ", i), new Exception());
        return false;
    }
}
