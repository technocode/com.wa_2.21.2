package X;

import android.content.ContentValues;
import android.text.TextUtils;
import android.util.Base64;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.09E  reason: invalid class name */
public class AnonymousClass09E {
    public static volatile AnonymousClass09E A06;
    public final AnonymousClass00S A00;
    public final C015308l A01;
    public final C014508d A02;
    public final C015408m A03;
    public final Object A04 = new Object();
    public volatile ConcurrentHashMap A05;

    public AnonymousClass09E(AnonymousClass00S r2, C015308l r3, C015408m r4, C014508d r5) {
        this.A00 = r2;
        this.A01 = r3;
        this.A03 = r4;
        this.A02 = r5;
    }

    public static AnonymousClass09E A00() {
        if (A06 == null) {
            synchronized (AnonymousClass09E.class) {
                if (A06 == null) {
                    A06 = new AnonymousClass09E(AnonymousClass00S.A00(), C015308l.A00(), C015408m.A00(), C014508d.A00());
                }
            }
        }
        return A06;
    }

    public static final String A01(String str, boolean z) {
        StringBuilder A0Y = AnonymousClass008.A0Y(str, "_");
        A0Y.append((z ? "status_list" : "status").toUpperCase(Locale.ROOT));
        return A0Y.toString();
    }

    public static String A02(List list) {
        Collections.sort(list, C28361Ua.A00);
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AnonymousClass1VC r7 = (AnonymousClass1VC) it.next();
                instance.update(r7.A0A.getRawString().getBytes());
                int i = r7.A01;
                instance.update(new byte[]{(byte) (i >> 24), (byte) (i >> 16), (byte) (i >> 8), (byte) i});
                int i2 = r7.A00;
                instance.update(new byte[]{(byte) (i2 >> 24), (byte) (i2 >> 16), (byte) (i2 >> 8), (byte) i2});
                long j = r7.A07;
                instance.update(new byte[]{(byte) ((int) (j >> 56)), (byte) ((int) (j >> 48)), (byte) ((int) (j >> 40)), (byte) ((int) (j >> 32)), (byte) ((int) (j >> 24)), (byte) ((int) (j >> 16)), (byte) ((int) (j >> 8)), (byte) ((int) j)});
                AbstractC007503q r0 = r7.A08;
                if (r0 != null) {
                    instance.update(r0.A0n.A01.getBytes());
                }
            }
            return Base64.encodeToString(instance.digest(), 2);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static final void A03(ContentValues contentValues, AnonymousClass1VC r3) {
        contentValues.put("message_table_id", Long.valueOf(r3.A06));
        contentValues.put("last_read_message_table_id", Long.valueOf(r3.A04));
        contentValues.put("last_read_receipt_sent_message_table_id", Long.valueOf(r3.A05));
        contentValues.put("first_unread_message_table_id", Long.valueOf(r3.A03));
        contentValues.put("autodownload_limit_message_table_id", Long.valueOf(r3.A02));
        contentValues.put("timestamp", Long.valueOf(r3.A07));
        contentValues.put("unseen_count", Integer.valueOf(r3.A01));
        contentValues.put("total_count", Integer.valueOf(r3.A00));
    }

    public int A04() {
        String A012 = this.A03.A01("status_distribution");
        if (A012 == null) {
            return 0;
        }
        return Integer.parseInt(A012);
    }

    public long A05() {
        long A052 = this.A00.A05() - 86400000;
        String A012 = this.A03.A01("earliest_status_time");
        if (A012 == null) {
            return -1;
        }
        long parseLong = Long.parseLong(A012);
        if (parseLong == 0) {
            return -1;
        }
        if (parseLong > A052) {
            return parseLong - A052;
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0032, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0033, code lost:
        if (r2 != null) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0038, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x003f, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long A06(java.lang.String r7) {
        /*
            r6 = this;
            X.08d r0 = r6.A02
            X.0OQ r4 = r0.A03()
            X.0BK r5 = r4.A04     // Catch:{ all -> 0x0039 }
            java.lang.String r3 = "SELECT timestamp FROM status WHERE jid_row_id=?"
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x0039 }
            r1 = 0
            r2[r1] = r7     // Catch:{ all -> 0x0039 }
            java.lang.String r0 = "SELECT_STATUS_LIST_V2_TIMESTAMP"
            android.database.Cursor r2 = r5.A07(r3, r2, r0)     // Catch:{ all -> 0x0039 }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0030 }
            if (r0 == 0) goto L_0x0027
            long r0 = r2.getLong(r1)     // Catch:{ all -> 0x0030 }
            r2.close()
            r4.close()
            return r0
        L_0x0027:
            r2.close()
            r4.close()
            r0 = 0
            return r0
        L_0x0030:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0032 }
        L_0x0032:
            r0 = move-exception
            if (r2 == 0) goto L_0x0038
            r2.close()     // Catch:{ all -> 0x0038 }
        L_0x0038:
            throw r0
        L_0x0039:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x003b }
        L_0x003b:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x003f }
        L_0x003f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass09E.A06(java.lang.String):long");
    }

    public AnonymousClass1VC A07(UserJid userJid) {
        A0C();
        if (userJid == null) {
            return null;
        }
        return (AnonymousClass1VC) this.A05.get(userJid);
    }

    public List A08() {
        A0C();
        ConcurrentHashMap concurrentHashMap = this.A05;
        ArrayList arrayList = new ArrayList(concurrentHashMap.size());
        for (AnonymousClass1VC r1 : concurrentHashMap.values()) {
            if (!r1.A03()) {
                arrayList.add(r1.A01());
            }
        }
        return arrayList;
    }

    public List A09() {
        String A012 = this.A03.A01("status_black_list");
        if (TextUtils.isEmpty(A012)) {
            return new ArrayList();
        }
        return AnonymousClass1VY.A0G(UserJid.class, Arrays.asList(A012.split(",")));
    }

    public List A0A() {
        String A012 = this.A03.A01("status_white_list");
        if (TextUtils.isEmpty(A012)) {
            return new ArrayList();
        }
        return AnonymousClass1VY.A0G(UserJid.class, Arrays.asList(A012.split(",")));
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x014a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x014e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0156, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x015a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x015e, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x015f, code lost:
        if (r0 != null) goto L_0x0161;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0164, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.concurrent.ConcurrentHashMap A0B(X.AnonymousClass0OQ r26) {
        /*
        // Method dump skipped, instructions count: 357
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass09E.A0B(X.0OQ):java.util.concurrent.ConcurrentHashMap");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x002e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0032, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0047, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x004b, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0C() {
        /*
            r4 = this;
            java.util.concurrent.ConcurrentHashMap r0 = r4.A05
            if (r0 != 0) goto L_0x004f
            X.08d r0 = r4.A02
            X.0OQ r3 = r0.A03()
            boolean r0 = r4.A0I()     // Catch:{ all -> 0x0045 }
            if (r0 == 0) goto L_0x0033
            X.0Rk r2 = r3.A01()     // Catch:{ all -> 0x0045 }
            java.lang.Object r1 = r4.A04     // Catch:{ all -> 0x002c }
            monitor-enter(r1)     // Catch:{ all -> 0x002c }
            java.util.concurrent.ConcurrentHashMap r0 = r4.A05     // Catch:{ all -> 0x0029 }
            if (r0 != 0) goto L_0x0021
            java.util.concurrent.ConcurrentHashMap r0 = r4.A0B(r3)     // Catch:{ all -> 0x0029 }
            r4.A05 = r0     // Catch:{ all -> 0x0029 }
        L_0x0021:
            monitor-exit(r1)     // Catch:{ all -> 0x0029 }
            r2.A00()
            r2.close()
            goto L_0x004c
        L_0x0029:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x002c:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x002e }
        L_0x002e:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0032 }
        L_0x0032:
            throw r0
        L_0x0033:
            java.lang.Object r1 = r4.A04
            monitor-enter(r1)
            java.util.concurrent.ConcurrentHashMap r0 = r4.A05     // Catch:{ all -> 0x0042 }
            if (r0 != 0) goto L_0x0040
            java.util.concurrent.ConcurrentHashMap r0 = r4.A0B(r3)     // Catch:{ all -> 0x0042 }
            r4.A05 = r0     // Catch:{ all -> 0x0042 }
        L_0x0040:
            monitor-exit(r1)     // Catch:{ all -> 0x0042 }
            goto L_0x004c
        L_0x0042:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0045:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0047 }
        L_0x0047:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x004b }
        L_0x004b:
            throw r0
        L_0x004c:
            r3.close()
        L_0x004f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass09E.A0C():void");
    }

    public void A0D(int i, Collection collection) {
        ArrayList A0F;
        if (collection == null) {
            A0F = null;
        } else {
            A0F = AnonymousClass1VY.A0F(collection);
        }
        C015408m r2 = this.A03;
        r2.A03("status_distribution", i);
        if (A0F == null) {
            return;
        }
        if (i == 2) {
            r2.A05("status_black_list", TextUtils.join(",", A0F));
        } else if (i == 1) {
            r2.A05("status_white_list", TextUtils.join(",", A0F));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0037, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003b, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0E(com.whatsapp.jid.UserJid r8) {
        /*
            r7 = this;
            X.08d r0 = r7.A02
            X.0OQ r6 = r0.A04()
            boolean r5 = r7.A0I()     // Catch:{ all -> 0x0035 }
            X.0BK r4 = r6.A04     // Catch:{ all -> 0x0035 }
            if (r5 == 0) goto L_0x0012
            java.lang.String r3 = "status_list"
            goto L_0x0015
        L_0x0012:
            java.lang.String r3 = "status"
        L_0x0015:
            if (r5 == 0) goto L_0x001a
            java.lang.String r2 = "key_remote_jid=?"
            goto L_0x001c
        L_0x001a:
            java.lang.String r2 = "jid_row_id=?"
        L_0x001c:
            java.lang.String[] r1 = r7.A0L(r5, r8)     // Catch:{ all -> 0x0035 }
            java.lang.String r0 = "deleteStatus/DELETE"
            java.lang.String r0 = A01(r0, r5)     // Catch:{ all -> 0x0035 }
            r4.A01(r3, r2, r1, r0)     // Catch:{ all -> 0x0035 }
            r7.A0C()     // Catch:{ all -> 0x0035 }
            java.util.concurrent.ConcurrentHashMap r0 = r7.A05     // Catch:{ all -> 0x0035 }
            r0.remove(r8)     // Catch:{ all -> 0x0035 }
            r6.close()
            return
        L_0x0035:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0037 }
        L_0x0037:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x003b }
        L_0x003b:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass09E.A0E(com.whatsapp.jid.UserJid):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006e, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0F(com.whatsapp.jid.UserJid r11, int r12, int r13) {
        /*
        // Method dump skipped, instructions count: 111
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass09E.A0F(com.whatsapp.jid.UserJid, int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0062, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0066, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0G(com.whatsapp.jid.UserJid r11, X.AnonymousClass1VC r12) {
        /*
        // Method dump skipped, instructions count: 103
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass09E.A0G(com.whatsapp.jid.UserJid, X.1VC):void");
    }

    public boolean A0H() {
        return this.A03.A01("status_distribution") != null;
    }

    public boolean A0I() {
        String A012 = this.A03.A01("status_list_ready");
        if (A012 == null || Integer.parseInt(A012) == 0) {
            return true;
        }
        return false;
    }

    public boolean A0J(AbstractC007503q r11) {
        long parseLong;
        long parseLong2;
        AnonymousClass00E.A08(AnonymousClass1VY.A0b(r11.A0n.A00), "isStatusExpired should be called for statuses only");
        if (AnonymousClass1VY.A0a(r11.A07())) {
            C015408m r1 = this.A03;
            String A012 = r1.A01("status_psa_viewed_time");
            if (A012 == null) {
                parseLong = 0;
            } else {
                parseLong = Long.parseLong(A012);
            }
            String A013 = r1.A01("status_psa_exipration_time");
            if (A013 == null) {
                parseLong2 = 0;
            } else {
                parseLong2 = Long.parseLong(A013);
            }
            if (r11.A0E >= parseLong || parseLong2 == 0 || parseLong2 >= this.A00.A05()) {
                return false;
            }
            return true;
        } else if (r11.A0E < this.A00.A05() - 86400000) {
            return true;
        } else {
            return false;
        }
    }

    public boolean A0K(AbstractC007503q r8) {
        boolean z;
        if (r8.A0n.A02) {
            return false;
        }
        AnonymousClass1VC A07 = A07((UserJid) r8.A07());
        if (A07 == null) {
            StringBuilder A0S = AnonymousClass008.A0S("statusmsgstore/isstatusunseen/no status for ");
            A0S.append(r8.A07());
            Log.w(A0S.toString());
            return false;
        }
        synchronized (A07) {
            z = false;
            if (r8.A0p > A07.A04) {
                z = true;
            }
        }
        return z;
    }

    public final String[] A0L(boolean z, UserJid userJid) {
        String valueOf;
        String[] strArr = new String[1];
        if (z) {
            valueOf = AnonymousClass1VY.A0D(userJid);
        } else {
            valueOf = String.valueOf(userJid != null ? this.A01.A02(userJid) : -1);
        }
        strArr[0] = valueOf;
        return strArr;
    }
}
