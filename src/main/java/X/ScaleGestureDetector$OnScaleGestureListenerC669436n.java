package X;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import com.google.android.search.verification.client.R;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.36n  reason: invalid class name and case insensitive filesystem */
public class ScaleGestureDetector$OnScaleGestureListenerC669436n extends FrameLayout implements ScaleGestureDetector.OnScaleGestureListener {
    public float A00 = 1.0f;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06 = 0;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public Rect A0B;
    public View A0C;
    public View A0D;
    public View A0E;
    public AbstractC669336m A0F;
    public AnonymousClass374 A0G;
    public boolean A0H;
    public boolean A0I = true;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public int[] A0N;
    public final ScaleGestureDetector A0O;
    public final View A0P;
    public final C15260nl A0Q;
    public final ArrayList A0R = new ArrayList(4);

    public ScaleGestureDetector$OnScaleGestureListenerC669436n(Context context, View view) {
        super(context);
        if (view == null) {
            this.A0P = this;
            view = this;
        } else {
            this.A0P = view;
        }
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        this.A0B = new Rect(i, iArr[1], this.A0P.getWidth() + i, this.A0P.getHeight() + iArr[1]);
        C15260nl r1 = new C15260nl(getContext(), this, new C72363So(this));
        r1.A06 = (int) ((1.0f / 1.0f) * ((float) r1.A06));
        this.A0Q = r1;
        r1.A01 = 2000.0f;
        ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(context, this);
        this.A0O = scaleGestureDetector;
        if (Build.VERSION.SDK_INT >= 19) {
            scaleGestureDetector.setQuickScaleEnabled(false);
        }
        View decorView = C02780Dk.A00(context).getWindow().getDecorView();
        AnonymousClass0Q7.A0e(decorView, new AnonymousClass3SV(this));
        AnonymousClass0Q7.A0M(decorView);
    }

    public static int A00(ScaleGestureDetector$OnScaleGestureListenerC669436n r2, int i) {
        return r2.A06(i) + (r2.getRightOfDraggableArea() - i);
    }

    public static int A01(ScaleGestureDetector$OnScaleGestureListenerC669436n r2, int i) {
        return r2.getLeftOfDraggableArea() - r2.A06(i);
    }

    public final int A02(int i) {
        int i2 = this.A04;
        int leftOfDraggableArea = getLeftOfDraggableArea();
        int A062 = A06(i);
        int i3 = leftOfDraggableArea - A062;
        int rightOfDraggableArea = A062 + (getRightOfDraggableArea() - i);
        if (i2 > (rightOfDraggableArea >> 1) + i3) {
            return rightOfDraggableArea;
        }
        return i3;
    }

    public final int A03(int i) {
        int A052 = A05(i);
        int A042 = A04(i);
        int i2 = this.A05;
        return Math.abs(i2 - A052) >= Math.abs(i2 - A042) ? A042 : A052;
    }

    public final int A04(int i) {
        int A072 = A07(i);
        return Math.max(A072 + (getBottomOfDraggableArea() - i), getTopOfDraggableArea() - A072);
    }

    public final int A05(int i) {
        int A072 = A07(i);
        return Math.min(A072 + (getBottomOfDraggableArea() - i), getTopOfDraggableArea() - A072);
    }

    public final int A06(int i) {
        return (int) (((1.0f - this.A00) * ((float) i)) / 2.0f);
    }

    public final int A07(int i) {
        return (int) (((1.0f - this.A00) * ((float) i)) / 2.0f);
    }

    public /* synthetic */ C06730Um A08(View view, C06730Um r8) {
        if (this.A0K) {
            View view2 = this.A0D;
            if (view2 != null) {
                view2.setPadding(r8.A02(), this.A0D.getPaddingTop(), r8.A03(), this.A0D.getPaddingBottom());
            }
            C06730Um A0F2 = AnonymousClass0Q7.A0F(view, r8);
            return A0F2.A05(0, A0F2.A04(), 0, A0F2.A01());
        }
        View view3 = this.A0D;
        if (view3 != null) {
            view3.setPadding(0, 0, 0, 0);
        }
        return AnonymousClass0Q7.A0F(view, r8);
    }

    public void A09() {
        int[] iArr = new int[2];
        View view = this.A0P;
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        this.A0B = new Rect(i, iArr[1], view.getWidth() + i, view.getHeight() + iArr[1]);
    }

    public final void A0A(float f) {
        if (this.A0C != null) {
            Iterator it = this.A0R.iterator();
            while (it.hasNext()) {
                View view = (View) it.next();
                try {
                    int i = ((FrameLayout.LayoutParams) view.getLayoutParams()).gravity;
                    if ((i & 48) == 48) {
                        view.setPivotY(0.0f);
                        view.setPadding(view.getPaddingLeft(), (int) (((float) this.A06) * f), view.getPaddingRight(), view.getPaddingBottom());
                    }
                    if ((i & 80) == 80) {
                        view.setPivotY((float) view.getMeasuredHeight());
                        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), (int) (((float) this.A06) * f));
                    }
                    if ((i & 8388611) == 8388611) {
                        view.setPivotX(0.0f);
                        view.setPadding((int) (((float) this.A06) * f), view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
                    }
                    if ((i & 8388613) == 8388613) {
                        view.setPivotX((float) view.getMeasuredWidth());
                        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), (int) (((float) this.A06) * f), view.getPaddingBottom());
                    }
                } catch (Exception unused) {
                }
                float f2 = 1.0f / f;
                view.setScaleX(f2);
                view.setScaleY(f2);
            }
        }
    }

    public void A0B(boolean z) {
        if (this.A0C != null && !this.A0H) {
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC669236l(this, viewTreeObserver, z));
            requestLayout();
        }
    }

    public void computeScroll() {
        super.computeScroll();
        if (this.A0Q.A0B()) {
            postInvalidateOnAnimation();
        }
    }

    public void dispatchDraw(Canvas canvas) {
        if (this.A0I) {
            canvas.clipRect(this.A0B);
        }
        super.dispatchDraw(canvas);
    }

    private int getBottomOfDraggableArea() {
        return this.A0B.bottom - this.A01;
    }

    public float getCurrentChildScale() {
        return this.A00;
    }

    private int getLeftOfDraggableArea() {
        return this.A01 + this.A0B.left;
    }

    private int getRightOfDraggableArea() {
        return this.A0B.right - this.A01;
    }

    private int getTopOfDraggableArea() {
        return this.A01 + this.A0B.top;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.A0Q.A0G(motionEvent) || super.onInterceptTouchEvent(motionEvent);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View view = this.A0C;
        if (view != null && !this.A0K) {
            if (!this.A0H) {
                view.setScaleX(this.A00);
                this.A0C.setScaleY(this.A00);
            }
            View view2 = this.A0C;
            int i5 = this.A04;
            view2.layout(i5, this.A05, view2.getWidth() + i5, this.A0C.getHeight() + this.A05);
        }
    }

    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        if (this.A0C == null) {
            return false;
        }
        float scaleFactor = this.A00 * scaleGestureDetector.getScaleFactor();
        this.A00 = scaleFactor;
        float f = scaleFactor;
        if (scaleFactor > 1.0f) {
            this.A00 = 1.0f;
            f = 1.0f;
        } else if (scaleFactor < 0.67f) {
            this.A00 = 0.67f;
            f = 0.67f;
        }
        this.A0C.setScaleX(f);
        this.A0C.setScaleY(this.A00);
        A0A(this.A00);
        return true;
    }

    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        return this.A0C != null;
    }

    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        View view = this.A0C;
        if (view != null) {
            if (this.A0K) {
                if (this.A00 <= 0.85f) {
                    this.A0J = true;
                    AbstractC669336m r0 = this.A0F;
                    if (r0 != null) {
                        r0.AFC(true);
                    }
                    AnonymousClass374 r5 = this.A0G;
                    if (!(r5 == null || r5.A05 == null)) {
                        r5.A0D(0, getResources().getColor(R.color.black));
                        this.A0G.setPlayerElevation(6);
                        this.A0G.setVisibility(0);
                    }
                }
                this.A0C.animate().scaleX(this.A00).scaleY(this.A00).setDuration(125);
            } else {
                int i = (this.A00 > 0.85f ? 1 : (this.A00 == 0.85f ? 0 : -1));
                ViewPropertyAnimator animate = view.animate();
                if (i <= 0) {
                    animate.scaleX(0.67f).scaleY(0.67f).setDuration(125);
                    this.A00 = 0.67f;
                } else {
                    animate.scaleX(1.0f).scaleY(1.0f).setDuration(125);
                    this.A00 = 1.0f;
                }
            }
            this.A0C.setScaleX(this.A00);
            this.A0C.setScaleY(this.A00);
            A0A(this.A00);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0078, code lost:
        if (r8.getY() <= ((float) ((r7.A0C.getHeight() + r7.A05) - A07(r7.A0C.getHeight())))) goto L_0x007a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
        // Method dump skipped, instructions count: 140
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ScaleGestureDetector$OnScaleGestureListenerC669436n.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void onViewAdded(View view) {
        super.onViewAdded(view);
        View view2 = this.A0C;
        if (view2 != null) {
            removeView(view2);
        }
        this.A0E = null;
        this.A0C = view;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.A0C, "scaleX", this.A00), ObjectAnimator.ofFloat(this.A0C, "scaleY", this.A00), ObjectAnimator.ofFloat(this.A0C, "translationX", 0.0f), ObjectAnimator.ofFloat(this.A0C, "translationY", 0.0f), ObjectAnimator.ofFloat(this.A0C, "alpha", 0.0f, 1.0f));
        animatorSet.setInterpolator(new AccelerateInterpolator());
        animatorSet.setDuration(130L);
        animatorSet.addListener(new C669136k(this));
        animatorSet.start();
        int[] iArr = this.A0N;
        if (iArr != null) {
            for (int i : iArr) {
                View findViewById = this.A0C.findViewById(i);
                if (findViewById != null) {
                    this.A0R.add(findViewById);
                }
            }
        }
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.A0R.clear();
        this.A0C = null;
    }

    public boolean performClick() {
        super.performClick();
        return true;
    }

    public void setChildPadding(int i) {
        this.A01 = i;
    }

    public void setClipToDependentView(boolean z) {
        this.A0I = z;
    }

    public void setControlView(AnonymousClass374 r2) {
        this.A0G = r2;
        this.A0D = r2.findViewById(R.id.header);
    }

    public void setDismissListener(AbstractC669336m r1) {
        this.A0F = r1;
    }

    public void setExitingFullScreen(boolean z) {
        this.A0J = z;
    }

    public void setFullscreen(boolean z) {
        this.A0K = z;
    }

    public void setLockChild(boolean z) {
        this.A0M = z;
    }
}
