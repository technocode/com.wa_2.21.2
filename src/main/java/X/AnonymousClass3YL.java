package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3YL  reason: invalid class name */
public abstract class AnonymousClass3YL extends AbstractC69443Hb {
    public View.OnClickListener A00;
    public ViewGroup A01;
    public FrameLayout A02;
    public ImageView A03;
    public LinearLayout A04;
    public TextView A05;
    public TextView A06;
    public CharSequence A07;
    public CharSequence A08;
    public final List A09 = new ArrayList();

    public AnonymousClass3YL(View view) {
        super(view);
        View view2 = this.A0H;
        this.A06 = (TextView) AnonymousClass0Q7.A0D(view2, R.id.header);
        this.A01 = (ViewGroup) AnonymousClass0Q7.A0D(view2, R.id.see_more_container);
        this.A03 = (ImageView) AnonymousClass0Q7.A0D(view2, R.id.see_more_icon);
        this.A05 = (TextView) AnonymousClass0Q7.A0D(view2, R.id.see_more_text);
        this.A02 = (FrameLayout) AnonymousClass0Q7.A0D(view2, R.id.custom_empty_view_container);
        this.A04 = (LinearLayout) AnonymousClass0Q7.A0D(view2, R.id.list_item_container);
    }

    public void A0D() {
        List list = this.A09;
        if (list.size() > 2) {
            this.A01.setVisibility(0);
            this.A05.setText(this.A08);
            this.A01.setOnClickListener(this.A00);
        } else if (!list.isEmpty()) {
            this.A01.setVisibility(8);
            this.A02.setVisibility(8);
        } else if (this.A02.getChildCount() > 0) {
            this.A02.setVisibility(0);
        } else {
            this.A01.setVisibility(0);
            this.A05.setText(this.A07);
            this.A01.setOnClickListener(null);
        }
    }
}
