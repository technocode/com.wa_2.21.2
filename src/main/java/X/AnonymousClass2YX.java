package X;

import android.text.TextUtils;
import android.view.ViewGroup;
import com.facebook.redex.ViewOnClickEBaseShape1S0200000_I1_0;
import com.google.android.search.verification.client.R;
import com.whatsapp.components.button.ThumbnailButton;
import com.whatsapp.contact.picker.PhoneContactsSelector;

/* renamed from: X.2YX  reason: invalid class name */
public final class AnonymousClass2YX extends AbstractC16300pa {
    public final /* synthetic */ PhoneContactsSelector A00;

    public AnonymousClass2YX(PhoneContactsSelector phoneContactsSelector) {
        this.A00 = phoneContactsSelector;
    }

    @Override // X.AbstractC16300pa
    public int A05() {
        return this.A00.A0S.size();
    }

    @Override // X.AbstractC16300pa
    public AbstractC11910hD A06(ViewGroup viewGroup, int i) {
        return new AnonymousClass2YZ(this.A00.getLayoutInflater().inflate(R.layout.selected_contact, viewGroup, false));
    }

    @Override // X.AbstractC16300pa
    public void A07(AbstractC11910hD r6, int i) {
        AnonymousClass2YZ r62 = (AnonymousClass2YZ) r6;
        PhoneContactsSelector phoneContactsSelector = this.A00;
        C12310ht r3 = (C12310ht) phoneContactsSelector.A0S.get(i);
        String str = r3.A05;
        if (!TextUtils.isEmpty(str)) {
            r62.A01.setText(str);
        } else {
            r62.A01.setText(r3.A06);
        }
        ThumbnailButton thumbnailButton = r62.A02;
        phoneContactsSelector.A0J.A05(thumbnailButton, R.drawable.avatar_contact);
        phoneContactsSelector.A06.A01(r3, thumbnailButton);
        r62.A00.setOnClickListener(new ViewOnClickEBaseShape1S0200000_I1_0(this, r3, 27));
    }
}
