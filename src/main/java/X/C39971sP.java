package X;

import android.view.Menu;
import android.view.MenuItem;
import com.google.android.search.verification.client.R;
import com.whatsapp.DocumentPickerActivity;
import java.util.List;

/* renamed from: X.1sP  reason: invalid class name and case insensitive filesystem */
public class C39971sP implements AbstractC06100Rs {
    public MenuItem A00;
    public final /* synthetic */ DocumentPickerActivity A01;

    public C39971sP(DocumentPickerActivity documentPickerActivity) {
        this.A01 = documentPickerActivity;
    }

    @Override // X.AbstractC06100Rs
    public boolean ACa(AbstractC06110Rt r4, MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.menuitem_share) {
            return false;
        }
        DocumentPickerActivity documentPickerActivity = this.A01;
        List list = documentPickerActivity.A0B;
        if (list.isEmpty()) {
            return false;
        }
        documentPickerActivity.A0X(list);
        return false;
    }

    @Override // X.AbstractC06100Rs
    public boolean AEi(AbstractC06110Rt r4, Menu menu) {
        MenuItem add = menu.add(0, R.id.menuitem_share, 0, ((AnonymousClass2C0) this.A01).A01.A06(R.string.send));
        this.A00 = add;
        add.setShowAsAction(2);
        return true;
    }

    @Override // X.AbstractC06100Rs
    public void AEx(AbstractC06110Rt r3) {
        DocumentPickerActivity documentPickerActivity = this.A01;
        documentPickerActivity.A0B.clear();
        documentPickerActivity.A02 = null;
        documentPickerActivity.A03.notifyDataSetChanged();
    }

    @Override // X.AbstractC06100Rs
    public boolean AIh(AbstractC06110Rt r10, Menu menu) {
        DocumentPickerActivity documentPickerActivity = this.A01;
        List list = documentPickerActivity.A0B;
        if (list.isEmpty()) {
            r10.A04(((AnonymousClass2C0) documentPickerActivity).A01.A06(R.string.select_multiple_title));
        } else {
            r10.A04(((AnonymousClass2C0) documentPickerActivity).A01.A0A(R.plurals.n_selected, (long) list.size(), Integer.valueOf(list.size())));
        }
        this.A00.setVisible(!list.isEmpty());
        return true;
    }
}
