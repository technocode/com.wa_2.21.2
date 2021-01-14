package X;

import android.view.View;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;
import com.whatsapp.biz.catalog.CatalogImageListActivity;

/* renamed from: X.1wT  reason: invalid class name and case insensitive filesystem */
public class C42291wT extends AbstractC11910hD {
    public boolean A00;
    public final ImageView A01;
    public final AnonymousClass1PN A02 = AnonymousClass1PN.A00();
    public final /* synthetic */ CatalogImageListActivity A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C42291wT(CatalogImageListActivity catalogImageListActivity, View view) {
        super(view);
        this.A03 = catalogImageListActivity;
        this.A01 = (ImageView) view.findViewById(R.id.catalog_image_list_image_view);
    }
}
