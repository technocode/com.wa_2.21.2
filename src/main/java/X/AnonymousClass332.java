package X;

import android.util.SparseBooleanArray;
import android.view.View;

/* renamed from: X.332  reason: invalid class name */
public final /* synthetic */ class AnonymousClass332 implements View.OnLongClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass33N A01;
    public final /* synthetic */ AnonymousClass3QO A02;

    public /* synthetic */ AnonymousClass332(AnonymousClass3QO r1, int i, AnonymousClass33N r3) {
        this.A02 = r1;
        this.A00 = i;
        this.A01 = r3;
    }

    public final boolean onLongClick(View view) {
        AnonymousClass3QO r3 = this.A02;
        int i = this.A00;
        AnonymousClass33N r1 = this.A01;
        SparseBooleanArray sparseBooleanArray = r3.A04.A00;
        if (sparseBooleanArray == null || !sparseBooleanArray.get(i) || r1.A04.isEmpty()) {
            return false;
        }
        return r3.A0C(i);
    }
}
