package X;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.search.verification.client.R;
import com.whatsapp.faq.FaqItemActivity;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.0ep  reason: invalid class name and case insensitive filesystem */
public class C10560ep extends AnonymousClass0JW {
    public ProgressDialog A00;
    public final AnonymousClass2OC A01;
    public final C02660Cy A02;
    public final String A03;
    public final String A04;
    public final WeakReference A05;

    public C10560ep(ActivityC004702f r2, AnonymousClass2OC r3, C02660Cy r4, String str, String str2) {
        this.A05 = new WeakReference(r2);
        this.A01 = r3;
        this.A02 = r4;
        this.A04 = str;
        this.A03 = str2;
    }

    @Override // X.AnonymousClass0JW
    public void A01() {
        Context context = (Context) this.A05.get();
        if (context != null) {
            if (this.A00 == null) {
                ProgressDialog progressDialog = new ProgressDialog(context);
                this.A00 = progressDialog;
                progressDialog.setOnCancelListener(new DialogInterface$OnCancelListenerC48762Np(this));
                this.A00.setCanceledOnTouchOutside(false);
            }
            if (!this.A00.isShowing()) {
                this.A00.setMessage(context.getString(R.string.help_loading_progress_label));
                this.A00.setIndeterminate(true);
                this.A00.show();
            }
        }
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        ProgressDialog progressDialog;
        String str;
        C48822Nw r9 = (C48822Nw) obj;
        if (!(r9 == null || r9.A00 != 200 || (str = r9.A03) == null)) {
            String str2 = r9.A04;
            if (!TextUtils.isEmpty(str2)) {
                String str3 = r9.A02;
                if (!TextUtils.isEmpty(str3)) {
                    String str4 = r9.A01;
                    if (!TextUtils.isEmpty(str4)) {
                        Log.d("GetFaqPageTask/getHelpPagePostExecute success");
                        ActivityC004702f r2 = (ActivityC004702f) this.A05.get();
                        if (r2 != null) {
                            Intent intent = new Intent(r2, FaqItemActivity.class);
                            intent.putExtra("title", str);
                            intent.putExtra("content", str4);
                            intent.putExtra("url", str2);
                            intent.putExtra("article_id", str3);
                            intent.putExtra("show_contact_support_button", r9.A05);
                            intent.putExtra("contact_us_context", this.A03);
                            intent.putExtra("describe_problem_fields", (Bundle) null);
                            r2.A0I(intent, false);
                            r2.overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                        }
                        progressDialog = this.A00;
                        if (progressDialog != null && progressDialog.isShowing()) {
                            this.A00.cancel();
                            return;
                        }
                    }
                }
            }
        }
        Log.d("GetFaqPageTask/getHelpPagePostExecute failure");
        ActivityC004702f r3 = (ActivityC004702f) this.A05.get();
        if (r3 != null) {
            this.A01.A01(r3, this.A03, false, null);
        }
        progressDialog = this.A00;
        if (progressDialog != null) {
        }
    }
}
