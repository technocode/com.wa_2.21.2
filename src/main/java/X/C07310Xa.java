package X;

import android.os.Handler;
import android.os.Looper;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.util.Log;

/* renamed from: X.0Xa  reason: invalid class name and case insensitive filesystem */
public final class C07310Xa implements AnonymousClass0C0 {
    public static volatile C07310Xa A0B;
    public final Handler A00 = new Handler(Looper.getMainLooper());
    public final C03250Fl A01;
    public final C04540Kt A02;
    public final AnonymousClass0KZ A03;
    public final AnonymousClass04v A04;
    public final AnonymousClass0L3 A05;
    public final AnonymousClass00D A06;
    public final C001000o A07;
    public final C001400w A08;
    public final AnonymousClass0I8 A09;
    public final AnonymousClass0AR A0A;

    public C07310Xa(AnonymousClass0AR r3, C001400w r4, AnonymousClass0KZ r5, C03250Fl r6, C001000o r7, AnonymousClass04v r8, AnonymousClass00D r9, AnonymousClass0I8 r10, C04540Kt r11, AnonymousClass0L3 r12) {
        this.A0A = r3;
        this.A08 = r4;
        this.A03 = r5;
        this.A01 = r6;
        this.A07 = r7;
        this.A04 = r8;
        this.A06 = r9;
        this.A09 = r10;
        this.A02 = r11;
        this.A05 = r12;
    }

    public final void A00(DeviceJid deviceJid) {
        StringBuilder sb = new StringBuilder("Prekey request returned none or signature invalid; jid=");
        sb.append(deviceJid);
        Log.i(sb.toString());
        this.A07.A0N(C001801b.A0A(deviceJid), null);
        C04540Kt r2 = this.A02;
        synchronized (r2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("prekeysmanager/onGetPreKeyNone:");
            sb2.append(deviceJid);
            Log.i(sb2.toString());
            r2.A06.remove(deviceJid);
        }
        if (!deviceJid.isPrimary()) {
            this.A09.A06(deviceJid, true);
        }
    }

    @Override // X.AnonymousClass0C0
    public int[] A6c() {
        return new int[]{74, 75, 76, 77, 78, 196, 79, 80, 81, 82, 83, 84};
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:93:0x0063 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v3, types: [byte[][]] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // X.AnonymousClass0C0
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean AAE(int r21, android.os.Message r22) {
        /*
        // Method dump skipped, instructions count: 752
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07310Xa.AAE(int, android.os.Message):boolean");
    }
}
