package X;

import android.os.Build;
import android.view.View;
import com.whatsapp.group.GroupAdminPickerActivity;

/* renamed from: X.2fb  reason: invalid class name and case insensitive filesystem */
public class C54852fb extends AnonymousClass1DH {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ GroupAdminPickerActivity A02;

    public C54852fb(GroupAdminPickerActivity groupAdminPickerActivity, int i, int i2) {
        this.A02 = groupAdminPickerActivity;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // X.AnonymousClass1DH
    public void A00(View view, float f) {
        GroupAdminPickerActivity groupAdminPickerActivity = this.A02;
        groupAdminPickerActivity.A00.setColor(((int) (127.0f * f)) << 24);
        if (Build.VERSION.SDK_INT >= 21) {
            groupAdminPickerActivity.getWindow().setStatusBarColor(C004402b.A04(this.A00, this.A01, f));
        }
    }
}
