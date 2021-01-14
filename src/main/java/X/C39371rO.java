package X;

import android.media.MediaCodec;
import android.media.MediaFormat;
import com.whatsapp.util.Log;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* renamed from: X.1rO  reason: invalid class name and case insensitive filesystem */
public class C39371rO implements AnonymousClass0JH {
    public static final int[] A09 = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000};
    public int A00;
    public AnonymousClass2TO A01;
    public ByteBuffer[] A02;
    public final int A03;
    public final long A04;
    public final long A05;
    public final File A06;
    public final File A07;
    public volatile boolean A08;

    @Override // X.AnonymousClass0JH
    public boolean AAL() {
        return true;
    }

    public C39371rO(AnonymousClass1KU r3) {
        this.A06 = r3.A03;
        this.A04 = r3.A01;
        this.A05 = r3.A02;
        this.A07 = r3.A04;
        this.A03 = r3.A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0025, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0029, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A00(java.io.File r4) {
        /*
            r3 = 0
            if (r4 == 0) goto L_0x0030
            boolean r0 = r4.exists()
            if (r0 == 0) goto L_0x0030
            X.0Md r2 = new X.0Md     // Catch:{ Exception -> 0x002a }
            r2.<init>()     // Catch:{ Exception -> 0x002a }
            java.lang.String r0 = r4.getAbsolutePath()     // Catch:{ all -> 0x0023 }
            r2.setDataSource(r0)     // Catch:{ all -> 0x0023 }
            r0 = 16
            java.lang.String r1 = r2.extractMetadata(r0)     // Catch:{ all -> 0x0023 }
            r0 = 0
            if (r1 == 0) goto L_0x001f
            r0 = 1
        L_0x001f:
            r2.close()
            return r0
        L_0x0023:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0025 }
        L_0x0025:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0029 }
        L_0x0029:
            throw r0
        L_0x002a:
            r1 = move-exception
            java.lang.String r0 = "audiotranscoder/cantranscode"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0030:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39371rO.A00(java.io.File):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:131:0x03d4, code lost:
        if (r52.A01.AIt(r7) != false) goto L_0x03d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0242, code lost:
        if (r5.getInteger("bit-width") != 24) goto L_0x0244;
     */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0491  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01() {
        /*
        // Method dump skipped, instructions count: 1281
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39371rO.A01():void");
    }

    public final void A02(MediaCodec mediaCodec, MediaCodec.BufferInfo bufferInfo, byte[] bArr, WritableByteChannel writableByteChannel) {
        int dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 0);
        while (dequeueOutputBuffer != -1) {
            if (dequeueOutputBuffer >= 0) {
                ByteBuffer byteBuffer = this.A02[dequeueOutputBuffer];
                byteBuffer.position(bufferInfo.offset);
                byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
                if ((bufferInfo.flags & 2) == 0) {
                    this.A00++;
                    int i = (bufferInfo.size - bufferInfo.offset) + 7;
                    bArr[3] = (byte) (((i >> 11) & 3) | (bArr[3] & 252));
                    bArr[4] = (byte) ((i >> 3) & 255);
                    bArr[5] = (byte) (((i & 7) << 5) | 31);
                    writableByteChannel.write(ByteBuffer.wrap(bArr));
                    writableByteChannel.write(byteBuffer);
                }
                byteBuffer.clear();
                mediaCodec.releaseOutputBuffer(dequeueOutputBuffer, false);
            } else if (dequeueOutputBuffer == -3) {
                this.A02 = mediaCodec.getOutputBuffers();
                Log.i("audiotranscoder/encoder output buffers have changed");
            } else if (dequeueOutputBuffer == -2) {
                MediaFormat outputFormat = mediaCodec.getOutputFormat();
                StringBuilder sb = new StringBuilder("audiotranscoder/encoder output format has changed to ");
                sb.append(outputFormat);
                Log.i(sb.toString());
            }
            dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 0);
        }
    }

    @Override // X.AnonymousClass0JH
    public void cancel() {
        this.A08 = true;
    }
}
