package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.search.verification.client.R;
import com.whatsapp.ClearableEditText;

/* renamed from: X.2Mg  reason: invalid class name and case insensitive filesystem */
public class C48442Mg extends AnimatorListenerAdapter {
    public final /* synthetic */ C48522Mp A00;

    public C48442Mg(C48522Mp r1) {
        this.A00 = r1;
    }

    public void onAnimationEnd(Animator animator) {
        C48522Mp r3 = this.A00;
        r3.A0J.setVisibility(4);
        ClearableEditText clearableEditText = r3.A0R;
        clearableEditText.setVisibility(0);
        r3.A0O.setImageResource(R.drawable.ic_shape_picker_search_active);
        clearableEditText.requestFocus();
    }

    public void onAnimationStart(Animator animator) {
        C48522Mp r2 = this.A00;
        r2.A0J.setClickable(false);
        r2.A0L.setVisibility(4);
    }
}
