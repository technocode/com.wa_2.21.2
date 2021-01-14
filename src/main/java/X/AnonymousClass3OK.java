package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.LinearLayout;
import com.google.android.search.verification.client.R;
import com.whatsapp.search.views.itemviews.AudioPlayerMetadataView;
import com.whatsapp.search.views.itemviews.AudioPlayerView;
import com.whatsapp.search.views.itemviews.VoiceNoteProfileAvatarView;

/* renamed from: X.3OK  reason: invalid class name */
public class AnonymousClass3OK extends AnonymousClass312 {
    public AudioPlayerMetadataView A00;
    public AudioPlayerView A01;
    public VoiceNoteProfileAvatarView A02;
    public final AnonymousClass01I A03 = AnonymousClass01I.A00();
    public final AnonymousClass01A A04 = AnonymousClass01A.A00();
    public final AnonymousClass0YX A05;
    public final AnonymousClass0L2 A06 = AnonymousClass0L2.A01();
    public final AnonymousClass01X A07 = AnonymousClass01X.A00();
    public final AnonymousClass3SM A08 = new AnonymousClass3SM(AnonymousClass3OF.A00);

    public AnonymousClass3OK(Context context) {
        super(context);
        this.A05 = this.A06.A03(context);
        setOrientation(0);
        setGravity(16);
        LinearLayout.inflate(context, R.layout.search_attachment_voice_note, this);
        this.A00 = (AudioPlayerMetadataView) AnonymousClass0Q7.A0D(this, R.id.search_row_voice_note_metadata);
        this.A01 = (AudioPlayerView) AnonymousClass0Q7.A0D(this, R.id.search_row_voice_note_controls);
        this.A02 = (VoiceNoteProfileAvatarView) AnonymousClass0Q7.A0D(this, R.id.search_row_voice_note_preview);
        Drawable A032 = C004302a.A03(context, R.drawable.search_attachment_background);
        if (A032 != null) {
            setBackgroundDrawable(C002001d.A0e(A032, C004302a.A00(getContext(), R.color.search_attachment_background)));
            AnonymousClass3OJ r3 = new AnonymousClass3OJ(this);
            AnonymousClass3OG r2 = new AnonymousClass3OG(this);
            AudioPlayerView audioPlayerView = this.A01;
            audioPlayerView.setPlaybackListener(new AnonymousClass311(audioPlayerView, r2, r3));
            return;
        }
        throw null;
    }

    public final void A01() {
        AnonymousClass0MP r2 = super.A00;
        AnonymousClass3O7 r6 = new AnonymousClass3O7(this);
        AnonymousClass3OA r7 = new AnonymousClass3OA(this);
        AudioPlayerView audioPlayerView = this.A01;
        C28051Sr.A1f(r2, audioPlayerView, new AnonymousClass3O9(this), new AnonymousClass3ZV(this, audioPlayerView, r6, r7, r7), this.A07);
    }
}
