package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape1S0200000_I1_0;
import com.google.android.search.verification.client.R;
import com.whatsapp.StatusesFragment;
import com.whatsapp.util.Log;

/* renamed from: X.1tr  reason: invalid class name and case insensitive filesystem */
public class C40801tr implements AbstractC27051Nt {
    public final long A00;
    public final /* synthetic */ StatusesFragment A01;

    public C40801tr(StatusesFragment statusesFragment, long j) {
        this.A01 = statusesFragment;
        this.A00 = j;
    }

    @Override // X.AbstractC27051Nt
    public View A9j(int i, View view, ViewGroup viewGroup, Context context) {
        int i2;
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.list_section_status, viewGroup, false);
            view.setEnabled(false);
            AnonymousClass0Q7.A0W(view, 2);
        }
        TextView textView = (TextView) view.findViewById(R.id.title);
        C002301g.A03(textView);
        long j = this.A00;
        if (j == 0) {
            i2 = R.string.recent_updates;
        } else if (j == 1) {
            i2 = R.string.viewed_updates;
        } else {
            if (j != 2) {
                StringBuilder A0S = AnonymousClass008.A0S("statusesFragment/invalid id: ");
                A0S.append(j);
                Log.e(A0S.toString());
            }
            i2 = R.string.muted_updates;
        }
        StatusesFragment statusesFragment = this.A01;
        AnonymousClass01X r4 = statusesFragment.A0e;
        textView.setText(r4.A06(i2));
        ImageView imageView = (ImageView) view.findViewById(R.id.muted_statuses_icon);
        if (!statusesFragment.A0K || j != 2 || statusesFragment.A0I) {
            imageView.setVisibility(4);
            AnonymousClass0Q7.A0d(textView, null);
            textView.setOnClickListener(null);
            textView.setClickable(false);
            AnonymousClass0Q7.A0W(imageView, 0);
            return view;
        }
        imageView.setVisibility(0);
        boolean z = statusesFragment.A0H;
        int i3 = R.string.accessibility_hide_muted_statuses_prompt;
        if (z) {
            i3 = R.string.accessibility_show_muted_statuses_prompt;
        }
        C002001d.A2w(r4, textView, i3);
        statusesFragment.A0w(imageView);
        textView.setOnClickListener(new ViewOnClickEBaseShape1S0200000_I1_0(this, imageView, 11));
        AnonymousClass0Q7.A0W(imageView, 2);
        return view;
    }
}
