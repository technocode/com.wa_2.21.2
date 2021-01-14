package X;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.facebook.redex.ViewOnClickEBaseShape1S0200000_I1_0;
import com.google.android.search.verification.client.R;
import com.whatsapp.WaTextView;
import com.whatsapp.inappsupport.ui.SupportTopicsActivity;
import java.util.ArrayList;

/* renamed from: X.2Qx  reason: invalid class name and case insensitive filesystem */
public class C49552Qx extends BaseAdapter {
    public SupportTopicsActivity A00;
    public ArrayList A01;

    public long getItemId(int i) {
        return (long) i;
    }

    public C49552Qx(SupportTopicsActivity supportTopicsActivity, ArrayList arrayList) {
        this.A00 = supportTopicsActivity;
        this.A01 = arrayList;
    }

    public int getCount() {
        return this.A01.size();
    }

    public Object getItem(int i) {
        return this.A01.get(i);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C49542Qw r0;
        C49482Qq r5 = (C49482Qq) this.A01.get(i);
        if (view == null) {
            r0 = new C49542Qw();
            view = LayoutInflater.from(this.A00).inflate(R.layout.support_topic_list_item, viewGroup, false);
            r0.A01 = (WaTextView) view.findViewById(R.id.topic_title);
            r0.A00 = view.findViewById(R.id.topic_divider);
            view.setTag(r0);
        } else {
            r0 = (C49542Qw) view.getTag();
        }
        WaTextView waTextView = r0.A01;
        waTextView.setText(r5.A03);
        waTextView.setOnClickListener(new ViewOnClickEBaseShape1S0200000_I1_0(this, r5, 47));
        if (this.A00.A01 == 2) {
            int i2 = (int) (Resources.getSystem().getDisplayMetrics().density * 16.0f);
            waTextView.setPadding(i2, i2, i2, i2);
            r0.A00.setVisibility(0);
            return view;
        }
        r0.A00.setVisibility(8);
        return view;
    }
}
