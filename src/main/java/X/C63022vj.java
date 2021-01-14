package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import com.google.android.search.verification.client.R;
import com.whatsapp.payments.ui.IndiaUpiBankPickerActivity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2vj  reason: invalid class name and case insensitive filesystem */
public class C63022vj extends ArrayAdapter {
    public List A00 = new ArrayList();
    public final /* synthetic */ IndiaUpiBankPickerActivity A01;

    public int getViewTypeCount() {
        return 1;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63022vj(IndiaUpiBankPickerActivity indiaUpiBankPickerActivity, Context context) {
        super(context, (int) R.layout.india_upi_payment_bank_picker_list_row, new ArrayList());
        this.A01 = indiaUpiBankPickerActivity;
    }

    public int getCount() {
        List list = this.A00;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // android.widget.ArrayAdapter
    public Object getItem(int i) {
        return this.A00.get(i);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C63032vk r0;
        if (view == null) {
            IndiaUpiBankPickerActivity indiaUpiBankPickerActivity = this.A01;
            view = indiaUpiBankPickerActivity.getLayoutInflater().inflate(R.layout.india_upi_payment_bank_picker_list_row, viewGroup, false);
            r0 = new C63032vk(indiaUpiBankPickerActivity, view);
            view.setTag(r0);
        } else {
            r0 = (C63032vk) view.getTag();
        }
        AnonymousClass27v r4 = (AnonymousClass27v) this.A00.get(i);
        if (r4 != null) {
            if (r0 != null) {
                if (!TextUtils.isEmpty(r4.A01)) {
                    IndiaUpiBankPickerActivity indiaUpiBankPickerActivity2 = r0.A02;
                    indiaUpiBankPickerActivity2.A07.A01(r4.A01, r0.A00, indiaUpiBankPickerActivity2.getResources().getDrawable(R.drawable.bank_logo_placeholder), null, null);
                } else {
                    r0.A00.setImageResource(R.drawable.bank_logo_placeholder);
                }
                r0.A01.A04(r4.A05(), r0.A02.A0A, false, 0);
            } else {
                throw null;
            }
        }
        return view;
    }
}
