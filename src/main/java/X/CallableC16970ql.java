package X;

import android.graphics.BitmapFactory;
import java.util.concurrent.Callable;

/* renamed from: X.0ql  reason: invalid class name and case insensitive filesystem */
public class CallableC16970ql implements Callable {
    public final /* synthetic */ C16980qm A00;

    public CallableC16970ql(C16980qm r1) {
        this.A00 = r1;
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        return BitmapFactory.decodeFile(this.A00.A01);
    }
}
