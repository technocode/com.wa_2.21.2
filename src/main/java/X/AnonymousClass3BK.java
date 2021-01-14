package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsMessage;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.npci.commonlibrary.GetCredential;
import org.npci.commonlibrary.NPCIFragment;

/* renamed from: X.3BK  reason: invalid class name */
public class AnonymousClass3BK extends BroadcastReceiver {
    public final /* synthetic */ GetCredential A00;

    public AnonymousClass3BK(GetCredential getCredential) {
        this.A00 = getCredential;
    }

    public void onReceive(Context context, Intent intent) {
        Bundle extras;
        Object[] objArr;
        if (!(intent.getAction() == null || !intent.getAction().equals("android.provider.Telephony.SMS_RECEIVED") || (extras = intent.getExtras()) == null || (objArr = (Object[]) extras.get("pdus")) == null)) {
            int length = objArr.length;
            SmsMessage[] smsMessageArr = new SmsMessage[length];
            for (int i = 0; i < length; i++) {
                smsMessageArr[i] = SmsMessage.createFromPdu((byte[]) objArr[i]);
                String originatingAddress = smsMessageArr[i].getOriginatingAddress();
                GetCredential getCredential = this.A00;
                AnonymousClass01X r2 = getCredential.A0F;
                String upperCase = originatingAddress.toUpperCase(r2.A0I());
                String upperCase2 = smsMessageArr[i].getMessageBody().toUpperCase(r2.A0I());
                AnonymousClass3BP r9 = new AnonymousClass3BP(getCredential.A0E);
                int i2 = 0;
                while (true) {
                    try {
                        if (i2 >= r9.A00.length()) {
                            break;
                        }
                        JSONObject jSONObject = r9.A00.getJSONObject(i2);
                        try {
                            JSONArray jSONArray = jSONObject.getJSONArray("sender");
                            int i3 = 0;
                            while (true) {
                                if (i3 >= jSONArray.length()) {
                                    continue;
                                    break;
                                } else if (!Pattern.compile(jSONArray.getString(i3), 2).matcher(upperCase).find()) {
                                    i3++;
                                } else if (Pattern.compile(jSONObject.getString("message"), 2).matcher(upperCase2).find()) {
                                    Matcher matcher = Pattern.compile((String) jSONObject.get("otp")).matcher(upperCase2);
                                    AnonymousClass3BO r22 = new AnonymousClass3BO();
                                    r22.A01 = upperCase2;
                                    if (matcher.find() && matcher.groupCount() >= 0) {
                                        r22.A00 = matcher.group(0);
                                        StringBuilder A0S = AnonymousClass008.A0S("PAY: OTP received:");
                                        A0S.append(r22.toString());
                                        Log.i(A0S.toString());
                                        NPCIFragment nPCIFragment = getCredential.A0B;
                                        int i4 = nPCIFragment.A00;
                                        if (i4 != -1) {
                                            nPCIFragment.A0A = true;
                                            ((AnonymousClass3BR) nPCIFragment.A0C.get(i4)).setText(r22.A00);
                                            ArrayList arrayList = nPCIFragment.A0C;
                                            int size = arrayList.size();
                                            int i5 = nPCIFragment.A00 + 1;
                                            if (size > i5) {
                                                ((AnonymousClass3BR) arrayList.get(i5)).A4L();
                                            }
                                        }
                                    }
                                } else {
                                    continue;
                                }
                            }
                        } catch (JSONException unused) {
                        }
                        i2++;
                    } catch (JSONException unused2) {
                        Log.e("PAY: failed to extract otp from text");
                    }
                }
            }
        }
    }
}
