package X;

import android.content.Intent;
import android.view.View;
import com.whatsapp.contact.picker.ContactPickerFragment;
import java.util.Map;

/* renamed from: X.2YD  reason: invalid class name */
public class AnonymousClass2YD extends AbstractView$OnClickListenerC08330av {
    public final /* synthetic */ ContactPickerFragment A00;

    public AnonymousClass2YD(ContactPickerFragment contactPickerFragment) {
        this.A00 = contactPickerFragment;
    }

    @Override // X.AbstractView$OnClickListenerC08330av
    public void A00(View view) {
        ContactPickerFragment contactPickerFragment = this.A00;
        if (contactPickerFragment.A0z) {
            contactPickerFragment.A16(null);
        } else if (contactPickerFragment.A0t || contactPickerFragment.A0x) {
            Intent intent = new Intent();
            Map map = contactPickerFragment.A1q;
            intent.putStringArrayListExtra("jids", AnonymousClass1VY.A0F(map.keySet()));
            intent.putExtra("file_path", contactPickerFragment.A0o().getString("file_path"));
            if (contactPickerFragment.A0t) {
                contactPickerFragment.A1a.A08(false, map.size());
            }
            C007303n A09 = C006803i.A09(contactPickerFragment.A0o(), "");
            if (A09 != null) {
                C006803i.A05(intent, A09);
            }
            contactPickerFragment.A0H.A01(intent);
            contactPickerFragment.A0H.A00();
        }
    }
}
