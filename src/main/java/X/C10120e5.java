package X;

import com.google.android.search.verification.client.R;
import com.whatsapp.payments.ui.IndiaUpiBankPickerActivity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0e5  reason: invalid class name and case insensitive filesystem */
public class C10120e5 extends AnonymousClass0JW {
    public final ArrayList A00;
    public final /* synthetic */ IndiaUpiBankPickerActivity A01;

    public C10120e5(IndiaUpiBankPickerActivity indiaUpiBankPickerActivity, ArrayList arrayList) {
        this.A01 = indiaUpiBankPickerActivity;
        this.A00 = arrayList != null ? new ArrayList(arrayList) : null;
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        List list = (List) obj;
        IndiaUpiBankPickerActivity indiaUpiBankPickerActivity = this.A01;
        indiaUpiBankPickerActivity.A06 = null;
        if (list.isEmpty()) {
            indiaUpiBankPickerActivity.A02.setText(((AnonymousClass2C0) indiaUpiBankPickerActivity).A01.A0D(R.string.search_no_results, indiaUpiBankPickerActivity.A08));
        }
        C63022vj r0 = indiaUpiBankPickerActivity.A05;
        r0.A00 = list;
        r0.notifyDataSetChanged();
        indiaUpiBankPickerActivity.A01.smoothScrollToPosition(0);
    }
}
