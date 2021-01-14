package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.payments.ui.IndiaUpiBankAccountPickerActivity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2vg  reason: invalid class name and case insensitive filesystem */
public class C62992vg extends ArrayAdapter {
    public List A00 = new ArrayList();
    public final /* synthetic */ IndiaUpiBankAccountPickerActivity A01;

    public int getViewTypeCount() {
        return 1;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62992vg(IndiaUpiBankAccountPickerActivity indiaUpiBankAccountPickerActivity, Context context) {
        super(context, (int) R.layout.india_upi_account_picker_list_row, new ArrayList());
        this.A01 = indiaUpiBankAccountPickerActivity;
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
        C63002vh r0;
        if (view == null) {
            IndiaUpiBankAccountPickerActivity indiaUpiBankAccountPickerActivity = this.A01;
            view = indiaUpiBankAccountPickerActivity.getLayoutInflater().inflate(R.layout.india_upi_account_picker_list_row, viewGroup, false);
            r0 = new C63002vh(indiaUpiBankAccountPickerActivity, view);
            view.setTag(r0);
        } else {
            r0 = (C63002vh) view.getTag();
        }
        C62982vf r3 = (C62982vf) this.A00.get(i);
        if (r3 != null) {
            IndiaUpiBankAccountPickerActivity indiaUpiBankAccountPickerActivity2 = r0.A03;
            if (!TextUtils.isEmpty(indiaUpiBankAccountPickerActivity2.A07)) {
                indiaUpiBankAccountPickerActivity2.A06.A01(indiaUpiBankAccountPickerActivity2.A07, r0.A00, indiaUpiBankAccountPickerActivity2.getResources().getDrawable(R.drawable.bank_logo_placeholder), null, null);
            } else {
                r0.A00.setImageResource(R.drawable.bank_logo_placeholder);
            }
            TextView textView = r0.A02;
            String str = r3.A01;
            String str2 = r3.A02;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" ");
            sb.append("•");
            sb.append("•");
            sb.append(str2);
            textView.setText(sb.toString());
            r0.A01.setText(r3.A00);
        }
        return view;
    }
}
