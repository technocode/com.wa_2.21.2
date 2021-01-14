package X;

import com.whatsapp.storage.StorageUsageGalleryActivity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3Ra  reason: invalid class name and case insensitive filesystem */
public class C71973Ra implements AnonymousClass2L5 {
    public final /* synthetic */ StorageUsageGalleryActivity A00;

    @Override // X.AnonymousClass2L5
    public void AEt(AnonymousClass02N r1, C28481Um r2) {
    }

    public C71973Ra(StorageUsageGalleryActivity storageUsageGalleryActivity) {
        this.A00 = storageUsageGalleryActivity;
    }

    @Override // X.AnonymousClass2L5
    public void AE0(AnonymousClass2L3 r5) {
        ArrayList arrayList = r5.A00;
        AnonymousClass02M r2 = ((ActivityC004702f) this.A00).A0F;
        r2.A02.post(new RunnableEBaseShape9S0200000_I1_4(this, arrayList, 23));
    }

    @Override // X.AnonymousClass2L5
    public void AE1(AnonymousClass2L4 r5) {
        List list = r5.A00;
        AnonymousClass02M r2 = ((ActivityC004702f) this.A00).A0F;
        r2.A02.post(new RunnableEBaseShape9S0200000_I1_4(this, list, 23));
    }
}
