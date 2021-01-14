package X;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

/* renamed from: X.1b1  reason: invalid class name and case insensitive filesystem */
public class C30251b1 implements AbstractC16900qd {
    public final /* synthetic */ C15610oN A00;

    public C30251b1(C15610oN r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC16900qd
    public Bundle ANN() {
        Map map = this.A00.A02;
        Set keySet = map.keySet();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(keySet.size());
        ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(arrayList.size());
        for (Object obj : keySet) {
            arrayList.add(obj);
            arrayList2.add(map.get(obj));
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("keys", arrayList);
        bundle.putParcelableArrayList("values", arrayList2);
        return bundle;
    }
}
