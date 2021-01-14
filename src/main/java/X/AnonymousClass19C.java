package X;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* renamed from: X.19C  reason: invalid class name */
public final class AnonymousClass19C implements Callable {
    public final /* synthetic */ SharedPreferences A00;
    public final /* synthetic */ Integer A01;
    public final /* synthetic */ String A02;

    public AnonymousClass19C(SharedPreferences sharedPreferences, String str, Integer num) {
        this.A00 = sharedPreferences;
        this.A02 = str;
        this.A01 = num;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        return Integer.valueOf(this.A00.getInt(this.A02, this.A01.intValue()));
    }
}
