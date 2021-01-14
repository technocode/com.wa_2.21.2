package X;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import java.util.List;

/* renamed from: X.1Dq  reason: invalid class name and case insensitive filesystem */
public class C24941Dq extends FrameLayout {
    public AbstractC24921Do A00;
    public AbstractC24931Dp A01;
    public final AccessibilityManager A02;
    public final AbstractC15020nG A03;

    public C24941Dq(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C08030aM.A0r);
        if (obtainStyledAttributes.hasValue(1)) {
            AnonymousClass0Q7.A0Q(this, (float) obtainStyledAttributes.getDimensionPixelSize(1, 0));
        }
        obtainStyledAttributes.recycle();
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        this.A02 = accessibilityManager;
        C36881n3 r2 = new C36881n3(this);
        this.A03 = r2;
        if (Build.VERSION.SDK_INT >= 19) {
            accessibilityManager.addTouchExplorationStateChangeListener(new accessibility.AccessibilityManager$TouchExplorationStateChangeListenerC15030nH(r2));
        }
        setClickableOrFocusableBasedOnAccessibility(this, this.A02.isTouchExplorationEnabled());
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        AnonymousClass0Q7.A0M(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002d, code lost:
        if (r1 != false) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDetachedFromWindow() {
        /*
            r5 = this;
            super.onDetachedFromWindow()
            X.1Do r4 = r5.A00
            if (r4 == 0) goto L_0x0044
            X.1n1 r4 = (X.C36861n1) r4
            X.1Dr r0 = r4.A00
            if (r0 == 0) goto L_0x0035
            X.1Dw r1 = X.AnonymousClass1Dw.A00()
            X.1Du r3 = r0.A07
            java.lang.Object r2 = r1.A03
            monitor-enter(r2)
            boolean r0 = r1.A05(r3)     // Catch:{ all -> 0x0032 }
            if (r0 != 0) goto L_0x002f
            X.1Dv r0 = r1.A01     // Catch:{ all -> 0x0032 }
            r1 = 0
            if (r0 == 0) goto L_0x002c
            if (r3 == 0) goto L_0x002c
            java.lang.ref.WeakReference r0 = r0.A02     // Catch:{ all -> 0x0032 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0032 }
            if (r0 != r3) goto L_0x002c
            r1 = 1
        L_0x002c:
            r0 = 0
            if (r1 == 0) goto L_0x0030
        L_0x002f:
            r0 = 1
        L_0x0030:
            monitor-exit(r2)     // Catch:{ all -> 0x0032 }
            goto L_0x0037
        L_0x0032:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0035:
            r0 = 0
            throw r0
        L_0x0037:
            if (r0 == 0) goto L_0x0044
            android.os.Handler r2 = X.AbstractC24951Dr.A08
            r1 = 2
            java.lang.RunnableEBaseShape6S0100000_I1_1 r0 = new java.lang.RunnableEBaseShape6S0100000_I1_1
            r0.<init>(r4, r1)
            r2.post(r0)
        L_0x0044:
            android.view.accessibility.AccessibilityManager r3 = r5.A02
            X.0nG r2 = r5.A03
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 19
            if (r1 < r0) goto L_0x0058
            if (r2 == 0) goto L_0x0058
            X.0nH r0 = new X.0nH
            r0.<init>(r2)
            r3.removeTouchExplorationStateChangeListener(r0)
        L_0x0058:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24941Dq.onDetachedFromWindow():void");
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        AbstractC24931Dp r2 = this.A01;
        if (r2 != null) {
            C36871n2 r22 = (C36871n2) r2;
            r22.A00.A05.A01 = null;
            AbstractC24951Dr r23 = r22.A00;
            boolean z2 = true;
            List<AccessibilityServiceInfo> enabledAccessibilityServiceList = r23.A04.getEnabledAccessibilityServiceList(1);
            if (enabledAccessibilityServiceList == null || !enabledAccessibilityServiceList.isEmpty()) {
                z2 = false;
            }
            if (z2) {
                r23.A00();
            } else {
                r23.A01();
            }
        }
    }

    public static void setClickableOrFocusableBasedOnAccessibility(C24941Dq r1, boolean z) {
        r1.setClickable(!z);
        r1.setFocusable(z);
    }

    public void setOnAttachStateChangeListener(AbstractC24921Do r1) {
        this.A00 = r1;
    }

    public void setOnLayoutChangeListener(AbstractC24931Dp r1) {
        this.A01 = r1;
    }
}
