package X;

import android.os.SystemClock;
import com.google.android.search.verification.client.R;
import java.util.HashMap;
import java.util.Timer;

/* renamed from: X.1tE  reason: invalid class name and case insensitive filesystem */
public class C40411tE {
    public static HashMap A0O = new HashMap();
    public long A00 = SystemClock.elapsedRealtime();
    public AnonymousClass1N8 A01 = new AnonymousClass1N8(this);
    public Long A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public byte[] A06;
    public byte[] A07;
    public final AnonymousClass02M A08;
    public final AnonymousClass01I A09;
    public final AnonymousClass0EY A0A;
    public final AnonymousClass01A A0B;
    public final AnonymousClass08B A0C;
    public final AnonymousClass08C A0D;
    public final AnonymousClass0EV A0E;
    public final AnonymousClass00S A0F;
    public final AnonymousClass01K A0G;
    public final AnonymousClass01T A0H;
    public final AnonymousClass0AP A0I;
    public final AnonymousClass00Y A0J;
    public final AnonymousClass02N A0K;
    public final AnonymousClass1Xa A0L;
    public final AnonymousClass01R A0M;
    public final AnonymousClass0C4 A0N;

    public C40411tE(AnonymousClass00S r5, AnonymousClass02M r6, AnonymousClass01I r7, AnonymousClass00Y r8, AnonymousClass0C4 r9, AnonymousClass01A r10, AnonymousClass08B r11, AnonymousClass01K r12, AnonymousClass0AP r13, AnonymousClass08C r14, AnonymousClass0EV r15, AnonymousClass0EY r16, AnonymousClass01R r17, AnonymousClass01T r18, AnonymousClass02N r19, byte[] bArr, byte[] bArr2, AnonymousClass1Xa r22) {
        this.A0F = r5;
        this.A08 = r6;
        this.A09 = r7;
        this.A0J = r8;
        this.A0N = r9;
        this.A0B = r10;
        this.A0C = r11;
        this.A0G = r12;
        this.A0I = r13;
        this.A0D = r14;
        this.A0E = r15;
        this.A0A = r16;
        this.A0M = r17;
        this.A0H = r18;
        this.A0K = r19;
        this.A06 = bArr;
        this.A07 = bArr2;
        this.A0L = r22;
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        this.A02 = valueOf;
        A0O.put(valueOf.toString(), this);
        new Timer().schedule(this.A01, 32000);
    }

    public static boolean A00(AnonymousClass02N r3) {
        if (r3 == null) {
            return false;
        }
        for (C40411tE r0 : A0O.values()) {
            if (r3.equals(r0.A0K)) {
                return true;
            }
        }
        return false;
    }

    public final void A01(int i) {
        int length;
        C445420n r4 = new C445420n();
        byte[] bArr = this.A06;
        int i2 = 0;
        if (bArr == null) {
            length = 0;
        } else {
            length = bArr.length;
        }
        byte[] bArr2 = this.A07;
        if (bArr2 != null) {
            i2 = bArr2.length;
        }
        r4.A00 = Double.valueOf((double) (length + i2));
        r4.A02 = Long.valueOf(SystemClock.elapsedRealtime() - this.A00);
        r4.A01 = Integer.valueOf(i);
        this.A0J.A09(r4, 1);
        AnonymousClass00Y.A01(r4, "");
    }

    public final void A02(AnonymousClass02N r3) {
        this.A0E.A05.A05(this.A0B.A0A(r3));
        this.A0C.A04(r3);
    }

    public final void A03(AnonymousClass02N r4, int i) {
        A02(r4);
        this.A0A.A04.A02(r4, i);
        AnonymousClass02M r2 = this.A08;
        boolean A0Y = AnonymousClass1VY.A0Y(r4);
        int i2 = R.string.failed_update_profile_photo;
        if (A0Y) {
            i2 = R.string.failed_update_photo;
        }
        r2.A06(i2, 0);
    }
}
