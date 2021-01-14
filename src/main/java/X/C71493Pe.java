package X;

import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.search.verification.client.R;
import com.whatsapp.doodle.DoodleView;
import com.whatsapp.mediaview.PhotoView;
import com.whatsapp.util.Log;
import com.whatsapp.videoplayback.ExoPlayerErrorFrame;
import java.io.File;
import java.io.IOException;
import java.util.List;
import org.json.JSONException;

/* renamed from: X.3Pe  reason: invalid class name and case insensitive filesystem */
public class C71493Pe extends AnonymousClass32V {
    public float A00 = 0.0f;
    public AnonymousClass2MM A01;
    public AnonymousClass37M A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07 = true;
    public final View A08;
    public final FrameLayout A09;
    public final FrameLayout A0A;
    public final AnonymousClass1MC A0B;
    public final C000300f A0C;
    public final DoodleView A0D;
    public final C002701k A0E;
    public final C02770Dj A0F;
    public final PhotoView A0G;
    public final AnonymousClass0MO A0H;
    public final AbstractC660032k A0I;
    public final C660132l A0J;
    public final C02580Cq A0K;
    public final AnonymousClass00T A0L;
    public final ExoPlayerErrorFrame A0M;
    public final AnonymousClass37E A0N;

    public C71493Pe(C002701k r21, AnonymousClass02M r22, AnonymousClass00T r23, AnonymousClass088 r24, C02590Cr r25, C000300f r26, C02780Dk r27, C02770Dj r28, AnonymousClass03P r29, AnonymousClass01X r30, C02560Co r31, C02580Cq r32, AnonymousClass37E r33, AnonymousClass0D1 r34, AnonymousClass1MC r35, C660132l r36, AbstractC71653Pu r37, AbstractC007503q r38) {
        super(r22, r29, r30, r31, r27, r37);
        String str;
        Throwable e;
        this.A0E = r21;
        this.A0C = r26;
        this.A0F = r28;
        this.A0L = r23;
        this.A0K = r32;
        this.A0N = r33;
        this.A0B = r35;
        this.A0J = r36;
        DoodleView doodleView = null;
        this.A0H = (AnonymousClass0MO) r38;
        this.A0A = (FrameLayout) C02780Dk.A00(A01()).findViewById(R.id.video_playback_container);
        this.A08 = C02780Dk.A00(A01()).findViewById(R.id.video_playback_container_overlay);
        this.A09 = new FrameLayout(A01());
        PhotoView photoView = new PhotoView(A01());
        this.A0G = photoView;
        photoView.A01 = 0.0f;
        photoView.A0Y = false;
        if (0 == 0) {
            photoView.A02();
        }
        PhotoView photoView2 = this.A0G;
        photoView2.A0V = false;
        photoView2.setEnabled(false);
        this.A0G.setBackgroundColor(A01().getResources().getColor(R.color.black));
        this.A0M = new ExoPlayerErrorFrame(A01(), null);
        this.A09.addView(this.A0G);
        this.A09.addView(this.A0M);
        this.A09.setId(R.id.status_playback_video);
        A0G();
        AnonymousClass0MO r0 = this.A0H;
        AnonymousClass0M4 r4 = ((AnonymousClass0M3) r0).A02;
        if (r4 != null) {
            if (r0.A0n.A02 && !r4.A0P && !r4.A0O && (str = r4.A0H) != null) {
                File A0K2 = C02230Bd.A0K(r24, str);
                if (A0K2.exists()) {
                    AnonymousClass2Mt r5 = new AnonymousClass2Mt();
                    try {
                        DoodleView doodleView2 = new DoodleView(A01());
                        try {
                            r5.A07(A0K2, A01(), r25, r26, r21, r30, r34);
                            doodleView2.setLayerType(1, null);
                            doodleView2.setEnabled(false);
                            doodleView2.setDoodle(r5);
                            this.A09.addView(doodleView2, new FrameLayout.LayoutParams(-1, -1, 17));
                            doodleView = doodleView2;
                        } catch (IOException | JSONException e2) {
                            e = e2;
                            doodleView = doodleView2;
                        }
                    } catch (IOException | JSONException e3) {
                        e = e3;
                        StringBuilder A0S = AnonymousClass008.A0S("statusplaybackvideo/error loading doodle for ");
                        A0S.append(this.A0H.A0n);
                        Log.e(A0S.toString(), e);
                        this.A0D = doodleView;
                        this.A0I = new C71473Pc(this);
                        return;
                    }
                }
            }
            this.A0D = doodleView;
            this.A0I = new C71473Pc(this);
            return;
        }
        throw null;
    }

    @Override // X.AnonymousClass32V
    public long A00() {
        long j;
        AnonymousClass0MO r0 = this.A0H;
        AnonymousClass0M4 r3 = ((AnonymousClass0M3) r0).A02;
        if (r3 != null) {
            long j2 = 0;
            if (r0.A0n.A02 && !r3.A0P && !r3.A0O) {
                long j3 = r3.A0D;
                if (j3 >= 0) {
                    long j4 = r3.A0E;
                    if (j4 > 0) {
                        j = j4 - j3;
                        return Math.min(((long) this.A0C.A06(AbstractC000400g.A3x)) * 1000, j);
                    }
                }
            }
            AnonymousClass37M r02 = this.A02;
            if (r02 != null) {
                j2 = (long) r02.A02();
            }
            j = j2;
            return Math.min(((long) this.A0C.A06(AbstractC000400g.A3x)) * 1000, j);
        }
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0069  */
    @Override // X.AnonymousClass32V
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04() {
        /*
        // Method dump skipped, instructions count: 142
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71493Pe.A04():void");
    }

    @Override // X.AnonymousClass32V
    public void A05() {
        A0H("stopPlayback");
        AnonymousClass37M r1 = this.A02;
        if (r1 != null && !r1.A0D()) {
            r1.A08();
        }
        DoodleView doodleView = this.A0D;
        if (doodleView != null) {
            doodleView.A0V = false;
            doodleView.invalidate();
        }
        A0B();
        A0E();
        this.A08.setVisibility(0);
        A0G();
        this.A00 = 0.0f;
        this.A07 = true;
        C660132l r0 = this.A0J;
        AbstractC660032k r12 = this.A0I;
        List list = r0.A04;
        if (list != null) {
            list.remove(r12);
        }
    }

    public final int A09() {
        AnonymousClass37M r6 = this.A02;
        if (r6 == null) {
            return 0;
        }
        AnonymousClass0MO r0 = this.A0H;
        AnonymousClass0M4 r5 = ((AnonymousClass0M3) r0).A02;
        if (r5 == null) {
            throw null;
        } else if (!r0.A0n.A02 || r5.A0P || r5.A0O || r5.A0D < 0 || r5.A0E <= 0) {
            return r6.A01();
        } else {
            return r6.A01() - ((int) r5.A0D);
        }
    }

    public final String A0A() {
        StringBuilder A0S = AnonymousClass008.A0S("videoContainer=");
        boolean z = true;
        boolean z2 = false;
        if (this.A0A.getVisibility() == 0) {
            z2 = true;
        }
        A0S.append(z2);
        A0S.append("videoPlaybackContainerOverlay=");
        boolean z3 = false;
        if (this.A08.getVisibility() == 0) {
            z3 = true;
        }
        A0S.append(z3);
        A0S.append("photoView=");
        boolean z4 = false;
        if (this.A0G.getVisibility() == 0) {
            z4 = true;
        }
        A0S.append(z4);
        A0S.append("mainView=");
        if (this.A09.getVisibility() != 0) {
            z = false;
        }
        A0S.append(z);
        A0S.append(" isPlaybackStarted=");
        A0S.append(super.A05.A00.A05);
        return A0S.toString();
    }

    public final void A0B() {
        C660132l r1 = this.A0J;
        if (r1 != null) {
            Log.i("AudioManager/on-abandon-audio-focus");
            if (r1.A03 == this) {
                Handler handler = r1.A02;
                Runnable runnable = r1.A07;
                handler.removeCallbacks(runnable);
                r1.A02.postDelayed(runnable, 1000);
            }
            this.A03 = false;
            return;
        }
        throw null;
    }

    public final void A0C() {
        PhotoView photoView = this.A0G;
        if (photoView.getVisibility() == 0) {
            View decorView = C02780Dk.A00(A01()).getWindow().getDecorView();
            this.A0K.A0D(this.A0H, photoView, new C71483Pd(this, Math.max(decorView.getWidth(), decorView.getHeight())), false);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0253  */
    /* JADX WARNING: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0D() {
        /*
        // Method dump skipped, instructions count: 627
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71493Pe.A0D():void");
    }

    public final void A0E() {
        A0H("releaseVideoPlayer");
        this.A0M.setVisibility(8);
        AnonymousClass37M r1 = this.A02;
        if (r1 != null) {
            r1.A01 = null;
            r1.A03 = null;
            r1.A02 = null;
            r1.A00 = null;
            if (r1.A0D()) {
                C72403Ss r3 = this.A0N.A00;
                if (r3 != null) {
                    AnonymousClass25O r0 = r3.A08;
                    if (r0 == null || r0.A8R() == 1) {
                        r3.A0M = false;
                    } else {
                        r3.A0M = true;
                        r3.A08.A00();
                    }
                }
            } else {
                r1.A08();
            }
            this.A02.A06();
            this.A02 = null;
        }
    }

    public final void A0F() {
        if (!this.A05 && !this.A03 && super.A05.A00.A05) {
            this.A03 = true;
            C660132l r4 = this.A0J;
            if (r4 != null) {
                Log.i("AudioManager/on-request-audio-focus");
                r4.A02.removeCallbacks(r4.A07);
                if (r4.A03 == null) {
                    Log.i("AudioManager/request-audio-focus");
                    AudioManager A092 = r4.A06.A09();
                    if (A092 != null) {
                        if (Build.VERSION.SDK_INT >= 26) {
                            A092.requestAudioFocus(r4.A01());
                        } else {
                            AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = r4.A01;
                            if (onAudioFocusChangeListener == null) {
                                onAudioFocusChangeListener = C659932j.A00;
                                r4.A01 = onAudioFocusChangeListener;
                            }
                            A092.requestAudioFocus(onAudioFocusChangeListener, 3, 2);
                        }
                    }
                }
                r4.A03 = this;
                return;
            }
            throw null;
        }
    }

    public final void A0G() {
        PhotoView photoView = this.A0G;
        if (photoView.getVisibility() != 0) {
            A0H("showThumbnail");
            photoView.setVisibility(0);
        }
    }

    public final void A0H(String str) {
        StringBuilder A0Z = AnonymousClass008.A0Z("StatusPlaybackVideo/", str, " ");
        A0Z.append(A0A());
        A0Z.append(" id=");
        AnonymousClass008.A1S(A0Z, this.A0H.A0n.A01);
    }
}
