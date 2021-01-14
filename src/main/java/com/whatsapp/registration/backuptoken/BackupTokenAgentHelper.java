package com.whatsapp.registration.backuptoken;

import X.AnonymousClass00G;
import X.AnonymousClass0I2;
import X.C000300f;
import X.C002001d;
import android.app.backup.BackupAgentHelper;
import android.app.backup.BackupDataInput;
import android.app.backup.BackupDataOutput;
import android.app.backup.FileBackupHelper;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.whatsapp.util.Log;

public class BackupTokenAgentHelper extends BackupAgentHelper {
    public final C000300f A00 = C000300f.A00();
    public final AnonymousClass00G A01 = AnonymousClass00G.A01;

    @Override // android.app.backup.BackupAgentHelper, android.app.backup.BackupAgent
    public void onBackup(ParcelFileDescriptor parcelFileDescriptor, BackupDataOutput backupDataOutput, ParcelFileDescriptor parcelFileDescriptor2) {
        if (!AnonymousClass0I2.A03(this.A00)) {
            Log.i("BackupTokenAgentHelper/onBackup/backup skipped/disabled");
        } else if (Build.VERSION.SDK_INT < 28) {
            Log.i("BackupTokenAgentHelper/onBackup/backup skipped/older api version");
        } else if ((backupDataOutput.getTransportFlags() & 1) == 0) {
            Log.i("BackupTokenAgentHelper/onBackup/backup skipped/encryption not enabled");
        } else if (!C002001d.A3F(this.A01.A00)) {
            Log.i("BackupTokenAgentHelper/onBackup/backup skipped/google play services is not installed");
        } else {
            synchronized (AnonymousClass0I2.A00) {
                Log.i("BackupTokenAgentHelper/onBackup/success");
                super.onBackup(parcelFileDescriptor, backupDataOutput, parcelFileDescriptor2);
            }
        }
    }

    public void onCreate() {
        addHelper("backup_helper_key", new FileBackupHelper(this, "backup_token"));
    }

    @Override // android.app.backup.BackupAgentHelper, android.app.backup.BackupAgent
    public void onRestore(BackupDataInput backupDataInput, int i, ParcelFileDescriptor parcelFileDescriptor) {
        if (!AnonymousClass0I2.A03(this.A00)) {
            Log.i("BackupTokenAgentHelper/onRestore/backup skipped/feature not enabled");
            return;
        }
        synchronized (AnonymousClass0I2.A00) {
            Log.i("BackupTokenAgentHelper/onRestore/success");
            super.onRestore(backupDataInput, i, parcelFileDescriptor);
        }
    }
}
