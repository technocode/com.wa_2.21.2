package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.zip.Adler32;

/* renamed from: X.0Pi  reason: invalid class name and case insensitive filesystem */
public class C05600Pi {
    public int A00;
    public int A01;
    public AbstractC05680Pq A02;
    public boolean A03;
    public boolean A04 = true;
    public final C05660Po A05;
    public final C05630Pl A06;
    public final File A07;
    public final RandomAccessFile A08;

    public C05600Pi(File file, int i, int i2, boolean z, int i3, AnonymousClass03K r27) {
        RandomAccessFile randomAccessFile;
        AbstractC05680Pq r11;
        int i4;
        int i5;
        byte[][] bArr = C05620Pk.A00;
        int length = bArr.length;
        int i6 = length - 1;
        StringBuilder A0S = AnonymousClass008.A0S("wambuffer/wambuffer: ");
        A0S.append(file.getAbsolutePath());
        A0S.append(" ; fileHeaderVersion: ");
        A0S.append(i6);
        A0S.append(" ; eventBufferCount: ");
        A0S.append(i);
        A0S.append(" ; beaconChance: ");
        A0S.append(i2);
        Log.d(A0S.toString());
        boolean isFile = file.isFile();
        this.A00 = i2;
        try {
            randomAccessFile = new RandomAccessFile(file, "rwd");
            this.A04 = true;
        } catch (IOException e) {
            Boolean bool = Boolean.TRUE;
            r27.A0A = bool;
            if (!isFile) {
                r27.A08 = bool;
            }
            r27.A07();
            Log.e("wambuffer/newwamfile: cannot open or create persistent WAM file; running in volatile mode", e);
            Log.e("wambuffer: PERSISTENCE TURNED OFF");
            this.A04 = false;
            randomAccessFile = null;
        }
        this.A07 = file;
        this.A08 = randomAccessFile;
        this.A01 = i3;
        C05630Pl r0 = new C05630Pl(i, i3);
        this.A06 = r0;
        this.A05 = new C05660Po(randomAccessFile, r0, i6, i, i3, r27);
        if (randomAccessFile != null) {
            if (i3 == 1 || i3 == 2) {
                if (!z) {
                    throw new AssertionError("Only optimal buffer should be used for real time or private stats events");
                }
                r11 = new C05670Pp(randomAccessFile, this.A06, i, i3, r27);
                this.A02 = r11;
            } else {
                if (!z) {
                    r11 = new C53552dS(randomAccessFile, this.A06, i, i3, r27);
                    this.A02 = r11;
                }
                r11 = new C05670Pp(randomAccessFile, this.A06, i, i3, r27);
                this.A02 = r11;
            }
            if (isFile) {
                try {
                    A05(randomAccessFile, i);
                    try {
                        C05660Po r12 = this.A05;
                        int length2 = C05620Pk.A00(i6).length;
                        r12.A03 = new byte[length2];
                        try {
                            C05650Pn r1 = r12.A07;
                            r1.A02(length2 + 4);
                            ByteBuffer byteBuffer = r1.A05;
                            ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                            asReadOnlyBuffer.flip();
                            asReadOnlyBuffer.get(r12.A03);
                            try {
                                byte[] bArr2 = r12.A03;
                                for (int i7 = 0; i7 < length; i7++) {
                                    if (Arrays.equals(bArr2, bArr[i7])) {
                                        if (i7 == 0) {
                                            i4 = 2;
                                        } else {
                                            i4 = C05660Po.A00(asReadOnlyBuffer);
                                        }
                                        C05630Pl r9 = r12.A08;
                                        C05640Pm[] r6 = r9.A05;
                                        int length3 = r6.length;
                                        if (i4 <= length3) {
                                            r12.A02(i7, i4);
                                            int position = byteBuffer.position();
                                            try {
                                                r1.A02(position);
                                                ByteBuffer asReadOnlyBuffer2 = byteBuffer.asReadOnlyBuffer();
                                                asReadOnlyBuffer2.flip();
                                                byte[] bArr3 = new byte[C05620Pk.A00(i7).length];
                                                r12.A03 = bArr3;
                                                asReadOnlyBuffer2.get(bArr3);
                                                if (i7 == 0) {
                                                    i5 = 2;
                                                } else {
                                                    i5 = C05660Po.A00(asReadOnlyBuffer2);
                                                }
                                                r12.A01 = C05660Po.A00(asReadOnlyBuffer2);
                                                r12.A00 = C05660Po.A00(asReadOnlyBuffer2);
                                                int A002 = C05660Po.A00(asReadOnlyBuffer2);
                                                r9.A01 = A002;
                                                if (A002 >= i5) {
                                                    r9.A01 = 0;
                                                }
                                                if (i7 >= 2) {
                                                    r9.A00 = C05660Po.A00(asReadOnlyBuffer2);
                                                    r9.A04 = asReadOnlyBuffer2.get() != 1 ? false : true;
                                                    r9.A03 = C05660Po.A01(asReadOnlyBuffer2);
                                                    r9.A02 = C05660Po.A00(asReadOnlyBuffer2);
                                                }
                                                for (int i8 = 0; i8 < i5; i8++) {
                                                    if (i8 < length3) {
                                                        C05640Pm r02 = r6[i8];
                                                        r02.A01 = C05660Po.A00(asReadOnlyBuffer2);
                                                        r02.A04 = C05660Po.A01(asReadOnlyBuffer2);
                                                        if (i7 >= 2) {
                                                            r02.A02 = C05660Po.A00(asReadOnlyBuffer2);
                                                            r02.A00 = C05660Po.A00(asReadOnlyBuffer2);
                                                        }
                                                        r02.A03 = C05660Po.A01(asReadOnlyBuffer2);
                                                    } else {
                                                        C05660Po.A00(asReadOnlyBuffer2);
                                                        C05660Po.A01(asReadOnlyBuffer2);
                                                        if (i7 >= 2) {
                                                            C05660Po.A00(asReadOnlyBuffer2);
                                                            C05660Po.A00(asReadOnlyBuffer2);
                                                        }
                                                        C05660Po.A01(asReadOnlyBuffer2);
                                                    }
                                                }
                                                r12.A02 = C05660Po.A01(asReadOnlyBuffer2);
                                                int i9 = position - 4;
                                                if (0 + i9 <= byteBuffer.position()) {
                                                    Adler32 adler32 = new Adler32();
                                                    adler32.update(byteBuffer.array(), 0, i9);
                                                    if (r12.A02 == adler32.getValue()) {
                                                        try {
                                                            if (Arrays.equals(r12.A03, C05620Pk.A00(i7))) {
                                                                int i10 = r12.A01;
                                                                int i11 = 65536;
                                                                if (i10 == 65536) {
                                                                    int i12 = r12.A00;
                                                                    int i13 = r12.A04;
                                                                    if (i13 != 0) {
                                                                        i11 = 32768;
                                                                        if (i13 == 1) {
                                                                            i11 = 16384;
                                                                        }
                                                                    }
                                                                    if (i12 == i11) {
                                                                        int i14 = r9.A01;
                                                                        if (i14 < 0 || i14 >= r12.A05) {
                                                                            throw new AnonymousClass2OH("Invalid current event buffer");
                                                                        }
                                                                        for (C05640Pm r03 : r6) {
                                                                            if (r03.A01 > i12) {
                                                                                throw new AnonymousClass2OH("Invalid event buffer size");
                                                                            }
                                                                        }
                                                                        StringBuilder A0U = AnonymousClass008.A0U("wambuffer/header/init: header=", i7, " bufferCount=", i4, " maxMetadataSize=");
                                                                        A0U.append(i10);
                                                                        A0U.append(" maxEventBufferSize=");
                                                                        A0U.append(i12);
                                                                        A0U.append(" currentEventBufferIndex=");
                                                                        A0U.append(i14);
                                                                        A0U.append(" currentEventBufferIndex=");
                                                                        A0U.append(i14);
                                                                        A0U.append(" currentBufferSequenceNumber=");
                                                                        A0U.append(r9.A00);
                                                                        A0U.append(" isEventBeaconingEnabled=");
                                                                        A0U.append(r9.A04);
                                                                        A0U.append(" dayOfLastBeaconingDecision=");
                                                                        A0U.append(r9.A03);
                                                                        A0U.append(" currentEventSequenceNumber=");
                                                                        AnonymousClass008.A1L(A0U, r9.A02);
                                                                        for (int i15 = 0; i15 < length3; i15++) {
                                                                            C05640Pm r10 = r6[i15];
                                                                            StringBuilder A0T = AnonymousClass008.A0T("wambuffer/header/init/eventBufferMetadata/", i15, ": size=");
                                                                            A0T.append(r10.A01);
                                                                            A0T.append(" timestamp=");
                                                                            A0T.append(r10.A04);
                                                                            A0T.append(" streamId=");
                                                                            A0T.append(r10.A02);
                                                                            A0T.append(" bufferSequenceNumber=");
                                                                            A0T.append(r10.A00);
                                                                            A0T.append(" checksum=");
                                                                            A0T.append(r10.A03);
                                                                            Log.i(A0T.toString());
                                                                        }
                                                                        try {
                                                                            this.A02.AAf();
                                                                            return;
                                                                        } catch (AnonymousClass2OI e2) {
                                                                            this.A02.AAp();
                                                                            C05630Pl r62 = this.A06;
                                                                            r62.A01 = 0;
                                                                            r62.A00 = 0;
                                                                            r62.A04 = false;
                                                                            r62.A03 = 0;
                                                                            r62.A02 = 0;
                                                                            this.A02.A2g();
                                                                            C05660Po r92 = this.A05;
                                                                            r92.A03 = C05620Pk.A00(r92.A06);
                                                                            int i16 = 65536;
                                                                            r92.A01 = 65536;
                                                                            r92.A02 = 0;
                                                                            C05650Pn r5 = r92.A07;
                                                                            r5.A05.clear();
                                                                            r5.A01 = 0;
                                                                            r5.A06.reset();
                                                                            r5.A00 = 0;
                                                                            int i17 = r92.A04;
                                                                            if (i17 != 0) {
                                                                                i16 = 32768;
                                                                                if (i17 == 1) {
                                                                                    i16 = 16384;
                                                                                }
                                                                            }
                                                                            r92.A00 = i16;
                                                                            StringBuilder sb = new StringBuilder();
                                                                            sb.append("wambuffer/wambuffer: error while opening WAM file (");
                                                                            sb.append(e2);
                                                                            sb.append(")");
                                                                            Log.e(sb.toString());
                                                                            r27.A0B = Boolean.TRUE;
                                                                            r27.A07();
                                                                            A04(randomAccessFile, i);
                                                                            return;
                                                                        }
                                                                    } else {
                                                                        throw new AnonymousClass2OH("Invalid max event buffer size");
                                                                    }
                                                                } else {
                                                                    throw new AnonymousClass2OH("Invalid max metadata size");
                                                                }
                                                            } else {
                                                                throw new AnonymousClass2OH("Invalid WAM file magic or version");
                                                            }
                                                        } catch (AnonymousClass2OH e3) {
                                                            AnonymousClass03K r13 = r12.A09;
                                                            r13.A03 = Boolean.TRUE;
                                                            r13.A07();
                                                            throw e3;
                                                        }
                                                    } else {
                                                        AnonymousClass03K r14 = r12.A09;
                                                        r14.A05 = Boolean.TRUE;
                                                        r14.A07();
                                                        throw new AnonymousClass2OH("Invalid checksum");
                                                    }
                                                } else {
                                                    throw new IllegalArgumentException("Given range contains invalid bytes");
                                                }
                                            } catch (IOException e4) {
                                                throw new AnonymousClass2OH(e4.toString());
                                            }
                                        } else {
                                            throw new AnonymousClass2OH("Event buffer downgrade not allowed");
                                        }
                                    }
                                }
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("Invalid value: ");
                                sb2.append(bArr2);
                                throw new RuntimeException(sb2.toString());
                            } catch (Exception e5) {
                                throw new AnonymousClass2OH(e5.getMessage());
                            }
                        } catch (IOException e6) {
                            throw new AnonymousClass2OH(e6.toString());
                        }
                    } catch (AnonymousClass2OH e7) {
                        throw new AnonymousClass2OI(e7.toString());
                    }
                } catch (AnonymousClass2OI e8) {
                    Log.e("wambuffer/wambuffer: failed to initialize with new file", e8);
                    Log.e("wambuffer: PERSISTENCE TURNED OFF");
                    this.A04 = false;
                    r27.A08 = Boolean.TRUE;
                    r27.A07();
                    RandomAccessFile randomAccessFile2 = this.A08;
                    if (randomAccessFile2 != null) {
                        try {
                            randomAccessFile2.close();
                        } catch (IOException unused) {
                            throw null;
                        }
                    }
                    if (this.A07.delete()) {
                        Log.i("wambuffer/removefile: successfully removed WAM file");
                        return;
                    }
                    throw null;
                }
            } else {
                r11.AAp();
                Log.i("wambuffer/wambuffer: no WAM file found; creating a new one");
                A04(randomAccessFile, i);
            }
        }
    }

    public final int A00() {
        return this.A02.A3X().A04.A05.capacity() - C05750Px.A00(C05750Px.A00.length - 1).length;
    }

    public final void A01() {
        int i;
        if (this.A04) {
            if (!this.A02.A4I()) {
                Log.e("wambuffer: PERSISTENCE TURNED OFF");
                this.A04 = false;
                return;
            }
            try {
                C05660Po r2 = this.A05;
                int i2 = r2.A06;
                if (i2 == 0) {
                    i = 2;
                } else {
                    i = r2.A08.A05.length;
                }
                r2.A02(i2, i);
                r2.A07.A01();
                this.A03 = false;
            } catch (IOException unused) {
                throw null;
            }
        }
    }

    public final void A02() {
        if (this.A02.A3X().A04()) {
            throw new Error("Rotation failed since the current event buffer is empty");
        } else if (this.A02.A2U()) {
            Locale locale = Locale.US;
            Object[] objArr = new Object[4];
            C05630Pl r4 = this.A06;
            objArr[0] = Integer.valueOf(r4.A01);
            objArr[1] = Integer.valueOf(this.A02.A3X().A04.A05.position());
            C05740Pw A3X = this.A02.A3X();
            if (A3X.A03()) {
                objArr[2] = Integer.valueOf(A3X.A00);
                C05740Pw A3X2 = this.A02.A3X();
                objArr[3] = Long.valueOf(A3X2.A05.A05[A3X2.A01].A04);
                Log.i(String.format(locale, "wambuffer/rotate: rotated event buffer %d: size = %d, event count = %d, timestamp = %d", objArr));
                AbstractC05680Pq r1 = this.A02;
                r4.A01 = r1.A7d(r4.A01);
                r1.ABn();
                this.A03 = true;
                return;
            }
            throw new UnsupportedOperationException("No event count available for rotated buffers");
        } else {
            throw new Error("Rotation failed since there is no empty buffer");
        }
    }

    public final void A03(AnonymousClass0Q6 r10, AnonymousClass0Q4 r11) {
        C05740Pw A3X = this.A02.A3X();
        int length = C05750Px.A00.length - 1;
        if (A3X.A04()) {
            C05650Pn r1 = A3X.A04;
            byte[] A002 = C05750Px.A00(length);
            ByteBuffer byteBuffer = r1.A05;
            byteBuffer.put(A002);
            C05630Pl r5 = A3X.A05;
            C05640Pm[] r4 = r5.A05;
            C05640Pm r3 = r4[A3X.A01];
            int i = r5.A00 + 1;
            r5.A00 = i;
            if (i > 65535) {
                r5.A00 = 1;
                i = 1;
            }
            r3.A00 = i;
            byteBuffer.put(A3X.A05(length));
            r4[A3X.A01].A04 = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        }
        AnonymousClass0Q5 r52 = r10.A02;
        int size = r52.size();
        AnonymousClass0Q5 r42 = r11.A02;
        int size2 = r42.size() + size;
        ByteBuffer byteBuffer2 = A3X.A04.A05;
        if (size2 <= byteBuffer2.remaining()) {
            byteBuffer2.put(r52.A00());
            byteBuffer2.put(r42.A00());
            int i2 = A3X.A02 + r10.A01;
            A3X.A02 = i2;
            A3X.A02 = i2 + r11.A01;
            A3X.A00++;
            Map map = r10.A00;
            for (Number number : Collections.unmodifiableCollection(map.keySet())) {
                AnonymousClass03M r32 = A3X.A03;
                int intValue = number.intValue();
                Integer valueOf = Integer.valueOf(intValue);
                if (map.containsKey(valueOf)) {
                    r32.A01(intValue, ((AnonymousClass03N) map.get(valueOf)).A00);
                } else {
                    throw new Error("The buffer does not contain the given attribute");
                }
            }
            return;
        }
        throw new Error("Not enough space in the buffer");
    }

    public final void A04(RandomAccessFile randomAccessFile, int i) {
        int i2;
        A05(randomAccessFile, i);
        try {
            C05660Po r2 = this.A05;
            int i3 = r2.A06;
            if (i3 == 0) {
                i2 = 2;
            } else {
                i2 = r2.A08.A05.length;
            }
            r2.A02(i3, i2);
            r2.A07.A01();
            Log.i("wambuffer/initnewfile: successfully created new WAM file");
        } catch (IOException e) {
            throw new AnonymousClass2OI(e.toString());
        }
    }

    public final void A05(RandomAccessFile randomAccessFile, int i) {
        int i2;
        try {
            int i3 = this.A01;
            if (i3 == 0) {
                i2 = 65536;
            } else {
                i2 = 32768;
                if (i3 == 1) {
                    i2 = 16384;
                }
            }
            randomAccessFile.setLength((long) ((i2 * i) + 65536));
        } catch (IOException unused) {
            throw null;
        }
    }
}
