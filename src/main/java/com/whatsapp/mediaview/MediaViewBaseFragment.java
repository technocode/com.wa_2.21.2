package com.whatsapp.mediaview;

import X.AbstractC07270Wu;
import X.ActivityC004602e;
import X.ActivityC004902h;
import X.AnonymousClass008;
import X.AnonymousClass03S;
import X.AnonymousClass0M3;
import X.AnonymousClass0Q7;
import X.AnonymousClass1NA;
import X.AnonymousClass1PN;
import X.AnonymousClass1S6;
import X.AnonymousClass2U9;
import X.AnonymousClass2UI;
import X.AnonymousClass2US;
import X.AnonymousClass2UT;
import X.C004302a;
import X.C02780Dk;
import X.C08500bE;
import X.C14270lr;
import X.C57512kQ;
import X.C57652ke;
import X.C57662kf;
import X.C60632pq;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.redex.ViewOnClickEBaseShape6S0100000_I1_4;
import com.facebook.redex.ViewOnClickEBaseShape7S0100000_I1_5;
import com.google.android.search.verification.client.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.base.WaFragment;
import com.whatsapp.biz.catalog.CatalogMediaViewFragment;
import com.whatsapp.gesture.VerticalSwipeDismissBehavior;
import com.whatsapp.util.Log;

public abstract class MediaViewBaseFragment extends WaFragment implements AnonymousClass2US, AnonymousClass1NA {
    public static final boolean A0H;
    public Rect A00;
    public Bundle A01;
    public View A02;
    public View A03;
    public ViewGroup A04;
    public TextView A05;
    public Toolbar A06;
    public TextEmojiLabel A07;
    public C08500bE A08;
    public C60632pq A09;
    public AnonymousClass2US A0A;
    public AnonymousClass2UT A0B;
    public OutOfMemoryError A0C;
    public Runnable A0D;
    public boolean A0E = false;
    public boolean A0F = false;
    public boolean A0G = true;

    static {
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 21) {
            z = true;
        }
        A0H = z;
    }

    public static void A00(Activity activity, boolean z) {
        int i = 1280;
        if (!z) {
            i = 1285;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            i |= 2048;
        }
        if (A0H) {
            i |= 512;
            if (!z) {
                i |= 2;
            }
        }
        activity.getWindow().getDecorView().setSystemUiVisibility(i);
    }

    @Override // X.AnonymousClass037
    public void A0X() {
        this.A04.removeView(this.A09);
        this.A04 = null;
        this.A0U = true;
    }

    @Override // X.AnonymousClass037
    public View A0Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        try {
            return layoutInflater.inflate(R.layout.media_view, viewGroup, false);
        } catch (OutOfMemoryError e) {
            this.A0C = e;
            return null;
        }
    }

    @Override // X.AnonymousClass037
    public void A0a(Context context) {
        super.A0a(context);
        C02780Dk.A04(A0B().getWindow());
    }

    @Override // X.AnonymousClass037
    public void A0c() {
        if (this.A09 != null) {
            for (int i = 0; i < this.A09.getChildCount(); i++) {
                View childAt = this.A09.getChildAt(i);
                if (childAt instanceof FrameLayout) {
                    int i2 = 0;
                    while (true) {
                        ViewGroup viewGroup = (ViewGroup) childAt;
                        if (i2 >= viewGroup.getChildCount()) {
                            break;
                        }
                        View childAt2 = viewGroup.getChildAt(i2);
                        if (childAt2 instanceof PhotoView) {
                            ((PhotoView) childAt2).A01();
                        }
                        i2++;
                    }
                }
            }
        }
        this.A0U = true;
    }

    @Override // X.AnonymousClass037
    public void A0e() {
        this.A0U = true;
        A0x();
        A10(true, true);
    }

    @Override // X.AnonymousClass037
    public void A0i(Bundle bundle) {
        AnonymousClass1PN r1;
        AnonymousClass2UT r0;
        A0x();
        super.A0i(bundle);
        if (!(this instanceof MediaViewFragment)) {
            r1 = ((CatalogMediaViewFragment) this).A06;
        } else {
            r1 = ((MediaViewFragment) this).A0i;
        }
        if (AnonymousClass2UT.A00) {
            r0 = new C57652ke(r1, this);
        } else {
            r0 = new C57662kf(this);
        }
        this.A0B = r0;
        this.A09 = new C60632pq(this, A01());
        Bundle bundle2 = super.A06;
        if (bundle2 == null) {
            A0t();
        } else {
            this.A01 = bundle2.getBundle("animation_bundle");
        }
    }

    @Override // X.AnonymousClass037
    public void A0l(View view, Bundle bundle) {
        if (A0H) {
            A0B().getWindow().getDecorView().setSystemUiVisibility(1792);
            view.findViewById(R.id.media_view_layout).setOnApplyWindowInsetsListener(new AnonymousClass2U9(this));
        } else {
            A0B().getWindow().getDecorView().setSystemUiVisibility(1280);
        }
        Toolbar toolbar = (Toolbar) AnonymousClass0Q7.A0D(A07(), R.id.toolbar);
        this.A06 = toolbar;
        toolbar.A09();
        AMs().A0C(this.A06);
        this.A06.setBackgroundDrawable(new ColorDrawable(C004302a.A00(A01(), R.color.media_view_action_bar_background)));
        AMs().A09().A0D(false);
        AMs().A09().A0A(true);
        this.A06.setNavigationOnClickListener(new ViewOnClickEBaseShape7S0100000_I1_5(this, 0));
        View inflate = LayoutInflater.from(AMs().A09().A01()).inflate(R.layout.media_view_actionbar, (ViewGroup) null, false);
        View findViewById = inflate.findViewById(R.id.title_holder);
        findViewById.setClickable(true);
        findViewById.setOnClickListener(new ViewOnClickEBaseShape6S0100000_I1_4(this, 49));
        this.A07 = (TextEmojiLabel) findViewById.findViewById(R.id.contact_name);
        this.A05 = (TextView) findViewById.findViewById(R.id.date_time);
        this.A02 = inflate.findViewById(R.id.progress_bar);
        AMs().A09().A0B(true);
        AMs().A09().A05(inflate);
        this.A03 = view.findViewById(R.id.title_protection);
        ViewGroup viewGroup = (ViewGroup) AnonymousClass0Q7.A0D(view, R.id.pager_container);
        this.A04 = viewGroup;
        viewGroup.addView(this.A09);
        View findViewById2 = view.findViewById(R.id.background);
        findViewById2.setBackgroundDrawable(new ColorDrawable(-16777216));
        AnonymousClass1 r1 = new VerticalSwipeDismissBehavior(A01()) {
            /* class com.whatsapp.mediaview.MediaViewBaseFragment.AnonymousClass1 */

            /* JADX WARNING: Code restructure failed: missing block: B:5:0x001e, code lost:
                if (r1 == false) goto L_0x0020;
             */
            @Override // com.whatsapp.gesture.VerticalSwipeDismissBehavior, X.AbstractC07570Yg
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean A05(androidx.coordinatorlayout.widget.CoordinatorLayout r3, android.view.View r4, android.view.MotionEvent r5) {
                /*
                    r2 = this;
                    int r1 = r5.getPointerCount()
                    r0 = 1
                    if (r1 > r0) goto L_0x0028
                    com.whatsapp.mediaview.MediaViewBaseFragment r1 = com.whatsapp.mediaview.MediaViewBaseFragment.this
                    X.2pq r0 = r1.A09
                    int r0 = r0.getCurrentItem()
                    java.lang.Object r0 = r1.A0r(r0)
                    com.whatsapp.mediaview.PhotoView r0 = r1.A0o(r0)
                    if (r0 == 0) goto L_0x0020
                    boolean r1 = r0.A0A()
                    r0 = 1
                    if (r1 != 0) goto L_0x0021
                L_0x0020:
                    r0 = 0
                L_0x0021:
                    if (r0 != 0) goto L_0x0028
                    boolean r0 = super.A05(r3, r4, r5)
                    return r0
                L_0x0028:
                    X.0nl r0 = r2.A05
                    if (r0 == 0) goto L_0x002f
                    r0.A02()
                L_0x002f:
                    r0 = 0
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediaview.MediaViewBaseFragment.AnonymousClass1.A05(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
            }
        };
        r1.A02 = 0.5f;
        r1.A0B = true;
        r1.A06 = new C57512kQ(this, findViewById2);
        ((C14270lr) view.findViewById(R.id.pager_container).getLayoutParams()).A00(r1);
        onConfigurationChanged(A02().getConfiguration());
    }

    public PhotoView A0n(ViewGroup viewGroup) {
        PhotoView A0n;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof PhotoView) {
                return (PhotoView) childAt;
            }
            if ((childAt instanceof ViewGroup) && (A0n = A0n((ViewGroup) childAt)) != null) {
                return A0n;
            }
        }
        return null;
    }

    public PhotoView A0o(Object obj) {
        if (obj == null) {
            return null;
        }
        View findViewWithTag = this.A09.findViewWithTag(obj);
        if (findViewWithTag instanceof ViewGroup) {
            return A0n((ViewGroup) findViewWithTag);
        }
        return null;
    }

    public Object A0p() {
        if (!(this instanceof MediaViewFragment)) {
            return ((CatalogMediaViewFragment) this).A04;
        }
        AnonymousClass0M3 r0 = ((MediaViewFragment) this).A0J;
        if (r0 == null) {
            return null;
        }
        return r0.A0n;
    }

    public Object A0q() {
        if (this instanceof MediaViewFragment) {
            return ((MediaViewFragment) this).A0I;
        }
        CatalogMediaViewFragment catalogMediaViewFragment = (CatalogMediaViewFragment) this;
        return AnonymousClass1S6.A01(catalogMediaViewFragment.A02.A06, catalogMediaViewFragment.A00);
    }

    public Object A0r(int i) {
        AnonymousClass0M3 A7O;
        if (!(this instanceof MediaViewFragment)) {
            return AnonymousClass1S6.A01(((CatalogMediaViewFragment) this).A02.A06, i);
        }
        AnonymousClass2UI r0 = ((MediaViewFragment) this).A0G;
        if (r0 == null || (A7O = r0.A7O(i)) == null) {
            return null;
        }
        return A7O.A0n;
    }

    public void A0s() {
        AbstractC07270Wu r0 = (AbstractC07270Wu) A0A();
        if (r0 != null) {
            r0.AFB();
        }
        Bundle bundle = this.A01;
        if (bundle != null) {
            this.A0E = true;
            this.A0B.A09(bundle);
            return;
        }
        A0t();
    }

    public void A0t() {
        ActivityC004902h A0A2 = A0A();
        if (A0A2 != null && !A0A2.isFinishing()) {
            if (A0B() instanceof AbstractC07270Wu) {
                ((AbstractC07270Wu) A0B()).AHi();
                return;
            }
            StringBuilder A0S = AnonymousClass008.A0S("mediaview/finish called from non-host activity: ");
            A0S.append(A0B().getLocalClassName());
            Log.e(A0S.toString());
            A0B().finish();
        }
    }

    public void A0u() {
        C08500bE r0;
        if (A0A() != null && (r0 = this.A08) != null) {
            r0.A06();
        }
    }

    public void A0v() {
        if (!(this instanceof MediaViewFragment)) {
            A0s();
            return;
        }
        MediaViewFragment mediaViewFragment = (MediaViewFragment) this;
        RunnableEBaseShape0S0310000_I0 runnableEBaseShape0S0310000_I0 = mediaViewFragment.A0O;
        if (runnableEBaseShape0S0310000_I0 != null) {
            runnableEBaseShape0S0310000_I0.A03 = true;
            ((Thread) runnableEBaseShape0S0310000_I0.A02).interrupt();
            mediaViewFragment.A0O = null;
        }
        AnonymousClass2UI r0 = mediaViewFragment.A0G;
        if (r0 != null) {
            r0.AQE();
        }
        mediaViewFragment.A0s();
    }

    public void A0w() {
    }

    public final void A0x() {
        AnonymousClass03S r0;
        if (!this.A0F) {
            Context A012 = A01();
            if (!(this instanceof MediaViewFragment)) {
                r0 = ((CatalogMediaViewFragment) this).A09;
            } else {
                r0 = ((MediaViewFragment) this).A0u;
            }
            if (!RequestPermissionActivity.A0N(A012, r0)) {
                this.A0F = true;
                A0t();
            }
        }
    }

    public void A0y(View view) {
        View view2;
        Log.d("mediaview/setWindowInsets");
        if (this.A00 != null) {
            ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.footerView);
            if (viewGroup != null || (viewGroup = (ViewGroup) view.findViewById(R.id.footer)) != null) {
                View findViewById = viewGroup.findViewById(R.id.caption);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
                int i = A02().getConfiguration().orientation;
                if (findViewById == null) {
                    viewGroup.setPadding(viewGroup.getPaddingLeft(), viewGroup.getPaddingTop(), viewGroup.getPaddingRight(), 0);
                    View findViewWithTag = viewGroup.findViewWithTag("navigation_protection");
                    if (i == 1) {
                        if (findViewWithTag == null) {
                            view2 = new View(A01());
                        } else {
                            view2 = findViewWithTag;
                        }
                        view2.setBackgroundColor(C004302a.A00(A01(), R.color.media_view_footer_background));
                        view2.setTag("navigation_protection");
                        view2.setLayoutParams(new LinearLayout.LayoutParams(-1, this.A00.bottom));
                        if (findViewWithTag == null) {
                            viewGroup.addView(view2);
                        }
                    } else if (findViewWithTag != null) {
                        viewGroup.removeViewInLayout(findViewWithTag);
                    }
                    View findViewById2 = viewGroup.findViewById(R.id.footer_padding_bottom);
                    if (findViewById2 != null) {
                        findViewById2.setVisibility(8);
                    }
                } else if (i == 1) {
                    viewGroup.setPadding(0, viewGroup.getPaddingTop(), 0, this.A00.bottom);
                } else if (i == 2) {
                    viewGroup.setPadding(0, 0, 0, 0);
                }
                Rect rect = this.A00;
                layoutParams.leftMargin = rect.left;
                layoutParams.rightMargin = rect.right;
                viewGroup.setLayoutParams(layoutParams);
            }
        }
    }

    public void A0z(boolean z, int i) {
        AlphaAnimation alphaAnimation;
        int childCount = this.A09.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View findViewById = this.A09.getChildAt(i2).findViewById(R.id.footer);
            int visibility = findViewById.getVisibility();
            if (z) {
                if (visibility != 0) {
                    alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                    findViewById.setVisibility(0);
                }
            } else if (visibility != 4) {
                alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                findViewById.setVisibility(4);
            }
            if (i > 0) {
                alphaAnimation.setDuration((long) i);
                findViewById.startAnimation(alphaAnimation);
            }
        }
    }

    public void A10(boolean z, boolean z2) {
        ActivityC004902h A0A2;
        if (!this.A0E && this.A0G != z) {
            this.A0G = z;
            A0z(z, 400);
            if (z) {
                AlphaAnimation A022 = AnonymousClass008.A02(0.0f, 1.0f, 250);
                if (this.A03.getVisibility() != 0) {
                    this.A03.setVisibility(0);
                    this.A03.startAnimation(A022);
                }
                if (this.A06.getVisibility() != 0) {
                    this.A06.setVisibility(0);
                    this.A06.startAnimation(A022);
                }
            } else {
                AlphaAnimation A023 = AnonymousClass008.A02(1.0f, 0.0f, 250);
                if (this.A03.getVisibility() != 4) {
                    this.A03.setVisibility(4);
                    this.A03.startAnimation(A023);
                }
                if (this.A06.getVisibility() != 4) {
                    this.A06.setVisibility(4);
                    this.A06.startAnimation(A023);
                }
            }
            if (z2 && (A0A2 = A0A()) != null) {
                A00(A0A2, this.A0G);
            }
        }
    }

    public boolean A11() {
        ActivityC004902h A0A2 = A0A();
        return (A0A2 instanceof AbstractC07270Wu) && ((AbstractC07270Wu) A0A2).APe();
    }

    @Override // X.AnonymousClass2US
    public void ALF(boolean z) {
        Runnable runnable = this.A0D;
        if (runnable != null && z) {
            runnable.run();
        }
        this.A0E = false;
        AnonymousClass2US r0 = this.A0A;
        if (r0 != null) {
            r0.ALF(z);
            this.A0A = null;
        }
    }

    @Override // X.AnonymousClass1NA
    public ActivityC004602e AMs() {
        return (ActivityC004602e) A0B();
    }

    @Override // X.AnonymousClass037
    public void onConfigurationChanged(Configuration configuration) {
        this.A0U = true;
        if (A0H) {
            A0B().getWindow().setStatusBarColor(C004302a.A00(A01(), R.color.media_view_status_bar_background));
            int i = configuration.orientation;
            if (i == 2) {
                A0B().getWindow().setNavigationBarColor(C004302a.A00(A01(), R.color.media_view_footer_background));
            } else if (i == 1) {
                A0B().getWindow().setNavigationBarColor(C004302a.A00(A01(), 17170445));
            }
            A0B().getWindow().addFlags(EditorInfoCompat.IME_FLAG_FORCE_ASCII);
        }
    }
}
