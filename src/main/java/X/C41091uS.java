package X;

import android.os.Build;
import com.google.android.search.verification.client.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.WebImagePicker;

/* renamed from: X.1uS  reason: invalid class name and case insensitive filesystem */
public class C41091uS implements AbstractC07200Wh {
    public final /* synthetic */ WebImagePicker A00;

    public C41091uS(WebImagePicker webImagePicker) {
        this.A00 = webImagePicker;
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
        WebImagePicker webImagePicker = this.A00;
        AnonymousClass02M r3 = ((ActivityC004702f) webImagePicker).A0F;
        AnonymousClass01X r2 = ((AnonymousClass2C0) webImagePicker).A01;
        boolean A01 = AnonymousClass00C.A01();
        int i = R.string.need_sd_card_shared_storage;
        if (A01) {
            i = R.string.need_sd_card;
        }
        r3.A0C(r2.A06(i), 1);
        webImagePicker.finish();
    }

    @Override // X.AbstractC07200Wh
    public void ALN() {
        WebImagePicker webImagePicker = this.A00;
        int i = Build.VERSION.SDK_INT;
        int i2 = R.string.permission_storage_need_write_access_on_web_image_picking_v30;
        if (i < 30) {
            i2 = R.string.permission_storage_need_write_access_on_web_image_picking;
        }
        RequestPermissionActivity.A09(webImagePicker, R.string.permission_storage_need_write_access_on_web_image_picking_request, i2);
    }
}
