package X;

import android.content.DialogInterface;
import com.whatsapp.backup.encryptedbackup.EncryptedBackupPhoneValidationActivity;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.1QH  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1QH implements DialogInterface.OnClickListener {
    public final /* synthetic */ EncryptedBackupPhoneValidationActivity A00;

    public /* synthetic */ AnonymousClass1QH(EncryptedBackupPhoneValidationActivity encryptedBackupPhoneValidationActivity) {
        this.A00 = encryptedBackupPhoneValidationActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        EncryptedBackupPhoneValidationActivity encryptedBackupPhoneValidationActivity = this.A00;
        C02300Bl r3 = encryptedBackupPhoneValidationActivity.A04;
        AnonymousClass008.A0n(r3.A01, "encrypted_backup_enabled", false);
        C02310Bm r32 = r3.A00;
        C006803i.A0m(new File(r32.A01.A00.getFilesDir(), "encrypt_material.key"));
        C006803i.A0m(new File(r32.A01.A00.getFilesDir(), "encrypted_backup.key"));
        Log.i("EncBackupManager/encrypted backup disabled");
        C002001d.A2N(encryptedBackupPhoneValidationActivity, 602);
        encryptedBackupPhoneValidationActivity.finish();
    }
}
