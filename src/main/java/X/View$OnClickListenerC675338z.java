package X;

import android.os.SystemClock;
import android.view.View;
import com.facebook.redex.ViewOnClickEmptyBase;
import com.google.android.search.verification.client.R;
import com.whatsapp.QuickContactActivity;
import com.whatsapp.jid.UserJid;
import com.whatsapp.voipcalling.CallsFragment;

/* renamed from: X.38z  reason: invalid class name and case insensitive filesystem */
public class View$OnClickListenerC675338z extends ViewOnClickEmptyBase implements View.OnClickListener {
    public long A00;
    public AbstractC675238y A01;
    public AnonymousClass390 A02;
    public CallsFragment A03;

    public View$OnClickListenerC675338z(CallsFragment callsFragment, AbstractC675238y r2, AnonymousClass390 r3) {
        this.A03 = callsFragment;
        this.A01 = r2;
        this.A02 = r3;
    }

    public void onClick(View view) {
        View findViewById;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        CallsFragment callsFragment = this.A03;
        if (callsFragment.A01 != null) {
            AbstractC675238y r1 = this.A01;
            if (r1.A6u() == 2) {
                callsFragment.A0v(((C72483Ta) r1).A00, (AnonymousClass3TO) this.A02);
                return;
            }
        }
        if (elapsedRealtime - this.A00 > 1000) {
            this.A00 = elapsedRealtime;
            if (this.A01.A6u() == 2) {
                findViewById = ((AnonymousClass3TO) this.A02).A01.findViewById(R.id.contact_photo);
            } else {
                findViewById = ((C72533Tf) this.A02).A00.findViewById(R.id.contact_photo);
            }
            UserJid A6x = this.A01.A6x();
            if (A6x != null) {
                QuickContactActivity.A04(this.A03.A0A(), findViewById, A6x, AnonymousClass0Q7.A0G(findViewById));
            }
        }
    }
}
