package X;

import android.widget.CompoundButton;
import com.whatsapp.MuteDialogFragment;
import com.whatsapp.chatinfo.ChatInfoActivity;
import com.whatsapp.chatinfo.ContactInfoActivity;

/* renamed from: X.2Eg  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C46642Eg implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ ContactInfoActivity A00;

    public /* synthetic */ C46642Eg(ContactInfoActivity contactInfoActivity) {
        this.A00 = contactInfoActivity;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        ContactInfoActivity contactInfoActivity = this.A00;
        if (z) {
            MuteDialogFragment.A00(contactInfoActivity.A0h()).A0u(contactInfoActivity.A04(), null);
        } else {
            ((ChatInfoActivity) contactInfoActivity).A0H.ANF(new RunnableEBaseShape8S0100000_I1_3(contactInfoActivity, 20));
        }
    }
}
