package X;

import com.whatsapp.jid.DeviceJid;
import java.util.Arrays;

/* renamed from: X.0PY  reason: invalid class name */
public class AnonymousClass0PY {
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final long A07;
    public final long A08;
    public final long A09;
    public final long A0A;
    public final DeviceJid A0B;

    public AnonymousClass0PY(long j, DeviceJid deviceJid, int i, long j2, long j3, long j4, long j5, int i2, long j6, long j7) {
        this.A06 = j;
        this.A0B = deviceJid;
        this.A02 = i;
        this.A04 = j2;
        this.A09 = j3;
        this.A0A = j4;
        this.A08 = j5;
        this.A00 = i2;
        this.A07 = j6;
        this.A03 = j7;
        this.A01 = 1;
        this.A05 = -1;
    }

    public /* synthetic */ AnonymousClass0PY(long j, DeviceJid deviceJid, int i, long j2, long j3, long j4, long j5, int i2, long j6, long j7, int i3, long j8) {
        this.A06 = j;
        this.A0B = deviceJid;
        this.A02 = i;
        this.A04 = j2;
        this.A09 = j3;
        this.A0A = j4;
        this.A08 = j5;
        this.A00 = i2;
        this.A07 = j6;
        this.A03 = j7;
        this.A01 = i3;
        this.A05 = j8;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AnonymousClass0PY.class != obj.getClass()) {
            return false;
        }
        AnonymousClass0PY r7 = (AnonymousClass0PY) obj;
        if (this.A02 == r7.A02 && this.A04 == r7.A04 && this.A09 == r7.A09 && this.A0A == r7.A0A && this.A08 == r7.A08 && this.A00 == r7.A00 && this.A07 == r7.A07 && this.A03 == r7.A03 && this.A0B.equals(r7.A0B) && this.A01 == r7.A01 && this.A05 == r7.A05) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A0B, Integer.valueOf(this.A02), Long.valueOf(this.A04), Long.valueOf(this.A09), Long.valueOf(this.A0A), Long.valueOf(this.A08), Integer.valueOf(this.A00), Long.valueOf(this.A07), Long.valueOf(this.A03), Integer.valueOf(this.A01), Long.valueOf(this.A05)});
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("SyncDatum{deviceJid=");
        A0S.append(this.A0B);
        A0S.append(", syncType=");
        A0S.append(this.A02);
        A0S.append(", latestMsgId=");
        A0S.append(this.A04);
        A0S.append(", stageOldestMsgId=");
        A0S.append(this.A09);
        A0S.append(", syncOldestMsgId=");
        A0S.append(this.A0A);
        A0S.append(", sendMsgsCount=");
        A0S.append(this.A08);
        A0S.append(", chunkOrder=");
        A0S.append(this.A00);
        A0S.append(", sentBytes=");
        A0S.append(this.A07);
        A0S.append(", lastChunkTimestamp=");
        A0S.append(this.A03);
        A0S.append(", status=");
        A0S.append(this.A01);
        A0S.append(", peerMsgRowId=");
        A0S.append(this.A05);
        A0S.append('}');
        return A0S.toString();
    }
}
