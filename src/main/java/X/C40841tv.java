package X;

import android.graphics.Rect;
import android.util.LruCache;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.1tv  reason: invalid class name and case insensitive filesystem */
public class C40841tv extends AbstractC16380pi {
    public int A00;
    public Rect A01 = new Rect();
    public LruCache A02 = new LruCache(50);
    public View A03;
    public boolean A04;
    public final AnonymousClass1O0 A05;

    public C40841tv(RecyclerView recyclerView, AnonymousClass1O0 r4) {
        this.A05 = r4;
        recyclerView.A15.add(new C40821tt(this, r4));
        ((AbstractC16300pa) r4).A01.registerObserver(new C40831tu(this));
    }

    public static void A00(C40841tv r3, int i, int i2) {
        if (r3.A02.size() != 0) {
            for (int i3 = i; i3 <= i + i2; i3++) {
                r3.A02.remove(Integer.valueOf(i3));
            }
        }
    }
}
