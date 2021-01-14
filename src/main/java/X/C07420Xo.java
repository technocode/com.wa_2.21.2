package X;

import android.text.TextUtils;
import android.util.Base64;
import com.whatsapp.util.Log;
import java.util.Arrays;

/* renamed from: X.0Xo  reason: invalid class name and case insensitive filesystem */
public class C07420Xo implements AbstractC03680Hf, AnonymousClass0C0 {
    public static volatile C07420Xo A0I;
    public final AnonymousClass009 A00;
    public final AnonymousClass02M A01;
    public final C017009c A02;
    public final C017109d A03;
    public final C04520Kr A04;
    public final AnonymousClass0HL A05;
    public final C07430Xq A06;
    public final AnonymousClass08B A07;
    public final AnonymousClass0HN A08;
    public final AnonymousClass00S A09;
    public final AnonymousClass00D A0A;
    public final AnonymousClass01K A0B;
    public final AnonymousClass01P A0C;
    public final AnonymousClass00Y A0D;
    public final AnonymousClass09H A0E;
    public final AnonymousClass0AR A0F;
    public final AnonymousClass3P8 A0G;
    public final AnonymousClass00T A0H;

    @Override // X.AnonymousClass0C0
    public int[] A6c() {
        return new int[]{202};
    }

    @Override // X.AbstractC03680Hf
    public void AGV() {
    }

    @Override // X.AbstractC03680Hf
    public void AGW() {
    }

    public C07420Xo(AnonymousClass00S r2, AnonymousClass02M r3, AnonymousClass009 r4, AnonymousClass00T r5, AnonymousClass00Y r6, AnonymousClass0AR r7, AnonymousClass09H r8, AnonymousClass08B r9, AnonymousClass01K r10, C07430Xq r11, AnonymousClass3P8 r12, AnonymousClass0HN r13, C04520Kr r14, AnonymousClass0HL r15, AnonymousClass01P r16, AnonymousClass00D r17, C017109d r18, C017009c r19) {
        this.A09 = r2;
        this.A01 = r3;
        this.A00 = r4;
        this.A0H = r5;
        this.A0D = r6;
        this.A0F = r7;
        this.A0E = r8;
        this.A07 = r9;
        this.A0B = r10;
        this.A06 = r11;
        this.A0G = r12;
        this.A04 = r14;
        this.A08 = r13;
        this.A05 = r15;
        this.A0C = r16;
        this.A0A = r17;
        this.A03 = r18;
        this.A02 = r19;
    }

    public final boolean A00(String str, AnonymousClass1XX r5, AnonymousClass0RB r6) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        byte[] decode = Base64.decode(str.getBytes(), 0);
        StringBuilder A0S = AnonymousClass008.A0S("businessnotificationhandler/notifySidelistUpdate");
        A0S.append(Arrays.toString(decode));
        Log.d(A0S.toString());
        AnonymousClass0Hz r1 = new AnonymousClass0Hz(EnumC03840Hy.NOTIFICATION_SIDELIST);
        r1.A04 = true;
        r1.A00 = r6;
        r1.A03(decode);
        this.A08.A02(r1.A01(), true);
        this.A0F.A0M(r5);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:73:0x02c4, code lost:
        if (r0 != false) goto L_0x00d7;
     */
    @Override // X.AnonymousClass0C0
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean AAE(int r26, android.os.Message r27) {
        /*
        // Method dump skipped, instructions count: 758
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07420Xo.AAE(int, android.os.Message):boolean");
    }
}
