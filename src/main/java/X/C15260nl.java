package X;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.util.Arrays;

/* renamed from: X.0nl  reason: invalid class name and case insensitive filesystem */
public class C15260nl {
    public static final Interpolator A0L = new animation.InterpolatorC15240nj();
    public float A00;
    public float A01;
    public int A02 = -1;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public VelocityTracker A07;
    public View A08;
    public OverScroller A09;
    public boolean A0A;
    public float[] A0B;
    public float[] A0C;
    public float[] A0D;
    public float[] A0E;
    public int[] A0F;
    public int[] A0G;
    public int[] A0H;
    public final ViewGroup A0I;
    public final AbstractC15250nk A0J;
    public final Runnable A0K = new RunnableEBaseShape5S0100000_I1_0(this, 12);

    public C15260nl(Context context, ViewGroup viewGroup, AbstractC15250nk r6) {
        if (r6 != null) {
            this.A0I = viewGroup;
            this.A0J = r6;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.A04 = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.A06 = viewConfiguration.getScaledTouchSlop();
            this.A00 = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.A01 = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.A09 = new OverScroller(context, A0L);
            return;
        }
        throw new IllegalArgumentException("Callback may not be null");
    }

    public final int A00(int i, int i2, int i3) {
        int i4;
        if (i == 0) {
            return 0;
        }
        int width = this.A0I.getWidth();
        float abs = (float) Math.abs(i);
        float f = (float) (width >> 1);
        float sin = (((float) Math.sin((double) ((Math.min(1.0f, abs / ((float) width)) - 0.5f) * 0.47123894f))) * f) + f;
        int abs2 = Math.abs(i2);
        if (abs2 > 0) {
            i4 = Math.round(Math.abs(sin / ((float) abs2)) * 1000.0f) << 2;
        } else {
            i4 = (int) (((abs / ((float) i3)) + 1.0f) * 256.0f);
        }
        return Math.min(i4, 600);
    }

    public View A01(int i, int i2) {
        ViewGroup viewGroup = this.A0I;
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            if (this.A0J != null) {
                View childAt = viewGroup.getChildAt(childCount);
                if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                    return childAt;
                }
            } else {
                throw null;
            }
        }
        return null;
    }

    public void A02() {
        this.A02 = -1;
        float[] fArr = this.A0B;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.A0C, 0.0f);
            Arrays.fill(this.A0D, 0.0f);
            Arrays.fill(this.A0E, 0.0f);
            Arrays.fill(this.A0H, 0);
            Arrays.fill(this.A0F, 0);
            Arrays.fill(this.A0G, 0);
            this.A05 = 0;
        }
        VelocityTracker velocityTracker = this.A07;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.A07 = null;
        }
    }

    public final void A03() {
        this.A07.computeCurrentVelocity(SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS, this.A00);
        float xVelocity = this.A07.getXVelocity(this.A02);
        float f = this.A01;
        float f2 = this.A00;
        float abs = Math.abs(xVelocity);
        if (abs < f) {
            xVelocity = 0.0f;
        } else if (abs > f2) {
            if (xVelocity <= 0.0f) {
                f2 = -f2;
            }
            xVelocity = f2;
        }
        float yVelocity = this.A07.getYVelocity(this.A02);
        float f3 = this.A01;
        float f4 = this.A00;
        float abs2 = Math.abs(yVelocity);
        if (abs2 < f3) {
            yVelocity = 0.0f;
        } else if (abs2 > f4) {
            if (yVelocity <= 0.0f) {
                f4 = -f4;
            }
            yVelocity = f4;
        }
        this.A0A = true;
        this.A0J.A04(this.A08, xVelocity, yVelocity);
        this.A0A = false;
        if (this.A03 == 1) {
            A06(0);
        }
    }

    public final void A04(float f, float f2, int i) {
        int i2 = 1;
        if (!A0C(f, f2, i, 1)) {
            i2 = 0;
        }
        if (A0C(f2, f, i, 4)) {
            i2 |= 4;
        }
        if (A0C(f, f2, i, 2)) {
            i2 |= 2;
        }
        if (A0C(f2, f, i, 8)) {
            i2 |= 8;
        }
        if (i2 != 0) {
            int[] iArr = this.A0F;
            iArr[i] = iArr[i] | i2;
            if (this.A0J == null) {
                throw null;
            }
        }
    }

    public final void A05(float f, float f2, int i) {
        float[] fArr = this.A0B;
        int i2 = 0;
        if (fArr == null || fArr.length <= i) {
            int i3 = i + 1;
            float[] fArr2 = new float[i3];
            float[] fArr3 = new float[i3];
            float[] fArr4 = new float[i3];
            float[] fArr5 = new float[i3];
            int[] iArr = new int[i3];
            int[] iArr2 = new int[i3];
            int[] iArr3 = new int[i3];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.A0C;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.A0D;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.A0E;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.A0H;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.A0F;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.A0G;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.A0B = fArr2;
            fArr = fArr2;
            this.A0C = fArr3;
            this.A0D = fArr4;
            this.A0E = fArr5;
            this.A0H = iArr;
            this.A0F = iArr2;
            this.A0G = iArr3;
        }
        this.A0D[i] = f;
        fArr[i] = f;
        float[] fArr9 = this.A0C;
        this.A0E[i] = f2;
        fArr9[i] = f2;
        int[] iArr7 = this.A0H;
        int i4 = (int) f;
        int i5 = (int) f2;
        ViewGroup viewGroup = this.A0I;
        if (i4 < viewGroup.getLeft() + this.A04) {
            i2 = 1;
        }
        if (i5 < viewGroup.getTop() + this.A04) {
            i2 |= 4;
        }
        if (i4 > viewGroup.getRight() - this.A04) {
            i2 |= 2;
        }
        if (i5 > viewGroup.getBottom() - this.A04) {
            i2 |= 8;
        }
        iArr7[i] = i2;
        this.A05 |= 1 << i;
    }

    public void A06(int i) {
        AnonymousClass1DF r2;
        this.A0I.removeCallbacks(this.A0K);
        if (this.A03 != i) {
            this.A03 = i;
            AbstractC15250nk r22 = this.A0J;
            if (r22 instanceof C54282ee) {
                AnonymousClass2PS r0 = ((C54282ee) r22).A02.A06;
                if (r0 != null) {
                    r0.AFL(i);
                }
            } else if (r22 instanceof C36701mj) {
                C36701mj r23 = (C36701mj) r22;
                if (i == 1) {
                    r23.A00.A0B(1);
                }
            } else if ((r22 instanceof C36691mg) && (r2 = ((C36691mg) r22).A02.A05) != null) {
                AnonymousClass1n0 r24 = (AnonymousClass1n0) r2;
                if (r24 == null) {
                    throw null;
                } else if (i == 0) {
                    AnonymousClass1Dw.A00().A03(r24.A00.A07);
                } else if (i == 1 || i == 2) {
                    AnonymousClass1Dw.A00().A02(r24.A00.A07);
                }
            }
            if (this.A03 == 0) {
                this.A08 = null;
            }
        }
    }

    public final void A07(int i) {
        float[] fArr = this.A0B;
        if (fArr != null) {
            int i2 = this.A05;
            int i3 = 1 << i;
            if ((i2 & i3) != 0) {
                fArr[i] = 0.0f;
                this.A0C[i] = 0.0f;
                this.A0D[i] = 0.0f;
                this.A0E[i] = 0.0f;
                this.A0H[i] = 0;
                this.A0F[i] = 0;
                this.A0G[i] = 0;
                this.A05 = i2 & (i3 ^ -1);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0062, code lost:
        if (r10.A02 == -1) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0064, code lost:
        A03();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A08(android.view.MotionEvent r11) {
        /*
        // Method dump skipped, instructions count: 447
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15260nl.A08(android.view.MotionEvent):void");
    }

    public final void A09(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (A0D(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.A0D[pointerId] = x;
                this.A0E[pointerId] = y;
            }
        }
    }

    public void A0A(View view, int i) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = this.A0I;
        if (parent == viewGroup) {
            this.A08 = view;
            this.A02 = i;
            this.A0J.A05(view, i);
            A06(1);
            return;
        }
        StringBuilder A0S = AnonymousClass008.A0S("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
        A0S.append(viewGroup);
        A0S.append(")");
        throw new IllegalArgumentException(A0S.toString());
    }

    public boolean A0B() {
        if (this.A03 == 2) {
            boolean computeScrollOffset = this.A09.computeScrollOffset();
            int currX = this.A09.getCurrX();
            int currY = this.A09.getCurrY();
            int left = currX - this.A08.getLeft();
            int top = currY - this.A08.getTop();
            if (left != 0) {
                AnonymousClass0Q7.A0T(this.A08, left);
            }
            if (top != 0) {
                AnonymousClass0Q7.A0U(this.A08, top);
            }
            if (!(left == 0 && top == 0)) {
                this.A0J.A06(this.A08, currX, currY, left, top);
            }
            if (computeScrollOffset) {
                if (currX == this.A09.getFinalX() && currY == this.A09.getFinalY()) {
                    this.A09.abortAnimation();
                }
            }
            this.A0I.post(this.A0K);
        }
        if (this.A03 == 2) {
            return true;
        }
        return false;
    }

    public final boolean A0C(float f, float f2, int i, int i2) {
        int i3;
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if (!((this.A0H[i] & i2) != i2 || (0 & i2) == 0 || (this.A0G[i] & i2) == i2 || (i3 = this.A0F[i] & i2) == i2)) {
            float f3 = (float) this.A06;
            if (abs > f3 || abs2 > f3) {
                if (abs < abs2 * 0.5f && this.A0J == null) {
                    throw null;
                } else if (i3 != 0 || abs <= f3) {
                    return false;
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean A0D(int i) {
        if ((this.A05 & (1 << i)) != 0) {
            return true;
        }
        StringBuilder sb = new StringBuilder("Ignoring pointerId=");
        sb.append(i);
        sb.append(" because ACTION_DOWN was not received ");
        sb.append("for this pointer before ACTION_MOVE. It likely happened because ");
        sb.append(" ViewDragHelper did not receive all the events in the event stream.");
        Log.e("ViewDragHelper", sb.toString());
        return false;
    }

    public boolean A0E(int i, int i2) {
        if (this.A0A) {
            return A0F(i, i2, (int) this.A07.getXVelocity(this.A02), (int) this.A07.getYVelocity(this.A02));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    public final boolean A0F(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        int left = this.A08.getLeft();
        int top = this.A08.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.A09.abortAnimation();
            A06(0);
            return false;
        }
        View view = this.A08;
        int i7 = (int) this.A01;
        int i8 = (int) this.A00;
        int i9 = i8;
        int abs = Math.abs(i3);
        if (abs < i7) {
            i9 = 0;
        } else if (abs <= i8) {
            i9 = i3;
        } else if (i3 <= 0) {
            i9 = -i8;
        }
        int abs2 = Math.abs(i4);
        if (abs2 < i7) {
            i8 = 0;
        } else if (abs2 <= i8) {
            i8 = i4;
        } else if (i4 <= 0) {
            i8 = -i8;
        }
        int abs3 = Math.abs(i5);
        int abs4 = Math.abs(i6);
        int abs5 = Math.abs(i9);
        int abs6 = Math.abs(i8);
        int i10 = abs5 + abs6;
        int i11 = abs3 + abs4;
        if (i9 != 0) {
            f = (float) abs5;
            f2 = (float) i10;
        } else {
            f = (float) abs3;
            f2 = (float) i11;
        }
        float f3 = f / f2;
        float f4 = (float) abs4;
        float f5 = (float) i11;
        if (i8 != 0) {
            f4 = (float) abs6;
            f5 = (float) i10;
        }
        AbstractC15250nk r2 = this.A0J;
        int A002 = A00(i5, i9, r2.A00(view));
        float A003 = ((float) A00(i6, i8, r2.A01(view))) * (f4 / f5);
        this.A09.startScroll(left, top, i5, i6, (int) (A003 + (((float) A002) * f3)));
        A06(2);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00cf, code lost:
        if (r6 != r7) goto L_0x00de;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0G(android.view.MotionEvent r18) {
        /*
        // Method dump skipped, instructions count: 290
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15260nl.A0G(android.view.MotionEvent):boolean");
    }

    public final boolean A0H(View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        AbstractC15250nk r1 = this.A0J;
        boolean z = false;
        if (r1.A00(view) > 0) {
            z = true;
        }
        boolean z2 = false;
        if (r1.A01(view) > 0) {
            z2 = true;
        }
        if (z) {
            if (z2) {
                float f3 = f2 * f2;
                int i = this.A06;
                if (f3 + (f * f) > ((float) (i * i))) {
                    return true;
                }
                return false;
            } else if (Math.abs(f) > ((float) this.A06)) {
                return true;
            } else {
                return false;
            }
        } else if (!z2 || Math.abs(f2) <= ((float) this.A06)) {
            return false;
        } else {
            return true;
        }
    }

    public boolean A0I(View view, int i) {
        if (view == this.A08 && this.A02 == i) {
            return true;
        }
        if (view == null || !this.A0J.A07(view, i)) {
            return false;
        }
        this.A02 = i;
        A0A(view, i);
        return true;
    }

    public boolean A0J(View view, int i, int i2) {
        this.A08 = view;
        this.A02 = -1;
        boolean A0F2 = A0F(i, i2, 0, 0);
        if (!A0F2 && this.A03 == 0 && this.A08 != null) {
            this.A08 = null;
        }
        return A0F2;
    }
}
