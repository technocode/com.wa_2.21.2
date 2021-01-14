package X;

import android.view.MenuItem;
import com.whatsapp.DocumentPickerActivity;

/* renamed from: X.1LW  reason: invalid class name */
public class AnonymousClass1LW implements MenuItem.OnActionExpandListener {
    public final /* synthetic */ DocumentPickerActivity A00;

    public boolean onMenuItemActionExpand(MenuItem menuItem) {
        return true;
    }

    public AnonymousClass1LW(DocumentPickerActivity documentPickerActivity) {
        this.A00 = documentPickerActivity;
    }

    public boolean onMenuItemActionCollapse(MenuItem menuItem) {
        DocumentPickerActivity documentPickerActivity = this.A00;
        documentPickerActivity.A06 = null;
        DocumentPickerActivity.A04(documentPickerActivity);
        return true;
    }
}
