package X;

import android.view.View;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;
import java.io.File;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.1S0  reason: invalid class name */
public class AnonymousClass1S0 {
    public boolean A00 = false;
    public final C27881Ry A01;
    public final Set A02;

    public AnonymousClass1S0(C27881Ry r10) {
        this.A01 = r10;
        this.A02 = new HashSet();
        if (r10.A00 == 0) {
            File file = new File(r10.A06.A00.getCacheDir(), "product_catalog_images");
            C42321wW r8 = new C42321wW(r10.A01);
            C55132g3 r0 = new C55132g3(r10.A03, r10.A05, r10.A07, r10.A04, r10.A09, r10.A08, file, r8);
            r10.A02 = r0;
            r8.A00 = r0;
        }
        r10.A00++;
    }

    public void A00() {
        C55132g3 r1;
        Set<C42301wU> set = this.A02;
        for (C42301wU r12 : set) {
            this.A01.A01(r12);
        }
        set.clear();
        C27881Ry r2 = this.A01;
        int i = r2.A00 - 1;
        r2.A00 = i;
        if (i == 0 && (r1 = r2.A02) != null) {
            r1.A01(false);
            r2.A02 = null;
        }
        this.A00 = true;
    }

    public void A01(C48072Ku r8, int i, AbstractC27871Rx r10, AnonymousClass1Rv r11, ImageView imageView) {
        A02(r8, i, r10, r11, null, imageView);
    }

    public void A02(C48072Ku r14, int i, AbstractC27871Rx r16, AnonymousClass1Rv r17, AbstractC27861Rw r18, ImageView imageView) {
        C42301wU r4 = new C42301wU(r14, i, new C42091w8(this, r16), new C42081w7(this, r17), new C42071w6(r14, i, r18), Integer.MAX_VALUE, Integer.MAX_VALUE, imageView);
        C27881Ry r3 = this.A01;
        if (r3.A02 != null) {
            View view = (View) r4.A09.get();
            if (view != null) {
                view.setTag(R.id.image_id, r4.A08.A02);
                view.setTag(R.id.image_quality, Integer.valueOf(r4.A04));
                if (!r4.A9c().equals(view.getTag(R.id.loaded_image_url))) {
                    view.setTag(R.id.loaded_image_url, null);
                }
            }
            r3.A02.A00(r4, true);
        }
    }

    public void finalize() {
        super.finalize();
    }
}
