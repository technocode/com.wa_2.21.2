package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape1S0200000_I1_0;
import com.google.android.search.verification.client.R;
import com.whatsapp.voipcalling.GroupCallParticipantPicker;

/* renamed from: X.2YT  reason: invalid class name */
public final class AnonymousClass2YT extends AbstractC16300pa {
    public final /* synthetic */ AnonymousClass0QH A00;

    public AnonymousClass2YT(AnonymousClass0QH r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC16300pa
    public int A05() {
        return this.A00.A0b.size();
    }

    @Override // X.AbstractC16300pa
    public AbstractC11910hD A06(ViewGroup viewGroup, int i) {
        int i2;
        AnonymousClass0QH r0 = this.A00;
        LayoutInflater layoutInflater = r0.getLayoutInflater();
        if (!(r0 instanceof GroupCallParticipantPicker)) {
            i2 = R.layout.selected_contact;
        } else {
            i2 = R.layout.selected_contact_group_call;
        }
        return new AnonymousClass2YZ(layoutInflater.inflate(i2, viewGroup, false));
    }

    @Override // X.AbstractC16300pa
    public void A07(AbstractC11910hD r10, int i) {
        AnonymousClass2YZ r102 = (AnonymousClass2YZ) r10;
        AnonymousClass0QH r8 = this.A00;
        C007003k r7 = (C007003k) r8.A0b.get(i);
        TextView textView = r102.A01;
        C014308b r6 = r8.A0U;
        textView.setText(r6.A04(r7));
        AnonymousClass0YX r3 = r8.A0E;
        if (r3 != null) {
            r3.A04(r7, r102.A02, false, new C12260ho(r3.A04.A01, r7));
        }
        View view = r102.A00;
        view.setOnClickListener(new ViewOnClickEBaseShape1S0200000_I1_0(this, r7, 26));
        AnonymousClass01X r32 = ((AnonymousClass2C0) r8).A01;
        view.setContentDescription(r32.A0D(R.string.selected_contact_content_description, r6.A08(r7, false)));
        C002001d.A2w(r32, view, R.string.accessibility_action_click_selected_contact_to_deselect);
    }
}
