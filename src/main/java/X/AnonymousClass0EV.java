package X;

import com.whatsapp.util.Log;
import java.io.IOException;

/* renamed from: X.0EV  reason: invalid class name */
public class AnonymousClass0EV {
    public static volatile AnonymousClass0EV A0A;
    public final AnonymousClass0EW A00;
    public final AnonymousClass02M A01;
    public final AnonymousClass01I A02;
    public final AnonymousClass01A A03;
    public final AnonymousClass08B A04;
    public final AnonymousClass08C A05;
    public final AnonymousClass00D A06;
    public final AnonymousClass01K A07;
    public final AnonymousClass0AP A08;
    public final AnonymousClass0AT A09;

    public AnonymousClass0EV(AnonymousClass02M r1, AnonymousClass01I r2, AnonymousClass01A r3, AnonymousClass0EW r4, AnonymousClass08B r5, AnonymousClass01K r6, AnonymousClass0AT r7, AnonymousClass0AP r8, AnonymousClass08C r9, AnonymousClass00D r10) {
        this.A01 = r1;
        this.A02 = r2;
        this.A03 = r3;
        this.A00 = r4;
        this.A04 = r5;
        this.A07 = r6;
        this.A09 = r7;
        this.A08 = r8;
        this.A06 = r10;
        this.A05 = r9;
    }

    public static AnonymousClass0EV A00() {
        if (A0A == null) {
            synchronized (AnonymousClass0EV.class) {
                if (A0A == null) {
                    A0A = new AnonymousClass0EV(AnonymousClass02M.A00(), AnonymousClass01I.A00(), AnonymousClass01A.A00(), AnonymousClass0EW.A01, AnonymousClass08B.A00, AnonymousClass01K.A00(), AnonymousClass0AT.A03, AnonymousClass0AP.A00(), AnonymousClass08C.A00(), AnonymousClass00D.A00());
                }
            }
        }
        return A0A;
    }

    public void A01(C007003k r3, int i, int i2) {
        boolean A092 = this.A02.A09(r3.A09);
        r3.A01 = i;
        r3.A02 = i2;
        if (A092) {
            this.A06.A00.edit().putInt("profile_photo_full_id", i).putInt("profile_photo_thumb_id", i2).apply();
            return;
        }
        r3.A06 = System.currentTimeMillis();
        this.A03.A0L(r3);
    }

    public void A02(C007003k r3, byte[] bArr, byte[] bArr2) {
        if (bArr != null) {
            try {
                C006803i.A0e(bArr, this.A05.A02(r3));
            } catch (IOException e) {
                Log.e("ContactPhotoUpdater/updatePhotoFiles", e);
                return;
            }
        }
        if (bArr2 != null) {
            C006803i.A0e(bArr2, this.A05.A03(r3));
        }
    }

    public void A03(AnonymousClass02N r4) {
        AnonymousClass0EW r2 = this.A00;
        r2.A00.post(new RunnableEBaseShape2S0200000_I0_1(this, r4, 3));
    }
}
