package X;

import android.os.Bundle;
import android.view.View;

/* renamed from: X.1ml  reason: invalid class name and case insensitive filesystem */
public class C36721ml extends AnonymousClass0Q0 {
    public final /* synthetic */ DialogC458926w A00;

    public C36721ml(DialogC458926w r1) {
        this.A00 = r1;
    }

    @Override // X.AnonymousClass0Q0
    public boolean A02(View view, int i, Bundle bundle) {
        if (i == 1048576) {
            DialogC458926w r1 = this.A00;
            if (r1.A02) {
                r1.cancel();
                return true;
            }
        }
        return super.A02(view, i, bundle);
    }
}
