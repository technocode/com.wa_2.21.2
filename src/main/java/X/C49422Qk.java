package X;

import android.nfc.NdefMessage;
import android.nfc.NdefRecord;
import android.nfc.NfcAdapter;
import android.nfc.NfcEvent;
import com.whatsapp.identity.IdentityVerificationActivity;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.nio.charset.Charset;

/* renamed from: X.2Qk  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C49422Qk implements NfcAdapter.CreateNdefMessageCallback {
    public final /* synthetic */ IdentityVerificationActivity A00;

    public /* synthetic */ C49422Qk(IdentityVerificationActivity identityVerificationActivity) {
        this.A00 = identityVerificationActivity;
    }

    public final NdefMessage createNdefMessage(NfcEvent nfcEvent) {
        IdentityVerificationActivity identityVerificationActivity = this.A00;
        if (identityVerificationActivity.A09 == null) {
            Log.w("idverification/createndef/no-fingerprint");
            return null;
        }
        NdefRecord[] ndefRecordArr = new NdefRecord[2];
        byte[] bytes = "application/com.whatsapp.identity".getBytes(Charset.forName("US-ASCII"));
        AnonymousClass01I r0 = identityVerificationActivity.A0I;
        r0.A04();
        UserJid userJid = r0.A03;
        if (userJid != null) {
            ndefRecordArr[0] = new NdefRecord(2, bytes, userJid.getRawString().getBytes(Charset.forName("US-ASCII")), identityVerificationActivity.A09.A01.A09());
            ndefRecordArr[1] = NdefRecord.createApplicationRecord("com.whatsapp");
            return new NdefMessage(ndefRecordArr);
        }
        throw null;
    }
}
