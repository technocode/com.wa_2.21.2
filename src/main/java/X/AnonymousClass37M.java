package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import com.whatsapp.util.Log;
import com.whatsapp.videoplayback.ExoPlaybackControlView;
import java.io.File;

/* renamed from: X.37M  reason: invalid class name */
public abstract class AnonymousClass37M {
    public AnonymousClass37H A00;
    public AnonymousClass37I A01;
    public AnonymousClass37J A02;
    public AnonymousClass37K A03;
    public AnonymousClass37L A04;

    public static AnonymousClass37M A00(AnonymousClass02M r13, AnonymousClass00T r14, AnonymousClass03P r15, AnonymousClass01X r16, Context context, File file, boolean z, boolean z2, boolean z3) {
        if (z2) {
            boolean z4 = false;
            if (!C006803i.A0g()) {
                z4 = true;
            }
            if (z4) {
                C72403Ss r3 = new C72403Ss(r13, r14, r15, r16, C02780Dk.A00(context), true, null, null, z3);
                r3.A07 = Uri.fromFile(file);
                r3.A0I = z;
                r3.A0G();
                r3.A0F = true;
                return r3;
            }
        }
        Log.d("VideoPlayer/createSystemVideoPlayer");
        String absolutePath = file.getAbsolutePath();
        if (!z3) {
            return new AnonymousClass3T7(context, absolutePath, z);
        }
        return new AnonymousClass3T5(context, absolutePath, z);
    }

    public int A01() {
        if (this instanceof AnonymousClass3T7) {
            return ((AnonymousClass3T7) this).A00.getCurrentPosition();
        }
        if (this instanceof AnonymousClass3T5) {
            return ((AnonymousClass3T5) this).A00.getCurrentPosition();
        }
        if (this instanceof C72443Sw) {
            throw new UnsupportedOperationException("not implemented yet");
        } else if (!(this instanceof C72403Ss)) {
            return (int) ((AnonymousClass3PV) this).A02.A00();
        } else {
            AnonymousClass25O r0 = ((C72403Ss) this).A08;
            if (r0 != null) {
                return (int) r0.A5n();
            }
            return 0;
        }
    }

    public int A02() {
        if (this instanceof AnonymousClass3T7) {
            return ((AnonymousClass3T7) this).A00.getDuration();
        }
        if (this instanceof AnonymousClass3T5) {
            return ((AnonymousClass3T5) this).A00.getDuration();
        }
        if (this instanceof C72443Sw) {
            return ((C72443Sw) this).A03.A01.getDuration();
        }
        if (!(this instanceof C72403Ss)) {
            return (int) ((AnonymousClass3PV) this).A02.A03;
        }
        AnonymousClass25O r0 = ((C72403Ss) this).A08;
        if (r0 != null) {
            return (int) r0.A67();
        }
        return 0;
    }

    public Bitmap A03() {
        if (this instanceof AnonymousClass3T7) {
            return ((AnonymousClass3T7) this).A00.getBitmap();
        }
        if (this instanceof AnonymousClass3T5) {
            return null;
        }
        if (this instanceof C72443Sw) {
            C72443Sw r4 = (C72443Sw) this;
            Drawable current = r4.A01.getCurrent();
            if (current instanceof BitmapDrawable) {
                return ((BitmapDrawable) current).getBitmap();
            }
            Bitmap bitmap = r4.A00;
            if (bitmap == null) {
                bitmap = Bitmap.createBitmap(Math.max(current.getIntrinsicWidth(), 1), Math.max(current.getIntrinsicHeight(), 1), Bitmap.Config.ARGB_8888);
                r4.A00 = bitmap;
            }
            Canvas canvas = new Canvas(bitmap);
            current.draw(canvas);
            current.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            return r4.A00;
        } else if (!(this instanceof C72403Ss)) {
            return null;
        } else {
            C72403Ss r1 = (C72403Ss) this;
            if (r1.A0M || r1.A08 == null || !r1.A0L) {
                return null;
            }
            return r1.A0Y.getCurrentFrame();
        }
    }

    public View A04() {
        if (this instanceof AnonymousClass3T7) {
            return ((AnonymousClass3T7) this).A00;
        }
        if (this instanceof AnonymousClass3T5) {
            return ((AnonymousClass3T5) this).A00;
        }
        if (this instanceof C72443Sw) {
            return ((C72443Sw) this).A02;
        }
        if (!(this instanceof C72403Ss)) {
            return ((AnonymousClass3PV) this).A01;
        }
        return ((C72403Ss) this).A0Y;
    }

    public void A05() {
        if (this instanceof AnonymousClass3T7) {
            ((AnonymousClass3T7) this).A00.pause();
        } else if (this instanceof AnonymousClass3T5) {
            ((AnonymousClass3T5) this).A00.pause();
        } else if (this instanceof C72443Sw) {
            ((C72443Sw) this).A01.stop();
        } else if (!(this instanceof C72403Ss)) {
            AnonymousClass3PV r1 = (AnonymousClass3PV) this;
            r1.A02.A02();
            r1.A00.removeMessages(0);
        } else {
            AnonymousClass25O r12 = ((C72403Ss) this).A08;
            if (r12 != null) {
                r12.AOo(false);
            }
        }
    }

    public void A06() {
        C72403Ss r1;
        AnonymousClass37G r6;
        int i;
        if ((this instanceof C72403Ss) && (r6 = (r1 = (C72403Ss) this).A0D) != null) {
            r6.A00 = r1.A04;
            int i2 = r1.A02;
            if (!(r6 instanceof AnonymousClass3T3)) {
                C56832jG r62 = (C56832jG) r6;
                C63922xE r2 = r62.A0C;
                r2.A00();
                r62.A0B.A00();
                C63922xE r5 = r62.A0A;
                r5.A00();
                C63922xE r3 = r62.A09;
                r3.A00();
                r62.A03 = (long) i2;
                C444220b r4 = new C444220b();
                AnonymousClass1WB r12 = r62.A04;
                if (r12 != null) {
                    r4.A09 = r12.A01();
                    r4.A02 = Double.valueOf((double) r12.A00());
                    r4.A0A = Long.valueOf(((long) r62.A04.A01) + 1);
                }
                r4.A01 = Double.valueOf((double) r62.A02);
                r4.A07 = Long.valueOf(r5.A00);
                r4.A0D = Long.valueOf(r3.A00);
                r4.A0C = Long.valueOf((long) r62.A01);
                long j = r2.A00;
                r4.A08 = Long.valueOf(j);
                int i3 = r62.A00;
                boolean z = true;
                if (i3 == 0) {
                    i = 1;
                } else if (i3 == 1) {
                    i = 2;
                } else if (i3 == 2) {
                    i = 3;
                } else if (i3 == 3) {
                    i = 4;
                } else if (i3 != 5) {
                    i = 1;
                } else {
                    i = 6;
                }
                r4.A06 = i;
                r4.A0B = Long.valueOf(r62.A03);
                if (j <= 0) {
                    z = false;
                }
                r4.A00 = Boolean.valueOf(z);
                r4.A05 = Integer.valueOf(r62.A07);
                AnonymousClass0ML r7 = r62.A0D;
                r4.A0E = Long.valueOf((long) ((AnonymousClass0M3) r7).A00);
                r4.A03 = Double.valueOf((double) ((AnonymousClass0M3) r7).A01);
                r4.A04 = Integer.valueOf(AnonymousClass0AH.A01(r7));
                r62.A08.A0B(r4, null, false);
                return;
            }
            AnonymousClass3T3 r63 = (AnonymousClass3T3) r6;
            if (r63.A01) {
                AnonymousClass21O r52 = new AnonymousClass21O();
                r52.A03 = r63.A00;
                r52.A02 = Integer.valueOf(((AnonymousClass37G) r63).A01);
                C63922xE r42 = r63.A08;
                r52.A07 = Long.valueOf(r42.A00 / 1000);
                r52.A06 = Long.valueOf(r63.A07.A00);
                if (r63.A05.A00 != null) {
                    r52.A04 = Long.valueOf((System.currentTimeMillis() - r63.A04) / 1000);
                    r52.A05 = Long.valueOf(r63.A03);
                    r52.A00 = Double.valueOf((double) r63.A02);
                    r52.A01 = Integer.valueOf(((AnonymousClass37G) r63).A00);
                    r63.A06.A0B(r52, null, false);
                    r63.A01 = false;
                    r42.A01();
                    return;
                }
                throw null;
            }
        }
    }

    public void A07() {
        if (this instanceof AnonymousClass3T7) {
            ((AnonymousClass3T7) this).A00.start();
        } else if (this instanceof AnonymousClass3T5) {
            ((AnonymousClass3T5) this).A00.start();
        } else if (this instanceof C72443Sw) {
            ((C72443Sw) this).A01.start();
        } else if (!(this instanceof C72403Ss)) {
            AnonymousClass3PV r4 = (AnonymousClass3PV) this;
            r4.A02.A01();
            Handler handler = r4.A00;
            handler.removeMessages(0);
            handler.sendEmptyMessageDelayed(0, (long) (r4.A02() - r4.A01()));
        } else {
            C72403Ss r2 = (C72403Ss) this;
            StringBuilder A0S = AnonymousClass008.A0S("ExoPlayerVideoPlayer/start  playerid=");
            A0S.append(r2.hashCode());
            Log.d(A0S.toString());
            if (r2.A08 != null) {
                r2.A0J();
                r2.A08.AOo(true);
                return;
            }
            r2.A0O = true;
            r2.A0G();
        }
    }

    public void A08() {
        AudioManager A09;
        long j;
        if (this instanceof AnonymousClass3T7) {
            AnonymousClass37V r1 = ((AnonymousClass3T7) this).A00;
            MediaPlayer mediaPlayer = r1.A09;
            if (mediaPlayer != null) {
                mediaPlayer.reset();
                r1.A09.release();
                r1.A09 = null;
                r1.A0H = false;
                r1.A00 = 0;
                r1.A03 = 0;
            }
        } else if (this instanceof AnonymousClass3T5) {
            ((AnonymousClass3T5) this).A00.A00();
        } else if (this instanceof C72443Sw) {
            C72443Sw r12 = (C72443Sw) this;
            r12.A03.close();
            r12.A01.stop();
        } else if (!(this instanceof C72403Ss)) {
            AnonymousClass3PV r13 = (AnonymousClass3PV) this;
            r13.A02.A02();
            r13.A00.removeMessages(0);
        } else {
            C72403Ss r3 = (C72403Ss) this;
            StringBuilder A0S = AnonymousClass008.A0S("ExoPlayerVideoPlayer/stop playerid=");
            A0S.append(r3.hashCode());
            Log.d(A0S.toString());
            r3.A0N = false;
            r3.A0G = false;
            AnonymousClass25O r0 = r3.A08;
            if (r0 != null) {
                r3.A0O = r0.A8P();
                r3.A08.AOo(false);
                r3.A0P = false;
                AnonymousClass12R A5q = r3.A08.A5q();
                if (A5q != null && !A5q.A0D()) {
                    int A5r = r3.A08.A5r();
                    r3.A01 = A5r;
                    AnonymousClass12Q A0A = A5q.A0A(A5r, new AnonymousClass12Q());
                    r3.A0P = true;
                    if (A0A.A03) {
                        j = r3.A08.A5n();
                    } else {
                        j = -9223372036854775807L;
                    }
                    r3.A05 = j;
                }
                r3.A08.A00();
                AnonymousClass25O r02 = r3.A08;
                r02.A03();
                r02.A03();
                r02.A01();
                r02.A06(null, false);
                r02.A05(0, 0);
                r3.A08.AMe(r3.A0S);
                r3.A0W.ANF(new RunnableEBaseShape13S0100000_I1_8(r3.A08, 28));
                r3.A08 = null;
                AnonymousClass37L r03 = ((AnonymousClass37M) r3).A04;
                if (r03 != null) {
                    r03.AIY(false, 1);
                }
                C670136w r04 = r3.A0Y;
                r04.A01 = null;
                C669836s r05 = r04.A03;
                if (r05 != null) {
                    r05.A00();
                }
                r3.A09 = null;
                ExoPlaybackControlView exoPlaybackControlView = r3.A0C;
                if (exoPlaybackControlView != null) {
                    exoPlaybackControlView.setPlayer(null);
                    ExoPlaybackControlView exoPlaybackControlView2 = r3.A0C;
                    exoPlaybackControlView2.removeCallbacks(exoPlaybackControlView2.A0K);
                    exoPlaybackControlView2.removeCallbacks(exoPlaybackControlView2.A0L);
                }
                if (!r3.A0F && (A09 = r3.A0U.A09()) != null) {
                    AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = r3.A06;
                    if (onAudioFocusChangeListener == null) {
                        onAudioFocusChangeListener = AnonymousClass36Z.A00;
                        r3.A06 = onAudioFocusChangeListener;
                    }
                    A09.abandonAudioFocus(onAudioFocusChangeListener);
                }
            }
        }
    }

    public void A09(int i) {
        if (this instanceof AnonymousClass3T7) {
            ((AnonymousClass3T7) this).A00.seekTo(i);
        } else if (this instanceof AnonymousClass3T5) {
            ((AnonymousClass3T5) this).A00.seekTo(i);
        } else if (this instanceof C72443Sw) {
            throw new UnsupportedOperationException("not implemented yet");
        } else if (!(this instanceof C72403Ss)) {
            AnonymousClass3PV r4 = (AnonymousClass3PV) this;
            AnonymousClass32U r2 = r4.A02;
            r2.A00 = (long) i;
            r2.A01 = SystemClock.elapsedRealtime();
            Handler handler = r4.A00;
            handler.removeMessages(0);
            handler.sendEmptyMessageDelayed(0, (long) (r4.A02() - r4.A01()));
        } else {
            C72403Ss r0 = (C72403Ss) this;
            AnonymousClass25O r22 = r0.A08;
            if (r22 != null) {
                r22.ANW((long) i);
            } else {
                r0.A03 = i;
            }
        }
    }

    public void A0A(boolean z) {
        if (this instanceof AnonymousClass3T7) {
            ((AnonymousClass3T7) this).A00.setMute(z);
        } else if (this instanceof AnonymousClass3T5) {
            ((AnonymousClass3T5) this).A00.setMute(z);
        } else if (!(this instanceof C72443Sw) && (this instanceof C72403Ss)) {
            C72403Ss r0 = (C72403Ss) this;
            r0.A0J = z;
            AnonymousClass25O r1 = r0.A08;
            if (r1 != null) {
                float f = 1.0f;
                if (z) {
                    f = 0.0f;
                }
                r1.A04(f);
            }
        }
    }

    public boolean A0B() {
        if (this instanceof AnonymousClass3T7) {
            return ((AnonymousClass3T7) this).A00.isPlaying();
        }
        if (this instanceof AnonymousClass3T5) {
            return ((AnonymousClass3T5) this).A00.isPlaying();
        }
        if (this instanceof C72443Sw) {
            return ((C72443Sw) this).A01.A0F;
        }
        if (!(this instanceof C72403Ss)) {
            return ((AnonymousClass3PV) this).A02.A02;
        }
        C72403Ss r3 = (C72403Ss) this;
        AnonymousClass25O r1 = r3.A08;
        if (r1 == null || r3.A0M) {
            return false;
        }
        int A8R = r1.A8R();
        if ((A8R == 3 || A8R == 2) && r3.A08.A8P()) {
            return true;
        }
        return false;
    }

    public boolean A0C() {
        if (this instanceof AnonymousClass3T7) {
            return ((AnonymousClass3T7) this).A00.A0H;
        }
        if (this instanceof AnonymousClass3T5) {
            return A01() > 50;
        }
        if (this instanceof C72443Sw) {
            throw new UnsupportedOperationException("not implemented yet");
        } else if (!(this instanceof C72403Ss)) {
            return true;
        } else {
            return ((C72403Ss) this).A0N;
        }
    }

    public boolean A0D() {
        if ((this instanceof AnonymousClass3T7) || (this instanceof AnonymousClass3T5) || (this instanceof C72443Sw) || !(this instanceof C72403Ss)) {
            return false;
        }
        return ((C72403Ss) this).A0H;
    }
}
