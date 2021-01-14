package X;

import android.content.Intent;
import android.os.AsyncTask;
import com.google.android.search.verification.client.R;
import com.whatsapp.backup.encryptedbackup.ConfirmPasswordActivity;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.1QJ  reason: invalid class name */
public class AnonymousClass1QJ extends AsyncTask {
    public WeakReference A00;
    public final C02300Bl A01 = C02300Bl.A00();

    public AnonymousClass1QJ(ConfirmPasswordActivity confirmPasswordActivity) {
        this.A00 = new WeakReference(confirmPasswordActivity);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x010d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0111, code lost:
        throw r0;
     */
    @Override // android.os.AsyncTask
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object doInBackground(java.lang.Object[] r14) {
        /*
        // Method dump skipped, instructions count: 349
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1QJ.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(Object obj) {
        Boolean bool = (Boolean) obj;
        super.onPostExecute(bool);
        ActivityC004702f r2 = (ActivityC004702f) this.A00.get();
        if (r2 != null) {
            boolean booleanValue = bool.booleanValue();
            r2.A0K.A00();
            if (booleanValue) {
                Log.i("ConfirmPasswordActivity/enabled encrypted backup");
                r2.setResult(-1, new Intent());
                r2.finish();
                return;
            }
            Log.e("ConfirmPasswordActivity/failed to enable encrypted backup");
            r2.APo(R.string.encrypted_backup_error_when_setting_password);
        }
    }
}
