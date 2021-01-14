package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;
import com.whatsapp.SelectionCheckView;
import com.whatsapp.contact.picker.PhoneContactsSelector;
import java.util.List;

/* renamed from: X.2Gb  reason: invalid class name and case insensitive filesystem */
public class C47002Gb extends ArrayAdapter {
    public final /* synthetic */ PhoneContactsSelector A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47002Gb(PhoneContactsSelector phoneContactsSelector, Context context, List list) {
        super(context, (int) R.layout.phone_contact_row, list);
        this.A00 = phoneContactsSelector;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C47112Gn r0;
        Object item = getItem(i);
        if (item != null) {
            C12310ht r6 = (C12310ht) item;
            if (view == null) {
                view = this.A00.getLayoutInflater().inflate(R.layout.phone_contact_row, viewGroup, false);
                r0 = new C47112Gn(view);
                view.setTag(r0);
            } else {
                r0 = (C47112Gn) view.getTag();
            }
            PhoneContactsSelector phoneContactsSelector = this.A00;
            AnonymousClass0HJ r3 = phoneContactsSelector.A0J;
            ImageView imageView = r0.A00;
            r3.A05(imageView, R.drawable.avatar_contact);
            phoneContactsSelector.A06.A01(r6, imageView);
            r0.A02.A04(r6.A06, phoneContactsSelector.A0D, false, 0);
            SelectionCheckView selectionCheckView = r0.A01;
            selectionCheckView.A03(r6.A03, false);
            selectionCheckView.setTag(r6);
            return view;
        }
        throw null;
    }
}
