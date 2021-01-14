package X;

import android.view.View;
import android.widget.AdapterView;
import com.whatsapp.PlaceInfo;

/* renamed from: X.2S5  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2S5 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ ActivityC004802g A00;
    public final /* synthetic */ AbstractC49792Sd A01;

    public /* synthetic */ AnonymousClass2S5(AbstractC49792Sd r1, ActivityC004802g r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        AbstractC49792Sd r2 = this.A01;
        ActivityC004802g r1 = this.A00;
        int headerViewsCount = i - r2.A0T.getHeaderViewsCount();
        if (!r2.A0n || headerViewsCount != -1) {
            AnonymousClass1N1 r12 = r2.A0a;
            if (r12 != null && headerViewsCount < r12.places.size()) {
                r2.A0N((PlaceInfo) r12.places.get(headerViewsCount));
            }
        } else if (r2.A0o || !r2.A1L.A09(r1)) {
            r2.A0N(r2.A10);
        } else {
            r2.A0A();
        }
    }
}
