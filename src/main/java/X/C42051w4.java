package X;

import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.biz.catalog.CatalogImageListActivity;

/* renamed from: X.1w4  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C42051w4 implements AnonymousClass0TF {
    public final /* synthetic */ CatalogImageListActivity A00;

    public /* synthetic */ C42051w4(CatalogImageListActivity catalogImageListActivity) {
        this.A00 = catalogImageListActivity;
    }

    @Override // X.AnonymousClass0TF
    public final C06730Um ACw(View view, C06730Um r6) {
        CatalogImageListActivity catalogImageListActivity = this.A00;
        catalogImageListActivity.A01 = catalogImageListActivity.getResources().getDimensionPixelSize(R.dimen.actionbar_height) + r6.A04();
        int A01 = r6.A01();
        C42281wS r0 = catalogImageListActivity.A04;
        int i = catalogImageListActivity.A01;
        r0.A01 = i;
        r0.A00 = A01;
        int i2 = catalogImageListActivity.A00;
        if (i2 > 0) {
            catalogImageListActivity.A02.A1B(i2, i);
        }
        return r6;
    }
}
