package X;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1rf  reason: invalid class name and case insensitive filesystem */
public class C39521rf extends AnonymousClass0JW {
    public final ArrayList A00;
    public final List A01;
    public final /* synthetic */ AnonymousClass2DH A02;

    public C39521rf(AnonymousClass2DH r2, List list, List list2) {
        ArrayList arrayList;
        this.A02 = r2;
        if (list != null) {
            arrayList = new ArrayList(list);
        } else {
            arrayList = null;
        }
        this.A00 = arrayList;
        this.A01 = list2;
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        String A0D;
        AnonymousClass2DH r5 = this.A02;
        r5.A03 = null;
        C26431Kv r0 = r5.A02;
        r0.A00 = (ArrayList) obj;
        r0.notifyDataSetChanged();
        View findViewById = r5.findViewById(16908292);
        if (r5.A02.isEmpty()) {
            findViewById.setVisibility(0);
            if (TextUtils.isEmpty(r5.A07)) {
                A0D = ((AnonymousClass2C0) r5).A01.A06(R.string.contact_picker_no_wa_contacts);
            } else {
                A0D = ((AnonymousClass2C0) r5).A01.A0D(R.string.search_no_results, r5.A07);
            }
            TextView textView = (TextView) r5.findViewById(R.id.search_no_matches);
            textView.setText(A0D);
            textView.setVisibility(0);
            r5.findViewById(R.id.init_contacts_progress).setVisibility(8);
            return;
        }
        findViewById.setVisibility(8);
    }
}
