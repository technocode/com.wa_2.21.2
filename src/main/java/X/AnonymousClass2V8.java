package X;

import android.os.ConditionVariable;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.2V8  reason: invalid class name */
public final class AnonymousClass2V8 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ ConditionVariable A02;
    public final /* synthetic */ ConditionVariable A03;
    public final /* synthetic */ AnonymousClass0K1 A04;

    public AnonymousClass2V8(AnonymousClass0K1 r1, ConditionVariable conditionVariable, ConditionVariable conditionVariable2, int i, int i2) {
        this.A04 = r1;
        this.A02 = conditionVariable;
        this.A03 = conditionVariable2;
        this.A00 = i;
        this.A01 = i2;
    }

    public void A00() {
        ConditionVariable conditionVariable = this.A03;
        if (conditionVariable != null && this.A00 == 0) {
            conditionVariable.open();
        }
        if (3 == this.A00) {
            AnonymousClass0K1 r2 = this.A04;
            r2.A06.getAndIncrement();
            ReentrantLock reentrantLock = r2.A08;
            if (reentrantLock.isHeldByCurrentThread()) {
                r2.A07.signalAll();
                reentrantLock.unlock();
            }
        }
    }
}
