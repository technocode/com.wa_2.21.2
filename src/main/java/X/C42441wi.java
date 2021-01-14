package X;

import com.whatsapp.biz.catalog.view.activity.CatalogListActivity;
import java.util.List;

/* renamed from: X.1wi  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C42441wi implements AnonymousClass0SG {
    public final /* synthetic */ CatalogListActivity A00;

    public /* synthetic */ C42441wi(CatalogListActivity catalogListActivity) {
        this.A00 = catalogListActivity;
    }

    @Override // X.AnonymousClass0SG
    public final void ADy(Object obj) {
        CatalogListActivity catalogListActivity = this.A00;
        catalogListActivity.A02 = catalogListActivity.A00.A02((List) obj);
        catalogListActivity.invalidateOptionsMenu();
    }
}
