package X;

import android.view.View;
import android.view.Window;

/* renamed from: X.0O1  reason: invalid class name */
public abstract class AnonymousClass0O1 {
    public View A00(int i) {
        if (this instanceof AnonymousClass0SQ) {
            return ((AnonymousClass0SQ) this).A04.findViewById(i);
        }
        C09460cv r2 = (C09460cv) this;
        View view = r2.A00.A0A;
        if (view != null) {
            return view.findViewById(i);
        }
        StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(r2);
        sb.append(" does not have a view");
        throw new IllegalStateException(sb.toString());
    }

    public boolean A01() {
        if (!(this instanceof AnonymousClass0SQ)) {
            return ((C09460cv) this).A00.A0A != null;
        }
        Window window = ((AnonymousClass0SQ) this).A04.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }
}
