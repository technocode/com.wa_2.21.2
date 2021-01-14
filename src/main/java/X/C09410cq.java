package X;

import android.view.View;
import java.util.ArrayList;

/* renamed from: X.0cq  reason: invalid class name and case insensitive filesystem */
public class C09410cq implements AbstractC09420cr {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ArrayList A01;

    @Override // X.AbstractC09420cr
    public void ALH(AbstractC09350ck r1) {
    }

    @Override // X.AbstractC09420cr
    public void ALI(AbstractC09350ck r1) {
    }

    @Override // X.AbstractC09420cr
    public void ALJ(AbstractC09350ck r1) {
    }

    public C09410cq(View view, ArrayList arrayList) {
        this.A00 = view;
        this.A01 = arrayList;
    }

    @Override // X.AbstractC09420cr
    public void ALG(AbstractC09350ck r6) {
        r6.A08(this);
        this.A00.setVisibility(8);
        ArrayList arrayList = this.A01;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((View) arrayList.get(i)).setVisibility(0);
        }
    }
}
