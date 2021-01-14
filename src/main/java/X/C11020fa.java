package X;

import android.graphics.Bitmap;
import com.google.android.search.verification.client.R;
import com.whatsapp.biz.catalog.CatalogHeader;
import java.lang.ref.WeakReference;

/* renamed from: X.0fa  reason: invalid class name and case insensitive filesystem */
public class C11020fa extends AnonymousClass0JW {
    public final AnonymousClass0HK A00;
    public final C007003k A01;
    public final WeakReference A02;

    public C11020fa(C007003k r2, AnonymousClass0HK r3, CatalogHeader catalogHeader) {
        this.A01 = r2;
        this.A00 = r3;
        this.A02 = new WeakReference(catalogHeader);
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        CatalogHeader catalogHeader = (CatalogHeader) this.A02.get();
        if (catalogHeader == null) {
            return;
        }
        if (bitmap == null) {
            catalogHeader.A00.setImageResource(R.drawable.avatar_contact_large);
        } else {
            catalogHeader.A00.setImageBitmap(bitmap);
        }
    }
}
