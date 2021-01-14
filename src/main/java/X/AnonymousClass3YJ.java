package X;

import android.net.Uri;
import android.text.TextUtils;
import com.whatsapp.payments.ui.IndiaUpiQrCodeUrlValidationActivity;

/* renamed from: X.3YJ  reason: invalid class name */
public class AnonymousClass3YJ extends C30271b3 {
    public final /* synthetic */ IndiaUpiQrCodeUrlValidationActivity A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public AnonymousClass3YJ(IndiaUpiQrCodeUrlValidationActivity indiaUpiQrCodeUrlValidationActivity, String str, String str2) {
        this.A00 = indiaUpiQrCodeUrlValidationActivity;
        this.A02 = str;
        this.A01 = str2;
    }

    @Override // X.C30271b3, X.AnonymousClass0O4
    public AnonymousClass0SD A3B(Class cls) {
        String str;
        C61992u4 A002;
        if (cls.isAssignableFrom(C69693Ia.class)) {
            IndiaUpiQrCodeUrlValidationActivity indiaUpiQrCodeUrlValidationActivity = this.A00;
            C69693Ia r3 = new C69693Ia(indiaUpiQrCodeUrlValidationActivity.A02, indiaUpiQrCodeUrlValidationActivity.A05, indiaUpiQrCodeUrlValidationActivity.A03, indiaUpiQrCodeUrlValidationActivity.A04);
            r3.A02.A03(indiaUpiQrCodeUrlValidationActivity, new C69153Fy(this));
            r3.A01.A03(indiaUpiQrCodeUrlValidationActivity, new C69163Fz(this));
            String str2 = this.A02;
            String str3 = this.A01;
            if (TextUtils.isEmpty(str2)) {
                r3.A02.A07(new C63872x9(0));
                return r3;
            }
            r3.A03 = str3;
            C02270Bi r2 = r3.A00;
            C61992u4 r1 = null;
            if (!(str2 == null || (A002 = C61992u4.A00(Uri.parse(str2))) == null)) {
                A002.A01 = str2;
                r1 = A002;
            }
            r2.A07(r1);
            r3.A01.A07(Boolean.TRUE);
            C63832x5 r6 = r3.A08;
            String str4 = r3.A02().A09;
            if (r3.A05.A0D(AbstractC000400g.A22)) {
                str = r3.A02().A05;
            } else {
                str = null;
            }
            AnonymousClass3IZ r12 = new AnonymousClass3IZ(r3);
            C61352t2 r7 = r6.A01;
            new AnonymousClass3EF(r7.A02.A00, r7.A00, r7.A07, r7.A01, r7.A04, r7.A06, r7.A03, r7.A05).A00(str4, str, new AnonymousClass3IU(r6, r12, indiaUpiQrCodeUrlValidationActivity, str4));
            return r3;
        }
        throw new IllegalArgumentException("Invalid viewModel");
    }
}
