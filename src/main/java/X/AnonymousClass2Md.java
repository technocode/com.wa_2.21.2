package X;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.search.verification.client.R;

/* renamed from: X.2Md  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2Md implements View.OnLayoutChangeListener {
    public final /* synthetic */ C48522Mp A00;

    public /* synthetic */ AnonymousClass2Md(C48522Mp r1) {
        this.A00 = r1;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C48522Mp r7 = this.A00;
        TextView textView = r7.A0Q;
        int width = textView.getWidth();
        TextView textView2 = r7.A0P;
        int width2 = textView2.getWidth();
        if (width > width2) {
            textView = textView2;
        }
        int max = Math.max(width, width2);
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (max != layoutParams.width) {
            layoutParams.width = max;
            textView.post(new RunnableEBaseShape7S0200000_I1_2(textView, layoutParams, 46));
        }
        if (r7.A0E) {
            View view2 = r7.A0I;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
            int i9 = max << 1;
            Activity activity = r7.A0F;
            int dimensionPixelSize = activity.getResources().getDimensionPixelSize(R.dimen.shape_picker_landscape_button_spacing) + activity.getResources().getDimensionPixelSize(R.dimen.shape_picker_search_collapsed_width) + i9;
            if (marginLayoutParams.width != dimensionPixelSize) {
                marginLayoutParams.width = dimensionPixelSize;
                view2.post(new RunnableEBaseShape7S0200000_I1_2(r7, marginLayoutParams, 47));
            }
        }
    }
}
