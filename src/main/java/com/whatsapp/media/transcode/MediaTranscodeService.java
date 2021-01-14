package com.whatsapp.media.transcode;

import X.AbstractC007503q;
import X.AnonymousClass008;
import X.AnonymousClass019;
import X.AnonymousClass01A;
import X.AnonymousClass01X;
import X.AnonymousClass02N;
import X.AnonymousClass03E;
import X.AnonymousClass0AC;
import X.AnonymousClass0BS;
import X.AnonymousClass0E4;
import X.AnonymousClass0M3;
import X.AnonymousClass0M4;
import X.AnonymousClass1VY;
import X.C002001d;
import X.C007003k;
import X.C014308b;
import X.C04420Kh;
import X.C57052jc;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.text.TextUtils;
import com.google.android.search.verification.client.R;
import com.whatsapp.Conversation;
import com.whatsapp.HomeActivity;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.HashSet;

public class MediaTranscodeService extends AnonymousClass0E4 {
    public static final HashMap A08 = new HashMap();
    public int A00 = -1;
    public AnonymousClass019 A01;
    public String A02;
    public boolean A03 = false;
    public final AnonymousClass01A A04 = AnonymousClass01A.A00();
    public final C014308b A05 = C014308b.A00();
    public final AnonymousClass0AC A06 = AnonymousClass0AC.A00;
    public final C04420Kh A07 = C04420Kh.A00();

    public IBinder onBind(Intent intent) {
        return null;
    }

    public final void A00() {
        int i;
        PendingIntent activity;
        AnonymousClass01X r4;
        String A0A;
        int i2;
        int i3;
        String A082;
        int i4;
        int i5;
        String A083;
        boolean z = this.A03;
        this.A03 = true;
        HashSet hashSet = new HashSet();
        HashMap hashMap = A08;
        if (hashMap.size() == 1) {
            AnonymousClass0M3 r15 = (AnonymousClass0M3) hashMap.values().iterator().next();
            AnonymousClass01A r42 = this.A04;
            AnonymousClass02N r0 = r15.A0n.A00;
            C007003k A0A2 = r42.A0A(r0);
            byte b = r15.A0m;
            if (b == 2) {
                i5 = R.string.sending_audio_to_contact;
            } else if (b != 3) {
                i5 = R.string.sending_gif_to_contact;
                if (b != 13) {
                    i5 = R.string.sending_file_to_contact;
                }
            } else {
                i5 = R.string.sending_video_to_contact;
            }
            r4 = super.A01;
            Object[] objArr = new Object[1];
            if (AnonymousClass1VY.A0b(r0)) {
                A083 = r4.A06(R.string.my_status);
            } else {
                A083 = this.A05.A08(A0A2, false);
            }
            objArr[0] = C002001d.A1m(A083);
            A0A = r4.A0D(i5, objArr);
            AnonymousClass0M4 r02 = r15.A02;
            if (r02 != null) {
                i2 = (int) r02.A0C;
                C04420Kh r1 = this.A07;
                if (r1.A08(r15)) {
                    i2 >>= 1;
                    if (r1.A09(r15)) {
                        i2 += 50;
                    }
                }
            } else {
                i2 = -1;
            }
            activity = PendingIntent.getActivity(this, 5, Conversation.A04(this, A0A2), 134217728);
            hashSet.add(Byte.valueOf(b));
        } else {
            HashSet hashSet2 = new HashSet();
            for (AbstractC007503q r12 : hashMap.values()) {
                hashSet2.add(r12.A0n.A00);
                hashSet.add(Byte.valueOf(r12.A0m));
            }
            if (hashSet2.size() == 1) {
                C007003k A0A3 = this.A04.A0A((AnonymousClass02N) hashSet2.iterator().next());
                if (hashSet.size() == 1) {
                    byte byteValue = ((Number) hashSet.iterator().next()).byteValue();
                    if (byteValue == 2) {
                        i3 = R.plurals.sending_audios_to_contact;
                    } else if (byteValue != 3) {
                        i3 = R.plurals.sending_gifs_to_contact;
                        if (byteValue != 13) {
                            i3 = R.plurals.sending_files_to_contact;
                        }
                    } else {
                        i3 = R.plurals.sending_videos_to_contact;
                    }
                } else {
                    i3 = R.plurals.sending_files_to_contact;
                }
                r4 = super.A01;
                long size = (long) hashMap.size();
                Object[] objArr2 = new Object[2];
                objArr2[0] = Integer.valueOf(hashMap.size());
                if (AnonymousClass1VY.A0b((Jid) hashSet2.iterator().next())) {
                    A082 = r4.A06(R.string.my_status);
                } else {
                    A082 = this.A05.A08(A0A3, false);
                }
                objArr2[1] = C002001d.A1m(A082);
                A0A = r4.A0A(i3, size, objArr2);
                activity = PendingIntent.getActivity(this, 5, Conversation.A04(this, A0A3), 134217728);
            } else {
                if (hashSet.size() == 1) {
                    byte byteValue2 = ((Number) hashSet.iterator().next()).byteValue();
                    if (byteValue2 == 2) {
                        i = R.plurals.sending_audios_to_contacts;
                    } else if (byteValue2 != 3) {
                        i = R.plurals.sending_gifs_to_contacts;
                        if (byteValue2 != 13) {
                            i = R.plurals.sending_files_to_contacts;
                        }
                    } else {
                        i = R.plurals.sending_videos_to_contacts;
                    }
                } else {
                    i = R.plurals.sending_files_to_contacts;
                }
                activity = PendingIntent.getActivity(this, 1, new Intent(this, HomeActivity.class), 0);
                r4 = super.A01;
                A0A = r4.A0A(i, (long) hashMap.size(), Integer.valueOf(hashMap.size()));
            }
            i2 = -1;
        }
        AnonymousClass03E A002 = AnonymousClass0BS.A00(this);
        A002.A0J = "sending_media@1";
        A002.A09 = activity;
        A01(A002, i2, A0A, z);
        if (Build.VERSION.SDK_INT >= 21) {
            if (hashSet.size() == 1) {
                byte byteValue3 = ((Number) hashSet.iterator().next()).byteValue();
                if (byteValue3 == 2) {
                    i4 = R.plurals.sending_audios_to_contacts;
                } else if (byteValue3 != 3) {
                    i4 = R.plurals.sending_gifs_to_contacts;
                    if (byteValue3 != 13) {
                        i4 = R.plurals.sending_files_to_contacts;
                    }
                } else {
                    i4 = R.plurals.sending_videos_to_contacts;
                }
            } else {
                i4 = R.plurals.sending_files_to_contacts;
            }
            String A0A4 = r4.A0A(i4, (long) hashMap.size(), Integer.valueOf(hashMap.size()));
            AnonymousClass03E A003 = AnonymousClass0BS.A00(this);
            A003.A0J = "sending_media@1";
            A01(A003, i2, A0A4, z);
            A002.A08 = A003.A01();
        }
        Notification A012 = A002.A01();
        if (!z || this.A00 != i2 || !TextUtils.equals(A0A, this.A02)) {
            startForeground(3, A012);
        }
        this.A00 = i2;
        this.A02 = A0A;
    }

    public final void A01(AnonymousClass03E r4, int i, String str, boolean z) {
        r4.A0I = "progress";
        r4.A07.when = System.currentTimeMillis();
        r4.A0A(getString(R.string.app_name));
        r4.A09(str);
        if (i >= 0) {
            boolean z2 = false;
            if (i == 0) {
                z2 = true;
            }
            r4.A05 = 100;
            r4.A04 = i;
            r4.A0T = z2;
        }
        if (!z) {
            r4.A07.tickerText = AnonymousClass03E.A00(str);
        }
        r4.A07.icon = 17301640;
    }

    public void onCreate() {
        Log.i("MediaTranscodeService/onCreate");
        super.onCreate();
        C57052jc r1 = new C57052jc(this);
        this.A01 = r1;
        this.A06.A01(r1);
    }

    public void onDestroy() {
        StringBuilder A0S = AnonymousClass008.A0S("MediaTranscodeService/ondestroy foreground:");
        A0S.append(this.A03);
        A0S.append(" count:");
        A0S.append(A08.size());
        Log.d(A0S.toString());
        this.A03 = false;
        stopForeground(true);
        this.A06.A00(this.A01);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        StringBuilder sb = new StringBuilder("MediaTranscodeService/onStartCommand intent:");
        sb.append(intent);
        sb.append(" startId:");
        sb.append(i2);
        Log.d(sb.toString());
        if (intent == null || !"com.whatsapp.media.transcode.MediaTranscodeService.STOP".equals(intent.getAction())) {
            A00();
            return 2;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            AnonymousClass03E A002 = AnonymousClass0BS.A00(this);
            A002.A0J = "sending_media@1";
            A002.A0A(getString(R.string.app_name));
            A002.A09(super.A01.A06(R.string.sending_message));
            A002.A03 = -1;
            A002.A07.icon = 17301640;
            startForeground(3, A002.A01());
        }
        this.A03 = false;
        AnonymousClass008.A1H("MediaTranscodeService/stopService success:", stopSelfResult(i2));
        return 2;
    }
}
