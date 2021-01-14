package X;

import android.content.ComponentName;
import android.content.Context;
import android.os.PowerManager;

/* renamed from: X.1aP  reason: invalid class name and case insensitive filesystem */
public final class C29911aP extends AbstractC14520mQ {
    public boolean A00;
    public boolean A01;
    public final Context A02;
    public final PowerManager.WakeLock A03;
    public final PowerManager.WakeLock A04;

    public C29911aP(Context context, ComponentName componentName) {
        super(componentName);
        this.A02 = context.getApplicationContext();
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        StringBuilder sb = new StringBuilder();
        sb.append(componentName.getClassName());
        sb.append(":launch");
        PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, sb.toString());
        this.A03 = newWakeLock;
        newWakeLock.setReferenceCounted(false);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(componentName.getClassName());
        sb2.append(":run");
        PowerManager.WakeLock newWakeLock2 = powerManager.newWakeLock(1, sb2.toString());
        this.A04 = newWakeLock2;
        newWakeLock2.setReferenceCounted(false);
    }
}
