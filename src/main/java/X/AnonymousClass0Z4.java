package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import com.whatsapp.HomeActivity;

/* renamed from: X.0Z4  reason: invalid class name */
public class AnonymousClass0Z4 extends AnimatorListenerAdapter {
    public final /* synthetic */ HomeActivity A00;

    public AnonymousClass0Z4(HomeActivity homeActivity) {
        this.A00 = homeActivity;
    }

    public void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        HomeActivity homeActivity = this.A00;
        SearchView searchView = homeActivity.A0H;
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
        homeActivity.A0D.setVisibility(4);
    }
}
