package X;

import android.content.ContentValues;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.0As  reason: invalid class name and case insensitive filesystem */
public class C02120As {
    public static volatile C02120As A08;
    public Map A00;
    public final AnonymousClass00S A01;
    public final C014408c A02;
    public final C006903j A03;
    public final C015308l A04;
    public final C014508d A05;
    public final C015408m A06;
    public final C015708p A07;

    public C02120As(AnonymousClass00S r1, C015308l r2, C014408c r3, C006903j r4, C015408m r5, C015708p r6, C014508d r7) {
        this.A01 = r1;
        this.A04 = r2;
        this.A02 = r3;
        this.A03 = r4;
        this.A06 = r5;
        this.A07 = r6;
        this.A05 = r7;
    }

    public static C02120As A00() {
        if (A08 == null) {
            synchronized (C02120As.class) {
                if (A08 == null) {
                    A08 = new C02120As(AnonymousClass00S.A00(), C015308l.A00(), C014408c.A00(), C006903j.A00(), C015408m.A00(), C015708p.A00(), C014508d.A00());
                }
            }
        }
        return A08;
    }

    public static final void A01(AnonymousClass0OQ r4, AnonymousClass02N r5, byte b, int i) {
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("jid", r5.getRawString());
        contentValues.put("type", Byte.valueOf(b));
        contentValues.put("message_count", Integer.valueOf(i));
        if (r4.A04.A02("frequents", contentValues, "insertFrequents/INSERT_FREQUENTS_LEGACY") == -1) {
            StringBuilder sb = new StringBuilder("frequentMessageStore/insertFrequents/failed jid=");
            sb.append(r5);
            sb.append(" type=");
            sb.append((int) b);
            Log.e(sb.toString());
        }
    }

    public List A02(AbstractC02390Bu r9) {
        Map A032 = A03();
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : A032.entrySet()) {
            AnonymousClass02N r5 = ((C28581Uw) entry.getKey()).A01;
            byte b = ((C28581Uw) entry.getKey()).A00;
            int intValue = ((Number) entry.getValue()).intValue();
            StringBuilder sb = new StringBuilder("frequentmsgstore/getfrequents/");
            sb.append(r5);
            sb.append(" ");
            sb.append((int) b);
            sb.append(" ");
            AnonymousClass008.A1K(sb, intValue);
            if (r9 != null) {
                intValue *= r9.A9s(b);
            }
            if (intValue != 0) {
                C28571Uv r2 = (C28571Uv) hashMap.get(r5);
                if (r2 == null) {
                    r2 = new C28571Uv(null);
                    r2.A01 = this.A03.A04(r5);
                }
                r2.A00 += intValue;
                hashMap.put(r5, r2);
            }
        }
        ArrayList arrayList = new ArrayList(hashMap.entrySet());
        Collections.sort(arrayList, AnonymousClass1UX.A00);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            arrayList2.add(entry2.getKey());
            StringBuilder sb2 = new StringBuilder("frequentmsgstore/getfrequents/sorted/");
            sb2.append(entry2.getKey());
            sb2.append(" ");
            sb2.append(((C28571Uv) entry2.getValue()).A00);
            sb2.append(" ");
            sb2.append(((C28571Uv) entry2.getValue()).A01);
            Log.d(sb2.toString());
        }
        return arrayList2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0067, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0074, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0078, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00ca, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ce, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00da, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00de, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Map A03() {
        /*
        // Method dump skipped, instructions count: 229
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02120As.A03():java.util.Map");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0057, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0198, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x019c, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x019f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01a0, code lost:
        if (r7 != null) goto L_0x01a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01a5, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01a8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01ac, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04() {
        /*
        // Method dump skipped, instructions count: 429
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02120As.A04():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0084, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0088, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008f, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(X.AnonymousClass02N r10) {
        /*
        // Method dump skipped, instructions count: 144
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02120As.A05(X.02N):void");
    }

    public final void A06(AnonymousClass02N r9, byte b, int i, boolean z) {
        if (A08()) {
            long A022 = this.A04.A02(r9);
            if (!z) {
                AnonymousClass1VB A012 = this.A07.A01("UPDATE frequent   SET message_count = ? WHERE jid_row_id = ? AND type = ?", "UPDATE_FREQUENT");
                A012.A06(2, A022);
                A012.A06(3, (long) b);
                A012.A06(1, (long) i);
                if (A012.A00() == 1) {
                    return;
                }
            }
            if (A07()) {
                AnonymousClass1VB A013 = this.A07.A01("INSERT INTO frequent(jid_row_id, type, message_count) VALUES (?, ?, ?)", "INSERT_FREQUENT");
                A013.A06(1, A022);
                A013.A06(2, (long) b);
                A013.A06(3, (long) i);
                if (A013.A01() == -1) {
                    StringBuilder sb = new StringBuilder("frequentMessageStore/insertOrUpdateFrequent/failed jid=");
                    sb.append(r9);
                    sb.append(" type=");
                    sb.append((int) b);
                    Log.e(sb.toString());
                }
            }
        }
    }

    public boolean A07() {
        String A012;
        return this.A04.A0C() && (A012 = this.A06.A01("frequent_ready")) != null && Long.parseLong(A012) == 1;
    }

    public final boolean A08() {
        if (A07()) {
            return true;
        }
        String A012 = this.A06.A01("migration_frequent_index");
        return A012 != null && Long.parseLong(A012) > 0;
    }
}
