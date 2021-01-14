package X;

import android.content.Intent;
import android.net.Uri;
import com.google.android.search.verification.client.R;
import com.whatsapp.payments.ui.IndiaUpiPaymentActivity;
import com.whatsapp.payments.ui.IndiaUpiQrCodeUrlValidationActivity;

/* renamed from: X.3Fy  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C69153Fy implements AnonymousClass0SG {
    public final /* synthetic */ AnonymousClass3YJ A00;

    public /* synthetic */ C69153Fy(AnonymousClass3YJ r1) {
        this.A00 = r1;
    }

    @Override // X.AnonymousClass0SG
    public final void ADy(Object obj) {
        AnonymousClass0MD A002;
        C63872x9 r6 = (C63872x9) obj;
        IndiaUpiQrCodeUrlValidationActivity indiaUpiQrCodeUrlValidationActivity = this.A00.A00;
        if (indiaUpiQrCodeUrlValidationActivity != null) {
            switch (r6.A00) {
                case 0:
                    indiaUpiQrCodeUrlValidationActivity.finish();
                    return;
                case 1:
                    C61072sS r2 = r6.A01;
                    if (r2 == null || (A002 = new C61162sb(indiaUpiQrCodeUrlValidationActivity.A03).A00(indiaUpiQrCodeUrlValidationActivity, r2.code, null, null)) == null) {
                        C002001d.A2O(indiaUpiQrCodeUrlValidationActivity, 21);
                        return;
                    } else {
                        A002.show();
                        return;
                    }
                case 2:
                    C002001d.A2O(indiaUpiQrCodeUrlValidationActivity, 22);
                    return;
                case 3:
                    C002001d.A2O(indiaUpiQrCodeUrlValidationActivity, 25);
                    return;
                case 4:
                    C002001d.A2O(indiaUpiQrCodeUrlValidationActivity, 24);
                    return;
                case 5:
                    Intent intent = new Intent(indiaUpiQrCodeUrlValidationActivity, IndiaUpiPaymentActivity.class);
                    C28051Sr.A1M(intent, indiaUpiQrCodeUrlValidationActivity.A00.A02());
                    intent.putExtra("extra_is_pay_money_only", r6.A03);
                    intent.putExtra("return-after-pay", r6.A04);
                    indiaUpiQrCodeUrlValidationActivity.startActivity(intent);
                    indiaUpiQrCodeUrlValidationActivity.finish();
                    return;
                case 6:
                    Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(indiaUpiQrCodeUrlValidationActivity.A00.A02().A05));
                    if (intent2.resolveActivity(indiaUpiQrCodeUrlValidationActivity.getPackageManager()) != null) {
                        indiaUpiQrCodeUrlValidationActivity.startActivityForResult(intent2, 100);
                        return;
                    } else {
                        ((ActivityC004702f) indiaUpiQrCodeUrlValidationActivity).A0F.A06(R.string.activity_not_found, 0);
                        return;
                    }
                case 7:
                    indiaUpiQrCodeUrlValidationActivity.A01 = r6.A02;
                    C002001d.A2O(indiaUpiQrCodeUrlValidationActivity, 26);
                    return;
                default:
                    return;
            }
        } else {
            throw null;
        }
    }
}
