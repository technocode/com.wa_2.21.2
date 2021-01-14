package X;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;

/* renamed from: X.1ZR  reason: invalid class name */
public class AnonymousClass1ZR implements AnonymousClass0TR, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, DialogInterface.OnKeyListener {
    public AnonymousClass0MD A00;
    public AnonymousClass0TN A01;
    public AnonymousClass0T8 A02;

    @Override // X.AnonymousClass0TR
    public boolean AI7(AnonymousClass0T8 r2) {
        return false;
    }

    public AnonymousClass1ZR(AnonymousClass0T8 r1) {
        this.A02 = r1;
    }

    @Override // X.AnonymousClass0TR
    public void AEI(AnonymousClass0T8 r2, boolean z) {
        AnonymousClass0MD r0;
        if ((z || r2 == this.A02) && (r0 = this.A00) != null) {
            r0.dismiss();
        }
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        AnonymousClass0T8 r3 = this.A02;
        AnonymousClass0TN r1 = this.A01;
        AnonymousClass0TP r0 = r1.A04;
        if (r0 == null) {
            r0 = new AnonymousClass0TP(r1);
            r1.A04 = r0;
        }
        r3.A0J(r0.getItem(i), null, 0);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        AnonymousClass0TN r0 = this.A01;
        AnonymousClass0T8 r2 = this.A02;
        AnonymousClass0TR r1 = r0.A06;
        if (r1 != null) {
            r1.AEI(r2, true);
        }
    }

    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.A00.getWindow();
                if (!(window2 == null || (decorView2 = window2.getDecorView()) == null || (keyDispatcherState2 = decorView2.getKeyDispatcherState()) == null)) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.A00.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.A02.A0F(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.A02.performShortcut(i, keyEvent, 0);
    }
}
