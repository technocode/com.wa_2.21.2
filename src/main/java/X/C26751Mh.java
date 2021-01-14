package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.MessageDetailsActivity;

/* renamed from: X.1Mh  reason: invalid class name and case insensitive filesystem */
public class C26751Mh extends BaseAdapter {
    public final /* synthetic */ MessageDetailsActivity A00;

    public int getCount() {
        return 1;
    }

    public Object getItem(int i) {
        return null;
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public int getViewTypeCount() {
        return 1;
    }

    public C26751Mh(MessageDetailsActivity messageDetailsActivity) {
        this.A00 = messageDetailsActivity;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = view;
        if (view == null) {
            view2 = this.A00.getLayoutInflater().inflate(R.layout.message_details_individual, viewGroup, false);
        }
        MessageDetailsActivity messageDetailsActivity = this.A00;
        C48122Kz r2 = ((C26781Mk) messageDetailsActivity.A0U.get(0)).A00;
        View findViewById = view2.findViewById(R.id.section_played);
        AbstractC007503q r3 = messageDetailsActivity.A06;
        if (r3.A0m == 2 && r3.A04 == 1) {
            findViewById.setVisibility(0);
        } else {
            findViewById.setVisibility(8);
        }
        TextView textView = (TextView) view2.findViewById(R.id.title_read);
        byte b = messageDetailsActivity.A06.A0m;
        int i2 = R.string.message_seen;
        if (b == 0) {
            i2 = R.string.message_read;
        }
        textView.setText(i2);
        TextView textView2 = (TextView) view2.findViewById(R.id.date_time_sent);
        TextView textView3 = (TextView) view2.findViewById(R.id.date_time_delivered);
        TextView textView4 = (TextView) view2.findViewById(R.id.date_time_read);
        TextView textView5 = (TextView) view2.findViewById(R.id.date_time_played);
        TextView textView6 = (TextView) view2.findViewById(R.id.forwarded_count);
        View findViewById2 = view2.findViewById(R.id.forwarded_container);
        View findViewById3 = view2.findViewById(R.id.delivered_separator);
        if (messageDetailsActivity.A07) {
            findViewById2.setVisibility(0);
            findViewById3.setVisibility(0);
            AnonymousClass01X r12 = ((AnonymousClass2C0) messageDetailsActivity).A01;
            int i3 = messageDetailsActivity.A06.A03;
            textView6.setText(r12.A0A(R.plurals.message_forward_count, (long) i3, Integer.valueOf(i3)));
        } else {
            findViewById3.setVisibility(8);
            findViewById2.setVisibility(8);
        }
        textView2.setText(C002001d.A1F(((AnonymousClass2C0) messageDetailsActivity).A01, messageDetailsActivity.A0I.A06(messageDetailsActivity.A06.A0E)));
        long A01 = r2.A01(5);
        boolean z = false;
        if (A01 > 0) {
            z = true;
        }
        if (z) {
            textView3.setText(MessageDetailsActivity.A04(messageDetailsActivity, A01));
        } else {
            textView3.setText("—");
        }
        long A012 = r2.A01(13);
        if (A012 > 0) {
            textView4.setText(MessageDetailsActivity.A04(messageDetailsActivity, A012));
        } else {
            textView4.setText("—");
        }
        long A013 = r2.A01(8);
        if (A013 > 0) {
            textView5.setText(MessageDetailsActivity.A04(messageDetailsActivity, A013));
            return view2;
        }
        textView5.setText("—");
        return view2;
    }
}
