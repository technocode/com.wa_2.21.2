package X;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

/* renamed from: X.0TK  reason: invalid class name */
public class AnonymousClass0TK implements Window.Callback {
    public final Window.Callback A00;

    public AnonymousClass0TK(Window.Callback callback) {
        if (callback != null) {
            this.A00 = callback;
            return;
        }
        throw new IllegalArgumentException("Window callback may not be null");
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.A00.dispatchGenericMotionEvent(motionEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!(this instanceof AnonymousClass0TJ)) {
            return this.A00.dispatchKeyEvent(keyEvent);
        }
        AnonymousClass0TJ r1 = (AnonymousClass0TJ) this;
        return r1.A00.A0U(keyEvent) || ((AnonymousClass0TK) r1).A00.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002e, code lost:
        if (r3 != false) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchKeyShortcutEvent(android.view.KeyEvent r9) {
        /*
        // Method dump skipped, instructions count: 238
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0TK.dispatchKeyShortcutEvent(android.view.KeyEvent):boolean");
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.A00.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.A00.dispatchTouchEvent(motionEvent);
    }

    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.A00.dispatchTrackballEvent(motionEvent);
    }

    public void onActionModeFinished(ActionMode actionMode) {
        this.A00.onActionModeFinished(actionMode);
    }

    public void onActionModeStarted(ActionMode actionMode) {
        this.A00.onActionModeStarted(actionMode);
    }

    public void onAttachedToWindow() {
        this.A00.onAttachedToWindow();
    }

    public void onContentChanged() {
        if (!(this instanceof AnonymousClass0TJ)) {
            this.A00.onContentChanged();
        }
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (!(this instanceof AnonymousClass0TJ)) {
            return this.A00.onCreatePanelMenu(i, menu);
        }
        if (i != 0 || (menu instanceof AnonymousClass0T8)) {
            return this.A00.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    public View onCreatePanelView(int i) {
        if (!(this instanceof AnonymousClass0V7)) {
            return this.A00.onCreatePanelView(i);
        }
        AnonymousClass0V7 r0 = (AnonymousClass0V7) this;
        if (i == 0) {
            return new View(r0.A00.A01.getContext());
        }
        return ((AnonymousClass0TK) r0).A00.onCreatePanelView(i);
    }

    public void onDetachedFromWindow() {
        this.A00.onDetachedFromWindow();
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.A00.onMenuItemSelected(i, menuItem);
    }

    public boolean onMenuOpened(int i, Menu menu) {
        if (!(this instanceof AnonymousClass0TJ)) {
            return this.A00.onMenuOpened(i, menu);
        }
        AnonymousClass0TJ r1 = (AnonymousClass0TJ) this;
        ((AnonymousClass0TK) r1).A00.onMenuOpened(i, menu);
        AnonymousClass0MW r2 = r1.A00;
        if (r2 != null) {
            if (i == 108) {
                r2.A0N();
                AnonymousClass0S2 r0 = r2.A0B;
                if (r0 != null) {
                    r0.A09(true);
                }
            }
            return true;
        }
        throw null;
    }

    public void onPanelClosed(int i, Menu menu) {
        if (!(this instanceof AnonymousClass0TJ)) {
            this.A00.onPanelClosed(i, menu);
            return;
        }
        AnonymousClass0TJ r1 = (AnonymousClass0TJ) this;
        ((AnonymousClass0TK) r1).A00.onPanelClosed(i, menu);
        AnonymousClass0MW r3 = r1.A00;
        if (r3 == null) {
            throw null;
        } else if (i == 108) {
            r3.A0N();
            AnonymousClass0S2 r0 = r3.A0B;
            if (r0 != null) {
                r0.A09(false);
            }
        } else if (i == 0) {
            AnonymousClass0T2 A0K = r3.A0K(i);
            if (A0K.A0C) {
                r3.A0S(A0K, false);
            }
        }
    }

    public void onPointerCaptureChanged(boolean z) {
        this.A00.onPointerCaptureChanged(z);
    }

    @Override // android.view.Window.Callback
    public void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        if (!(this instanceof AnonymousClass0TJ)) {
            this.A00.onProvideKeyboardShortcuts(list, menu, i);
            return;
        }
        AnonymousClass0TJ r2 = (AnonymousClass0TJ) this;
        AnonymousClass0T8 r1 = r2.A00.A0K(0).A0A;
        if (r1 != null) {
            ((AnonymousClass0TK) r2).A00.onProvideKeyboardShortcuts(list, r1, i);
        } else {
            ((AnonymousClass0TK) r2).A00.onProvideKeyboardShortcuts(list, menu, i);
        }
    }

    public boolean onSearchRequested() {
        return this.A00.onSearchRequested();
    }

    public boolean onSearchRequested(SearchEvent searchEvent) {
        return this.A00.onSearchRequested(searchEvent);
    }

    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.A00.onWindowAttributesChanged(layoutParams);
    }

    public void onWindowFocusChanged(boolean z) {
        this.A00.onWindowFocusChanged(z);
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.A00.onWindowStartingActionMode(callback);
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        if (!(this instanceof AnonymousClass0TJ)) {
            return this.A00.onWindowStartingActionMode(callback, i);
        }
        AnonymousClass0TJ r1 = (AnonymousClass0TJ) this;
        AnonymousClass0MW r2 = r1.A00;
        if (!r2.A0X || i != 0) {
            return ((AnonymousClass0TK) r1).A00.onWindowStartingActionMode(callback, i);
        }
        AnonymousClass0V8 r12 = new AnonymousClass0V8(r2.A0j, callback);
        AbstractC06110Rt A04 = r2.A04(r12);
        if (A04 != null) {
            return r12.A00(A04);
        }
        return null;
    }
}
