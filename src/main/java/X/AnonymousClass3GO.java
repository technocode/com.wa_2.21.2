package X;

import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.payments.ui.BrazilMerchantDetailsListActivity;
import com.whatsapp.payments.ui.BrazilPayBloksActivity;
import com.whatsapp.payments.ui.MerchantPayoutTransactionHistoryActivity;

/* renamed from: X.3GO  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3GO implements AnonymousClass0SG {
    public final /* synthetic */ BrazilMerchantDetailsListActivity A00;

    public /* synthetic */ AnonymousClass3GO(BrazilMerchantDetailsListActivity brazilMerchantDetailsListActivity) {
        this.A00 = brazilMerchantDetailsListActivity;
    }

    @Override // X.AnonymousClass0SG
    public final void ADy(Object obj) {
        BrazilMerchantDetailsListActivity brazilMerchantDetailsListActivity = this.A00;
        C63262w8 r14 = (C63262w8) obj;
        switch (r14.A01) {
            case 0:
                brazilMerchantDetailsListActivity.startActivity(new Intent(brazilMerchantDetailsListActivity.getApplicationContext(), MerchantPayoutTransactionHistoryActivity.class));
                return;
            case 1:
                AnonymousClass00T r1 = brazilMerchantDetailsListActivity.A06;
                AnonymousClass0e8 r0 = brazilMerchantDetailsListActivity.A01;
                if (r0 != null && ((AnonymousClass0JW) r0).A00.getStatus() == AsyncTask.Status.RUNNING) {
                    ((AnonymousClass0JW) brazilMerchantDetailsListActivity.A01).A00.cancel(false);
                }
                Bundle bundle = new Bundle();
                bundle.putString("com.whatsapp.DescribeProblemActivity.from", "payments:settings");
                AnonymousClass0e8 r3 = new AnonymousClass0e8(brazilMerchantDetailsListActivity, ((ActivityC004702f) brazilMerchantDetailsListActivity).A0G, ((AnonymousClass2C0) brazilMerchantDetailsListActivity).A01, brazilMerchantDetailsListActivity.A0O, brazilMerchantDetailsListActivity.A03, "payments:settings", null, null, bundle);
                brazilMerchantDetailsListActivity.A01 = r3;
                r1.ANC(r3, new Void[0]);
                return;
            case 2:
                Uri uri = r14.A03;
                if (uri != null) {
                    Intent intent = new Intent("android.intent.action.VIEW", uri);
                    if (intent.resolveActivity(brazilMerchantDetailsListActivity.getPackageManager()) != null) {
                        brazilMerchantDetailsListActivity.startActivity(intent);
                        return;
                    }
                    return;
                }
                throw null;
            case 3:
                Intent intent2 = new Intent("android.intent.action.DIAL", Uri.fromParts("tel", r14.A05, null));
                if (intent2.resolveActivity(brazilMerchantDetailsListActivity.getPackageManager()) != null) {
                    brazilMerchantDetailsListActivity.startActivity(intent2);
                    return;
                }
                return;
            case 4:
                brazilMerchantDetailsListActivity.A0K.A00();
                Intent intent3 = new Intent(brazilMerchantDetailsListActivity, BrazilPayBloksActivity.class);
                intent3.putExtra("screen_params", r14.A07);
                intent3.putExtra("screen_name", r14.A06);
                brazilMerchantDetailsListActivity.A0H(intent3, 1);
                return;
            case 5:
                if (r14.A08) {
                    brazilMerchantDetailsListActivity.A0M(brazilMerchantDetailsListActivity.getString(r14.A02));
                    return;
                } else {
                    brazilMerchantDetailsListActivity.A0K.A00();
                    return;
                }
            case 6:
                brazilMerchantDetailsListActivity.APo(r14.A00);
                return;
            case 7:
                AnonymousClass3DQ r2 = brazilMerchantDetailsListActivity.A00;
                if (r2 == null) {
                    r2 = new AnonymousClass3DQ(((AnonymousClass2C0) brazilMerchantDetailsListActivity).A01, brazilMerchantDetailsListActivity.A04);
                    brazilMerchantDetailsListActivity.A00 = r2;
                }
                r2.A01(brazilMerchantDetailsListActivity, r14.A04.code, R.string.payments_generic_error).show();
                return;
            default:
                return;
        }
    }
}
