package X;

import android.content.DialogInterface;
import android.view.KeyEvent;
import com.whatsapp.storage.StorageUsageGalleryActivity;

/* renamed from: X.342  reason: invalid class name */
public final /* synthetic */ class AnonymousClass342 implements DialogInterface.OnKeyListener {
    public final /* synthetic */ StorageUsageGalleryActivity A00;

    public /* synthetic */ AnonymousClass342(StorageUsageGalleryActivity storageUsageGalleryActivity) {
        this.A00 = storageUsageGalleryActivity;
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        StorageUsageGalleryActivity storageUsageGalleryActivity = this.A00;
        if (i != 4) {
            return false;
        }
        storageUsageGalleryActivity.A0T();
        return true;
    }
}
