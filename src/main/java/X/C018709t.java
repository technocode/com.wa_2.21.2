package X;

import android.database.Cursor;
import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.File;
import java.math.BigDecimal;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.09t  reason: invalid class name and case insensitive filesystem */
public class C018709t {
    public static volatile C018709t A08;
    public AnonymousClass08J A00;
    public AnonymousClass0RG A01;
    public AnonymousClass0RI A02;
    public final AnonymousClass009 A03;
    public final AnonymousClass00S A04;
    public final AnonymousClass00G A05;
    public final AnonymousClass04q A06;
    public volatile boolean A07;

    public C018709t(AnonymousClass00S r2, AnonymousClass009 r3, AnonymousClass00G r4, AnonymousClass04q r5) {
        this.A03 = r3;
        this.A05 = r4;
        if (r2 != null) {
            this.A04 = r2;
            this.A06 = r5;
            this.A00 = new AnonymousClass08J();
            return;
        }
        throw null;
    }

    public static AnonymousClass1VM A00(List list, String str) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass1VM r1 = (AnonymousClass1VM) it.next();
            if (str.equals(r1.A07)) {
                return r1;
            }
        }
        return null;
    }

    public static C018709t A01() {
        if (A08 == null) {
            synchronized (C018709t.class) {
                if (A08 == null) {
                    AnonymousClass00S A002 = AnonymousClass00S.A00();
                    AnonymousClass009 A003 = AnonymousClass009.A00();
                    AnonymousClass00G r2 = AnonymousClass00G.A01;
                    C002101e.A00();
                    A08 = new C018709t(A002, A003, r2, AnonymousClass04q.A00());
                }
            }
        }
        return A08;
    }

    public static String A02(UserJid userJid) {
        return C05870Qv.A01(C001801b.A12(C12420i4.A02(userJid))).A02;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004b, code lost:
        if (r1 != null) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0050, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List A03(X.C018709t r10) {
        /*
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            X.0RG r0 = r10.A01
            X.0BK r3 = r0.A8g()
            java.lang.String[] r5 = X.AnonymousClass0RH.A07
            r0 = 1
            java.lang.String[] r7 = new java.lang.String[r0]
            java.lang.String r1 = "5"
            r0 = 0
            r7[r0] = r1
            java.lang.String r4 = "methods"
            java.lang.String r6 = "type = ?"
            r8 = 0
            java.lang.String r9 = "readMerchantMethods/QUERY_SCHEMA_PAY_METHODS"
            android.database.Cursor r1 = r3.A08(r4, r5, r6, r7, r8, r9)
        L_0x0021:
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x0048 }
            if (r0 == 0) goto L_0x0033
            X.1VM r0 = r10.A07(r1)     // Catch:{ all -> 0x0048 }
            if (r0 == 0) goto L_0x0021
            X.1yv r0 = (X.C43771yv) r0     // Catch:{ all -> 0x0048 }
            r2.add(r0)     // Catch:{ all -> 0x0048 }
            goto L_0x0021
        L_0x0033:
            r1.close()
            java.lang.String r1 = "PAY: PaymentStore readMerchantMethods returned: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.d(r0)
            return r2
        L_0x0048:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x004a }
        L_0x004a:
            r0 = move-exception
            if (r1 == 0) goto L_0x0050
            r1.close()     // Catch:{ all -> 0x0050 }
        L_0x0050:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C018709t.A03(X.09t):java.util.List");
    }

    public static boolean A04(List list) {
        if (list == null || list.size() <= 0) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass1VM r1 = (AnonymousClass1VM) it.next();
            if (r1 != null) {
                if (TextUtils.isEmpty(r1.A07) || r1.A04() == 0) {
                    Log.w("PAY: PaymentsHelper sanitizePaymentMethods got empty credential id or account type");
                } else if (TextUtils.isEmpty(r1.A0A)) {
                    r1.A0A = AnonymousClass1VM.A02(r1.A04());
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006e, code lost:
        if (r4 != null) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0073, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized X.AnonymousClass0RK A05(com.whatsapp.jid.UserJid r12) {
        /*
        // Method dump skipped, instructions count: 144
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C018709t.A05(com.whatsapp.jid.UserJid):X.0RK");
    }

    public AnonymousClass1VM A06() {
        Iterator it = ((AbstractCollection) A0A()).iterator();
        while (it.hasNext()) {
            AnonymousClass1VM r2 = (AnonymousClass1VM) it.next();
            if (r2.A01 == 2) {
                return r2;
            }
        }
        return null;
    }

    public final AnonymousClass1VM A07(Cursor cursor) {
        AbstractC460627w r0;
        String str;
        AnonymousClass27v r3;
        AbstractC460727x r02;
        String string = cursor.getString(cursor.getColumnIndex("country"));
        int i = cursor.getInt(cursor.getColumnIndex("type"));
        String string2 = cursor.getString(cursor.getColumnIndex("credential_id"));
        C05870Qv A002 = C05870Qv.A00(string);
        String string3 = cursor.getString(cursor.getColumnIndex("country_data"));
        String string4 = cursor.getString(cursor.getColumnIndex("readable_name"));
        String string5 = cursor.getString(cursor.getColumnIndex("issuer_name"));
        int i2 = cursor.getInt(cursor.getColumnIndex("subtype"));
        long j = ((long) cursor.getInt(cursor.getColumnIndex("creation_ts"))) * 1000;
        long j2 = ((long) cursor.getInt(cursor.getColumnIndex("updated_ts"))) * 1000;
        int i3 = cursor.getInt(cursor.getColumnIndex("debit_mode"));
        int i4 = cursor.getInt(cursor.getColumnIndex("credit_mode"));
        byte[] blob = cursor.getBlob(cursor.getColumnIndex("icon"));
        switch (i) {
            case 1:
            case 4:
            case 6:
            case 7:
            case 8:
                AnonymousClass0RJ serviceBy = this.A02.getServiceBy(string, null);
                if (serviceBy != null) {
                    r0 = serviceBy.AAa();
                    if (r0 != null) {
                        r0.A02(string3);
                    }
                } else {
                    r0 = null;
                }
                if (r0 != null) {
                    str = r0.A05();
                } else {
                    str = null;
                }
                C43761yu r11 = new C43761yu(A002, string2, str, i, i3, i4, string4, i2);
                r11.A03 = j;
                r11.A06 = r0;
                r11.A0B = blob;
                return r11;
            case 2:
                AnonymousClass0RJ serviceBy2 = this.A02.getServiceBy(string, null);
                if (serviceBy2 != null) {
                    r3 = serviceBy2.AAZ();
                    if (r3 != null) {
                        r3.A02(string3);
                    }
                } else {
                    r3 = null;
                }
                return new C43751yt(A002, string2, j, j2, i3, i4, string4, string5, blob, r3);
            case 3:
                BigDecimal scaleByPowerOfTen = new BigDecimal(cursor.getLong(cursor.getColumnIndex("balance_1000"))).scaleByPowerOfTen(-3);
                int i5 = cursor.getInt(cursor.getColumnIndex("balance_ts"));
                AnonymousClass0RJ serviceBy3 = this.A02.getServiceBy(string, null);
                if (serviceBy3 != null) {
                    r02 = serviceBy3.AAe();
                    if (r02 != null) {
                        r02.A02(string3);
                    }
                } else {
                    r02 = null;
                }
                C43801yy r112 = new C43801yy(A002, string2, i3, i4, string4, scaleByPowerOfTen);
                r112.A06 = r02;
                r112.A08 = string5;
                r112.A00 = ((long) i5) * 1000;
                r112.A0B = blob;
                return r112;
            case 5:
            default:
                return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0040, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0041, code lost:
        if (r1 != null) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0046, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass1VM A08(java.lang.String r12) {
        /*
            r11 = this;
            r3 = 1
            java.lang.String[] r8 = new java.lang.String[r3]
            r0 = 0
            r8[r0] = r12
            X.0RG r0 = r11.A01
            X.0BK r4 = r0.A8g()
            java.lang.String[] r6 = X.AnonymousClass0RH.A07
            r9 = 0
            java.lang.String r5 = "methods"
            java.lang.String r7 = "credential_id=?"
            java.lang.String r10 = "readPaymentMethodByCredId/QUERY_SCHEMA_PAY_METHODS"
            android.database.Cursor r1 = r4.A08(r5, r6, r7, r8, r9, r10)
            boolean r0 = r1.moveToLast()     // Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x0024
            X.1VM r2 = r11.A07(r1)     // Catch:{ all -> 0x003e }
            goto L_0x0025
        L_0x0024:
            r2 = 0
        L_0x0025:
            r1.close()
            java.lang.String r0 = "PAY: PaymentStore readPaymentMethodByCredId/"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r12)
            java.lang.String r0 = "/"
            r1.append(r0)
            if (r2 != 0) goto L_0x003a
            r3 = 0
        L_0x003a:
            X.AnonymousClass008.A1Z(r1, r3)
            return r2
        L_0x003e:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0040 }
        L_0x0040:
            r0 = move-exception
            if (r1 == 0) goto L_0x0046
            r1.close()     // Catch:{ all -> 0x0046 }
        L_0x0046:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C018709t.A08(java.lang.String):X.1VM");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0040, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0041, code lost:
        if (r1 != null) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0046, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List A09() {
        /*
            r10 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            X.0RG r0 = r10.A01
            X.0BK r3 = r0.A8g()
            java.lang.String[] r5 = X.AnonymousClass0RH.A07
            r6 = 0
            java.lang.String r4 = "methods"
            java.lang.String r8 = "debit_mode DESC"
            java.lang.String r9 = "readPaymentAndMerchantMethods/QUERY_SCHEMA_PAY_METHODS"
            r7 = r6
            android.database.Cursor r1 = r3.A08(r4, r5, r6, r7, r8, r9)
        L_0x0019:
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x0029
            X.1VM r0 = r10.A07(r1)     // Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x0019
            r2.add(r0)     // Catch:{ all -> 0x003e }
            goto L_0x0019
        L_0x0029:
            r1.close()
            java.lang.String r1 = "PAY: PaymentStore readPaymentAndMerchantMethods returned: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.d(r0)
            return r2
        L_0x003e:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0040 }
        L_0x0040:
            r0 = move-exception
            if (r1 == 0) goto L_0x0046
            r1.close()     // Catch:{ all -> 0x0046 }
        L_0x0046:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C018709t.A09():java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0049, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004a, code lost:
        if (r1 != null) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004f, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List A0A() {
        /*
            r10 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            X.0RG r0 = r10.A01
            X.0BK r3 = r0.A8g()
            java.lang.String[] r5 = X.AnonymousClass0RH.A07
            r0 = 1
            java.lang.String[] r7 = new java.lang.String[r0]
            java.lang.String r1 = "5"
            r0 = 0
            r7[r0] = r1
            java.lang.String r4 = "methods"
            java.lang.String r6 = "type != ?"
            java.lang.String r8 = "debit_mode DESC"
            java.lang.String r9 = "readPaymentMethods/QUERY_SCHEMA_PAY_METHODS"
            android.database.Cursor r1 = r3.A08(r4, r5, r6, r7, r8, r9)
        L_0x0022:
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x0047 }
            if (r0 == 0) goto L_0x0032
            X.1VM r0 = r10.A07(r1)     // Catch:{ all -> 0x0047 }
            if (r0 == 0) goto L_0x0022
            r2.add(r0)     // Catch:{ all -> 0x0047 }
            goto L_0x0022
        L_0x0032:
            r1.close()
            java.lang.String r1 = "PAY: PaymentStore readPaymentMethods returned: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.d(r0)
            return r2
        L_0x0047:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0049 }
        L_0x0049:
            r0 = move-exception
            if (r1 == 0) goto L_0x004f
            r1.close()     // Catch:{ all -> 0x004f }
        L_0x004f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C018709t.A0A():java.util.List");
    }

    public synchronized void A0B() {
        AnonymousClass0RG r0 = this.A01;
        if (r0 != null) {
            r0.close();
        }
        File databasePath = this.A05.A00.getDatabasePath("payments.db");
        C001801b.A1p(databasePath, "PAY");
        if (databasePath.delete()) {
            StringBuilder sb = new StringBuilder();
            sb.append("PAY: PaymentStore deleteStore deleted ");
            sb.append(databasePath);
            Log.i(sb.toString());
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("PAY: PaymentStore failed to delete ");
            sb2.append(databasePath);
            Log.e(sb2.toString());
        }
        this.A07 = false;
    }

    public synchronized void A0C(UserJid userJid) {
        if (this.A02 != null) {
            String A022 = A02(userJid);
            if (!TextUtils.isEmpty(A022) && !A022.equals(C05870Qv.A0F.A02)) {
                AnonymousClass0RK A052 = A05(userJid);
                if (!(A052 == null || A052.A02 == null)) {
                    A052.A01 = this.A04.A05() + TimeUnit.DAYS.toMillis(1);
                    A0G(A052);
                }
            }
        }
    }

    public synchronized void A0D(UserJid userJid, boolean z, String str) {
        if (this.A02 != null) {
            if (z || !TextUtils.isEmpty(str)) {
                String A022 = A02(userJid);
                if (!TextUtils.isEmpty(A022) && !A022.equals(C05870Qv.A0F.A02)) {
                    AnonymousClass0RK A052 = A05(userJid);
                    if (A052 == null || A052.A02 == null) {
                        AnonymousClass0RJ serviceBy = this.A02.getServiceBy(A02(userJid), null);
                        if (serviceBy != null) {
                            A052 = serviceBy.AAb();
                            if (A052 != null) {
                                A052.A02 = userJid;
                            }
                        }
                        if (A052 != null) {
                        }
                    }
                    if (!(A052 instanceof AnonymousClass0RM)) {
                        A052.A04 = z;
                    }
                    if (!TextUtils.isEmpty(str)) {
                        A052.A03 = str;
                    }
                    A0G(A052);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006f, code lost:
        if (r5 != null) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0074, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0E(java.lang.String r8, X.AbstractC43791yx r9) {
        /*
        // Method dump skipped, instructions count: 117
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C018709t.A0E(java.lang.String, X.1yx):void");
    }

    public boolean A0F() {
        int A012 = this.A01.A9x().A01("methods", null, null, "removeAllPaymentMethods/DELETE_SCHEMA_PAY_METHODS");
        if (A012 >= 0) {
            AnonymousClass008.A0v("PAY: PaymentStore removeAllPaymentMethods deleted num rows: ", A012);
            return true;
        }
        AnonymousClass008.A0w("PAY: PaymentStore removeAllPaymentMethods could not delete all rows: ", A012);
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0092, code lost:
        if (((long) r10.A00("contacts", r7, "jid=?", new java.lang.String[]{r8.getRawString()}, "storeContacts/UPDATE_SCHEMA_PAY_CONTACTS")) >= 0) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009e, code lost:
        if (r10.A02("contacts", r7, "storeContacts/INSERT_SCHEMA_PAY_CONTACTS_TABLE") >= 0) goto L_0x00a2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A0G(X.AnonymousClass0RK r20) {
        /*
        // Method dump skipped, instructions count: 230
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C018709t.A0G(X.0RK):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008b, code lost:
        if (r12 == 8) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0207, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:?, code lost:
        r20.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x020b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x020e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0212, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00cd A[Catch:{ all -> 0x0207 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00de A[Catch:{ all -> 0x0207 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x012c A[Catch:{ all -> 0x0207 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x014b A[Catch:{ all -> 0x0207 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0154 A[Catch:{ all -> 0x0207 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x015b A[Catch:{ all -> 0x0207 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0173 A[Catch:{ all -> 0x0207 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0H(java.util.List r32) {
        /*
        // Method dump skipped, instructions count: 531
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C018709t.A0H(java.util.List):boolean");
    }
}
