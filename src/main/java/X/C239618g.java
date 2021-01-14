package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.util.Log;

/* renamed from: X.18g  reason: invalid class name and case insensitive filesystem */
public class C239618g {
    public static final Object A00 = new Object();
    public static volatile C239618g A01;

    public static C239618g A00() {
        if (A01 == null) {
            synchronized (A00) {
                if (A01 == null) {
                    A01 = new C239618g();
                }
            }
        }
        return A01;
    }

    public static final boolean A01(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            try {
                if ((C04660Lg.A00(context).A00.getPackageManager().getApplicationInfo(component.getPackageName(), 0).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return context.bindService(intent, serviceConnection, i);
    }
}
