package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.IBinder;
import android.os.Process;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: X.1Ep  reason: invalid class name */
public final class AnonymousClass1Ep implements ServiceConnection {
    public AnonymousClass1En A00;
    public boolean A01 = false;
    public final Context A02;
    public final Intent A03;
    public final Queue A04 = new ArrayDeque();
    public final ScheduledExecutorService A05;

    public AnonymousClass1Ep(Context context, String str) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(0, new ThreadFactoryC240418r("Firebase-FirebaseInstanceIdServiceConnection"));
        this.A02 = context.getApplicationContext();
        this.A03 = new Intent(str).setPackage(this.A02.getPackageName());
        this.A05 = scheduledThreadPoolExecutor;
    }

    public final synchronized void A00() {
        Queue queue;
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "flush queue called");
        }
        while (true) {
            queue = this.A04;
            if (!queue.isEmpty()) {
                if (Log.isLoggable("EnhancedIntentService", 3)) {
                    Log.d("EnhancedIntentService", "found intent to be delivered");
                }
                AnonymousClass1En r0 = this.A00;
                if (r0 != null && r0.isBinderAlive()) {
                    if (Log.isLoggable("EnhancedIntentService", 3)) {
                        Log.d("EnhancedIntentService", "binder is alive, sending the intent.");
                    }
                    AnonymousClass1Em r6 = (AnonymousClass1Em) queue.poll();
                    AnonymousClass1En r3 = this.A00;
                    if (Binder.getCallingUid() == Process.myUid()) {
                        if (Log.isLoggable("EnhancedIntentService", 3)) {
                            Log.d("EnhancedIntentService", "service received new intent via bind strategy");
                        }
                        AnonymousClass1El r1 = r3.A00;
                        if (r1.A02(r6.A02)) {
                            r6.A00();
                        } else {
                            if (Log.isLoggable("EnhancedIntentService", 3)) {
                                Log.d("EnhancedIntentService", "intent being queued for bg execution");
                            }
                            r1.A04.execute(new RunnableEBaseShape6S0200000_I1_1(r6, r3, 0));
                        }
                    } else {
                        throw new SecurityException("Binding only allowed within app");
                    }
                }
            } else {
                return;
            }
        }
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            boolean z = false;
            if (!this.A01) {
                z = true;
            }
            StringBuilder sb = new StringBuilder(39);
            sb.append("binder is dead. start connection? ");
            sb.append(z);
            Log.d("EnhancedIntentService", sb.toString());
        }
        if (!this.A01) {
            this.A01 = true;
            try {
                C239618g.A00();
                if (!C239618g.A01(this.A02, this.A03, this, 65)) {
                    Log.e("EnhancedIntentService", "binding to the service failed");
                    this.A01 = false;
                    while (!queue.isEmpty()) {
                        ((AnonymousClass1Em) queue.poll()).A00();
                    }
                }
            } catch (SecurityException e) {
                Log.e("EnhancedIntentService", "Exception while binding the service", e);
            }
        }
    }

    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            String valueOf = String.valueOf(componentName);
            StringBuilder sb = new StringBuilder(valueOf.length() + 20);
            sb.append("onServiceConnected: ");
            sb.append(valueOf);
            Log.d("EnhancedIntentService", sb.toString());
        }
        this.A01 = false;
        if (!(iBinder instanceof AnonymousClass1En)) {
            String valueOf2 = String.valueOf(iBinder);
            StringBuilder sb2 = new StringBuilder(valueOf2.length() + 28);
            sb2.append("Invalid service connection: ");
            sb2.append(valueOf2);
            Log.e("EnhancedIntentService", sb2.toString());
            while (true) {
                Queue queue = this.A04;
                if (!queue.isEmpty()) {
                    ((AnonymousClass1Em) queue.poll()).A00();
                } else {
                    return;
                }
            }
        } else {
            this.A00 = (AnonymousClass1En) iBinder;
            A00();
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            String valueOf = String.valueOf(componentName);
            StringBuilder sb = new StringBuilder(valueOf.length() + 23);
            sb.append("onServiceDisconnected: ");
            sb.append(valueOf);
            Log.d("EnhancedIntentService", sb.toString());
        }
        A00();
    }
}
