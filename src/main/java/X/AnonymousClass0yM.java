package X;

import android.hardware.Camera;
import java.util.concurrent.Callable;

/* renamed from: X.0yM  reason: invalid class name */
public class AnonymousClass0yM implements Callable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C33081gA A01;

    public AnonymousClass0yM(C33081gA r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        return Camera.open(this.A00);
    }
}
