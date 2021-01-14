package X;

import com.whatsapp.gallery.MediaGalleryFragmentBase;
import com.whatsapp.storage.StorageUsageMediaGalleryFragment;

/* renamed from: X.3RP  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3RP implements AbstractC48952Ok {
    public final /* synthetic */ StorageUsageMediaGalleryFragment A00;

    public /* synthetic */ AnonymousClass3RP(StorageUsageMediaGalleryFragment storageUsageMediaGalleryFragment) {
        this.A00 = storageUsageMediaGalleryFragment;
    }

    @Override // X.AbstractC48952Ok
    public final AbstractC48892Oe A3O(boolean z) {
        StorageUsageMediaGalleryFragment storageUsageMediaGalleryFragment = this.A00;
        C74253aR r5 = new C74253aR(storageUsageMediaGalleryFragment.A07, storageUsageMediaGalleryFragment.A08, storageUsageMediaGalleryFragment.A0D, storageUsageMediaGalleryFragment.A01, ((MediaGalleryFragmentBase) storageUsageMediaGalleryFragment).A02, storageUsageMediaGalleryFragment.A00);
        if (((C53852dw) r5).A01 == null) {
            ((C53852dw) r5).A01 = new C47942Kh(r5.A02, r5.A04, r5.A00(), false);
        }
        return r5;
    }
}
