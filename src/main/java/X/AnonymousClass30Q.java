package X;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.search.verification.client.R;
import com.whatsapp.registration.VerifySms;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.30Q  reason: invalid class name */
public class AnonymousClass30Q extends BroadcastReceiver {
    public boolean A00;
    public final AnonymousClass00D A01;
    public final AnonymousClass0KP A02;
    public final C70833Mo A03;
    public final AnonymousClass324 A04;
    public final AnonymousClass00T A05;
    public final WeakReference A06;

    public AnonymousClass30Q(VerifySms verifySms, AnonymousClass00T r3, AnonymousClass00D r4, AnonymousClass324 r5, AnonymousClass0KP r6, C70833Mo r7) {
        this.A06 = new WeakReference(verifySms);
        this.A05 = r3;
        this.A01 = r4;
        this.A04 = r5;
        this.A02 = r6;
        this.A03 = r7;
    }

    public void onReceive(Context context, Intent intent) {
        AnonymousClass00D r11;
        if ("com.google.android.gms.auth.api.phone.SMS_RETRIEVED".equals(intent.getAction())) {
            Log.i("smsretrieverreceiver/text/intent");
            if (this.A00) {
                Log.i("smsretrieverreceiver/already received");
                return;
            }
            VerifySms verifySms = (VerifySms) this.A06.get();
            if (verifySms == null) {
                Log.i("receivedtextreceiver/activity is null");
            } else if (C002001d.A3D(verifySms)) {
                Log.i("smsretrieverreceiver/destroyed");
            } else {
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    Log.e("smsretrieverreceiver/bundle-null");
                    return;
                }
                Status status = (Status) extras.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS");
                if (status == null) {
                    Log.e("smsretrieverreceiver/status-null");
                    return;
                }
                int i = status.A01;
                String str = null;
                if (i == 0) {
                    String string = extras.getString("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE");
                    if (string == null) {
                        AnonymousClass0JE.A0H(this.A01, "null-sms-message");
                        return;
                    }
                    AnonymousClass008.A16("smsretrieverreceiver/success/ message: ", string);
                    String string2 = verifySms.getString(R.string.localized_app_name);
                    StringBuilder A0S = AnonymousClass008.A0S("(?:WhatsApp|");
                    A0S.append(Pattern.quote(string2));
                    A0S.append(").*?([0-9]{3})-([0-9]{3})");
                    Matcher matcher = Pattern.compile(A0S.toString()).matcher(string);
                    if (matcher.find()) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(matcher.group(1));
                        sb.append(matcher.group(2));
                        str = sb.toString();
                    }
                    if (C006803i.A02(str, -1) != -1) {
                        this.A00 = true;
                        verifySms.A0y(str);
                        verifySms.A00 = 0;
                        AnonymousClass00T r1 = this.A05;
                        r11 = this.A01;
                        r1.ANC(new C09910dj(r11.A0F(), r11.A0H(), "sms", AnonymousClass2Nx.AUTO_DETECTED, verifySms, r11, this.A02, this.A03), str);
                    } else {
                        Log.w("verifysms/smsretriever/no-code");
                        r11 = this.A01;
                        AnonymousClass0JE.A0H(r11, "server-send-mismatch-empty");
                    }
                    AnonymousClass008.A0k(r11, "sms_retriever_retry_count", 0);
                } else if (i == 15) {
                    Log.d("[onReceive] timeout waiting for text message");
                    AnonymousClass00D r5 = this.A01;
                    int i2 = r5.A00.getInt("sms_retriever_retry_count", 0);
                    if (i2 < 2) {
                        Log.d("[onReceive] re-registering smsretriever client");
                        AbstractC011406u A012 = new AnonymousClass26F((Activity) verifySms).A01(new AnonymousClass26G());
                        AnonymousClass3MX r0 = new AnonymousClass3MX(this, i2);
                        if (A012 != null) {
                            Executor executor = AnonymousClass070.A00;
                            A012.A02(executor, r0);
                            A012.A01(executor, new AnonymousClass3MW(this));
                            return;
                        }
                        throw null;
                    }
                    AnonymousClass0JE.A0H(r5, "timeout-waiting-for-sms");
                    AnonymousClass008.A0k(r5, "sms_retriever_retry_count", 0);
                }
            }
        }
    }
}
