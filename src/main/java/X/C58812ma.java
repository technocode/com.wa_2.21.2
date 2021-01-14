package X;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.contact.picker.ContactPickerFragment;

/* renamed from: X.2ma  reason: invalid class name and case insensitive filesystem */
public class C58812ma extends AbstractC39391rQ {
    public final /* synthetic */ ContactPickerFragment A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58812ma(ContactPickerFragment contactPickerFragment, Context context) {
        super(context, R.color.link_color);
        this.A00 = contactPickerFragment;
    }

    @Override // X.AbstractC05700Ps
    public void onClick(View view) {
        ContactPickerFragment contactPickerFragment = this.A00;
        contactPickerFragment.A11.A05(contactPickerFragment.A00(), new Intent("android.intent.action.VIEW", contactPickerFragment.A1Y.A03("general", "26000253", null)));
    }
}
