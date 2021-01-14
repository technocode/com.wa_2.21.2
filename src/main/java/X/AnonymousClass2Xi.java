package X;

import com.google.android.search.verification.client.R;
import com.whatsapp.companiondevice.optin.OptInActivity;

/* renamed from: X.2Xi  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2Xi implements AnonymousClass0SG {
    public final /* synthetic */ OptInActivity A00;

    public /* synthetic */ AnonymousClass2Xi(OptInActivity optInActivity) {
        this.A00 = optInActivity;
    }

    @Override // X.AnonymousClass0SG
    public final void ADy(Object obj) {
        OptInActivity optInActivity = this.A00;
        Boolean bool = (Boolean) obj;
        if (bool == null) {
            return;
        }
        if (bool.booleanValue()) {
            optInActivity.A01.setVisibility(0);
            optInActivity.A04.setVisibility(8);
            optInActivity.A08.setVisibility(8);
            optInActivity.A09.setVisibility(0);
            optInActivity.A05.setText(R.string.md_opt_out_clarification);
            optInActivity.A06.setText(R.string.md_opt_out_screen_description);
            return;
        }
        optInActivity.A01.setVisibility(8);
        optInActivity.A04.setVisibility(0);
        optInActivity.A08.setVisibility(0);
        optInActivity.A09.setVisibility(8);
        optInActivity.A05.setText(R.string.md_opt_in_clarification);
        C002001d.A2Q(optInActivity, ((ActivityC004702f) optInActivity).A0F, ((ActivityC004602e) optInActivity).A04, optInActivity.A0I, optInActivity.A06, ((AnonymousClass2C0) optInActivity).A01.A0D(R.string.md_opt_in_screen_description, "learn-more"), optInActivity.A0A.A02("download-and-installation", "about-multi-device-beta"));
    }
}
