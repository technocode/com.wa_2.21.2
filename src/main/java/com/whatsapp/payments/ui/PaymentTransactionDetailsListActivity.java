package com.whatsapp.payments.ui;

import X.AbstractC007503q;
import X.AbstractC11910hD;
import X.ActivityC004602e;
import X.ActivityC09470d0;
import X.AnonymousClass00E;
import X.AnonymousClass00S;
import X.AnonymousClass00T;
import X.AnonymousClass01A;
import X.AnonymousClass02M;
import X.AnonymousClass0FI;
import X.AnonymousClass0HJ;
import X.AnonymousClass0L2;
import X.AnonymousClass0Z6;
import X.AnonymousClass2C0;
import X.AnonymousClass3IE;
import X.AnonymousClass3YT;
import X.AnonymousClass3YY;
import X.AnonymousClass3YZ;
import X.C002101e;
import X.C006803i;
import X.C007303n;
import X.C014308b;
import X.C018709t;
import X.C018809u;
import X.C01970Ad;
import X.C02020Ai;
import X.C02040Ak;
import X.C61122sX;
import X.C63382wK;
import X.C63392wL;
import X.C68453Dg;
import X.C73633Yc;
import X.C73643Yd;
import X.C73653Ye;
import X.C73663Yf;
import X.C73673Yg;
import X.C73683Yh;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import com.google.android.search.verification.client.R;
import com.whatsapp.Conversation;

public class PaymentTransactionDetailsListActivity extends ActivityC09470d0 {
    public AnonymousClass3IE A00;
    public final AnonymousClass02M A01 = AnonymousClass02M.A00();
    public final AnonymousClass0Z6 A02 = AnonymousClass0Z6.A00();
    public final AnonymousClass0HJ A03;
    public final AnonymousClass0L2 A04 = AnonymousClass0L2.A01();
    public final C018709t A05 = C018709t.A01();
    public final C68453Dg A06;
    public final C61122sX A07;
    public final C02020Ai A08;
    public final C02040Ak A09;
    public final C01970Ad A0A;
    public final C018809u A0B;
    public final C63382wK A0C;
    public final AnonymousClass00T A0D = C002101e.A00();

    public PaymentTransactionDetailsListActivity() {
        AnonymousClass00S.A00();
        C014308b.A00();
        AnonymousClass01A.A00();
        this.A03 = AnonymousClass0HJ.A02();
        this.A0A = C01970Ad.A00();
        this.A07 = C61122sX.A00();
        this.A09 = C02040Ak.A00();
        this.A06 = C68453Dg.A00();
        this.A08 = C02020Ai.A00();
        this.A0C = C63382wK.A00();
        this.A0B = C018809u.A00("PaymentTransactionDetailsListActivity", "payment-settings", "COMMON");
    }

    @Override // X.ActivityC09470d0
    public AbstractC11910hD A0T(ViewGroup viewGroup, int i) {
        switch (i) {
            case 200:
                return new AnonymousClass3YZ(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.payment_transaction_details_amount_view, viewGroup, false));
            case 201:
                return new C73633Yc(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.payment_transaction_details_action_button_view, viewGroup, false));
            case 202:
                return new C73673Yg(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.payment_transaction_details_status_view, viewGroup, false));
            case 203:
                return new C73653Ye(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.payment_transaction_details_payee_payer_detail_view, viewGroup, false), this.A04, this.A03);
            case 204:
                return new C73643Yd(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.payment_transaction_details_help_view, viewGroup, false));
            case 205:
                return new AnonymousClass3YY(this.A01, this.A02, ((ActivityC004602e) this).A05, this.A0I, this.A0J, this.A0A, this.A09, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.payment_transaction_details_note_row, viewGroup, false));
            case 206:
                return new C73683Yh(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.payment_transaction_details_row, viewGroup, false));
            case 207:
                return new AnonymousClass3YT(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.payment_transaction_detail_item_row_divider, viewGroup, false));
            case 208:
                return new C73663Yf(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.payment_transaction_send_again_view, viewGroup, false));
            default:
                return super.A0T(viewGroup, i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01f2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01f6, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0U(X.C63372wJ r17) {
        /*
        // Method dump skipped, instructions count: 784
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.PaymentTransactionDetailsListActivity.A0U(X.2wJ):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v39, types: [X.3IE] */
    /* JADX WARN: Type inference failed for: r0v45, types: [X.3IE] */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0031, code lost:
        if (getIntent().getExtras() != null) goto L_0x0033;
     */
    /* JADX WARNING: Unknown variable types count: 2 */
    @Override // X.AnonymousClass2C0, X.ActivityC09470d0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r5) {
        /*
        // Method dump skipped, instructions count: 293
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.PaymentTransactionDetailsListActivity.onCreate(android.os.Bundle):void");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        C63392wL r0 = this.A00.A04;
        if (!(r0 == null || r0.A02 == null)) {
            menu.add(0, R.id.menuitem_view_in_chat, 0, ((AnonymousClass2C0) this).A01.A06(R.string.payment_view_in_chat));
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override // X.ActivityC004702f
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        AbstractC007503q r4;
        C63392wL r0 = this.A00.A04;
        if (r0 != null) {
            r4 = r0.A02;
        } else {
            r4 = null;
        }
        if (menuItem.getItemId() == 16908332) {
            finish();
            if (isTaskRoot()) {
                Intent intent = new Intent(this, PaymentTransactionHistoryActivity.class);
                intent.putExtra("extra_show_requests", this.A00.A07);
                if (Build.VERSION.SDK_INT >= 21) {
                    finishAndRemoveTask();
                    startActivity(intent);
                } else {
                    startActivity(intent);
                    return true;
                }
            }
            return true;
        }
        if (r4 != null) {
            if (menuItem.getItemId() == R.id.menuitem_view_in_chat) {
                long A032 = AnonymousClass0FI.A03(r4);
                C007303n r42 = r4.A0n;
                startActivity(C006803i.A05(Conversation.A05(this, r42.A00).putExtra("row_id", A032), r42));
                return true;
            } else if (menuItem.getItemId() == R.id.menuitem_debug) {
                AnonymousClass00E.A07(this.A09.A02());
                Intent intent2 = new Intent();
                String A84 = this.A0A.A03().A84();
                if (TextUtils.isEmpty(A84)) {
                    return false;
                }
                intent2.setClassName(this, A84);
                intent2.putExtra("extra_transaction_id", r4.A0b);
                C007303n r02 = r4.A0n;
                if (r02 != null) {
                    C006803i.A05(intent2, r02);
                }
                startActivity(intent2);
                return true;
            }
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
