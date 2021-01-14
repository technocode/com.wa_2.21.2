package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0Ad  reason: invalid class name and case insensitive filesystem */
public class C01970Ad {
    public static volatile C01970Ad A0E;
    public AnonymousClass1V4 A00;
    public AbstractC449322f A01;
    public AnonymousClass285 A02;
    public boolean A03;
    public final AnonymousClass009 A04;
    public final C018609s A05;
    public final C018709t A06;
    public final C01980Ae A07;
    public final C02050Al A08;
    public final C02060Am A09;
    public final C02020Ai A0A;
    public final C02040Ak A0B;
    public final C018809u A0C = C018809u.A00("PaymentsManager", "infra", "COMMON");
    public final AnonymousClass00T A0D;

    public C01970Ad(AnonymousClass009 r4, AnonymousClass00T r5, C018709t r6, C01980Ae r7, C02040Ak r8, C02020Ai r9, C02050Al r10, C018609s r11, C02060Am r12) {
        this.A04 = r4;
        this.A0D = r5;
        this.A06 = r6;
        this.A07 = r7;
        this.A0B = r8;
        this.A0A = r9;
        this.A08 = r10;
        this.A05 = r11;
        this.A09 = r12;
    }

    public static C01970Ad A00() {
        if (A0E == null) {
            synchronized (C01970Ad.class) {
                if (A0E == null) {
                    A0E = new C01970Ad(AnonymousClass009.A00(), C002101e.A00(), C018709t.A01(), C01980Ae.A00(), C02040Ak.A00(), C02020Ai.A00(), C02050Al.A04, C018609s.A04(), C02060Am.A00());
                }
            }
        }
        return A0E;
    }

    public AnonymousClass1V4 A01() {
        A04();
        AnonymousClass1V4 r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw null;
    }

    public synchronized AnonymousClass1X1 A02(String str) {
        A04();
        AbstractC449322f r0 = this.A01;
        if (r0 == null) {
            return null;
        }
        return r0.initializeFactory(str);
    }

    public synchronized AbstractC07650Yy A03() {
        AnonymousClass285 r0;
        A04();
        r0 = this.A02;
        if (r0 == null) {
            throw null;
        }
        return r0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0056  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void A04() {
        /*
        // Method dump skipped, instructions count: 166
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C01970Ad.A04():void");
    }

    public void A05(AnonymousClass0GT r7) {
        Map map;
        boolean z;
        A04();
        C02050Al r4 = this.A08;
        if (r4 != null) {
            synchronized (r4) {
                map = r4.A00;
                z = false;
                if (map.size() > 0) {
                    z = true;
                }
            }
            if (z) {
                synchronized (r4) {
                    HashSet hashSet = new HashSet();
                    for (String str : map.keySet()) {
                        if (map.get(str) == r7) {
                            hashSet.add(str);
                        }
                    }
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        map.remove((String) it.next());
                    }
                }
            }
        }
    }

    public synchronized void A06(boolean z, boolean z2) {
        this.A0C.A07(null, "reset", null);
        A04();
        this.A03 = false;
        C02020Ai r2 = this.A0A;
        synchronized (r2) {
            r2.A05.A03("reset country");
            r2.A00 = null;
            r2.A01 = null;
            r2.A02 = false;
        }
        if (this.A06.A07 && !z2) {
            AnonymousClass1V4 r4 = this.A00;
            r4.A03.ANC(new C10600et(r4), new Void[0]);
        }
        this.A08.A00();
        if (z) {
            C01980Ae r22 = this.A07;
            synchronized (r22) {
                r22.A00.A05(r22.A02);
            }
        } else {
            C01980Ae r42 = this.A07;
            synchronized (r42) {
                String A042 = r42.A00.A04(r42.A02);
                boolean z3 = r42.A00.A01().getBoolean("payments_sandbox", false);
                r42.A00.A05(r42.A02);
                if (!TextUtils.isEmpty(A042)) {
                    try {
                        JSONObject jSONObject = new JSONObject(A042);
                        Iterator<String> keys = jSONObject.keys();
                        ArrayList arrayList = new ArrayList();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            if (!"tos_no_wallet".equals(next)) {
                                arrayList.add(next);
                            } else if (z3) {
                                r42.A00.A06(z3);
                            }
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            jSONObject.remove((String) it.next());
                        }
                        C02010Ah r23 = r42.A00;
                        boolean z4 = r42.A02;
                        String obj = jSONObject.toString();
                        if (z4) {
                            AnonymousClass008.A0q(r23, "payments_setup_completed_steps", obj);
                        } else {
                            AnonymousClass008.A0q(r23, "payments_merchant_setup_completed_steps", obj);
                        }
                    } catch (JSONException e) {
                        r42.A03.A08("clearAllButTos threw: ", e);
                    }
                }
                C018809u r5 = r42.A03;
                StringBuilder sb = new StringBuilder();
                sb.append("clearAllButTos ended with steps: ");
                sb.append(r42.A00.A04(r42.A02));
                sb.append(" sandbox: ");
                sb.append(r42.A00.A01().getBoolean("payments_sandbox", false));
                r5.A07(null, sb.toString(), null);
            }
        }
        AbstractC29071Wx A5W = this.A02.A5W();
        if (A5W != null) {
            A5W.A3Z();
        }
        C449222e A5X = this.A02.A5X();
        if (A5X != null) {
            synchronized (A5X) {
                Log.i("PAY: IndiaUpiBlockListManager clear");
                A5X.A0B.clear();
                AnonymousClass008.A0q(A5X.A0A, "payments_block_list", "");
            }
            synchronized (A5X) {
                Log.i("PAY: IndiaUpiBlockListManager setShouldFetch called");
                A5X.A00 = -1;
                A5X.A0A.A01().edit().putLong("payments_block_list_last_sync_time", -1).apply();
            }
        }
    }
}
