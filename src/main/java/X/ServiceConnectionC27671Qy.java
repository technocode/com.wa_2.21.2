package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.whatsapp.backup.google.GoogleBackupService;
import com.whatsapp.backup.google.RestoreFromBackupActivity;

/* renamed from: X.1Qy  reason: invalid class name and case insensitive filesystem */
public class ServiceConnectionC27671Qy implements ServiceConnection {
    public final /* synthetic */ RestoreFromBackupActivity A00;

    public ServiceConnectionC27671Qy(RestoreFromBackupActivity restoreFromBackupActivity) {
        this.A00 = restoreFromBackupActivity;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder != null) {
            RestoreFromBackupActivity restoreFromBackupActivity = this.A00;
            GoogleBackupService googleBackupService = ((BinderC27531Qj) iBinder).A00;
            if (googleBackupService != null) {
                restoreFromBackupActivity.A0A = googleBackupService;
                restoreFromBackupActivity.A0K.open();
                restoreFromBackupActivity.A0A.A04(restoreFromBackupActivity.A0T);
                return;
            }
            throw null;
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        RestoreFromBackupActivity restoreFromBackupActivity = this.A00;
        restoreFromBackupActivity.A0H = false;
        GoogleBackupService googleBackupService = restoreFromBackupActivity.A0A;
        if (googleBackupService != null) {
            googleBackupService.A0J.A01(restoreFromBackupActivity.A0T);
            restoreFromBackupActivity.A0A = null;
            restoreFromBackupActivity.A0K.close();
        }
    }
}
