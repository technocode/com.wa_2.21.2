package X;

import android.content.Context;
import android.util.Log;
import java.util.HashMap;

/* renamed from: X.16D  reason: invalid class name */
public class AnonymousClass16D {
    public AnonymousClass16r A00;
    public AnonymousClass19J A01;
    public boolean A02;
    public final long A03;
    public final Context A04;
    public final Object A05 = new Object();
    public final boolean A06;

    public AnonymousClass16D(Context context, boolean z, boolean z2) {
        Context applicationContext;
        C001801b.A1Q(context);
        if (z && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.A04 = context;
        this.A02 = false;
        this.A03 = -1;
        this.A06 = z2;
    }

    public void finalize() {
        A02();
        super.finalize();
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0035 A[Catch:{ all -> 0x003a }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0044 A[Catch:{ all -> 0x004b }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0046 A[Catch:{ all -> 0x004b }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x005f A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass16B A00(android.content.Context r15) {
        /*
        // Method dump skipped, instructions count: 384
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass16D.A00(android.content.Context):X.16B");
    }

    public static final void A01(AnonymousClass16B r5, boolean z, float f, long j, String str, Throwable th) {
        if (Math.random() <= ((double) f)) {
            HashMap hashMap = new HashMap();
            String str2 = "1";
            String str3 = "0";
            if (z) {
                str3 = str2;
            }
            hashMap.put("app_context", str3);
            if (r5 != null) {
                if (!r5.A01) {
                    str2 = "0";
                }
                hashMap.put("limit_ad_tracking", str2);
                String str4 = r5.A00;
                if (str4 != null) {
                    hashMap.put("ad_id_size", Integer.toString(str4.length()));
                }
            }
            if (th != null) {
                hashMap.put("error", th.getClass().getName());
            }
            if (str != null && !str.isEmpty()) {
                hashMap.put("experiment_id", str);
            }
            hashMap.put("tag", "AdvertisingIdClient");
            hashMap.put("time_spent", Long.toString(j));
            new AnonymousClass16E(hashMap).start();
        }
    }

    public final void A02() {
        C001801b.A1U("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            Context context = this.A04;
            if (context != null && this.A00 != null) {
                try {
                    if (this.A02) {
                        C239618g A002 = C239618g.A00();
                        AnonymousClass16r r0 = this.A00;
                        if (A002 != null) {
                            context.unbindService(r0);
                        } else {
                            throw null;
                        }
                    }
                } catch (Throwable th) {
                    Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
                }
                this.A02 = false;
                this.A01 = null;
                this.A00 = null;
            }
        }
    }
}
