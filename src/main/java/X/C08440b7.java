package X;

import android.view.ViewGroup;
import com.whatsapp.util.Log;

/* renamed from: X.0b7  reason: invalid class name and case insensitive filesystem */
public class C08440b7 extends AnonymousClass0YE {
    public final AnonymousClass0YE A00;

    public C08440b7(AnonymousClass0YE r1) {
        this.A00 = r1;
    }

    @Override // X.AnonymousClass0YE
    public Object A05(ViewGroup viewGroup, int i) {
        AnonymousClass0YE r1 = this.A00;
        if (r1.A01() > 0) {
            return r1.A05(viewGroup, i % r1.A01());
        }
        Log.i("infinitepageadapter/instantiateitem/count is zero");
        return null;
    }

    @Override // X.AnonymousClass0YE
    public void A0D(ViewGroup viewGroup, int i, Object obj) {
        this.A00.A0D(viewGroup, i, obj);
    }
}
