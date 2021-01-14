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

/* renamed from: X.0WX  reason: invalid class name */
public class AnonymousClass0WX implements Window.Callback {
    public Window.Callback A00;
    public AnonymousClass0JL A01;

    public AnonymousClass0WX(Window.Callback callback, AnonymousClass0JL r2) {
        this.A00 = callback;
        this.A01 = r2;
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.A00.dispatchGenericMotionEvent(motionEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        this.A01.A01();
        return this.A00.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.A00.dispatchKeyShortcutEvent(keyEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.A00.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 1) {
            this.A01.A01();
        }
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
        this.A00.onContentChanged();
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        return this.A00.onCreatePanelMenu(i, menu);
    }

    public View onCreatePanelView(int i) {
        return this.A00.onCreatePanelView(i);
    }

    public void onDetachedFromWindow() {
        this.A00.onDetachedFromWindow();
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.A00.onMenuItemSelected(i, menuItem);
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return this.A00.onMenuOpened(i, menu);
    }

    public void onPanelClosed(int i, Menu menu) {
        this.A00.onPanelClosed(i, menu);
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        return this.A00.onPreparePanel(i, view, menu);
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
        return this.A00.onWindowStartingActionMode(callback, i);
    }
}
