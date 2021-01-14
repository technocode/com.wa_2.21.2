package X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0wG  reason: invalid class name and case insensitive filesystem */
public class RunnableC20170wG extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ Intent A01;
    public final /* synthetic */ AbstractC20180wH A02;

    public RunnableC20170wG(AbstractC20180wH r1, Context context, Intent intent) {
        this.A02 = r1;
        this.A00 = context;
        this.A01 = intent;
    }

    public void run() {
        String targetPackage;
        AbstractC20180wH r0 = this.A02;
        Context context = this.A00;
        Intent intent = this.A01;
        if (r0 == null) {
            throw null;
        } else if ("com.facebook.rti.fbns.intent.RECEIVE".equals(intent.getAction())) {
            Bundle bundleExtra = intent.getBundleExtra("auth_bundle");
            if (bundleExtra == null) {
                Log.e("FBNSPreloadAuthUtils/Invalid auth bundle");
                return;
            }
            PendingIntent pendingIntent = (PendingIntent) bundleExtra.getParcelable("auth_pending_intent");
            if (pendingIntent == null) {
                Log.e("FBNSPreloadAuthUtils/Invalid auth intent");
                return;
            }
            if (Build.VERSION.SDK_INT >= 17) {
                targetPackage = pendingIntent.getCreatorPackage();
            } else {
                targetPackage = pendingIntent.getTargetPackage();
            }
            if (C20130wC.A01(context, targetPackage)) {
                String stringExtra = intent.getStringExtra("receive_type");
                if ("message".equals(stringExtra)) {
                    String stringExtra2 = intent.getStringExtra("data");
                    C64652yX A002 = C64652yX.A00();
                    StringBuilder sb = new StringBuilder("WAFbnsPreloadReceiver/onMessage payload:");
                    sb.append(stringExtra2);
                    Log.d(sb.toString());
                    if (!TextUtils.isEmpty(stringExtra2)) {
                        try {
                            JSONObject jSONObject = new JSONObject(stringExtra2).getJSONObject("params");
                            String optString = jSONObject.optString("id", null);
                            String optString2 = jSONObject.optString("ip", null);
                            String optString3 = jSONObject.optString("cl_sess", null);
                            String optString4 = jSONObject.optString("mmsov", null);
                            String optString5 = jSONObject.optString("fbips", null);
                            String optString6 = jSONObject.optString("er_ri", null);
                            boolean equals = "1".equals(jSONObject.optString("notify", null));
                            String optString7 = jSONObject.optString("push_id", null);
                            String optString8 = jSONObject.optString("push_ts", null);
                            synchronized (A002) {
                                A002.A01(optString, optString2, optString3, optString4, optString5, optString6, equals, optString7, optString8, 1, null, null);
                            }
                        } catch (JSONException e) {
                            StringBuilder sb2 = new StringBuilder("WAFbnsPreloadReceiver/handleFbnsPush: invalid payload:");
                            sb2.append(stringExtra2);
                            Log.e(sb2.toString(), e);
                        }
                    }
                    String stringExtra3 = intent.getStringExtra("extra_notification_sender");
                    String stringExtra4 = intent.getStringExtra("extra_notification_id");
                    if (stringExtra3 != null && !stringExtra3.isEmpty() && stringExtra4 != null && !stringExtra4.isEmpty()) {
                        Intent intent2 = new Intent("com.facebook.rti.intent.ACTION_NOTIFICATION_ACK");
                        intent2.putExtra("extra_notification_id", stringExtra4);
                        intent2.putExtra("extra_processor_completed", true);
                        StringBuilder sb3 = new StringBuilder("FBNSPreloadReceiver/ackNotification pkg:");
                        sb3.append(stringExtra3);
                        sb3.append("notifId:");
                        sb3.append(stringExtra4);
                        Log.d(sb3.toString());
                        if ("com.facebook.services".equals(stringExtra3) || "com.facebook.services.dev".equals(stringExtra3)) {
                            try {
                                intent2.setPackage(stringExtra3);
                                C20130wC.A00(context, intent2);
                                context.sendBroadcast(intent2);
                            } catch (RuntimeException e2) {
                                if (!(e2.getCause() instanceof DeadObjectException)) {
                                    throw e2;
                                }
                            }
                        } else {
                            AnonymousClass008.A17("FBNSPreloadIPC/Unknown package ", stringExtra3);
                        }
                    }
                } else if ("registered".equals(stringExtra)) {
                    String stringExtra5 = intent.getStringExtra("data");
                    C07340Xd A003 = C07340Xd.A00();
                    AnonymousClass008.A16("WAFbnsPreloadReceiver/onRegistered token=", stringExtra5);
                    if (A003 == null) {
                        throw null;
                    } else if (TextUtils.isEmpty(stringExtra5)) {
                        Log.e("FbnsTokenManager/onTokenRecevied tokenFromFb is null");
                    } else {
                        synchronized (A003) {
                            if (stringExtra5.equals(A003.A00)) {
                                Log.d("FbnsTokenManager/onTokenRecevied token up-to-date");
                            } else {
                                A003.A02.A00.edit().putString("fbns_token", stringExtra5).putInt("fbns_app_vers", 210204500).apply();
                                A003.A03.A0Q(stringExtra5, "fbns", null);
                            }
                        }
                    }
                } else if ("unregistered".equals(stringExtra)) {
                    Log.d("WAFbnsPreloadReceiver/onUnregistered");
                } else if ("reg_error".equals(stringExtra)) {
                    intent.getStringExtra("data");
                    Log.d("WAFbnsPreloadReceiver/onRegistrationError");
                }
            }
        }
    }
}
