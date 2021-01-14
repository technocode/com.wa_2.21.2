package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.LinearLayout;
import com.google.android.search.verification.client.R;
import com.whatsapp.conversation.conversationrow.ConversationRowAudioPreview;
import com.whatsapp.search.views.itemviews.AudioPlayerView;

/* renamed from: X.3OI  reason: invalid class name */
public class AnonymousClass3OI extends AnonymousClass312 {
    public ConversationRowAudioPreview A00;
    public AudioPlayerView A01;
    public final AnonymousClass01X A02 = AnonymousClass01X.A00();
    public final AnonymousClass3SM A03 = new AnonymousClass3SM(AnonymousClass3OF.A00);

    public AnonymousClass3OI(Context context) {
        super(context);
        setOrientation(0);
        setGravity(16);
        LinearLayout.inflate(context, R.layout.search_attachment_audio, this);
        this.A00 = (ConversationRowAudioPreview) AnonymousClass0Q7.A0D(this, R.id.search_row_audio_preview);
        this.A01 = (AudioPlayerView) AnonymousClass0Q7.A0D(this, R.id.search_row_audio_controls);
        Drawable A032 = C004302a.A03(context, R.drawable.search_attachment_background);
        if (A032 != null) {
            setBackgroundDrawable(C002001d.A0e(A032, C004302a.A00(getContext(), R.color.search_attachment_background)));
            AnonymousClass3OH r3 = new AnonymousClass3OH(this);
            AnonymousClass3OE r2 = new AnonymousClass3OE(this);
            AudioPlayerView audioPlayerView = this.A01;
            audioPlayerView.setPlaybackListener(new AnonymousClass311(audioPlayerView, r2, r3));
            return;
        }
        throw null;
    }

    public final void A01() {
        AnonymousClass0MP r2 = super.A00;
        AnonymousClass3O5 r6 = new AnonymousClass3O5(this);
        AnonymousClass3O2 r7 = new AnonymousClass3O2(this);
        AudioPlayerView audioPlayerView = this.A01;
        C28051Sr.A1f(r2, audioPlayerView, new AnonymousClass3O1(this), new AnonymousClass3ZR(this, audioPlayerView, r6, r7, this.A00, r7), this.A02);
    }
}
