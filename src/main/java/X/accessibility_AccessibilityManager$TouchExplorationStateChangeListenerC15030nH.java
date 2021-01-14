package X;

import android.view.accessibility.AccessibilityManager;

/* renamed from: X.0nH  reason: invalid class name and case insensitive filesystem */
public final class accessibility.AccessibilityManager$TouchExplorationStateChangeListenerC15030nH implements AccessibilityManager.TouchExplorationStateChangeListener {
    public final AbstractC15020nG A00;

    public accessibility.AccessibilityManager$TouchExplorationStateChangeListenerC15030nH(AbstractC15020nG r1) {
        this.A00 = r1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof accessibility.AccessibilityManager$TouchExplorationStateChangeListenerC15030nH)) {
            return false;
        }
        return this.A00.equals(((accessibility.AccessibilityManager$TouchExplorationStateChangeListenerC15030nH) obj).A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public void onTouchExplorationStateChanged(boolean z) {
        C24941Dq.setClickableOrFocusableBasedOnAccessibility(((C36881n3) this.A00).A00, z);
    }
}
