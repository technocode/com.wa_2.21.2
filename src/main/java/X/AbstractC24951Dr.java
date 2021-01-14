package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import com.google.android.search.verification.client.R;
import java.util.List;

/* renamed from: X.1Dr  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC24951Dr {
    public static final Handler A08 = new Handler(Looper.getMainLooper(), new C24871Dj());
    public static final boolean A09;
    public static final int[] A0A = {R.attr.snackbarStyle};
    public int A00;
    public List A01;
    public final Context A02;
    public final ViewGroup A03;
    public final AccessibilityManager A04;
    public final C24941Dq A05;
    public final AnonymousClass1Ds A06;
    public final AbstractC24961Du A07 = new C36851mz(this);

    static {
        boolean z = false;
        if (Build.VERSION.SDK_INT <= 19) {
            z = true;
        }
        A09 = z;
    }

    public AbstractC24951Dr(ViewGroup viewGroup, View view, AnonymousClass1Ds r9) {
        if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        } else if (r9 != null) {
            this.A03 = viewGroup;
            this.A06 = r9;
            Context context = viewGroup.getContext();
            this.A02 = context;
            C08040aN.A03(context, C08040aN.A00, "Theme.AppCompat");
            LayoutInflater from = LayoutInflater.from(this.A02);
            TypedArray obtainStyledAttributes = this.A02.obtainStyledAttributes(A0A);
            int resourceId = obtainStyledAttributes.getResourceId(0, -1);
            obtainStyledAttributes.recycle();
            C24941Dq r0 = (C24941Dq) from.inflate(resourceId != -1 ? R.layout.mtrl_layout_snackbar : R.layout.design_layout_snackbar, this.A03, false);
            this.A05 = r0;
            r0.addView(view);
            AnonymousClass0Q7.A0V(this.A05, 1);
            AnonymousClass0Q7.A0W(this.A05, 1);
            this.A05.setFitsSystemWindows(true);
            AnonymousClass0Q7.A0e(this.A05, new C36831mx());
            AnonymousClass0Q7.A0d(this.A05, new C36841my(this));
            this.A04 = (AccessibilityManager) this.A02.getSystemService("accessibility");
        } else {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
    }

    public void A00() {
        C24941Dq r2 = this.A05;
        int height = r2.getHeight();
        ViewGroup.LayoutParams layoutParams = r2.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            height += ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }
        if (A09) {
            AnonymousClass0Q7.A0U(r2, height);
        } else {
            r2.setTranslationY((float) height);
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(height, 0);
        valueAnimator.setInterpolator(C08060aP.A02);
        valueAnimator.setDuration(250L);
        valueAnimator.addListener(new C24881Dk(this));
        valueAnimator.addUpdateListener(new C24891Dl(this, height));
        valueAnimator.start();
    }

    public void A01() {
        AnonymousClass1Dw A002 = AnonymousClass1Dw.A00();
        AbstractC24961Du r0 = this.A07;
        synchronized (A002.A03) {
            if (A002.A05(r0)) {
                A002.A04(A002.A00);
            }
        }
        List list = this.A01;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.A01.get(size);
            }
        }
    }

    public void A02(int i) {
        AnonymousClass1Dw A002 = AnonymousClass1Dw.A00();
        AbstractC24961Du r4 = this.A07;
        synchronized (A002.A03) {
            if (A002.A05(r4)) {
                A002.A06(A002.A00, i);
            } else {
                AnonymousClass1Dv r2 = A002.A01;
                boolean z = false;
                if (!(r2 == null || r4 == null || r2.A02.get() != r4)) {
                    z = true;
                }
                if (z) {
                    A002.A06(r2, i);
                }
            }
        }
    }

    public void A03(int i) {
        AnonymousClass1Dw A002 = AnonymousClass1Dw.A00();
        AbstractC24961Du r0 = this.A07;
        synchronized (A002.A03) {
            if (A002.A05(r0)) {
                A002.A00 = null;
                if (A002.A01 != null) {
                    A002.A01();
                }
            }
        }
        List list = this.A01;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                AbstractC24901Dm r4 = (AbstractC24901Dm) this.A01.get(size);
                if (r4 instanceof AnonymousClass3ZQ) {
                    ((AnonymousClass3ZQ) r4).A00.A04 = null;
                } else if (r4 instanceof C59372nX) {
                    C59372nX r42 = (C59372nX) r4;
                    r42.A00.findViewById(R.id.fab).animate().translationY(0.0f).setDuration(200).start();
                    r42.A01.A0D = null;
                }
            }
        }
        C24941Dq r2 = this.A05;
        ViewParent parent = r2.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(r2);
        }
    }
}
