package X;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import com.google.android.search.verification.client.R;

/* renamed from: X.0kD  reason: invalid class name and case insensitive filesystem */
public class View$OnLayoutChangeListenerC13420kD implements View.OnLayoutChangeListener {
    public final /* synthetic */ SearchView A00;

    public View$OnLayoutChangeListenerC13420kD(SearchView searchView) {
        this.A00 = searchView;
    }

    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9;
        int i10;
        SearchView searchView = this.A00;
        View view2 = searchView.A0Y;
        if (view2.getWidth() > 1) {
            Resources resources = searchView.getContext().getResources();
            int paddingLeft = searchView.A0a.getPaddingLeft();
            Rect rect = new Rect();
            boolean A01 = C06360Sy.A01(searchView);
            if (searchView.A0M) {
                i9 = resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width);
            } else {
                i9 = 0;
            }
            SearchView.SearchAutoComplete searchAutoComplete = searchView.A0k;
            searchAutoComplete.getDropDownBackground().getPadding(rect);
            if (A01) {
                i10 = -rect.left;
            } else {
                i10 = paddingLeft - (rect.left + i9);
            }
            searchAutoComplete.setDropDownHorizontalOffset(i10);
            searchAutoComplete.setDropDownWidth((((view2.getWidth() + rect.left) + rect.right) + i9) - paddingLeft);
        }
    }
}
