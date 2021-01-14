package X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.text.format.DateUtils;
import android.widget.RemoteViews;
import com.google.android.search.verification.client.R;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.service.BackgroundMediaControlService;
import com.whatsapp.util.Log;

/* renamed from: X.2W4  reason: invalid class name */
public class AnonymousClass2W4 {
    public static volatile AnonymousClass2W4 A0F;
    public long A00;
    public AnonymousClass03E A01;
    public AbstractC007503q A02;
    public String A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final AnonymousClass01I A07;
    public final AnonymousClass0HJ A08;
    public final AnonymousClass01A A09;
    public final C014308b A0A;
    public final AnonymousClass0L2 A0B;
    public final AnonymousClass03P A0C;
    public final AnonymousClass03C A0D;
    public final AnonymousClass01X A0E;

    public AnonymousClass2W4(AnonymousClass01I r1, AnonymousClass0L2 r2, AnonymousClass0HJ r3, AnonymousClass01A r4, AnonymousClass03P r5, C014308b r6, AnonymousClass01X r7, AnonymousClass03C r8) {
        this.A07 = r1;
        this.A0B = r2;
        this.A08 = r3;
        this.A09 = r4;
        this.A0C = r5;
        this.A0A = r6;
        this.A0E = r7;
        this.A0D = r8;
    }

    public static AnonymousClass2W4 A00() {
        if (A0F == null) {
            synchronized (AnonymousClass2W4.class) {
                if (A0F == null) {
                    A0F = new AnonymousClass2W4(AnonymousClass01I.A00(), AnonymousClass0L2.A01(), AnonymousClass0HJ.A02(), AnonymousClass01A.A00(), AnonymousClass03P.A00(), C014308b.A00(), AnonymousClass01X.A00(), AnonymousClass03C.A00());
                }
            }
        }
        return A0F;
    }

    public void A01() {
        this.A06 = true;
        this.A0D.A04(null, 14, "OngoingMediaNotification2");
    }

    public final void A02(Context context, RemoteViews remoteViews, boolean z) {
        int i;
        String str = this.A03;
        if (str != null) {
            remoteViews.setTextViewText(R.id.ongoing_media_text, str);
        }
        Intent intent = new Intent(context, BackgroundMediaControlService.class);
        if (z) {
            intent.setAction("com.whatsapp.service.BackgroundMediaControlService.STOP");
            i = R.id.ongoing_media_control_btn;
            remoteViews.setImageViewResource(R.id.ongoing_media_control_btn, R.drawable.inline_audio_pause);
            remoteViews.setContentDescription(R.id.ongoing_media_control_btn, this.A0E.A06(R.string.pause));
        } else {
            intent.setAction("com.whatsapp.service.BackgroundMediaControlService.START");
            i = R.id.ongoing_media_control_btn;
            remoteViews.setImageViewResource(R.id.ongoing_media_control_btn, R.drawable.inline_audio_play);
            remoteViews.setContentDescription(R.id.ongoing_media_control_btn, this.A0E.A06(R.string.play));
        }
        this.A01.A06(2, z);
        this.A05 = z;
        remoteViews.setOnClickPendingIntent(i, PendingIntent.getService(context, 0, intent, 134217728));
        this.A01.A0E = remoteViews;
        Log.d("ongoingmedianotification/finishUpdateAndNotify");
        this.A0D.A03(null, 14, this.A01.A01());
    }

    public void A03(Context context, C28301Tu r9) {
        boolean A0P = r9.A0P();
        if (!this.A04) {
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), (int) R.layout.ongoing_media_notification);
            int A092 = r9.A09();
            remoteViews.setProgressBar(R.id.ongoing_media_audio_seekbar, r9.A02, A092, false);
            remoteViews.setTextViewText(R.id.ongoing_media_timeLeft, DateUtils.formatElapsedTime((long) (A092 / SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS)));
            A02(context, remoteViews, A0P);
            return;
        }
        if (!A0P ? !this.A05 : this.A05) {
            if (!this.A06) {
                return;
            }
        }
        A02(context, new RemoteViews(context.getPackageName(), (int) R.layout.ongoing_media_notification_talkback), A0P);
        this.A06 = false;
    }
}
