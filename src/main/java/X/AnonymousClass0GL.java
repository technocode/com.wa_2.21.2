package X;

import android.text.TextUtils;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.0GL  reason: invalid class name */
public class AnonymousClass0GL implements AnonymousClass0GM {
    public byte[] A00;
    public final AnonymousClass009 A01;
    public final AnonymousClass0GK A02;
    public final AnonymousClass3X2 A03;

    public AnonymousClass0GL(AnonymousClass009 r1, AnonymousClass3X2 r2, AnonymousClass0GK r3) {
        this.A01 = r1;
        this.A03 = r2;
        this.A02 = r3;
    }

    public AnonymousClass0GL(AnonymousClass0GK r2) {
        this.A01 = null;
        this.A03 = null;
        this.A02 = r2;
    }

    public static String A00(String str, String str2, int i, int i2) {
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        StringBuilder A0S = AnonymousClass008.A0S(str);
        String str3 = "";
        A0S.append(i == 0 ? str3 : AnonymousClass008.A0F(".", i));
        if (i2 != 0) {
            str3 = AnonymousClass008.A0F(":", i2);
        }
        A0S.append(str3);
        A0S.append('@');
        A0S.append(str2);
        return A0S.toString();
    }

    public static void A01(InputStream inputStream, byte[] bArr) {
        int length = bArr.length;
        int i = 0;
        while (i < length) {
            int read = inputStream.read(bArr, i, length - i);
            if (read != -1) {
                i += read;
            } else {
                throw new IOException("ran out of bytes while reading into buffer");
            }
        }
    }

    public static byte[] A02(InputStream inputStream, int i) {
        int i2;
        int read = inputStream.read();
        int i3 = 0;
        if ((read & 128) != 0) {
            i3 = 1;
        }
        int i4 = read & 127;
        byte[] bArr = new byte[i4];
        A01(inputStream, bArr);
        int i5 = (i4 << 1) - i3;
        byte[] bArr2 = new byte[i5];
        for (int i6 = 0; i6 < i5; i6++) {
            int i7 = (1 - (i6 % 2)) << 2;
            int i8 = (bArr[i6 >> 1] & (15 << i7)) >> i7;
            if (i == 251) {
                switch (i8) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        i2 = i8 + 48;
                        continue;
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        i2 = (i8 - 10) + 65;
                        continue;
                    default:
                        throw new AnonymousClass1XC(AnonymousClass008.A0F("bad hex ", i8));
                }
            } else if (i == 255) {
                switch (i8) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        i2 = i8 + 48;
                        continue;
                    case 10:
                    case 11:
                        i2 = (i8 - 10) + 45;
                        continue;
                    default:
                        throw new AnonymousClass1XC(AnonymousClass008.A0F("bad nibble ", i8));
                }
            } else {
                throw new AnonymousClass1XC(AnonymousClass008.A0F("bad packed type ", i));
            }
            bArr2[i6] = (byte) i2;
        }
        return bArr2;
    }

    public final int A03(InputStream inputStream, int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 248) {
            return inputStream.read();
        }
        if (i == 249) {
            return (inputStream.read() << 8) + inputStream.read();
        }
        throw new AnonymousClass1XC(AnonymousClass008.A0F("invalid list size in readListSize: token ", i), ABj());
    }

    public final AnonymousClass0M5 A04(InputStream inputStream) {
        AnonymousClass0OS[] r3;
        AnonymousClass0OS r2;
        int A032 = A03(inputStream, inputStream.read());
        int read = inputStream.read();
        if (read == 2) {
            return null;
        }
        String A05 = A05(inputStream, read);
        if (A032 == 0 || A05 == null) {
            throw new AnonymousClass1XC("nextTree sees 0 list or null tag", ABj());
        }
        int i = A032 - 2;
        int i2 = A032 % 2;
        int i3 = (i + i2) / 2;
        if (i3 == 0) {
            r3 = null;
        } else {
            r3 = new AnonymousClass0OS[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                String A052 = A05(inputStream, inputStream.read());
                int read2 = inputStream.read();
                if (read2 == 247) {
                    String A002 = A00(A05(inputStream, inputStream.read()), "s.whatsapp.net", inputStream.read() & 255, inputStream.read() & 255);
                    try {
                        r2 = new AnonymousClass0OS(A052, Jid.get(A002));
                    } catch (AnonymousClass02Y unused) {
                        r2 = new AnonymousClass0OS(A052, A002);
                    }
                } else if (read2 != 250) {
                    r2 = new AnonymousClass0OS(A052, A05(inputStream, read2));
                } else {
                    String A003 = A00(A05(inputStream, inputStream.read()), A05(inputStream, inputStream.read()), 0, 0);
                    try {
                        r2 = new AnonymousClass0OS(A052, Jid.get(A003));
                    } catch (AnonymousClass02Y unused2) {
                        r2 = new AnonymousClass0OS(A052, A003);
                    }
                }
                r3[i4] = r2;
            }
        }
        boolean z = true;
        if (i2 == 1) {
            return new AnonymousClass0M5(A05, r3);
        }
        int read3 = inputStream.read();
        if (!(read3 == 0 || read3 == 248 || read3 == 249)) {
            z = false;
        }
        if (z) {
            int A033 = A03(inputStream, read3);
            AnonymousClass0M5[] r22 = new AnonymousClass0M5[A033];
            for (int i5 = 0; i5 < A033; i5++) {
                r22[i5] = A04(inputStream);
            }
            return new AnonymousClass0M5(A05, r3, r22, null);
        } else if (read3 == 252) {
            byte[] bArr = new byte[inputStream.read()];
            A01(inputStream, bArr);
            return new AnonymousClass0M5(A05, r3, bArr);
        } else if (read3 == 253) {
            byte[] bArr2 = new byte[(((inputStream.read() & 15) << 16) + (inputStream.read() << 8) + inputStream.read())];
            A01(inputStream, bArr2);
            return new AnonymousClass0M5(A05, r3, bArr2);
        } else if (read3 == 254) {
            byte[] bArr3 = new byte[(inputStream.read() | ((inputStream.read() & 127) << 24) | (inputStream.read() << 16) | (inputStream.read() << 8))];
            A01(inputStream, bArr3);
            return new AnonymousClass0M5(A05, r3, bArr3);
        } else if (read3 == 255 || read3 == 251) {
            return new AnonymousClass0M5(A05, r3, A02(inputStream, read3));
        } else {
            return new AnonymousClass0M5(A05, r3, A05(inputStream, read3));
        }
    }

    public final String A05(InputStream inputStream, int i) {
        if (i == -1) {
            throw new AnonymousClass1XC("-1 token in readString", ABj());
        } else if (i <= 2 || i >= 236) {
            if (i == 0) {
                return null;
            }
            if (i != 247) {
                switch (i) {
                    case 236:
                    case 237:
                    case 238:
                    case 239:
                        int read = inputStream.read();
                        if (!(this instanceof AnonymousClass3Z6)) {
                            try {
                                String A012 = C12080hW.A01(true, i, read);
                                StringBuilder sb = new StringBuilder();
                                sb.append("Token was null for doublebyte dictNum=");
                                sb.append(i);
                                sb.append(", dictIdx=");
                                sb.append(read);
                                AnonymousClass00E.A04(A012, sb.toString());
                                return A012;
                            } catch (ArrayIndexOutOfBoundsException | NullPointerException unused) {
                                throw new AnonymousClass1XC("invalid token index in getToken()", ABj());
                            }
                        } else {
                            throw new AnonymousClass1XC("Unexpected doublebyte token during use of web dictionary", ABj());
                        }
                    default:
                        switch (i) {
                            case 250:
                                Log.w("Unexpected ReadString for token JID_PAIR");
                                return A00(A05(inputStream, inputStream.read()), A05(inputStream, inputStream.read()), 0, 0);
                            case 251:
                            case 255:
                                return AnonymousClass0M5.A00(A02(inputStream, i));
                            case 252:
                                byte[] bArr = new byte[inputStream.read()];
                                A01(inputStream, bArr);
                                return AnonymousClass0M5.A00(bArr);
                            case 253:
                                byte[] bArr2 = new byte[(((inputStream.read() & 15) << 16) + (inputStream.read() << 8) + inputStream.read())];
                                A01(inputStream, bArr2);
                                return AnonymousClass0M5.A00(bArr2);
                            case 254:
                                byte[] bArr3 = new byte[(inputStream.read() | ((inputStream.read() & 127) << 24) | (inputStream.read() << 16) | (inputStream.read() << 8))];
                                A01(inputStream, bArr3);
                                return AnonymousClass0M5.A00(bArr3);
                            default:
                                throw new AnonymousClass1XC("readString couldn't match token", ABj());
                        }
                }
            } else {
                Log.w("Unexpected ReadString for token JID_4");
                return A00(A05(inputStream, inputStream.read()), "s.whatsapp.net", inputStream.read() & 255, inputStream.read() & 255);
            }
        } else if (!(this instanceof AnonymousClass3Z6)) {
            try {
                String A013 = C12080hW.A01(false, 0, i);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Token was null for singlebyte idx: ");
                sb2.append(i);
                AnonymousClass00E.A04(A013, sb2.toString());
                return A013;
            } catch (ArrayIndexOutOfBoundsException | NullPointerException unused2) {
                throw new AnonymousClass1XC("invalid token index in getToken()", ABj());
            }
        } else {
            try {
                String str = C12080hW.A02[i];
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Token was null for web dictionary idx: ");
                sb3.append(i);
                AnonymousClass00E.A04(str, sb3.toString());
                return str;
            } catch (Exception e) {
                Log.e(e);
                throw new AnonymousClass1XC("invalid token/length in getToken", ABj());
            }
        }
    }

    @Override // X.AnonymousClass0GM
    public String ABj() {
        byte[] bArr = this.A00;
        if (bArr == null) {
            return "null";
        }
        StringBuilder A0S = AnonymousClass008.A0S("size = ");
        int length = bArr.length;
        A0S.append(Integer.toString(length));
        A0S.append('<');
        for (int i = 0; i < length; i++) {
            if (i > 0) {
                A0S.append(", ");
            }
            A0S.append(Integer.toString(bArr[i] & 255));
            if (((long) A0S.length()) >= 262144) {
                break;
            }
        }
        if (((long) A0S.length()) < 262144) {
            A0S.append('>');
        } else {
            A0S.append("...");
        }
        return A0S.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0071, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0075, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0078, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007c, code lost:
        throw r0;
     */
    @Override // X.AnonymousClass0GM
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass0M5 ACR() {
        /*
        // Method dump skipped, instructions count: 174
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0GL.ACR():X.0M5");
    }

    @Override // X.AnonymousClass0GM
    public AnonymousClass0M5 ACS(byte[] bArr) {
        return A04(new ByteArrayInputStream(bArr));
    }
}
