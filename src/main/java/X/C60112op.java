package X;

import android.view.View;
import android.widget.TextView;
import com.google.android.search.verification.client.R;

/* renamed from: X.2op  reason: invalid class name and case insensitive filesystem */
public class C60112op extends AbstractC56102i4 {
    public final TextView A00;
    public final /* synthetic */ AbstractView$OnCreateContextMenuListenerC56112i5 A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60112op(AbstractView$OnCreateContextMenuListenerC56112i5 r2, View view) {
        super(view);
        this.A01 = r2;
        this.A00 = (TextView) view.findViewById(R.id.live_location_end_text);
    }
}
