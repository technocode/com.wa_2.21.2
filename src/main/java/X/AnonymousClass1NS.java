package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import androidx.appcompat.widget.SearchView;

/* renamed from: X.1NS  reason: invalid class name */
public class AnonymousClass1NS extends AnimatorListenerAdapter {
    public final /* synthetic */ AnonymousClass0YP A00;

    public AnonymousClass1NS(AnonymousClass0YP r1) {
        this.A00 = r1;
    }

    public void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        AnonymousClass0YP r3 = this.A00;
        SearchView searchView = r3.A01;
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
        r3.A03.setVisibility(4);
    }
}
