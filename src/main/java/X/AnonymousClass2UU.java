package X;

import android.app.SharedElementCallback;
import android.view.View;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.2UU  reason: invalid class name */
public final class AnonymousClass2UU extends SharedElementCallback {
    public final /* synthetic */ ActivityC004802g A00;

    public AnonymousClass2UU(ActivityC004802g r1) {
        this.A00 = r1;
    }

    @Override // android.app.SharedElementCallback
    public void onMapSharedElements(List list, Map map) {
        View A02;
        super.onMapSharedElements(list, map);
        ActivityC004802g r3 = this.A00;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!map.containsKey(str) && (A02 = AnonymousClass2UT.A02(r3.getWindow().getDecorView(), str)) != null) {
                map.put(str, A02);
            }
        }
    }

    @Override // android.app.SharedElementCallback
    public void onSharedElementEnd(List list, List list2, List list3) {
        super.onSharedElementEnd(list, list2, list3);
        this.A00.setExitSharedElementCallback(null);
    }
}
