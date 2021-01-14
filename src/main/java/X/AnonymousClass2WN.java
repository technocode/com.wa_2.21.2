package X;

import android.view.MenuItem;
import com.google.android.search.verification.client.R;
import com.whatsapp.camera.CameraMediaPickerFragment;

/* renamed from: X.2WN  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2WN implements AbstractC08280an {
    public final /* synthetic */ CameraMediaPickerFragment A00;

    public /* synthetic */ AnonymousClass2WN(CameraMediaPickerFragment cameraMediaPickerFragment) {
        this.A00 = cameraMediaPickerFragment;
    }

    @Override // X.AbstractC08280an
    public final boolean onMenuItemClick(MenuItem menuItem) {
        CameraMediaPickerFragment cameraMediaPickerFragment = this.A00;
        if (menuItem.getItemId() != R.id.menuitem_select_multiple) {
            return false;
        }
        cameraMediaPickerFragment.A12(cameraMediaPickerFragment.A07);
        return true;
    }
}
