package X;

import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import java.util.concurrent.Callable;

/* renamed from: X.0qk  reason: invalid class name and case insensitive filesystem */
public class CallableC16960qk implements Callable {
    public final /* synthetic */ ShortcutInfoCompatSaverImpl A00;
    public final /* synthetic */ String A01;

    public CallableC16960qk(ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl, String str) {
        this.A00 = shortcutInfoCompatSaverImpl;
        this.A01 = str;
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        return this.A00.A04.get(this.A01);
    }
}
