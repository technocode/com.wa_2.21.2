package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import com.whatsapp.CountryPicker;

/* renamed from: X.1LI  reason: invalid class name */
public class AnonymousClass1LI extends AnimatorListenerAdapter {
    public final /* synthetic */ CountryPicker A00;

    public AnonymousClass1LI(CountryPicker countryPicker) {
        this.A00 = countryPicker;
    }

    public void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        CountryPicker countryPicker = this.A00;
        SearchView searchView = countryPicker.A01;
        if (1 != 0) {
            searchView.A05();
        } else {
            searchView.A0G(false);
            SearchView.SearchAutoComplete searchAutoComplete = searchView.A0k;
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
            View.OnClickListener onClickListener = searchView.A07;
            if (onClickListener != null) {
                onClickListener.onClick(searchView);
            }
        }
        countryPicker.A00.setVisibility(8);
        countryPicker.A02.setVisibility(0);
    }
}
