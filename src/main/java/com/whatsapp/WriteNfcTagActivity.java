package com.whatsapp;

import X.ActivityC004602e;
import X.ActivityC004702f;
import X.AnonymousClass01X;
import X.AnonymousClass0S2;
import X.AnonymousClass2C0;
import X.C04260Jr;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.nfc.NdefMessage;
import android.nfc.NdefRecord;
import android.nfc.NfcAdapter;
import android.nfc.Tag;
import android.nfc.tech.Ndef;
import android.nfc.tech.NdefFormatable;
import android.os.Bundle;
import android.os.Vibrator;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.nio.charset.Charset;

public class WriteNfcTagActivity extends ActivityC004602e {
    public PendingIntent A00;
    public NfcAdapter A01;
    public String A02;
    public String A03;
    public final C04260Jr A04 = C04260Jr.A00();

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AnonymousClass01X r2 = ((AnonymousClass2C0) this).A01;
        setTitle(r2.A06(R.string.write_nfc_tag));
        AnonymousClass0S2 A09 = A09();
        if (A09 != null) {
            A09.A0A(true);
            TextView textView = new TextView(this);
            textView.setGravity(17);
            textView.setText(r2.A06(R.string.approach_nfc_tag));
            setContentView(textView);
            this.A03 = getIntent().getStringExtra("mime");
            this.A02 = getIntent().getStringExtra("data");
            this.A01 = NfcAdapter.getDefaultAdapter(this);
            this.A00 = PendingIntent.getActivity(this, 0, new Intent(this, WriteNfcTagActivity.class).addFlags(536870912), 0);
            return;
        }
        throw null;
    }

    @Override // X.ActivityC004902h
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if ("android.nfc.action.TAG_DISCOVERED".equals(intent.getAction())) {
            Tag tag = (Tag) intent.getParcelableExtra("android.nfc.extra.TAG");
            NdefMessage ndefMessage = new NdefMessage(new NdefRecord[]{new NdefRecord(2, this.A03.getBytes(Charset.forName("US-ASCII")), null, this.A02.getBytes(Charset.forName("US-ASCII")))});
            int length = ndefMessage.toByteArray().length;
            try {
                Ndef ndef = Ndef.get(tag);
                if (ndef != null) {
                    ndef.connect();
                    if (!ndef.isWritable()) {
                        Log.e("writetag/failure/tag not writable");
                    } else if (ndef.getMaxSize() < length) {
                        Log.e("writetag/failure/tag too small");
                    } else {
                        ndef.writeNdefMessage(ndefMessage);
                    }
                    ((ActivityC004702f) this).A0F.A06(R.string.link_write_error, 0);
                    return;
                }
                NdefFormatable ndefFormatable = NdefFormatable.get(tag);
                if (ndefFormatable != null) {
                    try {
                        ndefFormatable.connect();
                        ndefFormatable.format(ndefMessage);
                    } catch (IOException e) {
                        Log.e("writetag/failure/", e);
                    }
                }
                ((ActivityC004702f) this).A0F.A06(R.string.link_write_error, 0);
                return;
                Log.i("writetag/success");
                ((ActivityC004702f) this).A0F.A06(R.string.link_written_confirmation, 1);
                C04260Jr r2 = this.A04;
                StringBuilder sb = new StringBuilder();
                sb.append("android.resource://com.whatsapp/");
                sb.append(R.raw.send_message);
                r2.A02(Uri.parse(sb.toString()));
                ((Vibrator) getSystemService("vibrator")).vibrate(75);
                finish();
            } catch (Exception e2) {
                Log.e("writetag/failure/", e2);
            }
        }
    }

    @Override // X.ActivityC004602e, X.ActivityC004702f, X.ActivityC004902h
    public void onPause() {
        super.onPause();
        this.A01.disableForegroundDispatch(this);
    }

    @Override // X.ActivityC004602e, X.ActivityC004702f, X.ActivityC004902h
    public void onResume() {
        super.onResume();
        this.A01.enableForegroundDispatch(this, this.A00, new IntentFilter[]{new IntentFilter("android.nfc.action.TAG_DISCOVERED")}, null);
    }
}
