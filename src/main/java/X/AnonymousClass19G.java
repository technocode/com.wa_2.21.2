package X;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: X.19G  reason: invalid class name */
public final class AnonymousClass19G implements Callable {
    public final /* synthetic */ Context A00;

    public AnonymousClass19G(Context context) {
        this.A00 = context;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        return this.A00.getSharedPreferences("google_sdk_flags", 0);
    }
}
