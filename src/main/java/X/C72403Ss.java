package X;

import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.util.Log;
import com.whatsapp.videoplayback.ExoPlaybackControlView;

/* renamed from: X.3Ss  reason: invalid class name and case insensitive filesystem */
public final class C72403Ss extends AnonymousClass37M {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public AudioManager.OnAudioFocusChangeListener A06;
    public Uri A07;
    public AnonymousClass25O A08;
    public AnonymousClass25d A09;
    public AnonymousClass15D A0A;
    public C51642Zn A0B;
    public ExoPlaybackControlView A0C;
    public AnonymousClass37G A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public final Activity A0Q;
    public final Handler A0R;
    public final AnonymousClass12G A0S;
    public final AnonymousClass02M A0T;
    public final AnonymousClass03P A0U;
    public final AnonymousClass01X A0V;
    public final AnonymousClass00T A0W;
    public final C72413St A0X;
    public final C670136w A0Y;

    public C72403Ss(AnonymousClass02M r13, AnonymousClass00T r14, AnonymousClass03P r15, AnonymousClass01X r16, Activity activity, Uri uri, AbstractC72343Sm r19, AnonymousClass37G r20) {
        this(r13, r14, r15, r16, activity, true, null, r20, false);
        this.A07 = uri;
        r19.A00 = new AnonymousClass3SW(this);
        this.A0A = r19;
    }

    public C72403Ss(AnonymousClass02M r3, AnonymousClass00T r4, AnonymousClass03P r5, AnonymousClass01X r6, Activity activity, boolean z, C72413St r9, AnonymousClass37G r10, boolean z2) {
        this.A0R = new Handler(Looper.getMainLooper());
        this.A07 = new Uri.Builder().build();
        this.A00 = Integer.MAX_VALUE;
        this.A04 = 5;
        this.A03 = -1;
        this.A02 = 0;
        this.A0S = new C72393Sr(this);
        this.A0T = r3;
        this.A0W = r4;
        this.A0U = r5;
        this.A0V = r6;
        this.A0Q = activity;
        C670136w r0 = new C670136w(activity, z2);
        this.A0Y = r0;
        r0.setLayoutResizingEnabled(z);
        this.A0X = r9;
        this.A0D = r10;
    }

    public final AbstractC229313t A0E() {
        Uri uri = this.A07;
        AnonymousClass15D r3 = this.A0A;
        if (r3 == null) {
            Activity activity = this.A0Q;
            r3 = new C34441iU(activity, AnonymousClass0W2.A05(activity, C001801b.A0V(activity)));
            this.A0A = r3;
        }
        AnonymousClass25W r2 = new AnonymousClass25W(uri, r3, C34061hq.A0J);
        return this.A0I ? new C461728j(r2, this.A00) : r2;
    }

    public void A0F() {
        C51642Zn r1 = this.A0B;
        if (r1 != null) {
            r1.A00.A0p();
            r1.A00.A0r(false);
        }
    }

    public void A0G() {
        StringBuilder A0S2 = AnonymousClass008.A0S("ExoPlayerVideoPlayer/initialize  playerid=");
        A0S2.append(hashCode());
        Log.d(A0S2.toString());
        if (this.A08 == null) {
            ExoPlaybackControlView exoPlaybackControlView = this.A0C;
            if (exoPlaybackControlView != null) {
                if ((this.A0Q.getWindow().getDecorView().getSystemUiVisibility() & 4) == 0) {
                    exoPlaybackControlView.A0A.setVisibility(0);
                    if (exoPlaybackControlView.A06) {
                        exoPlaybackControlView.A09.setVisibility(0);
                    }
                    exoPlaybackControlView.A04();
                    exoPlaybackControlView.A03();
                    exoPlaybackControlView.A05();
                } else {
                    exoPlaybackControlView.A02();
                }
            }
            A0I();
            this.A0G = true;
            if (this.A0O) {
                AnonymousClass25O r0 = this.A08;
                if (r0 != null) {
                    r0.AOo(true);
                    ExoPlaybackControlView exoPlaybackControlView2 = this.A0C;
                    if (exoPlaybackControlView2 != null) {
                        exoPlaybackControlView2.A02 = null;
                        exoPlaybackControlView2.A03 = new AnonymousClass3SZ(this);
                    }
                    AnonymousClass02M r2 = this.A0T;
                    r2.A02.post(new RunnableEBaseShape13S0100000_I1_8(this, 27));
                }
            } else if (this.A0C == null) {
                AnonymousClass37G r02 = this.A0D;
                if (r02 != null) {
                    r02.A00();
                }
                this.A08.A07(A0E(), true, true);
            } else {
                AnonymousClass25O r03 = this.A08;
                if (r03 != null) {
                    r03.AOo(false);
                    ExoPlaybackControlView exoPlaybackControlView3 = this.A0C;
                    if (exoPlaybackControlView3 != null) {
                        exoPlaybackControlView3.A02 = new AnonymousClass3SY(this);
                        exoPlaybackControlView3.A03 = new AnonymousClass3SX(this);
                        return;
                    }
                    return;
                }
                throw null;
            }
        }
    }

    public void A0H() {
        if (this.A08 != null) {
            Log.d("ExoPlayerVideoPlayer/reinitializeWithNewVideo=");
            AnonymousClass25O r0 = this.A08;
            if (r0 == null || r0.A8R() == 1) {
                this.A0M = false;
            } else {
                this.A0M = true;
                this.A08.A00();
            }
            this.A0N = false;
            this.A0E = false;
            this.A0L = false;
            this.A0K = false;
            AnonymousClass37G r02 = this.A0D;
            if (r02 != null) {
                r02.A00();
            }
            this.A08.A07(A0E(), true, true);
            this.A0G = true;
        }
    }

    public final void A0I() {
        C670136w r4;
        int i;
        AnonymousClass25O A002;
        boolean z;
        if (this.A08 == null) {
            this.A09 = new AnonymousClass25d(new C34381iM());
            C72413St r0 = this.A0X;
            if (r0 != null) {
                r4 = this.A0Y;
                Context context = r4.getContext();
                AnonymousClass25d r2 = this.A09;
                C669936u r3 = r0.A00;
                int i2 = r3.A00;
                if (i2 < C669936u.A08) {
                    int i3 = i2 + 1;
                    r3.A00 = i3;
                    AnonymousClass008.A1K(AnonymousClass008.A0S("ExoPlayerVideoPlayerPoolManager/useHardwareDecoder numHardwareDecoders="), i3);
                    z = true;
                } else {
                    z = false;
                }
                i = -1;
                A002 = C224711x.A00(context, new AnonymousClass3T0(context, z), r2, new C33791hO(new AnonymousClass15H(), 500, SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS, 100, 100));
                this.A08 = A002;
            } else {
                r4 = this.A0Y;
                i = -1;
                A002 = C224711x.A00(r4.getContext(), new C72353Sn(r4.getContext()), this.A09, new C33791hO(new AnonymousClass15H(), SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS, 2000, SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS, SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS));
                this.A08 = A002;
            }
            float f = 1.0f;
            if (this.A0J) {
                f = 0.0f;
            }
            A002.A04(f);
            this.A08.A1n(this.A0S);
            r4.setPlayer(this.A08);
            if (this.A0P) {
                long j = this.A05;
                if (j == -9223372036854775807L) {
                    this.A08.ANV(this.A01, -9223372036854775807L);
                } else {
                    this.A08.ANV(this.A01, j);
                }
            } else {
                int i4 = this.A03;
                if (i4 >= 0) {
                    this.A08.ANW((long) i4);
                    this.A03 = i;
                }
            }
        }
    }

    public final void A0J() {
        AudioManager A092;
        if (!this.A0F && (A092 = this.A0U.A09()) != null) {
            AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.A06;
            if (onAudioFocusChangeListener == null) {
                onAudioFocusChangeListener = AnonymousClass36Z.A00;
                this.A06 = onAudioFocusChangeListener;
            }
            A092.requestAudioFocus(onAudioFocusChangeListener, 3, 2);
        }
    }

    public final void A0K(AbstractC229313t r3) {
        ExoPlaybackControlView exoPlaybackControlView = this.A0C;
        if (exoPlaybackControlView != null) {
            exoPlaybackControlView.A02 = null;
            exoPlaybackControlView.A03 = null;
        }
        A0I();
        AnonymousClass37G r0 = this.A0D;
        if (r0 != null) {
            r0.A00();
        }
        AnonymousClass25O r02 = this.A08;
        if (r02 != null && r02.A8R() == 1) {
            this.A08.A07(r3, true, true);
        }
        A0J();
    }

    public void A0L(String str, boolean z) {
        AnonymousClass008.A17("ExoPlayerVideoPlayer/onError=", str);
        AnonymousClass37J r0 = super.A02;
        if (r0 != null) {
            r0.AFe(str, z);
        }
        AnonymousClass37G r1 = this.A0D;
        if (r1 != null && !(r1 instanceof AnonymousClass3T3)) {
            ((C56832jG) r1).A09.A00();
        }
    }
}
