package X;

import android.animation.TimeInterpolator;
import android.content.Intent;
import android.os.Bundle;
import android.transition.ChangeBounds;
import android.transition.ChangeImageTransform;
import android.transition.ChangeTransform;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.LinearInterpolator;
import com.google.android.search.verification.client.R;
import com.whatsapp.mediaview.MediaViewBaseFragment;
import com.whatsapp.mediaview.PhotoView;
import com.whatsapp.util.Log;

/* renamed from: X.2ke */
public class C57652ke extends AnonymousClass2UT {
    public final AnonymousClass1PN A00;
    public final MediaViewBaseFragment A01;

    @Override // X.AnonymousClass2UT
    public void A08() {
    }

    public C57652ke(AnonymousClass1PN r1, MediaViewBaseFragment mediaViewBaseFragment) {
        this.A00 = r1;
        this.A01 = mediaViewBaseFragment;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00a7, code lost:
        if (r2 == 0) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00ad, code lost:
        if (r6 != r11.getHeight()) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00af, code lost:
        X.AnonymousClass0Q7.A0c(r11, new android.graphics.Rect(0, r2, r11.getWidth(), r6));
        r11.postDelayed(new java.lang.RunnableEBaseShape11S0100000_I1_6(r11, 4), (long) r12.getResources().getInteger(17694721));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00d0, code lost:
        r3.addAll(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00d3, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList A05(android.view.View r11, X.ActivityC004802g r12, X.AnonymousClass1PN r13, java.lang.String r14) {
        /*
        // Method dump skipped, instructions count: 214
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57652ke.A05(android.view.View, X.02g, X.1PN, java.lang.String):java.util.ArrayList");
    }

    public static void A07(ActivityC004802g r2, AnonymousClass1PN r3, Intent intent, View view, String str) {
        StringBuilder sb = new StringBuilder("mediaviewtransitionhelper/start/");
        sb.append(view);
        Log.d(sb.toString());
        C14460mJ A002 = C14460mJ.A00(r2, (AnonymousClass02R[]) A05(view, r2, r3, str).toArray(new AnonymousClass02R[0]));
        r2.setExitSharedElementCallback(new AnonymousClass2UU(r2));
        r2.startActivity(intent, A002.A01());
    }

    @Override // X.AnonymousClass2UT
    public void A09(Bundle bundle) {
        PhotoView A0n;
        MediaViewBaseFragment mediaViewBaseFragment = this.A01;
        Object A0r = mediaViewBaseFragment.A0r(mediaViewBaseFragment.A09.getCurrentItem());
        if (A0r == null) {
            mediaViewBaseFragment.A0t();
            return;
        }
        int childCount = mediaViewBaseFragment.A09.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = mediaViewBaseFragment.A09.getChildAt(i);
            if (childAt instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) childAt;
                if (viewGroup.getChildCount() > 0 && (A0n = mediaViewBaseFragment.A0n(viewGroup)) != null) {
                    if (A0r.equals(viewGroup.getTag())) {
                        AnonymousClass0Q7.A0g(A0n, AnonymousClass008.A0K("thumb-transition-", A0r.toString()));
                    } else {
                        AnonymousClass0Q7.A0g(A0n, null);
                    }
                }
            }
        }
        if (mediaViewBaseFragment.A0q() != null && !A0r.equals(mediaViewBaseFragment.A0q())) {
            mediaViewBaseFragment.A08().A05 = new C57642kd(this, bundle);
        }
        if (mediaViewBaseFragment.A11()) {
            AnonymousClass0TX.A0B(mediaViewBaseFragment.A0B());
        } else {
            mediaViewBaseFragment.A0t();
        }
    }

    @Override // X.AnonymousClass2UT
    public void A0A(AnonymousClass2US r13, Bundle bundle) {
        MediaViewBaseFragment mediaViewBaseFragment = this.A01;
        mediaViewBaseFragment.A03.setVisibility(4);
        mediaViewBaseFragment.A0z(false, 0);
        mediaViewBaseFragment.A06.setVisibility(0);
        mediaViewBaseFragment.A0G = false;
        View decorView = mediaViewBaseFragment.A0B().getWindow().getDecorView();
        decorView.getViewTreeObserver().addOnPreDrawListener(new AnonymousClass2UV(decorView));
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        AnonymousClass1PN r5 = this.A00;
        ChangeBounds changeBounds = new ChangeBounds();
        changeBounds.setInterpolator(linearInterpolator);
        changeBounds.excludeTarget(r5.A01(R.string.transition_clipper_top), true);
        changeBounds.excludeTarget(r5.A01(R.string.transition_clipper_bottom), true);
        ChangeTransform changeTransform = new ChangeTransform();
        changeTransform.setInterpolator(linearInterpolator);
        ChangeImageTransform changeImageTransform = new ChangeImageTransform();
        changeImageTransform.setInterpolator(linearInterpolator);
        mediaViewBaseFragment.A01();
        AnonymousClass2UR r2 = new AnonymousClass2UR(r5, true);
        r2.setInterpolator(linearInterpolator);
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.setInterpolator((TimeInterpolator) linearInterpolator);
        transitionSet.setDuration(220L);
        transitionSet.addTransition(changeBounds);
        transitionSet.addTransition(changeTransform);
        transitionSet.addTransition(changeImageTransform);
        transitionSet.addTransition(r2);
        mediaViewBaseFragment.A01();
        AnonymousClass2UR r22 = new AnonymousClass2UR(r5, false);
        r22.setInterpolator(linearInterpolator);
        TransitionSet transitionSet2 = new TransitionSet();
        transitionSet2.setInterpolator((TimeInterpolator) linearInterpolator);
        transitionSet2.setDuration(220L);
        transitionSet2.addTransition(changeBounds);
        transitionSet2.addTransition(changeTransform);
        transitionSet2.addTransition(changeImageTransform);
        transitionSet2.addTransition(r22);
        Fade fade = new Fade();
        fade.excludeTarget(16908335, true);
        fade.excludeTarget(16908336, true);
        Fade fade2 = new Fade();
        fade2.excludeTarget(16908335, true);
        fade2.excludeTarget(16908336, true);
        if (mediaViewBaseFragment.A11()) {
            ActivityC004902h A0B = mediaViewBaseFragment.A0B();
            Window window = A0B.getWindow();
            AnonymousClass0TX.A0C(A0B);
            window.setSharedElementEnterTransition(transitionSet);
            window.setSharedElementReturnTransition(transitionSet2);
            window.setEnterTransition(fade);
            window.setReturnTransition(fade2);
            transitionSet.addListener((Transition.TransitionListener) new C57622kb(mediaViewBaseFragment, r13));
            transitionSet2.addListener((Transition.TransitionListener) new C57632kc(r13));
            return;
        }
        mediaViewBaseFragment.A08().A0A = transitionSet;
        mediaViewBaseFragment.A08().A0B = transitionSet2;
        mediaViewBaseFragment.A08().A07 = fade;
        mediaViewBaseFragment.A08().A09 = fade2;
        fade.addListener(new C57622kb(mediaViewBaseFragment, r13));
        fade2.addListener(new C57632kc(r13));
    }
}
