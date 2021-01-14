package X;

import android.view.MenuItem;
import com.whatsapp.biz.product.view.activity.ProductDetailActivity;

/* renamed from: X.1xA  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C42711xA implements AnonymousClass0SG {
    public final /* synthetic */ MenuItem A00;
    public final /* synthetic */ MenuItem A01;
    public final /* synthetic */ MenuItem A02;
    public final /* synthetic */ ProductDetailActivity A03;

    public /* synthetic */ C42711xA(ProductDetailActivity productDetailActivity, MenuItem menuItem, MenuItem menuItem2, MenuItem menuItem3) {
        this.A03 = productDetailActivity;
        this.A00 = menuItem;
        this.A01 = menuItem2;
        this.A02 = menuItem3;
    }

    @Override // X.AnonymousClass0SG
    public final void ADy(Object obj) {
        boolean z;
        ProductDetailActivity productDetailActivity = this.A03;
        MenuItem menuItem = this.A00;
        MenuItem menuItem2 = this.A01;
        MenuItem menuItem3 = this.A02;
        if (!((Boolean) obj).booleanValue() || productDetailActivity.A05.A09(((AnonymousClass2D8) productDetailActivity).A0C) || productDetailActivity.A04 == null) {
            z = false;
            menuItem.setShowAsAction(1);
            menuItem2.setShowAsAction(1);
        } else {
            z = true;
            menuItem.setShowAsAction(0);
            menuItem2.setShowAsAction(0);
        }
        menuItem3.setVisible(z);
    }
}
