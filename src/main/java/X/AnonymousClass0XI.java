package X;

import android.os.Message;
import com.whatsapp.jid.Jid;

/* renamed from: X.0XI  reason: invalid class name */
public class AnonymousClass0XI implements AnonymousClass0C0 {
    public static volatile AnonymousClass0XI A09;
    public final AnonymousClass009 A00;
    public final AnonymousClass02M A01;
    public final C03250Fl A02;
    public final AnonymousClass01J A03;
    public final C001000o A04;
    public final C001400w A05;
    public final AnonymousClass01S A06;
    public final AnonymousClass09H A07;
    public final AnonymousClass0AR A08;

    public AnonymousClass0XI(AnonymousClass02M r1, AnonymousClass009 r2, AnonymousClass0AR r3, AnonymousClass01J r4, AnonymousClass09H r5, C001400w r6, C03250Fl r7, C001000o r8, AnonymousClass01S r9) {
        this.A01 = r1;
        this.A00 = r2;
        this.A08 = r3;
        this.A03 = r4;
        this.A07 = r5;
        this.A02 = r7;
        this.A04 = r8;
        this.A06 = r9;
        this.A05 = r6;
    }

    public final void A00(String str, Jid jid, int i) {
        AnonymousClass09H r3 = this.A07;
        Message obtain = Message.obtain(null, 0, 225, i, jid);
        obtain.getData().putString("id", str);
        r3.A0C(obtain);
    }

    @Override // X.AnonymousClass0C0
    public int[] A6c() {
        return new int[]{114, 120, 115, 116, 117, 170, 172, 206};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:190:0x04d9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x04da, code lost:
        if (r3 != null) goto L_0x04dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x04df, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x04bc  */
    @Override // X.AnonymousClass0C0
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean AAE(int r29, android.os.Message r30) {
        /*
        // Method dump skipped, instructions count: 1808
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0XI.AAE(int, android.os.Message):boolean");
    }
}
