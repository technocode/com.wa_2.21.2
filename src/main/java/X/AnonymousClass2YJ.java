package X;

import android.net.Uri;
import com.whatsapp.contact.picker.ContactPickerFragment;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2YJ  reason: invalid class name */
public class AnonymousClass2YJ implements AnonymousClass1NW {
    public boolean A00 = false;
    public final ArrayList A01 = new ArrayList();
    public final ArrayList A02 = new ArrayList();
    public final /* synthetic */ ContactPickerFragment A03;
    public final /* synthetic */ List A04;

    public AnonymousClass2YJ(ContactPickerFragment contactPickerFragment, List list) {
        this.A03 = contactPickerFragment;
        this.A04 = list;
    }

    public final void A00() {
        ArrayList arrayList = this.A02;
        int size = this.A01.size() + arrayList.size();
        ContactPickerFragment contactPickerFragment = this.A03;
        if (size == contactPickerFragment.A0d.size()) {
            if (!arrayList.isEmpty() && !this.A00) {
                C58822mb r0 = contactPickerFragment.A0H;
                r0.A00.A0S(this.A04);
            }
            contactPickerFragment.A0H.A00();
        }
    }

    @Override // X.AnonymousClass1NW
    public void AFq() {
        this.A00 = true;
    }

    @Override // X.AnonymousClass1NW
    public void ALX(Uri uri) {
        this.A01.add(uri);
        A00();
    }

    @Override // X.AnonymousClass1NW
    public void ALY(Uri uri) {
        this.A02.add(uri);
        A00();
    }
}
