package X;

import android.view.Menu;
import android.view.MenuItem;
import com.google.android.search.verification.client.R;

/* renamed from: X.2Yu  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C51452Yu implements AnonymousClass1RW {
    public final /* synthetic */ Menu A00;
    public final /* synthetic */ C58932mm A01;

    public /* synthetic */ C51452Yu(C58932mm r1, Menu menu) {
        this.A01 = r1;
        this.A00 = menu;
    }

    @Override // X.AnonymousClass1RW
    public final void ADb(C28231Tk r7) {
        C58932mm r5 = this.A01;
        Menu menu = this.A00;
        if (r7 != null && r7.A09) {
            AnonymousClass01X r4 = r5.A0F;
            MenuItem add = menu.add(0, 29, 0, r4.A06(R.string.view_catalog));
            add.setActionView(R.layout.view_catalog_menu_item);
            add.getActionView().setContentDescription(r4.A06(R.string.view_catalog));
            r5.A03(add, R.string.view_catalog, true);
            add.setShowAsAction(2);
        }
    }
}
