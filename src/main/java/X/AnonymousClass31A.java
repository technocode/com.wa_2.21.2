package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.search.verification.client.R;

/* renamed from: X.31A  reason: invalid class name */
public class AnonymousClass31A extends FrameLayout {
    public final Context A00;
    public final ViewGroup.MarginLayoutParams A01;
    public final TextView A02 = ((TextView) AnonymousClass0Q7.A0D(this, R.id.title));

    public AnonymousClass31A(Context context) {
        super(context);
        this.A00 = context;
        FrameLayout.inflate(getContext(), R.layout.search_group_header, this);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        this.A01 = marginLayoutParams;
        setLayoutParams(marginLayoutParams);
        setBackgroundResource(R.color.primary_surface);
    }

    public void A00(String str, boolean z, int i) {
        this.A02.setText(str);
        ViewGroup.MarginLayoutParams marginLayoutParams = this.A01;
        if (z) {
            marginLayoutParams.bottomMargin = 0;
        } else {
            marginLayoutParams.bottomMargin = getResources().getDimensionPixelSize(R.dimen.search_header_bottom_margin) - C008805h.A02(this.A00, (float) i);
        }
        setLayoutParams(marginLayoutParams);
    }
}
