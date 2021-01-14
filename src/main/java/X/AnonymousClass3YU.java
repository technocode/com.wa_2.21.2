package X;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.search.verification.client.R;

/* renamed from: X.3YU  reason: invalid class name */
public class AnonymousClass3YU extends AbstractC69443Hb {
    public Button A00;
    public ImageView A01;
    public LinearLayout A02;
    public TextView A03;
    public TextView A04;

    public AnonymousClass3YU(View view) {
        super(view);
        this.A01 = (ImageView) AnonymousClass0Q7.A0D(view, R.id.payout_bank_icon);
        this.A04 = (TextView) AnonymousClass0Q7.A0D(view, R.id.payout_bank_name);
        this.A03 = (TextView) AnonymousClass0Q7.A0D(view, R.id.payout_bank_status);
        this.A02 = (LinearLayout) AnonymousClass0Q7.A0D(view, R.id.warning_container);
        this.A00 = (Button) AnonymousClass0Q7.A0D(view, R.id.cta_button);
    }
}
