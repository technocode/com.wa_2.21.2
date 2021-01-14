package X;

import android.app.Activity;
import android.os.Build;
import com.google.android.search.verification.client.R;
import com.whatsapp.RequestPermissionActivity;

/* renamed from: X.0Wg  reason: invalid class name and case insensitive filesystem */
public class C07190Wg implements AbstractC07200Wh {
    public final /* synthetic */ AbstractC07170We A00;

    public C07190Wg(AbstractC07170We r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC07200Wh
    public void AJ0(String str) {
        throw new IllegalStateException("must not be called");
    }

    @Override // X.AbstractC07200Wh
    public void AJ1() {
        throw new IllegalStateException("must not be called");
    }

    @Override // X.AbstractC07200Wh
    public void ALM(String str) {
        C002001d.A2O(this.A00.A01, 107);
    }

    @Override // X.AbstractC07200Wh
    public void ALN() {
        Activity activity = this.A00.A01;
        int i = Build.VERSION.SDK_INT;
        int i2 = R.string.permission_storage_need_write_access_on_restore_from_backup_v30;
        if (i < 30) {
            i2 = R.string.permission_storage_need_write_access_on_restore_from_backup;
        }
        RequestPermissionActivity.A0B(activity, R.string.permission_storage_need_write_access_on_restore_from_backup_request, i2, false, 200);
    }
}
