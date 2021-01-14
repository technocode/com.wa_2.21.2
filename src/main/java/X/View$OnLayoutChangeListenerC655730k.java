package X;

import android.view.View;
import com.whatsapp.search.SearchFragment;

/* renamed from: X.30k  reason: invalid class name and case insensitive filesystem */
public class View$OnLayoutChangeListenerC655730k implements View.OnLayoutChangeListener {
    public final /* synthetic */ SearchFragment A00;

    public View$OnLayoutChangeListenerC655730k(SearchFragment searchFragment) {
        this.A00 = searchFragment;
    }

    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        SearchFragment searchFragment = this.A00;
        searchFragment.A0r(i, i2, i3, i4, true, new RunnableEBaseShape12S0100000_I1_7(searchFragment, 32));
    }
}
