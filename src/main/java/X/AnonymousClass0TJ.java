package X;

import android.os.Build;
import android.view.ActionMode;
import android.view.Window;

/* renamed from: X.0TJ  reason: invalid class name */
public class AnonymousClass0TJ extends AnonymousClass0TK {
    public final /* synthetic */ AnonymousClass0MW A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass0TJ(AnonymousClass0MW r1, Window.Callback callback) {
        super(callback);
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000e, code lost:
        if (r2 != null) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onPreparePanel(int r4, android.view.View r5, android.view.Menu r6) {
        /*
            r3 = this;
            boolean r0 = r6 instanceof X.AnonymousClass0T8
            r2 = 0
            if (r0 == 0) goto L_0x0008
            r2 = r6
            X.0T8 r2 = (X.AnonymousClass0T8) r2
        L_0x0008:
            r1 = 0
            if (r4 != 0) goto L_0x000e
            if (r2 != 0) goto L_0x0010
            return r1
        L_0x000e:
            if (r2 == 0) goto L_0x0013
        L_0x0010:
            r0 = 1
            r2.A0H = r0
        L_0x0013:
            android.view.Window$Callback r0 = r3.A00
            boolean r0 = r0.onPreparePanel(r4, r5, r6)
            if (r2 == 0) goto L_0x001d
            r2.A0H = r1
        L_0x001d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0TJ.onPreparePanel(int, android.view.View, android.view.Menu):boolean");
    }

    @Override // X.AnonymousClass0TK
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        if (Build.VERSION.SDK_INT >= 23) {
            return null;
        }
        AnonymousClass0MW r2 = this.A00;
        if (!r2.A0X) {
            return super.A00.onWindowStartingActionMode(callback);
        }
        AnonymousClass0V8 r1 = new AnonymousClass0V8(r2.A0j, callback);
        AbstractC06110Rt A04 = r2.A04(r1);
        if (A04 != null) {
            return r1.A00(A04);
        }
        return null;
    }
}
