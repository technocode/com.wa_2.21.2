package X;

import android.content.ContentValues;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1Ui  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC28441Ui {
    public final C000300f A00;
    public final AnonymousClass01A A01;
    public final AnonymousClass01B A02;
    public final C001000o A03;
    public final C001400w A04;
    public final C43481yR A05 = new C43481yR();
    public final AnonymousClass00Y A06;
    public final Object A07 = new Object();
    public final Map A08 = Collections.synchronizedMap(new HashMap());

    public AbstractC28441Ui(AnonymousClass00Y r2, C000300f r3, AnonymousClass01A r4, C001400w r5, C001000o r6, AnonymousClass01B r7) {
        this.A06 = r2;
        this.A00 = r3;
        this.A01 = r4;
        this.A03 = r6;
        this.A02 = r7;
        this.A04 = r5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0022, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0025, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0029, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(com.whatsapp.jid.UserJid r6) {
        /*
            r5 = this;
            java.lang.Object r3 = r5.A07
            monitor-enter(r3)
            X.01B r4 = r5.A02     // Catch:{ all -> 0x004c }
            X.08H r0 = r4.A00     // Catch:{ IllegalArgumentException -> 0x002a }
            X.0OQ r2 = r0.A03()     // Catch:{ IllegalArgumentException -> 0x002a }
            X.0Rk r1 = r2.A00()     // Catch:{ all -> 0x0023 }
            r4.A0H(r1, r6)     // Catch:{ all -> 0x001c }
            r1.A00()     // Catch:{ all -> 0x001c }
            r1.close()
            r2.close()
            goto L_0x003f
        L_0x001c:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x001e }
        L_0x001e:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0022 }
        L_0x0022:
            throw r0
        L_0x0023:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0025 }
        L_0x0025:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0029 }
        L_0x0029:
            throw r0
        L_0x002a:
            r2 = move-exception
            java.lang.String r1 = "contact-mgr-db/unable to delete vname details "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r1 = r0.toString()
            r0 = 0
            if (r1 == 0) goto L_0x004b
            com.whatsapp.util.Log.e(r1, r2)
        L_0x003f:
            monitor-exit(r3)
            java.util.Map r0 = r5.A08
            r0.remove(r6)
            X.01A r0 = r5.A01
            r0.A0H()
            return
        L_0x004b:
            throw r0
        L_0x004c:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC28441Ui.A00(com.whatsapp.jid.UserJid):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0389, code lost:
        r13 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0146, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0147, code lost:
        r16 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0150, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0151, code lost:
        r16 = true;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x020c  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0242  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x02dc  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0333 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0389 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:8:0x0035] */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x038c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:237:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0172  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(com.whatsapp.jid.UserJid r30, byte[] r31, int r32, int r33, X.AnonymousClass0OB r34) {
        /*
        // Method dump skipped, instructions count: 1120
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC28441Ui.A01(com.whatsapp.jid.UserJid, byte[], int, int, X.0OB):void");
    }

    public boolean A02(UserJid userJid) {
        AnonymousClass0J9 A0C = this.A02.A0C(userJid);
        return A0C != null && A0C.A01();
    }

    public boolean A03(UserJid userJid, int i) {
        synchronized (this.A07) {
            AnonymousClass01B r2 = this.A02;
            AnonymousClass0J9 A0C = r2.A0C(userJid);
            if ((A0C != null ? A0C.A03 : 0) == i) {
                return false;
            }
            r2.A0N(userJid, i);
            this.A01.A0H();
            return true;
        }
    }

    public boolean A04(UserJid userJid, int i, AnonymousClass0OB r15, boolean z) {
        boolean z2;
        if (!this.A00.A0D(AbstractC000400g.A0Z)) {
            return A03(userJid, i);
        }
        synchronized (this.A07) {
            AnonymousClass01B r8 = this.A02;
            AnonymousClass0J9 A0C = r8.A0C(userJid);
            z2 = false;
            int i2 = A0C != null ? A0C.A03 : 0;
            long j = A0C != null ? A0C.A04 : 0;
            ContentValues contentValues = new ContentValues();
            if (i2 != i) {
                contentValues.put("verified_level", Integer.valueOf(i));
            }
            if (r15 != null) {
                long j2 = r15.A02;
                if (j < j2 || (j > 0 && j2 == 0)) {
                    contentValues.put("host_storage", Integer.valueOf(r15.A01));
                    contentValues.put("actual_actors", Integer.valueOf(r15.A00));
                    contentValues.put("privacy_mode_ts", Long.valueOf(j2));
                }
            }
            if (contentValues.size() > 0) {
                z2 = true;
                try {
                    r8.A05("wa_vnames", contentValues, "jid = ?", new String[]{AnonymousClass1VY.A0D(userJid)});
                } catch (IllegalArgumentException e) {
                    StringBuilder A0X = AnonymousClass008.A0X("wadbhelper/update-multi-fields/unable to update fields", userJid, ", ");
                    A0X.append(contentValues.toString());
                    String obj = A0X.toString();
                    if (obj != null) {
                        Log.e(obj, e);
                    } else {
                        throw null;
                    }
                }
                r8.A02.A02(r8.A0E(userJid));
                StringBuilder sb = new StringBuilder("contact-mgr-db/wadbhelper/update-multi-fields/updated fields jid=");
                sb.append(userJid);
                sb.append(", ");
                sb.append(contentValues);
                Log.d(sb.toString());
                if (z && i2 != i) {
                    this.A01.A0H();
                }
            }
        }
        return z2;
    }

    public boolean A05(UserJid userJid, byte[] bArr, int i, int i2, AnonymousClass0OB r8) {
        boolean z;
        synchronized (this.A07) {
            A01(userJid, bArr, i, i2, r8);
            AnonymousClass0J9 A0C = this.A02.A0C(userJid);
            if (A0C != null) {
                int i3 = A0C.A02;
                z = false;
                if (i3 == 0) {
                    z = true;
                }
            } else {
                throw null;
            }
        }
        return z;
    }
}
