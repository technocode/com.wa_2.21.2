package com.whatsapp.payments.ui;

import X.AbstractC11910hD;
import X.AnonymousClass008;
import X.AnonymousClass01X;
import X.AnonymousClass0MB;
import X.AnonymousClass0MC;
import X.AnonymousClass0MH;
import X.AnonymousClass2C0;
import X.AnonymousClass35Y;
import X.AnonymousClass3I9;
import X.AnonymousClass3IE;
import X.AnonymousClass3YO;
import X.AnonymousClass3YP;
import X.AnonymousClass3YQ;
import X.AnonymousClass3YR;
import X.C002001d;
import X.C018809u;
import X.C63332wF;
import X.C63372wJ;
import X.C73773Yq;
import X.DialogInterface$OnClickListenerC62572v0;
import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;
import com.whatsapp.payments.ui.widget.MandatePaymentBottomSheetFragment;
import java.util.Arrays;

public class IndiaUpiPaymentTransactionDetailsActivity extends PaymentTransactionDetailsListActivity {
    public C73773Yq A00;
    public final C018809u A01 = C018809u.A00("IndiaUpiPaymentTransactionDetailsActivity", "payment-settings", "IN");
    public final C63332wF A02 = C63332wF.A00();
    public final AnonymousClass35Y A03 = AnonymousClass35Y.A00();

    @Override // X.ActivityC09470d0, com.whatsapp.payments.ui.PaymentTransactionDetailsListActivity
    public AbstractC11910hD A0T(ViewGroup viewGroup, int i) {
        if (i == 1000) {
            return new AnonymousClass3YQ(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.india_upi_payment_detail_footer_banner, viewGroup, false));
        }
        if (i == 1001) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.india_upi_localization_failed, viewGroup, false);
            C002001d.A2m((ImageView) inflate.findViewById(R.id.payment_empty_icon), viewGroup.getContext().getResources().getColor(R.color.icon_color_disabled));
            return new AnonymousClass3YR(inflate);
        } else if (i == 1004) {
            return new AnonymousClass3YO(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.india_upi_payment_amount_header_view_component, viewGroup, false));
        } else {
            if (i != 1005) {
                return super.A0T(viewGroup, i);
            }
            return new AnonymousClass3YP(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.india_upi_mandate_transaction_detail_pending_update_banner, viewGroup, false));
        }
    }

    @Override // com.whatsapp.payments.ui.PaymentTransactionDetailsListActivity
    public void A0U(C63372wJ r10) {
        if (r10 instanceof AnonymousClass3I9) {
            AnonymousClass3I9 r4 = (AnonymousClass3I9) r10;
            switch (r10.A00) {
                case 101:
                    this.A01.A07(null, "return back to caller without getting the finalized status", null);
                    String str = r4.A00;
                    String str2 = r4.A02;
                    String str3 = r4.A01;
                    Intent intent = new Intent();
                    intent.putExtra("response", TextUtils.join("&", Arrays.asList(AnonymousClass008.A0K("txnId=", str), AnonymousClass008.A0K("txnRef=", str2), AnonymousClass008.A0K("Status=", null), AnonymousClass008.A0K("responseCode=", str3))));
                    setResult(-1, intent);
                    finish();
                    return;
                case 102:
                    this.A03.A02(this, Uri.parse(r4.A03));
                    return;
                case 103:
                    PaymentBottomSheet paymentBottomSheet = new PaymentBottomSheet();
                    AnonymousClass0MH r3 = r10.A04;
                    MandatePaymentBottomSheetFragment mandatePaymentBottomSheetFragment = new MandatePaymentBottomSheetFragment();
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("transaction", r3);
                    mandatePaymentBottomSheetFragment.A0N(bundle);
                    paymentBottomSheet.A01 = mandatePaymentBottomSheetFragment;
                    APl(paymentBottomSheet, "MandatePaymentBottomSheetFragment");
                    return;
                case 104:
                default:
                    super.A0U(r10);
                    return;
                case 105:
                    Intent A012 = ((PaymentTransactionDetailsListActivity) this).A06.A01(this, false, false);
                    A012.putExtra("extra_payment_handle", r4.A04);
                    A012.putExtra("extra_payment_handle_id", r4.A09);
                    A012.putExtra("extra_payee_name", r4.A08);
                    A0I(A012, false);
                    return;
            }
        } else {
            super.A0U(r10);
        }
    }

    @Override // X.ActivityC004702f, X.AnonymousClass02i
    public void onBackPressed() {
        C73773Yq r2 = this.A00;
        if (r2.A00) {
            AnonymousClass3I9 r1 = new AnonymousClass3I9(101);
            r1.A00 = ((AnonymousClass3IE) r2).A05.A01;
            r1.A02 = r2.A09;
            r1.A01 = "SUBMITTED";
            r1.A01 = "00";
            ((AnonymousClass3IE) r2).A06.A07(r1);
            return;
        }
        super.onBackPressed();
    }

    @Override // X.ActivityC004602e
    public Dialog onCreateDialog(int i) {
        if (i != 100) {
            return super.onCreateDialog(i);
        }
        AnonymousClass0MB r4 = new AnonymousClass0MB(this);
        AnonymousClass01X r3 = ((AnonymousClass2C0) this).A01;
        String A06 = r3.A06(R.string.payments_request_status_requested_expired);
        AnonymousClass0MC r2 = r4.A01;
        r2.A0E = A06;
        r2.A0J = false;
        r4.A04(R.string.ok, new DialogInterface$OnClickListenerC62572v0(this));
        r2.A0I = r3.A06(R.string.payments_request_status_request_expired);
        return r4.A00();
    }

    @Override // X.ActivityC004902h
    public void onNewIntent(Intent intent) {
        C73773Yq r2 = this.A00;
        if (r2 != null) {
            r2.A00 = intent.getBooleanExtra("extra_return_after_completion", false);
        }
        super.onNewIntent(intent);
    }
}
