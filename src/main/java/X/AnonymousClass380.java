package X;

import android.opengl.GLES20;
import java.util.concurrent.Callable;

/* renamed from: X.380  reason: invalid class name */
public final /* synthetic */ class AnonymousClass380 implements Callable {
    public final /* synthetic */ C72723Tz A00;

    public /* synthetic */ AnonymousClass380(C72723Tz r1) {
        this.A00 = r1;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C72723Tz r2 = this.A00;
        if (C72723Tz.A00(r2.A03)) {
            return -6;
        }
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16384);
        return Integer.valueOf(r2.A01());
    }
}
