package X;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.search.verification.client.R;

/* renamed from: X.2Mi  reason: invalid class name and case insensitive filesystem */
public class View$OnLayoutChangeListenerC48462Mi implements View.OnLayoutChangeListener {
    public final /* synthetic */ C48522Mp A00;

    public View$OnLayoutChangeListenerC48462Mi(C48522Mp r1) {
        this.A00 = r1;
    }

    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C48522Mp r1 = this.A00;
        View view2 = r1.A0I;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
        int width = r1.A0L.getWidth();
        Activity activity = r1.A0F;
        int dimensionPixelSize = activity.getResources().getDimensionPixelSize(R.dimen.shape_picker_search_collapsed_width);
        marginLayoutParams.setMargins(0, 0, 0, 0);
        marginLayoutParams.width = activity.getResources().getDimensionPixelSize(R.dimen.shape_picker_landscape_button_spacing) + dimensionPixelSize + width;
        view2.setLayoutParams(marginLayoutParams);
        view2.removeOnLayoutChangeListener(this);
    }
}
