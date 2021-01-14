package X;

import android.util.SparseArray;
import java.util.concurrent.Callable;

/* renamed from: X.0yL  reason: invalid class name and case insensitive filesystem */
public class CallableC21200yL implements Callable {
    public final /* synthetic */ C33081gA A00;
    public final /* synthetic */ C22020zi A01;

    public CallableC21200yL(C33081gA r1, C22020zi r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        C33081gA r4 = this.A00;
        if (r4.isConnected()) {
            C21950zb r3 = r4.A0P;
            C22020zi r2 = this.A01;
            AnonymousClass0VV r0 = r4.A06;
            SparseArray sparseArray = r3.A02;
            r0.A01();
            ((C33331gZ) sparseArray.get(r0.mCameraId)).A02(r2);
            return r3.A02(r4.A06);
        }
        throw new C21100yB("Cannot modify settings");
    }
}
