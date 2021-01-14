package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;

/* renamed from: X.1La  reason: invalid class name and case insensitive filesystem */
public class C26461La {
    public final View A00;
    public final ImageView A01;
    public final TextView A02;
    public final TextView A03;
    public final TextView A04;

    public C26461La(View view) {
        this.A01 = (ImageView) view.findViewById(R.id.icon);
        this.A04 = (TextView) view.findViewById(R.id.title);
        this.A03 = (TextView) view.findViewById(R.id.size);
        this.A02 = (TextView) view.findViewById(R.id.date);
        this.A00 = view.findViewById(R.id.selection_check);
    }
}
