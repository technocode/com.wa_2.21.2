package X;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* renamed from: X.19D  reason: invalid class name */
public final class AnonymousClass19D implements Callable {
    public final /* synthetic */ SharedPreferences A00;
    public final /* synthetic */ Long A01;
    public final /* synthetic */ String A02;

    public AnonymousClass19D(SharedPreferences sharedPreferences, String str, Long l) {
        this.A00 = sharedPreferences;
        this.A02 = str;
        this.A01 = l;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        return Long.valueOf(this.A00.getLong(this.A02, this.A01.longValue()));
    }
}
