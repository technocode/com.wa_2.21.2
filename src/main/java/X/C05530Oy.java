package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.whatsapp.jid.Jid;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0Oy  reason: invalid class name and case insensitive filesystem */
public class C05530Oy {
    public static volatile C05530Oy A02;
    public AnonymousClass0BR A00 = null;
    public final C03540Gq A01;

    public C05530Oy(C03540Gq r2) {
        this.A01 = r2;
    }

    public static final int A00(Jid jid, C27711Rc r8, AnonymousClass0OQ r9) {
        return r9.A04.A00("cart_item", A01(jid, r8), "business_id=?  AND product_id=?", new String[]{jid.getRawString(), r8.A01.A06}, "cart_item.UPDATE_CART_ITEM");
    }

    public static ContentValues A01(Jid jid, C27711Rc r7) {
        Long l;
        String str;
        C48052Ks r5 = r7.A01;
        BigDecimal bigDecimal = r5.A09;
        String str2 = null;
        if (bigDecimal != null) {
            l = Long.valueOf(bigDecimal.multiply(new BigDecimal(1000.0d)).longValue());
        } else {
            l = null;
        }
        C05910Qz r0 = r5.A01;
        if (r0 != null) {
            str2 = r0.A00;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("business_id", jid.getRawString());
        contentValues.put("product_id", r5.A06);
        contentValues.put("product_title", r5.A08);
        contentValues.put("product_price_1000", l);
        contentValues.put("product_currency_code", str2);
        List list = r5.A0A;
        if (!list.isEmpty()) {
            str = ((C48072Ku) list.get(0)).A02;
        } else {
            str = "";
        }
        contentValues.put("product_image_id", str);
        contentValues.put("product_quantity", Long.valueOf(r7.A00));
        return contentValues;
    }

    public static C05530Oy A02() {
        if (A02 == null) {
            synchronized (C05530Oy.class) {
                if (A02 == null) {
                    A02 = new C05530Oy(C03540Gq.A00());
                }
            }
        }
        return A02;
    }

    public static final C27711Rc A03(Cursor cursor) {
        C05910Qz r10;
        BigDecimal bigDecimal;
        String string = cursor.getString(cursor.getColumnIndexOrThrow("product_id"));
        String string2 = cursor.getString(cursor.getColumnIndexOrThrow("product_title"));
        Long valueOf = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow("product_price_1000")));
        String string3 = cursor.getString(cursor.getColumnIndexOrThrow("product_currency_code"));
        long j = cursor.getLong(cursor.getColumnIndexOrThrow("product_quantity"));
        String string4 = cursor.getString(cursor.getColumnIndexOrThrow("product_image_id"));
        if (!TextUtils.isEmpty(string3)) {
            r10 = new C05910Qz(string3);
        } else {
            r10 = null;
        }
        if (valueOf == null || r10 == null) {
            bigDecimal = null;
        } else {
            bigDecimal = AnonymousClass1S6.A02(r10, valueOf.longValue());
        }
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(string4)) {
            arrayList.add(new C48072Ku(string4, "", null, 0, 0));
        }
        return new C27711Rc(new C48052Ks(string, string2, null, bigDecimal, r10, null, null, arrayList, null, null, true), j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0040, code lost:
        if (r1 != null) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004f, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C27711Rc A04(com.whatsapp.jid.Jid r11, java.lang.String r12) {
        /*
            r10 = this;
            X.0Gq r1 = r10.A01
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r1.A05
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r5 = r0.readLock()
            X.2bV r6 = r1.A02()
            X.009 r9 = r1.A01
            r7 = 0
            r8 = 0
            X.0OQ r4 = new X.0OQ
            r4.<init>(r5, r6, r7, r8, r9)
            X.0BK r3 = r4.A04     // Catch:{ all -> 0x0049 }
            java.lang.String r2 = "SELECT product_id, product_title, product_price_1000, product_currency_code, product_image_id, product_quantity FROM cart_item WHERE business_id=? AND product_id=?"
            r0 = 2
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x0049 }
            java.lang.String r0 = r11.getRawString()     // Catch:{ all -> 0x0049 }
            r1[r8] = r0     // Catch:{ all -> 0x0049 }
            r0 = 1
            r1[r0] = r12     // Catch:{ all -> 0x0049 }
            java.lang.String r0 = "cart_item.SELECT_CART_ITEM"
            android.database.Cursor r1 = r3.A07(r2, r1, r0)     // Catch:{ all -> 0x0049 }
            if (r1 == 0) goto L_0x003f
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x0038 }
            if (r0 == 0) goto L_0x003f
            X.1Rc r0 = A03(r1)     // Catch:{ all -> 0x0038 }
            goto L_0x0042
        L_0x0038:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x003a }
        L_0x003a:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x003e }
        L_0x003e:
            throw r0
        L_0x003f:
            r0 = 0
            if (r1 == 0) goto L_0x0045
        L_0x0042:
            r1.close()
        L_0x0045:
            r4.close()
            return r0
        L_0x0049:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x004b }
        L_0x004b:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x004f }
        L_0x004f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05530Oy.A04(com.whatsapp.jid.Jid, java.lang.String):X.1Rc");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0057, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0058, code lost:
        if (r3 != null) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0060, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0064, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.concurrent.Future A05(com.whatsapp.jid.Jid r13) {
        /*
        // Method dump skipped, instructions count: 106
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05530Oy.A05(com.whatsapp.jid.Jid):java.util.concurrent.Future");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0023, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001f, code lost:
        r0 = move-exception;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06(com.whatsapp.jid.Jid r7) {
        /*
            r6 = this;
            X.0Gq r0 = r6.A01
            X.0OQ r5 = r0.A01()
            X.0BK r4 = r5.A04     // Catch:{ all -> 0x001d }
            java.lang.String r3 = "DELETE FROM cart_item WHERE business_id=?"
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x001d }
            r1 = 0
            java.lang.String r0 = r7.getRawString()     // Catch:{ all -> 0x001d }
            r2[r1] = r0     // Catch:{ all -> 0x001d }
            java.lang.String r0 = "cart_item.DELETE_CART"
            r4.A0D(r3, r2, r0)     // Catch:{ all -> 0x001d }
            r5.close()
            return
        L_0x001d:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x001f }
        L_0x001f:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x0023 }
        L_0x0023:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05530Oy.A06(com.whatsapp.jid.Jid):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0061, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0065, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(com.whatsapp.jid.Jid r9, X.C27711Rc r10) {
        /*
        // Method dump skipped, instructions count: 102
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05530Oy.A07(com.whatsapp.jid.Jid, X.1Rc):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0026, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0022, code lost:
        r0 = move-exception;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A08(com.whatsapp.jid.Jid r7, java.lang.String r8) {
        /*
            r6 = this;
            X.0Gq r0 = r6.A01
            X.0OQ r5 = r0.A01()
            X.0BK r4 = r5.A04     // Catch:{ all -> 0x0020 }
            java.lang.String r3 = "DELETE FROM cart_item WHERE business_id=? AND product_id=?"
            r0 = 2
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x0020 }
            r1 = 0
            java.lang.String r0 = r7.getRawString()     // Catch:{ all -> 0x0020 }
            r2[r1] = r0     // Catch:{ all -> 0x0020 }
            r0 = 1
            r2[r0] = r8     // Catch:{ all -> 0x0020 }
            java.lang.String r0 = "cart_item.DELETE_CART_ITEM"
            r4.A0D(r3, r2, r0)     // Catch:{ all -> 0x0020 }
            r5.close()
            return
        L_0x0020:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0022 }
        L_0x0022:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x0026 }
        L_0x0026:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05530Oy.A08(com.whatsapp.jid.Jid, java.lang.String):void");
    }
}
