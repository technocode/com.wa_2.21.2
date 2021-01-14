package X;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.IGmsServiceBroker;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.17s  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC238217s {
    public static final C34671iy[] A0P = new C34671iy[0];
    public int A00;
    public int A01;
    public int A02 = 1;
    public long A03;
    public long A04;
    public long A05;
    public IInterface A06;
    public C34661ix A07 = null;
    public AbstractC237817o A08;
    public ServiceConnectionC238117r A09;
    public IGmsServiceBroker A0A;
    public AnonymousClass18T A0B;
    public AtomicInteger A0C = new AtomicInteger(0);
    public boolean A0D = false;
    public final int A0E;
    public final Context A0F;
    public final Handler A0G;
    public final AbstractC237617m A0H;
    public final AbstractC237717n A0I;
    public final AbstractC238817y A0J;
    public final Object A0K = new Object();
    public final Object A0L = new Object();
    public final String A0M;
    public final ArrayList A0N = new ArrayList();
    public volatile C35321k9 A0O = null;

    public Bundle A5M() {
        return null;
    }

    public boolean AMD() {
        return false;
    }

    public boolean AMu() {
        return true;
    }

    public boolean AMw() {
        return false;
    }

    public AbstractC238217s(Context context, Looper looper, AbstractC238817y r5, AnonymousClass0LQ r6, int i, AbstractC237617m r8, AbstractC237717n r9, String str) {
        C001801b.A1R(context, "Context must not be null");
        this.A0F = context;
        C001801b.A1R(looper, "Looper must not be null");
        C001801b.A1R(r5, "Supervisor must not be null");
        this.A0J = r5;
        C001801b.A1R(r6, "API availability must not be null");
        this.A0G = new HandlerC35151js(this, looper);
        this.A0E = i;
        this.A0H = r8;
        this.A0I = r9;
        this.A0M = str;
    }

    public static boolean A00(AbstractC238217s r2, int i, int i2, IInterface iInterface) {
        synchronized (r2.A0K) {
            if (r2.A02 != i) {
                return false;
            }
            r2.A05(i2, iInterface);
            return true;
        }
    }

    public final IInterface A01() {
        IInterface iInterface;
        synchronized (this.A0K) {
            if (this.A02 == 5) {
                throw new DeadObjectException();
            } else if (isConnected()) {
                boolean z = false;
                if (this.A06 != null) {
                    z = true;
                }
                C001801b.A1b(z, "Client is connected but service is null");
                iInterface = this.A06;
            } else {
                throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
            }
        }
        return iInterface;
    }

    public String A02() {
        if (this instanceof AnonymousClass29M) {
            return "com.google.android.gms.wearable.internal.IWearableService";
        }
        if (this instanceof AnonymousClass29K) {
            return "com.google.android.gms.signin.internal.ISignInService";
        }
        if (this instanceof AnonymousClass29I) {
            return "com.google.android.gms.safetynet.internal.ISafetyNetService";
        }
        if (this instanceof AnonymousClass29F) {
            return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
        }
        if (this instanceof AnonymousClass29E) {
            return "com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferService";
        }
        if (this instanceof AnonymousClass29C) {
            return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
        }
        if (!(this instanceof AnonymousClass29B)) {
            return !(this instanceof AnonymousClass29A) ? "com.google.android.gms.auth.api.signin.internal.ISignInService" : "com.google.android.gms.common.internal.service.ICommonService";
        }
        return "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService";
    }

    public String A03() {
        if (this instanceof AnonymousClass29M) {
            return "com.google.android.gms.wearable.BIND";
        }
        if (this instanceof AnonymousClass29K) {
            return "com.google.android.gms.signin.service.START";
        }
        if (this instanceof AnonymousClass29I) {
            return "com.google.android.gms.safetynet.service.START";
        }
        if (this instanceof AnonymousClass29F) {
            return "com.google.android.location.internal.GoogleLocationManagerService.START";
        }
        if (this instanceof AnonymousClass29E) {
            return "com.google.android.gms.auth.api.accounttransfer.service.START";
        }
        if (this instanceof AnonymousClass29C) {
            return "com.google.android.gms.auth.api.credentials.service.START";
        }
        if (!(this instanceof AnonymousClass29B)) {
            return !(this instanceof AnonymousClass29A) ? "com.google.android.gms.auth.api.signin.service.START" : "com.google.android.gms.common.service.START";
        }
        return "com.google.android.gms.auth.api.phone.service.SmsRetrieverApiService.START";
    }

    public void A04(int i, IBinder iBinder, Bundle bundle, int i2) {
        Handler handler = this.A0G;
        handler.sendMessage(handler.obtainMessage(1, i2, -1, new AnonymousClass267(this, i, iBinder, bundle)));
    }

    public final void A05(int i, IInterface iInterface) {
        String str;
        String str2;
        AnonymousClass18T r0;
        boolean z = false;
        if (i == 4) {
            z = true;
        }
        boolean z2 = false;
        if (iInterface != null) {
            z2 = true;
        }
        boolean z3 = false;
        if (z == z2) {
            z3 = true;
        }
        C001801b.A1Y(z3);
        synchronized (this.A0K) {
            this.A02 = i;
            this.A06 = iInterface;
            if (i != 1) {
                if (i == 2 || i == 3) {
                    if (!(this.A09 == null || (r0 = this.A0B) == null)) {
                        String str3 = r0.A02;
                        String str4 = r0.A01;
                        StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 70 + String.valueOf(str4).length());
                        sb.append("Calling connect() while still connected, missing disconnect() for ");
                        sb.append(str3);
                        sb.append(" on ");
                        sb.append(str4);
                        Log.e("GmsClient", sb.toString());
                        AbstractC238817y r6 = this.A0J;
                        AnonymousClass18T r02 = this.A0B;
                        String str5 = r02.A02;
                        String str6 = r02.A01;
                        ServiceConnectionC238117r r2 = this.A09;
                        String str7 = this.A0M;
                        if (str7 == null) {
                            str7 = this.A0F.getClass().getName();
                        }
                        if (r6 != null) {
                            r6.A01(new C238717x(str5, str6), r2, str7);
                            this.A0C.incrementAndGet();
                        } else {
                            throw null;
                        }
                    }
                    this.A09 = new ServiceConnectionC238117r(this, this.A0C.get());
                    if (!(this instanceof AnonymousClass29M)) {
                        str2 = "com.google.android.gms";
                    } else {
                        str2 = "com.google.android.wearable.app.cn";
                        if (!((AnonymousClass29M) this).A08.A02()) {
                            str2 = "com.google.android.gms";
                        }
                    }
                    AnonymousClass18T r1 = new AnonymousClass18T(str2, A03());
                    this.A0B = r1;
                    AbstractC238817y r62 = this.A0J;
                    String str8 = r1.A02;
                    String str9 = r1.A01;
                    ServiceConnectionC238117r r22 = this.A09;
                    String str10 = this.A0M;
                    if (str10 == null) {
                        str10 = this.A0F.getClass().getName();
                    }
                    if (!r62.A02(new C238717x(str8, str9), r22, str10)) {
                        AnonymousClass18T r03 = this.A0B;
                        String str11 = r03.A02;
                        String str12 = r03.A01;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str11).length() + 34 + String.valueOf(str12).length());
                        sb2.append("unable to connect to service: ");
                        sb2.append(str11);
                        sb2.append(" on ");
                        sb2.append(str12);
                        Log.e("GmsClient", sb2.toString());
                        int i2 = this.A0C.get();
                        Handler handler = this.A0G;
                        handler.sendMessage(handler.obtainMessage(7, i2, -1, new AnonymousClass268(this, 16)));
                    }
                } else if (i == 4) {
                    this.A04 = System.currentTimeMillis();
                }
            } else if (this.A09 != null) {
                AbstractC238817y r63 = this.A0J;
                String A032 = A03();
                if (!(this instanceof AnonymousClass29M)) {
                    str = "com.google.android.gms";
                } else {
                    str = "com.google.android.wearable.app.cn";
                    if (!((AnonymousClass29M) this).A08.A02()) {
                        str = "com.google.android.gms";
                    }
                }
                ServiceConnectionC238117r r3 = this.A09;
                String str13 = this.A0M;
                if (str13 == null) {
                    str13 = this.A0F.getClass().getName();
                }
                if (r63 != null) {
                    r63.A01(new C238717x(A032, str), r3, str13);
                    this.A09 = null;
                } else {
                    throw null;
                }
            }
        }
    }

    public void A06(C34661ix r3) {
        this.A01 = r3.A01;
        this.A05 = System.currentTimeMillis();
    }

    public void A2x(AbstractC237817o r3) {
        C001801b.A1R(r3, "Connection progress callbacks cannot be null.");
        this.A08 = r3;
        A05(2, null);
    }

    public void A3k() {
        this.A0C.incrementAndGet();
        ArrayList arrayList = this.A0N;
        synchronized (arrayList) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                AbstractC238017q r1 = (AbstractC238017q) arrayList.get(i);
                synchronized (r1) {
                    r1.A00 = null;
                }
            }
            arrayList.clear();
        }
        synchronized (this.A0L) {
            this.A0A = null;
        }
        A05(1, null);
    }

    public void A3y(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i;
        IInterface iInterface;
        IGmsServiceBroker iGmsServiceBroker;
        synchronized (this.A0K) {
            i = this.A02;
            iInterface = this.A06;
        }
        synchronized (this.A0L) {
            iGmsServiceBroker = this.A0A;
        }
        printWriter.append((CharSequence) str).append("mConnectState=");
        if (i == 1) {
            printWriter.print("DISCONNECTED");
        } else if (i == 2) {
            printWriter.print("REMOTE_CONNECTING");
        } else if (i == 3) {
            printWriter.print("LOCAL_CONNECTING");
        } else if (i == 4) {
            printWriter.print("CONNECTED");
        } else if (i != 5) {
            printWriter.print("UNKNOWN");
        } else {
            printWriter.print("DISCONNECTING");
        }
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.append("null");
        } else {
            printWriter.append((CharSequence) A02()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (iGmsServiceBroker == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(iGmsServiceBroker.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.A04 > 0) {
            PrintWriter append = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j = this.A04;
            String format = simpleDateFormat.format(new Date(j));
            StringBuilder sb = new StringBuilder(String.valueOf(format).length() + 21);
            sb.append(j);
            sb.append(" ");
            sb.append(format);
            append.println(sb.toString());
        }
        if (this.A03 > 0) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            int i2 = this.A00;
            if (i2 == 1) {
                printWriter.append("CAUSE_SERVICE_DISCONNECTED");
            } else if (i2 != 2) {
                printWriter.append((CharSequence) String.valueOf(i2));
            } else {
                printWriter.append("CAUSE_NETWORK_LOST");
            }
            PrintWriter append2 = printWriter.append(" lastSuspendedTime=");
            long j2 = this.A03;
            String format2 = simpleDateFormat.format(new Date(j2));
            StringBuilder sb2 = new StringBuilder(String.valueOf(format2).length() + 21);
            sb2.append(j2);
            sb2.append(" ");
            sb2.append(format2);
            append2.println(sb2.toString());
        }
        if (this.A05 > 0) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) AnonymousClass0N2.A0q(this.A01));
            PrintWriter append3 = printWriter.append(" lastFailedTime=");
            long j3 = this.A05;
            String format3 = simpleDateFormat.format(new Date(j3));
            StringBuilder sb3 = new StringBuilder(String.valueOf(format3).length() + 21);
            sb3.append(j3);
            sb3.append(" ");
            sb3.append(format3);
            append3.println(sb3.toString());
        }
    }

    public final C34671iy[] A4q() {
        C35321k9 r0 = this.A0O;
        if (r0 == null) {
            return null;
        }
        return r0.A01;
    }

    public String A6D() {
        AnonymousClass18T r0;
        if (isConnected() && (r0 = this.A0B) != null) {
            return r0.A01;
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    public void A8h(IAccountAccessor iAccountAccessor, Set set) {
        Bundle bundle;
        if (this instanceof AnonymousClass29K) {
            AnonymousClass29K r3 = (AnonymousClass29K) this;
            String str = r3.A02.A02;
            if (!r3.A0F.getPackageName().equals(str)) {
                r3.A01.putString("com.google.android.gms.signin.internal.realClientPackageName", str);
            }
            bundle = r3.A01;
        } else if (this instanceof AnonymousClass29F) {
            bundle = new Bundle();
            bundle.putString("client_name", ((AnonymousClass29F) this).A01);
        } else if (this instanceof AnonymousClass29E) {
            bundle = ((AnonymousClass29E) this).A00;
        } else if (!(this instanceof AnonymousClass29C)) {
            bundle = new Bundle();
        } else {
            C34551ii r32 = ((AnonymousClass29C) this).A00;
            if (r32 == null) {
                bundle = new Bundle();
            } else {
                bundle = new Bundle();
                bundle.putString("consumer_package", null);
                bundle.putBoolean("force_save_dialog", r32.A00);
            }
        }
        C35171ju r4 = new C35171ju(this.A0E);
        r4.A04 = this.A0F.getPackageName();
        r4.A02 = bundle;
        if (set != null) {
            r4.A08 = (Scope[]) set.toArray(new Scope[set.size()]);
        }
        if (AMw()) {
            r4.A01 = new Account("<<default account>>", "com.google");
            if (iAccountAccessor != null) {
                r4.A03 = iAccountAccessor.asBinder();
            }
        }
        C34671iy[] r0 = A0P;
        r4.A06 = r0;
        r4.A07 = r0;
        try {
            synchronized (this.A0L) {
                IGmsServiceBroker iGmsServiceBroker = this.A0A;
                if (iGmsServiceBroker != null) {
                    iGmsServiceBroker.A91(new AnonymousClass266(this, this.A0C.get()), r4);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            Handler handler = this.A0G;
            handler.sendMessage(handler.obtainMessage(6, this.A0C.get(), 1));
        } catch (SecurityException e2) {
            throw e2;
        } catch (RemoteException | RuntimeException e3) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e3);
            A04(8, null, null, this.A0C.get());
        }
    }

    public Intent A95() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        if (r2 == 3) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean AAw() {
        /*
            r4 = this;
            java.lang.Object r3 = r4.A0K
            monitor-enter(r3)
            int r2 = r4.A02     // Catch:{ all -> 0x000f }
            r0 = 2
            if (r2 == r0) goto L_0x000c
            r1 = 3
            r0 = 0
            if (r2 != r1) goto L_0x000d
        L_0x000c:
            r0 = 1
        L_0x000d:
            monitor-exit(r3)     // Catch:{ all -> 0x000f }
            return r0
        L_0x000f:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x000f }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC238217s.AAw():boolean");
    }

    public void ALc(AbstractC237917p r4) {
        C34971jW r42 = (C34971jW) r4;
        r42.A00.A0C.A05.post(new RunnableEBaseShape5S0100000_I1_0(r42, 44));
    }

    public boolean isConnected() {
        boolean z;
        synchronized (this.A0K) {
            z = false;
            if (this.A02 == 4) {
                z = true;
            }
        }
        return z;
    }
}
