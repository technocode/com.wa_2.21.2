package X;

import android.database.ContentObserver;
import android.database.Cursor;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.2dw  reason: invalid class name and case insensitive filesystem */
public class C53852dw implements AbstractC48892Oe {
    public int A00 = 0;
    public C47942Kh A01;
    public final AnonymousClass01K A02;
    public final AnonymousClass0BV A03;
    public final AnonymousClass02N A04;
    public final C02580Cq A05;
    public final Map A06 = new HashMap();

    public C53852dw(AnonymousClass01K r2, AnonymousClass0BV r3, C02580Cq r4, AnonymousClass02N r5) {
        this.A02 = r2;
        this.A03 = r3;
        this.A05 = r4;
        this.A04 = r5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0037, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003b, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.database.Cursor A00() {
        /*
            r8 = this;
            boolean r0 = r8 instanceof X.C74253aR
            if (r0 != 0) goto L_0x0040
            X.0BV r7 = r8.A03
            X.02N r1 = r8.A04
            if (r1 == 0) goto L_0x003e
            if (r7 == 0) goto L_0x003c
            java.lang.String r0 = "mediamsgstore/getMediaMessagesCursor:"
            X.AnonymousClass008.A12(r0, r1)
            X.08d r0 = r7.A0C
            X.0OQ r6 = r0.A03()
            X.0BK r5 = r6.A04     // Catch:{ all -> 0x0035 }
            java.lang.String r4 = X.AbstractC05370Og.A0a     // Catch:{ all -> 0x0035 }
            r0 = 1
            java.lang.String[] r3 = new java.lang.String[r0]     // Catch:{ all -> 0x0035 }
            r2 = 0
            X.08c r0 = r7.A06     // Catch:{ all -> 0x0035 }
            long r0 = r0.A05(r1)     // Catch:{ all -> 0x0035 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0035 }
            r3[r2] = r0     // Catch:{ all -> 0x0035 }
            java.lang.String r0 = "GET_MEDIA_MESSAGES_SQL_ORDER_BY_ID"
            android.database.Cursor r0 = r5.A07(r4, r3, r0)     // Catch:{ all -> 0x0035 }
            r6.close()
            return r0
        L_0x0035:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0037 }
        L_0x0037:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x003b }
        L_0x003b:
            throw r0
        L_0x003c:
            r0 = 0
            throw r0
        L_0x003e:
            r0 = 0
            throw r0
        L_0x0040:
            r0 = r8
            X.3aR r0 = (X.C74253aR) r0
            int r3 = r0.A00
            int r2 = r0.A01
            X.02N r1 = r0.A04
            X.0BV r0 = r0.A03
            android.database.Cursor r0 = X.C28051Sr.A0K(r3, r2, r1, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53852dw.A00():android.database.Cursor");
    }

    /* renamed from: A01 */
    public AbstractC53892e0 A7I(int i) {
        AbstractC53892e0 r1;
        Map map = this.A06;
        Integer valueOf = Integer.valueOf(i);
        AbstractC53892e0 r12 = (AbstractC53892e0) map.get(valueOf);
        if (this.A01 == null || r12 != null) {
            return r12;
        }
        synchronized (this) {
            if (this.A01.moveToPosition(i)) {
                C47942Kh r0 = this.A01;
                C02580Cq r13 = this.A05;
                AnonymousClass0M3 A002 = r0.A00();
                if (A002 != null) {
                    r1 = C28051Sr.A0d(A002, r13);
                    if (r1 != null) {
                        map.put(valueOf, r1);
                    }
                } else {
                    throw null;
                }
            } else {
                r1 = null;
            }
        }
        return r1;
    }

    @Override // X.AbstractC48892Oe
    public HashMap A4z() {
        return new HashMap();
    }

    @Override // X.AbstractC48892Oe
    public void AMq() {
        C47942Kh r2 = this.A01;
        if (r2 != null) {
            Cursor A002 = A00();
            r2.A01.close();
            r2.A01 = A002;
            r2.A00 = -1;
            r2.moveToPosition(-1);
        }
        this.A06.clear();
        this.A00 = 0;
    }

    @Override // X.AbstractC48892Oe
    public void close() {
        C47942Kh r0 = this.A01;
        if (r0 != null) {
            r0.close();
        }
    }

    @Override // X.AbstractC48892Oe
    public int getCount() {
        C47942Kh r0 = this.A01;
        if (r0 == null) {
            return 0;
        }
        return r0.getCount() - this.A00;
    }

    @Override // X.AbstractC48892Oe
    public boolean isEmpty() {
        return getCount() == 0;
    }

    @Override // X.AbstractC48892Oe
    public void registerContentObserver(ContentObserver contentObserver) {
        C47942Kh r0 = this.A01;
        if (r0 != null) {
            r0.registerContentObserver(contentObserver);
        }
    }

    @Override // X.AbstractC48892Oe
    public void unregisterContentObserver(ContentObserver contentObserver) {
        C47942Kh r0 = this.A01;
        if (r0 != null) {
            r0.unregisterContentObserver(contentObserver);
        }
    }
}
