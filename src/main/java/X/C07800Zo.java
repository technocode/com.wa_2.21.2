package X;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.0Zo  reason: invalid class name and case insensitive filesystem */
public class C07800Zo extends AnonymousClass0Q0 {
    public final AnonymousClass0Q0 A00 = new C30631bf(this);
    public final RecyclerView A01;

    public C07800Zo(RecyclerView recyclerView) {
        this.A01 = recyclerView;
    }

    @Override // X.AnonymousClass0Q0
    public void A01(View view, C07890a3 r10) {
        AnonymousClass0VT r4;
        C15040nI r1;
        View.AccessibilityDelegate accessibilityDelegate = super.A01;
        AccessibilityNodeInfo accessibilityNodeInfo = r10.A02;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(RecyclerView.class.getName());
        if (!A03() && (r4 = this.A01.A0S) != null) {
            RecyclerView recyclerView = r4.A07;
            C16480ps r3 = recyclerView.A0x;
            AnonymousClass0VR r2 = recyclerView.A0z;
            if (recyclerView.canScrollVertically(-1) || r4.A07.canScrollHorizontally(-1)) {
                accessibilityNodeInfo.addAction(8192);
                accessibilityNodeInfo.setScrollable(true);
            }
            if (r4.A07.canScrollVertically(1) || r4.A07.canScrollHorizontally(1)) {
                accessibilityNodeInfo.addAction(4096);
                accessibilityNodeInfo.setScrollable(true);
            }
            int A0k = r4.A0k(r3, r2);
            int A0j = r4.A0j(r3, r2);
            int i = Build.VERSION.SDK_INT;
            if (i >= 21) {
                r1 = new C15040nI(AccessibilityNodeInfo.CollectionInfo.obtain(A0k, A0j, false, 0));
            } else if (i >= 19) {
                r1 = new C15040nI(AccessibilityNodeInfo.CollectionInfo.obtain(A0k, A0j, false));
            } else {
                r1 = new C15040nI(null);
            }
            if (i >= 19) {
                accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) r1.A00);
            }
        }
    }

    @Override // X.AnonymousClass0Q0
    public boolean A02(View view, int i, Bundle bundle) {
        AnonymousClass0VT r3;
        RecyclerView recyclerView;
        int i2;
        int i3;
        if (super.A02(view, i, bundle)) {
            return true;
        }
        if (A03() || (r3 = this.A01.A0S) == null || (recyclerView = r3.A07) == null) {
            return false;
        }
        if (i == 4096) {
            if (recyclerView.canScrollVertically(1)) {
                i2 = (r3.A00 - r3.A0F()) - r3.A0C();
            } else {
                i2 = 0;
            }
            if (r3.A07.canScrollHorizontally(1)) {
                i3 = (r3.A03 - r3.A0D()) - r3.A0E();
            }
            i3 = 0;
        } else if (i != 8192) {
            return false;
        } else {
            if (recyclerView.canScrollVertically(-1)) {
                i2 = -((r3.A00 - r3.A0F()) - r3.A0C());
            } else {
                i2 = 0;
            }
            if (r3.A07.canScrollHorizontally(-1)) {
                i3 = -((r3.A03 - r3.A0D()) - r3.A0E());
            }
            i3 = 0;
        }
        if (i2 == 0 && i3 == 0) {
            return false;
        }
        r3.A07.A0c(i3, i2);
        return true;
    }

    public boolean A03() {
        RecyclerView recyclerView = this.A01;
        if (recyclerView.A0h && !recyclerView.A0e) {
            int size = recyclerView.A0J.A04.size();
            boolean z = false;
            if (size > 0) {
                z = true;
            }
            return z;
        }
    }
}
