package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import com.google.android.search.verification.client.R;

/* renamed from: X.0W4  reason: invalid class name */
public class AnonymousClass0W4 implements View.OnLongClickListener, View.OnAttachStateChangeListener, View.OnHoverListener {
    public static AnonymousClass0W4 A09;
    public static AnonymousClass0W4 A0A;
    public int A00;
    public int A01;
    public C13560kS A02;
    public boolean A03;
    public final int A04;
    public final View A05;
    public final CharSequence A06;
    public final Runnable A07 = new RunnableEBaseShape0S0100000_I0_0(this, 9);
    public final Runnable A08 = new RunnableEBaseShape0S0100000_I0_0(this, 8);

    public void onViewAttachedToWindow(View view) {
    }

    public AnonymousClass0W4(View view, CharSequence charSequence) {
        this.A05 = view;
        this.A06 = charSequence;
        this.A04 = C14960nA.A02(ViewConfiguration.get(view.getContext()));
        this.A00 = Integer.MAX_VALUE;
        this.A01 = Integer.MAX_VALUE;
        this.A05.setOnLongClickListener(this);
        this.A05.setOnHoverListener(this);
    }

    public static void A00(AnonymousClass0W4 r4) {
        AnonymousClass0W4 r0 = A0A;
        if (r0 != null) {
            r0.A05.removeCallbacks(r0.A08);
        }
        A0A = r4;
        if (r4 != null) {
            r4.A05.postDelayed(r4.A08, (long) ViewConfiguration.getLongPressTimeout());
        }
    }

    public void A01() {
        if (A09 == this) {
            A09 = null;
            C13560kS r1 = this.A02;
            if (r1 != null) {
                View view = r1.A02;
                if (view.getParent() != null) {
                    ((WindowManager) r1.A00.getSystemService("window")).removeView(view);
                }
                this.A02 = null;
                this.A00 = Integer.MAX_VALUE;
                this.A01 = Integer.MAX_VALUE;
                this.A05.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (A0A == this) {
            A00(null);
        }
        this.A05.removeCallbacks(this.A07);
    }

    public void A02(boolean z) {
        int height;
        int i;
        long j;
        int longPressTimeout;
        long j2;
        int i2;
        View view = this.A05;
        if (AnonymousClass0Q7.A0i(view)) {
            A00(null);
            AnonymousClass0W4 r0 = A09;
            if (r0 != null) {
                r0.A01();
            }
            A09 = this;
            this.A03 = z;
            C13560kS r12 = new C13560kS(view.getContext());
            this.A02 = r12;
            int i3 = this.A00;
            int i4 = this.A01;
            boolean z2 = this.A03;
            CharSequence charSequence = this.A06;
            View view2 = r12.A02;
            if (!(view2.getParent() == null || view2.getParent() == null)) {
                ((WindowManager) r12.A00.getSystemService("window")).removeView(view2);
            }
            r12.A04.setText(charSequence);
            WindowManager.LayoutParams layoutParams = r12.A03;
            layoutParams.token = view.getApplicationWindowToken();
            Context context = r12.A00;
            int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                i3 = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                height = i4 + dimensionPixelOffset2;
                i = i4 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i = 0;
            }
            layoutParams.gravity = 49;
            Resources resources = context.getResources();
            int i5 = R.dimen.tooltip_y_offset_non_touch;
            if (z2) {
                i5 = R.dimen.tooltip_y_offset_touch;
            }
            int dimensionPixelOffset3 = resources.getDimensionPixelOffset(i5);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
            if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
                Context context2 = view.getContext();
                while (true) {
                    if (!(context2 instanceof ContextWrapper)) {
                        break;
                    } else if (context2 instanceof Activity) {
                        rootView = ((Activity) context2).getWindow().getDecorView();
                        if (rootView == null) {
                            Log.e("TooltipPopup", "Cannot find app view");
                        }
                    } else {
                        context2 = ((ContextWrapper) context2).getBaseContext();
                    }
                }
            }
            Rect rect = r12.A01;
            rootView.getWindowVisibleDisplayFrame(rect);
            if (rect.left < 0 && rect.top < 0) {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("status_bar_height", "dimen", "android");
                if (identifier != 0) {
                    i2 = resources2.getDimensionPixelSize(identifier);
                } else {
                    i2 = 0;
                }
                DisplayMetrics displayMetrics = resources2.getDisplayMetrics();
                rect.set(0, i2, displayMetrics.widthPixels, displayMetrics.heightPixels);
            }
            int[] iArr = r12.A06;
            rootView.getLocationOnScreen(iArr);
            int[] iArr2 = r12.A05;
            view.getLocationOnScreen(iArr2);
            iArr2[0] = iArr2[0] - iArr[0];
            iArr2[1] = iArr2[1] - iArr[1];
            layoutParams.x = (iArr2[0] + i3) - (rootView.getWidth() / 2);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            view2.measure(makeMeasureSpec, makeMeasureSpec);
            int measuredHeight = view2.getMeasuredHeight();
            int i6 = iArr2[1];
            int i7 = ((i6 + i) - dimensionPixelOffset3) - measuredHeight;
            int i8 = i6 + height + dimensionPixelOffset3;
            if (z2) {
                if (i7 >= 0) {
                    layoutParams.y = i7;
                } else {
                    layoutParams.y = i8;
                }
            } else if (measuredHeight + i8 <= rect.height()) {
                layoutParams.y = i8;
            } else {
                layoutParams.y = i7;
            }
            ((WindowManager) context.getSystemService("window")).addView(view2, layoutParams);
            view.addOnAttachStateChangeListener(this);
            if (this.A03) {
                j2 = 2500;
            } else {
                if ((view.getWindowSystemUiVisibility() & 1) == 1) {
                    j = 3000;
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                } else {
                    j = 15000;
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                }
                j2 = j - ((long) longPressTimeout);
            }
            Runnable runnable = this.A07;
            view.removeCallbacks(runnable);
            view.postDelayed(runnable, j2);
        }
    }

    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.A02 != null && this.A03) {
            return false;
        }
        View view2 = this.A05;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view2.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                this.A00 = Integer.MAX_VALUE;
                this.A01 = Integer.MAX_VALUE;
                A01();
            }
        } else if (view2.isEnabled() && this.A02 == null) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int abs = Math.abs(x - this.A00);
            int i = this.A04;
            if (abs <= i && Math.abs(y - this.A01) <= i) {
                return false;
            }
            this.A00 = x;
            this.A01 = y;
            A00(this);
            return false;
        }
        return false;
    }

    public boolean onLongClick(View view) {
        this.A00 = view.getWidth() >> 1;
        this.A01 = view.getHeight() >> 1;
        A02(true);
        return true;
    }

    public void onViewDetachedFromWindow(View view) {
        A01();
    }
}
