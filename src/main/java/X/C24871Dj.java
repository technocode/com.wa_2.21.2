package X;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.os.Message;
import android.view.ViewGroup;
import com.google.android.material.snackbar.BaseTransientBottomBar$Behavior;
import java.util.List;

/* renamed from: X.1Dj  reason: invalid class name and case insensitive filesystem */
public final class C24871Dj implements Handler.Callback {
    public boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            AbstractC24951Dr r4 = (AbstractC24951Dr) message.obj;
            if (r4.A05.getParent() == null) {
                C24941Dq r6 = r4.A05;
                ViewGroup.LayoutParams layoutParams = r6.getLayoutParams();
                if (layoutParams instanceof C14270lr) {
                    C14270lr r5 = (C14270lr) layoutParams;
                    BaseTransientBottomBar$Behavior baseTransientBottomBar$Behavior = new BaseTransientBottomBar$Behavior();
                    C24911Dn r1 = baseTransientBottomBar$Behavior.A00;
                    if (r1 != null) {
                        r1.A00 = r4.A07;
                        baseTransientBottomBar$Behavior.A05 = new AnonymousClass1n0(r4);
                        r5.A00(baseTransientBottomBar$Behavior);
                        r5.A03 = 80;
                    } else {
                        throw null;
                    }
                }
                r4.A03.addView(r6);
            }
            C24941Dq r12 = r4.A05;
            r12.A00 = new C36861n1(r4);
            if (AnonymousClass0Q7.A0j(r12)) {
                boolean z = true;
                List<AccessibilityServiceInfo> enabledAccessibilityServiceList = r4.A04.getEnabledAccessibilityServiceList(1);
                if (enabledAccessibilityServiceList == null || !enabledAccessibilityServiceList.isEmpty()) {
                    z = false;
                }
                if (z) {
                    r4.A00();
                    return true;
                }
                r4.A01();
                return true;
            }
            r12.A01 = new C36871n2(r4);
            return true;
        } else if (i != 1) {
            return false;
        } else {
            AbstractC24951Dr r62 = (AbstractC24951Dr) message.obj;
            int i2 = message.arg1;
            boolean z2 = true;
            List<AccessibilityServiceInfo> enabledAccessibilityServiceList2 = r62.A04.getEnabledAccessibilityServiceList(1);
            if (enabledAccessibilityServiceList2 == null || !enabledAccessibilityServiceList2.isEmpty()) {
                z2 = false;
            }
            if (z2) {
                C24941Dq r13 = r62.A05;
                if (r13.getVisibility() == 0) {
                    ValueAnimator valueAnimator = new ValueAnimator();
                    int[] iArr = new int[2];
                    iArr[0] = 0;
                    int height = r13.getHeight();
                    ViewGroup.LayoutParams layoutParams2 = r13.getLayoutParams();
                    if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                        height += ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                    }
                    iArr[1] = height;
                    valueAnimator.setIntValues(iArr);
                    valueAnimator.setInterpolator(C08060aP.A02);
                    valueAnimator.setDuration(250L);
                    valueAnimator.addListener(new C24851Dh(r62, i2));
                    valueAnimator.addUpdateListener(new C24861Di(r62));
                    valueAnimator.start();
                    return true;
                }
            }
            r62.A03(i2);
            return true;
        }
    }
}
