package X;

import android.content.DialogInterface;
import com.whatsapp.storage.StorageUsageDeleteMessagesDialogFragment;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: X.340  reason: invalid class name */
public final /* synthetic */ class AnonymousClass340 implements DialogInterface.OnClickListener {
    public final /* synthetic */ StorageUsageDeleteMessagesDialogFragment A00;

    public /* synthetic */ AnonymousClass340(StorageUsageDeleteMessagesDialogFragment storageUsageDeleteMessagesDialogFragment) {
        this.A00 = storageUsageDeleteMessagesDialogFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Collection<AbstractC007503q> collection;
        StorageUsageDeleteMessagesDialogFragment storageUsageDeleteMessagesDialogFragment = this.A00;
        if (storageUsageDeleteMessagesDialogFragment.A03) {
            collection = storageUsageDeleteMessagesDialogFragment.A01;
        } else {
            collection = storageUsageDeleteMessagesDialogFragment.A02;
        }
        ArrayList arrayList = new ArrayList();
        if (!storageUsageDeleteMessagesDialogFragment.A04) {
            for (AbstractC007503q r1 : collection) {
                if (!r1.A0j) {
                    arrayList.add(r1);
                }
            }
        } else {
            arrayList.addAll(collection);
        }
        storageUsageDeleteMessagesDialogFragment.A07.ANF(new RunnableEBaseShape9S0200000_I1_4(storageUsageDeleteMessagesDialogFragment, arrayList, 22));
    }
}
