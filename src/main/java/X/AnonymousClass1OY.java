package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape0S0110000_I1;
import com.google.android.search.verification.client.R;

/* renamed from: X.1OY  reason: invalid class name */
public class AnonymousClass1OY extends AnimatorListenerAdapter {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C27131Oe A01;
    public final /* synthetic */ boolean A02;

    public AnonymousClass1OY(C27131Oe r1, boolean z, View view) {
        this.A01 = r1;
        this.A02 = z;
        this.A00 = view;
    }

    public void onAnimationEnd(Animator animator) {
        C27131Oe r4 = this.A01;
        r4.A0K.setVisibility(8);
        View view = this.A00;
        view.setEnabled(true);
        View findViewById = r4.A0H.findViewById(R.id.voice_note_slide_to_cancel_animation);
        AnimatorSet animatorSet = r4.A0B;
        if (animatorSet != null) {
            animatorSet.end();
        }
        findViewById.setVisibility(8);
        r4.A0H.findViewById(R.id.voice_recorder_decor).setVisibility(8);
        view.requestFocus();
    }

    public void onAnimationStart(Animator animator) {
        C27131Oe r6 = this.A01;
        TextView textView = (TextView) r6.A0H.findViewById(R.id.voice_note_cancel_btn);
        C002301g.A03(textView);
        textView.setOnClickListener(new ViewOnClickEBaseShape0S0110000_I1(this, this.A02, 0));
        View findViewById = r6.A0H.findViewById(R.id.voice_note_slide_to_cancel_layout);
        findViewById.animate().setDuration(200).alpha(0.0f).setListener(new AnonymousClass1OX(findViewById)).start();
        textView.setAlpha(0.0f);
        textView.setVisibility(0);
        textView.animate().alpha(1.0f).setDuration(200).start();
        C26281Kf r10 = r6.A0T;
        RunnableEBaseShape6S0100000_I1_1 runnableEBaseShape6S0100000_I1_1 = new RunnableEBaseShape6S0100000_I1_1(this, 39);
        r10.setPivotX((float) (r10.getWidth() / 2));
        r10.setPivotY((float) (r10.A0I / 2));
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 1.3f);
        ofFloat.setDuration(250L);
        ofFloat.setRepeatMode(2);
        ofFloat.setRepeatCount(2);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.addUpdateListener(new C25461Hb(r10));
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(r10.A0O), Integer.valueOf(r10.A0N));
        ofObject.setDuration(250L);
        ofObject.setInterpolator(new AccelerateDecelerateInterpolator());
        ofObject.addUpdateListener(new C25451Ha(r10));
        animatorSet.addListener(new C26261Kd(r10, runnableEBaseShape6S0100000_I1_1));
        animatorSet.playTogether(ofFloat, ofObject);
        animatorSet.start();
    }
}
