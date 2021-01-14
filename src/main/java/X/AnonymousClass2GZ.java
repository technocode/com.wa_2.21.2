package X;

import android.widget.AbsListView;
import com.whatsapp.contact.picker.PhoneContactsSelector;

/* renamed from: X.2GZ  reason: invalid class name */
public class AnonymousClass2GZ implements AbsListView.OnScrollListener {
    public int A00 = 0;
    public final /* synthetic */ PhoneContactsSelector A01;

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    public AnonymousClass2GZ(PhoneContactsSelector phoneContactsSelector) {
        this.A01 = phoneContactsSelector;
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
        int i2 = this.A00;
        if (i2 == 0 && i != i2) {
            ((ActivityC004602e) this.A01).A0H.A02(absListView);
        }
        this.A00 = i;
    }
}
