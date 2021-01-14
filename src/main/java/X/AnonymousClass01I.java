package X;

import com.whatsapp.Me;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.01I  reason: invalid class name */
public class AnonymousClass01I {
    public static volatile AnonymousClass01I A07;
    public Me A00;
    public AnonymousClass0HR A01;
    public DeviceJid A02;
    public UserJid A03;
    public final AnonymousClass039 A04 = new AnonymousClass039();
    public final AnonymousClass00G A05;
    public final AnonymousClass00D A06;

    public AnonymousClass01I(AnonymousClass00G r2, AnonymousClass00D r3) {
        this.A05 = r2;
        this.A06 = r3;
    }

    public static AnonymousClass01I A00() {
        if (A07 == null) {
            synchronized (AnonymousClass01I.class) {
                if (A07 == null) {
                    A07 = new AnonymousClass01I(AnonymousClass00G.A01, AnonymousClass00D.A00());
                }
            }
        }
        return A07;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0040, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.whatsapp.Me A01() {
        /*
            r5 = this;
            java.lang.String r0 = "memanager/getoldme"
            com.whatsapp.util.Log.i(r0)
            r5.A04()
            X.00G r0 = r5.A05
            android.app.Application r3 = r0.A00
            java.io.File r2 = r3.getFilesDir()
            java.lang.String r1 = "me_old"
            java.io.File r0 = new java.io.File
            r0.<init>(r2, r1)
            boolean r0 = r0.exists()
            r4 = 0
            if (r0 == 0) goto L_0x005e
            java.io.FileInputStream r3 = r3.openFileInput(r1)     // Catch:{ ClassNotFoundException -> 0x0054, IOException -> 0x004a }
            X.0Pv r1 = new X.0Pv     // Catch:{ all -> 0x0041 }
            r1.<init>(r3)     // Catch:{ all -> 0x0041 }
            java.lang.Object r2 = r1.readObject()     // Catch:{ all -> 0x003a }
            com.whatsapp.Me r2 = (com.whatsapp.Me) r2     // Catch:{ all -> 0x003a }
            r1.close()     // Catch:{ all -> 0x0037 }
            if (r3 == 0) goto L_0x0036
            r3.close()     // Catch:{ ClassNotFoundException -> 0x0056, IOException -> 0x004c }
            return r2
        L_0x0036:
            return r2
        L_0x0037:
            r0 = move-exception
            r4 = r2
            goto L_0x0042
        L_0x003a:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x003c }
        L_0x003c:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0040 }
        L_0x0040:
            throw r0
        L_0x0041:
            r0 = move-exception
        L_0x0042:
            throw r0     // Catch:{ all -> 0x0043 }
        L_0x0043:
            r0 = move-exception
            if (r3 == 0) goto L_0x0049
            r3.close()     // Catch:{ all -> 0x0049 }
        L_0x0049:
            throw r0
        L_0x004a:
            r1 = move-exception
            goto L_0x004e
        L_0x004c:
            r1 = move-exception
            r4 = r2
        L_0x004e:
            java.lang.String r0 = "memanager/read_old_me/io_error"
            com.whatsapp.util.Log.e(r0, r1)
            return r4
        L_0x0054:
            r1 = move-exception
            goto L_0x0058
        L_0x0056:
            r1 = move-exception
            r4 = r2
        L_0x0058:
            java.lang.String r0 = "memanager/read_old_me/serialization_error"
            com.whatsapp.util.Log.w(r0, r1)
            return r4
        L_0x005e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass01I.A01():com.whatsapp.Me");
    }

    public String A02() {
        return this.A06.A00.getString("push_name", "");
    }

    public void A03() {
        Log.i("memanager/deleteoldme");
        A04();
        new File(this.A05.A00.getFilesDir(), "me_old").delete();
    }

    public void A04() {
        AnonymousClass039 r1 = this.A04;
        if (r1.A03()) {
            r1.A02(new CallableC05610Pj(this));
            r1.A00();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001c A[Catch:{ 02Y -> 0x001f }] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0015 A[Catch:{ 02Y -> 0x001f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(com.whatsapp.Me r5) {
        /*
        // Method dump skipped, instructions count: 124
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass01I.A05(com.whatsapp.Me):void");
    }

    public void A06(String str) {
        this.A06.A00.edit().putString("push_name", str).apply();
        A04();
        AnonymousClass0HR r0 = this.A01;
        if (r0 != null) {
            r0.A0O = str;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A07(com.whatsapp.Me r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.String r0 = "memanager/save "
            X.AnonymousClass008.A18(r0, r6)
            r3 = 0
            X.00G r0 = r4.A05     // Catch:{ FileNotFoundException -> 0x0035, IOException -> 0x0022 }
            android.app.Application r0 = r0.A00     // Catch:{ FileNotFoundException -> 0x0035, IOException -> 0x0022 }
            java.io.FileOutputStream r0 = r0.openFileOutput(r6, r3)     // Catch:{ FileNotFoundException -> 0x0035, IOException -> 0x0022 }
            java.io.ObjectOutputStream r1 = new java.io.ObjectOutputStream     // Catch:{ FileNotFoundException -> 0x0035, IOException -> 0x0022 }
            r1.<init>(r0)     // Catch:{ FileNotFoundException -> 0x0035, IOException -> 0x0022 }
            r1.writeObject(r5)     // Catch:{ all -> 0x001b }
            r1.close()
            r3 = 1
            return r3
        L_0x001b:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x001d }
        L_0x001d:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0021 }
        L_0x0021:
            throw r0
        L_0x0022:
            r2 = move-exception
            java.lang.String r1 = "memanager/save/ioerror "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e(r0, r2)
            return r3
        L_0x0035:
            r2 = move-exception
            java.lang.String r1 = "memanager/save/notfounderror "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e(r0, r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass01I.A07(com.whatsapp.Me, java.lang.String):boolean");
    }

    public boolean A08(DeviceJid deviceJid) {
        if (deviceJid != null) {
            UserJid userJid = deviceJid.userJid;
            A04();
            return userJid.equals(this.A03) && (deviceJid.isPrimary() ^ true);
        }
    }

    public boolean A09(Jid jid) {
        if (jid != null) {
            A04();
            return jid.equals(this.A03);
        }
    }
}
