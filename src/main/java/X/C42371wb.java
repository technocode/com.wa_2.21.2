package X;

import android.graphics.Bitmap;
import com.whatsapp.biz.catalog.CatalogMediaViewFragment;
import com.whatsapp.mediaview.MediaViewBaseFragment;
import com.whatsapp.mediaview.PhotoView;

/* renamed from: X.1wb  reason: invalid class name and case insensitive filesystem */
public class C42371wb implements AbstractC27871Rx {
    public boolean A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ CatalogMediaViewFragment A02;
    public final /* synthetic */ PhotoView A03;

    public C42371wb(CatalogMediaViewFragment catalogMediaViewFragment, PhotoView photoView, int i) {
        this.A02 = catalogMediaViewFragment;
        this.A03 = photoView;
        this.A01 = i;
    }

    @Override // X.AbstractC27871Rx
    public void AHF(C42301wU r6, Bitmap bitmap, boolean z) {
        if (this.A00) {
            CatalogMediaViewFragment catalogMediaViewFragment = this.A02;
            C42151wE r1 = new C42151wE(this, this.A03, bitmap);
            if (!((MediaViewBaseFragment) catalogMediaViewFragment).A0E) {
                r1.ALF(true);
            } else {
                ((MediaViewBaseFragment) catalogMediaViewFragment).A0A = r1;
            }
        } else {
            this.A00 = true;
            PhotoView photoView = this.A03;
            photoView.A06(bitmap);
            CatalogMediaViewFragment catalogMediaViewFragment2 = this.A02;
            String str = catalogMediaViewFragment2.A04;
            if (str != null && str.equals(AnonymousClass1S6.A01(catalogMediaViewFragment2.A02.A06, this.A01))) {
                photoView.post(new RunnableEBaseShape7S0100000_I1_2(catalogMediaViewFragment2.A0B(), 35));
            }
        }
    }
}
