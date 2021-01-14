package X;

import android.app.Activity;
import android.nfc.NdefMessage;
import android.nfc.NdefRecord;
import android.nfc.NfcAdapter;
import android.nfc.NfcEvent;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.nio.charset.Charset;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1Ij  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C25801Ij implements NfcAdapter.CreateNdefMessageCallback {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ AnonymousClass01I A01;
    public final /* synthetic */ AnonymousClass00S A02;

    public /* synthetic */ C25801Ij(AnonymousClass01I r1, Activity activity, AnonymousClass00S r3) {
        this.A01 = r1;
        this.A00 = activity;
        this.A02 = r3;
    }

    public final NdefMessage createNdefMessage(NfcEvent nfcEvent) {
        AnonymousClass01I r8 = this.A01;
        Activity activity = this.A00;
        AnonymousClass00S r9 = this.A02;
        Log.i("newchatnfc/createndef");
        NdefRecord[] ndefRecordArr = new NdefRecord[2];
        byte[] bytes = "application/com.whatsapp.chat".getBytes(Charset.forName("US-ASCII"));
        r8.A04();
        UserJid userJid = r8.A03;
        if (userJid != null) {
            byte[] bytes2 = userJid.getRawString().getBytes(Charset.forName("US-ASCII"));
            JSONObject jSONObject = new JSONObject();
            try {
                r8.A04();
                UserJid userJid2 = r8.A03;
                if (userJid2 != null) {
                    jSONObject.put("jid", userJid2.getRawString());
                    String A09 = AnonymousClass0FI.A09(r9, r8);
                    jSONObject.put("id", A09);
                    jSONObject.put("name", r8.A02());
                    synchronized (C07620Yr.class) {
                        if (C07620Yr.A00 == null) {
                            C07620Yr.A00(activity);
                        }
                        C07620Yr.A00.add(0, A09);
                        if (C07620Yr.A00.size() > 16) {
                            List list = C07620Yr.A00;
                            list.remove(list.size() - 1);
                        }
                        C07620Yr.A01(activity);
                    }
                    ndefRecordArr[0] = new NdefRecord(2, bytes, bytes2, jSONObject.toString().getBytes(Charset.forName("US-ASCII")));
                    ndefRecordArr[1] = NdefRecord.createApplicationRecord("com.whatsapp");
                    return new NdefMessage(ndefRecordArr);
                }
                throw null;
            } catch (JSONException e) {
                Log.e("newchatnfc/", e);
            }
        } else {
            throw null;
        }
    }
}
