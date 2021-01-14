package X;

import android.view.View;
import com.google.android.search.verification.client.R;

/* renamed from: X.3Zh  reason: invalid class name and case insensitive filesystem */
public class C73903Zh extends AbstractC11900hC {
    public final View A00 = AnonymousClass0Q7.A0D(this.A0H, R.id.search_no_matches);

    public C73903Zh(View view) {
        super(view);
    }

    public void A0F(Boolean bool) {
        View view;
        int dimensionPixelSize;
        if (bool == null || bool.booleanValue()) {
            view = this.A0H;
            dimensionPixelSize = view.getContext().getResources().getDimensionPixelSize(R.dimen.search_no_result_tall_top_margin);
        } else {
            view = this.A0H;
            dimensionPixelSize = view.getContext().getResources().getDimensionPixelSize(R.dimen.search_no_result_short_top_margin) - view.getContext().getResources().getDimensionPixelSize(R.dimen.search_header_bottom_margin);
        }
        this.A00.setPadding(view.getPaddingLeft(), dimensionPixelSize, view.getPaddingRight(), view.getPaddingBottom());
    }
}
