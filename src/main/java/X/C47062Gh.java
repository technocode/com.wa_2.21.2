package X;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.VoiceNoteSeekBar;
import com.whatsapp.contact.picker.SharedFilePreviewDialogFragment;
import com.whatsapp.util.ViewOnClickCListenerShape4S0200000_I1;
import java.io.File;

/* renamed from: X.2Gh  reason: invalid class name and case insensitive filesystem */
public class C47062Gh extends LinearLayout {
    public LinearLayout A00;
    public SharedFilePreviewDialogFragment A01;
    public C28301Tu A02;
    public final AnonymousClass01X A03 = AnonymousClass01X.A00();
    public final C04370Kc A04 = C04370Kc.A00();

    public C47062Gh(Context context) {
        super(context);
    }

    public void A00(SharedFilePreviewDialogFragment sharedFilePreviewDialogFragment, File file) {
        long j;
        this.A01 = sharedFilePreviewDialogFragment;
        ActivityC004902h A0A = sharedFilePreviewDialogFragment.A0A();
        if (A0A != null) {
            A0A.getLayoutInflater().inflate(R.layout.audio_data_view, (ViewGroup) this, true);
            this.A00 = (LinearLayout) findViewById(R.id.display);
            ImageView imageView = (ImageView) findViewById(R.id.image);
            ImageView imageView2 = (ImageView) findViewById(R.id.icon);
            TextView textView = (TextView) findViewById(R.id.audio_length);
            if (Build.VERSION.SDK_INT >= 21) {
                this.A00.setClipToOutline(true);
            }
            onConfigurationChanged(getResources().getConfiguration());
            if (file != null) {
                j = file.length();
            } else {
                j = 0;
            }
            AnonymousClass01X r5 = this.A03;
            String A1Y = C002001d.A1Y(r5, j);
            int A08 = C02230Bd.A08(file);
            String A1W = C002001d.A1W(r5, (long) A08);
            textView.setVisibility(0);
            textView.setText(A1W);
            int i = A08 * SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS;
            textView.setContentDescription(C002001d.A1X(r5, (long) Math.max(0, i)));
            ((TextView) findViewById(R.id.file_size)).setText(A1Y);
            imageView.setImageDrawable(new C06470Tj(r5, C004302a.A03(sharedFilePreviewDialogFragment.A0A(), R.drawable.audio_preview_background)));
            imageView.setContentDescription("");
            imageView2.setImageDrawable(new C06470Tj(r5, C004302a.A03(sharedFilePreviewDialogFragment.A0A(), R.drawable.ic_audio_forward_large)));
            ImageButton imageButton = (ImageButton) findViewById(R.id.control_btn);
            VoiceNoteSeekBar voiceNoteSeekBar = (VoiceNoteSeekBar) findViewById(R.id.audio_seekbar);
            AnonymousClass0MP r6 = new AnonymousClass0MP(new C007303n(null, true, ""), 0);
            ((AbstractC007503q) r6).A04 = 2;
            AnonymousClass0M4 r0 = new AnonymousClass0M4();
            r0.A0F = file;
            ((AnonymousClass0M3) r6).A02 = r0;
            if (!C28301Tu.A08(r6)) {
                this.A02 = C28301Tu.A01(sharedFilePreviewDialogFragment.A0A(), true);
                C28301Tu r02 = C28301Tu.A0i;
                if (r02 != null) {
                    r02.A0C();
                }
                C28301Tu r03 = this.A02;
                C28301Tu.A0i = r03;
                r03.A0G = r6;
            } else {
                this.A02 = C28301Tu.A0i;
            }
            voiceNoteSeekBar.setProgressColor(C004302a.A00(sharedFilePreviewDialogFragment.A0A(), R.color.music_scrubber));
            setControlButtonToPlay(this, imageButton);
            voiceNoteSeekBar.setProgress(0);
            voiceNoteSeekBar.setMax(i);
            C28301Tu r1 = this.A02;
            r1.A0E = new C51272Yb(this, imageButton, voiceNoteSeekBar, r6);
            voiceNoteSeekBar.setContentDescription(r5.A0D(R.string.voice_message_time_elapsed, C002001d.A1X(r5, (long) r1.A09())));
            imageButton.setOnClickListener(new ViewOnClickCListenerShape4S0200000_I1(this, file, 16));
            voiceNoteSeekBar.setOnSeekBarChangeListener(new C47052Gg(this, voiceNoteSeekBar));
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ViewGroup.LayoutParams layoutParams = this.A00.getLayoutParams();
        if (layoutParams != null) {
            if (configuration.orientation == 1) {
                layoutParams.height = this.A01.A02().getDimensionPixelSize(R.dimen.file_preview_display_height);
            } else {
                layoutParams.height = -1;
            }
            this.A00.setLayoutParams(layoutParams);
        }
    }

    public void onDetachedFromWindow() {
        C28301Tu r0 = this.A02;
        if (r0 != null) {
            r0.A0C();
        }
        super.onDetachedFromWindow();
    }

    public static void setControlButtonToPause(C47062Gh r1, ImageButton imageButton) {
        imageButton.setImageResource(R.drawable.inline_audio_pause);
        imageButton.setContentDescription(r1.A03.A06(R.string.pause));
    }

    public static void setControlButtonToPlay(C47062Gh r3, ImageButton imageButton) {
        AnonymousClass01X r2 = r3.A03;
        imageButton.setImageDrawable(new C06470Tj(r2, C004302a.A03(r3.A01.A0A(), R.drawable.inline_audio_play)));
        imageButton.setContentDescription(r2.A06(R.string.play));
    }
}
