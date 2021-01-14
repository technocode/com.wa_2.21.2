package X;

import android.graphics.Rect;
import android.os.Bundle;
import android.text.Spanned;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.ClearableEditText;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.0Pz  reason: invalid class name */
public abstract class AnonymousClass0Pz extends AnonymousClass0Q0 {
    public static final Rect A09 = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, EditorInfoCompat.IME_FLAG_FORCE_ASCII, EditorInfoCompat.IME_FLAG_FORCE_ASCII);
    public static final AbstractC15210ng A0A = new C30181at();
    public static final AbstractC15220nh A0B = new C30191au();
    public int A00 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
    public int A01 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
    public C07760Zk A02;
    public final Rect A03 = new Rect();
    public final Rect A04 = new Rect();
    public final Rect A05 = new Rect();
    public final View A06;
    public final AccessibilityManager A07;
    public final int[] A08 = new int[2];
    public int mHoveredVirtualViewId = EditorInfoCompat.IME_FLAG_FORCE_ASCII;

    public void A07(C07890a3 r1) {
    }

    public AnonymousClass0Pz(View view) {
        if (view != null) {
            this.A06 = view;
            this.A07 = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            if (view.getImportantForAccessibility() == 0) {
                AnonymousClass0Q7.A0W(view, 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    public C07890a3 A03(int i) {
        if (i != -1) {
            return A04(i);
        }
        View view = this.A06;
        C07890a3 r5 = new C07890a3(AccessibilityNodeInfo.obtain(view));
        AccessibilityNodeInfo accessibilityNodeInfo = r5.A02;
        view.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ArrayList arrayList = new ArrayList();
        A08(arrayList);
        if (accessibilityNodeInfo.getChildCount() <= 0 || arrayList.size() <= 0) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                accessibilityNodeInfo.addChild(view, ((Number) arrayList.get(i2)).intValue());
            }
            return r5;
        }
        throw new RuntimeException("Views cannot have both real and virtual children");
    }

    public final C07890a3 A04(int i) {
        boolean z;
        C07890a3 r5 = new C07890a3(AccessibilityNodeInfo.obtain());
        AccessibilityNodeInfo accessibilityNodeInfo = r5.A02;
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setFocusable(true);
        accessibilityNodeInfo.setClassName("android.view.View");
        Rect rect = A09;
        accessibilityNodeInfo.setBoundsInParent(rect);
        accessibilityNodeInfo.setBoundsInScreen(rect);
        View view = this.A06;
        r5.A00 = -1;
        accessibilityNodeInfo.setParent(view);
        A06(i, r5);
        if (r5.A02() == null && accessibilityNodeInfo.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.A03;
        accessibilityNodeInfo.getBoundsInParent(rect2);
        if (!rect2.equals(rect)) {
            int actions = accessibilityNodeInfo.getActions();
            if ((actions & 64) != 0) {
                throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            } else if ((actions & 128) == 0) {
                accessibilityNodeInfo.setPackageName(view.getContext().getPackageName());
                r5.A01 = i;
                accessibilityNodeInfo.setSource(view, i);
                if (this.A00 == i) {
                    accessibilityNodeInfo.setAccessibilityFocused(true);
                    accessibilityNodeInfo.addAction(128);
                } else {
                    accessibilityNodeInfo.setAccessibilityFocused(false);
                    accessibilityNodeInfo.addAction(64);
                }
                if (this.A01 == i) {
                    z = true;
                    accessibilityNodeInfo.addAction(2);
                } else {
                    z = false;
                    if (accessibilityNodeInfo.isFocusable()) {
                        accessibilityNodeInfo.addAction(1);
                    }
                }
                accessibilityNodeInfo.setFocused(z);
                int[] iArr = this.A08;
                view.getLocationOnScreen(iArr);
                Rect rect3 = this.A04;
                accessibilityNodeInfo.getBoundsInScreen(rect3);
                if (rect3.equals(rect)) {
                    accessibilityNodeInfo.getBoundsInParent(rect3);
                    if (r5.A00 != -1) {
                        C07890a3 r12 = new C07890a3(AccessibilityNodeInfo.obtain());
                        for (int i2 = r5.A00; i2 != -1; i2 = r12.A00) {
                            r12.A00 = -1;
                            AccessibilityNodeInfo accessibilityNodeInfo2 = r12.A02;
                            accessibilityNodeInfo2.setParent(view, -1);
                            accessibilityNodeInfo2.setBoundsInParent(rect);
                            A06(i2, r12);
                            accessibilityNodeInfo2.getBoundsInParent(rect2);
                            rect3.offset(rect2.left, rect2.top);
                        }
                        r12.A02.recycle();
                    }
                    rect3.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
                }
                Rect rect4 = this.A05;
                if (view.getLocalVisibleRect(rect4)) {
                    rect4.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
                    if (rect3.intersect(rect4)) {
                        accessibilityNodeInfo.setBoundsInScreen(rect3);
                        if (!rect3.isEmpty() && view.getWindowVisibility() == 0) {
                            ViewParent parent = view.getParent();
                            while (true) {
                                if (parent instanceof View) {
                                    View view2 = (View) parent;
                                    if (view2.getAlpha() <= 0.0f || view2.getVisibility() != 0) {
                                        break;
                                    }
                                    parent = view2.getParent();
                                } else if (parent != null) {
                                    accessibilityNodeInfo.setVisibleToUser(true);
                                }
                            }
                        }
                    }
                }
                return r5;
            } else {
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
        } else {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
    }

    public final void A05(int i, int i2) {
        View view;
        ViewParent parent;
        if (i != Integer.MIN_VALUE && this.A07.isEnabled() && (parent = (view = this.A06).getParent()) != null) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
            if (i != -1) {
                C07890a3 A032 = A03(i);
                obtain.getText().add(A032.A02());
                AccessibilityNodeInfo accessibilityNodeInfo = A032.A02;
                obtain.setContentDescription(accessibilityNodeInfo.getContentDescription());
                obtain.setScrollable(accessibilityNodeInfo.isScrollable());
                obtain.setPassword(accessibilityNodeInfo.isPassword());
                obtain.setEnabled(accessibilityNodeInfo.isEnabled());
                obtain.setChecked(accessibilityNodeInfo.isChecked());
                if (!obtain.getText().isEmpty() || obtain.getContentDescription() != null) {
                    obtain.setClassName(accessibilityNodeInfo.getClassName());
                    obtain.setSource(view, i);
                    obtain.setPackageName(view.getContext().getPackageName());
                } else {
                    throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
                }
            } else {
                view.onInitializeAccessibilityEvent(obtain);
            }
            parent.requestSendAccessibilityEvent(view, obtain);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0016, code lost:
        if (r1 == null) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06(int r9, X.C07890a3 r10) {
        /*
        // Method dump skipped, instructions count: 271
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Pz.A06(int, X.0a3):void");
    }

    public void A08(List list) {
        if (this instanceof C05720Pu) {
            C05720Pu r2 = (C05720Pu) this;
            if (!r2.A02.A0H.A00.getPackageManager().hasSystemFeature("android.hardware.type.featurephone")) {
                CharSequence text = r2.A01.getText();
                if (text instanceof Spanned) {
                    Spanned spanned = (Spanned) text;
                    for (AbstractC05700Ps r0 : (AbstractC05700Ps[]) spanned.getSpans(0, spanned.length(), AbstractC05700Ps.class)) {
                        list.add(Integer.valueOf(spanned.getSpanStart(r0)));
                    }
                }
            }
        } else if (!(this instanceof AnonymousClass27I)) {
            C36761mp r02 = ((C459126y) this).A00.A04;
            if (!(r02 == null || r02.A03() == null)) {
                list.add(0);
            }
        } else if (((AnonymousClass27I) this).A00.getClearIconDrawable() != null) {
            list.add(1);
        }
    }

    public final boolean A09(int i) {
        if (this.A01 != i) {
            return false;
        }
        this.A01 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        A05(i, 8);
        return true;
    }

    public final boolean A0A(int i) {
        int i2;
        View view = this.A06;
        if ((!view.isFocused() && !view.requestFocus()) || (i2 = this.A01) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            A09(i2);
        }
        this.A01 = i;
        A05(i, 8);
        return true;
    }

    public boolean A0B(int i, int i2, Bundle bundle) {
        if (this instanceof C05720Pu) {
            C05720Pu r2 = (C05720Pu) this;
            if (i2 != 16) {
                return false;
            }
            AbstractC05700Ps A0F = r2.A0F(i);
            if (A0F != null) {
                A0F.onClick(r2.A01);
                return true;
            }
            StringBuilder sb = new StringBuilder("LinkSpan is null for offset: ");
            sb.append(i);
            Log.e("LinkAccessibilityHelper", sb.toString());
            return false;
        } else if (!(this instanceof AnonymousClass27I)) {
            C459126y r1 = (C459126y) this;
            if (i2 == 16 && i == 0) {
                return r1.A00.A02();
            }
            return false;
        } else {
            AnonymousClass27I r12 = (AnonymousClass27I) this;
            if (i != 1 || i2 != 16) {
                return false;
            }
            ClearableEditText clearableEditText = r12.A00;
            View.OnClickListener onClickListener = clearableEditText.A01;
            if (onClickListener != null) {
                onClickListener.onClick(clearableEditText);
            }
            clearableEditText.setText("");
            clearableEditText.requestFocus();
            return true;
        }
    }

    public final boolean A0C(int i, Rect rect) {
        Object A022;
        int i2;
        Object obj;
        int lastIndexOf;
        ArrayList arrayList = new ArrayList();
        A08(arrayList);
        C06540Tt r4 = new C06540Tt(10);
        int i3 = 0;
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            r4.A05(i4, A04(i4));
        }
        int i5 = this.A01;
        if (i5 == Integer.MIN_VALUE) {
            A022 = null;
        } else {
            A022 = r4.A02(i5, null);
        }
        int i6 = -1;
        if (i == 1 || i == 2) {
            boolean z = false;
            if (AnonymousClass0Q7.A05(this.A06) == 1) {
                z = true;
            }
            AbstractC15210ng r7 = A0A;
            int A002 = r4.A00();
            ArrayList arrayList2 = new ArrayList(A002);
            for (int i7 = 0; i7 < A002; i7++) {
                if (r4.A01) {
                    r4.A03();
                }
                arrayList2.add(r4.A03[i7]);
            }
            Collections.sort(arrayList2, new C15230ni(z, r7));
            if (i == 1) {
                int size = arrayList2.size();
                if (A022 != null) {
                    size = arrayList2.indexOf(A022);
                }
                int i8 = size - 1;
                if (i8 >= 0) {
                    obj = arrayList2.get(i8);
                }
                i2 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                return A0A(i2);
            } else if (i == 2) {
                int size2 = arrayList2.size();
                if (A022 == null) {
                    lastIndexOf = -1;
                } else {
                    lastIndexOf = arrayList2.lastIndexOf(A022);
                }
                int i9 = lastIndexOf + 1;
                if (i9 < size2) {
                    obj = arrayList2.get(i9);
                }
                i2 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                return A0A(i2);
            } else {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
            }
        } else if (i == 17 || i == 33 || i == 66 || i == 130) {
            Rect rect2 = new Rect();
            int i10 = this.A01;
            if (i10 != Integer.MIN_VALUE) {
                A03(i10).A02.getBoundsInParent(rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                View view = this.A06;
                int width = view.getWidth();
                int height = view.getHeight();
                if (i == 17) {
                    rect2.set(width, 0, width, height);
                } else if (i == 33) {
                    rect2.set(0, height, width, height);
                } else if (i == 66) {
                    rect2.set(-1, 0, -1, height);
                } else if (i == 130) {
                    rect2.set(0, -1, width, -1);
                } else {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                }
            }
            Rect rect3 = new Rect(rect2);
            if (i == 17) {
                rect3.offset(rect2.width() + 1, 0);
            } else if (i == 33) {
                rect3.offset(0, rect2.height() + 1);
            } else if (i == 66) {
                rect3.offset(-(rect2.width() + 1), 0);
            } else if (i == 130) {
                rect3.offset(0, -(rect2.height() + 1));
            } else {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            int A003 = r4.A00();
            Rect rect4 = new Rect();
            obj = null;
            for (int i11 = 0; i11 < A003; i11++) {
                if (r4.A01) {
                    r4.A03();
                }
                Object obj2 = r4.A03[i11];
                if (obj2 != A022) {
                    ((C07890a3) obj2).A02.getBoundsInParent(rect4);
                    if (AnonymousClass0N2.A1g(rect2, rect4, i)) {
                        if (AnonymousClass0N2.A1g(rect2, rect3, i) && !AnonymousClass0N2.A1e(i, rect2, rect4, rect3)) {
                            if (!AnonymousClass0N2.A1e(i, rect2, rect3, rect4)) {
                                int A042 = AnonymousClass0N2.A04(i, rect2, rect4);
                                int A052 = AnonymousClass0N2.A05(i, rect2, rect4);
                                int i12 = (A052 * A052) + (A042 * 13 * A042);
                                int A043 = AnonymousClass0N2.A04(i, rect2, rect3);
                                int A053 = AnonymousClass0N2.A05(i, rect2, rect3);
                                if (i12 >= (A053 * A053) + (A043 * 13 * A043)) {
                                }
                            }
                        }
                        rect3.set(rect4);
                        obj = obj2;
                    }
                }
            }
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        if (obj != null) {
            if (r4.A01) {
                r4.A03();
            }
            while (true) {
                if (i3 >= r4.A00) {
                    break;
                } else if (r4.A03[i3] == obj) {
                    i6 = i3;
                    break;
                } else {
                    i3++;
                }
            }
            if (r4.A01) {
                r4.A03();
            }
            i2 = r4.A02[i6];
            return A0A(i2);
        }
        i2 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        return A0A(i2);
    }

    public final boolean A0D(KeyEvent keyEvent) {
        int i = 0;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i2 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case AnonymousClass0PW.A01:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i2 = 33;
                                } else if (keyCode == 21) {
                                    i2 = 17;
                                } else if (keyCode != 22) {
                                    i2 = 130;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z = false;
                                while (i < repeatCount && A0C(i2, null)) {
                                    i++;
                                    z = true;
                                }
                                return z;
                            }
                            break;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    int i3 = this.A01;
                    if (i3 == Integer.MIN_VALUE) {
                        return true;
                    }
                    A0B(i3, 16, null);
                    return true;
                }
            } else if (keyEvent.hasNoModifiers()) {
                return A0C(2, null);
            } else {
                if (keyEvent.hasModifiers(1)) {
                    return A0C(1, null);
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005e, code lost:
        if (r0 == false) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0089, code lost:
        if (r2 > r0) goto L_0x008b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0E(android.view.MotionEvent r10) {
        /*
        // Method dump skipped, instructions count: 184
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Pz.A0E(android.view.MotionEvent):boolean");
    }

    public final void updateHoveredVirtualView(int i) {
        int i2 = this.mHoveredVirtualViewId;
        if (i2 != i) {
            this.mHoveredVirtualViewId = i;
            A05(i, 128);
            A05(i2, 256);
        }
    }
}
