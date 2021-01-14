package java.lang;

import X.AbstractC06110Rt;
import X.AnonymousClass00Y;
import X.AnonymousClass01X;
import X.AnonymousClass0JJ;
import X.AnonymousClass21G;
import X.AnonymousClass2C0;
import X.C002001d;
import X.C225512f;
import X.C28051Sr;
import X.C460127k;
import X.C47612Is;
import android.os.Bundle;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.backup.google.RestoreFromBackupActivity;
import com.whatsapp.storage.StorageUsageDeleteCompleteDialogFragment;
import com.whatsapp.storage.StorageUsageGalleryActivity;
import com.whatsapp.util.Log;

public class RunnableEBaseShape0S0101200_I1 extends RunnableEmptyBase implements Runnable {
    public int A00;
    public long A01;
    public long A02;
    public Object A03;
    public final int A04;

    public RunnableEBaseShape0S0101200_I1(Object obj, int i, long j, long j2, int i2) {
        this.A04 = i2;
        this.A03 = obj;
        this.A00 = i;
        this.A01 = j;
        this.A02 = j2;
    }

    public final void run() {
        switch (this.A04) {
            case 0:
                ((C225512f) this.A03).A01.AD7(this.A00, this.A01, this.A02);
                return;
            case 1:
                int i = this.A00;
                long j = this.A01;
                long j2 = this.A02;
                RestoreFromBackupActivity restoreFromBackupActivity = ((C460127k) this.A03).A01;
                if (!AnonymousClass0JJ.A0H(restoreFromBackupActivity)) {
                    restoreFromBackupActivity.A05.setIndeterminate(false);
                    restoreFromBackupActivity.A05.setProgress(i);
                    TextView textView = restoreFromBackupActivity.A07;
                    AnonymousClass01X r9 = ((AnonymousClass2C0) restoreFromBackupActivity).A01;
                    textView.setText(r9.A0D(R.string.settings_gdrive_restore_progress_message_with_percentage, C002001d.A1Y(r9, j), C002001d.A1Y(r9, j2), r9.A0H().format(((double) i) / 100.0d)));
                    return;
                }
                Log.i("gdrive-activity-observer/msgstore-download-progress/activity-already-exited");
                return;
            case 2:
                StorageUsageGalleryActivity storageUsageGalleryActivity = (StorageUsageGalleryActivity) this.A03;
                long j3 = this.A01;
                long j4 = this.A02;
                int i2 = this.A00;
                Log.i("storage-usage-gallery-activity/message delete completed");
                storageUsageGalleryActivity.AMi();
                storageUsageGalleryActivity.A02 += j3;
                storageUsageGalleryActivity.A0U();
                String str = storageUsageGalleryActivity.A0H;
                int i3 = storageUsageGalleryActivity.A00;
                AnonymousClass00Y r7 = storageUsageGalleryActivity.A0Z;
                AnonymousClass21G r2 = new AnonymousClass21G();
                C28051Sr.A1b(r2, 6, str, i3);
                r2.A04 = Long.valueOf(j4);
                r2.A03 = Long.valueOf((long) i2);
                r7.A0B(r2, null, false);
                C47612Is r0 = storageUsageGalleryActivity.A09;
                if (r0 != null) {
                    r0.clear();
                }
                AbstractC06110Rt r02 = storageUsageGalleryActivity.A06;
                if (r02 != null) {
                    r02.A00();
                }
                if (j4 > 0) {
                    StorageUsageDeleteCompleteDialogFragment storageUsageDeleteCompleteDialogFragment = new StorageUsageDeleteCompleteDialogFragment();
                    Bundle bundle = new Bundle();
                    bundle.putLong("deleted_disk_size", j4);
                    storageUsageDeleteCompleteDialogFragment.A0N(bundle);
                    storageUsageDeleteCompleteDialogFragment.A0u(storageUsageGalleryActivity.A04(), null);
                }
                storageUsageGalleryActivity.A0F = null;
                return;
            default:
                return;
        }
    }
}
