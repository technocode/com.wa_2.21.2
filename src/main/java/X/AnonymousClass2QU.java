package X;

import android.view.ViewTreeObserver;
import com.whatsapp.group.GroupAdminPickerActivity;

/* renamed from: X.2QU  reason: invalid class name */
public class AnonymousClass2QU implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ GroupAdminPickerActivity A00;

    public AnonymousClass2QU(GroupAdminPickerActivity groupAdminPickerActivity) {
        this.A00 = groupAdminPickerActivity;
    }

    public void onGlobalLayout() {
        GroupAdminPickerActivity groupAdminPickerActivity = this.A00;
        groupAdminPickerActivity.A02.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        groupAdminPickerActivity.A06.A0D(3);
    }
}
