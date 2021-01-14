package X;

import com.whatsapp.storage.StorageUsageDeleteMessagesDialogFragment;
import com.whatsapp.storage.StorageUsageGalleryActivity;
import com.whatsapp.util.Log;
import java.util.Collection;

/* renamed from: X.3RM  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3RM implements AbstractC47922Kf {
    public final /* synthetic */ C74243aQ A00;
    public final /* synthetic */ Collection A01;

    public /* synthetic */ AnonymousClass3RM(C74243aQ r1, Collection collection) {
        this.A00 = r1;
        this.A01 = collection;
    }

    @Override // X.AbstractC47922Kf
    public final void AFN(Collection collection) {
        C74243aQ r1 = this.A00;
        Collection collection2 = this.A01;
        Log.i("storage-usage-gallery-activity/load duplicate messages/loaded");
        StorageUsageGalleryActivity storageUsageGalleryActivity = r1.A00;
        storageUsageGalleryActivity.A0T();
        if (storageUsageGalleryActivity != null) {
            AnonymousClass3RN r0 = new AnonymousClass3RN(storageUsageGalleryActivity);
            StorageUsageDeleteMessagesDialogFragment storageUsageDeleteMessagesDialogFragment = new StorageUsageDeleteMessagesDialogFragment();
            storageUsageDeleteMessagesDialogFragment.A02 = collection2;
            storageUsageDeleteMessagesDialogFragment.A01 = collection;
            storageUsageDeleteMessagesDialogFragment.A00 = r0;
            storageUsageDeleteMessagesDialogFragment.A0u(storageUsageGalleryActivity.A04(), null);
            return;
        }
        throw null;
    }
}
