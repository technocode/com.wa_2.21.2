package X;

import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.0Cw  reason: invalid class name and case insensitive filesystem */
public class C02640Cw {
    public static final HashMap A0E = new C02650Cx();
    public static volatile C02640Cw A0F;
    public int A00 = 3;
    public long A01 = 0;
    public long A02 = 0;
    public AnonymousClass2NJ A03;
    public final AnonymousClass009 A04;
    public final AnonymousClass0CL A05;
    public final AnonymousClass00S A06;
    public final AnonymousClass00G A07;
    public final AnonymousClass00D A08;
    public final AnonymousClass01X A09;
    public final C02660Cy A0A;
    public final AnonymousClass03U A0B;
    public final AnonymousClass00T A0C;
    public final HashMap A0D = new HashMap();

    public C02640Cw(AnonymousClass00G r3, AnonymousClass00S r4, AnonymousClass009 r5, AnonymousClass00T r6, AnonymousClass0CL r7, AnonymousClass01X r8, AnonymousClass03U r9, C02660Cy r10, AnonymousClass00D r11) {
        this.A07 = r3;
        this.A06 = r4;
        this.A04 = r5;
        this.A0C = r6;
        this.A05 = r7;
        this.A09 = r8;
        this.A0B = r9;
        this.A0A = r10;
        this.A08 = r11;
    }

    public static C02640Cw A00() {
        if (A0F == null) {
            synchronized (C02640Cw.class) {
                if (A0F == null) {
                    A0F = new C02640Cw(AnonymousClass00G.A01, AnonymousClass00S.A00(), AnonymousClass009.A00(), C002101e.A00(), AnonymousClass0CL.A00(), AnonymousClass01X.A00(), AnonymousClass03U.A00(), C02660Cy.A00(), AnonymousClass00D.A00());
                }
            }
        }
        return A0F;
    }

    public final synchronized int A01() {
        return this.A00;
    }

    public final synchronized int A02(int i) {
        int i2 = this.A00;
        if (i2 == 0 && i == 0) {
            Log.e("ManifestManager/setState/State change ERROR - loading to loading!");
            return this.A00;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("ManifestManager/setState/State change - ");
        HashMap hashMap = A0E;
        sb.append((String) hashMap.get(Integer.valueOf(i2)));
        sb.append(" to ");
        sb.append((String) hashMap.get(Integer.valueOf(i)));
        Log.d(sb.toString());
        this.A00 = i;
        return i;
    }

    public final synchronized long A03() {
        long j;
        j = this.A01;
        if (j == 0) {
            j = this.A08.A00.getLong("downloadable_manifest_last_fetched_time_millis", 0);
            this.A01 = j;
        }
        return j;
    }

    public final synchronized void A04(long j) {
        this.A01 = j;
        this.A08.A00.edit().putLong("downloadable_manifest_last_fetched_time_millis", j).apply();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0327, code lost:
        if (r8.equals("categories") == false) goto L_0x0329;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0443, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0447, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01c0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01c4, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01c7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01cb, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01f6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01fa, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x02db  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x046f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(X.AnonymousClass2NI r23, boolean r24, X.AnonymousClass0CZ r25) {
        /*
        // Method dump skipped, instructions count: 1204
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02640Cw.A05(X.2NI, boolean, X.0CZ):void");
    }

    public final synchronized void A06(AnonymousClass2NJ r8, boolean z) {
        AnonymousClass00E.A00();
        if (!z || r8 != null) {
            HashMap hashMap = this.A0D;
            for (Map.Entry entry : hashMap.entrySet()) {
                StringBuilder sb = new StringBuilder();
                sb.append("ManifestManager/serviceCallbacks/Servicing the callback for category : ");
                sb.append((String) entry.getKey());
                Log.d(sb.toString());
                Iterator it = ((ArrayList) entry.getValue()).iterator();
                while (it.hasNext()) {
                    C53352cw r2 = (C53352cw) it.next();
                    if (z) {
                        r2.A01((AnonymousClass2NI) r8.A01.get((String) entry.getKey()));
                    } else {
                        r2.A00();
                    }
                }
            }
            hashMap.clear();
        } else {
            throw null;
        }
    }

    public final synchronized void A07(String str, C53352cw r6) {
        int i = this.A00;
        if (i == 0) {
            HashMap hashMap = this.A0D;
            ArrayList arrayList = (ArrayList) hashMap.get(str);
            if (arrayList == null || arrayList.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                sb.append("ManifestManager/registerCallback/Registering first callback for category : ");
                sb.append(str);
                Log.d(sb.toString());
                hashMap.put(str, new ArrayList(Collections.singletonList(r6)));
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("ManifestManager/registerCallback/Registering another callback for category : ");
                sb2.append(str);
                Log.d(sb2.toString());
                arrayList.add(r6);
                hashMap.put(str, arrayList);
            }
        } else if (i == 5) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("ManifestManager/registerCallback/Registering converted to servicing successful callback for category : ");
            sb3.append(str);
            Log.d(sb3.toString());
            AnonymousClass2NJ r0 = this.A03;
            if (r0 != null) {
                r6.A01((AnonymousClass2NI) r0.A01.get(str));
            } else {
                throw null;
            }
        } else if (i == 1) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("ManifestManager/registerCallback/Registering converted to servicing error callback for category : ");
            sb4.append(str);
            Log.d(sb4.toString());
            r6.A00();
        } else {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("ManifestManager/registerCallback/Invalid state encountered when trying to register category : ");
            sb5.append(str);
            sb5.append(" state : ");
            sb5.append((String) A0E.get(Integer.valueOf(i)));
            Log.e(sb5.toString());
        }
    }

    public final synchronized void A08(boolean z, String str, AnonymousClass2NI r8, C53352cw r9, int i) {
        A02(0);
        if (i != 0 || this.A02 + 3600000 <= this.A06.A05()) {
            A07(str, r9);
            Log.d("ManifestManager/loadAndService/Starting new thread to load.");
            this.A0C.ANF(new RunnableEBaseShape0S0210000_I0(this, r8, z, 8));
            return;
        }
        Log.d("ManifestManager/loadAndService/Last failure is fresh, returning error!");
        A02(1);
        r9.A00();
    }
}
