package X;

import com.whatsapp.mediaview.MediaViewFragment;
import com.whatsapp.storage.StorageUsageDeleteMessagesDialogFragment;
import java.util.Collection;
import java.util.List;

/* renamed from: X.2kI  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C57432kI implements AbstractC47922Kf {
    public final /* synthetic */ MediaViewFragment A00;
    public final /* synthetic */ List A01;

    public /* synthetic */ C57432kI(MediaViewFragment mediaViewFragment, List list) {
        this.A00 = mediaViewFragment;
        this.A01 = list;
    }

    @Override // X.AbstractC47922Kf
    public final void AFN(Collection collection) {
        MediaViewFragment mediaViewFragment = this.A00;
        List list = this.A01;
        StorageUsageDeleteMessagesDialogFragment storageUsageDeleteMessagesDialogFragment = new StorageUsageDeleteMessagesDialogFragment();
        storageUsageDeleteMessagesDialogFragment.A02 = list;
        storageUsageDeleteMessagesDialogFragment.A01 = collection;
        storageUsageDeleteMessagesDialogFragment.A00 = null;
        storageUsageDeleteMessagesDialogFragment.A0u(mediaViewFragment.A0C(), null);
    }
}
