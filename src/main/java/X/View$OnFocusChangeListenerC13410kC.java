package X;

import android.view.View;
import androidx.appcompat.widget.SearchView;

/* renamed from: X.0kC  reason: invalid class name and case insensitive filesystem */
public class View$OnFocusChangeListenerC13410kC implements View.OnFocusChangeListener {
    public final /* synthetic */ SearchView A00;

    public View$OnFocusChangeListenerC13410kC(SearchView searchView) {
        this.A00 = searchView;
    }

    public void onFocusChange(View view, boolean z) {
        SearchView searchView = this.A00;
        View.OnFocusChangeListener onFocusChangeListener = searchView.A08;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(searchView, z);
        }
    }
}
