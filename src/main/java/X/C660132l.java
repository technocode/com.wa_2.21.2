package X;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.32l  reason: invalid class name and case insensitive filesystem */
public class C660132l {
    public static volatile C660132l A08;
    public AudioFocusRequest A00;
    public AudioManager.OnAudioFocusChangeListener A01;
    public Handler A02;
    public Object A03;
    public List A04;
    public boolean A05;
    public final AnonymousClass03P A06;
    public final Runnable A07 = new RunnableEBaseShape12S0100000_I1_7(this, 46);

    public C660132l(AnonymousClass03P r3) {
        this.A06 = r3;
    }

    public static C660132l A00() {
        if (A08 == null) {
            synchronized (C660132l.class) {
                if (A08 == null) {
                    A08 = new C660132l(AnonymousClass03P.A00());
                }
            }
        }
        return A08;
    }

    public final AudioFocusRequest A01() {
        AudioFocusRequest audioFocusRequest = this.A00;
        if (audioFocusRequest != null) {
            return audioFocusRequest;
        }
        AudioFocusRequest build = new AudioFocusRequest.Builder(2).setAudioAttributes(new AudioAttributes.Builder().setUsage(1).build()).build();
        this.A00 = build;
        return build;
    }

    public final void A02() {
        if (this.A03 != null) {
            Log.i("AudioManager/audio-focus-abandoned");
            this.A03 = null;
            AudioManager A09 = this.A06.A09();
            if (A09 == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                A09.abandonAudioFocusRequest(A01());
                return;
            }
            AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.A01;
            if (onAudioFocusChangeListener == null) {
                onAudioFocusChangeListener = C659932j.A00;
                this.A01 = onAudioFocusChangeListener;
            }
            A09.abandonAudioFocus(onAudioFocusChangeListener);
        }
    }
}
