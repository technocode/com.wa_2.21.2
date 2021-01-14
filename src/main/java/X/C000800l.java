package X;

import android.os.Handler;
import android.os.Looper;
import com.whatsapp.dns.DnsCacheEntrySerializable;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.00l  reason: invalid class name and case insensitive filesystem */
public class C000800l implements AbstractC000900m {
    public static volatile C000800l A02;
    public final AnonymousClass00S A00;
    public final HashMap A01 = new HashMap();

    public C000800l(AnonymousClass00S r4, C003301q r5) {
        this.A00 = r4;
        new Handler(Looper.getMainLooper()).post(new RunnableEBaseShape3S0200000_I0_2(this, r5, 0));
    }

    public static C000800l A00() {
        if (A02 == null) {
            synchronized (C000800l.class) {
                if (A02 == null) {
                    A02 = new C000800l(AnonymousClass00S.A00(), C003301q.A02);
                }
            }
        }
        return A02;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0074, code lost:
        if (r0.length > 0) goto L_0x0076;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C11250fy A01(java.lang.String r15) {
        /*
        // Method dump skipped, instructions count: 286
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C000800l.A01(java.lang.String):X.0fy");
    }

    public final C11250fy A02(String str, boolean z) {
        List list = (List) AnonymousClass1VR.A00.get(str);
        if (list == null || list.isEmpty()) {
            throw new UnknownHostException(AnonymousClass008.A0K("no hardcoded ips found for ", str));
        }
        if (z) {
            A03(str, list, 2);
        }
        return new C11250fy(new C11240fx(2, false), (InetAddress[]) list.toArray(new InetAddress[0]));
    }

    public final void A03(String str, Iterable iterable, int i) {
        long currentTimeMillis = System.currentTimeMillis() + 3600000;
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(new DnsCacheEntrySerializable(Long.valueOf(currentTimeMillis), (InetAddress) it.next(), i));
        }
        synchronized (this) {
            this.A01.put(str, arrayList);
        }
    }

    @Override // X.AbstractC000900m
    public void AEa(AnonymousClass0JF r2) {
        synchronized (this) {
            this.A01.clear();
        }
    }
}
