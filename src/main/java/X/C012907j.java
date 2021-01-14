package X;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import com.google.firebase.iid.FirebaseInstanceId;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* renamed from: X.07j  reason: invalid class name and case insensitive filesystem */
public final class C012907j {
    public C013007l A00;
    public Boolean A01;
    public final boolean A02;
    public final /* synthetic */ FirebaseInstanceId A03;

    public C012907j(FirebaseInstanceId firebaseInstanceId, AnonymousClass07M r8) {
        boolean z;
        Boolean bool;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        this.A03 = firebaseInstanceId;
        try {
            Class.forName("com.google.firebase.messaging.FirebaseMessaging");
        } catch (ClassNotFoundException unused) {
            AnonymousClass05T r0 = firebaseInstanceId.A02;
            r0.A03();
            Context context = r0.A00;
            Intent intent = new Intent("com.google.firebase.MESSAGING_EVENT");
            intent.setPackage(context.getPackageName());
            ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
            z = (resolveService == null || resolveService.serviceInfo == null) ? false : z;
        }
        z = true;
        this.A02 = z;
        AnonymousClass05T r02 = this.A03.A02;
        r02.A03();
        Context context2 = r02.A00;
        SharedPreferences sharedPreferences = context2.getSharedPreferences("com.google.firebase.messaging", 0);
        if (sharedPreferences.contains("auto_init")) {
            bool = Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
        } else {
            try {
                PackageManager packageManager = context2.getPackageManager();
                if (!(packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context2.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled"))) {
                    bool = Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
                }
            } catch (PackageManager.NameNotFoundException unused2) {
            }
            bool = null;
        }
        this.A01 = bool;
        if (bool == null && this.A02) {
            C013007l r4 = new C013007l(this);
            this.A00 = r4;
            Executor executor = r8.A02;
            synchronized (r8) {
                C001801b.A1Q(C013107m.class);
                C001801b.A1Q(r4);
                C001801b.A1Q(executor);
                Map map = r8.A01;
                if (!map.containsKey(C013107m.class)) {
                    map.put(C013107m.class, new ConcurrentHashMap());
                }
                ((ConcurrentHashMap) map.get(C013107m.class)).put(r4, executor);
            }
        }
    }

    public final synchronized boolean A00() {
        Boolean bool = this.A01;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (this.A02) {
            AnonymousClass05T r0 = this.A03.A02;
            r0.A03();
            if (r0.A07.get()) {
                return true;
            }
        }
        return false;
    }
}
