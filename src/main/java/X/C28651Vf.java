package X;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import com.whatsapp.util.Log;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* renamed from: X.1Vf  reason: invalid class name and case insensitive filesystem */
public class C28651Vf {
    public static volatile C28651Vf A06;
    public final AnonymousClass00G A00;
    public final AbstractC28721Vm A01;
    public final C28821Vw A02;
    public final C28841Vy A03;
    public final C28851Vz A04;
    public final ExecutorService A05;

    public C28651Vf(AnonymousClass00G r1, C28821Vw r2, ExecutorService executorService, C28841Vy r4, C28851Vz r5, AbstractC28721Vm r6) {
        this.A00 = r1;
        this.A02 = r2;
        this.A05 = executorService;
        this.A03 = r4;
        this.A04 = r5;
        this.A01 = r6;
    }

    public final void A00(String str, String str2, boolean z) {
        try {
            if (this.A03.A02(str2).A03) {
                Intent intent = new Intent("com.whatsapp.action.INSTRUMENTATION_CALLBACK_SERVICE").setPackage(str2);
                try {
                    List<ResolveInfo> queryIntentServices = this.A04.A00.queryIntentServices(intent, 0);
                    if (!queryIntentServices.isEmpty()) {
                        if (queryIntentServices.size() <= 1) {
                            ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
                            if (serviceInfo == null || !"com.whatsapp.permission.BROADCAST".equals(serviceInfo.permission)) {
                                throw new SecurityException(AnonymousClass008.A0K("Service not protected by permission ", "com.whatsapp.permission.BROADCAST"));
                            }
                        } else {
                            StringBuilder A0S = AnonymousClass008.A0S("Multiple services can handle this intent ");
                            A0S.append(intent.getAction());
                            throw new SecurityException(A0S.toString());
                        }
                    }
                    if (!this.A00.A00.bindService(intent, new ServiceConnectionC28641Ve(this, str, str2, z), 1)) {
                        Log.w("CallbackServiceProxy/Failed to bind to stella service");
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    Log.e("CallbackServiceProxy/Failed to bind to stella service", th);
                    return;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        Log.w("CallbackServiceProxy/verification failed, dropping event");
    }
}
