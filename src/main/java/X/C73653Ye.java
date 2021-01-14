package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.search.verification.client.R;

/* renamed from: X.3Ye  reason: invalid class name and case insensitive filesystem */
public class C73653Ye extends AbstractC69453Hc {
    public final Context A00;
    public final ImageView A01;
    public final ProgressBar A02;
    public final RelativeLayout A03;
    public final TextView A04;
    public final TextView A05;
    public final TextView A06;
    public final AnonymousClass0HJ A07;
    public final AnonymousClass0L2 A08;

    public C73653Ye(View view, AnonymousClass0L2 r3, AnonymousClass0HJ r4) {
        super(view);
        this.A08 = r3;
        this.A07 = r4;
        this.A00 = view.getContext();
        this.A05 = (TextView) AnonymousClass0Q7.A0D(view, R.id.payment_send_action);
        this.A06 = (TextView) AnonymousClass0Q7.A0D(view, R.id.payment_send_action_time);
        this.A04 = (TextView) AnonymousClass0Q7.A0D(view, R.id.payment_people_info);
        this.A03 = (RelativeLayout) AnonymousClass0Q7.A0D(view, R.id.payment_people_container);
        this.A01 = (ImageView) AnonymousClass0Q7.A0D(view, R.id.payment_people_icon);
        this.A02 = (ProgressBar) AnonymousClass0Q7.A0D(view, R.id.payment_people_progress_bar);
    }
}
