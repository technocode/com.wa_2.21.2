package X;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;

/* renamed from: X.0n5  reason: invalid class name and case insensitive filesystem */
public class C14910n5 {
    public ViewParent A00;
    public ViewParent A01;
    public boolean A02;
    public int[] A03;
    public final View A04;

    public C14910n5(View view) {
        this.A04 = view;
    }

    public final ViewParent A00(int i) {
        if (i == 0) {
            return this.A01;
        }
        if (i != 1) {
            return null;
        }
        return this.A00;
    }

    public void A01(int i) {
        ViewParent A002 = A00(i);
        if (A002 != null) {
            View view = this.A04;
            if (A002 instanceof AnonymousClass0W6) {
                ((AnonymousClass0W6) A002).AKc(view, i);
            } else if (i == 0) {
                if (Build.VERSION.SDK_INT >= 21) {
                    try {
                        A002.onStopNestedScroll(view);
                    } catch (AbstractMethodError e) {
                        StringBuilder sb = new StringBuilder("ViewParent ");
                        sb.append(A002);
                        sb.append(" does not implement interface method onStopNestedScroll");
                        Log.e("ViewParentCompat", sb.toString(), e);
                    }
                } else if (A002 instanceof AnonymousClass0W7) {
                    ((AnonymousClass0W7) A002).onStopNestedScroll(view);
                }
            }
            if (i == 0) {
                this.A01 = null;
            } else if (i == 1) {
                this.A00 = null;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0081 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A02(int r11, int r12) {
        /*
        // Method dump skipped, instructions count: 165
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14910n5.A02(int, int):boolean");
    }

    public final boolean A03(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent A002;
        int i6;
        int i7;
        int[] iArr3 = iArr2;
        if (!this.A02 || (A002 = A00(i5)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.A04.getLocationInWindow(iArr);
            i6 = iArr[0];
            i7 = iArr[1];
        } else {
            i6 = 0;
            i7 = 0;
        }
        if (iArr2 == null) {
            iArr3 = this.A03;
            if (iArr3 == null) {
                iArr3 = new int[2];
                this.A03 = iArr3;
            }
            iArr3[0] = 0;
            iArr3[1] = 0;
        }
        View view = this.A04;
        if (A002 instanceof AbstractC07870a0) {
            ((AbstractC07870a0) A002).AHv(view, i, i2, i3, i4, i5, iArr3);
        } else {
            iArr3[0] = iArr3[0] + i3;
            iArr3[1] = iArr3[1] + i4;
            if (A002 instanceof AnonymousClass0W6) {
                ((AnonymousClass0W6) A002).AHu(view, i, i2, i3, i4, i5);
            } else if (i5 == 0) {
                if (Build.VERSION.SDK_INT >= 21) {
                    try {
                        A002.onNestedScroll(view, i, i2, i3, i4);
                    } catch (AbstractMethodError e) {
                        StringBuilder sb = new StringBuilder("ViewParent ");
                        sb.append(A002);
                        sb.append(" does not implement interface method onNestedScroll");
                        Log.e("ViewParentCompat", sb.toString(), e);
                    }
                } else if (A002 instanceof AnonymousClass0W7) {
                    ((AnonymousClass0W7) A002).onNestedScroll(view, i, i2, i3, i4);
                }
            }
        }
        if (iArr != null) {
            view.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i6;
            iArr[1] = iArr[1] - i7;
        }
        return true;
    }

    public boolean A04(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent A002;
        int i4;
        int i5;
        int[] iArr3 = iArr;
        if (!this.A02 || (A002 = A00(i3)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0) {
            if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
            }
            return false;
        }
        if (iArr2 != null) {
            this.A04.getLocationInWindow(iArr2);
            i4 = iArr2[0];
            i5 = iArr2[1];
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (iArr == null && (iArr3 = this.A03) == null) {
            iArr3 = new int[2];
            this.A03 = iArr3;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        View view = this.A04;
        AnonymousClass0N2.A1B(A002, view, i, i2, iArr3, i3);
        if (iArr2 != null) {
            view.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i4;
            iArr2[1] = iArr2[1] - i5;
        }
        if (iArr3[0] == 0 && iArr3[1] == 0) {
            return false;
        }
        return true;
    }
}
