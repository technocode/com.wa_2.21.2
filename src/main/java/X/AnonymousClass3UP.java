package X;

import android.animation.AnimatorSet;
import android.view.View;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;
import com.whatsapp.components.Button;
import com.whatsapp.voipcalling.VoipCallControlBottomSheet;
import com.whatsapp.voipcalling.VoipCallControlRingingDotsIndicator;

/* renamed from: X.3UP  reason: invalid class name */
public class AnonymousClass3UP extends AbstractC11910hD {
    public AnimatorSet A00;
    public View A01;
    public View A02;
    public ImageView A03 = ((ImageView) AnonymousClass0Q7.A0D(this.A01, R.id.avatar));
    public ImageView A04 = ((ImageView) AnonymousClass0Q7.A0D(this.A01, R.id.connect_icon));
    public C11930hF A05;
    public Button A06 = ((Button) AnonymousClass0Q7.A0D(this.A01, R.id.ring_btn));
    public VoipCallControlRingingDotsIndicator A07 = ((VoipCallControlRingingDotsIndicator) AnonymousClass0Q7.A0D(this.A01, R.id.ringing_dots));

    public AnonymousClass3UP(VoipCallControlBottomSheet voipCallControlBottomSheet, View view) {
        super(view);
        this.A01 = view;
        this.A02 = AnonymousClass0Q7.A0D(view, R.id.name);
        this.A05 = new C11930hF(this.A01, R.id.name, voipCallControlBottomSheet.A0N, voipCallControlBottomSheet.A0R, voipCallControlBottomSheet.A0S);
    }
}
