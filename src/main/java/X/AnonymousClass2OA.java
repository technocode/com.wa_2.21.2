package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape1S0200000_I1_0;
import com.google.android.search.verification.client.R;
import com.whatsapp.faq.SearchFAQ;
import java.util.List;

/* renamed from: X.2OA  reason: invalid class name */
public class AnonymousClass2OA extends ArrayAdapter {
    public final /* synthetic */ SearchFAQ A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2OA(SearchFAQ searchFAQ, Context context, List list) {
        super(context, (int) R.layout.search_faq_row, list);
        this.A00 = searchFAQ;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        AnonymousClass2OB r0;
        LinearLayout linearLayout;
        if (view == null) {
            LinearLayout linearLayout2 = new LinearLayout(getContext());
            ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(R.layout.search_faq_row, (ViewGroup) linearLayout2, true);
            r0 = new AnonymousClass2OB(null);
            r0.A01 = (TextView) linearLayout2.findViewById(R.id.search_faq_row_text);
            r0.A00 = linearLayout2.findViewById(R.id.divider);
            linearLayout2.setTag(r0);
            linearLayout = linearLayout2;
        } else {
            r0 = (AnonymousClass2OB) view.getTag();
            linearLayout = view;
        }
        Object item = getItem(i);
        if (item != null) {
            AnonymousClass2O9 r3 = (AnonymousClass2O9) item;
            r0.A01.setText(r3.A02);
            View view2 = r0.A00;
            int i2 = 8;
            if (i < getCount() - 1) {
                i2 = 0;
            }
            view2.setVisibility(i2);
            linearLayout.setOnClickListener(new ViewOnClickEBaseShape1S0200000_I1_0(this, r3, 44));
            return linearLayout;
        }
        throw null;
    }
}
