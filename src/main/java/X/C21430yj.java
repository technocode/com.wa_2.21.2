package X;

import android.hardware.Camera;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.0yj  reason: invalid class name and case insensitive filesystem */
public class C21430yj {
    public final C21120yD A00 = new C21120yD();
    public final C21120yD A01 = new C21120yD();
    public final C21460ym A02 = new C21460ym();
    public volatile C22080zo A03;

    public void A00(Camera camera, boolean z) {
        C21460ym r1 = this.A02;
        ReentrantLock reentrantLock = r1.A01;
        reentrantLock.lock();
        if (camera != null) {
            try {
                if (!r1.A01()) {
                    camera.stopPreview();
                    reentrantLock.lock();
                    try {
                        r1.A00 = 0;
                        if (z) {
                            C21120yD r12 = this.A01;
                            if (!r12.A00.isEmpty()) {
                                AnonymousClass100.A00(new RunnableEBaseShape5S0100000_I1_0(r12.A00, 30));
                            }
                        }
                    } finally {
                        reentrantLock.unlock();
                    }
                }
            } finally {
                reentrantLock.unlock();
            }
        }
        reentrantLock.unlock();
    }
}
