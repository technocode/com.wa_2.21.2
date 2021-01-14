package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.search.views.itemviews.AudioPlayerView;
import com.whatsapp.search.views.itemviews.VoiceNoteProfileAvatarView;

/* renamed from: X.2q3  reason: invalid class name and case insensitive filesystem */
public class C60742q3 extends C60332pG {
    public TextView A00;
    public final ImageView A01;
    public final ImageView A02;
    public final AnonymousClass0YX A03;
    public final AudioPlayerView A04 = ((AudioPlayerView) AnonymousClass0Q7.A0D(this, R.id.conversation_row_audio_player_view));
    public final VoiceNoteProfileAvatarView A05;

    public C60742q3(Context context, AnonymousClass0MP r4, AnonymousClass0YX r5) {
        super(context, r4);
        this.A03 = r5;
        VoiceNoteProfileAvatarView voiceNoteProfileAvatarView = (VoiceNoteProfileAvatarView) AnonymousClass0Q7.A0D(this, R.id.conversation_row_voice_note_profile_avatar);
        this.A05 = voiceNoteProfileAvatarView;
        this.A02 = voiceNoteProfileAvatarView.A02;
        this.A01 = voiceNoteProfileAvatarView.A00;
        this.A00 = (TextView) findViewById(R.id.description);
        A09();
    }

    private void A09() {
        AnonymousClass0MP fMessage = getFMessage();
        AudioPlayerView audioPlayerView = this.A04;
        VoiceNoteProfileAvatarView voiceNoteProfileAvatarView = this.A05;
        C28051Sr.A1h(audioPlayerView, voiceNoteProfileAvatarView, fMessage);
        AnonymousClass0YX r10 = this.A03;
        AnonymousClass01I r0 = ((AbstractC51572Zg) this).A0X;
        AnonymousClass01A r9 = this.A0e;
        ImageView imageView = voiceNoteProfileAvatarView.A02;
        C007303n r7 = fMessage.A0n;
        boolean z = r7.A02;
        if (z) {
            r0.A04();
            r10.A02(r0.A01, imageView);
        } else {
            ImageView imageView2 = voiceNoteProfileAvatarView.A00;
            AnonymousClass02N r2 = r7.A00;
            if (AnonymousClass1VY.A0Y(r2)) {
                imageView2.setVisibility(0);
                imageView.setVisibility(8);
                r2 = fMessage.A0G;
                if (r2 != null) {
                    imageView = imageView2;
                } else {
                    throw null;
                }
            } else {
                imageView2.setVisibility(8);
                imageView.setVisibility(0);
                if (r2 == null) {
                    throw null;
                }
            }
            r10.A02(r9.A0A(r2), imageView);
        }
        if (!z && AnonymousClass1VY.A0Y(r7.A00)) {
            findViewById(R.id.conversation_row_audio_player_view).setPadding(0, (int) (C002301g.A0K.A00 * 8.0f), 0, 0);
        }
        A0l(fMessage);
    }

    @Override // X.AbstractC51572Zg, X.C60332pG
    public void A0K() {
        super.A0K();
        A09();
    }

    @Override // X.AbstractC51572Zg, X.C60332pG
    public void A0P() {
        AnonymousClass0MP fMessage = getFMessage();
        if (!(getRowsContainer() instanceof AbstractC03670He) || !((AbstractC03670He) getRowsContainer()).ABZ()) {
            super.A0P();
            return;
        }
        AnonymousClass03S r1 = ((AbstractC59162nB) this).A02;
        if (r1 == null || RequestPermissionActivity.A0N(getContext(), r1)) {
            Context context = getContext();
            AnonymousClass2ZJ r5 = new AnonymousClass2ZJ(this);
            C04370Kc r6 = ((AnonymousClass2I2) this).A0X;
            if (r6 == null) {
                throw null;
            } else if (C28051Sr.A1v(fMessage, context, r5, r6, ((AbstractC51572Zg) this).A0V, this.A1E)) {
                C28301Tu A0b = C28051Sr.A0b(fMessage, C02780Dk.A00(getContext()));
                A0b.A0N(fMessage);
                A0b.A0F = new AnonymousClass2ZI(this);
                ((AbstractC03670He) getRowsContainer()).AOH(true);
                A0b.A0D = new AnonymousClass2ZW(this, fMessage, A0b);
                A0b.A0D();
                super.A0K();
                A09();
            }
        }
    }

    @Override // X.AbstractC51572Zg, X.C60332pG
    public void A0Z(AbstractC007503q r3, boolean z) {
        boolean z2 = false;
        if (r3 != getFMessage()) {
            z2 = true;
        }
        super.A0Z(r3, z);
        if (z || z2) {
            A09();
        }
    }

    @Override // X.AnonymousClass2I2, X.C60332pG
    public int getCenteredLayoutId() {
        return R.layout.conversation_row_voice_note_left;
    }

    @Override // X.AbstractC59162nB, X.C60332pG
    public ViewGroup getExternalAdContentHolder() {
        return (ViewGroup) findViewById(R.id.web_page_preview_holder);
    }

    @Override // X.AnonymousClass2I2, X.C60332pG
    public int getIncomingLayoutId() {
        return R.layout.conversation_row_voice_note_left;
    }

    @Override // X.AnonymousClass2I2, X.C60332pG
    public int getOutgoingLayoutId() {
        return R.layout.conversation_row_voice_note_right;
    }

    @Override // X.C60332pG
    public void setDuration(String str) {
        TextView textView = this.A00;
        if (textView == null) {
            textView = (TextView) findViewById(R.id.description);
            this.A00 = textView;
        }
        textView.setText(str);
    }
}
