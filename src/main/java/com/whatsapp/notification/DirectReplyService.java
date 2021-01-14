package com.whatsapp.notification;

import X.AbstractIntentServiceC29181Xk;
import X.AnonymousClass008;
import X.AnonymousClass00E;
import X.AnonymousClass01A;
import X.AnonymousClass01X;
import X.AnonymousClass022;
import X.AnonymousClass02M;
import X.AnonymousClass02N;
import X.AnonymousClass03P;
import X.AnonymousClass0AC;
import X.AnonymousClass0FE;
import X.AnonymousClass0FJ;
import X.AnonymousClass0L1;
import X.AnonymousClass0YL;
import X.C002001d;
import X.C007003k;
import X.C03170Fb;
import X.C04360Kb;
import X.C04410Kg;
import X.C14540mS;
import X.C14550mT;
import X.C14630mc;
import X.C58652mH;
import X.RunnableC50732Vv;
import X.RunnableC50742Vw;
import android.app.PendingIntent;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;

public class DirectReplyService extends AbstractIntentServiceC29181Xk {
    public static final String A0A = AnonymousClass008.A0K("com.whatsapp", ".intent.action.DIRECT_REPLY_FROM_MESSAGE");
    public static final String A0B = AnonymousClass008.A0K("com.whatsapp", ".intent.action.DIRECT_REPLY_FROM_MISSED_CALL");
    public final AnonymousClass02M A00 = AnonymousClass02M.A00();
    public final C03170Fb A01 = C03170Fb.A00();
    public final C04360Kb A02 = C04360Kb.A00();
    public final AnonymousClass01A A03 = AnonymousClass01A.A00();
    public final C04410Kg A04 = C04410Kg.A00();
    public final AnonymousClass03P A05 = AnonymousClass03P.A00();
    public final AnonymousClass0AC A06 = AnonymousClass0AC.A00;
    public final AnonymousClass0FE A07 = AnonymousClass0FE.A00();
    public final AnonymousClass0L1 A08 = AnonymousClass0L1.A00();
    public final AnonymousClass022 A09 = AnonymousClass022.A00();

    public DirectReplyService() {
        super("DirectReply");
    }

    public static C14550mT A00(Context context, AnonymousClass01X r13, C007003k r14, String str, int i) {
        C14630mc r6 = new C14630mc("direct_reply_input", r13.A06(R.string.notification_quick_reply), null, new Bundle(), new HashSet());
        C14540mS r1 = new C14540mS(R.drawable.ic_action_reply, r6.A01, PendingIntent.getService(context, 0, new Intent(str, ContentUris.withAppendedId(AnonymousClass0YL.A00, r14.A01()), context, DirectReplyService.class).putExtra("direct_reply_num_messages", i), 134217728));
        ArrayList arrayList = r1.A01;
        if (arrayList == null) {
            arrayList = new ArrayList();
            r1.A01 = arrayList;
        }
        arrayList.add(r6);
        r1.A00 = 1;
        r1.A03 = false;
        return r1.A00();
    }

    public static boolean A01() {
        return Build.VERSION.SDK_INT >= 24;
    }

    public /* synthetic */ void A02(C58652mH r13, C007003k r14, String str, String str2) {
        this.A06.A01(r13);
        this.A02.A0T(Collections.singletonList(r14.A02(AnonymousClass02N.class)), str, null, null, null, false, false);
        if (A0B.equals(str2)) {
            this.A08.A03();
        } else if (Build.VERSION.SDK_INT < 28) {
            this.A04.A03((AnonymousClass02N) r14.A02(AnonymousClass02N.class), true, true);
            this.A07.A04();
        } else {
            this.A04.A03((AnonymousClass02N) r14.A02(AnonymousClass02N.class), true, false);
        }
    }

    public void A03(C58652mH r71, String str, C007003k r73, Intent intent) {
        this.A06.A00(r71);
        if (Build.VERSION.SDK_INT >= 28 && !A0B.equals(str)) {
            AnonymousClass0FE r11 = this.A07;
            AnonymousClass02N r10 = (AnonymousClass02N) r73.A02(AnonymousClass02N.class);
            int intExtra = intent.getIntExtra("direct_reply_num_messages", 0);
            if (r11 != null) {
                StringBuilder sb = new StringBuilder("messagenotification/posting reply update runnable for jid:");
                sb.append(r10);
                Log.i(sb.toString());
                r11.A02().post(new AnonymousClass0FJ(r11.A0N.A00, r11.A07, r11.A08, r11.A0C, r11.A05, r11.A0g, r11.A0R, r11.A06, r11.A0W, r11.A0B, r11.A0K, r11.A0i, r11.A0F, r11.A0G, r11.A0H, r11.A0I, r11.A0L, r11.A0J, r11.A0Q, r11.A0c, r11.A0f, r11.A0h, r11.A0T, r11.A0e, r11.A0a, r11.A0D, r11.A0Y, r11, r11.A0X, r11.A0P, r11.A0S, r11.A0O, r11.A0A, r11.A0U, r11.A09, r11.A0d, r11.A04, r11.A0E, null, true, true, false, r10, intExtra, true));
                return;
            }
            throw null;
        }
    }

    public void onHandleIntent(Intent intent) {
        StringBuilder sb = new StringBuilder("directreplyservice/intent: ");
        sb.append(intent);
        sb.append(" num_message:");
        sb.append(intent.getIntExtra("direct_reply_num_messages", 0));
        Log.i(sb.toString());
        if (!this.A01.A05()) {
            Log.i("directreplyservice/tos update does not allow messaging");
            return;
        }
        Bundle A002 = C14630mc.A00(intent);
        if (A002 == null) {
            Log.i("directreplyservice/could not find remote input");
            return;
        }
        String str = null;
        if (AnonymousClass0YL.A00(intent.getData())) {
            AnonymousClass01A r2 = this.A03;
            Uri data = intent.getData();
            AnonymousClass00E.A06(AnonymousClass0YL.A00(data));
            C007003k A052 = r2.A05(ContentUris.parseId(data));
            if (A052 != null) {
                CharSequence charSequence = A002.getCharSequence("direct_reply_input");
                if (charSequence != null) {
                    str = charSequence.toString().trim();
                }
                if (!C002001d.A3R(this.A05, this.A09, str)) {
                    Log.i("directreplyservice/message is empty");
                    AnonymousClass02M r22 = this.A00;
                    r22.A02.post(new RunnableEBaseShape11S0100000_I1_6(this, 10));
                    return;
                }
                String action = intent.getAction();
                CountDownLatch countDownLatch = new CountDownLatch(1);
                C58652mH r5 = new C58652mH((AnonymousClass02N) A052.A02(AnonymousClass02N.class), countDownLatch);
                AnonymousClass02M r0 = this.A00;
                RunnableC50732Vv r3 = new RunnableC50732Vv(this, r5, A052, str, action);
                Handler handler = r0.A02;
                handler.post(r3);
                try {
                    countDownLatch.await();
                } catch (InterruptedException e) {
                    Log.e("Interrupted while waiting to add message", e);
                }
                handler.post(new RunnableC50742Vw(this, r5, action, A052, intent));
                return;
            }
        }
        Log.i("directreplyservice/contact could not be found");
    }
}
