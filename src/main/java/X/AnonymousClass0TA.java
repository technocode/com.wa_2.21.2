package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import com.google.android.search.verification.client.R;
import java.util.ArrayList;

/* renamed from: X.0TA  reason: invalid class name */
public class AnonymousClass0TA extends AnonymousClass0S2 implements AnonymousClass0TB {
    public static final Interpolator A0Q = new AccelerateInterpolator();
    public static final Interpolator A0R = new DecelerateInterpolator();
    public int A00 = 0;
    public Context A01;
    public Context A02;
    public View A03;
    public AnonymousClass0V6 A04;
    public AbstractC06100Rs A05;
    public AbstractC06110Rt A06;
    public C12960jN A07;
    public ActionBarContainer A08;
    public ActionBarContextView A09;
    public ActionBarOverlayLayout A0A;
    public AnonymousClass0TD A0B;
    public ArrayList A0C = new ArrayList();
    public boolean A0D = true;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K = true;
    public boolean A0L;
    public boolean A0M;
    public final AbstractC14990nD A0N = new AnonymousClass23H(this);
    public final AbstractC14990nD A0O = new AnonymousClass23I(this);
    public final AbstractC15000nE A0P = new AnonymousClass1ZG(this);

    public AnonymousClass0TA(Activity activity, boolean z) {
        View decorView = activity.getWindow().getDecorView();
        A0G(decorView);
        if (!z) {
            this.A03 = decorView.findViewById(16908290);
        }
    }

    public AnonymousClass0TA(Dialog dialog) {
        A0G(dialog.getWindow().getDecorView());
    }

    public void A0F(int i, int i2) {
        AnonymousClass0TD r2 = this.A0B;
        int A65 = r2.A65();
        if ((i2 & 4) != 0) {
            this.A0E = true;
        }
        r2.AOC((i & i2) | ((i2 ^ -1) & A65));
    }

    public final void A0G(View view) {
        AnonymousClass0TD wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(R.id.decor_content_parent);
        this.A0A = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        View findViewById = view.findViewById(R.id.action_bar);
        if (findViewById instanceof AnonymousClass0TD) {
            wrapper = (AnonymousClass0TD) findViewById;
        } else if (findViewById instanceof Toolbar) {
            wrapper = ((Toolbar) findViewById).getWrapper();
        } else {
            StringBuilder A0S = AnonymousClass008.A0S("Can't make a decor toolbar out of ");
            A0S.append(findViewById != null ? findViewById.getClass().getSimpleName() : "null");
            throw new IllegalStateException(A0S.toString());
        }
        this.A0B = wrapper;
        this.A09 = (ActionBarContextView) view.findViewById(R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(R.id.action_bar_container);
        this.A08 = actionBarContainer;
        AnonymousClass0TD r1 = this.A0B;
        if (r1 == null || this.A09 == null || actionBarContainer == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("WindowDecorActionBar");
            sb.append(" can only be used with a compatible window decor layout");
            throw new IllegalStateException(sb.toString());
        }
        Context context = r1.getContext();
        this.A01 = context;
        if ((this.A0B.A65() & 4) != 0) {
            this.A0E = true;
        }
        context.getApplicationInfo();
        A0I(context.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs));
        TypedArray obtainStyledAttributes = this.A01.obtainStyledAttributes(null, AnonymousClass0T3.A00, R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.A0A;
            if (actionBarOverlayLayout2.A0F) {
                this.A0I = true;
                actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
            } else {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            AnonymousClass0Q7.A0Q(this.A08, (float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public void A0H(boolean z) {
        C06330Su APU;
        C06330Su A032;
        long j;
        boolean z2 = this.A0M;
        if (z) {
            if (!z2) {
                this.A0M = true;
                A0J(false);
            }
        } else if (z2) {
            this.A0M = false;
            A0J(false);
        }
        if (AnonymousClass0Q7.A0j(this.A08)) {
            if (z) {
                A032 = this.A0B.APU(4, 100);
                APU = this.A09.A03(0, 200);
            } else {
                APU = this.A0B.APU(0, 200);
                A032 = this.A09.A03(8, 100);
            }
            C12960jN r4 = new C12960jN();
            ArrayList arrayList = r4.A05;
            arrayList.add(A032);
            View view = (View) A032.A01.get();
            if (view != null) {
                j = view.animate().getDuration();
            } else {
                j = 0;
            }
            View view2 = (View) APU.A01.get();
            if (view2 != null) {
                view2.animate().setStartDelay(j);
            }
            arrayList.add(APU);
            r4.A01();
        } else if (z) {
            this.A0B.APK(4);
            this.A09.setVisibility(0);
        } else {
            this.A0B.APK(0);
            this.A09.setVisibility(8);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
        if (r2 == false) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0I(boolean r6) {
        /*
            r5 = this;
            r5.A0F = r6
            r1 = 0
            if (r6 != 0) goto L_0x002e
            androidx.appcompat.widget.ActionBarContainer r0 = r5.A08
            r0.setTabContainer(r1)
        L_0x000a:
            X.0TD r4 = r5.A0B
            int r1 = r4.A7c()
            r0 = 2
            r3 = 1
            r2 = 0
            if (r1 != r0) goto L_0x0016
            r2 = 1
        L_0x0016:
            boolean r0 = r5.A0F
            if (r0 != 0) goto L_0x001d
            r0 = 1
            if (r2 != 0) goto L_0x001e
        L_0x001d:
            r0 = 0
        L_0x001e:
            r4.AO2(r0)
            androidx.appcompat.widget.ActionBarOverlayLayout r1 = r5.A0A
            boolean r0 = r5.A0F
            if (r0 != 0) goto L_0x002c
            if (r2 == 0) goto L_0x002c
        L_0x0029:
            r1.A0C = r3
            return
        L_0x002c:
            r3 = 0
            goto L_0x0029
        L_0x002e:
            androidx.appcompat.widget.ActionBarContainer r0 = r5.A08
            r0.setTabContainer(r1)
            goto L_0x000a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0TA.A0I(boolean):void");
    }

    public final void A0J(boolean z) {
        boolean z2;
        View view;
        View view2;
        View view3;
        boolean z3 = this.A0G;
        boolean z4 = this.A0H;
        if (this.A0M || (!z3 && !z4)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (!this.A0K) {
                this.A0K = true;
                C12960jN r0 = this.A07;
                if (r0 != null) {
                    r0.A00();
                }
                this.A08.setVisibility(0);
                if (this.A00 != 0 || (!this.A0L && !z)) {
                    this.A08.setAlpha(1.0f);
                    this.A08.setTranslationY(0.0f);
                    if (this.A0D && (view2 = this.A03) != null) {
                        view2.setTranslationY(0.0f);
                    }
                    this.A0O.ACk(null);
                } else {
                    this.A08.setTranslationY(0.0f);
                    float f = (float) (-this.A08.getHeight());
                    if (z) {
                        int[] iArr = {0, 0};
                        this.A08.getLocationInWindow(iArr);
                        f -= (float) iArr[1];
                    }
                    this.A08.setTranslationY(f);
                    C12960jN r5 = new C12960jN();
                    C06330Su A0E2 = AnonymousClass0Q7.A0E(this.A08);
                    A0E2.A03(0.0f);
                    A0E2.A07(this.A0P);
                    boolean z5 = r5.A03;
                    if (!z5) {
                        r5.A05.add(A0E2);
                    }
                    if (this.A0D && (view3 = this.A03) != null) {
                        view3.setTranslationY(f);
                        C06330Su A0E3 = AnonymousClass0Q7.A0E(this.A03);
                        A0E3.A03(0.0f);
                        z5 = r5.A03;
                        if (!z5) {
                            r5.A05.add(A0E3);
                        }
                    }
                    Interpolator interpolator = A0R;
                    if (!z5) {
                        r5.A01 = interpolator;
                        r5.A00 = 250;
                    }
                    AbstractC14990nD r02 = this.A0O;
                    if (!z5) {
                        r5.A02 = r02;
                    }
                    this.A07 = r5;
                    r5.A01();
                }
                ActionBarOverlayLayout actionBarOverlayLayout = this.A0A;
                if (actionBarOverlayLayout != null) {
                    AnonymousClass0Q7.A0M(actionBarOverlayLayout);
                }
            }
        } else if (this.A0K) {
            this.A0K = false;
            C12960jN r03 = this.A07;
            if (r03 != null) {
                r03.A00();
            }
            if (this.A00 != 0 || (!this.A0L && !z)) {
                this.A0N.ACk(null);
                return;
            }
            this.A08.setAlpha(1.0f);
            this.A08.setTransitioning(true);
            C12960jN r52 = new C12960jN();
            float f2 = (float) (-this.A08.getHeight());
            if (z) {
                int[] iArr2 = {0, 0};
                this.A08.getLocationInWindow(iArr2);
                f2 -= (float) iArr2[1];
            }
            C06330Su A0E4 = AnonymousClass0Q7.A0E(this.A08);
            A0E4.A03(f2);
            A0E4.A07(this.A0P);
            boolean z6 = r52.A03;
            if (!z6) {
                r52.A05.add(A0E4);
            }
            if (this.A0D && (view = this.A03) != null) {
                C06330Su A0E5 = AnonymousClass0Q7.A0E(view);
                A0E5.A03(f2);
                z6 = r52.A03;
                if (!z6) {
                    r52.A05.add(A0E5);
                }
            }
            Interpolator interpolator2 = A0Q;
            if (!z6) {
                r52.A01 = interpolator2;
                r52.A00 = 250;
            }
            AbstractC14990nD r04 = this.A0N;
            if (!z6) {
                r52.A02 = r04;
            }
            this.A07 = r52;
            r52.A01();
        }
    }
}
