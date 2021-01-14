package X;

import com.whatsapp.backup.google.GoogleBackupService;
import com.whatsapp.backup.google.RestoreFromBackupActivity;
import com.whatsapp.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.0Ib  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC03860Ib {
    public boolean A00() {
        if (this instanceof C41431v2) {
            RestoreFromBackupActivity restoreFromBackupActivity = ((C41431v2) this).A00;
            if (!restoreFromBackupActivity.A0q.get()) {
                return restoreFromBackupActivity.A0R.A0N.A00();
            }
            Log.i("gdrive-activity/one-time-setup-task/cancelled");
            return false;
        } else if (this instanceof C41381uw) {
            return ((C41381uw) this).A00.A06();
        } else {
            if (this instanceof C41371uv) {
                GoogleBackupService googleBackupService = ((C41371uv) this).A00;
                AtomicBoolean atomicBoolean = googleBackupService.A0H.A0Z;
                return atomicBoolean.get() && googleBackupService.A06() && atomicBoolean.get();
            } else if (!(this instanceof C41361uu)) {
                return ((C03850Ia) this).A00.A08();
            } else {
                GoogleBackupService googleBackupService2 = ((C41361uu) this).A00;
                AtomicBoolean atomicBoolean2 = googleBackupService2.A0H.A0Y;
                return atomicBoolean2.get() && googleBackupService2.A06() && atomicBoolean2.get();
            }
        }
    }
}
