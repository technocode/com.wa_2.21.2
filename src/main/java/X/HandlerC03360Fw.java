package X;

import android.app.Application;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.google.android.search.verification.client.R;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.SpamWarningActivity;
import com.whatsapp.service.GcmFGService;
import com.whatsapp.util.Log;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.0Fw  reason: invalid class name and case insensitive filesystem */
public final class HandlerC03360Fw extends Handler implements AbstractC03370Fx {
    public final /* synthetic */ C03160Fa A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HandlerC03360Fw(C03160Fa r1, Looper looper) {
        super(looper);
        this.A00 = r1;
    }

    public void A00(boolean z) {
        Log.d("xmpp/handler/send/disconnected");
        obtainMessage(4, z ? 1 : 0, 0).sendToTarget();
    }

    public void handleMessage(Message message) {
        AnonymousClass0I1 r1;
        boolean z = false;
        switch (message.what) {
            case 0:
                Log.d("xmpp/handler/recv/sending_channel_ready");
                C03160Fa r4 = this.A00;
                AnonymousClass0GA r3 = (AnonymousClass0GA) message.obj;
                if (!r4.A1X) {
                    Log.i("xmpp/handleSendingChannelReady/not started");
                    return;
                }
                r4.A0A = r3;
                AnonymousClass09H r12 = r4.A0z;
                C57742kn r0 = new C57742kn(r4);
                r12.A01 = r3;
                r12.A00 = r0;
                Log.i("xmpp/connectionready");
                AnonymousClass0G6 r7 = r4.A12;
                r4.A01 = r7.A5m();
                r4.A0f.A00.registerReceiver(r4.A0G, new IntentFilter("com.whatsapp.MessageHandler.CONNECTIVITY_RETRY_ACTION"));
                HandlerThread handlerThread = new HandlerThread("MessageHandler Connectivity Handler");
                r4.A04 = handlerThread;
                handlerThread.start();
                r7.AQ5(new Handler(r4.A04.getLooper()));
                r4.A0D(true, false, false);
                r4.A0Y.A06 = true;
                AnonymousClass0KY r02 = r4.A06;
                if (r02 != null) {
                    r02.A01();
                }
                r4.A0o.A05(r4.A0b.A04());
                return;
            case 1:
                Log.d("xmpp/handler/recv/connecting");
                AnonymousClass0KY r42 = this.A00.A06;
                AnonymousClass09K r32 = r42.A0I;
                r32.A03 = true;
                r32.A00++;
                r32.A01 = false;
                AnonymousClass00E.A01();
                synchronized (r32) {
                    Iterator it = r32.A04.iterator();
                    while (it.hasNext()) {
                        it.next();
                    }
                }
                r42.A03();
                return;
            case 2:
                Log.d("xmpp/handler/recv/login_failed");
                C03160Fa r33 = this.A00;
                r33.A0B.set(false);
                C64232xq r8 = (C64232xq) message.obj;
                synchronized (r33.A1T) {
                    int i = r8.type;
                    boolean z2 = false;
                    if (i == 4 || i == 6) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("MessageHandler/login failed with server reason: ");
                        sb.append(i);
                        Log.w(sb.toString());
                        r33.A0F = true;
                        if (r8.type == 6) {
                            z2 = true;
                        }
                        r33.A0B(z2);
                        return;
                    }
                    AnonymousClass0KY r9 = r33.A06;
                    Application application = r9.A0O.A00;
                    AnonymousClass280 r13 = (AnonymousClass280) r9.A0a;
                    if (r13.A03.A01()) {
                        Log.d("InstrumentationObserverImpl/onAccountFailure");
                        r13.A04.A01();
                    }
                    int i2 = r8.type;
                    if (i2 == 0) {
                        r9.A0n.A01(true);
                        r9.A0o.A08();
                        Log.i("MessageHandlerCallback/onMessageHandlerLoginFailed/exception-password");
                    } else if (i2 == 5) {
                        r9.A0Q.A0h(true);
                        r9.A0n.A01(true);
                        Intent A02 = r9.A0o.A02();
                        A02.putExtra("com.whatsapp.registration.RegisterPhone.show_underage_account_ban_dialog", true);
                        application.startActivity(A02);
                    } else if (i2 == 7) {
                        if (r9.A0E.A0D(AbstractC000400g.A0U)) {
                            C001100q r6 = r9.A00;
                            synchronized (r6) {
                                Log.i("clearing client static key pair");
                                boolean commit = r6.A06.A01("keystore").edit().remove("client_static_keypair").remove("client_static_keypair_enc").remove("client_static_keypair_pwd_enc").remove("client_static_keypair_enc_ver").commit();
                                AnonymousClass1VU r03 = r6.A04;
                                if (r03 != null) {
                                    r03.A02();
                                }
                                r6.A05.A02();
                                r6.A00 = null;
                                if (!commit) {
                                    throw new RuntimeException("unable to clear client static keypair");
                                }
                            }
                            r9.A0v.A01();
                        }
                        r9.A0n.A01(true);
                        r9.A0o.A08();
                        Log.i("MessageHandlerCallback/onMessageHandlerLoginFailed/perm-banned");
                    } else if (i2 == 2) {
                        Intent intent = new Intent(null, null, application, SpamWarningActivity.class);
                        intent.setFlags(268435456);
                        intent.putExtra("spam_warning_reason_key", r8.code);
                        intent.putExtra("expiry_in_seconds", r8.expire_time_out);
                        String str = r8.banMessage;
                        if (str != null && !str.isEmpty()) {
                            intent.putExtra("spam_warning_message_key", str);
                        }
                        String str2 = r8.faqUrl;
                        if (str2 != null && !str2.isEmpty()) {
                            intent.putExtra("faq_url_key", str2);
                        }
                        r9.A0Q.A0i(true, System.currentTimeMillis() + ((long) (r8.expire_time_out * SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS)));
                        application.startActivity(intent);
                    } else if (i2 != 3) {
                        StringBuilder A0S = AnonymousClass008.A0S("message-handler-callback/login-failed LoginFailureException type: ");
                        A0S.append(i2);
                        Log.e(A0S.toString());
                    } else {
                        long j = r8.expiration_time;
                        if (j <= 0) {
                            j = r9.A0N.A05();
                        }
                        r9.A0Q.A00.edit().putLong("software_forced_expiration", j).apply();
                        r9.A02();
                    }
                    r33.A0v.A00(true);
                    r33.A0y.A01(r8);
                    AnonymousClass09M r14 = r33.A16;
                    AnonymousClass0GA r04 = r33.A0A;
                    if (r04 != null && r04.AAK()) {
                        z2 = true;
                    }
                    r14.A05(z2);
                    return;
                }
            case 3:
                StringBuilder A0S2 = AnonymousClass008.A0S("xmpp/handler/recv/connected; sessionId=");
                A0S2.append(message.arg1);
                A0S2.append(" ipV6=");
                AnonymousClass008.A1K(A0S2, message.arg2);
                C03160Fa r34 = this.A00;
                r34.A0B.set(false);
                int i3 = message.arg1;
                if (message.arg2 == 1) {
                    z = true;
                }
                r34.A08(i3, z);
                return;
            case 4:
                Log.d("xmpp/handler/recv/disconnected");
                C03160Fa r15 = this.A00;
                if (message.arg1 == 1) {
                    z = true;
                }
                r15.A0A(z);
                return;
            case 5:
                this.A00.A06.A04(message);
                return;
            case 6:
                Log.d("xmpp/handler/recv/clock-wrong");
                C03160Fa r16 = this.A00;
                r16.A0B.set(false);
                AnonymousClass0KY r62 = r16.A06;
                Log.i("message-handler-callback/handlerconnected/handleclockwrong");
                AnonymousClass0C5 r2 = r62.A0q;
                AnonymousClass00G r35 = r62.A0O;
                r2.A02(r35.A00, GcmFGService.class);
                AbstractC004502c r22 = r62.A03.A00;
                if (r22 == null || !C002001d.A3J(r22, r62.A0f, r62.A0h)) {
                    StringBuilder A0S3 = AnonymousClass008.A0S("message-handler-callback/handlerconnected/displayclockwrong/notification ");
                    A0S3.append(new Date().toString());
                    A0S3.append(" ");
                    A0S3.append(System.currentTimeMillis());
                    Log.w(A0S3.toString());
                    Application application2 = r35.A00;
                    AnonymousClass03C r36 = r62.A0P;
                    AnonymousClass01X r17 = r62.A0R;
                    C002001d.A2S(application2, r36, r17.A06(R.string.error_notification_title), r17.A06(R.string.clock_wrong), 8);
                    r62.A0h.A03 = true;
                    return;
                }
                return;
            case 7:
                Log.d("xmpp/handler/recv/software-expired");
                C03160Fa r18 = this.A00;
                r18.A0B.set(false);
                AnonymousClass0KY r37 = r18.A06;
                Log.i("message-handler-callback/handlerconnected/handlesoftwareexpired");
                r37.A0q.A02(r37.A0O.A00, GcmFGService.class);
                r37.A02();
                return;
            case 8:
                StringBuilder A0S4 = AnonymousClass008.A0S("xmpp/handler/recv/iq-response; id=");
                A0S4.append(message.obj);
                Log.d(A0S4.toString());
                AnonymousClass09L r19 = this.A00.A0y;
                Object obj = message.obj;
                Map map = r19.A03;
                synchronized (map) {
                    r1 = (AnonymousClass0I1) map.remove(obj);
                }
                if (r1 != null) {
                    r1.A01(null);
                    return;
                }
                return;
            case 9:
                Log.d("xmpp/handler/recv/ping-response");
                AnonymousClass0G3 r38 = this.A00.A0t;
                r38.A08.post(new RunnableEBaseShape3S0100000_I0_3(r38, 25));
                return;
            default:
                return;
        }
    }
}
