package X;

import android.os.Build;
import com.google.android.search.verification.client.R;
import com.whatsapp.RequestPermissionActivity;

/* renamed from: X.1uN  reason: invalid class name and case insensitive filesystem */
public class C41051uN implements AbstractC07200Wh {
    public final /* synthetic */ C27131Oe A00;

    public C41051uN(C27131Oe r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC07200Wh
    public void AJ0(String str) {
        C40741tl.A01(this.A00.A0Q);
    }

    @Override // X.AbstractC07200Wh
    public void AJ1() {
        ActivityC004902h r4 = this.A00.A0Q;
        int i = Build.VERSION.SDK_INT;
        int i2 = R.string.permission_storage_need_write_access_on_record_audio_v30;
        if (i < 30) {
            i2 = R.string.permission_storage_need_write_access_on_record_audio;
        }
        RequestPermissionActivity.A09(r4, R.string.permission_storage_need_write_access_on_record_audio_request, i2);
    }

    @Override // X.AbstractC07200Wh
    public void ALM(String str) {
        C40741tl.A01(this.A00.A0Q);
    }

    @Override // X.AbstractC07200Wh
    public void ALN() {
        ActivityC004902h r4 = this.A00.A0Q;
        int i = Build.VERSION.SDK_INT;
        int i2 = R.string.permission_storage_need_write_access_on_record_audio_v30;
        if (i < 30) {
            i2 = R.string.permission_storage_need_write_access_on_record_audio;
        }
        RequestPermissionActivity.A09(r4, R.string.permission_storage_need_write_access_on_record_audio_request, i2);
    }
}
