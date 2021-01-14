package X;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewParent;
import com.google.android.search.verification.client.R;

/* renamed from: X.3So  reason: invalid class name and case insensitive filesystem */
public class C72363So extends AbstractC15250nk {
    public final /* synthetic */ ScaleGestureDetector$OnScaleGestureListenerC669436n A00;

    @Override // X.AbstractC15250nk
    public int A02(View view, int i, int i2) {
        return i;
    }

    @Override // X.AbstractC15250nk
    public int A03(View view, int i, int i2) {
        return i;
    }

    public C72363So(ScaleGestureDetector$OnScaleGestureListenerC669436n r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC15250nk
    public int A00(View view) {
        return view.getWidth();
    }

    @Override // X.AbstractC15250nk
    public int A01(View view) {
        return view.getHeight();
    }

    @Override // X.AbstractC15250nk
    public void A04(View view, float f, float f2) {
        int A01;
        boolean z;
        int A05;
        AnonymousClass37M r0;
        AnonymousClass374 r4;
        int width;
        int height;
        ScaleGestureDetector$OnScaleGestureListenerC669436n r2 = this.A00;
        View view2 = r2.A0C;
        if (view2 != null && view2 == view) {
            if (Math.abs(f) > Math.abs(f2)) {
                if (Math.abs(f / f2) >= 3.0f) {
                    f2 = 0.0f;
                }
            } else if (Math.abs(f2 / f) >= 3.0f) {
                f = 0.0f;
            }
            if (f == 0.0f) {
                A01 = r2.A02(view.getWidth());
                z = false;
            } else {
                int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
                int width2 = view.getWidth();
                if (i > 0) {
                    A01 = ScaleGestureDetector$OnScaleGestureListenerC669436n.A00(r2, width2);
                } else {
                    A01 = ScaleGestureDetector$OnScaleGestureListenerC669436n.A01(r2, width2);
                }
                z = true;
            }
            if (f2 == 0.0f) {
                A05 = r2.A03(view.getHeight());
            } else {
                int i2 = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
                int height2 = view.getHeight();
                if (i2 > 0) {
                    A05 = r2.A04(height2);
                } else {
                    A05 = r2.A05(height2);
                }
                z = true;
            }
            DisplayMetrics displayMetrics = r2.getResources().getDisplayMetrics();
            float f3 = displayMetrics.density;
            boolean z2 = false;
            if (((float) Math.abs(A01 - r2.A07)) <= f3) {
                z2 = true;
            }
            boolean z3 = false;
            if (((float) Math.abs(A05 - r2.A08)) <= f3) {
                z3 = true;
            }
            if (z || view.getTop() > displayMetrics.heightPixels / 3) {
                if (r2.A0K) {
                    r2.A0J = true;
                    AbstractC669336m r02 = r2.A0F;
                    if (r02 != null) {
                        r02.AFC(true);
                    }
                } else if (z && ((z2 && z3) || ((z2 && Math.abs(f) >= 6000.0f) || (z3 && Math.abs(f2) >= 6000.0f)))) {
                    r2.A0E = view;
                    r2.A0L = true;
                    if (f == 0.0f) {
                        width = (int) view.getX();
                    } else {
                        width = f > 0.0f ? view.getWidth() + r2.getWidth() : view.getHeight() * -2;
                    }
                    if (f2 == 0.0f) {
                        height = (int) view.getY();
                    } else {
                        height = f2 > 0.0f ? view.getHeight() + r2.getHeight() : view.getHeight() * -2;
                    }
                    r2.A0Q.A0J(view, width, height);
                    r2.postOnAnimation(new RunnableEBaseShape13S0100000_I1_8(this, 26));
                }
                r4 = r2.A0G;
                if (r4 != null && r4.A05 != null) {
                    r4.A0D(0, r2.getResources().getColor(R.color.black));
                    r2.A0G.setPlayerElevation(6);
                    r2.A0G.setVisibility(0);
                    return;
                }
            }
            boolean z4 = r2.A0K;
            C15260nl r1 = r2.A0Q;
            if (!z4) {
                r1.A0E(A01, A05);
                r2.A04 = A01;
                r2.A05 = A05;
                r2.invalidate();
            } else {
                r1.A0E(0, 0);
                AnonymousClass374 r03 = r2.A0G;
                if (!(r03 == null || (r0 = r03.A05) == null || !r0.A0B())) {
                    r2.A0G.A0C(100);
                }
                r2.A04 = 0;
                r2.A05 = 0;
                r2.invalidate();
            }
            r4 = r2.A0G;
            if (r4 != null) {
            }
        }
    }

    @Override // X.AbstractC15250nk
    public void A05(View view, int i) {
        AnonymousClass374 r2;
        ViewParent parent = view.getParent();
        ScaleGestureDetector$OnScaleGestureListenerC669436n r3 = this.A00;
        r3.A07 = r3.A04;
        r3.A08 = r3.A05;
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        if (r3.A0K && (r2 = r3.A0G) != null && r2.A05 != null) {
            r2.A0D(r3.getResources().getColor(R.color.black), 0);
            r3.A0G.setPlayerElevation(0);
            r3.A0G.setVisibility(8);
            if (r3.A0G.A05.A0B()) {
                r3.A0G.A06();
            }
        }
    }

    @Override // X.AbstractC15250nk
    public void A06(View view, int i, int i2, int i3, int i4) {
        ScaleGestureDetector$OnScaleGestureListenerC669436n r2 = this.A00;
        if (r2.A0Q.A03 == 1 && !r2.A0L) {
            r2.A05 = view.getTop();
            r2.A04 = view.getLeft();
        }
    }

    @Override // X.AbstractC15250nk
    public boolean A07(View view, int i) {
        ScaleGestureDetector$OnScaleGestureListenerC669436n r1 = this.A00;
        View view2 = r1.A0C;
        return view2 != null && view == view2 && !r1.A0M;
    }

    public /* synthetic */ void A08() {
        AbstractC669336m r1;
        ScaleGestureDetector$OnScaleGestureListenerC669436n r2 = this.A00;
        View view = r2.A0E;
        if (view != null && r2.A0C == view && (r1 = r2.A0F) != null) {
            r2.A0E = null;
            r1.AFC(false);
        }
    }
}
