package X;

import android.content.Context;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.1gy  reason: invalid class name and case insensitive filesystem */
public class C33561gy implements AnonymousClass11B {
    @Override // X.AnonymousClass11B
    public void A2D(Context context, Object obj, Object obj2, Object obj3) {
        Integer num;
        Parcelable parcelable;
        RecyclerView recyclerView = (RecyclerView) obj;
        AnonymousClass25I r5 = (AnonymousClass25I) obj2;
        recyclerView.setAdapter(r5.A06);
        recyclerView.setItemAnimator(null);
        AnonymousClass11H r0 = r5.A05;
        if (r0 != null && (parcelable = r0.A00) != null) {
            recyclerView.A0S.A0P(parcelable);
        } else if ((r0 == null || r0.A00 == null) && (num = r5.A07) != null) {
            recyclerView.A0X(num.intValue());
        }
    }

    @Override // X.AnonymousClass11B
    public boolean APd(Object obj, Object obj2, Object obj3, Object obj4) {
        return ((AnonymousClass25I) obj).A06 != ((AnonymousClass25I) obj2).A06;
    }

    @Override // X.AnonymousClass11B
    public void AQj(Context context, Object obj, Object obj2, Object obj3) {
        RecyclerView recyclerView = (RecyclerView) obj;
        AnonymousClass11H r1 = ((AnonymousClass25I) obj2).A05;
        if (r1 != null) {
            r1.A00 = recyclerView.A0S.A0G();
        }
        recyclerView.setAdapter(null);
    }
}
