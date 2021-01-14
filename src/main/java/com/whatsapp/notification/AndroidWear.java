package com.whatsapp.notification;

import X.AbstractIntentServiceC29181Xk;
import X.AnonymousClass008;
import X.AnonymousClass00E;
import X.AnonymousClass01A;
import X.AnonymousClass01X;
import X.AnonymousClass022;
import X.AnonymousClass02M;
import X.AnonymousClass03E;
import X.AnonymousClass03P;
import X.AnonymousClass0BS;
import X.AnonymousClass0FE;
import X.AnonymousClass0YL;
import X.AnonymousClass178;
import X.C002001d;
import X.C007003k;
import X.C03170Fb;
import X.C04360Kb;
import X.C04410Kg;
import X.C14540mS;
import X.C14550mT;
import X.C14630mc;
import android.app.PendingIntent;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.HomeActivity;
import com.whatsapp.util.Log;

public final class AndroidWear extends AbstractIntentServiceC29181Xk {
    public static AnonymousClass178 A08;
    public static final int[] A09 = {R.string.android_wear_smile_emoji, R.string.android_wear_yes, R.string.android_wear_no, R.string.android_wear_on_my_way, R.string.android_wear_ok, R.string.android_wear_see_you_soon, R.string.android_wear_haha, R.string.android_wear_lol, R.string.android_wear_nice, R.string.android_wear_cant_talk, R.string.android_wear_sad_emoji, R.string.android_wear_thanks};
    public final AnonymousClass02M A00 = AnonymousClass02M.A00();
    public final C03170Fb A01 = C03170Fb.A00();
    public final C04360Kb A02 = C04360Kb.A00();
    public final AnonymousClass01A A03 = AnonymousClass01A.A00();
    public final C04410Kg A04 = C04410Kg.A00();
    public final AnonymousClass03P A05 = AnonymousClass03P.A00();
    public final AnonymousClass0FE A06 = AnonymousClass0FE.A00();
    public final AnonymousClass022 A07 = AnonymousClass022.A00();

    public AndroidWear() {
        super("AndroidWear");
    }

    public static C14550mT A00(Context context, C007003k r6, AnonymousClass01X r7) {
        C14540mS r1 = new C14540mS(R.drawable.ic_notif_mark_read, r7.A06(R.string.mark_read), PendingIntent.getService(context, 0, new Intent("com.whatsapp.intent.action.MARK_AS_READ", ContentUris.withAppendedId(AnonymousClass0YL.A00, r6.A01()), context, AndroidWear.class), 134217728));
        r1.A00 = 2;
        r1.A03 = false;
        return r1.A00();
    }

    public static boolean A01() {
        return Build.VERSION.SDK_INT >= 18;
    }

    public void onCreate() {
        Log.i("android-wear/onCreate");
        super.onCreate();
    }

    public void onDestroy() {
        Log.i("android-wear/onDestroy");
        stopForeground(true);
        super.onDestroy();
    }

    public void onHandleIntent(Intent intent) {
        if (intent != null) {
            if (!this.A01.A05()) {
                Log.i("androidwear/tosupdate/not allowed");
                return;
            }
            Bundle A002 = C14630mc.A00(intent);
            String str = null;
            if (AnonymousClass0YL.A00(intent.getData())) {
                AnonymousClass01A r2 = this.A03;
                Uri data = intent.getData();
                AnonymousClass00E.A06(AnonymousClass0YL.A00(data));
                C007003k A052 = r2.A05(ContentUris.parseId(data));
                if (A052 != null) {
                    if (A002 != null) {
                        CharSequence charSequence = A002.getCharSequence("android_wear_voice_input");
                        if (charSequence != null) {
                            str = charSequence.toString().trim();
                        }
                        if (!C002001d.A3R(this.A05, this.A07, str)) {
                            Log.i("androidwear/voiceinputfromandroidwear/message is empty");
                            AnonymousClass02M r22 = this.A00;
                            r22.A02.post(new RunnableEBaseShape11S0100000_I1_6(this, 9));
                            return;
                        }
                        AnonymousClass02M r23 = this.A00;
                        r23.A02.post(new RunnableEBaseShape1S1200000_I1(this, A052, str, 23));
                        return;
                    } else if ("com.whatsapp.intent.action.MARK_AS_READ".equals(intent.getAction())) {
                        AnonymousClass02M r24 = this.A00;
                        r24.A02.post(new RunnableEBaseShape8S0200000_I1_3(this, A052, 33));
                        return;
                    } else {
                        return;
                    }
                }
            }
            AnonymousClass02M r25 = this.A00;
            r25.A02.post(new RunnableEBaseShape11S0100000_I1_6(this, 8));
        }
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        StringBuilder sb = new StringBuilder("androidwear/onStartCommand: ");
        sb.append(intent);
        Log.i(sb.toString());
        if (intent != null && intent.getBooleanExtra("is_foreground", false)) {
            StringBuilder A0S = AnonymousClass008.A0S("androidwear/onStartCommand bundle:");
            A0S.append(intent.getExtras());
            A0S.append(" isForeground:");
            A0S.append(intent.getBooleanExtra("is_foreground", false));
            Log.d(A0S.toString());
            AnonymousClass03E A002 = AnonymousClass0BS.A00(this);
            A002.A0J = "other_notifications@1";
            AnonymousClass01X r2 = super.A01;
            A002.A0B(r2.A06(R.string.localized_app_name));
            A002.A0A(r2.A06(R.string.localized_app_name));
            A002.A09(r2.A06(R.string.sending_message));
            A002.A09 = PendingIntent.getActivity(this, 1, new Intent(this, HomeActivity.class), 0);
            int i3 = -2;
            if (Build.VERSION.SDK_INT >= 26) {
                i3 = -1;
            }
            A002.A03 = i3;
            A002.A07.icon = R.drawable.notifybar;
            startForeground(18, A002.A01());
        }
        return super.onStartCommand(intent, i, i2);
    }
}
