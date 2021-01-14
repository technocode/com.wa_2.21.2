package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1Ed  reason: invalid class name and case insensitive filesystem */
public final class ServiceConnectionC25021Ed implements ServiceConnection {
    public int A00 = 0;
    public C25051Eg A01;
    public final Messenger A02 = new Messenger(new HandlerC012707h(Looper.getMainLooper(), new C25031Ee(this)));
    public final SparseArray A03 = new SparseArray();
    public final Queue A04 = new ArrayDeque();
    public final /* synthetic */ C25011Ec A05;

    public ServiceConnectionC25021Ed(C25011Ec r4) {
        this.A05 = r4;
    }

    public final synchronized void A00() {
        if (this.A00 == 2 && this.A04.isEmpty() && this.A03.size() == 0) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
            }
            this.A00 = 3;
            C239618g A002 = C239618g.A00();
            Context context = this.A05.A02;
            if (A002 != null) {
                context.unbindService(this);
            } else {
                throw null;
            }
        }
    }

    public final synchronized void A01(int i, String str) {
        String str2;
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2 = "Disconnected: ".concat(valueOf);
            } else {
                str2 = new String("Disconnected: ");
            }
            Log.d("MessengerIpcClient", str2);
        }
        int i2 = this.A00;
        if (i2 == 0) {
            throw new IllegalStateException();
        } else if (i2 == 1 || i2 == 2) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.A00 = 4;
            C239618g A002 = C239618g.A00();
            Context context = this.A05.A02;
            if (A002 != null) {
                context.unbindService(this);
                C25061Eh r3 = new C25061Eh(i, str);
                Queue<AnonymousClass1Ei> queue = this.A04;
                for (AnonymousClass1Ei r0 : queue) {
                    r0.A00(r3);
                }
                queue.clear();
                int i3 = 0;
                while (true) {
                    SparseArray sparseArray = this.A03;
                    if (i3 < sparseArray.size()) {
                        ((AnonymousClass1Ei) sparseArray.valueAt(i3)).A00(r3);
                        i3++;
                    } else {
                        sparseArray.clear();
                        return;
                    }
                }
            } else {
                throw null;
            }
        } else if (i2 == 3) {
            this.A00 = 4;
        } else if (i2 != 4) {
            StringBuilder sb = new StringBuilder(26);
            sb.append("Unknown state: ");
            sb.append(i2);
            throw new IllegalStateException(sb.toString());
        }
    }

    public final synchronized boolean A02(AnonymousClass1Ei r7) {
        int i = this.A00;
        if (i == 0) {
            this.A04.add(r7);
            boolean z = false;
            if (this.A00 == 0) {
                z = true;
            }
            C001801b.A1Z(z);
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Starting bind to GmsCore");
            }
            this.A00 = 1;
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            C239618g A002 = C239618g.A00();
            C25011Ec r1 = this.A05;
            Context context = r1.A02;
            if (A002 != null) {
                if (!C239618g.A01(context, intent, this, 1)) {
                    A01(0, "Unable to bind to service");
                } else {
                    r1.A03.schedule(new RunnableEBaseShape6S0100000_I1_1(this, 3), 30, TimeUnit.SECONDS);
                }
                return true;
            }
            throw null;
        } else if (i == 1) {
            this.A04.add(r7);
            return true;
        } else if (i == 2) {
            this.A04.add(r7);
            this.A05.A03.execute(new RunnableC25041Ef(this));
            return true;
        } else if (i == 3 || i == 4) {
            return false;
        } else {
            StringBuilder sb = new StringBuilder(26);
            sb.append("Unknown state: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
    }

    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        if (iBinder == null) {
            A01(0, "Null service connection");
            return;
        }
        try {
            this.A01 = new C25051Eg(iBinder);
            this.A00 = 2;
            this.A05.A03.execute(new RunnableC25041Ef(this));
        } catch (RemoteException e) {
            A01(0, e.getMessage());
        }
    }

    public final synchronized void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        A01(2, "Service disconnected");
    }
}
