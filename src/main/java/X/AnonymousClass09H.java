package X;

import android.os.ConditionVariable;
import android.os.Message;
import android.util.Pair;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.GlVideoRenderer;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import org.wawebrtc.MediaCodecVideoEncoder;

/* renamed from: X.09H  reason: invalid class name */
public class AnonymousClass09H {
    public static volatile AnonymousClass09H A09;
    public AbstractC08920bz A00;
    public AnonymousClass0GA A01;
    public final AnonymousClass09K A02;
    public final AnonymousClass0EU A03;
    public final AnonymousClass09J A04;
    public final AnonymousClass09L A05;
    public final AnonymousClass09I A06;
    public final AnonymousClass09M A07;
    public final AtomicInteger A08 = new AtomicInteger();

    public AnonymousClass09H(AnonymousClass09I r2, AnonymousClass09J r3, AnonymousClass09K r4, AnonymousClass09L r5, AnonymousClass09M r6, AnonymousClass0EU r7) {
        this.A06 = r2;
        this.A04 = r3;
        this.A02 = r4;
        this.A05 = r5;
        this.A07 = r6;
        this.A03 = r7;
    }

    public static Message A00(int i, String str, AnonymousClass0M5 r5, boolean z, boolean z2) {
        Message obtain = Message.obtain(null, 0, 233, i, r5);
        obtain.getData().putString("messageClient:iqId", str);
        obtain.getData().putBoolean("messageClient:dropIfOffline", z);
        obtain.getData().putBoolean("messageClient:checkCallback", z2);
        return obtain;
    }

    public static AnonymousClass09H A01() {
        if (A09 == null) {
            synchronized (AnonymousClass09H.class) {
                if (A09 == null) {
                    A09 = new AnonymousClass09H(AnonymousClass09I.A01, AnonymousClass09J.A02, AnonymousClass09K.A07, AnonymousClass09L.A00(), AnonymousClass09M.A00(), AnonymousClass0EU.A03);
                }
            }
        }
        return A09;
    }

    public String A02() {
        String obj;
        AnonymousClass09M r6 = this.A07;
        synchronized (r6.A08) {
            StringBuilder sb = new StringBuilder();
            sb.append("0");
            int i = r6.A00;
            r6.A00 = i + 1;
            sb.append(Integer.toHexString(i));
            obj = sb.toString();
            boolean z = false;
            if (r6.A0B.put(obj, r6.A07) == null) {
                z = true;
            }
            AnonymousClass00E.A07(z);
            if (r6.A00 == 65536) {
                r6.A02.A04("iqId too large", null, false);
                r6.A00 = 0;
            }
        }
        return obj;
    }

    public String A03() {
        StringBuilder A0S = AnonymousClass008.A0S("n");
        A0S.append(Integer.toHexString(this.A08.getAndIncrement()));
        return A0S.toString();
    }

    public Future A04(AnonymousClass1XX r19, Message message) {
        AnonymousClass1XW r2;
        ArrayList arrayList;
        AnonymousClass1XX r6 = r19;
        AnonymousClass00E.A04(r6, "MessageClient/sendAckableMessage: stanzaKey is null");
        Jid jid = r6.A01;
        if (!(jid instanceof DeviceJid) || jid.getDevice() != 0) {
            r2 = null;
        } else {
            r2 = r6.A02();
            r2.A00 = ((DeviceJid) jid).userJid;
            StringBuilder sb = new StringBuilder("expecting a user jid for remote jid in ack for ");
            sb.append(r6);
            Log.d(sb.toString());
        }
        DeviceJid of = DeviceJid.of(r6.A02);
        if (of != null && of.device == 0) {
            if (r2 == null) {
                r2 = r6.A02();
            }
            r2.A01 = of.userJid;
            StringBuilder sb2 = new StringBuilder("expecting a user jid for participant jid in ack for ");
            sb2.append(r6);
            Log.d(sb2.toString());
        }
        if (r2 != null) {
            Map map = r2.A08;
            if (map.isEmpty()) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(map.values());
            }
            r6 = new AnonymousClass1XX(r2.A00, r2.A04, r2.A06, r2.A07, r2.A03, r2.A01, r2.A02, r2.A05, 0, arrayList);
        }
        AnonymousClass0I1 r4 = new AnonymousClass0I1();
        AnonymousClass09L r22 = this.A05;
        Map map2 = r22.A02;
        synchronized (map2) {
            if (map2.containsKey(r6)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("added duplicate ackable stanza: ");
                sb3.append(r6);
                Log.e(sb3.toString());
                r22.A01.A03("duplicate_ackable_stanza", 7);
            }
            map2.put(r6, r4);
            StringBuilder sb4 = new StringBuilder();
            sb4.append("added ackable stanza: ");
            sb4.append(r6);
            Log.d(sb4.toString());
        }
        A09(message);
        return r4;
    }

    public Future A05(String str, Message message, boolean z) {
        boolean containsKey;
        AnonymousClass00E.A04(str, "MessageClient/sendIq: id is null");
        if (z) {
            Map map = this.A05.A03;
            synchronized (map) {
                containsKey = map.containsKey(str);
            }
            if (containsKey) {
                this.A07.A03(str);
                throw new AnonymousClass1WI(AnonymousClass008.A0K("MessageClient/sendIq: duplicate id: ", str));
            }
        }
        AnonymousClass0I1 r2 = new AnonymousClass0I1();
        Map map2 = this.A05.A03;
        synchronized (map2) {
            map2.put(str, r2);
        }
        A09(message);
        this.A07.A03(str);
        return r2;
    }

    public void A06(int i, String str, AnonymousClass0M5 r13, AnonymousClass09O r14, long j) {
        AnonymousClass09K r2 = this.A02;
        boolean z = false;
        if (!r2.A06 || !r2.A02) {
            this.A07.A03(str);
            StringBuilder sb = new StringBuilder("MessageClient/sendIqWithCallback ready:");
            sb.append(r2.A06);
            sb.append(" connected:");
            sb.append(r2.A02);
            sb.append(" iqId=");
            sb.append(str);
            Log.i(sb.toString());
            r14.AEv(str);
            return;
        }
        this.A07.A04(str, r14, j, false);
        if (j > 0) {
            z = true;
        }
        A09(A00(i, str, r13, true, z));
    }

    public void A07(int i, String str, AnonymousClass0M5 r21, AnonymousClass09O r22, long j) {
        if (!A0B(i, str, r21, r22, j)) {
            StringBuilder sb = new StringBuilder("MessageClient/sendIqWithCallback/add-to-pending type: ");
            sb.append(i);
            sb.append(" id: ");
            sb.append(str);
            Log.i(sb.toString());
            this.A07.A04(str, r22, j, true);
            AnonymousClass09J r5 = this.A04;
            boolean z = false;
            if (j > 0) {
                z = true;
            }
            r5.A02(str, A00(i, str, r21, false, z), false);
        }
    }

    public void A08(long j) {
        ConditionVariable conditionVariable;
        AnonymousClass00E.A00();
        AnonymousClass0EU r2 = this.A03;
        if (!r2.A03()) {
            if (this.A00 != null) {
                Log.i("app/msghandler-not-connected/connecting-now");
                this.A00.AMQ();
            } else {
                Log.i("app/msghandler-not-connected/too-early-to-connect");
            }
            Log.i("app/waiting-for-msghandler-to-be-connected");
            if (r2 != null) {
                AnonymousClass00E.A00();
                synchronized (r2.A02) {
                    conditionVariable = r2.A01;
                }
                if (!conditionVariable.block(j)) {
                    Log.i("gdrive-service/backup-map/timeout-while-waiting-for-msghandler-to-be-connected/abort");
                    throw new AnonymousClass1WJ();
                }
            } else {
                throw null;
            }
        }
        Log.i("app/msghandler-connected/true");
    }

    public void A09(Message message) {
        AnonymousClass00E.A04(this.A01, "sendXmpp called before sending channel is ready");
        StringBuilder sb = new StringBuilder("MessageClient/sendXmpp; type=");
        int i = message.arg1;
        if (i == 233) {
            i = message.arg2;
        }
        AnonymousClass008.A1L(sb, i);
        int i2 = message.arg1;
        if (i2 == 233) {
            i2 = message.arg2;
        }
        switch (i2) {
            case 2:
            case 4:
            case 8:
            case 12:
            case 14:
            case 15:
            case GlVideoRenderer.CAP_RENDER_I420 /*{ENCODED_INT: 16}*/:
            case 17:
            case 19:
            case AnonymousClass0PW.A01 /*{ENCODED_INT: 20}*/:
            case 22:
            case 25:
            case 26:
            case 27:
            case 30:
            case 35:
            case 38:
            case 43:
            case 59:
            case 60:
            case 69:
            case 70:
            case 71:
            case AnonymousClass0PW.A02 /*{ENCODED_INT: 72}*/:
            case 73:
            case 77:
            case 81:
            case 82:
            case 83:
            case 84:
            case 89:
            case 91:
            case 92:
            case 93:
            case 98:
            case 99:
            case 100:
            case 101:
            case 105:
            case 106:
            case 107:
            case AnonymousClass0PW.A03 /*{ENCODED_INT: 108}*/:
            case 112:
            case 115:
            case 118:
            case 119:
            case 120:
            case 121:
            case 123:
            case 124:
            case 125:
            case 126:
            case 134:
            case 153:
            case 157:
            case 158:
            case 166:
            case 167:
            case 168:
            case 169:
            case 171:
            case 172:
            case MediaCodecVideoEncoder.MIN_ENCODER_WIDTH /*{ENCODED_INT: 176}*/:
            case 177:
            case 180:
            case 183:
            case 184:
            case 188:
            case 189:
            case 191:
            case 193:
            case 194:
            case 198:
            case 206:
            case 207:
            case 208:
            case 209:
            case 211:
            case 220:
            case 222:
            case 234:
            case 249:
            case 254:
                AbstractC08920bz r0 = this.A00;
                if (r0 != null) {
                    r0.AMQ();
                    break;
                } else {
                    throw null;
                }
        }
        this.A01.ANp(Message.obtain(message));
    }

    public final void A0A(Message message, String str, boolean z) {
        int i = message.arg1;
        if (i == 233) {
            i = message.arg2;
        }
        if (this.A02.A06) {
            if (z) {
                AnonymousClass09I r1 = this.A06;
                if (str == null) {
                    throw null;
                } else if (r1 != null) {
                    LinkedHashMap linkedHashMap = r1.A00;
                    synchronized (linkedHashMap) {
                        int i2 = 1;
                        if (linkedHashMap.containsKey(str)) {
                            i2 = 1 + ((Integer) ((Pair) linkedHashMap.get(str)).second).intValue();
                        }
                        linkedHashMap.put(str, Pair.create(message, Integer.valueOf(i2)));
                    }
                } else {
                    throw null;
                }
            }
            A09(message);
            return;
        }
        StringBuilder sb = new StringBuilder("MessageClient/sendMessageWhenReady/add-to-pending type: ");
        sb.append(i);
        sb.append(" id: ");
        sb.append(str);
        Log.i(sb.toString());
        this.A04.A02(str, message, z);
    }

    public boolean A0B(int i, String str, AnonymousClass0M5 r13, AnonymousClass09O r14, long j) {
        if (this.A02.A06) {
            this.A07.A04(str, r14, j, false);
            boolean z = false;
            if (j > 0) {
                z = true;
            }
            A09(A00(i, str, r13, false, z));
            return true;
        }
        this.A07.A03(str);
        StringBuilder sb = new StringBuilder("MessageClient/sendIqWithCallback not ready, iqId=");
        sb.append(str);
        Log.i(sb.toString());
        return false;
    }

    public boolean A0C(Message message) {
        if (!this.A02.A06) {
            return false;
        }
        A09(message);
        return true;
    }
}
