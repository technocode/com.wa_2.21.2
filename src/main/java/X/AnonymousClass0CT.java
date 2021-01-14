package X;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0CT  reason: invalid class name */
public class AnonymousClass0CT implements AnonymousClass0CU {
    public static volatile AnonymousClass0CT A0L;
    public C05320Ob A00;
    public boolean A01;
    public boolean A02;
    public final long A03;
    public final Handler A04 = new HandlerC02440Ca(this, Looper.getMainLooper());
    public final AnonymousClass009 A05;
    public final C000300f A06;
    public final AnonymousClass09K A07;
    public final AnonymousClass00S A08;
    public final C002701k A09;
    public final AnonymousClass0CW A0A;
    public final AnonymousClass0CX A0B;
    public final AnonymousClass022 A0C;
    public final AnonymousClass0CY A0D;
    public final AnonymousClass0CV A0E;
    public final AnonymousClass00T A0F;
    public final AnonymousClass03Y A0G;
    public final Object A0H = new Object();
    public final Object A0I = new Object();
    public final AtomicBoolean A0J = new AtomicBoolean(false);
    public volatile AnonymousClass0NQ A0K;

    public AnonymousClass0CT(AnonymousClass00S r3, C002701k r4, AnonymousClass03Y r5, AnonymousClass009 r6, AnonymousClass0CV r7, AnonymousClass00T r8, C000300f r9, AnonymousClass09K r10, AnonymousClass0CW r11, AnonymousClass022 r12, AnonymousClass0C2 r13, AnonymousClass0CX r14, AnonymousClass0CY r15) {
        this.A08 = r3;
        this.A09 = r4;
        this.A0G = r5;
        this.A05 = r6;
        this.A0E = r7;
        this.A0F = r8;
        this.A06 = r9;
        this.A07 = r10;
        this.A0A = r11;
        this.A0C = r12;
        this.A0B = r14;
        this.A0D = r15;
        this.A03 = 1000;
        r13.A01(this);
    }

    public static AnonymousClass0CT A00() {
        if (A0L == null) {
            synchronized (AnonymousClass0CT.class) {
                if (A0L == null) {
                    AnonymousClass00S A002 = AnonymousClass00S.A00();
                    C002701k A003 = C002701k.A00();
                    AnonymousClass03Y r8 = AnonymousClass03Y.A02;
                    AnonymousClass009 A004 = AnonymousClass009.A00();
                    if (AnonymousClass0CV.A02 == null) {
                        synchronized (AnonymousClass0CV.class) {
                            if (AnonymousClass0CV.A02 == null) {
                                AnonymousClass0CV.A02 = new AnonymousClass0CV(AnonymousClass0CK.A00(), AnonymousClass0CW.A00());
                            }
                        }
                    }
                    A0L = new AnonymousClass0CT(A002, A003, r8, A004, AnonymousClass0CV.A02, C002101e.A00(), C000300f.A00(), AnonymousClass09K.A07, AnonymousClass0CW.A00(), AnonymousClass022.A00(), AnonymousClass0C2.A00(), AnonymousClass0CX.A00(), new AnonymousClass0CY());
                }
            }
        }
        return A0L;
    }

    public final AnonymousClass1W5 A01(String str, String str2, String str3, int i) {
        return new AnonymousClass1W5(C450422q.A01(this.A08, this.A09, this.A0G, this.A05, this.A06, this, this.A07, this.A0A, A02(), str, str2, str3, i, this.A03));
    }

    public C05320Ob A02() {
        C05320Ob r0;
        synchronized (this.A0H) {
            r0 = this.A00;
        }
        return r0;
    }

    public void A03() {
        boolean z;
        Log.i("routeselector/requestroutesandwaitforauth");
        if (A0D() && A0C()) {
            Log.i("routeselector/requestroutesandwaitforauth/waiting for response");
            Log.d("routeselector/waitforroutingresponse");
            AnonymousClass00E.A00();
            long uptimeMillis = SystemClock.uptimeMillis();
            while (A0C()) {
                AnonymousClass0NQ r6 = this.A0K;
                synchronized (r6) {
                    z = false;
                    if (r6.A00 > 0) {
                        z = true;
                    }
                }
                if (!z) {
                    Log.w("routeselector/waitforroutingresponse/giving up because no request in flight");
                    return;
                }
                Object obj = this.A0I;
                synchronized (obj) {
                    try {
                        obj.wait(1000);
                    } catch (InterruptedException e) {
                        Log.w("routeselector/waitforroutingresponse/interrupted while waiting on route selection", e);
                    }
                    if (A0C()) {
                        Log.w("routeselector/waitforroutingresponse/routing response still not available");
                    }
                    if (20000 + uptimeMillis < SystemClock.uptimeMillis()) {
                        Log.w("routeselector/waitforroutingresponse/waited too long for routing response! Give up");
                        return;
                    }
                }
            }
        }
    }

    public final void A04() {
        boolean z;
        String str;
        AnonymousClass0CX r6 = this.A0B;
        synchronized (r6) {
            z = false;
            if (r6.A01.A05() <= r6.A00) {
                z = true;
            }
        }
        if (z) {
            Log.i("routeselector/requestupdatedroutinginfo throttled");
            return;
        }
        AnonymousClass0NQ r12 = this.A0K;
        C05320Ob A022 = A02();
        if (A022 == null) {
            str = null;
        } else {
            str = A022.A09;
        }
        synchronized (r12) {
            Log.i("routeselector/requestupdatedroutinginfo");
            if (r12.A00 == 0) {
                AnonymousClass09H r8 = r12.A02;
                String A023 = r8.A02();
                if (r8.A0B(124, A023, new AnonymousClass0M5("iq", new AnonymousClass0OS[]{new AnonymousClass0OS("to", AnonymousClass0QU.A00), new AnonymousClass0OS("id", A023, null, (byte) 0), new AnonymousClass0OS("xmlns", "w:m", null, (byte) 0), new AnonymousClass0OS("type", "set", null, (byte) 0)}, new AnonymousClass0M5("media_conn", str != null ? new AnonymousClass0OS[]{new AnonymousClass0OS("last_id", str, null, (byte) 0)} : null, null, null)), r12, 32000)) {
                    r12.A00 = r12.A01.A03();
                } else {
                    Log.i("app/sendgetmediaroutinginfo not sent");
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("routeselector/requestupdatedroutinginfo/not sending request; inFlightMediaRoutingRequestTime=");
            sb.append(r12.A00);
            Log.w(sb.toString());
        }
    }

    public final void A05() {
        Log.i("routeselector/setuprouterequesttimer");
        C05320Ob A022 = A02();
        if (A022 != null) {
            Handler handler = this.A04;
            handler.removeMessages(0);
            long A032 = (A022.A02 - this.A08.A03()) - 60000;
            AnonymousClass008.A10("routeselector/settimerorupdateroutes/creating timer task with delay ", A032);
            handler.sendEmptyMessageDelayed(0, A032);
        }
    }

    public final void A06() {
        if ((!A0B() || this.A01) && this.A02) {
            this.A0F.ANF(new RunnableEBaseShape4S0100000_I0_4(this, 9));
        }
    }

    public void A07(int i) {
        AnonymousClass008.A0v("routeselector/onmediatransfererrororresponsecode/code ", i);
        if (i == 401 || i == 403) {
            A04();
        }
    }

    public void A08(int i, int i2) {
        long j;
        AnonymousClass008.A0w("routeselector/onmediaroutingrequesterror/code ", i);
        if (503 == i) {
            AnonymousClass0CX r3 = this.A0B;
            synchronized (r3) {
                j = 0;
                r3.A00 = 0;
                Log.i("ChatdMediaThrottleManager/resetThrottle");
            }
            Handler handler = this.A04;
            AnonymousClass0CY r5 = this.A0D;
            long A012 = r5.A00.A01();
            if (A012 != 0) {
                long j2 = A012 * 1000;
                j = ((3 * j2) / 4) + Math.abs(r5.A01.nextLong() % (j2 / 2));
                StringBuilder sb = new StringBuilder("fibonaccibackoffhandler/sleep/");
                sb.append(j);
                sb.append(" milliseconds");
                Log.i(sb.toString());
            }
            handler.sendEmptyMessageDelayed(0, j);
        } else if (507 == i && i2 > 0) {
            AnonymousClass0CX r4 = this.A0B;
            long j3 = (long) i2;
            synchronized (r4) {
                long A052 = r4.A01.A05();
                long min = Math.min(j3, 10800L);
                Long.signum(min);
                r4.A00 = (min * 1000) + A052;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("ChatdMediaThrottleManager/setThrottle until ");
                sb2.append(r4.A00);
                Log.i(sb2.toString());
            }
        }
    }

    public final void A09(C05320Ob r22) {
        boolean z;
        StringBuilder A0S = AnonymousClass008.A0S("routeselector/setroutinginfo/got a RoutingResponse with ");
        A0S.append(r22.A0A.size());
        A0S.append(" route classes");
        Log.i(A0S.toString());
        this.A0D.A00.A02();
        synchronized (this.A0H) {
            C05320Ob r1 = this.A00;
            if (r1 == null || (z = r22.A0B)) {
                this.A00 = r22;
            } else {
                this.A00 = new C05320Ob(r22.A08, r22.A05, r22.A03, r22.A06, r1.A0A, r22.A07, r22.A09, z, r22.A00, r22.A01);
                Log.i("routeselector/setroutinginfo/previous hosts retained");
            }
        }
        Object obj = this.A0I;
        synchronized (obj) {
            obj.notifyAll();
        }
        A05();
    }

    public final void A0A(String str, String str2, String str3, int i) {
        boolean A0D2;
        C002701k r2 = this.A09;
        if (r2.A0F(15)) {
            A0D2 = r2.A0E(15);
        } else {
            A0D2 = this.A06.A0D(AbstractC000400g.A0l);
        }
        if (A0D2) {
            Log.d("routeselector/prewarm/skipped; disabled");
        } else {
            this.A0F.ANF(new RunnableC29151Xh(this, str, str2, str3, i));
        }
    }

    public final boolean A0B() {
        C002701k r2 = this.A09;
        if (r2.A0F(149)) {
            return r2.A0E(149);
        }
        return this.A06.A0D(AbstractC000400g.A1Y);
    }

    public final boolean A0C() {
        AnonymousClass00S r1 = this.A08;
        C05320Ob r0 = this.A00;
        return r0 == null || r0.A02 <= r1.A03();
    }

    public final boolean A0D() {
        Log.i("routeselector/requestroutinginfoifnulloralmostexpired");
        if (A0B() && this.A0J.compareAndSet(false, true)) {
            C05320Ob r4 = null;
            String string = this.A0C.A01("route_selector_prefs").getString("media_conn", null);
            AnonymousClass00S r9 = this.A08;
            if (string != null) {
                try {
                    JSONObject jSONObject = new JSONObject(string);
                    String string2 = jSONObject.getString("auth_token");
                    long j = jSONObject.getLong("conn_ttl");
                    long j2 = jSONObject.getLong("auth_ttl");
                    long j3 = jSONObject.getLong("max_buckets");
                    JSONArray jSONArray = jSONObject.getJSONArray("hosts");
                    int length = jSONArray.length();
                    ArrayList arrayList = new ArrayList(length);
                    for (int i = 0; i < length; i++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        arrayList.add(new C05330Oc(jSONObject2.getString("hostname"), C002001d.A1z(jSONObject2, "ip4"), C002001d.A1z(jSONObject2, "ip6"), C002001d.A1z(jSONObject2, "class"), C002001d.A1z(jSONObject2, "fallback_hostname"), C002001d.A1z(jSONObject2, "fallback_ip4"), C002001d.A1z(jSONObject2, "fallback_ip6"), C002001d.A1z(jSONObject2, "fallback_class"), C002001d.A2J(jSONObject2.optJSONArray("upload")), C002001d.A2J(jSONObject2.optJSONArray("download")), C002001d.A2J(jSONObject2.optJSONArray("download_buckets")), C002001d.A1z(jSONObject2, "type"), jSONObject2.optBoolean("force_ip")));
                    }
                    r4 = new C05320Ob(string2, j, j2, j3, arrayList, r9.A03() + (jSONObject.getLong("send_time_abs_ms") - r9.A05()), C002001d.A1z(jSONObject, "last_id"), jSONObject.getBoolean("is_new"), jSONObject.getInt("max_autodownload_retry"), jSONObject.getInt("max_manual_retry"));
                } catch (JSONException e) {
                    Log.e("routingresponse/can't parse json", e);
                }
            }
            synchronized (this.A0H) {
                if (this.A00 == null && r4 != null && r4.A02 > r9.A03()) {
                    Log.d("routeselector/loaded cached response");
                    A09(r4);
                }
            }
        }
        C05320Ob A022 = A02();
        if (A022 != null) {
            StringBuilder A0S = AnonymousClass008.A0S("routeselector/isroutinginfonulloralmostexpired/expiring at ");
            long j4 = A022.A04;
            A0S.append(j4);
            A0S.append(" (");
            AnonymousClass00S r7 = this.A08;
            A0S.append(j4 - r7.A03());
            A0S.append("ms from now)");
            Log.i(A0S.toString());
            if (j4 > r7.A03() + 120000) {
                if (!this.A04.hasMessages(0)) {
                    A05();
                }
                return false;
            }
        }
        A04();
        return true;
    }

    @Override // X.AnonymousClass0CU
    public void ACs() {
        this.A01 = false;
    }

    @Override // X.AnonymousClass0CU
    public void ACt() {
        this.A01 = true;
        if (A0B()) {
            A06();
        }
    }
}
