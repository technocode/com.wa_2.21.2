package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.ViewOnClickCListenerShape4S0200000_I1;

/* renamed from: X.1Nf  reason: invalid class name and case insensitive filesystem */
public class C26931Nf {
    public View A00;
    public Runnable A01;

    public void A00(int i, String str, View.OnClickListener onClickListener) {
        ((TextView) AnonymousClass0Q7.A0D(this.A00, R.id.share_link_action_item_text)).setText(str);
        ((ImageView) AnonymousClass0Q7.A0D(this.A00, R.id.share_link_action_item_icon)).setImageDrawable(C004302a.A03(this.A00.getContext(), i));
        this.A00.setOnClickListener(new ViewOnClickCListenerShape4S0200000_I1(this, onClickListener, 4));
    }
}
