package X;

import android.opengl.GLES20;
import com.whatsapp.util.Log;
import java.util.concurrent.Callable;

/* renamed from: X.37x  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class CallableC672737x implements Callable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C72723Tz A02;

    public /* synthetic */ CallableC672737x(C72723Tz r1, int i, int i2) {
        this.A02 = r1;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C72723Tz r4 = this.A02;
        int i = this.A00;
        int i2 = this.A01;
        if (C72723Tz.A00(r4.A03)) {
            return -6;
        }
        int i3 = 0;
        while (true) {
            if (r4.A03.A02() == i && r4.A03.A01() == i2) {
                r4.A07.setWindow(0, 0, i, i2);
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
                GLES20.glClear(16384);
                r4.A01();
                return 0;
            }
            i3++;
            if (i3 > 3) {
                Log.i("failed to flush buffer to update window size, drop frame");
                return -4;
            }
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
            GLES20.glClear(16384);
            r4.A01();
        }
    }
}
