package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.search.verification.client.R;

/* renamed from: X.3Dg  reason: invalid class name and case insensitive filesystem */
public class C68453Dg implements AbstractC02790Dl {
    public static volatile C68453Dg A07;
    public final C02780Dk A00;
    public final AnonymousClass02M A01;
    public final AnonymousClass01X A02;
    public final C01980Ae A03;
    public final C02020Ai A04;
    public final C01970Ad A05;
    public final C018809u A06 = C018809u.A00("PaymentActivityLauncher", "infra", "COMMON");

    public C68453Dg(AnonymousClass02M r4, C02780Dk r5, AnonymousClass01X r6, C01970Ad r7, C01980Ae r8, C02020Ai r9) {
        this.A01 = r4;
        this.A00 = r5;
        this.A02 = r6;
        this.A05 = r7;
        this.A03 = r8;
        this.A04 = r9;
    }

    public static C68453Dg A00() {
        if (A07 == null) {
            synchronized (C68453Dg.class) {
                if (A07 == null) {
                    A07 = new C68453Dg(AnonymousClass02M.A00(), C02780Dk.A02(), AnonymousClass01X.A00(), C01970Ad.A00(), C01980Ae.A00(), C02020Ai.A00());
                }
            }
        }
        return A07;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0012, code lost:
        if (r4.A05.A0B.A00.A0D(X.AbstractC000400g.A1x) == false) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.content.Intent A01(android.content.Context r5, boolean r6, boolean r7) {
        /*
        // Method dump skipped, instructions count: 149
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68453Dg.A01(android.content.Context, boolean, boolean):android.content.Intent");
    }

    @Override // X.AbstractC02790Dl
    public void ANL(Context context, Uri uri) {
        if (uri == null) {
            this.A06.A04("start-activity/uri-is-null");
            return;
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (!"wapay".equals(uri.getScheme()) || TextUtils.isEmpty(lastPathSegment)) {
            this.A06.A04("start-activity/uri-is-not-wapay-compatible");
            this.A01.A06(R.string.activity_not_found, 0);
            return;
        }
        Intent A012 = A01(context, false, true);
        A012.putExtra("extra_payment_handle", lastPathSegment);
        this.A00.A05(context, A012);
    }
}
