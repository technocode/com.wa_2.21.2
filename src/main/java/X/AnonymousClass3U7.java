package X;

import android.app.Application;
import android.app.Notification;
import android.app.NotificationManager;
import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.hardware.SensorEventListener;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.Ringtone;
import android.media.SoundPool;
import android.media.audiofx.AcousticEchoCanceler;
import android.media.audiofx.AutomaticGainControl;
import android.media.audiofx.NoiseSuppressor;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.Vibrator;
import android.service.notification.StatusBarNotification;
import android.telecom.PhoneAccountHandle;
import android.telecom.TelecomManager;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.WindowManager;
import com.google.android.search.verification.client.R;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.fieldstats.events.WamCall;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.protocol.VoipStanzaChildNode;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallGroupInfo;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.CallParticipant;
import com.whatsapp.voipcalling.DefaultCryptoCallback;
import com.whatsapp.voipcalling.GlVideoRenderer;
import com.whatsapp.voipcalling.JNIUtils;
import com.whatsapp.voipcalling.VoiceFGService;
import com.whatsapp.voipcalling.VoiceService$DefaultSignalingXmppCallback;
import com.whatsapp.voipcalling.VoiceService$VoiceServiceEventCallback;
import com.whatsapp.voipcalling.Voip;
import com.whatsapp.voipcalling.VoipActivityV2;
import com.whatsapp.voipcalling.VoipErrorDialogFragment;
import com.whatsapp.voipcalling.camera.VoipCameraManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.3U7  reason: invalid class name */
public class AnonymousClass3U7 {
    public static final Object A2G = AnonymousClass38B.A00;
    public static final ThreadPoolExecutor A2H = new ThreadPoolExecutor(0, 1, 10, TimeUnit.SECONDS, new LinkedBlockingQueue());
    public static final AtomicInteger A2I = new AtomicInteger();
    public double A00 = Double.NaN;
    public double A01 = Double.NaN;
    public int A02;
    public int A03;
    public int A04;
    public int A05 = 30;
    public int A06;
    public int A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public long A0C;
    public BroadcastReceiver A0D;
    public BroadcastReceiver A0E;
    public Ringtone A0F;
    public SoundPool A0G;
    public Uri A0H;
    public Handler A0I;
    public Handler A0J;
    public Handler A0K;
    public Handler A0L;
    public PowerManager.WakeLock A0M;
    public PowerManager.WakeLock A0N;
    public PhoneStateListener A0O;
    public AnonymousClass1P5 A0P;
    public WamCall A0Q;
    public AnonymousClass363 A0R;
    public AnonymousClass3TD A0S;
    public C72643Tr A0T;
    public AnonymousClass39E A0U;
    public C09230cV A0V;
    public AbstractC07250Wp A0W;
    public Integer A0X;
    public Integer A0Y;
    public Integer A0Z;
    public Integer A0a;
    public Integer A0b = 1500;
    public Integer A0c;
    public Integer A0d;
    public Integer A0e;
    public Long A0f;
    public Long A0g;
    public Long A0h;
    public Long A0i;
    public Object A0j;
    public Object A0k;
    public Object A0l;
    public String A0m;
    public String A0n;
    public ScheduledExecutorService A0o;
    public short A0p;
    public boolean A0q;
    public boolean A0r;
    public boolean A0s;
    public boolean A0t;
    public boolean A0u;
    public boolean A0v = false;
    public boolean A0w;
    public boolean A0x;
    public boolean A0y;
    public boolean A0z;
    public boolean A10;
    public boolean A11;
    public boolean A12 = false;
    public boolean A13;
    public boolean A14;
    public boolean A15;
    public boolean A16;
    public boolean A17 = true;
    public boolean A18;
    public long[] A19;
    public final Context A1A;
    public final TelephonyManager A1B;
    public final AnonymousClass0C2 A1C;
    public final AnonymousClass0AV A1D;
    public final AnonymousClass009 A1E = AnonymousClass009.A00();
    public final AnonymousClass088 A1F = AnonymousClass088.A00();
    public final C04250Jq A1G;
    public final AnonymousClass02M A1H = AnonymousClass02M.A00();
    public final AnonymousClass01I A1I = AnonymousClass01I.A00();
    public final AnonymousClass0I5 A1J;
    public final AbstractC03900If A1K;
    public final AnonymousClass0IY A1L;
    public final C000300f A1M = C000300f.A00();
    public final AnonymousClass0CL A1N = AnonymousClass0CL.A00();
    public final C03170Fb A1O = C03170Fb.A00();
    public final AnonymousClass09K A1P;
    public final C03480Gk A1Q = C03480Gk.A00();
    public final AnonymousClass0IW A1R = AnonymousClass0IW.A00();
    public final AnonymousClass01A A1S = AnonymousClass01A.A00();
    public final C014308b A1T = C014308b.A00();
    public final AnonymousClass0EQ A1U;
    public final AnonymousClass04j A1V;
    public final AnonymousClass03P A1W = AnonymousClass03P.A00();
    public final AnonymousClass00S A1X = AnonymousClass00S.A00();
    public final AnonymousClass03C A1Y;
    public final AnonymousClass00D A1Z;
    public final AnonymousClass01X A1a = AnonymousClass01X.A00();
    public final C001000o A1b;
    public final C001400w A1c = C001400w.A02;
    public final AnonymousClass0FS A1d;
    public final AnonymousClass098 A1e = AnonymousClass098.A00();
    public final AnonymousClass01L A1f;
    public final AnonymousClass0ET A1g;
    public final AnonymousClass0CW A1h;
    public final AnonymousClass018 A1i;
    public final AnonymousClass0AR A1j = AnonymousClass0AR.A00();
    public final C02360Br A1k = C02360Br.A00();
    public final AnonymousClass0BS A1l;
    public final AnonymousClass0BB A1m;
    public final AnonymousClass00T A1n = C002101e.A00();
    public final AnonymousClass3TC A1o;
    public final C673638g A1p;
    public final C674638r A1q;
    public final AnonymousClass0JO A1r = AnonymousClass0JO.A00;
    public final C675038w A1s;
    public final AnonymousClass392 A1t;
    public final JNIUtils A1u = JNIUtils.getInstance();
    public final C09210cT A1v;
    public final AnonymousClass0XQ A1w;
    public final VoiceService$VoiceServiceEventCallback A1x;
    public final AnonymousClass0Z0 A1y;
    public final C675939f A1z;
    public final AnonymousClass0Fh A20 = AnonymousClass0Fh.A00();
    public final C09270cb A21;
    public final VoipCameraManager A22;
    public final List A23 = new ArrayList();
    public final Map A24 = new HashMap();
    public final Map A25 = new HashMap();
    public final Map A26 = new ConcurrentHashMap();
    public final Map A27 = new ConcurrentHashMap();
    public final Map A28 = new HashMap();
    public final Set A29 = new HashSet();
    public final Set A2A = Collections.synchronizedSet(new HashSet());
    public volatile int A2B = 0;
    public volatile AnonymousClass0OU A2C;
    public volatile Boolean A2D;
    public volatile Integer A2E;
    public volatile boolean A2F;

    public AnonymousClass3U7(Context context, AnonymousClass0Z0 r22) {
        if (C675038w.A02 == null) {
            synchronized (C675038w.class) {
                if (C675038w.A02 == null) {
                    C675038w.A02 = new C675038w(AnonymousClass09H.A01(), C001000o.A00());
                }
            }
        }
        this.A1s = C675038w.A02;
        this.A1G = C04250Jq.A03;
        this.A1J = AnonymousClass0I5.A00();
        this.A1P = AnonymousClass09K.A07;
        this.A1U = AnonymousClass0EQ.A00();
        this.A1g = AnonymousClass0ET.A00();
        this.A1l = AnonymousClass0BS.A01();
        this.A1b = C001000o.A00();
        this.A1f = AnonymousClass01L.A00();
        this.A1d = AnonymousClass0FS.A00();
        this.A1m = AnonymousClass0BB.A00();
        this.A22 = VoipCameraManager.getInstance();
        this.A1V = AnonymousClass04j.A00();
        this.A1Z = AnonymousClass00D.A00();
        this.A1D = AnonymousClass0AV.A00();
        this.A21 = C09270cb.A00();
        this.A1Y = AnonymousClass03C.A00();
        this.A1h = AnonymousClass0CW.A00();
        this.A1w = AnonymousClass0XQ.A00();
        if (C674638r.A0F == null) {
            synchronized (C674638r.class) {
                if (C674638r.A0F == null) {
                    C674638r.A0F = new C674638r(C002101e.A00(), C000300f.A00(), AnonymousClass0L2.A01(), AnonymousClass0HJ.A02(), AnonymousClass01A.A00(), AnonymousClass03P.A00(), C014308b.A00(), AnonymousClass01X.A00(), AnonymousClass0BB.A00(), AnonymousClass08C.A00(), AnonymousClass0Z0.A00(), AnonymousClass03C.A00(), AnonymousClass01T.A00(), AnonymousClass0C2.A00(), AnonymousClass0HK.A00());
                }
            }
        }
        this.A1q = C674638r.A0F;
        this.A1L = AnonymousClass0IY.A00();
        AnonymousClass018 r2 = AnonymousClass018.A00;
        if (r2 != null) {
            this.A1i = r2;
            this.A1C = AnonymousClass0C2.A00();
            this.A1v = C09210cT.A00();
            this.A1B = this.A1W.A0F();
            this.A06 = 0;
            this.A0A = -1;
            this.A03 = 0;
            this.A1K = new AnonymousClass3U4(this);
            this.A1o = new AnonymousClass3TC(this);
            this.A1A = context;
            this.A1y = r22;
            this.A1x = new VoiceService$VoiceServiceEventCallback(this, this.A1h);
            this.A1p = new C673638g(this.A1D);
            this.A1t = new AnonymousClass392(AnonymousClass00Y.A00(), this.A1c, C03250Fl.A00(), this.A1U, AnonymousClass01M.A00(), this.A1b, AnonymousClass0I8.A01(), C04540Kt.A00(), AnonymousClass0L3.A00, C016508x.A00, new AnonymousClass3U2(this));
            this.A1z = new C675939f(this, context, this.A1W, this.A1v);
            return;
        }
        throw null;
    }

    public static final String A00(Jid jid) {
        if (!(jid instanceof DeviceJid)) {
            return jid.getRawString();
        }
        DeviceJid deviceJid = (DeviceJid) jid;
        if (deviceJid.isPrimary()) {
            return deviceJid.userJid.getRawString();
        }
        return deviceJid.getRawString();
    }

    public static void A02(AnonymousClass3U7 r15, DeviceJid deviceJid, boolean z) {
        VoipStanzaChildNode[] voipStanzaChildNodeArr;
        if (r15 != null) {
            String currentCallId = Voip.getCurrentCallId();
            AnonymousClass0OU r7 = r15.A2C;
            if (r7 != null) {
                String str = r7.A04;
                if (str.equals(currentCallId) && r7.A06.containsKey(deviceJid)) {
                    r15.A2C = null;
                    VoipStanzaChildNode voipStanzaChildNode = r7.A02;
                    if (voipStanzaChildNode != null) {
                        ArrayList arrayList = new ArrayList();
                        VoipStanzaChildNode[] childrenCopy = voipStanzaChildNode.getChildrenCopy();
                        if (childrenCopy != null) {
                            for (VoipStanzaChildNode voipStanzaChildNode2 : childrenCopy) {
                                AnonymousClass0OS[] attributesCopy = voipStanzaChildNode2.getAttributesCopy();
                                if (attributesCopy != null) {
                                    int length = attributesCopy.length;
                                    int i = 0;
                                    while (true) {
                                        if (i >= length) {
                                            break;
                                        }
                                        AnonymousClass0OS r1 = attributesCopy[i];
                                        if ("jid".equals(r1.A02)) {
                                            DeviceJid of = DeviceJid.of(r1.A01);
                                            if (of != null && !of.equals(deviceJid)) {
                                                arrayList.add(voipStanzaChildNode2);
                                            }
                                        } else {
                                            i++;
                                        }
                                    }
                                } else {
                                    throw null;
                                }
                            }
                            if (!arrayList.isEmpty() && (voipStanzaChildNodeArr = (VoipStanzaChildNode[]) arrayList.toArray(new VoipStanzaChildNode[0])) != null) {
                                r15.A0a(new AnonymousClass0OU(r7.A01, str, C002001d.A13(r7.A03, voipStanzaChildNodeArr), null));
                            }
                        } else {
                            throw null;
                        }
                    }
                }
            }
            r15.A0o.execute(new RunnableEBaseShape1S0110000_I1(deviceJid, z, 14));
            return;
        }
        throw null;
    }

    public static void A03(AnonymousClass3U7 r5, UserJid userJid, int i) {
        if (r5 != null) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(userJid);
            AnonymousClass02M r0 = r5.A1H;
            r0.A02.post(new RunnableEBaseShape1S1201000_I1(r5, arrayList, null, i, 3));
            return;
        }
        throw null;
    }

    public static void A04(AnonymousClass3U7 r4, List list, int i) {
        VoipErrorDialogFragment voipErrorDialogFragment = null;
        if (r4 != null) {
            CallInfo callInfo = Voip.getCallInfo();
            if (i != 1) {
                if (i == 2 && callInfo != null) {
                    voipErrorDialogFragment = VoipErrorDialogFragment.A01(list, callInfo.participants.size(), true);
                }
            } else if (callInfo != null) {
                voipErrorDialogFragment = VoipErrorDialogFragment.A01(list, callInfo.participants.size(), false);
            }
            AbstractC004502c r0 = r4.A1H.A00;
            if (r0 != null && voipErrorDialogFragment != null) {
                r0.APm(voipErrorDialogFragment);
                return;
            }
            return;
        }
        throw null;
    }

    public static void A05(AnonymousClass3U7 r6, boolean z) {
        C09270cb r1;
        SharedPreferences sharedPreferences;
        if (r6 != null) {
            String A062 = Voip.A06("test.name");
            if (A062 != null) {
                AnonymousClass008.A0m(r6.A1Z, "voip_call_ab_test_bucket", A062);
            }
            Integer A012 = Voip.A01("options.spam_call_threshold_seconds");
            if (A012 != null) {
                r6.A05 = A012.intValue();
            }
            r6.A0Z = Voip.A01("options.offer_ack_timeout");
            r6.A0X = Voip.A01("options.android_audio_mode_in_call");
            Integer A013 = Voip.A01("options.audio_level_adjust");
            if (A013 != null) {
                r6.A07 = A013.intValue();
            }
            Integer A014 = Voip.A01("options.call_start_delay");
            if (A014 != null) {
                r1 = r6.A21;
                int intValue = A014.intValue();
                sharedPreferences = r1.A00;
                sharedPreferences.edit().putInt("call_start_delay", intValue).apply();
            } else {
                r1 = r6.A21;
                sharedPreferences = r1.A00;
                if (sharedPreferences.contains("call_start_delay")) {
                    A06(r1, "call_start_delay");
                }
            }
            Integer A015 = Voip.A01("vid_driver.camera_width");
            Integer A016 = Voip.A01("vid_driver.camera_height");
            if (A015 != null && A016 != null) {
                int intValue2 = A015.intValue();
                sharedPreferences.edit().putInt("video_call_front_camera_width", intValue2).putInt("video_call_front_camera_height", A016.intValue()).apply();
            } else if (sharedPreferences.contains("video_call_front_camera_width") || sharedPreferences.contains("video_call_front_camera_height")) {
                sharedPreferences.edit().remove("video_call_front_camera_width").remove("video_call_front_camera_height").apply();
            }
            Integer A017 = Voip.A01("vid_driver.back_camera_width");
            Integer A018 = Voip.A01("vid_driver.back_camera_height");
            if (A017 != null && A018 != null) {
                int intValue3 = A017.intValue();
                sharedPreferences.edit().putInt("video_call_back_camera_width", intValue3).putInt("video_call_back_camera_height", A018.intValue()).apply();
            } else if (sharedPreferences.contains("video_call_back_camera_width") || sharedPreferences.contains("video_call_back_camera_height")) {
                sharedPreferences.edit().remove("video_call_back_camera_width").remove("video_call_back_camera_height").apply();
            }
            Integer A019 = Voip.A01("options.portrait_mode_threshold");
            if (A019 != null) {
                sharedPreferences.edit().putInt("portrait_mode_threshold", A019.intValue()).apply();
            } else {
                A06(r1, "portrait_mode_threshold");
            }
            Integer A0110 = Voip.A01("options.landscape_mode_threshold");
            if (A0110 != null) {
                sharedPreferences.edit().putInt("landscape_mode_threshold", A0110.intValue()).apply();
            } else {
                A06(r1, "landscape_mode_threshold");
            }
            Integer A0111 = Voip.A01("options.enable_callee_message_buffer");
            if (A0111 != null) {
                sharedPreferences.edit().putInt("call_enable_callee_message_buffer", A0111.intValue()).apply();
            } else {
                A06(r1, "call_enable_callee_message_buffer");
            }
            Integer A0112 = Voip.A01("options.enable_caller_message_buffer");
            if (A0112 != null) {
                sharedPreferences.edit().putInt("call_enable_caller_message_buffer", A0112.intValue()).apply();
            } else {
                A06(r1, "call_enable_caller_message_buffer");
            }
            Boolean A002 = Voip.A00("options.enable_touch_near_ear_fix");
            if (A002 != null) {
                A07(r1, "enable_touch_near_ear_fix", A002.booleanValue());
            } else {
                A06(r1, "enable_touch_near_ear_fix");
            }
            Boolean A003 = Voip.A00("options.android_telecom_framework_caller");
            if (A003 != null) {
                A07(r1, "enable_telecom_framework_caller", A003.booleanValue());
            } else {
                A06(r1, "enable_telecom_framework_caller");
            }
            Boolean A004 = Voip.A00("options.enable_vqm");
            if (A004 != null) {
                A07(r1, "enable_vid_quality_manager", A004.booleanValue());
            } else {
                A06(r1, "enable_vid_quality_manager");
            }
            if (z) {
                Boolean A005 = Voip.A00("options.disable_device_specific_camera_size");
                if (A005 != null) {
                    A07(r1, "disable_device_specific_camera_size", A005.booleanValue());
                } else {
                    A06(r1, "disable_device_specific_camera_size");
                }
                String A063 = Voip.A06("options.android_camera2_support_level");
                if (A063 != null) {
                    sharedPreferences.edit().putString("camera2_required_hardware_support_level", A063).apply();
                } else {
                    A06(r1, "camera2_required_hardware_support_level");
                }
                Boolean A006 = Voip.A00("options.force_passive_capture_dev_stream_role");
                if (A006 != null) {
                    A07(r1, "force_passive_capture_dev_stream_role", A006.booleanValue());
                } else {
                    A06(r1, "force_passive_capture_dev_stream_role");
                }
                Boolean A007 = Voip.A00("options.start_video_call_no_preview");
                if (A007 != null) {
                    A07(r1, "start_video_call_no_preview", A007.booleanValue());
                } else {
                    A06(r1, "start_video_call_no_preview");
                }
                Boolean A008 = Voip.A00("options.enable_gcall_codec_nego_fix");
                if (A008 != null) {
                    A07(r1, "enable_gcall_codec_nego_fix", A008.booleanValue());
                } else {
                    A06(r1, "enable_gcall_codec_nego_fix");
                }
                StringBuilder A0S2 = AnonymousClass008.A0S("Updating gcall_codec_nego sys pref to ");
                A0S2.append(sharedPreferences.getBoolean("enable_gcall_codec_nego_fix", false));
                Log.i(A0S2.toString());
                return;
            }
            return;
        }
        throw null;
    }

    public static void A06(C09270cb r0, String str) {
        r0.A00.edit().remove(str).apply();
    }

    public static void A07(C09270cb r0, String str, boolean z) {
        r0.A00.edit().putBoolean(str, z).apply();
    }

    public final AnonymousClass0QM A08(UserJid userJid, boolean z, String str, int i) {
        return this.A1d.A04(new C09260ca(userJid, z, C002001d.A1n(str), i));
    }

    public AnonymousClass39G A09(String str) {
        if (str == null || Build.VERSION.SDK_INT < 28) {
            return null;
        }
        return (AnonymousClass39G) this.A1v.A02().A05.get(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0047, code lost:
        if (r3.A0E.contains(r8) != false) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0072, code lost:
        if (r3.A0E.contains(r6) != false) goto L_0x0074;
     */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x015d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map A0A(java.util.Map r13) {
        /*
        // Method dump skipped, instructions count: 360
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3U7.A0A(java.util.Map):java.util.Map");
    }

    public void A0B() {
        StringBuilder sb = new StringBuilder("voip/service/create ");
        sb.append(this);
        Log.i(sb.toString());
        this.A0K = new Handler(new AnonymousClass388(this));
        this.A0I = new Handler(new AnonymousClass38A(this));
        this.A0L = new Handler(new AnonymousClass389(this));
        this.A0J = new Handler(new AnonymousClass387(this));
        this.A0o = new AnonymousClass39W(AnonymousClass38C.A00);
        this.A0R = new AnonymousClass363(this.A1W);
        this.A0O = new AnonymousClass39T(this);
        this.A0D = new AnonymousClass39U(this);
        this.A0E = new AnonymousClass39V(this);
        this.A0S = new AnonymousClass3TD(this);
        C675939f r5 = this.A1z;
        if (r5 != null) {
            Log.i("voip/audio_route/init");
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            r5.A02 = defaultAdapter;
            if (defaultAdapter != null) {
                try {
                    defaultAdapter.getProfileProxy(r5.A09, r5.A0G, 1);
                } catch (Exception e) {
                    Log.e(e);
                }
            } else {
                Log.e("voip/audio_route/init failed to get bluetoothAdapter");
            }
            if (Build.VERSION.SDK_INT >= 28) {
                r5.A0D.A03(r5.A0C);
            }
            AnonymousClass392 r2 = this.A1t;
            r2.A06.A01(r2.A05);
            r2.A01.A00(r2.A00);
            r2.A0A.A00(r2.A09);
            this.A1L.A01(this.A1K);
            AnonymousClass3U3 r1 = new AnonymousClass3U3(this);
            this.A0P = r1;
            this.A1Q.A0j.add(r1);
            if (Build.VERSION.SDK_INT >= 28) {
                C74363ak r12 = new C74363ak(this);
                this.A0V = r12;
                this.A1v.A03(r12);
            } else {
                this.A0V = null;
            }
            Voip.nativeRegisterEventCallback(this.A1x);
            if (Voip.A00 == null) {
                DefaultCryptoCallback defaultCryptoCallback = new DefaultCryptoCallback(this.A1I);
                Voip.nativeRegisterCryptoCallback(defaultCryptoCallback);
                Voip.A00 = defaultCryptoCallback;
            }
            Voip.nativeRegisterSignalingXmppCallback(new VoiceService$DefaultSignalingXmppCallback(this, this.A1X, this.A1I, this.A1s));
            if (Build.VERSION.SDK_INT >= 22) {
                AnonymousClass39E r3 = new AnonymousClass39E((ConnectivityManager) this.A1A.getSystemService("connectivity"));
                this.A0U = r3;
                r3.A06.execute(new RunnableEBaseShape13S0100000_I1_8(r3, 38));
            } else {
                this.A0U = null;
            }
            Log.i("voip/service/created");
            return;
        }
        throw null;
    }

    public void A0C() {
        int intValue;
        AnonymousClass39E r5;
        StringBuilder sb = new StringBuilder("voip/service/destroy ");
        sb.append(this);
        Log.i(sb.toString());
        try {
            A0F();
        } catch (Exception e) {
            Log.e(e);
        }
        A0K();
        SoundPool soundPool = this.A0G;
        if (soundPool != null) {
            this.A0e = null;
            soundPool.release();
            this.A0G = null;
        }
        C675939f r3 = this.A1z;
        if (r3 != null) {
            Log.i("voip/audio_route/deinit");
            boolean z = true;
            r3.A05 = true;
            if (Build.VERSION.SDK_INT >= 28) {
                r3.A0D.A02().A00(r3.A0C);
            }
            if (!(r3.A02 == null || r3.A03 == null)) {
                StringBuilder sb2 = new StringBuilder("voip/audio_route/destroy closing profile proxy for ");
                sb2.append(r3);
                Log.i(sb2.toString());
                r3.A02.closeProfileProxy(1, r3.A03);
            }
            r3.A02 = null;
            r3.A03 = null;
            A0M();
            if (Build.VERSION.SDK_INT >= 22 && (r5 = this.A0U) != null) {
                r5.A06.execute(new RunnableEBaseShape13S0100000_I1_8(r5, 37));
                r5.A06.shutdown();
                this.A0U = null;
            }
            Voip.nativeUnregisterEventCallback();
            Voip.nativeUnregisterSignalingXmppCallback();
            AnonymousClass392 r32 = this.A1t;
            r32.A06.A00(r32.A05);
            r32.A01.A01(r32.A00);
            r32.A0A.A01(r32.A09);
            this.A1L.A00(this.A1K);
            ScheduledExecutorService scheduledExecutorService = this.A0o;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdown();
                this.A0o = null;
            }
            Integer num = this.A0Z;
            if (num == null || (intValue = num.intValue()) == 0) {
                AnonymousClass008.A0j(this.A1Z, "call_offer_ack_timeout");
            } else {
                AnonymousClass008.A0k(this.A1Z, "call_offer_ack_timeout", intValue * SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS);
            }
            StringBuilder A0S2 = AnonymousClass008.A0S("voip/service/destroyed pendingCommands: ");
            List<Object> list = this.A23;
            A0S2.append(list.size());
            Log.i(A0S2.toString());
            for (Object obj : list) {
                this.A1y.A00.obtainMessage(1, obj).sendToTarget();
            }
            list.clear();
            if (Build.VERSION.SDK_INT >= 28 && this.A0V != null) {
                C09210cT r33 = this.A1v;
                C72713Ty A022 = r33.A02();
                AnonymousClass00E.A01();
                if (A022.A05.size() != 0) {
                    z = false;
                }
                AnonymousClass00E.A08(z, "Self managed connections are not disconnected when VoiceService is being destroyed");
                r33.A02().A03();
                r33.A02().A00(this.A0V);
                this.A0V = null;
            }
            this.A1Q.A0j.remove(this.A0P);
            NotificationManager notificationManager = (NotificationManager) this.A1A.getSystemService("notification");
            if (this.A0y && notificationManager != null && Build.VERSION.SDK_INT >= 28) {
                for (StatusBarNotification statusBarNotification : notificationManager.getActiveNotifications()) {
                    if (statusBarNotification.getId() == 23) {
                        this.A1E.A03("voip/orphannotification", -1);
                    }
                }
                return;
            }
            return;
        }
        throw null;
    }

    public void A0D() {
        long j = this.A0A;
        if (j != -1) {
            this.A0C = (System.currentTimeMillis() - j) + this.A0C;
            this.A0A = -1;
            Log.i("VoiceService:onExitPictureInPicture");
        }
    }

    public void A0E() {
        A0O();
        this.A22.setRequestedCamera2SupportLevel(this.A21.A03());
        this.A0J.removeMessages(23);
        this.A0J.sendEmptyMessageDelayed(23, 45000);
        this.A0o.execute(RunnableC672437u.A00);
    }

    public void A0F() {
        if (this.A19 != null) {
            Log.i("voip/vibrate/stop");
            Vibrator vibrator = (Vibrator) this.A1A.getSystemService("vibrator");
            if (vibrator != null) {
                vibrator.cancel();
                this.A19 = null;
            } else {
                throw null;
            }
        }
        this.A0H = null;
        C72643Tr r0 = this.A0T;
        if (r0 != null) {
            ((AnonymousClass0JW) r0).A00.cancel(true);
            this.A0T = null;
        }
        if (this.A0F != null) {
            Log.i("voip/ringtone/stop");
            this.A0F.stop();
            this.A0F = null;
        }
    }

    public final void A0G() {
        this.A0L.removeMessages(0);
        this.A0L.sendEmptyMessageDelayed(0, 15000);
    }

    public final void A0H() {
        if (this.A0H != null) {
            Ringtone ringtone = this.A0F;
            if (ringtone != null) {
                try {
                    if (!ringtone.isPlaying()) {
                        this.A0F.play();
                    }
                } catch (NullPointerException e) {
                    if (Build.VERSION.SDK_INT != 22 || !"oppo".equalsIgnoreCase(Build.MANUFACTURER)) {
                        throw e;
                    }
                    Log.e("voip/loadAndPlayRingtone error while playing existing ringtone", e);
                }
            } else if (this.A0T == null) {
                C72643Tr r3 = new C72643Tr(this.A1A, this.A1o);
                this.A0T = r3;
                this.A1n.ANC(r3, this.A0H);
            }
        }
    }

    public final void A0I() {
        AbstractC07250Wp r0;
        Log.i("voip/ear-far");
        AnonymousClass00E.A01();
        this.A0u = false;
        CallInfo callInfo = Voip.getCallInfo();
        if (callInfo != null && callInfo.isEitherSideRequestingUpgrade()) {
            AbstractC07250Wp r02 = this.A0W;
            if (r02 != null) {
                ((VoipActivityV2) r02).A1A(callInfo);
            }
            this.A1z.A01(callInfo);
        }
        if ((this.A0N == null || Build.VERSION.SDK_INT < 21) && (r0 = this.A0W) != null) {
            ((VoipActivityV2) r0).A1R(false);
        }
    }

    public final void A0J() {
        AbstractC07250Wp r0;
        Log.i("voip/ear-near");
        AnonymousClass00E.A01();
        this.A0u = true;
        CallInfo callInfo = Voip.getCallInfo();
        if (this.A16 || (callInfo != null && callInfo.isEitherSideRequestingUpgrade())) {
            C675939f r2 = this.A1z;
            boolean z = true;
            if (r2.A00 != 1) {
                z = false;
            }
            if (z) {
                r2.A05(false, callInfo);
            }
            this.A16 = false;
        }
        if ((this.A0N == null || Build.VERSION.SDK_INT < 21) && (r0 = this.A0W) != null) {
            ((VoipActivityV2) r0).A1R(true);
        }
    }

    public final void A0K() {
        Object obj = this.A0j;
        if (obj != null) {
            try {
                ((AcousticEchoCanceler) obj).release();
            } catch (Throwable th) {
                Log.e(th);
            }
        }
        this.A0j = null;
        Object obj2 = this.A0k;
        if (obj2 != null) {
            try {
                ((AutomaticGainControl) obj2).release();
            } catch (Throwable th2) {
                Log.e(th2);
            }
        }
        this.A0k = null;
        Object obj3 = this.A0l;
        if (obj3 != null) {
            try {
                ((NoiseSuppressor) obj3).release();
            } catch (Throwable th3) {
                Log.e(th3);
            }
        }
        this.A0l = null;
    }

    public final void A0L() {
        AnonymousClass00E.A01();
        try {
            if (this.A0N != null) {
                Log.i("voip/service/releaseProximityWakeLock");
                this.A0N.release();
                this.A0N = null;
            }
        } catch (Exception e) {
            Log.e(e);
            this.A0N = null;
        }
        AnonymousClass363 r4 = this.A0R;
        SensorEventListener sensorEventListener = r4.A00;
        if (sensorEventListener != null) {
            r4.A02.unregisterListener(sensorEventListener, r4.A01);
            r4.A00 = null;
        }
        if (0 != 0) {
            AnonymousClass362 r3 = new AnonymousClass362(r4, null);
            r4.A00 = r3;
            r4.A02.registerListener(r3, r4.A01, 2);
        }
        this.A0u = false;
    }

    public final void A0M() {
        A0L();
        AnonymousClass00E.A01();
        try {
            if (this.A0M != null) {
                Log.i("voip/service/releasePartialWakeLock");
                this.A0M.release();
                this.A0M = null;
            }
        } catch (Exception e) {
            Log.e(e);
            this.A0M = null;
        }
    }

    public final void A0N() {
        StringBuilder sb = new StringBuilder("voip/service/resetAudioManager ");
        sb.append(this);
        Log.i(sb.toString());
        C675939f r1 = this.A1z;
        AudioManager A092 = r1.A0A.A09();
        if (A092 != null) {
            A092.setSpeakerphoneOn(false);
        }
        r1.A04(false, null);
        r1.A00 = 2;
        AudioManager A093 = this.A1W.A09();
        if (A093 != null) {
            try {
                A093.setMode(0);
            } catch (Exception e) {
                Log.e(e);
            }
            A093.abandonAudioFocus((AudioManager.OnAudioFocusChangeListener) A2G);
        }
    }

    public final void A0O() {
        Point point = new Point();
        WindowManager windowManager = (WindowManager) this.A1A.getSystemService("window");
        if (windowManager != null) {
            windowManager.getDefaultDisplay().getSize(point);
            Voip.setScreenSize(point.x, point.y);
            return;
        }
        throw null;
    }

    public void A0P(int i, String str) {
        Bundle A012 = AnonymousClass008.A01("end_call_reason", i);
        if (str != null) {
            A012.putString("end_call_string", str);
        }
        AnonymousClass0Z0 r3 = this.A1y;
        r3.A00.obtainMessage(1, new AnonymousClass0Yz("hangup_call", A012, null)).sendToTarget();
    }

    public final void A0Q(int i, String str) {
        AbstractC07250Wp r0;
        String str2;
        C28791Vt r02;
        AnonymousClass280 r1 = (AnonymousClass280) this.A1i;
        if (r1.A03.A01()) {
            Log.d("InstrumentationObserverImpl/callEnded");
            for (AbstractC28671Vh r6 : r1.A04.A00()) {
                if (r6 instanceof C447821l) {
                    C447821l r62 = (C447821l) r6;
                    try {
                        C28831Vx A032 = r62.A06.A03(r62.A07);
                        C447421h r5 = r62.A02;
                        CallInfo callInfo = Voip.getCallInfo();
                        switch (i) {
                            case 1:
                            case 2:
                            case 14:
                            case 18:
                                str2 = "user_ended_call";
                                break;
                            case 3:
                            case 5:
                            case 6:
                            case 11:
                            case 13:
                            case 15:
                            case GlVideoRenderer.CAP_RENDER_I420 /*{ENCODED_INT: 16}*/:
                            case 17:
                            case AnonymousClass0PW.A01:
                            case 21:
                            case 22:
                            case 23:
                                str2 = "call_failed";
                                break;
                            case 4:
                            case 19:
                            default:
                                str2 = "other";
                                break;
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 25:
                                str2 = "not_accepted";
                                break;
                            case 12:
                                str2 = "rejected";
                                break;
                            case 24:
                                str2 = "missing_voip_permissions";
                                break;
                        }
                        String A042 = callInfo == null ? null : r5.A00.A04(A032, callInfo.callId);
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("call_ended_reason", str2);
                            jSONObject.put("call_id", A042);
                            r02 = new C28791Vt(r5.A00(), jSONObject);
                        } catch (JSONException unused) {
                            r02 = null;
                        }
                        r62.A01(r02);
                    } catch (SecurityException e) {
                        Log.e("StellaEventHandler/cannot create event for untrusted package", e);
                    }
                }
            }
        }
        CallInfo callInfo2 = Voip.getCallInfo();
        if (callInfo2 == null) {
            Log.i("voip/call/end without call info");
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        AnonymousClass00E.A01();
        if (i == 25 || i == 24) {
            str = null;
        } else {
            if (TextUtils.isEmpty(str) && callInfo2.isCaller && callInfo2.callState == Voip.CallState.CALLING && !this.A0r && SystemClock.elapsedRealtime() - this.A08 > 10000) {
                str = this.A1a.A06(R.string.voip_call_failed_no_network);
            } else if (TextUtils.isEmpty(str) && i == 27) {
                if (callInfo2.callDuration > 0) {
                    str = this.A1a.A06(R.string.voip_call_during_call_error);
                } else {
                    str = this.A1a.A06(R.string.voip_call_setup_error);
                }
            }
            if (!(str == null || (r0 = this.A0W) == null)) {
                ((VoipActivityV2) r0).A16 = str;
                this.A2E = -1;
            }
        }
        if (!callInfo2.isCaller || callInfo2.callState != Voip.CallState.CALLING || !this.A2F) {
            this.A2B = i;
        } else {
            this.A2B = 14;
        }
        AnonymousClass008.A1L(AnonymousClass008.A0Z("voip/call/end without text=", str, ", reason code="), this.A2B);
        Future future = this.A1t.A0F;
        if (future != null) {
            future.cancel(true);
        }
        this.A0o.execute(new RunnableEBaseShape1S0101000_I1(this, i, 19));
        StringBuilder sb = new StringBuilder("voip/call/end elapsed ");
        sb.append(SystemClock.elapsedRealtime() - elapsedRealtime);
        sb.append(" ms");
        Log.i(sb.toString());
    }

    public void A0R(long j) {
        AnonymousClass008.A10("VoiceService/delayShowingIncomingCall delay = ", j);
        this.A0J.removeMessages(1);
        this.A0J.sendEmptyMessageDelayed(1, j);
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0S(com.whatsapp.fieldstats.events.WamCall r9, com.whatsapp.jid.UserJid r10, java.lang.Long r11, java.lang.Integer r12, java.lang.Integer r13, java.lang.Integer r14, java.lang.String r15, java.lang.String r16) {
        /*
        // Method dump skipped, instructions count: 237
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3U7.A0S(com.whatsapp.fieldstats.events.WamCall, com.whatsapp.jid.UserJid, java.lang.Long, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String):void");
    }

    public final void A0T(Jid jid, String str, boolean z) {
        if (str != null) {
            StringBuilder sb = new StringBuilder("voip/sendPendingCallOfferStanza jid=");
            sb.append(jid);
            sb.append(" callId=");
            sb.append(str);
            sb.append(" callTerminated=");
            sb.append(z);
            sb.append(" pendingCallOfferStanza=(");
            sb.append(this.A2C);
            sb.append("), this = ");
            sb.append(this);
            Log.i(sb.toString());
        }
        AnonymousClass0OU r0 = this.A2C;
        if (r0 != null) {
            String str2 = r0.A04;
            if (str2.equals(str)) {
                Jid jid2 = r0.A01;
                if (jid2 instanceof DeviceJid) {
                    jid2 = ((DeviceJid) jid2).userJid;
                }
                if (jid instanceof DeviceJid) {
                    jid = ((DeviceJid) jid).userJid;
                }
                if (jid2.equals(jid)) {
                    if (z) {
                        r0 = new AnonymousClass0OU(jid2, str2, C002001d.A14(r0, null), null);
                    }
                    this.A2C = null;
                    A0a(r0);
                }
            }
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00f1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0U(com.whatsapp.jid.UserJid r8, long[] r9, boolean r10) {
        /*
        // Method dump skipped, instructions count: 326
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3U7.A0U(com.whatsapp.jid.UserJid, long[], boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        if (r6.A0u != false) goto L_0x000a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00c3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0V(com.whatsapp.voipcalling.CallInfo r7) {
        /*
        // Method dump skipped, instructions count: 211
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3U7.A0V(com.whatsapp.voipcalling.CallInfo):void");
    }

    public final void A0W(CallInfo callInfo, int i, boolean z) {
        AnonymousClass00E.A01();
        if (callInfo == null || callInfo.callEnding) {
            Log.e("do not create notification, we are not in a active call");
        } else if (callInfo.callWaitingInfo.A01 != 1 || i != 2) {
            Notification A012 = this.A1q.A01(this.A1A, i, C674738s.A00(callInfo, this.A10));
            if (this.A0y) {
                Log.i("VoiceService/startForegroundService Background restrictions on");
                this.A1Y.A03(null, 23, A012);
                return;
            }
            synchronized (this) {
                StringBuilder sb = new StringBuilder();
                sb.append("voip/service/notification posting summary notification:");
                sb.append(A012);
                Log.d(sb.toString());
                AnonymousClass0Z0 r1 = this.A1y;
                Application application = r1.A01.A00;
                AnonymousClass0C5 r2 = r1.A02;
                StringBuilder sb2 = new StringBuilder("voicefgservice/start-service notifcation:");
                sb2.append(A012);
                Log.i(sb2.toString());
                Intent putExtra = new Intent("com.whatsapp.service.VoiceFgService.START").putExtra("com.whatsapp.service.VoiceFgService.EXTRA_NOTIFICATION_ID", 23).putExtra("com.whatsapp.service.VoiceFgService.EXTRA_STOP_FOREGROUND_STATE", z);
                VoiceFGService.A01 = A012;
                r2.A03(application, VoiceFGService.class, putExtra);
                this.A0v = true;
            }
        }
    }

    public final void A0X(CallInfo callInfo, boolean z) {
        String obj;
        Voip.CallState callState;
        AnonymousClass00E.A01();
        StringBuilder sb = new StringBuilder("voip/phone-call-in-progress-changed: ");
        sb.append(z);
        if (callInfo == null) {
            obj = null;
        } else {
            StringBuilder A0S2 = AnonymousClass008.A0S(", call state: ");
            A0S2.append(callInfo.callState);
            obj = A0S2.toString();
        }
        AnonymousClass008.A1U(sb, obj);
        if (callInfo != null && (callState = callInfo.callState) != Voip.CallState.NONE) {
            if (!z) {
                this.A1z.A01(callInfo);
            } else if (callState == Voip.CallState.CALLING || callState == Voip.CallState.PRE_ACCEPT_RECEIVED || callState == Voip.CallState.RECEIVED_CALL || callState == Voip.CallState.REJOINING) {
                A0P(4, null);
                return;
            } else {
                this.A1z.A02(callInfo);
            }
            boolean z2 = false;
            if (A09(callInfo.callId) != null) {
                z2 = true;
            }
            Voip.onCallInterrupted(z, !z2);
        }
    }

    public final void A0Y(AnonymousClass0QM r7, boolean z) {
        AnonymousClass0FS r4 = this.A1d;
        C006903j r1 = r4.A09;
        UserJid userJid = r7.A09.A01;
        if (r1.A05(userJid) != null) {
            r4.A0A.A0J(new AnonymousClass0ZH(AnonymousClass0FI.A07(r4.A04, r4.A02, userJid, false), r7));
        }
        AnonymousClass0JO r12 = this.A1r;
        if (r12 != null) {
            Log.i("voip/notifyCallMissed");
            AnonymousClass00E.A01();
            Iterator it = r12.A00.iterator();
            while (true) {
                AnonymousClass0AY r13 = (AnonymousClass0AY) it;
                if (r13.hasNext()) {
                    AnonymousClass0LH r14 = (AnonymousClass0LH) r13.next();
                    if (r14 instanceof AnonymousClass3UC) {
                        Log.i("voip/VoipActivityV2/onCallMissed");
                        VoipActivityV2 voipActivityV2 = ((AnonymousClass3UC) r14).A00;
                        if (!voipActivityV2.A1Q.A00) {
                            voipActivityV2.finish();
                        }
                    } else if (r14 instanceof C09310cf) {
                        Log.i("voip/CallsFragment/onCallMissed");
                        ((C09310cf) r14).A00.A0r();
                    } else if (r14 instanceof AnonymousClass0LJ) {
                        AnonymousClass0L1 r42 = ((AnonymousClass0LJ) r14).A00;
                        r42.A04();
                        if (r42.A00.isEmpty()) {
                            AnonymousClass008.A0l(r42.A0A, "first_missed_call", r7.A08);
                        }
                        synchronized (r42) {
                            r42.A00.add(r7);
                        }
                        r42.A05(z);
                        r42.A0D.A02();
                    } else {
                        continue;
                    }
                } else {
                    return;
                }
            }
        } else {
            throw null;
        }
    }

    public final void A0Z(AnonymousClass0QM r6, boolean z) {
        boolean z2;
        synchronized (r6) {
            z2 = true;
            if (r6.A0D != z) {
                r6.A0F = true;
            }
            r6.A0D = z;
        }
        String str = r6.A03().A02;
        if (str.startsWith("call:")) {
            str = str.replaceFirst("call:", "");
        }
        StringBuilder sb = new StringBuilder("voip/setCallLogIsJoinableGroupCall callId:");
        sb.append(str);
        sb.append(" joinable:");
        sb.append(z);
        Log.i(sb.toString());
        if (z) {
            if (r6.A04 == null) {
                z2 = false;
            }
            AnonymousClass00E.A08(z2, "Can't rejoin from call logs missing call creator");
            this.A21.A05(str, r6.A02());
            this.A1w.A02(r6);
            return;
        }
        AnonymousClass0XQ r2 = this.A1w;
        r2.A01();
        synchronized (r2) {
            r2.A00.remove(r6.A09.A02);
        }
        AnonymousClass02M r3 = r2.A01;
        r3.A02.post(new RunnableEBaseShape4S0100000_I0_4(r2.A04, 47));
        SharedPreferences.Editor edit = this.A21.A00.edit();
        StringBuilder sb2 = new StringBuilder("joinable_");
        sb2.append(str);
        edit.remove(sb2.toString()).apply();
    }

    public final void A0a(AnonymousClass0OU r15) {
        Jid jid = r15.A01;
        String str = r15.A04;
        VoipStanzaChildNode voipStanzaChildNode = r15.A03;
        String str2 = r15.A05;
        boolean z = !TextUtils.isEmpty(str2);
        if (!z) {
            str2 = AnonymousClass0FI.A09(this.A1X, this.A1I);
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : r15.A06.entrySet()) {
            Object key = entry.getKey();
            if (entry.getValue() != null) {
                hashMap.put(key, entry.getValue());
            }
        }
        Set keySet = hashMap.keySet();
        boolean z2 = !keySet.isEmpty();
        if (z2) {
            for (Object obj : keySet) {
                if (this.A1t.A0E.contains(obj)) {
                    StringBuilder sb = new StringBuilder("VoiceService:sendOfferStanza waiting for PreKey job finishes with ");
                    sb.append(obj);
                    Log.i(sb.toString());
                    this.A2C = r15;
                    return;
                }
            }
        }
        AnonymousClass386 r4 = new AnonymousClass386(this, z2, jid, str, hashMap, r15, voipStanzaChildNode, str2, z);
        if (z2) {
            this.A02 = this.A21.A00.getInt("call_start_delay", 0);
            CallInfo callInfo = Voip.getCallInfo();
            int i = this.A02;
            if (i <= 0 || i >= 3000 || callInfo == null || callInfo.callState != Voip.CallState.CALLING || r15.A00 != 0) {
                Log.i("VoiceService:sendOfferStanza without delay");
                this.A0o.execute(r4);
                return;
            }
            StringBuilder A0S2 = AnonymousClass008.A0S("VoiceService:sendOfferStanza with ");
            A0S2.append(i);
            A0S2.append(" ms delay");
            Log.i(A0S2.toString());
            this.A2F = true;
            this.A0o.schedule(r4, (long) this.A02, TimeUnit.MILLISECONDS);
            return;
        }
        r4.run();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v4, resolved type: int */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00d2, code lost:
        if (r1.equals("hangup_call") != false) goto L_0x00d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00e8, code lost:
        if (r1.equals("start_web_relay") != false) goto L_0x00ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0145, code lost:
        if (r1.equals("receive_message") != false) goto L_0x0147;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01a2, code lost:
        if (r1.equals("refresh_notification") != false) goto L_0x01a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01b7, code lost:
        if (r1.equals("start_from_call_log") != false) goto L_0x01b9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01a4  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01b9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0b(X.AnonymousClass0Yz r24) {
        /*
        // Method dump skipped, instructions count: 940
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3U7.A0b(X.0Yz):void");
    }

    public void A0c(Voip.CallState callState) {
        int i;
        AudioManager A092 = this.A1W.A09();
        int ordinal = callState.ordinal();
        if ((ordinal == 1 || ordinal == 2 || ordinal == 4 || ordinal == 5 || ordinal == 6) && A092 != null) {
            boolean z = false;
            if (A09(Voip.getCurrentCallId()) != null) {
                z = true;
            }
            if (!z) {
                int mode = A092.getMode();
                Integer num = this.A0X;
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = 3;
                }
                if (mode != i) {
                    A092.setMode(i);
                }
                StringBuilder sb = new StringBuilder("voip/updateAudioModeForCallState ");
                sb.append(callState);
                sb.append(" to ");
                sb.append(i);
                Log.i(sb.toString());
            }
        }
    }

    public final void A0d(Voip.CallState callState, CallInfo callInfo) {
        int duration;
        PowerManager.WakeLock A0f2;
        StringBuilder sb = new StringBuilder("voip/service/stop ");
        sb.append(this);
        Log.i(sb.toString());
        AnonymousClass00E.A01();
        synchronized (this) {
            if (this.A0v) {
                AnonymousClass0Z0 r1 = this.A1y;
                Application application = r1.A01.A00;
                AnonymousClass0C5 r12 = r1.A02;
                Log.i("voicefgservice/stop-service");
                r12.A02(application, VoiceFGService.class);
                this.A0v = false;
            } else if (this.A0y) {
                Log.i("VoiceService/stopForegroundService Background restriction on");
                this.A1Y.A04(null, 23, "VoiceService4");
            }
        }
        if (this.A14) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.A14 = false;
            this.A0B = 0;
            this.A0g = null;
            this.A0q = false;
            this.A0u = false;
            this.A10 = false;
            this.A2E = null;
            this.A0Q = null;
            this.A0X = null;
            this.A0b = 1500;
            this.A0H = null;
            this.A0a = null;
            this.A0Y = null;
            this.A0f = null;
            this.A0s = false;
            this.A09 = 0;
            this.A0n = null;
            this.A0m = null;
            this.A17 = true;
            this.A0d = null;
            this.A0c = null;
            this.A0r = false;
            this.A08 = 0;
            this.A0x = false;
            this.A0p = 0;
            this.A07 = 0;
            this.A13 = false;
            this.A2B = 0;
            this.A2C = null;
            this.A26.clear();
            this.A27.clear();
            this.A1t.A0E.clear();
            this.A25.clear();
            this.A11 = false;
            this.A0t = false;
            this.A05 = 30;
            this.A02 = 0;
            this.A2F = false;
            C673638g r2 = this.A1p;
            r2.A02 = 0;
            r2.A01 = Double.NaN;
            r2.A00 = Double.NaN;
            this.A0C = 0;
            this.A0A = -1;
            this.A03 = 0;
            this.A0h = null;
            this.A0w = false;
            TelephonyManager telephonyManager = this.A1B;
            if (telephonyManager == null) {
                Log.w("voip/service/stop telephonyManager=null");
            } else {
                telephonyManager.listen(this.A0O, 0);
            }
            Context context = this.A1A;
            context.unregisterReceiver(this.A0D);
            C675939f r22 = this.A1z;
            if (r22 != null) {
                AnonymousClass008.A1a(AnonymousClass008.A0S("voip/audio_route/onCallStop using telecom:"), r22.A07);
                if (!r22.A07) {
                    r22.A0B.A01();
                    Context context2 = r22.A09;
                    context2.unregisterReceiver(r22.A0F);
                    context2.unregisterReceiver(r22.A0H);
                }
                if (Build.VERSION.SDK_INT >= 21) {
                    context.unregisterReceiver(this.A0E);
                }
                A0I();
                A0M();
                try {
                    PowerManager A0C2 = this.A1W.A0C();
                    if (A0C2 == null) {
                        Log.w("voice/service/turn-on-screen pm=null");
                    } else if (!A0C2.isScreenOn() && (A0f2 = C002001d.A0f(A0C2, 268435466, "VoiceService end call")) != null) {
                        A0f2.acquire(1);
                        A0f2.release();
                    }
                } catch (Exception e) {
                    Log.e(e);
                }
                A0F();
                if (this.A0G == null || callState == Voip.CallState.NONE || callState == Voip.CallState.RECEIVED_CALL || callInfo == null || callInfo.callWaitingInfo.A01 != 0) {
                    A0N();
                } else {
                    MediaPlayer create = MediaPlayer.create(context, (int) R.raw.end_call);
                    if (create == null) {
                        duration = 500;
                    } else {
                        duration = create.getDuration();
                    }
                    AnonymousClass008.A0v("voip/service/playEndCallTone duration: ", duration);
                    float f = 0.5f;
                    if (r22.A00 == 2) {
                        f = 1.0f;
                    }
                    Integer num = this.A0e;
                    if (num != null) {
                        this.A0G.play(num.intValue(), f, f, 0, 0, 1.0f);
                    } else {
                        Log.e("VoiceService:playEndCallTone sound pool has not been loaded successfully");
                    }
                    this.A0L.removeMessages(1);
                    this.A0L.sendEmptyMessageDelayed(1, (long) (duration + 100));
                }
                this.A0K.removeCallbacksAndMessages(null);
                AnonymousClass00D r13 = this.A1Z;
                AnonymousClass008.A0j(r13, "voip_call_id");
                r13.A00.edit().remove("voip_call_ab_test_bucket").apply();
                A0G();
                StringBuilder sb2 = new StringBuilder("voip/service/stop elapsed ");
                sb2.append(SystemClock.elapsedRealtime() - elapsedRealtime);
                sb2.append(" ms");
                Log.i(sb2.toString());
                StringBuilder A0Y2 = AnonymousClass008.A0Y("voip/service/stop", "/total threads count = ");
                A0Y2.append(Thread.activeCount());
                Log.log(4, A0Y2.toString());
                if (this.A0z) {
                    this.A1R.A01(4, false);
                } else {
                    this.A1R.A01(3, false);
                }
            } else {
                throw null;
            }
        }
    }

    public void A0e(AbstractC07250Wp r3) {
        StringBuilder sb = new StringBuilder("voip/service/resetVoipUiIfEquals ");
        sb.append(this);
        Log.i(sb.toString());
        if (this.A0W == r3) {
            this.A0W = null;
        }
    }

    public final void A0f(String str) {
        if (str == null || str.equals(Voip.getCurrentCallId())) {
            A0P(13, this.A1a.A06(R.string.voip_call_failed_no_network));
        } else {
            Voip.clearVoipParam(str);
        }
    }

    public void A0g(String str, int i) {
        CallInfo callInfo = Voip.getCallInfo();
        if (!Voip.A09(callInfo)) {
            Log.w("voip/service/acceptCall No active call");
            return;
        }
        boolean equals = str.equals(callInfo.callWaitingInfo.A04);
        if (i != 0) {
            this.A24.put(str, Integer.valueOf(i));
        }
        if (!equals) {
            this.A0q = true;
            A0F();
            C675939f r2 = this.A1z;
            boolean z = true;
            if (r2.A00 != 1) {
                z = false;
            }
            if (z) {
                r2.A05(false, callInfo);
            }
            A0c(Voip.CallState.ACCEPT_SENT);
        }
        this.A0o.schedule(new RunnableEBaseShape0S1110000_I1(this, str, equals, 2), 100, TimeUnit.MILLISECONDS);
    }

    public final void A0h(String str, DeviceJid deviceJid, String str2, VoipStanzaChildNode voipStanzaChildNode, boolean z) {
        AnonymousClass02P r1;
        VoipStanzaChildNode A122 = C002001d.A12(voipStanzaChildNode, "enc");
        if (A122 == null) {
            AnonymousClass00E.A08(false, "invalid enc node!");
            return;
        }
        Byte A1B2 = C002001d.A1B(A122);
        if (A1B2 == null) {
            AnonymousClass00E.A08(false, "invalid retry count!");
            return;
        }
        byte[] dataCopy = A122.getDataCopy();
        if (dataCopy == null) {
            Log.e("VoiceService:sendReKeyStanza, e2e key is empty");
            AnonymousClass00E.A08(false, "e2e key is empty!");
            return;
        }
        byte byteValue = A1B2.byteValue();
        Map map = this.A27;
        map.put(deviceJid, Byte.valueOf(byteValue));
        HashMap hashMap = new HashMap();
        hashMap.put(deviceJid, dataCopy);
        Map A0A2 = A0A(hashMap);
        if (A0A2 != null && (r1 = (AnonymousClass02P) A0A2.get(deviceJid)) != null) {
            if (!str2.equals(Voip.getCurrentCallId())) {
                StringBuilder sb = new StringBuilder("VoiceService:rekeyEncryptionTask(");
                sb.append(str2);
                sb.append(", ");
                sb.append(deviceJid);
                sb.append(", the call has ended, do nothing)");
                Log.w(sb.toString());
                return;
            }
            map.remove(deviceJid);
            this.A1s.A00(new AnonymousClass1XB(str, deviceJid, str2, C002001d.A11(voipStanzaChildNode, r1, byteValue), z));
        }
    }

    public final void A0i(String str, AnonymousClass0QM r22, int i, long j, Integer num, String str2, String str3, boolean z, CallGroupInfo callGroupInfo, boolean z2, boolean z3) {
        int i2;
        CallParticipant[] callParticipantArr;
        int length;
        C09260ca r9 = r22.A09;
        AnonymousClass00E.A08(!r9.A03, "processMissedIncomingCall should only be called on callee side");
        Voip.A01.A01(str);
        String voipParamForCall = Voip.getVoipParamForCall("test.name", str);
        if (voipParamForCall == null || voipParamForCall.isEmpty()) {
            voipParamForCall = null;
        }
        Voip.clearVoipParam(str);
        r22.A06(2);
        if (callGroupInfo == null || (length = (callParticipantArr = callGroupInfo.participants).length) <= 0) {
            i2 = 0;
        } else {
            i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                CallParticipant callParticipant = callParticipantArr[i3];
                if ("connected".equals(callParticipant.state)) {
                    r22.A0B(callParticipant.jid, 5);
                    i2++;
                }
            }
        }
        this.A1d.A08(r22);
        Message.obtain(this.A0J, 5, z2 ? 1 : 0, 0, r22).sendToTarget();
        UserJid userJid = r9.A01;
        WamCall wamCall = new WamCall();
        wamCall.callResult = Integer.valueOf(i);
        wamCall.callSide = 2;
        if (i2 > 0) {
            Boolean bool = Boolean.TRUE;
            wamCall.groupCallIsLastSegment = bool;
            wamCall.groupCallIsGroupCallInvitee = bool;
            wamCall.numConnectedParticipants = Long.valueOf((long) i2);
            wamCall.fieldStatsRowType = 2;
        } else {
            wamCall.callIsLastSegment = Boolean.TRUE;
        }
        wamCall.videoEnabled = Boolean.valueOf(z3);
        wamCall.callTestBucket = voipParamForCall;
        wamCall.incomingCallUiAction = (Integer) this.A24.get(str);
        A0S(wamCall, userJid, Long.valueOf(j), null, null, num, str2, str3);
        this.A1g.A06(wamCall, z);
    }

    public void A0j(String str, String str2, int i) {
        Log.i("voip/call/reject");
        if (i != 0) {
            this.A24.put(str, Integer.valueOf(i));
        }
        this.A0o.execute(new AnonymousClass385(str, str2));
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x02e1, code lost:
        if (r0 != 3) goto L_0x01af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x02eb, code lost:
        if (r1.equals("0") != false) goto L_0x02ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x02ed, code lost:
        com.whatsapp.util.Log.i("voip/ringtone/vibrate/off");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00f6, code lost:
        if (r14 == false) goto L_0x00f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x026e, code lost:
        if (r10.equals(r19.A1a.A06(com.google.android.search.verification.client.R.string.settings_sound_silent)) != false) goto L_0x0270;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x02df  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x02fd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0k(boolean r20, com.whatsapp.jid.UserJid r21, boolean r22, java.lang.String r23, boolean r24) {
        /*
        // Method dump skipped, instructions count: 1076
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3U7.A0k(boolean, com.whatsapp.jid.UserJid, boolean, java.lang.String, boolean):void");
    }

    public final boolean A0l() {
        PowerManager A0C2 = this.A1W.A0C();
        if (Build.VERSION.SDK_INT < 21) {
            return false;
        }
        if (A0C2 != null) {
            return A0C2.isPowerSaveMode();
        }
        Log.w("voip/service/start pm=null");
        return false;
    }

    public final boolean A0m() {
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 28) {
            Boolean A002 = Voip.A00("options.android_telecom_framework_callee");
            if (A002 != null && A002.booleanValue()) {
                z = true;
            }
            this.A1v.A02().A06 = z;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:324:0x0714, code lost:
        if (r0.isCaller == false) goto L_0x0716;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x013b, code lost:
        if (r0 == false) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:680:0x0c6c, code lost:
        if (r10 != null) goto L_0x0c37;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0184, code lost:
        if (r12 == false) goto L_0x0186;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x01fe  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0231  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x038e  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01ba  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0n(android.os.Message r29) {
        /*
        // Method dump skipped, instructions count: 3362
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3U7.A0n(android.os.Message):boolean");
    }

    public final boolean A0o(UserJid userJid, boolean z, String str) {
        C007003k A0A2 = this.A1S.A0A(userJid);
        if (Build.VERSION.SDK_INT < 28) {
            return false;
        }
        C09210cT r3 = this.A1v;
        Context context = this.A1A;
        AnonymousClass01I r0 = this.A1I;
        r0.A04();
        UserJid userJid2 = r0.A03;
        if (userJid2 == null) {
            throw null;
        } else if (!r3.A02().A08(context, userJid2)) {
            return false;
        } else {
            String A082 = this.A1T.A08(A0A2, false);
            C72713Ty A022 = r3.A02();
            AnonymousClass00E.A01();
            StringBuilder sb = new StringBuilder("voip/SelfManagedConnectionsManager/addNewIncomingCall ");
            sb.append(userJid);
            Log.i(sb.toString());
            if (!A022.A06) {
                Log.w("voip/SelfManagedConnectionsManager/addNewIncomingCall incomingEnabled is false");
                return false;
            }
            TelecomManager telecomManager = A022.A02;
            if (telecomManager == null) {
                Log.w("voip/SelfManagedConnectionsManager/addNewIncomingCall telecomManager is null");
                return false;
            }
            PhoneAccountHandle phoneAccountHandle = A022.A00;
            if (phoneAccountHandle == null) {
                Log.w("voip/SelfManagedConnectionsManager/addNewIncomingCall phoneAccountHandle is null");
                return false;
            }
            try {
                if (!telecomManager.isIncomingCallPermitted(phoneAccountHandle)) {
                    Log.i("voip/SelfManagedConnectionsManager/addNewIncomingCall incoming call not permitted for the phone account handle");
                    return false;
                }
                Uri A002 = C72713Ty.A00(userJid);
                if (A002 == null) {
                    return false;
                }
                Bundle A012 = C72713Ty.A01(str, userJid, A082, z, false);
                A012.putParcelable("android.telecom.extra.INCOMING_CALL_ADDRESS", A002);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("voip/SelfManagedConnectionsManager/addNewIncomingCall ");
                sb2.append(A012);
                Log.i(sb2.toString());
                try {
                    telecomManager.addNewIncomingCall(A022.A00, A012);
                    return true;
                } catch (SecurityException e) {
                    Log.e(e);
                    return false;
                }
            } catch (Exception e2) {
                Log.e(e2);
                return false;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0061, code lost:
        if (r1 == false) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006a, code lost:
        if (r19.A1C.A00 == false) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008c, code lost:
        if (r11 == false) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00e4, code lost:
        if (r1 == false) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0122, code lost:
        if (r19.A0q == false) goto L_0x0124;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0p(com.whatsapp.voipcalling.CallInfo r20) {
        /*
        // Method dump skipped, instructions count: 310
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3U7.A0p(com.whatsapp.voipcalling.CallInfo):boolean");
    }
}
