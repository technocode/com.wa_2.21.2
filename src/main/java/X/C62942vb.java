package X;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.ImageView;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;
import com.whatsapp.util.Log;

/* renamed from: X.2vb  reason: invalid class name and case insensitive filesystem */
public class C62942vb {
    public static volatile C62942vb A09;
    public final AnonymousClass02M A00;
    public final AnonymousClass01I A01;
    public final AnonymousClass04j A02;
    public final AnonymousClass00S A03;
    public final AnonymousClass00G A04;
    public final AnonymousClass0GP A05;
    public final C03340Fu A06;
    public final C01970Ad A07;
    public final AnonymousClass3GT A08;

    public C62942vb(AnonymousClass00G r1, AnonymousClass00S r2, AnonymousClass02M r3, AnonymousClass01I r4, C01970Ad r5, AnonymousClass3GT r6, AnonymousClass04j r7, C03340Fu r8, AnonymousClass0GP r9) {
        this.A04 = r1;
        this.A03 = r2;
        this.A00 = r3;
        this.A01 = r4;
        this.A07 = r5;
        this.A08 = r6;
        this.A02 = r7;
        this.A06 = r8;
        this.A05 = r9;
    }

    public static C62942vb A00() {
        if (A09 == null) {
            synchronized (C62942vb.class) {
                if (A09 == null) {
                    A09 = new C62942vb(AnonymousClass00G.A01, AnonymousClass00S.A00(), AnonymousClass02M.A00(), AnonymousClass01I.A00(), C01970Ad.A00(), AnonymousClass3GT.A00(), AnonymousClass04j.A00(), C03340Fu.A00(), AnonymousClass0GP.A00());
                }
            }
        }
        return A09;
    }

    public final void A01(AnonymousClass1VM r20, ImageView imageView) {
        C74723bO r3 = (C74723bO) r20.A06;
        if (r3 == null || TextUtils.isEmpty(r3.A0C)) {
            StringBuilder sb = new StringBuilder("PAY: fetchCardArtImageContentDetails card method data invalid: ");
            sb.append(r3);
            Log.w(sb.toString());
            return;
        }
        C61242sr r8 = new C61242sr(this.A03, this.A04.A00, this.A00, this.A01, this.A02, this.A06, this.A05, r20.A07, r3.A0C, new AnonymousClass3GQ(this, r20, r3, imageView));
        String str = r8.A08;
        if (!TextUtils.isEmpty(str)) {
            String str2 = r8.A09;
            if (!TextUtils.isEmpty(str2)) {
                byte[] A0x = AnonymousClass0FI.A0x(r8.A04, r8.A02, false);
                if (A0x != null) {
                    String A032 = C007603r.A03(A0x);
                    r8.A06.A09(false, new AnonymousClass0M5("account", new AnonymousClass0OS[]{new AnonymousClass0OS("action", "get-image-content", null, (byte) 0), new AnonymousClass0OS("credential-id", str, null, (byte) 0), new AnonymousClass0OS("image-content-id", str2, null, (byte) 0), new AnonymousClass0OS("nonce", A032, null, (byte) 0)}, null, null), new AnonymousClass3XX(r8, r8.A00, r8.A01, r8.A03, r8.A05), 30000);
                    return;
                }
                throw null;
            }
        }
        AnonymousClass3GQ.A00(str, new C61072sS());
    }

    public final void A02(AnonymousClass1VM r7, ImageView imageView, Drawable drawable, boolean z) {
        AbstractC460627w r1 = (AbstractC460627w) r7.A06;
        if (r1 == null || TextUtils.isEmpty(r1.A0E)) {
            StringBuilder sb = new StringBuilder("PAY: Failed to display card art, card art url missing, re-fetch: ");
            sb.append(z);
            Log.w(sb.toString());
            if (z) {
                A01(r7, imageView);
                return;
            }
            return;
        }
        AnonymousClass3GT r0 = this.A08;
        r0.A03.A01(r1.A0E, imageView, drawable, drawable, new AnonymousClass3GR(this, z, r7, imageView));
    }

    public void A03(AnonymousClass1VM r4, PaymentMethodRow paymentMethodRow) {
        C28051Sr.A1d(paymentMethodRow, r4);
        A02(r4, paymentMethodRow.A00, this.A04.A00.getResources().getDrawable(C28051Sr.A07((C43761yu) r4)), false);
    }
}
