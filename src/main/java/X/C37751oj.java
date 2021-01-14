package X;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.1oj  reason: invalid class name and case insensitive filesystem */
public class C37751oj implements AnonymousClass11B {
    public final C37661oa A00;
    public final AnonymousClass1GX A01;

    public C37751oj(AnonymousClass1GX r1, C37661oa r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    @Override // X.AnonymousClass11B
    public void A2D(Context context, Object obj, Object obj2, Object obj3) {
        RecyclerView recyclerView = (RecyclerView) obj;
        AnonymousClass1GX r4 = this.A01;
        C37661oa r3 = this.A00;
        if (r3.A00 == 1 && ((AnonymousClass05r) r3.A01).A01.A03 == null) {
            throw null;
        }
        r4.A06 = recyclerView;
        r4.A03 = recyclerView.getScrollX();
        recyclerView.A0l(r4.A05);
        int i = r4.A00;
        if (i != -1) {
            if (!r4.A08) {
                recyclerView.A0X(i);
            } else if (!r4.A07.equals("")) {
                AnonymousClass277 r1 = new AnonymousClass277(context);
                r1.A04(r4.A07);
                ((AbstractC16520pw) r1).A00 = r4.A00;
                recyclerView.A0S.A0Z(r1);
            } else {
                recyclerView.A0Y(i);
            }
            r4.A00 = -1;
            r4.A08 = false;
            r4.A07 = "";
        }
        int i2 = r4.A01;
        if (i2 != -1 || r4.A02 != -1) {
            recyclerView.scrollBy(i2, r4.A02);
            r4.A01 = -1;
            r4.A02 = -1;
        }
    }

    @Override // X.AnonymousClass11B
    public boolean APd(Object obj, Object obj2, Object obj3, Object obj4) {
        return true;
    }

    @Override // X.AnonymousClass11B
    public void AQj(Context context, Object obj, Object obj2, Object obj3) {
        AnonymousClass1GX r1 = this.A01;
        r1.A06 = null;
        ((RecyclerView) obj).A0m(r1.A05);
    }
}
