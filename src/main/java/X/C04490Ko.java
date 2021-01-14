package X;

import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.0Ko  reason: invalid class name and case insensitive filesystem */
public class C04490Ko {
    public static volatile C04490Ko A0A;
    public final AnonymousClass00S A00;
    public final AnonymousClass09V A01;
    public final C014408c A02;
    public final C017809k A03;
    public final C014608e A04;
    public final AnonymousClass094 A05;
    public final C014508d A06;
    public final AnonymousClass095 A07;
    public final Map A08;
    public final AtomicBoolean A09;

    public C04490Ko(AnonymousClass00S r2, C014408c r3, AnonymousClass095 r4, AnonymousClass09V r5, C014608e r6, C017809k r7, C014508d r8, AnonymousClass094 r9) {
        this.A00 = r2;
        this.A07 = r4;
        this.A02 = r3;
        this.A01 = r5;
        this.A04 = r6;
        this.A03 = r7;
        this.A06 = r8;
        this.A05 = r9;
        this.A08 = r7.A02;
        this.A09 = r7.A03;
    }

    public static C04490Ko A00() {
        if (A0A == null) {
            synchronized (C04490Ko.class) {
                if (A0A == null) {
                    A0A = new C04490Ko(AnonymousClass00S.A00(), C014408c.A00(), AnonymousClass095.A00(), AnonymousClass09V.A00(), C014608e.A01, C017809k.A00(), C014508d.A00(), AnonymousClass094.A00());
                }
            }
        }
        return A0A;
    }

    public int A01(AnonymousClass02N r4) {
        int i = 0;
        if (r4 != null) {
            Iterator it = A02().iterator();
            while (it.hasNext()) {
                if (r4.equals(((AbstractC007503q) it.next()).A0n.A00)) {
                    i++;
                }
            }
        }
        return i;
    }

    public ArrayList A02() {
        long A052 = this.A00.A05();
        if (!this.A09.get()) {
            A03();
        }
        Map map = this.A03.A02;
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (((AbstractC007503q) ((Map.Entry) it.next()).getValue()).A0E + 86400000 < A052) {
                it.remove();
            }
        }
        StringBuilder A0S = AnonymousClass008.A0S("msgstore/unsendmessages/cached:");
        A0S.append(map.size());
        Log.i(A0S.toString());
        ArrayList arrayList = new ArrayList(map.size());
        for (Object obj : map.values()) {
            arrayList.add(obj);
        }
        Collections.sort(arrayList, C14360m9.A00);
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00dc, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e0, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00e3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00e7, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03() {
        /*
        // Method dump skipped, instructions count: 334
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04490Ko.A03():void");
    }

    public boolean A04() {
        if (!this.A09.get()) {
            A03();
        }
        C017809k r1 = this.A03;
        long A052 = this.A00.A05();
        Map map = r1.A02;
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (((AbstractC007503q) ((Map.Entry) it.next()).getValue()).A0E + 86400000 < A052) {
                it.remove();
            }
        }
        return !map.isEmpty();
    }
}
