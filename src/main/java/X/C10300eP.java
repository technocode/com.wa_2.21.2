package X;

import android.app.ProgressDialog;
import android.content.Context;
import android.net.Uri;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.0eP  reason: invalid class name and case insensitive filesystem */
public class C10300eP extends AnonymousClass0JW {
    public long A00;
    public ProgressDialog A01;
    public String A02;
    public String A03;
    public JSONArray A04;
    public final C04090Iz A05;
    public final AbstractC07200Wh A06 = new C55162g6(this);
    public final AnonymousClass00C A07;
    public final AnonymousClass00D A08;
    public final AnonymousClass01X A09;
    public final AnonymousClass0M9 A0A;
    public final AnonymousClass0JB A0B;
    public final C03190Fd A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final WeakReference A0G;
    public final List A0H;
    public final Uri[] A0I;

    public C10300eP(ActivityC004702f r2, C03190Fd r3, AnonymousClass0M9 r4, AnonymousClass01X r5, C04090Iz r6, AnonymousClass00C r7, AnonymousClass00D r8, AnonymousClass0JB r9, String str, String str2, List list, String str3, Uri[] uriArr) {
        this.A0G = new WeakReference(r2);
        this.A0C = r3;
        this.A0A = r4;
        this.A09 = r5;
        this.A05 = r6;
        this.A07 = r7;
        this.A08 = r8;
        this.A0B = r9;
        this.A0D = str;
        this.A0F = str2;
        this.A0H = list;
        this.A0E = str3;
        this.A0I = uriArr;
    }

    @Override // X.AnonymousClass0JW
    public void A01() {
        String string;
        Context context = (Context) this.A0G.get();
        if (context != null) {
            if (this.A01 == null) {
                ProgressDialog progressDialog = new ProgressDialog(context);
                this.A01 = progressDialog;
                progressDialog.setOnCancelListener(new DialogInterface$OnCancelListenerC49492Qr(this));
                this.A01.setCancelable(false);
            }
            if (!this.A01.isShowing()) {
                ProgressDialog progressDialog2 = this.A01;
                if (C002001d.A3C()) {
                    string = context.getString(R.string.contact_us_faq_search_dialog_message);
                } else {
                    string = context.getString(R.string.searching);
                }
                progressDialog2.setMessage(string);
                this.A01.setIndeterminate(true);
                this.A01.show();
            }
        }
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        if (this.A0G.get() != null) {
            try {
                JSONArray jSONArray = this.A04;
                if (jSONArray != null) {
                    int length = jSONArray.length();
                    StringBuilder sb = new StringBuilder();
                    sb.append("searchSupportTask/onPostExecute/result/count: ");
                    sb.append(length);
                    Log.i(sb.toString());
                    if (length > 0) {
                        ArrayList arrayList = new ArrayList(length);
                        ArrayList arrayList2 = new ArrayList(length);
                        ArrayList arrayList3 = new ArrayList(length);
                        ArrayList arrayList4 = new ArrayList(length);
                        int i = 0;
                        do {
                            JSONObject optJSONObject = this.A04.optJSONObject(i);
                            arrayList.add(optJSONObject.getString("title"));
                            arrayList2.add(optJSONObject.getString("description"));
                            arrayList3.add(optJSONObject.getString("url"));
                            arrayList4.add(optJSONObject.getString("id"));
                            i++;
                        } while (i < length);
                        ArrayList arrayList5 = new ArrayList();
                        Uri[] uriArr = this.A0I;
                        for (Uri uri : uriArr) {
                            if (uri != null) {
                                arrayList5.add(uri);
                            }
                        }
                        AnonymousClass0JB r0 = this.A0B;
                        if (r0 != null) {
                            r0.AJr(new C49502Qs(length, arrayList, arrayList2, arrayList3, arrayList4, this.A0E, arrayList5, this.A02, this.A0H));
                        }
                        ProgressDialog progressDialog = this.A01;
                        if (progressDialog != null && progressDialog.isShowing()) {
                            this.A01.cancel();
                            return;
                        }
                        return;
                    }
                }
            } catch (Exception e) {
                StringBuilder sb2 = new StringBuilder("searchSupportTask/onPostExecute/error: ");
                sb2.append(e);
                Log.e(sb2.toString(), e);
            }
            AnonymousClass0JB r02 = this.A0B;
            if (r02 != null) {
                r02.AFU();
            }
            ProgressDialog progressDialog2 = this.A01;
            if (progressDialog2 != null && progressDialog2.isShowing()) {
                this.A01.cancel();
            }
        }
    }
}
