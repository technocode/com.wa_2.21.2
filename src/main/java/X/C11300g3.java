package X;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.util.Log;
import java.util.Arrays;
import org.wawebrtc.MediaCodecVideoEncoder;

/* renamed from: X.0g3  reason: invalid class name and case insensitive filesystem */
public class C11300g3 {
    public final AbstractC11290g2 A00;

    public C11300g3(AbstractC11290g2 r1) {
        this.A00 = r1;
    }

    public void A00(int i, AnonymousClass0M5 r6, AnonymousClass1XX r7) {
        AnonymousClass008.A0v("xmpp/reader/on-xmpp-recv type=", i);
        AbstractC11290g2 r3 = this.A00;
        Message obtain = Message.obtain(null, 0, i, 0, r6);
        if (r7 != null) {
            obtain.getData().putParcelable("stanzaKey", r7);
        }
        ((HandlerC11280g1) r3).A00(obtain);
    }

    public void A01(long j) {
        AnonymousClass008.A10("xmpp/reader/read/ping_response; timestamp=", j);
        Handler handler = (Handler) this.A00;
        if (handler != null) {
            StringBuilder sb = new StringBuilder("xmpp/connection/send/ping_response; timestamp=");
            sb.append(j);
            Log.d(sb.toString());
            Message obtainMessage = handler.obtainMessage(3);
            obtainMessage.getData().putLong("timestamp", j);
            obtainMessage.sendToTarget();
            return;
        }
        throw null;
    }

    public void A02(DeviceJid deviceJid, int i) {
        Log.i("xmpp/reader/on-get-identity-error");
        AbstractC11290g2 r4 = this.A00;
        Bundle bundle = new Bundle();
        bundle.putParcelable("jid", deviceJid);
        bundle.putInt("errorCode", i);
        ((HandlerC11280g1) r4).A00(Message.obtain(null, 0, MediaCodecVideoEncoder.MIN_ENCODER_HEIGHT, 0, bundle));
    }

    public void A03(AnonymousClass1XX r5) {
        AnonymousClass008.A1U(AnonymousClass008.A0S("xmpp/reader/on-ack-stanza stanza-id="), r5.A07);
        ((HandlerC11280g1) this.A00).A00(Message.obtain(null, 0, 205, 0, r5));
    }

    public void A04(AnonymousClass1XX r6, AnonymousClass1XZ r7) {
        Log.i("xmpp/reader/read/on-qr-action-set-chat");
        ((HandlerC11280g1) this.A00).A00(Message.obtain(null, 0, 39, 0, new C57942l7(r6.A01, r6.A07, r7)));
    }

    public void A05(AnonymousClass1XX r6, C64362y4 r7) {
        StringBuilder sb = new StringBuilder("xmpp/reader/read/on-qr-action-label ");
        sb.append(r7);
        Log.i(sb.toString());
        ((HandlerC11280g1) this.A00).A00(Message.obtain(null, 0, 173, 0, new C57912l4(r6.A01, r6.A07, r7)));
    }

    public void A06(AnonymousClass1XX r6, C64372y5 r7) {
        Log.i("xmpp/reader/read/on-qr-action-set-pic");
        ((HandlerC11280g1) this.A00).A00(Message.obtain(null, 0, 34, 0, new C57992lC(r6.A01, r6.A07, r7)));
    }

    public void A07(AnonymousClass1XX r6, C64382y6 r7) {
        Log.i("xmpp/reader/read/on-qr-action-set-prs");
        ((HandlerC11280g1) this.A00).A00(Message.obtain(null, 0, 35, 0, new C58002lD(r6.A01, r6.A07, r7)));
    }

    public void A08(AnonymousClass1XX r5, byte[] bArr, AnonymousClass0RB r7) {
        StringBuilder sb = new StringBuilder("xmpp/reader/read/sync-notify-add; stanzaKey=");
        sb.append(r5);
        sb.append("; jidHash=");
        sb.append(Arrays.toString(bArr));
        Log.i(sb.toString());
        AbstractC11290g2 r3 = this.A00;
        Message obtain = Message.obtain(null, 0, 24, 0, r7);
        Bundle data = obtain.getData();
        data.putParcelable("stanzaKey", r5);
        data.putByteArray("jidHash", bArr);
        ((HandlerC11280g1) r3).A00(obtain);
    }

    public void A09(AnonymousClass3LL r5) {
        String str = ((AnonymousClass1XB) r5).A01.tag;
        String str2 = r5.A02;
        StringBuilder sb = new StringBuilder("xmpp/reader/read/on-qr-action-relay-call-stanza-");
        sb.append(str);
        sb.append("; callId=");
        sb.append(str2);
        Log.i(sb.toString());
        ((HandlerC11280g1) this.A00).A00(Message.obtain(null, 0, 162, 0, r5));
    }

    public void A0A(String str, int i) {
        AnonymousClass008.A0v("xmpp/reader/read/on-qr-sync-error ", i);
        ((HandlerC11280g1) this.A00).A00(Message.obtain(null, 0, 29, 0, new C58122lP(str, i)));
    }

    public void A0B(String str, String str2, int i, String str3) {
        StringBuilder sb = new StringBuilder("xmpp/reader/on-set-two-factor-auth-error errorCode: ");
        sb.append(i);
        sb.append(" errorMessage: ");
        sb.append(str3);
        Log.w(sb.toString());
        AbstractC11290g2 r4 = this.A00;
        Bundle bundle = new Bundle();
        bundle.putString("code", str);
        bundle.putString("email", str2);
        bundle.putInt("errorCode", i);
        bundle.putString("errorMessage", str3);
        ((HandlerC11280g1) r4).A00(Message.obtain(null, 0, 103, 0, bundle));
    }

    public void A0C(DeviceJid[] deviceJidArr, int i) {
        Log.i("xmpp/reader/on-get-pre-key-error");
        AbstractC11290g2 r4 = this.A00;
        Bundle bundle = new Bundle();
        bundle.putParcelableArray("jids", deviceJidArr);
        bundle.putInt("errorCode", i);
        ((HandlerC11280g1) r4).A00(Message.obtain(null, 0, 76, 0, bundle));
    }
}
