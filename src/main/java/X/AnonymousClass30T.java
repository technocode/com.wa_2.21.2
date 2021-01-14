package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import java.util.List;

/* renamed from: X.30T  reason: invalid class name */
public class AnonymousClass30T extends ArrayAdapter {
    public int A00 = 0;
    public final AnonymousClass0CO A01 = AnonymousClass0CO.A00();
    public final AnonymousClass01X A02 = AnonymousClass01X.A00();
    public final List A03;

    public AnonymousClass30T(Context context, List list) {
        super(context, (int) R.layout.item_select_phone_number, list);
        this.A03 = list;
    }

    public int getCount() {
        return this.A03.size();
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        AnonymousClass30S r0;
        boolean z = false;
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_select_phone_number, viewGroup, false);
            r0 = new AnonymousClass30S(null);
            view.setTag(r0);
            r0.A02 = (TextView) view.findViewById(R.id.title);
            r0.A01 = (TextView) view.findViewById(R.id.subtitle);
            r0.A00 = (RadioButton) view.findViewById(R.id.radio);
        } else {
            r0 = (AnonymousClass30S) view.getTag();
        }
        AnonymousClass1LS r2 = (AnonymousClass1LS) this.A03.get(i);
        String str = r2.A00;
        String str2 = r2.A02;
        TextView textView = r0.A02;
        AnonymousClass0CO r3 = this.A01;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        textView.setText(AnonymousClass0JE.A09(r3, str, sb.toString()));
        r0.A01.setText(this.A02.A0D(R.string.select_phone_number_subtitle, Integer.valueOf(i + 1), r2.A01));
        RadioButton radioButton = r0.A00;
        if (i == this.A00) {
            z = true;
        }
        radioButton.setChecked(z);
        return view;
    }
}
