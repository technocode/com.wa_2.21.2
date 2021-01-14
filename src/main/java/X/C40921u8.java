package X;

import android.os.Build;
import com.google.android.search.verification.client.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.ViewProfilePhoto;

/* renamed from: X.1u8  reason: invalid class name and case insensitive filesystem */
public class C40921u8 implements AbstractC07200Wh {
    public final /* synthetic */ ViewProfilePhoto A00;

    public C40921u8(ViewProfilePhoto viewProfilePhoto) {
        this.A00 = viewProfilePhoto;
    }

    @Override // X.AbstractC07200Wh
    public void AJ0(String str) {
        ViewProfilePhoto viewProfilePhoto = this.A00;
        viewProfilePhoto.A0L.A03(viewProfilePhoto);
    }

    @Override // X.AbstractC07200Wh
    public void AJ1() {
        ViewProfilePhoto viewProfilePhoto = this.A00;
        int i = Build.VERSION.SDK_INT;
        int i2 = R.string.permission_storage_need_write_access_on_profile_photo_view_v30;
        if (i < 30) {
            i2 = R.string.permission_storage_need_write_access_on_profile_photo_view;
        }
        RequestPermissionActivity.A09(viewProfilePhoto, R.string.permission_storage_need_write_access_on_profile_photo_view_request, i2);
    }

    @Override // X.AbstractC07200Wh
    public void ALM(String str) {
        ViewProfilePhoto viewProfilePhoto = this.A00;
        viewProfilePhoto.A0L.A03(viewProfilePhoto);
    }

    @Override // X.AbstractC07200Wh
    public void ALN() {
        ViewProfilePhoto viewProfilePhoto = this.A00;
        int i = Build.VERSION.SDK_INT;
        int i2 = R.string.permission_storage_need_write_access_v30;
        if (i < 30) {
            i2 = R.string.permission_storage_need_write_access;
        }
        RequestPermissionActivity.A09(viewProfilePhoto, R.string.permission_storage_need_write_access_request, i2);
    }
}
