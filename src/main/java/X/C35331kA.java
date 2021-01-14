package X;

import android.content.ComponentName;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.HashMap;

/* renamed from: X.1kA  reason: invalid class name and case insensitive filesystem */
public final class C35331kA extends AbstractC238817y implements Handler.Callback {
    public final long A00;
    public final long A01;
    public final Context A02;
    public final Handler A03;
    public final C239618g A04;
    public final HashMap A05 = new HashMap();

    public C35331kA(Context context) {
        this.A02 = context.getApplicationContext();
        this.A03 = new HandlerC242019j(context.getMainLooper(), this);
        this.A04 = C239618g.A00();
        this.A00 = 5000;
        this.A01 = 300000;
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            HashMap hashMap = this.A05;
            synchronized (hashMap) {
                C238717x r4 = (C238717x) message.obj;
                AnonymousClass18R r3 = (AnonymousClass18R) hashMap.get(r4);
                if (r3 != null && r3.A05.isEmpty()) {
                    if (r3.A03) {
                        C35331kA r2 = r3.A06;
                        r2.A03.removeMessages(1, r3.A04);
                        C239618g r1 = r2.A04;
                        Context context = r2.A02;
                        if (r1 != null) {
                            context.unbindService(r3);
                            r3.A03 = false;
                            r3.A00 = 2;
                        } else {
                            throw null;
                        }
                    }
                    hashMap.remove(r4);
                }
            }
            return true;
        } else if (i != 1) {
            return false;
        } else {
            HashMap hashMap2 = this.A05;
            synchronized (hashMap2) {
                C238717x r7 = (C238717x) message.obj;
                AnonymousClass18R r5 = (AnonymousClass18R) hashMap2.get(r7);
                if (r5 != null && r5.A00 == 3) {
                    String valueOf = String.valueOf(r7);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 47);
                    sb.append("Timeout waiting for ServiceConnection callback ");
                    sb.append(valueOf);
                    Log.wtf("GmsClientSupervisor", sb.toString(), new Exception());
                    ComponentName componentName = r5.A01;
                    if (componentName == null && (componentName = r7.A01) == null) {
                        componentName = new ComponentName(r7.A03, "unknown");
                    }
                    r5.onServiceDisconnected(componentName);
                }
            }
            return true;
        }
    }
}
