package X;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.PowerManager;

/* renamed from: X.0TW  reason: invalid class name */
public class AnonymousClass0TW extends AbstractC06370Sz {
    public final PowerManager A00;
    public final /* synthetic */ AnonymousClass0MW A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass0TW(AnonymousClass0MW r2, Context context) {
        super(r2);
        this.A01 = r2;
        this.A00 = (PowerManager) context.getSystemService("power");
    }

    @Override // X.AbstractC06370Sz
    public int A00() {
        if (Build.VERSION.SDK_INT < 21 || !this.A00.isPowerSaveMode()) {
            return 1;
        }
        return 2;
    }

    @Override // X.AbstractC06370Sz
    public IntentFilter A01() {
        if (Build.VERSION.SDK_INT < 21) {
            return null;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
        return intentFilter;
    }
}
