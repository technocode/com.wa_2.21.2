package X;

import android.content.Context;
import com.google.android.search.verification.client.R;

/* renamed from: X.3DQ  reason: invalid class name */
public class AnonymousClass3DQ implements AbstractC29081Wy {
    public final AnonymousClass01X A00;
    public final C02040Ak A01;

    @Override // X.AbstractC29081Wy
    public int A6F(int i, C61082sT r3) {
        return 0;
    }

    @Override // X.AbstractC29081Wy
    public int A6G(int i) {
        return 0;
    }

    @Override // X.AbstractC29081Wy
    public void AA8(String str) {
    }

    @Override // X.AbstractC29081Wy
    public boolean AAy(int i) {
        return false;
    }

    @Override // X.AbstractC29081Wy
    public boolean AB9(int i) {
        return i == 2001;
    }

    @Override // X.AbstractC29081Wy
    public boolean ABA(int i) {
        return false;
    }

    @Override // X.AbstractC29081Wy
    public boolean ABB(int i) {
        return false;
    }

    @Override // X.AbstractC29081Wy
    public boolean ABC(int i) {
        return i == 10244;
    }

    @Override // X.AbstractC29081Wy
    public boolean ABD(int i) {
        return i == 10242;
    }

    @Override // X.AbstractC29081Wy
    public boolean ABE(int i) {
        return i == 10241;
    }

    @Override // X.AbstractC29081Wy
    public boolean ABF(int i) {
        return false;
    }

    @Override // X.AbstractC29081Wy
    public boolean ABG(int i) {
        return i == 10240;
    }

    @Override // X.AbstractC29081Wy
    public boolean ABJ(int i) {
        return false;
    }

    @Override // X.AbstractC29081Wy
    public boolean ABR(int i) {
        return i == 2826013;
    }

    @Override // X.AbstractC29081Wy
    public boolean ABe(int i) {
        return false;
    }

    @Override // X.AbstractC29081Wy
    public int ABz() {
        return 0;
    }

    @Override // X.AbstractC29081Wy
    public int AC0() {
        return 0;
    }

    public AnonymousClass3DQ(AnonymousClass01X r1, C02040Ak r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public AnonymousClass0MD A00(Context context) {
        AnonymousClass0MB r3 = new AnonymousClass0MB(context);
        AnonymousClass01X r2 = this.A00;
        r3.A01.A0E = r2.A06(R.string.brazil_p2p_disabled_upsell_merchant_error);
        r3.A07(r2.A06(R.string.ok), null);
        r3.A05(r2.A06(R.string.learn_more), new DialogInterface$OnClickListenerC60832s4(this, context));
        return r3.A00();
    }

    public AnonymousClass0MD A01(Context context, int i, int i2) {
        String A06;
        AnonymousClass01X r4 = this.A00;
        if (i == -233) {
            A06 = r4.A06(R.string.payment_card_cannot_verified_error);
        } else if (i == 10229) {
            A06 = r4.A06(R.string.brazil_card_token_expired_error);
        } else if (i == 10234) {
            A06 = r4.A06(R.string.payment_verify_card_error);
        } else if (i == 2896002) {
            return A00(context);
        } else {
            A06 = r4.A06(i2);
        }
        DialogInterface$OnDismissListenerC60822s3 r3 = DialogInterface$OnDismissListenerC60822s3.A00;
        AnonymousClass0MB r2 = new AnonymousClass0MB(context);
        r2.A01.A0E = A06;
        r2.A07(r4.A06(R.string.ok), null);
        AnonymousClass0MD A002 = r2.A00();
        A002.setOnDismissListener(r3);
        return A002;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002d, code lost:
        if (r7 != 2826008) goto L_0x002f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass0MD A02(android.content.Context r6, int r7, java.lang.String r8, android.content.DialogInterface.OnDismissListener r9, android.content.DialogInterface.OnDismissListener r10, android.content.DialogInterface.OnDismissListener r11) {
        /*
        // Method dump skipped, instructions count: 344
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3DQ.A02(android.content.Context, int, java.lang.String, android.content.DialogInterface$OnDismissListener, android.content.DialogInterface$OnDismissListener, android.content.DialogInterface$OnDismissListener):X.0MD");
    }
}
