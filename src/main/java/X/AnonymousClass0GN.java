package X;

import android.text.TextUtils;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: X.0GN  reason: invalid class name */
public class AnonymousClass0GN implements AnonymousClass0GO {
    public final AnonymousClass0GK A00;
    public final AnonymousClass3X3 A01;

    public AnonymousClass0GN(AnonymousClass3X3 r1, AnonymousClass0GK r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public static void A00(OutputStream outputStream, int i) {
        if (i < 0 || i >= 256) {
            throw new IOException(AnonymousClass008.A0F("value out of range; value=", i));
        }
        outputStream.write(i & 255);
    }

    public static void A01(OutputStream outputStream, int i) {
        if (i == 0) {
            outputStream.write(0);
        } else if (i < 256) {
            outputStream.write(248);
            A00(outputStream, i);
        } else if (i < 65536) {
            outputStream.write(249);
            if (i < 0 || i >= 65536) {
                throw new IOException(AnonymousClass008.A0F("value out of range; value=", i));
            }
            outputStream.write((65280 & i) >> 8);
            outputStream.write(i & 255);
        } else {
            throw new IOException(AnonymousClass008.A0F("list too long; count=", i));
        }
    }

    public static void A02(OutputStream outputStream, int i) {
        if (i < 0 || i > 255) {
            throw new IOException("invalid token");
        }
        outputStream.write((byte) i);
    }

    public static void A03(OutputStream outputStream, byte[] bArr, boolean z) {
        int length = bArr.length;
        if (length >= 1048576) {
            outputStream.write(254);
            outputStream.write((2130706432 & length) >> 24);
            outputStream.write((16711680 & length) >> 16);
            outputStream.write((length & 65280) >> 8);
            outputStream.write(length & 255);
        } else if (length >= 256) {
            outputStream.write(253);
            if (length < 1048576) {
                outputStream.write((983040 & length) >> 16);
                outputStream.write((length & 65280) >> 8);
                outputStream.write(length & 255);
            } else {
                throw new IOException(AnonymousClass008.A0F("value out of range; value=", length));
            }
        } else {
            if (z) {
                byte[] A04 = A04(255, bArr);
                if (A04 != null) {
                    outputStream.write(255);
                } else {
                    A04 = A04(251, bArr);
                    if (A04 != null) {
                        outputStream.write(251);
                    }
                }
                outputStream.write(((length & 1) << 7) | A04.length);
                bArr = A04;
            }
            outputStream.write(252);
            A00(outputStream, length);
        }
        outputStream.write(bArr);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0033 A[LOOP:0: B:4:0x000e->B:20:0x0033, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x001f A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] A04(int r10, byte[] r11) {
        /*
        // Method dump skipped, instructions count: 152
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0GN.A04(int, byte[]):byte[]");
    }

    public final void A05(OutputStream outputStream, Jid jid) {
        int agent = jid.getAgent();
        if (agent > 0 || jid.getDevice() > 0) {
            outputStream.write(247);
            A00(outputStream, jid.getAgent());
            A00(outputStream, jid.getDevice());
            A07(outputStream, jid.user, true, false);
        } else if (!jid.isProtocolCompliant() || agent != 0) {
            StringBuilder sb = new StringBuilder("frame-tree-node-writer/writeJid/failed to write jid: ");
            sb.append(jid);
            Log.e(sb.toString());
            throw new IOException("failed to write jid");
        } else {
            outputStream.write(250);
            if (TextUtils.isEmpty(jid.user)) {
                A02(outputStream, 0);
            } else {
                A07(outputStream, jid.user, true, false);
            }
            A07(outputStream, jid.getServer(), false, false);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        if (r6.length <= 0) goto L_0x000a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06(java.io.OutputStream r11, X.AnonymousClass0M5 r12) {
        /*
        // Method dump skipped, instructions count: 113
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0GN.A06(java.io.OutputStream, X.0M5):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0059, code lost:
        if (r4 != null) goto L_0x005b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A07(java.io.OutputStream r3, java.lang.String r4, boolean r5, boolean r6) {
        /*
        // Method dump skipped, instructions count: 124
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0GN.A07(java.io.OutputStream, java.lang.String, boolean, boolean):void");
    }

    @Override // X.AnonymousClass0GO
    public void AQK() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(0);
        A01(byteArrayOutputStream, 1);
        byteArrayOutputStream.write(2);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        AnonymousClass3X3 r2 = this.A01;
        int length = byteArray.length;
        C68103Bs r0 = r2.A01;
        byte[] A02 = r0.A04.A02(r0.A01.getAndIncrement(), new byte[0], byteArray, length);
        OutputStream outputStream = r2.A00;
        outputStream.write(A02);
        outputStream.flush();
    }

    @Override // X.AnonymousClass0GO
    public void ARM(AnonymousClass0M5 r2) {
        ARN(r2, 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0050, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0053, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0057, code lost:
        throw r0;
     */
    @Override // X.AnonymousClass0GO
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void ARN(X.AnonymousClass0M5 r14, int r15) {
        /*
        // Method dump skipped, instructions count: 127
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0GN.ARN(X.0M5, int):void");
    }

    @Override // X.AnonymousClass0GO
    public byte[] ARO(AnonymousClass0M5 r3) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8192);
        A06(byteArrayOutputStream, r3);
        return byteArrayOutputStream.toByteArray();
    }
}
