package X;

import android.content.Intent;
import com.whatsapp.storage.StorageUsageActivity;
import com.whatsapp.storage.StorageUsageGalleryActivity;

/* renamed from: X.3RJ  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3RJ implements AnonymousClass0SG {
    public final /* synthetic */ StorageUsageActivity A00;

    public /* synthetic */ AnonymousClass3RJ(StorageUsageActivity storageUsageActivity) {
        this.A00 = storageUsageActivity;
    }

    @Override // X.AnonymousClass0SG
    public final void ADy(Object obj) {
        String str;
        StorageUsageActivity storageUsageActivity = this.A00;
        Intent intent = (Intent) obj;
        if (intent.getComponent() != null) {
            str = intent.getComponent().getClassName();
        } else {
            str = null;
        }
        if (StorageUsageGalleryActivity.class.getName().equals(str)) {
            storageUsageActivity.startActivityForResult(intent, 0);
        }
    }
}
