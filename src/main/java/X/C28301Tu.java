package X;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.audiofx.Visualizer;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.format.DateUtils;
import android.view.Window;
import android.view.WindowManager;
import android.widget.RemoteViews;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.google.android.search.verification.client.R;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.util.Log;
import java.io.IOException;

/* renamed from: X.1Tu  reason: invalid class name and case insensitive filesystem */
public class C28301Tu {
    public static C28301Tu A0i;
    public static AnonymousClass04h A0j = new AnonymousClass04h(250);
    public static byte[] A0k;
    public static String[] A0l = {"GT-I9505", "GT-I9506", "GT-I9505G", "SGH-I337", "SGH-M919", "SCH-I545", "SPH-L720", "SCH-R970", "GT-I9508", "SGH-N045", "SC-04E"};
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public Activity A06;
    public Sensor A07;
    public SensorEventListener A08;
    public SensorManager A09;
    public AudioManager.OnAudioFocusChangeListener A0A;
    public MediaPlayer A0B;
    public Visualizer A0C;
    public AbstractC47552Ik A0D;
    public AbstractC47572Im A0E;
    public AbstractC47582In A0F;
    public AnonymousClass0MP A0G;
    public AnonymousClass1Y0 A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K = false;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public final BroadcastReceiver A0Q;
    public final Handler A0R = new HandlerC47512Ig(this, Looper.getMainLooper());
    public final PowerManager.WakeLock A0S;
    public final AnonymousClass009 A0T;
    public final AnonymousClass02M A0U;
    public final AnonymousClass0JX A0V;
    public final AnonymousClass1OV A0W = new C51902aE(this);
    public final C40991uH A0X;
    public final C51882aC A0Y;
    public final AnonymousClass03P A0Z;
    public final AnonymousClass03S A0a;
    public final AnonymousClass0DF A0b;
    public final AnonymousClass0AR A0c;
    public final AnonymousClass2W4 A0d;
    public final C04260Jr A0e;
    public final AnonymousClass35I A0f;
    public final boolean A0g;
    public volatile boolean A0h;

    public C28301Tu(Activity activity, AnonymousClass02M r5, AnonymousClass009 r6, AnonymousClass35I r7, AnonymousClass0AR r8, AnonymousClass03P r9, C04260Jr r10, AnonymousClass0JX r11, AnonymousClass0DF r12, C40991uH r13, AnonymousClass03S r14, C51882aC r15, AnonymousClass2W4 r16, boolean z) {
        this.A06 = activity;
        this.A0U = r5;
        this.A0T = r6;
        this.A0f = r7;
        this.A0c = r8;
        this.A0Z = r9;
        this.A0e = r10;
        this.A0V = r11;
        this.A0b = r12;
        this.A0X = r13;
        this.A0a = r14;
        this.A0Y = r15;
        this.A0d = r16;
        this.A0g = z;
        if (A00() != -1) {
            PowerManager A0C2 = r9.A0C();
            if (A0C2 == null) {
                Log.w("messageaudioplayer pm=null");
            } else {
                this.A0S = C002001d.A0f(A0C2, A00(), "WhatsApp MessageAudioPlayer ProximityWakeLock");
            }
        }
        this.A0J = r11.A00;
        this.A0Q = new C47522Ih(this);
    }

    public static final int A00() {
        if (Build.VERSION.SDK_INT >= 21) {
            return 32;
        }
        try {
            return PowerManager.class.getDeclaredField("PROXIMITY_SCREEN_OFF_WAKE_LOCK").getInt(null);
        } catch (NoSuchFieldException e) {
            Log.w("no PROXIMITY_SCREEN_OFF_WAKE_LOCK field in PowerManager", e);
            return -1;
        } catch (IllegalAccessException e2) {
            Log.w("unable to access PROXIMITY_SCREEN_OFF_WAKE_LOCK field in PowerManager", e2);
            return -1;
        }
    }

    public static C28301Tu A01(Activity activity, boolean z) {
        return new C28301Tu(activity, AnonymousClass02M.A00(), AnonymousClass009.A00(), AnonymousClass35I.A00(), AnonymousClass0AR.A00(), AnonymousClass03P.A00(), C04260Jr.A00(), AnonymousClass0JX.A02, AnonymousClass0DF.A00(), C40991uH.A00, AnonymousClass03S.A00(), C51882aC.A00, AnonymousClass2W4.A00(), z);
    }

    public static void A02() {
        C28301Tu r2 = A0i;
        if (r2 != null) {
            boolean z = true;
            r2.A0I = true;
            PowerManager.WakeLock wakeLock = r2.A0S;
            if (wakeLock == null || !wakeLock.isHeld()) {
                z = false;
            }
            r2.A0P = z;
            r2.A0K();
        }
    }

    public static void A03() {
        C28301Tu r0 = A0i;
        if (r0 != null) {
            r0.A0A();
        }
    }

    public static void A04() {
        C28301Tu r1 = A0i;
        if (r1 != null) {
            r1.A0I = false;
            if (r1.A0P) {
                r1.A0I();
            }
        }
    }

    public static void A05() {
        C28301Tu r0 = A0i;
        if (r0 != null) {
            r0.A0C();
        }
    }

    public static void A06(AnonymousClass0MP r3, int i) {
        A0j.put(r3.A0n, Integer.valueOf(i));
    }

    public static boolean A07() {
        C28301Tu r0 = A0i;
        return r0 != null && r0.A0P();
    }

    public static boolean A08(AbstractC007503q r1) {
        C28301Tu r0 = A0i;
        return r0 != null && r0.A0Q(r1);
    }

    public int A09() {
        AnonymousClass1Y0 r0 = this.A0H;
        if (r0 == null) {
            return 0;
        }
        return Math.max(this.A03, r0.A01());
    }

    public void A0A() {
        AnonymousClass1Y0 r0 = this.A0H;
        if (r0 != null && r0.A08()) {
            this.A0H.A03();
            this.A0O = true;
            A0F();
            A0L();
            A0K();
        }
        A0E();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01a8, code lost:
        if (r1 == false) goto L_0x01aa;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0B() {
        /*
        // Method dump skipped, instructions count: 760
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28301Tu.A0B():void");
    }

    public void A0C() {
        int i;
        AbstractC47552Ik r1;
        boolean z = false;
        if (this.A02 == A09()) {
            z = true;
        }
        Log.i("messageaudioplayer/stop");
        AnonymousClass1Y0 r0 = this.A0H;
        if (r0 != null) {
            r0.A05();
            this.A0H = null;
        }
        MediaPlayer mediaPlayer = this.A0B;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.A0B.release();
            this.A0B = null;
        }
        Visualizer visualizer = this.A0C;
        if (visualizer != null) {
            visualizer.setEnabled(false);
            this.A0C = null;
        }
        if (this.A0S != null || !this.A0L) {
            A0J();
        }
        A0E();
        this.A06.setVolumeControlStream(EditorInfoCompat.IME_FLAG_FORCE_ASCII);
        this.A03 = 0;
        this.A0O = false;
        this.A0R.removeMessages(0);
        A0L();
        if (z && (r1 = this.A0D) != null) {
            r1.AIU(this.A01);
        }
        if (A0i == this) {
            if (this.A0g) {
                if (!this.A0M) {
                    this.A0d.A01();
                } else {
                    AnonymousClass2W4 r4 = this.A0d;
                    Activity activity = this.A06;
                    if (!r4.A04) {
                        RemoteViews remoteViews = new RemoteViews(activity.getPackageName(), (int) R.layout.ongoing_media_notification);
                        int i2 = this.A02;
                        remoteViews.setProgressBar(R.id.ongoing_media_audio_seekbar, i2, i2, false);
                        remoteViews.setTextViewText(R.id.ongoing_media_timeLeft, DateUtils.formatElapsedTime((long) (this.A02 / SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS)));
                        r4.A02(activity, remoteViews, true);
                    } else if (!r4.A05) {
                        r4.A02(activity, new RemoteViews(activity.getPackageName(), (int) R.layout.ongoing_media_notification_talkback), true);
                        r4.A06 = false;
                    }
                }
            }
            AbstractC47572Im r02 = this.A0E;
            if (r02 != null && A0Q(r02.A6J())) {
                int i3 = ((AnonymousClass0M3) this.A0G).A00;
                if (i3 != 0) {
                    i = i3 * SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS;
                } else {
                    i = this.A02;
                }
                this.A0E.AKb(i);
            }
            A0j.remove(this.A0G.A0n);
            this.A0X.A00(this.A0W);
            this.A0h = false;
        }
        A0i = null;
    }

    public void A0D() {
        C28301Tu r0 = A0i;
        if (!(r0 == this || r0 == null)) {
            r0.A0C();
        }
        AnonymousClass1Y0 r02 = this.A0H;
        if (r02 == null || !r02.A08()) {
            A0B();
        } else {
            A0A();
        }
    }

    public final void A0E() {
        AudioManager A092 = this.A0Z.A09();
        if (A092 != null) {
            AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.A0A;
            if (onAudioFocusChangeListener == null) {
                onAudioFocusChangeListener = new C47562Il();
                this.A0A = onAudioFocusChangeListener;
            }
            A092.abandonAudioFocus(onAudioFocusChangeListener);
        }
    }

    public final void A0F() {
        if (this.A0g) {
            if (this.A0I) {
                this.A0d.A03(this.A06.getApplicationContext(), this);
            } else {
                this.A0d.A01();
            }
        }
        AbstractC47572Im r0 = this.A0E;
        if (r0 != null && A0Q(r0.A6J())) {
            this.A0E.AIK(A09());
        }
        A06(this.A0G, A09());
        this.A0h = false;
    }

    public final void A0G() {
        if (Build.VERSION.SDK_INT >= 21 && !this.A0K) {
            this.A06.getApplicationContext().registerReceiver(this.A0Q, new IntentFilter("android.intent.action.HEADSET_PLUG"));
            this.A0K = true;
        }
    }

    public final void A0H() {
        A0I();
        if (this.A09 == null) {
            SensorManager A072 = this.A0Z.A07();
            this.A09 = A072;
            if (A072 != null) {
                Sensor defaultSensor = A072.getDefaultSensor(8);
                this.A07 = defaultSensor;
                if (defaultSensor != null) {
                    C47542Ij r2 = new C47542Ij(this);
                    this.A08 = r2;
                    this.A09.registerListener(r2, defaultSensor, 2);
                }
            }
        }
    }

    public final void A0I() {
        PowerManager.WakeLock wakeLock = this.A0S;
        if (wakeLock != null && !wakeLock.isHeld() && !this.A0J && this.A0H.A08() && !this.A0I) {
            wakeLock.acquire();
            Log.i("messageaudioplayer/startProximityListener acquired proximityWakeLock");
        }
    }

    public final void A0J() {
        SensorEventListener sensorEventListener;
        Sensor sensor;
        SensorManager sensorManager = this.A09;
        if (!(sensorManager == null || (sensorEventListener = this.A08) == null || (sensor = this.A07) == null)) {
            sensorManager.unregisterListener(sensorEventListener, sensor);
            this.A09 = null;
        }
        A0K();
    }

    public final void A0K() {
        PowerManager.WakeLock wakeLock = this.A0S;
        if (wakeLock != null && wakeLock.isHeld()) {
            if (Build.VERSION.SDK_INT >= 21) {
                wakeLock.release(1);
            } else {
                wakeLock.release();
            }
            Log.i("messageaudioplayer/stopproximitylistener released proximityWakeLock");
        }
    }

    public final void A0L() {
        if (this.A0K) {
            this.A06.getApplicationContext().unregisterReceiver(this.A0Q);
            this.A0K = false;
        }
    }

    public void A0M(int i) {
        try {
            AnonymousClass1Y0 r0 = this.A0H;
            if (r0 != null) {
                r0.A07(i);
            }
            this.A03 = i;
        } catch (IOException e) {
            Log.e(e);
        }
    }

    public void A0N(AnonymousClass0MP r3) {
        Number number = (Number) A0j.get(r3.A0n);
        if (number != null) {
            A0M(number.intValue());
        }
    }

    public void A0O(boolean z) {
        AnonymousClass1Y0 r0;
        if (this.A0V.A00) {
            z = false;
        }
        if (this.A0L != z) {
            if (!z || ((r0 = this.A0H) != null && r0.A08())) {
                AnonymousClass008.A1H("messageaudioplayer/onearproximity ", z);
                this.A0L = z;
                if (this.A0S == null) {
                    Window window = this.A06.getWindow();
                    WindowManager.LayoutParams attributes = window.getAttributes();
                    if (z) {
                        this.A00 = attributes.screenBrightness;
                        attributes.screenBrightness = 0.1f;
                    } else {
                        attributes.screenBrightness = this.A00;
                    }
                    window.setAttributes(attributes);
                }
                AbstractC47572Im r02 = this.A0E;
                if (r02 != null) {
                    r02.AFP(z);
                }
                AnonymousClass1Y0 r03 = this.A0H;
                if (r03 != null && r03.A08()) {
                    int A012 = this.A0H.A01();
                    this.A0H.A05();
                    this.A0H = null;
                    AnonymousClass0M4 r04 = ((AnonymousClass0M3) this.A0G).A02;
                    if (r04 != null) {
                        int i = 3;
                        if (z) {
                            i = 0;
                        }
                        try {
                            this.A01 = i;
                            this.A0H = AnonymousClass1Y0.A00(r04.A0F, i);
                            this.A06.setVolumeControlStream(this.A01);
                            AudioManager A092 = this.A0Z.A09();
                            if (z && A092 != null) {
                                A092.setSpeakerphoneOn(false);
                            }
                            this.A0H.A04();
                            int max = Math.max(0, A012 - 1000);
                            this.A03 = max;
                            this.A0H.A07(max);
                            if (z || System.currentTimeMillis() - this.A05 < 1500) {
                                this.A0H.A06();
                                return;
                            }
                            this.A0O = true;
                            A0F();
                            A0L();
                            A0K();
                            A0E();
                        } catch (IOException | IllegalStateException unused) {
                            this.A0U.A06(R.string.gallery_audio_cannot_load, 0);
                        }
                    } else {
                        throw null;
                    }
                }
            }
        }
    }

    public boolean A0P() {
        AnonymousClass1Y0 r0 = this.A0H;
        return r0 != null && r0.A08();
    }

    public boolean A0Q(AbstractC007503q r3) {
        return r3.A0n.equals(this.A0G.A0n);
    }
}
