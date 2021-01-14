package X;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.faq.FaqItemActivity;
import com.whatsapp.faq.SearchFAQ;
import com.whatsapp.inappsupport.ui.SupportTopicsActivity;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: X.0e8  reason: invalid class name */
public class AnonymousClass0e8 extends AnonymousClass0JW {
    public ProgressDialog A00;
    public final Bundle A01;
    public final C000300f A02;
    public final AnonymousClass01X A03;
    public final AnonymousClass1VM A04;
    public final AnonymousClass0MH A05;
    public final C02660Cy A06;
    public final C02020Ai A07;
    public final C018809u A08 = C018809u.A00("PaymentSupportTask", "payment-settings", "COMMON");
    public final String A09;
    public final WeakReference A0A;

    public AnonymousClass0e8(ActivityC004702f r4, C000300f r5, AnonymousClass01X r6, C02660Cy r7, C02020Ai r8, String str, AnonymousClass1VM r10, AnonymousClass0MH r11, Bundle bundle) {
        this.A0A = new WeakReference(r4);
        this.A02 = r5;
        this.A03 = r6;
        this.A06 = r7;
        this.A07 = r8;
        this.A09 = str;
        this.A04 = r10;
        this.A05 = r11;
        this.A01 = bundle;
    }

    @Override // X.AnonymousClass0JW
    public void A01() {
        Context context = (Context) this.A0A.get();
        if (context != null) {
            if (this.A00 == null) {
                ProgressDialog progressDialog = new ProgressDialog(context);
                this.A00 = progressDialog;
                progressDialog.setOnCancelListener(new DialogInterface$OnCancelListenerC61792tk(this));
                this.A00.setCanceledOnTouchOutside(false);
            }
            if (!this.A00.isShowing()) {
                this.A00.setMessage(this.A03.A06(R.string.help_loading_progress_label));
                this.A00.setIndeterminate(true);
                this.A00.show();
            }
        }
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        C61832to r9 = (C61832to) obj;
        ActivityC004702f r3 = (ActivityC004702f) this.A0A.get();
        if (r3 != null) {
            if (r9 != null) {
                C61822tn r4 = r9.A00;
                if (r4 != null) {
                    Intent intent = new Intent(r3, FaqItemActivity.class);
                    intent.putExtra("title", r4.A02);
                    intent.putExtra("content", r4.A00);
                    intent.putExtra("url", r4.A03);
                    intent.putExtra("article_id", r4.A01);
                    boolean z = r4.A04;
                    intent.putExtra("show_contact_support_button", z);
                    intent.putExtra("contact_us_context", this.A09);
                    if (z) {
                        intent.putParcelableArrayListExtra("payments_support_topics", r9.A02);
                    }
                    Bundle bundle = this.A01;
                    bundle.putInt("com.whatsapp.DescribeProblemActivity.type", 3);
                    intent.putExtra("describe_problem_fields", bundle);
                    r3.A0H(intent, 48);
                    r3.overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                } else {
                    ArrayList arrayList = r9.A01;
                    if (arrayList == null || arrayList.isEmpty()) {
                        ArrayList arrayList2 = r9.A02;
                        if (arrayList2 == null || arrayList2.isEmpty()) {
                            A05(r3);
                        } else {
                            r3.A0H(SupportTopicsActivity.A04(r3, arrayList2, this.A01), 48);
                        }
                    } else {
                        String str = this.A09;
                        Bundle bundle2 = this.A01;
                        Serializable serializable = r9.A02;
                        Intent intent2 = new Intent(r3, SearchFAQ.class);
                        intent2.putExtra("com.whatsapp.faq.SearchFAQ.from", str);
                        intent2.putExtra("com.whatsapp.faq.SearchFAQ.count", arrayList.size());
                        intent2.putExtra("describe_problem_bundle", bundle2);
                        intent2.putExtra("payments_support_faqs", arrayList);
                        intent2.putExtra("payments_support_topics", serializable);
                        intent2.putExtra("com.whatsapp.faq.SearchFAQ.usePaymentsFlow", true);
                        r3.A0H(intent2, 48);
                    }
                }
            } else {
                A05(r3);
            }
            ProgressDialog progressDialog = this.A00;
            if (progressDialog != null && progressDialog.isShowing()) {
                this.A00.cancel();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0044, code lost:
        if (r5.getBoolean("children_skippable") == false) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0091, code lost:
        if (r16 == 2) goto L_0x0056;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList A04(org.json.JSONArray r15, int r16) {
        /*
        // Method dump skipped, instructions count: 170
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0e8.A04(org.json.JSONArray, int):java.util.ArrayList");
    }

    public final void A05(ActivityC004702f r10) {
        if (this.A02.A0D(AbstractC000400g.A1t)) {
            r10.APo(R.string.payments_cs_email_disabled);
            return;
        }
        String str = this.A09;
        Bundle bundle = this.A01;
        Intent A0R = C002001d.A0R(r10, str, null, 3, null, null, bundle);
        A0R.putExtras(bundle);
        r10.A0H(A0R, 48);
    }
}
