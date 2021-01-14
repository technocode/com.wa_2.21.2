package X;

import android.graphics.Rect;
import android.hardware.Camera;
import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.0yZ  reason: invalid class name and case insensitive filesystem */
public class CallableC21330yZ implements Callable {
    public final /* synthetic */ C32421ev A00;
    public final /* synthetic */ C33081gA A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;

    public CallableC21330yZ(C33081gA r1, C32421ev r2, boolean z, boolean z2) {
        this.A01 = r1;
        this.A00 = r2;
        this.A02 = z;
        this.A03 = z2;
    }

    /* JADX INFO: finally extract failed */
    @Override // java.util.concurrent.Callable
    public Object call() {
        Camera.ShutterCallback shutterCallback;
        C33081gA r5 = this.A01;
        ((Number) r5.A06().A00(AnonymousClass0VN.A0X)).intValue();
        C22100zr.A00();
        int A002 = r5.A06.A00(r5.A0V);
        C21950zb r6 = r5.A0P;
        C33331gZ A003 = r6.A00(r5.A06);
        ((AbstractC22030zj) A003).A00.A01(AnonymousClass0VN.A0W, Integer.valueOf(A002));
        A003.A00();
        Rect rect = (Rect) r6.A02(r5.A06).A00(AnonymousClass0VN.A0d);
        r5.A0R.A05(r5.A0Q.A03, new RunnableEBaseShape5S0100000_I1_0(this, 28));
        if (this.A02) {
            shutterCallback = null;
        } else {
            shutterCallback = C33081gA.A0d;
        }
        r5.A0W.takePicture(shutterCallback, null, null, new C21320yY(this, A002, rect));
        C21460ym r2 = r5.A0M.A02;
        ReentrantLock reentrantLock = r2.A01;
        reentrantLock.lock();
        try {
            r2.A00 = 0;
            reentrantLock.unlock();
            AtomicBoolean atomicBoolean = r5.A0U;
            synchronized (atomicBoolean) {
                if (AnonymousClass100.A01()) {
                    throw new RuntimeException("Some how photo taking call is happening on the UI Thread!!");
                }
                while (!r5.A0a) {
                    try {
                        atomicBoolean.wait();
                    } catch (InterruptedException e) {
                        Log.e("Camera1Device", "Interrupted while waiting on Camera.takePicture", e);
                    }
                }
            }
            C33081gA.A04(r5, this.A03);
            return null;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
