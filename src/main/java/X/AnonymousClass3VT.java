package X;

import android.view.MenuItem;
import com.google.android.search.verification.client.R;
import com.whatsapp.wabloks.ui.WaBloksActivity;

/* renamed from: X.3VT  reason: invalid class name */
public class AnonymousClass3VT implements AbstractC08280an {
    public final /* synthetic */ C43211xy A00;
    public final /* synthetic */ WaBloksActivity A01;

    public AnonymousClass3VT(WaBloksActivity waBloksActivity, C43211xy r2) {
        this.A01 = waBloksActivity;
        this.A00 = r2;
    }

    @Override // X.AbstractC08280an
    public boolean onMenuItemClick(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.menu_more) {
            return false;
        }
        WaBloksActivity waBloksActivity = this.A01;
        AbstractC009505y r4 = this.A00.A00;
        C010106g r3 = C010106g.A01;
        if (waBloksActivity != null) {
            C008805h.A1B(r4, r3, new C010706m(waBloksActivity.A04(), waBloksActivity, C06170Sb.A00()), C009205v.A00().A02);
            return false;
        }
        throw null;
    }
}
