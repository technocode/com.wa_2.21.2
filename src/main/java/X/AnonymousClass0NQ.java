package X;

import android.util.Pair;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: X.0NQ  reason: invalid class name */
public class AnonymousClass0NQ implements AnonymousClass09O {
    public long A00 = 0;
    public final AnonymousClass00S A01;
    public final AnonymousClass09H A02;
    public final AnonymousClass0CT A03;

    public AnonymousClass0NQ(AnonymousClass00S r3, AnonymousClass09H r4, AnonymousClass0CT r5) {
        this.A01 = r3;
        this.A02 = r4;
        this.A03 = r5;
    }

    @Override // X.AnonymousClass09O
    public void AEv(String str) {
        synchronized (this) {
            this.A00 = 0;
        }
        Log.w("routeselector/on delivery failure");
        this.A03.A08(0, 0);
    }

    @Override // X.AnonymousClass09O
    public void AFd(String str, AnonymousClass0M5 r6) {
        synchronized (this) {
            this.A00 = 0;
        }
        Pair A002 = AnonymousClass30d.A00(r6);
        if (A002 != null) {
            this.A03.A08(((Number) A002.first).intValue(), ((Number) A002.second).intValue());
        }
    }

    @Override // X.AnonymousClass09O
    public void AKk(String str, AnonymousClass0M5 r44) {
        long j;
        synchronized (this) {
            j = this.A00;
            this.A00 = 0;
        }
        AnonymousClass0CT r3 = this.A03;
        AnonymousClass0M5 A0E = r44.A0E("media_conn");
        String A0G = A0E.A0G("id", null);
        String A0F = A0E.A0F("auth");
        long A06 = A0E.A06("ttl");
        long A062 = A0E.A06("auth_ttl");
        long A07 = A0E.A07("max_buckets", 0);
        int A05 = A0E.A05("is_new", 1);
        int A052 = A0E.A05("max_auto_download_retry", 3);
        int A053 = A0E.A05("max_manual_retry", 3);
        AnonymousClass0M5[] r7 = A0E.A03;
        ArrayList arrayList = new ArrayList();
        if (r7 != null) {
            for (AnonymousClass0M5 r0 : r7) {
                if ("host".equals(r0.A00)) {
                    String A0F2 = r0.A0F("hostname");
                    String A0G2 = r0.A0G("ip4", null);
                    String A0G3 = r0.A0G("ip6", null);
                    String A0G4 = r0.A0G("class", null);
                    String A0G5 = r0.A0G("fallback_hostname", null);
                    String A0G6 = r0.A0G("fallback_ip4", null);
                    String A0G7 = r0.A0G("fallback_ip6", null);
                    String A0G8 = r0.A0G("fallback_class", null);
                    AnonymousClass0M5 A0D = r0.A0D("upload");
                    Set set = AnonymousClass30d.A00;
                    arrayList.add(new C05330Oc(A0F2, A0G2, A0G3, A0G4, A0G5, A0G6, A0G7, A0G8, AnonymousClass30d.A01(A0D, set), AnonymousClass30d.A01(r0.A0D("download"), set), AnonymousClass30d.A01(r0.A0D("download_buckets"), null), r0.A0G("type", null), "true".equals(r0.A0G("force_ip", null))));
                }
            }
        }
        boolean z = false;
        if (A05 == 1) {
            z = true;
        }
        C05320Ob r02 = new C05320Ob(A0F, A06, A062, A07, arrayList, j, A0G, z, A052, A053);
        AnonymousClass0CX r2 = r3.A0B;
        synchronized (r2) {
            r2.A00 = 0;
            Log.i("ChatdMediaThrottleManager/resetThrottle");
        }
        r3.A09(r02);
        if (r3.A0B()) {
            r3.A0C.A01("route_selector_prefs").edit().putString("media_conn", C002001d.A1R(r3.A08, r3.A02())).apply();
        }
    }
}
