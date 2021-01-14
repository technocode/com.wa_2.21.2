package X;

import android.widget.BaseAdapter;
import com.google.android.search.verification.client.R;
import com.whatsapp.WebImagePicker;

/* renamed from: X.1Op  reason: invalid class name and case insensitive filesystem */
public class C27211Op extends BaseAdapter {
    public C11080fg A00;
    public boolean A01;
    public final /* synthetic */ WebImagePicker A02;

    public Object getItem(int i) {
        return null;
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public C27211Op(WebImagePicker webImagePicker) {
        this.A02 = webImagePicker;
    }

    public final void A00(String str) {
        if (str != null) {
            C11080fg r0 = this.A00;
            if (r0 != null) {
                ((AnonymousClass0JW) r0).A00.cancel(false);
            }
            this.A01 = true;
            WebImagePicker webImagePicker = this.A02;
            AnonymousClass00G r1 = webImagePicker.A0H;
            C02660Cy r5 = webImagePicker.A0I;
            webImagePicker.A0B = new C27221Oq(r1, r5, str);
            webImagePicker.A0L.clear();
            webImagePicker.A0C.A01.A01(false);
            C664234e r2 = new C664234e(((ActivityC004702f) webImagePicker).A0F, r5, webImagePicker.A0D);
            r2.A01 = webImagePicker.A01;
            r2.A02 = 4194304;
            r2.A04 = C004302a.A03(webImagePicker, R.drawable.gray_rectangle);
            r2.A03 = C004302a.A03(webImagePicker, R.drawable.ic_missing_thumbnail_picture);
            webImagePicker.A0C = r2.A00();
        }
        C11080fg r22 = new C11080fg(this);
        this.A00 = r22;
        this.A02.A0K.ANC(r22, new Void[0]);
        if (str != null) {
            notifyDataSetChanged();
        }
    }

    public int getCount() {
        WebImagePicker webImagePicker = this.A02;
        int size = webImagePicker.A0L.size();
        int i = webImagePicker.A00;
        return ((size + i) - 1) / i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (r1 != r7.A00) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r18, android.view.View r19, android.view.ViewGroup r20) {
        /*
        // Method dump skipped, instructions count: 227
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27211Op.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
