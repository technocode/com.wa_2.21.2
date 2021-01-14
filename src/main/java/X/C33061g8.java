package X;

import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.1g8  reason: invalid class name and case insensitive filesystem */
public class C33061g8 implements AbstractC21150yG {
    public final /* synthetic */ C33081gA A00;

    public C33061g8(C33081gA r1) {
        this.A00 = r1;
    }

    /* JADX INFO: finally extract failed */
    @Override // X.AbstractC21150yG
    public void AIn(C22070zn r6) {
        C33081gA r1 = this.A00;
        r1.AMf(r1.A0I);
        C21430yj r4 = r1.A0M;
        C21460ym r3 = r4.A02;
        ReentrantLock reentrantLock = r3.A01;
        reentrantLock.lock();
        try {
            reentrantLock.lock();
            try {
                boolean z = true;
                if ((r3.A00 & 1) != 1) {
                    z = false;
                }
                reentrantLock.unlock();
                reentrantLock.lock();
                try {
                    if (!r3.A01()) {
                        r3.A00 = (r3.A00 | 2) & -2;
                    }
                    reentrantLock.unlock();
                    if (z) {
                        C22100zr.A00();
                        C21120yD r12 = r4.A00;
                        if (!r12.A00.isEmpty()) {
                            AnonymousClass100.A00(new RunnableEBaseShape5S0100000_I1_0(r12.A00, 29));
                        }
                    }
                } finally {
                    reentrantLock.unlock();
                }
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }
}
