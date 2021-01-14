package X;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.lang.reflect.Method;

/* renamed from: X.0Vc  reason: invalid class name and case insensitive filesystem */
public class ActionMode$CallbackC06890Vc implements ActionMode.Callback {
    public Class A00;
    public Method A01;
    public boolean A02;
    public boolean A03 = false;
    public final ActionMode.Callback A04;
    public final TextView A05;

    public ActionMode$CallbackC06890Vc(ActionMode.Callback callback, TextView textView) {
        this.A04 = callback;
        this.A05 = textView;
    }

    public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return this.A04.onActionItemClicked(actionMode, menuItem);
    }

    public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        return this.A04.onCreateActionMode(actionMode, menu);
    }

    public void onDestroyActionMode(ActionMode actionMode) {
        this.A04.onDestroyActionMode(actionMode);
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:? A[ExcHandler: IllegalAccessException | NoSuchMethodException | InvocationTargetException (unused java.lang.Throwable), SYNTHETIC, Splitter:B:16:0x0059] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onPrepareActionMode(android.view.ActionMode r14, android.view.Menu r15) {
        /*
        // Method dump skipped, instructions count: 292
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ActionMode$CallbackC06890Vc.onPrepareActionMode(android.view.ActionMode, android.view.Menu):boolean");
    }
}
