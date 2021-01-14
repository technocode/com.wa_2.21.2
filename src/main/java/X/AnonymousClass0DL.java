package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.jobqueue.job.SendPeerMessageJob;
import com.whatsapp.util.Log;
import java.util.AbstractCollection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.0DL  reason: invalid class name */
public class AnonymousClass0DL {
    public static final AnonymousClass0DP A0A;
    public static final AnonymousClass0DO A0B;
    public static final AnonymousClass0DM A0C = new AnonymousClass0DM(new byte[0]);
    public static volatile AnonymousClass0DL A0D;
    public final AnonymousClass01I A00;
    public final C000300f A01;
    public final AnonymousClass01J A02;
    public final AnonymousClass00S A03;
    public final AnonymousClass00D A04;
    public final C02430Bz A05;
    public final AnonymousClass0DR A06;
    public final AnonymousClass0DQ A07;
    public final AnonymousClass0DS A08;
    public final AnonymousClass0AL A09;

    static {
        AnonymousClass0DO r2 = new AnonymousClass0DO(new byte[0], 0, new AnonymousClass0DN(0, 0, Collections.emptySet()));
        A0B = r2;
        A0A = new AnonymousClass0DP(A0C, r2);
    }

    public AnonymousClass0DL(AnonymousClass00S r1, AnonymousClass01I r2, C000300f r3, AnonymousClass01J r4, AnonymousClass0AL r5, AnonymousClass0DQ r6, AnonymousClass0DR r7, AnonymousClass00D r8, AnonymousClass0DS r9, C02430Bz r10) {
        this.A03 = r1;
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = r4;
        this.A09 = r5;
        this.A07 = r6;
        this.A06 = r7;
        this.A04 = r8;
        this.A08 = r9;
        this.A05 = r10;
    }

    public static AnonymousClass0DL A00() {
        if (A0D == null) {
            synchronized (AnonymousClass0DL.class) {
                if (A0D == null) {
                    AnonymousClass00S A002 = AnonymousClass00S.A00();
                    AnonymousClass01I A003 = AnonymousClass01I.A00();
                    C000300f A004 = C000300f.A00();
                    AnonymousClass01J A005 = AnonymousClass01J.A00();
                    AnonymousClass0AL A012 = AnonymousClass0AL.A01();
                    if (AnonymousClass0DQ.A01 == null) {
                        synchronized (AnonymousClass0DQ.class) {
                            if (AnonymousClass0DQ.A01 == null) {
                                AnonymousClass0DQ.A01 = new AnonymousClass0DQ(AnonymousClass0DK.A00());
                            }
                        }
                    }
                    AnonymousClass0DQ r10 = AnonymousClass0DQ.A01;
                    AnonymousClass0DR A006 = AnonymousClass0DR.A00();
                    AnonymousClass00D A007 = AnonymousClass00D.A00();
                    if (AnonymousClass0DS.A01 == null) {
                        synchronized (AnonymousClass0DS.class) {
                            if (AnonymousClass0DS.A01 == null) {
                                AnonymousClass0DS.A01 = new AnonymousClass0DS(AnonymousClass0DK.A00());
                            }
                        }
                    }
                    A0D = new AnonymousClass0DL(A002, A003, A004, A005, A012, r10, A006, A007, AnonymousClass0DS.A01, C02430Bz.A00());
                }
            }
        }
        return A0D;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0098, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x009c, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass0DP A01() {
        /*
        // Method dump skipped, instructions count: 166
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0DL.A01():X.0DP");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x013a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x013e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0141, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0145, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0152, code lost:
        if (r6.get(null) != null) goto L_0x0154;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0186, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x018a, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01f3  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0217  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.HashMap A02(java.lang.String r15, java.util.Collection r16) {
        /*
        // Method dump skipped, instructions count: 536
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0DL.A02(java.lang.String, java.util.Collection):java.util.HashMap");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0070, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.HashMap A03(java.util.Collection r9) {
        /*
        // Method dump skipped, instructions count: 114
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0DL.A03(java.util.Collection):java.util.HashMap");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0032, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0033, code lost:
        if (r1 != null) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0038, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Set A04() {
        /*
            r5 = this;
            X.0DS r0 = r5.A08
            r4 = 0
            if (r0 == 0) goto L_0x0039
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            X.0DK r0 = r0.A00
            X.0BK r2 = r0.A8g()
            java.lang.String r1 = "SELECT DISTINCT collection_name FROM missing_keys"
            java.lang.String r0 = "SyncdMissingKeysTable.COLLECTIONS_WAITING_FOR_KEY"
            android.database.Cursor r1 = r2.A07(r1, r4, r0)
        L_0x0018:
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x0030 }
            if (r0 == 0) goto L_0x002c
            java.lang.String r0 = "collection_name"
            int r0 = r1.getColumnIndex(r0)     // Catch:{ all -> 0x0030 }
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x0030 }
            r3.add(r0)     // Catch:{ all -> 0x0030 }
            goto L_0x0018
        L_0x002c:
            r1.close()
            return r3
        L_0x0030:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0032 }
        L_0x0032:
            r0 = move-exception
            if (r1 == 0) goto L_0x0038
            r1.close()     // Catch:{ all -> 0x0038 }
        L_0x0038:
            throw r0
        L_0x0039:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0DL.A04():java.util.Set");
    }

    public Set A05() {
        List A052 = this.A06.A05((byte) 39);
        HashSet hashSet = new HashSet();
        Iterator it = ((AbstractCollection) A052).iterator();
        while (it.hasNext()) {
            hashSet.addAll(Collections.unmodifiableSet(((AnonymousClass287) it.next()).A00));
        }
        return hashSet;
    }

    public final Set A06() {
        HashSet hashSet = new HashSet();
        Iterator it = ((AbstractCollection) this.A05.A03()).iterator();
        while (it.hasNext()) {
            hashSet.add(Integer.valueOf(((AnonymousClass1VI) it.next()).A03));
        }
        if (this.A00 != null) {
            hashSet.add(0);
            return hashSet;
        }
        throw null;
    }

    public void A07(boolean z, HashMap hashMap, DeviceJid deviceJid) {
        Log.i("SyncdKeyManager/shareKeys");
        AnonymousClass01I r0 = this.A00;
        r0.A04();
        UserJid userJid = r0.A03;
        if (userJid != null && !hashMap.isEmpty()) {
            AnonymousClass0AL r2 = this.A09;
            long A052 = this.A03.A05();
            AnonymousClass0A6 r22 = r2.A07;
            AnonymousClass288 r23 = new AnonymousClass288(AnonymousClass0FI.A07(r22.A01, r22.A00, userJid, true), A052);
            ((AbstractC05460Oq) r23).A00 = deviceJid;
            HashMap hashMap2 = r23.A01;
            hashMap2.clear();
            hashMap2.putAll(hashMap);
            r23.A00 = z;
            long A012 = this.A06.A01(r23);
            if (A012 < 0) {
                Log.e("syncd-key-manager/shareKeys unable to add peer message");
                return;
            }
            AnonymousClass01J r4 = this.A02;
            r4.A00.A01(new SendPeerMessageJob(AnonymousClass008.A0I("syncd-key-share-", A012), A012, deviceJid));
        }
    }

    public boolean A08() {
        Iterator it = ((AbstractCollection) this.A06.A05((byte) 38)).iterator();
        while (it.hasNext()) {
            if (((AnonymousClass288) it.next()).A00) {
                return true;
            }
        }
        return false;
    }
}
