package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;

/* renamed from: X.2XW  reason: invalid class name */
public class AnonymousClass2XW extends AbstractC11910hD {
    public final ImageView A00;
    public final ImageView A01;
    public final TextView A02;
    public final TextView A03;
    public final AnonymousClass2XZ A04;
    public final AnonymousClass01X A05;

    public AnonymousClass2XW(View view, AnonymousClass01X r3, AnonymousClass2XZ r4) {
        super(view);
        this.A05 = r3;
        this.A04 = r4;
        this.A00 = (ImageView) AnonymousClass0Q7.A0D(view, R.id.device_icon);
        this.A01 = (ImageView) AnonymousClass0Q7.A0D(view, R.id.sync_badge);
        this.A02 = (TextView) AnonymousClass0Q7.A0D(view, R.id.name);
        this.A03 = (TextView) AnonymousClass0Q7.A0D(view, R.id.status);
    }
}
