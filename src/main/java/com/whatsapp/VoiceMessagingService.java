package com.whatsapp;

import X.AnonymousClass008;
import X.AnonymousClass01X;
import X.AnonymousClass02N;
import X.AnonymousClass03E;
import X.AnonymousClass0BS;
import X.AnonymousClass0CP;
import X.AnonymousClass0LB;
import X.AnonymousClass0M4;
import X.AnonymousClass0S7;
import X.AnonymousClass1VY;
import X.C02220Bc;
import X.C03170Fb;
import X.C04360Kb;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.search.verification.client.R;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.util.Log;
import java.io.IOException;

public class VoiceMessagingService extends SearchActionVerificationClientService {
    public final Handler A00 = new Handler(Looper.getMainLooper());
    public final AnonymousClass0LB A01 = AnonymousClass0LB.A00();
    public final C03170Fb A02 = C03170Fb.A00();
    public final C04360Kb A03 = C04360Kb.A00();
    public final AnonymousClass01X A04 = AnonymousClass01X.A00();
    public final AnonymousClass0CP A05 = AnonymousClass0CP.A00();
    public final C02220Bc A06 = C02220Bc.A00();

    public void attachBaseContext(Context context) {
        super.attachBaseContext(new AnonymousClass0S7(context, this.A04, this.A01));
    }

    @Override // com.google.android.search.verification.client.SearchActionVerificationClientService
    public void performAction(Intent intent, boolean z, Bundle bundle) {
        Uri uri;
        if (!z) {
            Log.w("VoiceMessagingService/ignoring unverified voice message");
        } else if (!this.A02.A05()) {
            Log.i("VoiceMessagingService/ignoring voice message due to ToS update state");
        } else {
            String stringExtra = intent.getStringExtra("com.google.android.voicesearch.extra.RECIPIENT_CONTACT_CHAT_ID");
            AnonymousClass02N A012 = AnonymousClass02N.A01(stringExtra);
            if (AnonymousClass1VY.A0e(A012) || AnonymousClass1VY.A0T(A012) || AnonymousClass1VY.A0Y(A012)) {
                ClipData clipData = intent.getClipData();
                if (clipData != null) {
                    if (clipData.getItemCount() == 1) {
                        ClipData.Item itemAt = clipData.getItemAt(0);
                        if (!(itemAt == null || (uri = itemAt.getUri()) == null)) {
                            try {
                                AnonymousClass0M4 r3 = new AnonymousClass0M4();
                                r3.A0F = this.A06.A09(uri);
                                StringBuilder sb = new StringBuilder();
                                sb.append("VoiceMessagingService/sending verified voice message (voice); jid=");
                                sb.append(A012);
                                Log.i(sb.toString());
                                this.A00.post(new RunnableEBaseShape2S0300000_I1(this, A012, r3, 14));
                                return;
                            } catch (IOException e) {
                                Log.w("VoiceMessagingService/IO Exception while trying to send voice message", e);
                                return;
                            }
                        }
                    } else if (clipData.getItemCount() > 1 || clipData.getItemCount() < 0) {
                        StringBuilder A0S = AnonymousClass008.A0S("VoiceMessagingService/ignoring voice message with unexpected item count; itemCount=");
                        A0S.append(clipData.getItemCount());
                        Log.w(A0S.toString());
                        return;
                    }
                }
                String stringExtra2 = intent.getStringExtra("android.intent.extra.TEXT");
                if (TextUtils.isEmpty(stringExtra2)) {
                    StringBuilder sb2 = new StringBuilder("VoiceMessagingService/ignoring voice message with empty contents; jid=");
                    sb2.append(A012);
                    sb2.append("; text=");
                    sb2.append(stringExtra2);
                    Log.w(sb2.toString());
                    return;
                }
                AnonymousClass008.A12("VoiceMessagingService/sending verified voice message (text); jid=", A012);
                this.A00.post(new RunnableEBaseShape1S1200000_I1(this, A012, stringExtra2, 10));
                return;
            }
            AnonymousClass008.A19("VoiceMessagingService/ignoring voice message directed at invalid jid; jid=", stringExtra);
        }
    }

    @Override // com.google.android.search.verification.client.SearchActionVerificationClientService
    public void postForegroundNotification() {
        AnonymousClass03E A002 = AnonymousClass0BS.A00(this);
        A002.A0J = "other_notifications@1";
        A002.A0A(this.A04.A06(R.string.sending_message));
        A002.A09 = PendingIntent.getActivity(this, 1, new Intent(this, HomeActivity.class), 0);
        A002.A03 = -2;
        A002.A07.icon = R.drawable.notifybar;
        Notification A012 = A002.A01();
        StringBuilder sb = new StringBuilder("VoiceMessagingService/posting assistant notif:");
        sb.append(A012);
        Log.i(sb.toString());
        startForeground(19, A012);
    }
}
