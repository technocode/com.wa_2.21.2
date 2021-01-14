package X;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import com.google.android.search.verification.client.R;
import com.whatsapp.mediaview.MediaViewBaseFragment;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: X.2UT  reason: invalid class name */
public abstract class AnonymousClass2UT {
    public static final boolean A00;

    static {
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 22) {
            z = true;
        }
        A00 = z;
    }

    public static Bundle A00(Activity activity, View view) {
        if (view == null) {
            return null;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        A04(activity.getWindow().getDecorView(), arrayList);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        Bundle bundle = new Bundle();
        bundle.putInt("x", iArr[0]);
        bundle.putInt("y", iArr[1]);
        bundle.putInt("width", view.getWidth());
        bundle.putInt("height", view.getHeight());
        bundle.putStringArrayList("visible_shared_elements", arrayList);
        return bundle;
    }

    public static Bundle A01(Activity activity, View view, String str) {
        C14460mJ r0;
        if (!A00) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            r0 = new C29901aO(ActivityOptions.makeSceneTransitionAnimation(activity, view, str));
        } else {
            r0 = new C14460mJ();
        }
        return r0.A01();
    }

    public static View A02(View view, String str) {
        if (str.equals(AnonymousClass0Q7.A0G(view))) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View A02 = A02(viewGroup.getChildAt(i), str);
            if (A02 != null) {
                return A02;
            }
        }
        return null;
    }

    public static void A03(Context context, AnonymousClass1PN r3, Intent intent, View view, String str) {
        Context A0O = C002001d.A0O(context);
        if (!A00 || !(A0O instanceof ActivityC004802g)) {
            context.startActivity(intent);
            if (A0O instanceof ActivityC004802g) {
                ((Activity) A0O).overridePendingTransition(0, 0);
                return;
            }
            return;
        }
        C57652ke.A07((ActivityC004802g) A0O, r3, intent, view, str);
    }

    public static void A04(View view, Collection collection) {
        if (!TextUtils.isEmpty(AnonymousClass0Q7.A0G(view))) {
            collection.add(AnonymousClass0Q7.A0G(view));
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                A04(viewGroup.getChildAt(i), collection);
            }
        }
    }

    public void A08() {
        MediaViewBaseFragment mediaViewBaseFragment = ((C57662kf) this).A06;
        if (mediaViewBaseFragment.A0p() != null) {
            mediaViewBaseFragment.A0B().overridePendingTransition(0, 0);
        }
    }

    public void A09(Bundle bundle) {
        C57662kf r4 = (C57662kf) this;
        MediaViewBaseFragment mediaViewBaseFragment = r4.A06;
        if (mediaViewBaseFragment.A0p() == null) {
            mediaViewBaseFragment.A0t();
            return;
        }
        C60632pq r3 = mediaViewBaseFragment.A09;
        Object A0r = mediaViewBaseFragment.A0r(r3.getCurrentItem());
        if (mediaViewBaseFragment.A02().getConfiguration().orientation != r4.A03 || A0r == null || !A0r.equals(mediaViewBaseFragment.A0q())) {
            r3.setPivotX((float) (r3.getWidth() / 2));
            r3.setPivotY((float) (r3.getHeight() / 2));
            r4.A02 = 0;
            r4.A04 = 0;
        }
        r3.animate().setDuration(240).scaleX(r4.A01).scaleY(r4.A00).translationX((float) r4.A02).translationY((float) r4.A04).alpha(0.0f).setListener(new AnonymousClass2UX(r4));
        ObjectAnimator ofInt = ObjectAnimator.ofInt(r4.A05, "alpha", 255, 0);
        ofInt.setDuration(240L);
        ofInt.setInterpolator(new DecelerateInterpolator());
        ofInt.start();
    }

    public void A0A(AnonymousClass2US r12, Bundle bundle) {
        C57662kf r4 = (C57662kf) this;
        MediaViewBaseFragment mediaViewBaseFragment = r4.A06;
        C60632pq r5 = mediaViewBaseFragment.A09;
        int i = bundle.getInt("x", 0);
        int i2 = bundle.getInt("y", 0);
        int i3 = bundle.getInt("width", 0);
        int i4 = bundle.getInt("height", 0);
        AnonymousClass0S2 A09 = mediaViewBaseFragment.AMs().A09();
        if (A09 != null) {
            if (!(A09 instanceof AnonymousClass0TA)) {
                ((AnonymousClass0TC) A09).A01.APK(8);
            } else {
                AnonymousClass0TA r1 = (AnonymousClass0TA) A09;
                if (!r1.A0G) {
                    r1.A0G = true;
                    r1.A0J(false);
                }
            }
            mediaViewBaseFragment.A0G = false;
            View findViewById = mediaViewBaseFragment.A07().findViewById(R.id.background);
            ColorDrawable colorDrawable = new ColorDrawable(-16777216);
            r4.A05 = colorDrawable;
            findViewById.setBackgroundDrawable(colorDrawable);
            r5.getViewTreeObserver().addOnPreDrawListener(new AnonymousClass2UW(r4, r5, i, i2, i3, i4, r12));
            return;
        }
        throw null;
    }
}
