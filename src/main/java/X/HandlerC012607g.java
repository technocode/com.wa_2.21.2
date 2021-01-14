package X;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.07g  reason: invalid class name and case insensitive filesystem */
public final class HandlerC012607g extends HandlerC012707h {
    public final /* synthetic */ C012507f A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HandlerC012607g(C012507f r1, Looper looper) {
        super(looper);
        this.A00 = r1;
    }

    public final void handleMessage(Message message) {
        String str;
        String str2;
        C012507f r3 = this.A00;
        if (r3 != null) {
            if (message != null) {
                Object obj = message.obj;
                if (obj instanceof Intent) {
                    Intent intent = (Intent) obj;
                    intent.setExtrasClassLoader(new AnonymousClass1Es());
                    if (intent.hasExtra("google.messenger")) {
                        Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                        if (parcelableExtra instanceof AnonymousClass1Et) {
                            r3.A02 = (AnonymousClass1Et) parcelableExtra;
                        }
                        if (parcelableExtra instanceof Messenger) {
                            r3.A01 = (Messenger) parcelableExtra;
                        }
                    }
                    Intent intent2 = (Intent) message.obj;
                    String action = intent2.getAction();
                    if ("com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
                        String stringExtra = intent2.getStringExtra("registration_id");
                        if (stringExtra == null) {
                            stringExtra = intent2.getStringExtra("unregistered");
                        }
                        if (stringExtra == null) {
                            String stringExtra2 = intent2.getStringExtra("error");
                            if (stringExtra2 == null) {
                                String valueOf = String.valueOf(intent2.getExtras());
                                StringBuilder sb = new StringBuilder(valueOf.length() + 49);
                                sb.append("Unexpected response, no error or registration id ");
                                sb.append(valueOf);
                                Log.w("FirebaseInstanceId", sb.toString());
                                return;
                            }
                            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                                if (stringExtra2.length() != 0) {
                                    str = "Received InstanceID error ".concat(stringExtra2);
                                } else {
                                    str = new String("Received InstanceID error ");
                                }
                                Log.d("FirebaseInstanceId", str);
                            }
                            if (stringExtra2.startsWith("|")) {
                                String[] split = stringExtra2.split("\\|");
                                if (split.length <= 2 || !"ID".equals(split[1])) {
                                    Log.w("FirebaseInstanceId", stringExtra2.length() != 0 ? "Unexpected structured response ".concat(stringExtra2) : new String("Unexpected structured response "));
                                    return;
                                }
                                String str3 = split[2];
                                String str4 = split[3];
                                if (str4.startsWith(":")) {
                                    str4 = str4.substring(1);
                                }
                                r3.A01(str3, intent2.putExtra("error", str4).getExtras());
                                return;
                            }
                            AnonymousClass05W r4 = r3.A04;
                            synchronized (r4) {
                                for (int i = 0; i < r4.A00; i++) {
                                    r3.A01((String) r4.A02[i << 1], intent2.getExtras());
                                }
                            }
                            return;
                        }
                        Matcher matcher = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)").matcher(stringExtra);
                        if (matcher.matches()) {
                            String group = matcher.group(1);
                            String group2 = matcher.group(2);
                            Bundle extras = intent2.getExtras();
                            extras.putString("registration_id", group2);
                            r3.A01(group, extras);
                            return;
                        } else if (Log.isLoggable("FirebaseInstanceId", 3)) {
                            Log.d("FirebaseInstanceId", stringExtra.length() != 0 ? "Unexpected response string: ".concat(stringExtra) : new String("Unexpected response string: "));
                            return;
                        } else {
                            return;
                        }
                    } else if (Log.isLoggable("FirebaseInstanceId", 3)) {
                        String valueOf2 = String.valueOf(action);
                        if (valueOf2.length() != 0) {
                            str2 = "Unexpected response action: ".concat(valueOf2);
                        } else {
                            str2 = new String("Unexpected response action: ");
                        }
                        Log.d("FirebaseInstanceId", str2);
                        return;
                    } else {
                        return;
                    }
                }
            }
            Log.w("FirebaseInstanceId", "Dropping invalid message");
            return;
        }
        throw null;
    }
}
