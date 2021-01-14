package X;

import android.widget.ImageButton;
import com.google.android.search.verification.client.R;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.VoiceNoteSeekBar;

/* renamed from: X.2Yb  reason: invalid class name and case insensitive filesystem */
public class C51272Yb implements AbstractC47572Im {
    public int A00 = -1;
    public final /* synthetic */ ImageButton A01;
    public final /* synthetic */ VoiceNoteSeekBar A02;
    public final /* synthetic */ C47062Gh A03;
    public final /* synthetic */ AnonymousClass0MP A04;

    @Override // X.AbstractC47572Im
    public void AFP(boolean z) {
    }

    public C51272Yb(C47062Gh r2, ImageButton imageButton, VoiceNoteSeekBar voiceNoteSeekBar, AnonymousClass0MP r5) {
        this.A03 = r2;
        this.A01 = imageButton;
        this.A02 = voiceNoteSeekBar;
        this.A04 = r5;
    }

    @Override // X.AbstractC47572Im
    public AnonymousClass0MP A6J() {
        return this.A04;
    }

    @Override // X.AbstractC47572Im
    public void AIK(int i) {
        C47062Gh.setControlButtonToPlay(this.A03, this.A01);
    }

    @Override // X.AbstractC47572Im
    public void AIr(int i) {
        int i2 = this.A00;
        int i3 = i / SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS;
        if (i2 != i3) {
            this.A00 = i3;
        }
        VoiceNoteSeekBar voiceNoteSeekBar = this.A02;
        voiceNoteSeekBar.setProgress(i);
        AnonymousClass01X r4 = this.A03.A03;
        voiceNoteSeekBar.setContentDescription(r4.A0D(R.string.voice_message_time_elapsed, C002001d.A1X(r4, (long) i)));
    }

    @Override // X.AbstractC47572Im
    public void AJj() {
        C47062Gh.setControlButtonToPause(this.A03, this.A01);
    }

    @Override // X.AbstractC47572Im
    public void AKJ(int i) {
        C47062Gh.setControlButtonToPause(this.A03, this.A01);
        this.A02.setMax(i);
        this.A00 = -1;
    }

    @Override // X.AbstractC47572Im
    public void AKb(int i) {
        C47062Gh.setControlButtonToPlay(this.A03, this.A01);
        this.A02.setProgress(0);
    }
}
