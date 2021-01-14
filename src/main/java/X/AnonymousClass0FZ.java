package X;

import android.os.Message;
import java.util.Collections;
import java.util.Set;

/* renamed from: X.0FZ  reason: invalid class name */
public class AnonymousClass0FZ {
    public static volatile AnonymousClass0FZ A0H;
    public final AnonymousClass009 A00;
    public final AnonymousClass0CD A01;
    public final AnonymousClass01I A02;
    public final AnonymousClass0AH A03;
    public final C000300f A04;
    public final AnonymousClass01J A05;
    public final AnonymousClass09K A06;
    public final AnonymousClass00S A07;
    public final C001400w A08;
    public final C019309z A09;
    public final AnonymousClass01N A0A;
    public final AnonymousClass09J A0B;
    public final AnonymousClass09H A0C;
    public final C03160Fa A0D;
    public final C015808q A0E;
    public final C03110Ev A0F;
    public final AnonymousClass321 A0G;

    public AnonymousClass0FZ(AnonymousClass00S r2, AnonymousClass009 r3, AnonymousClass01I r4, C000300f r5, AnonymousClass01J r6, AnonymousClass09H r7, AnonymousClass0AH r8, C03160Fa r9, C001400w r10, AnonymousClass09J r11, AnonymousClass09K r12, AnonymousClass0CD r13, C03110Ev r14, C015808q r15, AnonymousClass01N r16, C019309z r17, AnonymousClass321 r18) {
        this.A07 = r2;
        this.A00 = r3;
        this.A02 = r4;
        this.A04 = r5;
        this.A05 = r6;
        this.A0C = r7;
        this.A03 = r8;
        this.A0D = r9;
        this.A08 = r10;
        this.A0B = r11;
        this.A06 = r12;
        this.A01 = r13;
        this.A0F = r14;
        this.A0E = r15;
        this.A0A = r16;
        this.A09 = r17;
        this.A0G = r18;
    }

    public static AnonymousClass0FZ A00() {
        if (A0H == null) {
            synchronized (AnonymousClass0FZ.class) {
                if (A0H == null) {
                    A0H = new AnonymousClass0FZ(AnonymousClass00S.A00(), AnonymousClass009.A00(), AnonymousClass01I.A00(), C000300f.A00(), AnonymousClass01J.A00(), AnonymousClass09H.A01(), AnonymousClass0AH.A03(), C03160Fa.A00(), C001400w.A02, AnonymousClass09J.A02, AnonymousClass09K.A07, AnonymousClass0CD.A00(), C03110Ev.A00(), C015808q.A00(), AnonymousClass01N.A00(), C019309z.A01(), AnonymousClass321.A00());
                }
            }
        }
        return A0H;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0080, code lost:
        if (r4.contains(X.AnonymousClass09J.A00(r0, r44)) == false) goto L_0x0082;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.AbstractC007503q r43, com.whatsapp.jid.DeviceJid r44, com.whatsapp.jid.UserJid r45, java.util.Set r46, boolean r47, long r48, long r50, java.lang.Runnable r52, X.AnonymousClass0I1 r53) {
        /*
        // Method dump skipped, instructions count: 361
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0FZ.A01(X.03q, com.whatsapp.jid.DeviceJid, com.whatsapp.jid.UserJid, java.util.Set, boolean, long, long, java.lang.Runnable, X.0I1):void");
    }

    public void A02(AbstractC007503q r13, Set set, boolean z, Runnable runnable) {
        A01(r13, null, null, set, z, 0, 0, runnable, null);
    }

    public void A03(AbstractC007503q r2, boolean z, Runnable runnable) {
        A02(r2, Collections.emptySet(), z, runnable);
    }

    public void A04(boolean z) {
        this.A0D.A1V = z;
        this.A0C.A0A(Message.obtain(null, 0, 37, 0, Boolean.valueOf(z)), null, false);
    }
}
