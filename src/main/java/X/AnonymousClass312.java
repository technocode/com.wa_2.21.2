package X;

import android.content.Context;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.search.verification.client.R;
import com.whatsapp.search.views.itemviews.VoiceNoteProfileAvatarView;
import com.whatsapp.util.ViewOnClickCListenerShape13S0100000_I1_2;

/* renamed from: X.312  reason: invalid class name */
public abstract class AnonymousClass312 extends LinearLayout {
    public AnonymousClass0MP A00;
    public final AnonymousClass02M A01 = AnonymousClass02M.A00();
    public final C04350Ka A02 = C04350Ka.A00();
    public final C04360Kb A03 = C04360Kb.A00();
    public final AnonymousClass03S A04 = AnonymousClass03S.A00();
    public final C04420Kh A05 = C04420Kh.A00();
    public final AnonymousClass0CH A06 = AnonymousClass0CH.A00();
    public final AnonymousClass2TJ A07 = AnonymousClass2TJ.A00();
    public final C04370Kc A08 = C04370Kc.A00();
    public final C02580Cq A09 = C02580Cq.A01();
    public final AbstractView$OnClickListenerC08330av A0A = new ViewOnClickCListenerShape13S0100000_I1_2(this, 48);
    public final AbstractView$OnClickListenerC08330av A0B = new ViewOnClickCListenerShape13S0100000_I1_2(this, 46);
    public final AbstractView$OnClickListenerC08330av A0C = new ViewOnClickCListenerShape13S0100000_I1_2(this, 49);
    public final AbstractView$OnClickListenerC08330av A0D = new ViewOnClickCListenerShape13S0100000_I1_2(this, 47);

    public AnonymousClass312(Context context) {
        super(context);
    }

    public void A00() {
        if (!(this instanceof AnonymousClass3OK)) {
            AnonymousClass3OI r0 = (AnonymousClass3OI) this;
            C28051Sr.A1e(((AnonymousClass312) r0).A00, r0.A01, r0.A0A, r0.A0D, r0.A0B, r0.A0C, new AnonymousClass3O4(r0));
            return;
        }
        AnonymousClass3OK r3 = (AnonymousClass3OK) this;
        C28051Sr.A1e(((AnonymousClass312) r3).A00, r3.A01, r3.A0A, r3.A0D, r3.A0B, r3.A0C, new AnonymousClass3O8(r3));
        r3.A02.setupMicBackgroudnColor(R.color.search_attachment_background);
        C28051Sr.A1h(r3.A01, r3.A02, ((AnonymousClass312) r3).A00);
        VoiceNoteProfileAvatarView voiceNoteProfileAvatarView = r3.A02;
        ImageView imageView = voiceNoteProfileAvatarView.A02;
        if (((AnonymousClass312) r3).A00.A0n.A02) {
            AnonymousClass0YX r1 = r3.A05;
            AnonymousClass01I r02 = r3.A03;
            r02.A04();
            AnonymousClass0HR r03 = r02.A01;
            if (r03 != null) {
                r1.A02(r03, imageView);
                return;
            }
            throw null;
        }
        voiceNoteProfileAvatarView.A00.setVisibility(8);
        imageView.setVisibility(0);
        AnonymousClass0MP r12 = ((AnonymousClass312) r3).A00;
        AnonymousClass02N r2 = r12.A0n.A00;
        if (r2 == null) {
            throw null;
        } else if (!AnonymousClass1VY.A0Y(r2) || (r2 = r12.A0G) != null) {
            r3.A05.A02(r3.A04.A0A(r2), imageView);
        } else {
            throw null;
        }
    }

    public AnonymousClass0MP getFMessageAudio() {
        return this.A00;
    }

    public final void setAudioMessage(AnonymousClass0MP r1) {
        this.A00 = r1;
        A00();
    }
}
